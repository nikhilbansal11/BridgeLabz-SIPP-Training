public class VolumeEarth {
    public static void main(String[] args) {
        int radiusInKM = 6378;

        double volInKM3 = (4.0 / 3) * Math.PI * Math.pow(radiusInKM, 3);
        double volInMiles3 = volInKM3 * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volInKM3 + " and cubic miles is " + volInMiles3);
    }
}
