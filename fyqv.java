import android.util.Property;
import java.util.List;

final class fyqv extends Property {
    public fyqv(Class class0) {
        super(class0, "animationFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyqx)object0).g;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        ((fyqx)object0).g = f;
        List list0 = ((fyqx)object0).k;
        fyrm fyrm0 = (fyrm)list0.get(0);
        float f1 = ((fyqx)object0).g * 1520.0f;
        fyrm0.a = -20.0f + f1;
        fyrm0.b = f1;
        for(int v = 0; v < 4; ++v) {
            float f2 = fyqx.h(((int)(f * 5400.0f)), fyqx.a[v], 667);
            fyrm0.b += ((fyqx)object0).d.getInterpolation(f2) * 250.0f;
            float f3 = fyqx.h(((int)(f * 5400.0f)), fyqx.b[v], 667);
            fyrm0.a += ((fyqx)object0).d.getInterpolation(f3) * 250.0f;
        }
        float f4 = fyrm0.b;
        float f5 = fyrm0.a + (f4 - fyrm0.a) * ((fyqx)object0).h;
        fyrm0.a = f5;
        fyrm0.a = f5 / 360.0f;
        fyrm0.b = f4 / 360.0f;
        for(int v1 = 0; v1 < 4; ++v1) {
            float f6 = fyqx.h(((int)(f * 5400.0f)), fyqx.c[v1], 333);
            if((f6 > 0.0f) && (f6 < 1.0f)) {
                int v2 = v1 + ((fyqx)object0).f;
                int[] arr_v = ((fyqx)object0).e.e;
                int v3 = v2 % arr_v.length;
                ((fyrm)list0.get(0)).c = (int)fycr.a(((fyqx)object0).d.getInterpolation(f6), Integer.valueOf(arr_v[v3]), Integer.valueOf(arr_v[(v3 + 1) % arr_v.length]));
                break;
            }
        }
        ((fyqx)object0).j.invalidateSelf();
    }
}

