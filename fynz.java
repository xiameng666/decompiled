import android.util.Property;

final class fynz extends Property {
    public fynz(Class class0) {
        super(class0, "animationFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyob)object0).d;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        float f = (float)(((Float)object1));
        ((fyob)object0).d = f;
        int v = ((fyob)object0).c - 1;
        ((fyob)object0).i.c = (((float)v) * 140.0f + (((float)(((int)(f * 650.0f)))) / 650.0f == 1.0f ? 0.0f : ((float)(((int)(f * 650.0f)))) / 650.0f) * 50.0f + (((fyob)object0).e - ((float)v)) * 90.0f) % 360.0f;
        fyoc fyoc0 = ((fyob)object0).h;
        if(fyoc0 != null) {
            fyoc0.invalidateSelf();
        }
    }
}

