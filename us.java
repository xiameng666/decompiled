import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class us extends kdl {
    final RecyclerView a;
    public final ur b;

    public us(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        kdl kdl0 = this.j();
        if(kdl0 != null && (kdl0 instanceof ur)) {
            this.b = (ur)kdl0;
            return;
        }
        this.b = new ur(this);
    }

    @Override  // kdl
    public final void b(View view0, AccessibilityEvent accessibilityEvent0) {
        super.b(view0, accessibilityEvent0);
        if((view0 instanceof RecyclerView) && !this.k() && ((RecyclerView)view0).h() != null) {
            ((RecyclerView)view0).h().W(accessibilityEvent0);
        }
    }

    @Override  // kdl
    public void c(View view0, khb khb0) {
        super.c(view0, khb0);
        if(!this.k()) {
            RecyclerView recyclerView0 = this.a;
            if(recyclerView0.h() != null) {
                tx tx0 = recyclerView0.h();
                tx0.fL(tx0.t.d, tx0.t.N, khb0);
            }
        }
    }

    @Override  // kdl
    public final boolean i(View view0, int v, Bundle bundle0) {
        if(super.i(view0, v, bundle0)) {
            return true;
        }
        if(!this.k()) {
            return this.a.h() == null ? false : this.a.h().fO(v, bundle0);
        }
        return false;
    }

    public kdl j() {
        return this.b;
    }

    final boolean k() {
        return this.a.aA();
    }
}

