import java.io.File;
import java.util.concurrent.TimeUnit;

public final class ccur implements Runnable {
    @Override
    public final void run() {
        File file0 = ciyz.b();
        cdew cdew0 = cdew.a();
        cded cded0 = cded.b();
        long v = TimeUnit.HOURS.toMillis(hros.a.aa().j());
        long v1 = System.currentTimeMillis();
        for(Object object0: ciyz.d(file0)) {
            ciyy ciyy0 = (ciyy)object0;
            cdef cdef0 = ciyy0.b;
            cdkf cdkf0 = cded0.c(cdef0);
            long v2 = ciyy0.d;
            if(Math.abs(v1 - v2) <= v && cdkf0 != null && cdkf0.c.a == ciyy0.c) {
                if(!"1".equals(ciyy0.e)) {
                    continue;
                }
                cdew0.c(cdef0, v2);
            }
            else if(cdkf0 == null) {
                ciyy0.a.delete();
            }
            else {
                cdkf0.e(ciyy0.a);
            }
        }
    }
}

