import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class dnhk extends tk {
    public dxev a;

    @Override  // tk
    public final int b() {
        dxev dxev0 = this.a;
        hkhm hkhm0 = null;
        if(dxev0 != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 != null) {
                hkhm0 = hkhm.b(hkhr0.f);
                if(hkhm0 == null) {
                    hkhm0 = hkhm.k;
                }
            }
        }
        return hkhm0 != null && hkhm0.ordinal() == 6 ? 1 : 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E077D, viewGroup0, false);  // layout:pay_wallet_fop_detail_balance
        ibuq.c(view0);
        return new dnhj(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(((dnhj)uq0), "viewHolder");
        dxev dxev0 = this.a;
        if(dxev0 == null) {
            return;
        }
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        ibuq.e(hkhr0, "getPaymentMethod(...)");
        hkhj hkhj0 = hkhr0.u == null ? hkhj.a : hkhr0.u;
        ibuq.e(hkhj0, "getFinancialAccountDetails(...)");
        ((dnhj)uq0).u.setText(fscd.c(edok.a((hkhj0.c == null ? hjws.a : hkhj0.c).b, (hkhj0.c == null ? hjws.a : hkhj0.c).c)));
        Context context0 = ((dnhj)uq0).t.getContext();
        int v1 = fipw.b.a(context0);
        ((dnhj)uq0).t.d(v1);
    }
}

