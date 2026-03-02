import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import j..util.Objects;

final class egso implements View.OnLayoutChangeListener {
    final egsq a;

    public egso(egsq egsq0) {
        Objects.requireNonNull(egsq0);
        this.a = egsq0;
        super();
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.a.am.getLayoutParams();
        viewGroup$LayoutParams0.height = this.a.am.getHeight();
        viewGroup$LayoutParams0.width = this.a.am.getWidth();
        this.a.am.setLayoutParams(viewGroup$LayoutParams0);
        this.a.am.removeOnLayoutChangeListener(this);
    }
}

