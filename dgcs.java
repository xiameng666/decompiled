import android.net.Uri;
import java.util.List;

public final class dgcs implements ibts {
    public final dgjp a;
    public final dgdt b;

    public dgcs(dgjp dgjp0, dgdt dgdt0) {
        this.a = dgjp0;
        this.b = dgdt0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "builder");
        dgjl dgjl0 = (dgjl)this.a;
        ((dcnn)object0).e(dgjl0.b);
        ((dcnn)object0).s = dgjl0.d;
        ((dcnn)object0).c(dgjl0.c);
        ((dcnn)object0).q = dgjl0.e;
        dgdt dgdt0 = this.b;
        if(hvqz.o()) {
            List list0 = (List)dgdt0.c.get(Long.valueOf(dgjl0.a));
            if(list0 != null) {
                for(Object object1: list0) {
                    ((dcnn)object0).b(((Uri)object1));
                }
            }
        }
        if(hvqz.ag()) {
            dgdi dgdi0 = (dgdi)dgdt0.a.get(Long.valueOf(dgjl0.a));
            ((dcnn)object0).m = dgdi0 == null ? 0 : dgdi0.e;
        }
        return ibom.a;
    }
}

