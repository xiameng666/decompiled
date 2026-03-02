import android.view.View;

public final class jnu extends hfb implements hiv {
    @Override  // hiv
    public final void c(hir hir0) {
        View view0 = jnq.a(this);
        hir0.a(this.r.B && jnq.a(this).hasFocusable());
        View view1 = view0.findFocus();
        if(view1 != null) {
            hir0.b(hie.b(view1, view0));
        }
    }
}

