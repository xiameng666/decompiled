import android.util.Size;
import java.util.List;

public interface bko extends blr {
    public static final bjr G;
    public static final bjr H;
    public static final bjr I;
    public static final bjr J;
    public static final bjr K;
    public static final bjr L;
    public static final bjr M;
    public static final bjr N;
    public static final bjr O;
    public static final bjr P;

    static {
        bko.G = new bjr("camerax.core.imageOutput.targetAspectRatio", azo.class, null);
        bko.H = new bjr("camerax.core.imageOutput.targetRotation", Integer.TYPE, null);
        bko.I = new bjr("camerax.core.imageOutput.appTargetRotation", Integer.TYPE, null);
        bko.J = new bjr("camerax.core.imageOutput.mirrorMode", Integer.TYPE, null);
        bko.K = new bjr("camerax.core.imageOutput.targetResolution", Size.class, null);
        bko.L = new bjr("camerax.core.imageOutput.defaultResolution", Size.class, null);
        bko.M = new bjr("camerax.core.imageOutput.maxResolution", Size.class, null);
        bko.N = new bjr("camerax.core.imageOutput.supportedResolutions", List.class, null);
        bko.O = new bjr("camerax.core.imageOutput.resolutionSelector", btu.class, null);
        bko.P = new bjr("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    int C();

    btu E();

    boolean F();

    int G();

    List I();

    Size J();

    Size K();

    int L();

    btu M();

    List N();

    Size O();

    int P();
}

