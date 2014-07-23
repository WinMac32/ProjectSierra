package ca.viaware.game.entity;

import ca.viaware.game.entity.events.MoveEvent;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class MovingEntity extends Entity {

	private float dx;
	private float dy;

    private float moveTime;
    private Entity target;
    private boolean moving;

    private ArrayList<MoveEvent> moveEventHandlers;
	
	public MovingEntity(float x, float y, float width, float height, TextureRegion texture) {
		super(x, y, width, height, texture);
        moveEventHandlers = new ArrayList<MoveEvent>();
	}

	@Override
	public void update(float delta) {
		if (moving) {
            moveTime -= delta;
            if (moveTime <= 0) {
                moving = false;
                setDX(0);
                setDY(0);
                setX(target.getX());
                setY(target.getY());
                sendMoveEvent(MoveEvent.ON_COMPLETED);
            } else {
                startMovingTo(target, moveTime / delta);
            }
        }
        float moveX = dx * Gdx.graphics.getDeltaTime();
		float moveY = dy * Gdx.graphics.getDeltaTime();

        if (moveX != 0 || moveY != 0) {
            sendMoveEvent(MoveEvent.ON_MOVE);
        }

		setX(getX() + moveX);
		setY(getY() + moveY);
	}
	
	@Override
	public void render(SpriteBatch batch) {
		super.render(batch);
	}

	public float getDX() {
		return dx;
	}

	public void setDX(float dx) {
		this.dx = dx;
	}

	public float getDY() {
		return dy;
	}

	public void setDY(float dy) {
		this.dy = dy;
	}

    public void addMoveEventHandler(MoveEvent e) {
        moveEventHandlers.add(e);
    }

    private void sendMoveEvent(int type) {
        for (MoveEvent e : moveEventHandlers) {
            switch (type) {
                case MoveEvent.ON_START:
                    e.onStart();
                    break;
                case MoveEvent.ON_MOVE:
                    e.onMove();
                    break;
                case MoveEvent.ON_COMPLETED:
                    e.onCompleted();
                    break;
            }
        }
    }

    public void stopAllMovement() {
        setDX(0);
        setDY(0);
        sendMoveEvent(MoveEvent.ON_COMPLETED);
    }

	public void startMovingTo(Entity other, float speed) {
		if (!moving) sendMoveEvent(MoveEvent.ON_START);
        float xSpeed = (float) (other.getCenteredX() - getCenteredX());
		float ySpeed = (float) (other.getCenteredY() - getCenteredY());

		float factor = (xSpeed * xSpeed) + (ySpeed * ySpeed);

		factor = (float) Math.sqrt(factor);
		factor = speed / factor;

		xSpeed = xSpeed * factor;
		ySpeed = ySpeed * factor;

		setDX(xSpeed);
		setDY(ySpeed);
	}

    public void moveTo(Entity other, float time) {
        sendMoveEvent(MoveEvent.ON_START);
        this.moveTime = time;
        this.target = other;
        moving = true;
    }

}
