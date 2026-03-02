import android.util.Property;
import java.util.List;

final class fyrx extends Property {
    public fyrx(Class class0) {
        super(class0, "animationFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyry)object0).g;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        ((fyry)object0).g = f;
        for(int v = 0; true; ++v) {
            List list0 = ((fyry)object0).k;
            if(v >= list0.size()) {
                break;
            }
            fyrm fyrm0 = (fyrm)list0.get(v);
            int v1 = v + v;
            float f1 = fyry.h(((int)(f * 1800.0f)), fyry.b[v1], fyry.a[v1]);
            fyrm0.a = jyq.a(((fyry)object0).c[v1].getInterpolation(f1), 0.0f, 1.0f);
            float f2 = fyry.h(((int)(f * 1800.0f)), fyry.b[v1 + 1], fyry.a[v1 + 1]);
            fyrm0.b = jyq.a(((fyry)object0).c[v1 + 1].getInterpolation(f2), 0.0f, 1.0f);
        }
        if(((fyry)object0).f) {
            for(Object object2: list0) {
                ((fyrm)object2).c = ((fyry)object0).d.e[((fyry)object0).e];
            }
            ((fyry)object0).f = false;
        }
        ((fyry)object0).j.invalidateSelf();
    }
}

