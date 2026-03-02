import android.view.View.OnLayoutChangeListener;
import android.view.View;
import j..util.Objects;

final class aaky implements View.OnLayoutChangeListener {
    final View a;
    final aakz b;

    public aaky(aakz aakz0, View view0) {
        this.a = view0;
        Objects.requireNonNull(aakz0);
        this.b = aakz0;
        super();
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        if(v1 != v3 && v2 != v) {
            View view1 = this.a;
            view1.removeOnLayoutChangeListener(this);
            if(this.b.isResumed()) {
                view1.postDelayed(new aakx(this), 0L);
            }
        }
    }
}

