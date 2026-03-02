import android.graphics.RectF;
import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

public final class fohl extends Property {
    public fohl(Class class0) {
        super(class0, "animatedBackgroundRect");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return ((ExpandableDialogView)object0).c;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        ((ExpandableDialogView)object0).j(((RectF)object1));
    }
}

