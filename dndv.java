import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.tapandpay.ui.wallettip.ComposeWalletTip;

public final class dndv extends tk {
    public final du a;
    public dxev e;
    public Boolean f;
    public View.OnClickListener g;
    private static final bboh h;
    private final dmkl i;
    private final edsh j;
    private final fhvw k;
    private final fhxi l;
    private hkhs m;

    static {
        dndv.h = bboh.b("Pay", bbcu.cZ);
    }

    public dndv(du du0, dmkl dmkl0, edsh edsh0, fhvw fhvw0, fhxi fhxi0) {
        ibuq.f(edsh0, "walletJpEligibility");
        super();
        this.a = du0;
        this.i = dmkl0;
        this.j = edsh0;
        this.k = fhvw0;
        this.l = fhxi0;
    }

    @Override  // tk
    public final int b() {
        dxev dxev0 = this.e;
        if(dxev0 != null && this.m != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            String s = null;
            if(hkhr0 != null) {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                if(hkhh0 != null) {
                    hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                    if(hkir0 != null) {
                        s = hkir0.c;
                    }
                }
            }
            if(s != null) {
                if(!hwsd.Q()) {
                    return 0;
                }
                if(!this.j.a) {
                    return 0;
                }
                if(ibuq.m(this.f, Boolean.valueOf(true))) {
                    return 0;
                }
                if(this.n() == hktu.a) {
                    return 0;
                }
                return this.n() != hktu.C || this.i.a() == hjxa.b ? 1 : 0;
            }
        }
        return 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E077B, viewGroup0, false);  // layout:pay_wallet_fop_card_jp_tokenize_layout
        ibuq.c(view0);
        return new dndu(view0);
    }

    public final void f(dxev dxev0) {
        if(dxev0 == null) {
            return;
        }
        this.e = dxev0;
        this.m = dnpx.c((dxev0.c == null ? hkhr.b : dxev0.c), new hkid[]{hkid.g});
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        String s1;
        fryh fryh0;
        String s;
        ibuq.f(((dndu)uq0), "viewHolder");
        Context context0 = ((dndu)uq0).a.getContext();
        dxev dxev0 = this.e;
        if(dxev0 != null && this.m != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 == null) {
                s = null;
            }
            else {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                if(hkhh0 == null) {
                    s = null;
                }
                else {
                    hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                    s = hkir0 == null ? null : hkir0.c;
                }
            }
            if(s != null) {
                ComposeWalletTip composeWalletTip0 = ((dndu)uq0).t;
                fulb fulb0 = fulb.b;
                switch(this.n().ordinal()) {
                    case 9: {
                        fryh0 = new fryh(0x7F08089A);  // drawable:jcb_tokenization_tip_image
                        break;
                    }
                    case 28: {
                        fryh0 = new fryh(0x7F080E3E);  // drawable:quicpay_tokenization_tip_image
                        break;
                    }
                    default: {
                        fryh0 = new fryh(0);
                    }
                }
                ibuq.c(context0);
                switch(this.n().ordinal()) {
                    case 9: {
                        s1 = "JCB";
                        ibuq.e("JCB", "getString(...)");
                        break;
                    }
                    case 28: {
                        s1 = "QUICPay";
                        ibuq.e("QUICPay", "getString(...)");
                        break;
                    }
                    default: {
                        s1 = "";
                    }
                }
                String s2 = context0.getString(0x7F151DF3, new Object[]{"<b>", s1, "</b>"});  // string:pay_fop_card_tokenize_tip_title "Set up this card to %1$spay everywhere %2$s 
                                                                                              // is accepted%3$s"
                ibuq.e(s2, "getString(...)");
                composeWalletTip0.b(new fula(fulb0, fryh0, new fryq(iwx.b(s2, null, 6)), null, new fryr(0x7F1521F2), true, new dnds(this, ((dndu)uq0)), 0x41E94, 271052, 0L, new dndt(this, context0), null, null, false, 128040));  // string:pay_set_up "Set up"
                composeWalletTip0.c(new fufz(this.l, this.k));
                return;
            }
        }
        ((ggtj)dndv.h.h()).x("FopCardJpTokenizeAdapter.onBindViewHolder: paymentMethodData is null.");
    }

    private final hktu n() {
        dxev dxev0 = this.e;
        hktu hktu0 = null;
        if(dxev0 != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 != null) {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                if(hkhh0 != null) {
                    hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                    if(hkir0 != null) {
                        hktu0 = hktu.b(hkir0.f);
                        if(hktu0 == null) {
                            hktu0 = hktu.D;
                        }
                    }
                }
            }
        }
        if(hktu0 != null) {
            switch(hktu0.ordinal()) {
                case 9: {
                    return hktu.C;
                }
                case 28: {
                    return hktu.j;
                }
                default: {
                    return hktu.a;
                }
            }
        }
        return hktu.a;
    }
}

