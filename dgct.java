import android.net.Uri;
import java.util.List;

public final class dgct implements ibts {
    public final dgdt a;
    public final dgjp b;

    public dgct(dgdt dgdt0, dgjp dgjp0) {
        this.a = dgdt0;
        this.b = dgjp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "builder");
        if(hvqz.o()) {
            List list0 = (List)this.a.c.get(Long.valueOf(((dgjn)this.b).a));
            if(list0 != null) {
                for(Object object1: list0) {
                    ((dcnn)object0).b(((Uri)object1));
                }
            }
        }
        return ibom.a;
    }
}

