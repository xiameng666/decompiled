import android.util.Property;

final class fyqw extends Property {
    public fyqw(Class class0) {
        super(class0, "completeEndFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyqx)object0).h;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        ((fyqx)object0).h = (float)(((Float)object1));
    }
}

