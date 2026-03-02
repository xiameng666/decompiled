import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

public final class fohk extends Property {
    public fohk(Class class0) {
        super(class0, "scrollOffset");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (int)((ExpandableDialogView)object0).i;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        ((ExpandableDialogView)object0).d(((Integer)object1).intValue());
    }
}

