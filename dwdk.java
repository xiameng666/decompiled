import androidx.core.widget.NestedScrollView;

public final class dwdk implements kij {
    public final boolean a;
    public final dwef b;
    public final ibts c;

    public dwdk(boolean z, dwef dwef0, ibts ibts0) {
        this.a = z;
        this.b = dwef0;
        this.c = ibts0;
    }

    @Override  // kij
    public final void a(NestedScrollView nestedScrollView0, int v, int v1) {
        dweg dweg1;
        if(this.a && !nestedScrollView0.canScrollVertically(1)) {
            dwfb dwfb0 = this.b.A();
            gubr gubr0 = null;
            if(hwfk.av()) {
                dweg dweg0 = dwfb0.a();
                fryy fryy0 = dwfb0.a().a;
                gubr gubr1 = dwfb0.g;
                if(gubr1 == null) {
                    ibuq.j("passConsentInfo");
                }
                else {
                    gubr0 = gubr1;
                }
                gubp gubp0 = gubr0.d == null ? gubp.a : gubr0.d;
                String s = (gubp0.c == null ? gubo.a : gubp0.c).b;
                ibuq.e(s, "getLabel(...)");
                dweg1 = dweg.a(dweg0, fryy.b(fryy0, new fryu(s), false, new dwew(dwfb0), 5), null, null, null, null, null, 62);
            }
            else {
                dweg1 = dweg.a(dwfb0.a(), fryy.b(dwfb0.a().a, null, true, null, 11), null, null, null, null, null, 62);
            }
            dwfb0.j(dweg1);
        }
        this.c.a(nestedScrollView0);
    }
}

