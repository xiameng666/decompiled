import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j..util.Objects;

public final class jtj implements keg {
    final CoordinatorLayout a;

    public jtj(CoordinatorLayout coordinatorLayout0) {
        this.a = coordinatorLayout0;
        super();
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        CoordinatorLayout coordinatorLayout0 = this.a;
        if(!Objects.equals(coordinatorLayout0.e, kgq0)) {
            coordinatorLayout0.e = kgq0;
            boolean z = true;
            boolean z1 = kgq0.d() > 0;
            coordinatorLayout0.f = z1;
            if(z1 || coordinatorLayout0.getBackground() != null) {
                z = false;
            }
            coordinatorLayout0.setWillNotDraw(z);
            if(!kgq0.w()) {
                int v1 = coordinatorLayout0.getChildCount();
                for(int v = 0; v < v1; ++v) {
                    View view1 = coordinatorLayout0.getChildAt(v);
                    if(view1.getFitsSystemWindows() && ((jto)view1.getLayoutParams()).a != null && kgq0.w()) {
                        break;
                    }
                }
            }
            coordinatorLayout0.requestLayout();
        }
        return kgq0;
    }
}

