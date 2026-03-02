import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets.Builder;

final class ji implements keg {
    final ka a;

    public ji(ka ka0) {
        this.a = ka0;
        super();
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        int v4;
        ka ka0 = this.a;
        int v = kgq0.d();
        int v1 = kgq0.d();
        if(ka0.p != null && (ka0.p.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)ka0.p.getLayoutParams();
            int v2 = 0;
            if(ka0.p.isShown()) {
                if(ka0.G == null) {
                    ka0.G = new Rect();
                    ka0.H = new Rect();
                }
                Rect rect0 = ka0.G;
                Rect rect1 = ka0.H;
                rect0.set(kgq0.b(), kgq0.d(), kgq0.c(), kgq0.a());
                jxn jxn0 = kgq0.f(2);
                Insets insets0 = ka0.u.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect0)).build(), rect1).getSystemWindowInsets();
                rect0.set(insets0.left, insets0.top, insets0.right, insets0.bottom);
                jxn jxn1 = jxn.e(Math.max(0, jxn0.b - rect1.left), Math.max(0, jxn0.c - rect1.top), Math.max(0, jxn0.d - rect1.right), Math.max(0, jxn0.e - rect1.bottom));
                int v3 = jxn1.b;
                if(viewGroup$MarginLayoutParams0.leftMargin == v3 && viewGroup$MarginLayoutParams0.rightMargin == jxn1.d) {
                    v4 = 0;
                }
                else {
                    viewGroup$MarginLayoutParams0.leftMargin = v3;
                    viewGroup$MarginLayoutParams0.rightMargin = jxn1.d;
                    v4 = 1;
                }
                ka0.p.k = rect0.left - v3;
                ka0.p.l = rect0.top;
                ka0.p.m = rect0.right - jxn1.d;
                ka0.p.n();
                if(!ka0.x && rect0.top > 0) {
                    v1 = 0;
                }
                v2 = v4;
            }
            if(v2 != 0) {
                ka0.p.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        if(v != v1) {
            kgq0 = kgq0.q(kgq0.b(), v1, kgq0.c(), kgq0.a());
        }
        return kfe.e(view0, kgq0);
    }
}

