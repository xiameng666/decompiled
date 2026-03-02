import android.content.res.ColorStateList;
import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

final class fohp extends Property {
    public fohp(Class class0) {
        super(class0, "elevationProgress");
    }

    @Override  // android.util.Property
    public final Object get(Object object0) {
        return (float)((ExpandableDialogView)object0).g;
    }

    @Override  // android.util.Property
    public final void set(Object object0, Object object1) {
        ExpandableDialogView expandableDialogView0 = (ExpandableDialogView)object0;
        float f = (float)(((Float)object1));
        expandableDialogView0.g = f;
        float f1 = f * expandableDialogView0.f;
        expandableDialogView0.e.Z(f1);
        ColorStateList colorStateList0 = ColorStateList.valueOf(expandableDialogView0.c(f1));
        expandableDialogView0.e.aa(colorStateList0);
        expandableDialogView0.d.setElevation(f1);
        expandableDialogView0.invalidate();
    }
}

