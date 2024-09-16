public class Robot {
    private int X;
    private int Y;
    private Direction direction;

    public Robot(int x, int y, Direction dir) {
        this.Y = y;
        this.X = x;
        this.direction = dir;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP:
                this.Y++;
                break;
            case LEFT:
                this.X--;
                break;
            case DOWN:
                this.Y--;
                break;
            case RIGHT:
                this.X++;
                break;
        }
    }

}
