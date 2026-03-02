import com.google.android.gms.westworld.perfetto.PerfettoScheduledCleanupService;
import java.util.concurrent.Callable;

public final class ffqg implements Callable {
    public final PerfettoScheduledCleanupService a;

    public ffqg(PerfettoScheduledCleanupService perfettoScheduledCleanupService0) {
        this.a = perfettoScheduledCleanupService0;
    }

    @Override
    public final Object call() {
        PerfettoScheduledCleanupService perfettoScheduledCleanupService0 = this.a;
        ehkj ehkj0 = new ehkj(ehkt.c(perfettoScheduledCleanupService0));
        bboh.b("PerfettoScheduledCleanupService", bbcu.ea);
        ehks.b(30);
        Object object0 = (int)2;
        if(!ehkj0.e()) {
            ehkj0.c(24);
            return object0;
        }
        ehks.b(0x1F);
        if(hxha.c()) {
            ehkj ehkj1 = new ehkj(ehkt.b(perfettoScheduledCleanupService0));
            ehks.b(45);
            hxha hxha0 = hxha.a;
            if(!ehkj1.g(((int)hxha0.b().b()), ((int)iaby.f()), ((int)hxha0.b().d()))) {
                ehkj1.c(0x2F);
                return object0;
            }
            ehks.b(46);
            ehkj ehkj2 = new ehkj(ehkt.d(perfettoScheduledCleanupService0, "post_processing_metrics"));
            ehks.b(83);
            if(!ehkj2.g(((int)hxha0.b().a()), ((int)iaby.f()), ((int)hxha0.b().c()))) {
                ehkj2.c(85);
                return object0;
            }
            ehks.b(84);
        }
        return (int)0;
    }
}

