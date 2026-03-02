import android.widget.TextView;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.material.appbar.AppBarLayout;

public final class aafh implements fydj {
    public final aafw a;

    public aafh(aafw aafw0) {
        this.a = aafw0;
    }

    @Override  // fydd
    public final void a(AppBarLayout appBarLayout0, int v) {
        aafw aafw0 = this.a;
        if((aafw0.z().h.ij() instanceof aash)) {
            int v1 = appBarLayout0.f();
            float f = v1 <= 0 ? 1.0f : Math.abs(((float)v) / ((float)v1));
            ProductLockupToolbar productLockupToolbar0 = aafw0.ai;
            TextView textView0 = null;
            if(productLockupToolbar0 == null) {
                ibuq.j("toolbar");
                productLockupToolbar0 = null;
            }
            int v2 = Float.compare(f, 0.334f);
            int v3 = 8;
            if(v2 < 0) {
                productLockupToolbar0.y.setVisibility(0);
                float f1 = 1.0f - f;
                productLockupToolbar0.y.setAlpha(f1 * f1);
            }
            else {
                productLockupToolbar0.y.setVisibility(8);
            }
            float f2 = f * f;
            TextView textView1 = aafw0.aj;
            if(textView1 == null) {
                ibuq.j("expandedTitle");
                textView1 = null;
            }
            textView1.setAlpha(1.0f - f2);
            TextView textView2 = aafw0.aj;
            if(textView2 == null) {
                ibuq.j("expandedTitle");
                textView2 = null;
            }
            textView2.setVisibility((v2 > 0 ? 4 : 0));
            TextView textView3 = aafw0.ak;
            if(textView3 == null) {
                ibuq.j("collapsedTitle");
                textView3 = null;
            }
            textView3.setAlpha(f2);
            TextView textView4 = aafw0.ak;
            if(textView4 == null) {
                ibuq.j("collapsedTitle");
            }
            else {
                textView0 = textView4;
            }
            if((f > 0.334f)) {
                v3 = 0;
            }
            textView0.setVisibility(v3);
        }
    }
}

