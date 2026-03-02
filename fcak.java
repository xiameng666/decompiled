import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.ui.common.SummaryTextLayout;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

public final class fcak extends gdak {
    public View a;
    private final gamj ag;
    private final gdew ah;
    private SummaryExpanderWrapper ai;
    private final ArrayList b;
    private ViewGroup c;
    private final ArrayList d;

    public fcak() {
        this.b = new ArrayList(1);
        this.d = new ArrayList(1);
        this.ag = new gamj(0x6C9);
        this.ah = new gdew();
    }

    @Override  // gami
    public final gamj B() {
        return this.ag;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gexg)this.aA).b;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gexg.a).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        if(this.ai == null) {
            return;
        }
        bbqv.b(this.c, this.ca);
        this.ai.setEnabled(this.ca);
    }

    @Override  // gdak
    public final ArrayList aY() {
        return this.b;
    }

    @Override  // gdak
    public final void lW(int v) {
        this.c.setVisibility(v);
    }

    @Override  // gdaa
    public final boolean la() {
        return this.lb(null);
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.d;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        String s = (getg0.b == null ? gesr.a : getg0.b).b;
        gewg gewg0 = ((gexg)this.aA).b;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        if(s.equals(gewg0.c)) {
            gesr gesr0 = getg0.b;
            if((gesr0 == null ? gesr.a : gesr0).c == 1) {
                gdcd.m(this.a, getg0.c);
                return true;
            }
            if(gesr0 == null) {
                gesr0 = gesr.a;
            }
            throw new IllegalArgumentException(String.format("Unexpected field id \'%s\' for BillingAccountForm", ((int)gesr0.c)));
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ah;
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        SummaryExpanderWrapper summaryExpanderWrapper0 = (SummaryExpanderWrapper)layoutInflater0.inflate(0x7F0E0D23, viewGroup0, false);  // layout:wallet_fragment_billing_account_form
        this.ai = summaryExpanderWrapper0;
        summaryExpanderWrapper0.f(this, 0x7F0B0CB4, 0x7F0B0CB5);  // id:billing_summary_image
        SummaryTextLayout summaryTextLayout0 = (SummaryTextLayout)this.ai.findViewById(0x7F0B0CB5);  // id:billing_summary_text
        this.c = (ViewGroup)this.ai.findViewById(0x7F0B0CB3);  // id:billing_id_container
        gfjj gfjj0 = ((gexg)this.aA).c;
        if(gfjj0 == null) {
            gfjj0 = gfjj.a;
        }
        gdce gdce0 = new gdce(gfjj0, layoutInflater0, this.cH(), this.c);
        gdce0.a = this.getContext();
        gdce0.c = this.cM();
        gdce0.f = this;
        this.a = gdce0.a();
        View view0 = gdax.b(this.bV, this.a, this.c, this.cH().a());
        gfjj gfjj1 = ((gexg)this.aA).c;
        if(gfjj1 == null) {
            gfjj1 = gfjj.a;
        }
        gdax.g(view0, gfjj1.j);
        ArrayList arrayList0 = this.d;
        gfjj gfjj2 = ((gexg)this.aA).c;
        long v = (gfjj2 == null ? gfjj.a : gfjj2).f;
        View view1 = this.a;
        if(gfjj2 == null) {
            gfjj2 = gfjj.a;
        }
        arrayList0.add(new gczs(v, view1, gdcd.h(gfjj2)));
        this.c.addView(view0);
        gfjj gfjj3 = ((gexg)this.aA).c;
        if(gfjj3 == null) {
            gfjj3 = gfjj.a;
        }
        if(!gfjj3.j.isEmpty() && summaryTextLayout0 != null) {
            gfjj gfjj4 = ((gexg)this.aA).c;
            if(gfjj4 == null) {
                gfjj4 = gfjj.a;
            }
            summaryTextLayout0.b(gfjj4.j);
        }
        this.b.add(this.c);
        return this.ai;
    }
}

