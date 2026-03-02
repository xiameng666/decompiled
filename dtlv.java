import android.util.Property;
import android.view.View;

public final class dtlv extends Property {
    public dtlv(Class class0) {
        super(class0, "elevation");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return ((View)object0).getElevation();
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        ((View)object0).setElevation(((Float)object1).floatValue());
    }
}

