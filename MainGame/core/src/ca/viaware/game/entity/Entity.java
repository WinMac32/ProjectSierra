package ca.viaware.game.entity;

import ca.viaware.game.rendering.Renderable;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Entity implements Renderable {
	private float x;
	private float y;
	private float width;
	private float height;
	
	private TextureRegion texture;
	
	private float originX;
	private float originY;
	
	private float scaleX;
	private float scaleY;
	
	private float rotation;
	
	private boolean removeFlag;
	
	public Entity(float x, float y, float width, float height, TextureRegion texture) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setTexture(texture);
		
		setScaleX(1);
		setScaleY(1);
	}

	public void update(float delta) {}
	
	@Override
	public void render(SpriteBatch batch) {
		batch.draw(getTexture(),getX(),getY(),getOriginX(),getOriginY(),getWidth(),getHeight(),getScaleX(),getScaleY(),getRotation());
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getOriginX() {
		return originX;
	}

	public void setOriginX(float originX) {
		this.originX = originX;
	}

	public float getOriginY() {
		return originY;
	}

	public void setOriginY(float originY) {
		this.originY = originY;
	}

	public float getScaleX() {
		return scaleX;
	}

	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
	}

	public float getScaleY() {
		return scaleY;
	}

	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public TextureRegion getTexture() {
		return texture;
	}

	public void setTexture(TextureRegion texture) {
		this.texture = texture;
	}

	public float getCenteredX() {
		return (getX() + (getWidth() / 2)) * getScaleX();
	}
	
	public float getCenteredY() {
		return (getY() + (getHeight() / 2)) * getScaleY();
	}
	
	public Vector2 getLocationVector() {
		return new Vector2(getX(), getY());
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(getX(), getY(), getWidth(), getHeight());
	}
	
	public boolean collides(Entity other) {
		return other.getRectangle().overlaps(getRectangle());
	}
	
	public float calcDirection(Entity other) {
		float horz = other.getX() - getX();
		float vert = other.getY() - getY();
		
		return (float) Math.atan(horz / vert);
	}
	
	public void setRemoveFlag(boolean remove) {
		this.removeFlag = remove;
	}
	
	public boolean getRemoveFlag() {
		return removeFlag;
	}
}
