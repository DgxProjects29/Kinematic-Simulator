package extras;

public class Utils {

    /*
     * 
     * Relationship between real units and computer graphics units, Based on FPS
     * 
     * mps = meters per second ppt = pixels per tick
     * 
     */

    public static int FPS = 45;
    
    public static float fromPixelsToMeters(float pixels) {
        return pixels / 100;
    }

    public static float fromMetersToPixel(float meters) {
        return meters * 100;
    }

    public static float fromTicksToSeconds(float ticks) {
        return ticks / FPS;
    }

    public static float fromSecondsToTicks(float ticks) {
        return ticks * FPS;
    }

    public static float fromMpsToPpt(float mps) {
        return mps * 100 / FPS;
    }

    public static float fromPptToMps(float ppt) {
        return ppt * FPS / 100;
    }
}