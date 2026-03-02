import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class dnhr extends tk {
    public dxev a;
    private final du e;

    public dnhr(du du0) {
        this.e = du0;
    }

    @Override  // tk
    public final int b() {
        hkhr hkhr0;
        dxev dxev0 = this.a;
        hkhm hkhm0 = null;
        if(dxev0 == null) {
            hkhr0 = null;
        }
        else {
            hkhr0 = dxev0.c;
            if(hkhr0 == null) {
                hkhr0 = hkhr.b;
            }
        }
        if(hkhr0 != null) {
            hkhm0 = hkhm.b(hkhr0.f);
            if(hkhm0 == null) {
                hkhm0 = hkhm.k;
            }
        }
        if(hkhm0 == hkhm.g) {
            hkhj hkhj0 = hkhr0.u == null ? hkhj.a : hkhr0.u;
            return (hkhj0.e == null ? hkhi.a : hkhj0.e).b == 0L ? 0 : 1;
        }
        return 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0784, viewGroup0, false);  // layout:pay_wallet_fop_detail_spending_limit
        ibuq.c(view0);
        return new dnhq(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(((dnhq)uq0), "viewHolder");
        dxev dxev0 = this.a;
        if(dxev0 != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            ibuq.e(hkhr0, "getPaymentMethod(...)");
            if(((hkhr0.u == null ? hkhj.a : hkhr0.u).b & 8) != 0) {
                hkhj hkhj0 = hkhr0.u == null ? hkhj.a : hkhr0.u;
                ibuq.e(hkhj0, "getFinancialAccountDetails(...)");
                long v1 = (hkhj0.d == null ? hjws.a : hkhj0.d).b;
                String s = (hkhj0.c == null ? hjws.a : hkhj0.c).c;
                ibuq.e(s, "getCurrencyCode(...)");
                edok.a(v1, s);
                long v2 = (hkhj0.e == null ? hkhi.a : hkhj0.e).b;
                gtlg gtlg0 = edok.a(v2, s);
                gtlg gtlg1 = edok.a((v2 - v1 > 0L ? v2 - v1 : 0L), s);
                String s1 = this.e.getString(0x7F1523C3);  // string:pay_wallet_fop_detail_spending_limit_title "Daily spending limit"
                ((dnhq)uq0).u.setText(s1);
                Object[] arr_object = {fscd.c(gtlg1)};
                String s2 = this.e.getString(0x7F1523C2, arr_object);  // string:pay_wallet_fop_detail_spending_limit_remaining "%1$s left for today"
                ((dnhq)uq0).v.setText(s2);
                long v3 = gtlg1.b;
                if(Long.compare(v3, 0L) > 0) {
                    ((dnhq)uq0).w.setProgress(100 - ((int)(((double)v3) / ((double)gtlg0.b) * 100.0)));
                    int[] arr_v = {fyho.b(((dnhq)uq0).a, 0x7F04030C)};  // attr:colorPrimary
                    ((dnhq)uq0).w.f(arr_v);
                }
                else {
                    ((dnhq)uq0).w.setProgress(100);
                    int[] arr_v1 = {fyho.b(((dnhq)uq0).a, 0x7F040307)};  // attr:colorOutline
                    ((dnhq)uq0).w.f(arr_v1);
                }
                Context context0 = ((dnhq)uq0).a.getContext();
                int v4 = fipw.b.a(context0);
                ((dnhq)uq0).t.d(v4);
            }
        }
    }
}

