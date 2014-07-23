package ca.viaware.game.entity.events;

public interface MoveEvent {

    public static final int ON_START = 1;
    public static final int ON_MOVE = 2;
    public static final int ON_COMPLETED = 3;

    public void onStart();
    public void onMove();
    public void onCompleted();

}
