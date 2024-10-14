// Unmodified program outputs:"The object's position after 10.0 seconds is 0.0 m."
class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        finalPosition = gravity(gravity, fallingTime, initialVelocity, initialPosition);
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + String.format("%.1f", finalPosition) + " m.");
    }
    static double gravity( double a, double t, double vi, double xi){
        double res;
        res = 0.5 * a * t*t +vi*t+xi;
        return res;
    }
    
}