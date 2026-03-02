import android.util.Property;

final class fyrb extends Property {
    public fyrb(Class class0) {
        super(class0, "completeEndFraction");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((fyrc)object0).g;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        ((fyrc)object0).g = (float)(((Float)object1));
    }
}

