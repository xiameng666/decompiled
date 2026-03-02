import android.util.Range;

public interface bnc extends bkm, bqt {
    public static final bjr A;
    public static final bjr B;
    public static final bjr C;
    public static final bjr o;
    public static final bjr p;
    public static final bjr q;
    public static final bjr r;
    public static final bjr s;
    public static final bjr t;
    public static final bjr u;
    public static final bjr v;
    public static final bjr w;
    public static final bjr x;
    public static final bjr y;
    public static final bjr z;

    static {
        bnc.o = new bjr("camerax.core.useCase.defaultSessionConfig", bmb.class, null);
        bnc.p = new bjr("camerax.core.useCase.defaultCaptureConfig", bjo.class, null);
        bnc.q = new bjr("camerax.core.useCase.sessionConfigUnpacker", blw.class, null);
        bnc.r = new bjr("camerax.core.useCase.captureConfigUnpacker", bjn.class, null);
        bnc.s = new bjr("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE, null);
        bnc.t = new bjr("camerax.core.useCase.sessionType", Integer.TYPE, null);
        bnc.u = new bjr("camerax.core.useCase.targetFrameRate", Range.class, null);
        bnc.v = new bjr("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        bnc.w = new bjr("camerax.core.useCase.zslDisabled", Boolean.TYPE, null);
        bnc.x = new bjr("camerax.core.useCase.highResolutionDisabled", Boolean.TYPE, null);
        bnc.y = new bjr("camerax.core.useCase.captureType", bne.class, null);
        bnc.z = new bjr("camerax.core.useCase.previewStabilizationMode", Integer.TYPE, null);
        bnc.A = new bjr("camerax.core.useCase.videoStabilizationMode", Integer.TYPE, null);
        bnc.B = new bjr("camerax.core.useCase.takePictureManagerProvider", bgy.class, null);
        bnc.C = new bjr("camerax.core.useCase.streamUseCase", bmj.class, null);
    }

    boolean A();

    boolean B();

    int b();

    int c();

    Range d(Range arg1);

    bgy f();

    bmb i();

    bmj j();

    bne k();

    boolean t();

    boolean u();

    bmb w();

    blw x();

    int y();

    int z();
}

