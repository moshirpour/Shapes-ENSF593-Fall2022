public class Ball {

    private Point center;
    private char ballColor;

    public Ball (int x, int y, char ballColor){
        center = new Point(x, y);
        this.ballColor = ballColor;
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public char getBallColor() {
        return ballColor;
    }

    public void setBallColor(char ballColor) {
        this.ballColor = ballColor;
    }
}
