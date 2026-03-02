import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class futc extends fusy {
    public long q;
    public long r;
    public fvsg s;
    public double t;
    public final double u;
    public final Random v;
    public final fuuz w;
    private final double x;

    public futc(fwxt fwxt0, fyar fyar0, fwyd fwyd0, fvwz fvwz0, fuvf fuvf0, fuuz fuuz0) {
        super(fwxt0, fyar0, fwyd0, fvwz0, fuvf0);
        this.q = -1L;
        this.r = -1L;
        this.t = 1.0;
        this.v = new Random();
        this.x = humr.a.f().a();
        this.u = humr.a.f().b();
        this.w = fuuz0;
    }

    @Override  // fusy
    protected final fvnb e(Map map0, int v, long v1, fwyc fwyc0, boolean z) {
        int v2 = Long.compare(v1, 0x7FFFFFFFFFFFFFFFL);
        Set set0 = fvns.a(new fvns[]{fvns.d});
        if(z) {
            set0.add(fvns.k);
        }
        fwxt fwxt0 = this.m;
        return v2 == 0 ? fwxt0.c(true, set0, map0, 0x8000000000000001L, null, new futb(this), "BatchingSignalCollector", fwyc0, "activity_recognition_provider", "ActivityDetectionRunnerInPast") : fwxt0.c(true, set0, map0, -v1 / 1000000L, null, new futb(this), "BatchingSignalCollector", fwyc0, "activity_recognition_provider", "ActivityDetectionRunnerInPast");
    }

    public final void h(boolean z) {
        double f = this.x;
        double f1 = this.t * f;
        this.t = f1;
        if(z) {
            this.t = f1 + (1.0 - f);
        }
    }
}

