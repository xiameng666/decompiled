import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import j..util.Objects;

final class fohx implements ViewTreeObserver.OnPreDrawListener {
    final ExpandableDialogView a;

    public fohx(foil foil0, ExpandableDialogView expandableDialogView0) {
        this.a = expandableDialogView0;
        Objects.requireNonNull(foil0);
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int v = this.a.getLayoutDirection() == 1 ? this.a.a.left : this.a.a.right;
        this.a.setPivotX(((float)v));
        this.a.setPivotY(((float)this.a.a.top));
        return true;
    }
}

