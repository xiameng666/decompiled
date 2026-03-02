import android.net.Uri;
import java.util.List;

public final class dgcv implements ibts {
    public final dgjp a;
    public final dgdt b;

    public dgcv(dgjp dgjp0, dgdt dgdt0) {
        this.a = dgjp0;
        this.b = dgdt0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dcnn)object0), "builder");
        dgji dgji0 = (dgji)this.a;
        ((dcnn)object0).l = dgji0.b;
        ((dcnn)object0).m = dgji0.c;
        ((dcnn)object0).n = dgji0.e;
        ((dcnn)object0).o = dgji0.f;
        ((dcnn)object0).p = dgji0.g;
        if(hvqz.o()) {
            List list0 = (List)this.b.c.get(Long.valueOf(dgji0.a));
            if(list0 != null) {
                for(Object object1: list0) {
                    ((dcnn)object0).b(((Uri)object1));
                }
            }
        }
        return ibom.a;
    }
}

