import android.content.Context;
import android.widget.TextView;
import com.google.android.gms.pay.fops.details.cardrewards.CardRewardsPreviewContainerView;
import com.google.android.libraries.tapandpay.ui.tile.list.TileList;
import java.util.ArrayList;
import java.util.Iterator;

public final class dndh implements icih {
    final dndr a;

    public dndh(dndr dndr0) {
        this.a = dndr0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        fubz fubz0;
        Iterator iterator1;
        dndr dndr0 = this.a;
        TileList tileList0 = dndr0.aS;
        CardRewardsPreviewContainerView cardRewardsPreviewContainerView0 = null;
        if(tileList0 == null) {
            ibuq.j("recentActivityTile");
            tileList0 = null;
        }
        fhxi fhxi0 = dndr0.ay;
        if(fhxi0 == null) {
            ibuq.j("composeVisualElements");
            fhxi0 = null;
        }
        fhvw fhvw0 = dndr0.ax;
        if(fhvw0 == null) {
            ibuq.j("interactionLogger");
            fhvw0 = null;
        }
        tileList0.i(new fufz(fhxi0, fhvw0));
        TileList tileList1 = dndr0.aS;
        if(tileList1 == null) {
            ibuq.j("recentActivityTile");
            tileList1 = null;
        }
        dnfj dnfj0 = ((dnfl)object0).a;
        dolg dolg0 = dndr0.ap();
        ibuq.c(dolg0);
        boolean z = dolg0.e();
        ibuq.f(tileList1, "<this>");
        if(dnfj0 == null) {
            tileList1.setVisibility(8);
        }
        else {
            tileList1.setVisibility(0);
            tileList1.l(dnfj0.a);
            if(z) {
                fude fude0 = tileList1.g();
                fuci fuci0 = tileList1.g().b;
                tileList1.h(fude.a(fude0, null, (fuci0 == null ? new fuci(dnfj0.b, null, null, 14) : fuci.a(fuci0, dnfj0.b, null, null, 14)), null, 5));
            }
            ArrayList arrayList0 = new ArrayList(ibpo.q(dnfj0.c, 10));
            Iterator iterator0 = dnfj0.c.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                dnfn dnfn0 = (dnfn)object1;
                ibuq.f(dnfn0, "<this>");
                fryv fryv0 = dnfn0.c;
                fryv fryv1 = dnfn0.d;
                int v = dnfn0.h;
                fhvp[] arr_fhvp = dnfn0.i;
                dnkw dnkw0 = dnfn0.g;
                if((dnkw0 instanceof dnku)) {
                    iterator1 = iterator0;
                    fubz0 = new fubz(dnfn0.e, ((dnku)dnkw0).a, null, 12);
                    arrayList0.add(new fuat(fryv0, fryv1, (fryl.b(dnfn0.a) ? null : new fuaz(dnfn0.a, null, dnfn0.b, null, 26)), fubz0, v, arr_fhvp, dnfn0.f, null, null, false, false, false, null, false, 0x3F80));
                    iterator0 = iterator1;
                    continue;
                }
                iterator1 = iterator0;
                if((dnkw0 instanceof dnkv)) {
                    fubz0 = new fubz(dnfn0.e, null, ((dnkv)dnkw0).a, 10);
                    arrayList0.add(new fuat(fryv0, fryv1, (fryl.b(dnfn0.a) ? null : new fuaz(dnfn0.a, null, dnfn0.b, null, 26)), fubz0, v, arr_fhvp, dnfn0.f, null, null, false, false, false, null, false, 0x3F80));
                    iterator0 = iterator1;
                    continue;
                }
                if(dnkw0 != null) {
                    throw new ibnq();
                }
                fubz0 = null;
                arrayList0.add(new fuat(fryv0, fryv1, (fryl.b(dnfn0.a) ? null : new fuaz(dnfn0.a, null, dnfn0.b, null, 26)), fubz0, v, arr_fhvp, dnfn0.f, null, null, false, false, false, null, false, 0x3F80));
                iterator0 = iterator1;
                continue;
            }
            fude fude1 = tileList1.g();
            fuci fuci1 = tileList1.g().b;
            tileList1.h(fude.a(fude1, null, (fuci1 == null ? new fuci(null, arrayList0, null, 13) : fuci.a(fuci1, null, arrayList0, null, 13)), null, 5));
            Integer integer0 = dnfj0.e;
            if(integer0 != null) {
                tileList1.k(dnfj0.b, new fryh(((int)integer0)));
            }
            fryv fryv2 = dnfj0.d;
            if(fryw.d(fryv2)) {
                tileList1.j(fryv2, new dnfk(dnfj0));
            }
        }
        if(hwgc.c()) {
            CardRewardsPreviewContainerView cardRewardsPreviewContainerView1 = dndr0.aT;
            if(cardRewardsPreviewContainerView1 == null) {
                ibuq.j("cardRewardsPreviewTile");
            }
            else {
                cardRewardsPreviewContainerView0 = cardRewardsPreviewContainerView1;
            }
            dnlr dnlr0 = ((dnfl)object0).b;
            ibuq.f(cardRewardsPreviewContainerView0, "<this>");
            if(dnlr0 == null) {
                cardRewardsPreviewContainerView0.setVisibility(8);
                return ibom.a;
            }
            cardRewardsPreviewContainerView0.setVisibility(0);
            TextView textView0 = cardRewardsPreviewContainerView0.a;
            Context context0 = cardRewardsPreviewContainerView0.getContext();
            ibuq.e(context0, "getContext(...)");
            textView0.setText(dnlr0.a.a(context0));
            TextView textView1 = cardRewardsPreviewContainerView0.b;
            Context context1 = cardRewardsPreviewContainerView0.getContext();
            ibuq.e(context1, "getContext(...)");
            textView1.setText(dnlr0.a.a(context1));
            dnmj dnmj0 = new dnmj(dnlr0.b, dnlr0.c, dnlr0.e, 0x7BA);
            cardRewardsPreviewContainerView0.c.b.b(dnmj0);
            Context context2 = cardRewardsPreviewContainerView0.getContext();
            ibuq.e(context2, "getContext(...)");
            CharSequence charSequence0 = dnlr0.d.a(context2);
            cardRewardsPreviewContainerView0.d.setText(charSequence0);
            if(dnlr0.f) {
                textView0.setVisibility(0);
                textView1.setVisibility(8);
                return ibom.a;
            }
            textView0.setVisibility(8);
            textView1.setVisibility(0);
        }
        return ibom.a;
    }
}

