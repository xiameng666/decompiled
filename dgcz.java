import android.net.Uri;
import java.util.List;

public final class dgcz implements ibts {
    public final dgjp a;
    public final dgdt b;

    public dgcz(dgjp dgjp0, dgdt dgdt0) {
        this.a = dgjp0;
        this.b = dgdt0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "builder");
        dgjj dgjj0 = (dgjj)this.a;
        ((dcnn)object0).c = dgjj0.d;
        if(hvqz.o()) {
            List list0 = (List)this.b.c.get(Long.valueOf(dgjj0.a));
            if(list0 != null) {
                for(Object object1: list0) {
                    ((dcnn)object0).b(((Uri)object1));
                }
            }
        }
        return ibom.a;
    }
}

