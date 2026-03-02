import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import j..util.Objects;

public final class fohi extends ViewOutlineProvider {
    final ExpandableDialogView a;

    public fohi(ExpandableDialogView expandableDialogView0) {
        Objects.requireNonNull(expandableDialogView0);
        this.a = expandableDialogView0;
        super();
    }

    @Override  // android.view.ViewOutlineProvider
    public final void getOutline(View view0, Outline outline0) {
        float f = this.a.b * (1.0f - this.a.a());
        outline0.setRoundRect(Math.round(this.a.c.left), Math.round(this.a.c.top), Math.round(this.a.c.right), Math.round(this.a.c.bottom), f);
    }
}

