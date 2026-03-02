import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

public final class ur extends kdl {
    final us a;
    public final Map b;

    public ur(us us0) {
        this.b = new WeakHashMap();
        this.a = us0;
    }

    @Override  // kdl
    public final khe a(View view0) {
        kdl kdl0 = (kdl)this.b.get(view0);
        return kdl0 == null ? super.a(view0) : kdl0.a(view0);
    }

    @Override  // kdl
    public final void b(View view0, AccessibilityEvent accessibilityEvent0) {
        kdl kdl0 = (kdl)this.b.get(view0);
        if(kdl0 != null) {
            kdl0.b(view0, accessibilityEvent0);
            return;
        }
        super.b(view0, accessibilityEvent0);
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        us us0 = this.a;
        if(!us0.k()) {
            RecyclerView recyclerView0 = us0.a;
            if(recyclerView0.h() != null) {
                recyclerView0.h().aM(view0, khb0);
                kdl kdl0 = (kdl)this.b.get(view0);
                if(kdl0 != null) {
                    kdl0.c(view0, khb0);
                    return;
                }
                super.c(view0, khb0);
                return;
            }
        }
        super.c(view0, khb0);
    }

    @Override  // kdl
    public final void d(View view0, AccessibilityEvent accessibilityEvent0) {
        kdl kdl0 = (kdl)this.b.get(view0);
        if(kdl0 != null) {
            kdl0.d(view0, accessibilityEvent0);
            return;
        }
        super.d(view0, accessibilityEvent0);
    }

    @Override  // kdl
    public final void e(View view0, int v) {
        kdl kdl0 = (kdl)this.b.get(view0);
        if(kdl0 != null) {
            kdl0.e(view0, v);
            return;
        }
        super.e(view0, v);
    }

    @Override  // kdl
    public final void f(View view0, AccessibilityEvent accessibilityEvent0) {
        kdl kdl0 = (kdl)this.b.get(view0);
        if(kdl0 != null) {
            kdl0.f(view0, accessibilityEvent0);
            return;
        }
        super.f(view0, accessibilityEvent0);
    }

    @Override  // kdl
    public final boolean g(View view0, AccessibilityEvent accessibilityEvent0) {
        kdl kdl0 = (kdl)this.b.get(view0);
        return kdl0 == null ? super.g(view0, accessibilityEvent0) : kdl0.g(view0, accessibilityEvent0);
    }

    @Override  // kdl
    public final boolean h(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        kdl kdl0 = (kdl)this.b.get(viewGroup0);
        return kdl0 == null ? super.h(viewGroup0, view0, accessibilityEvent0) : kdl0.h(viewGroup0, view0, accessibilityEvent0);
    }

    @Override  // kdl
    public final boolean i(View view0, int v, Bundle bundle0) {
        us us0 = this.a;
        if(!us0.k()) {
            RecyclerView recyclerView0 = us0.a;
            if(recyclerView0.h() != null) {
                kdl kdl0 = (kdl)this.b.get(view0);
                if(kdl0 != null) {
                    if(kdl0.i(view0, v, bundle0)) {
                        return true;
                    }
                }
                else if(super.i(view0, v, bundle0)) {
                    return true;
                }
                recyclerView0.h();
                return false;
            }
        }
        return super.i(view0, v, bundle0);
    }
}

