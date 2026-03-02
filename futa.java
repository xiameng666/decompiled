import java.util.Map;
import java.util.Set;

public final class futa extends fusy {
    public final fuuz q;

    public futa(fwxt fwxt0, fyar fyar0, fwyd fwyd0, fvwz fvwz0, fuvf fuvf0, fuuz fuuz0) {
        super(fwxt0, fyar0, fwyd0, fvwz0, fuvf0);
        this.q = fuuz0;
    }

    @Override  // fusy
    protected final fvnb e(Map map0, int v, long v1, fwyc fwyc0, boolean z) {
        fvnx fvnx0 = new fvnx(v, v1 / 1000000L);
        Set set0 = fvns.a(new fvns[]{fvns.d});
        if(z) {
            set0.add(fvns.k);
        }
        return this.m.c(true, set0, map0, 0L, fvnx0, new fusz(this), "SignalCollector", fwyc0, "activity_recognition_provider", "ActivityDetectionRunnerInFuture");
    }
}

