package introduction;

public class Boat {

    private String hull;
    private double motorSize = 4.0;
    private String color = "gray";
    private boolean isAnchorDropped;

    public Boat(String hull, double motorSize, String color) {
        this.hull = hull;
        this.motorSize = motorSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "hull='" + hull + '\'' +
                ", motorSize=" + motorSize +
                ", color='" + color + '\'' +
                '}';
    }

    // Write a method that honks the horn
    public String honkHorn() {
        return "BROOOOOOONG!!!";
    }

    public String honkHorn(String message) {
        return "BROOOOOOONG!!!" + message;
    }

    // Write a method called isSeaWorthy that returns a boolean
    // If the hull size is large and the motor size is
    // greater than 50, return true, otherwise return false;
    public boolean isSeaWorthy() {
        if (this.hull.equals("large") && this.motorSize > 50) {
            return true;
        }

        return false;
    }

    public boolean isAnchorDropped() {
        return isAnchorDropped;
    }

    public void setAnchorDropped(boolean anchorDropped) {
        isAnchorDropped = anchorDropped;
    }

    public String getHull() {
        return hull;
    }

    public void setHull(String hull) {
        this.hull = hull;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(double motorSize) {
        this.motorSize = motorSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
