import android.text.Html;
import android.text.Spanned;
import com.google.android.gms.pay.ProtoSafeParcelable;
import java.util.ArrayList;

final class dnlb extends ibsl implements ibtw {
    int a;
    final dnlc b;
    final String c;
    final String d;

    public dnlb(dnlc dnlc0, String s, String s1, ibrl ibrl0) {
        this.b = dnlc0;
        this.c = s;
        this.d = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dnlb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dnlb(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        fryr fryr1;
        dxev dxev0;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            evql evql0 = this.b.j.aK(this.b.b, 1);
            this.a = 1;
            Object object3 = fsdk.a(evql0, this);
            if(object3 == object1) {
                return object1;
            }
            object2 = object3;
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        dnlc dnlc0 = this.b;
        String s = this.c;
        String s1 = this.d;
        if(ibnw.b(object2)) {
            bboh bboh0 = dnlc0.e;
            ((ggtj)bboh0.h()).B("protoSafeParcelable: %s", ((ProtoSafeParcelable)object2));
            ibuq.c(((ProtoSafeParcelable)object2));
            ibuq.e(dxeo.a, "getDefaultInstance(...)");
            MessageLite hfvm0 = ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)dxeo.a));
            ibuq.e(hfvm0, "parse(...)");
            fugr fugr0 = null;
            if(s1 != null && s1.length() != 0) {
                dxev0 = dnpv.b(((dxeo)hfvm0), s1);
            }
            else {
                dxev0 = s == null || s.length() == 0 ? null : dnpv.c(((dxeo)hfvm0), s);
            }
            if(dxev0 == null) {
                ((ggtj)bboh0.j()).x("No matching payment method found");
            }
            else {
                icnl icnl0 = dnlc0.h;
                String s2 = (dxev0.c == null ? hkhr.b : dxev0.c).h;
                ibuq.e(s2, "getTitle(...)");
                fryr fryr0 = s2.length() > 0 ? new frys(0x7F151C45, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).h}) : new fryr(0x7F151C46);  // string:pay_card_rewards_details_title "%1$s"
                hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                String s3 = (hkhh0.h == null ? hkgs.a : hkhh0.h).f;
                if(s3.length() == 0) {
                    hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
                    hkhh hkhh1 = hkhr1.q == null ? hkhh.a : hkhr1.q;
                    s3 = (hkhh1.h == null ? hkgs.a : hkhh1.h).i;
                }
                ibuq.e(s3, "ifEmpty(...)");
                hkhr hkhr2 = dxev0.c == null ? hkhr.b : dxev0.c;
                ibuq.e(hkhr2, "getPaymentMethod(...)");
                dylf dylf0 = dxev0.g == null ? dylf.a : dxev0.g;
                dylc dylc0 = dylf0.d == null ? dylc.a : dylf0.d;
                ibuq.e(dylc0, "getSePrepaidCardData(...)");
                dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                dzdm dzdm0 = (dzdm)dzdm.h.get(dyna0);
                if(dzdm0 == null) {
                    dmew dmew0 = dmev.d(dxev0);
                    if(dmew0 == null) {
                        hkhk hkhk0 = hkhr2.k == null ? hkhk.a : hkhr2.k;
                        String s4 = hkhk0.c.length() == 0 ? hkhr2.l : hkhk0.c;
                        ibuq.e(s4, "ifEmpty(...)");
                        if(s4.length() > 0) {
                            fugr0 = new fugr(dnlc.b(new fryj(s4, null, new fryg(null, null, null, null, 0x1F), null)));
                        }
                    }
                    else {
                        fsan fsan0 = dmex.b(dmew0);
                        fugr0 = new fugr(dnlc0.c.i(fsan0));
                    }
                }
                else {
                    fugr0 = new fugr(dnlc.b(new fryh(dzdm0.j)));
                }
                String s5 = (dxev0.c == null ? hkhr.b : dxev0.c).h;
                ibuq.e(s5, "getTitle(...)");
                if(s5.length() == 0) {
                    fryr1 = new fryr(0x7F151C44);  // string:pay_card_rewards_details_disclaimer_no_link_no_card_name "Check out card 
                                                   // benefits for your card. Terms apply."
                }
                else if(s3.length() > 0) {
                    Spanned spanned0 = Html.fromHtml(dnlc0.a.getString(0x7F151C42, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).h, s3, dnlc.a(s3)}), 0);  // string:pay_card_rewards_details_disclaimer "Check out card benefits for your %1$s. 
                                                                                                                                                               // Terms apply. View more about card benefits on <a href=%2$s>%3$s</a>"
                    ibuq.e(spanned0, "fromHtml(...)");
                    fryr1 = new fryt(spanned0);
                }
                else {
                    fryr1 = new frys(0x7F151C43, new Object[]{(dxev0.c == null ? hkhr.b : dxev0.c).h});  // string:pay_card_rewards_details_disclaimer_no_link "Check out card benefits for 
                                                                                                         // your %1$s. Terms apply."
                }
                icnl0.g(new fuhm(fugr0, fryr0, fryr1));
                icnl icnl1 = dnlc0.i;
                hfuo hfuo0 = (dxev0.c == null ? hkhr.b : dxev0.c).w;
                ibuq.e(hfuo0, "getInstrumentOffersList(...)");
                ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
                for(Object object4: hfuo0) {
                    ibuq.c(((hkhl)object4));
                    arrayList0.add(new dnky(((hkhl)object4)));
                }
                icnl1.g(arrayList0);
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dnlc0.e.j(), "getPaymentMethod failed", throwable0);
        }
        return ibom.a;
    }
}

