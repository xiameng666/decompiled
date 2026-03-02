import android.location.GnssClock;

public final class fvig {
    public static fvgh a(GnssClock gnssClock0) {
        fvgg fvgg0 = new fvgg();
        fvgg0.e = gnssClock0.getBiasNanos();
        fvgg0.f = gnssClock0.getBiasUncertaintyNanos();
        fvgg0.g = gnssClock0.getDriftNanosPerSecond();
        fvgg0.h = gnssClock0.getDriftUncertaintyNanosPerSecond();
        fvgg0.d = gnssClock0.getFullBiasNanos();
        fvgg0.a = gnssClock0.getLeapSecond();
        fvgg0.i = gnssClock0.getHardwareClockDiscontinuityCount();
        fvgg0.b = gnssClock0.getTimeNanos();
        fvgg0.c = gnssClock0.getTimeUncertaintyNanos();
        return new fvgh(fvgg0);
    }
}

