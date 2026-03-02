import android.view.View;

public final class ikj extends kdl {
    final ili a;
    final ify b;
    final ili c;

    public ikj(ili ili0, ify ify0, ili ili1) {
        this.a = ili0;
        this.b = ify0;
        this.c = ili1;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        Integer integer0;
        super.c(view0, khb0);
        ili ili0 = this.a;
        ilt ilt0 = ili0.n;
        if(ilt0.D()) {
            khb0.af(false);
        }
        ify ify0 = this.b;
        ify ify1;
        for(ify1 = ify0.n(); true; ify1 = ify1.n()) {
            integer0 = null;
            if(ify1 == null) {
                ify1 = null;
                break;
            }
            if(ify1.u.j(8)) {
                break;
            }
        }
        if(ify1 != null) {
            integer0 = (int)ify1.c;
        }
        if(integer0 == null || ((int)integer0) == ili0.m.a().d) {
            integer0 = (int)-1;
        }
        ili ili1 = this.c;
        khb0.S(ili1, integer0.intValue());
        int v = ify0.c;
        int v1 = ilt0.y.d(v);
        if(v1 != -1) {
            View view1 = iql.a(ili0.D(), v1);
            if(view1 == null) {
                khb0.ae(ili1, v1);
            }
            else {
                khb0.ad(view1);
            }
            ili0.E(v, khb0.a, ilt0.p);
        }
        int v2 = ilt0.z.d(v);
        if(v2 != -1) {
            View view2 = iql.a(ili0.D(), v2);
            if(view2 == null) {
                khb0.a.setTraversalAfter(ili1, v2);
            }
            else {
                khb0.ac(view2);
            }
            ili0.E(v, khb0.a, ilt0.q);
        }
    }
}

