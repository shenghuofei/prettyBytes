public class PrettyBytes {

    public static String prettyBytes(long size) {
        if (size == 0) {
            return "0 B";
        }
        String[] UNITS = {"B","KB","MB","GB","TB","PB","EB","ZB","YB"};
        Integer exponent = (int)(Math.min(Math.floor(Math.log10(size) / 3), UNITS.length - 1));
        double number = (size / Math.pow(1000, exponent));
        return String.format("%.3f %s", number, UNITS[exponent]);
    }

    public static void main(String []args) {
        long size = 1234560000;
        System.out.print(prettyBytes(size));
    }
}
