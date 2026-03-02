import android.util.Property;
import java.util.List;

final class fyrt extends Property {
    public fyrt(Class class0) {
        super(class0, "animationFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyru)object0).e;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        ((fyru)object0).e = f;
        List list0 = ((fyru)object0).k;
        ((fyrm)list0.get(0)).a = 0.0f;
        fyrm fyrm0 = (fyrm)list0.get(0);
        fyrm fyrm1 = (fyrm)list0.get(1);
        float f1 = fyru.h(((int)(f * 333.0f)), 0, 667);
        float f2 = ((fyru)object0).a.getInterpolation(f1);
        fyrm1.a = f2;
        fyrm0.b = f2;
        fyrm fyrm2 = (fyrm)list0.get(1);
        fyrm fyrm3 = (fyrm)list0.get(2);
        float f3 = ((fyru)object0).a.getInterpolation(f1 + 0.49925f);
        fyrm3.a = f3;
        fyrm2.b = f3;
        ((fyrm)list0.get(2)).b = 1.0f;
        if(((fyru)object0).d && (((fyrm)list0.get(1)).b < 1.0f)) {
            fyrm fyrm4 = (fyrm)list0.get(2);
            fyrm4.c = ((fyrm)list0.get(1)).c;
            fyrm fyrm5 = (fyrm)list0.get(1);
            fyrm5.c = ((fyrm)list0.get(0)).c;
            fyrm fyrm6 = (fyrm)list0.get(0);
            fyrm6.c = ((fyru)object0).b.e[((fyru)object0).c];
            ((fyru)object0).d = false;
        }
        ((fyru)object0).j.invalidateSelf();
    }
}

