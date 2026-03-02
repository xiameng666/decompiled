import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.List;

final class fyra extends Property {
    public fyra(Class class0) {
        super(class0, "animationFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyrc)object0).f;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        ((fyrc)object0).f = f;
        List list0 = ((fyrc)object0).k;
        fyrm fyrm0 = (fyrm)list0.get(0);
        float f1 = ((fyrc)object0).f * 1080.0f;
        int[] arr_v = fyrc.a;
        float f2 = 0.0f;
        for(int v = 0; v < 4; ++v) {
            float f3 = fyrc.h(((int)(f * 6000.0f)), arr_v[v], 500);
            f2 += ((fyrc)object0).c.getInterpolation(f3) * 90.0f;
        }
        fyrm0.g = f1 + f2;
        TimeInterpolator timeInterpolator0 = ((fyrc)object0).c;
        float f4 = timeInterpolator0.getInterpolation(fyrc.h(((int)(f * 6000.0f)), 0, 3000)) - timeInterpolator0.getInterpolation(fyrc.h(((int)(f * 6000.0f)), 3000, 3000));
        fyrm0.a = 0.0f;
        float f5 = fyoi.a(fyrc.b[0], fyrc.b[1], f4);
        fyrm0.b = f5;
        float f6 = ((fyrc)object0).g;
        if(Float.compare(f6, 0.0f) > 0) {
            fyrm0.b = f5 * (1.0f - f6);
        }
        for(int v1 = 0; v1 < 4; ++v1) {
            float f7 = fyrc.h(((int)(f * 6000.0f)), arr_v[v1], 100);
            if((f7 >= 0.0f) && (f7 <= 1.0f)) {
                int v2 = v1 + ((fyrc)object0).e;
                int[] arr_v1 = ((fyrc)object0).d.e;
                int v3 = v2 % arr_v1.length;
                int v4 = arr_v1[v3];
                int v5 = arr_v1[(v3 + 1) % arr_v1.length];
                ((fyrm)list0.get(0)).c = (int)fycr.a(timeInterpolator0.getInterpolation(f7), Integer.valueOf(v4), Integer.valueOf(v5));
                break;
            }
        }
        ((fyrc)object0).j.invalidateSelf();
    }
}

