import android.util.Size;
import java.util.ArrayList;
import java.util.List;

public final class bkn {
    static {
    }

    public static int a(bko bko0) {
        return (int)(((Integer)bko0.l(bko.G)));
    }

    public static btu b(bko bko0) {
        return (btu)bko0.l(bko.O);
    }

    public static void c(bko bko0) {
        boolean z = bko0.F();
        boolean z1 = bko0.O() != null;
        if(z && z1) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if(bko0.M() != null && (z || z1)) {
            throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
        }
    }

    public static boolean d(bko bko0) {
        return bko0.s(bko.G);
    }

    public static int e(bko bko0) {
        return (int)(((Integer)bko0.m(bko.I, Integer.valueOf(-1))));
    }

    public static List f(bko bko0) {
        List list0 = (List)bko0.m(bko.P, null);
        return list0 != null ? new ArrayList(list0) : null;
    }

    public static Size g(bko bko0) {
        return (Size)bko0.m(bko.L, null);
    }

    public static Size h(bko bko0) {
        return (Size)bko0.m(bko.M, null);
    }

    public static int i(bko bko0) {
        return (int)(((Integer)bko0.m(bko.J, Integer.valueOf(-1))));
    }

    public static btu j(bko bko0) {
        return (btu)bko0.m(bko.O, null);
    }

    public static List k(bko bko0) {
        return (List)bko0.m(bko.N, null);
    }

    public static Size l(bko bko0) {
        return (Size)bko0.m(bko.K, null);
    }

    public static int m(bko bko0) {
        return (int)(((Integer)bko0.m(bko.H, Integer.valueOf(0))));
    }
}

