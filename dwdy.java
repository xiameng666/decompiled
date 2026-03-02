import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.core.widget.NestedScrollView;

public final class dwdy implements ViewTreeObserver.OnGlobalLayoutListener {
    final dwef a;

    public dwdy(dwef dwef0) {
        this.a = dwef0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dwef dwef0 = this.a;
        NestedScrollView nestedScrollView0 = dwef0.ai;
        NestedScrollView nestedScrollView1 = null;
        if(nestedScrollView0 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView0 = null;
        }
        if(nestedScrollView0.getVisibility() == 0) {
            dwfb dwfb0 = dwef0.A();
            NestedScrollView nestedScrollView2 = dwef0.ai;
            if(nestedScrollView2 == null) {
                ibuq.j("noticeTextContainer");
                nestedScrollView2 = null;
            }
            int v = nestedScrollView2.canScrollVertically(1);
            if(!hwfk.av()) {
                dwfb0.j(dweg.a(dwfb0.a(), fryy.b(dwfb0.a().a, null, ((boolean)(v ^ 1)), null, 11), null, null, null, null, null, 62));
            }
            else if(v == 0) {
                dweg dweg0 = dwfb0.a();
                fryy fryy0 = dwfb0.a().a;
                gubr gubr0 = dwfb0.g;
                if(gubr0 == null) {
                    ibuq.j("passConsentInfo");
                    gubr0 = null;
                }
                gubp gubp0 = gubr0.d == null ? gubp.a : gubr0.d;
                String s = (gubp0.c == null ? gubo.a : gubp0.c).b;
                ibuq.e(s, "getLabel(...)");
                dwfb0.j(dweg.a(dweg0, fryy.b(fryy0, new fryu(s), false, new dwel(dwfb0), 5), null, null, null, null, null, 62));
            }
            else {
                dwfb0.j(dweg.a(dwfb0.a(), fryy.b(dwfb0.a().a, new fryr(0x7F1522DE), false, new dweq(dwfb0), 5), null, null, null, null, null, 62));  // string:pay_ucp_more_button "More"
            }
            if(hwfk.H()) {
                NestedScrollView nestedScrollView3 = dwef0.ai;
                if(nestedScrollView3 == null) {
                    ibuq.j("noticeTextContainer");
                    nestedScrollView3 = null;
                }
                nestedScrollView3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        if(!hwfk.H()) {
            NestedScrollView nestedScrollView4 = dwef0.ai;
            if(nestedScrollView4 == null) {
                ibuq.j("noticeTextContainer");
            }
            else {
                nestedScrollView1 = nestedScrollView4;
            }
            nestedScrollView1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}

