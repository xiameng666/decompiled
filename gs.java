import android.view.View;
import java.util.Objects;

final class gs extends gw {
    private final fv j;

    public gs(gv gv0, gt gt0, fv fv0) {
        ibuq.f(gv0, "finalState");
        ibuq.f(gt0, "lifecycleImpact");
        ibuq.e(fv0.a, "getFragment(...)");
        super(gv0, gt0, fv0.a);
        this.j = fv0;
    }

    @Override  // gw
    public final void a() {
        super.a();
        this.c.s = false;
        this.j.e();
    }

    @Override  // gw
    public final void b() {
        if(!this.g) {
            super.b();
            gt gt0 = this.b;
            if(gt0 == gt.b) {
                fv fv0 = this.j;
                du du0 = fv0.a;
                ibuq.e(du0, "getFragment(...)");
                View view0 = du0.P.findFocus();
                if(view0 != null) {
                    du0.jc(view0);
                    if(fm.ar(2)) {
                        Objects.toString(view0);
                        Objects.toString(du0);
                    }
                }
                View view1 = this.c.requireView();
                if(view1.getParent() == null) {
                    if(fm.ar(2)) {
                        Objects.toString(du0);
                        Objects.toString(view1);
                    }
                    fv0.b();
                    view1.setAlpha(0.0f);
                }
                if(view1.getAlpha() == 0.0f && view1.getVisibility() == 0) {
                    if(fm.ar(2)) {
                        Objects.toString(view1);
                    }
                    view1.setVisibility(4);
                }
                view1.setAlpha(du0.gi());
                if(fm.ar(2)) {
                }
            }
            else if(gt0 == gt.c) {
                du du1 = this.j.a;
                ibuq.e(du1, "getFragment(...)");
                View view2 = du1.requireView();
                if(fm.ar(2)) {
                    Objects.toString(view2.findFocus());
                    Objects.toString(view2);
                    Objects.toString(du1);
                }
                view2.clearFocus();
            }
        }
    }
}

