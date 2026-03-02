import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.growth.uiflow.ui.widget.PagerControls;
import com.google.android.gms.growth.uiflow.ui.widget.ViewPagerExtended;

public final class bvym extends bvxo {
    public final xob a;
    public boolean b;
    private static final bboh k;
    private final bwbl l;
    private final fhvw m;

    static {
        bvym.k = bboh.b("UiFlow", bbcu.ff);
    }

    public bvym(hgmq hgmq0, bvwy bvwy0, xob xob0, du du0, bvwa bvwa0, bwbl bwbl0, fhwo fhwo0, bvxp bvxp0, fhvw fhvw0, bwdm bwdm0) {
        super(hgmq0, bvwy0, fhwo0, bvwa0, bvxp0, du0, bwdm0);
        this.a = xob0;
        this.l = bwbl0;
        this.m = fhvw0;
        this.b = true;
    }

    @Override  // bvxo
    public final void a(View view0, LayoutInflater layoutInflater0) {
        ibuq.f(layoutInflater0, "inflater");
        hgmq hgmq0 = this.d;
        hgnk hgnk0 = hgmq0.e == 11 ? ((hgnk)hgmq0.f) : hgnk.a;
        ibuq.e(hgnk0, "getScreenPager(...)");
        View view1 = null;
        ViewGroup viewGroup0 = (view0 instanceof ViewGroup) ? ((ViewGroup)view0) : null;
        if(viewGroup0 == null) {
            ((ggtj)bvym.k.j()).x("Failed binding ScreenPagerElement - missing view");
            return;
        }
        View view2 = viewGroup0.findViewById(0x7F0B23DF);  // id:up_view_pager
        ibuq.d(view2, "null cannot be cast to non-null type com.google.android.gms.growth.uiflow.ui.widget.ViewPagerExtended");
        String s = hgmq0.h;
        ibuq.e(s, "getContentDescription(...)");
        if(s.length() > 0) {
            ((ViewPagerExtended)view2).setContentDescription(hgmq0.h);
        }
        this.d(((ViewPagerExtended)view2));
        View view3 = viewGroup0.findViewById(0x7F0B245D);  // id:view_pager_controls
        ibuq.d(view3, "null cannot be cast to non-null type com.google.android.gms.growth.uiflow.ui.widget.PagerControls");
        ((PagerControls)view3).g(this.i);
        ((PagerControls)view3).e = this.m;
        fhwk fhwk0 = this.f.b;
        fhvo fhvo0 = fhwk0.e(125810);
        View view4 = ((PagerControls)view3).b;
        if(view4 == null) {
            ibuq.j("nextButton");
            view4 = null;
        }
        fhvo0.c(view4);
        fhvo fhvo1 = fhwk0.e(0x1EB73);
        View view5 = ((PagerControls)view3).c;
        if(view5 == null) {
            ibuq.j("prevButton");
        }
        else {
            view1 = view5;
        }
        fhvo1.c(view1);
        bvzg bvzg0 = (bvzg)this.j.a(bvzg.class);
        hfuo hfuo0 = hgnk0.c;
        bvpu bvpu0 = bvzg0.d.a.u();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("SELECT screen FROM ScreenEntity WHERE screenKey IN (");
        oqr.a(stringBuilder0, (hfuo0 == null ? 1 : hfuo0.size()));
        stringBuilder0.append(")");
        olf olf0 = ((bvpz)bvpu0).a.z();
        bvqh bvqh0 = new bvqh(hfuo0);
        lps lps0 = this.h.getViewLifecycleOwner();
        bvyl bvyl0 = new bvyl(new bvyf(((ViewPagerExtended)view2), this, ((PagerControls)view3), hgnk0, viewGroup0));
        lsa.b(olf0.e(new String[]{"ScreenEntity"}, new bvpx(stringBuilder0.toString(), hfuo0)), bvqh0).g(lps0, bvyl0);
    }

    public final void e(ViewPagerExtended viewPagerExtended0) {
        if(viewPagerExtended0.a() == 0 && this.i.g()) {
            this.a.getSupportFragmentManager().av();
            return;
        }
        viewPagerExtended0.b(viewPagerExtended0.a() - 1, this.b);
        viewPagerExtended0.requestFocus();
    }

    public final void f(ViewPagerExtended viewPagerExtended0) {
        hgnk hgnk0 = this.d.e == 11 ? ((hgnk)this.d.f) : hgnk.a;
        ibuq.e(hgnk0, "getScreenPager(...)");
        if((hgnk0.b & 1) != 0) {
            this.l.a((hgnk0.f == null ? hgme.a : hgnk0.f), viewPagerExtended0);
        }
    }
}

