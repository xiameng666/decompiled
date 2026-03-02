import com.google.android.gms.common.Feature;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;

final class csev implements evqf {
    final csdj a;

    public csev(csdj csdj0) {
        this.a = csdj0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((MdpCarrierPlanIdResponse)object0) == null) {
            ((ggtj)csff.a.j()).x("GetCarrierPlanId API call returned null");
            this.a.o(new NullPointerException());
            return;
        }
        csdj csdj0 = this.a;
        csdj0.q = (MdpCarrierPlanIdResponse)object0;
        if(((MdpCarrierPlanIdResponse)object0).a == null) {
            csdj0.o(new NullPointerException());
            return;
        }
        if(!hvko.C() && !crvw.u()) {
            csdj0.w(csdj0.q.f);
            csff.a(csdj0.q.a, csdj0);
            return;
        }
        String s = csdj0.q.a;
        crvr crvr0 = csdj0.a();
        crwr crwr0 = new crwr();
        crwr0.a.a = s;
        crwr0.a.b = true;
        crwr0.a(csfi.a());
        batl.r(crwr0.a.a, "getConsentInformation needs a non-empty Client CPID");
        crwr crwr1 = new crwr(crwr0.a);
        crwr1.a.e = ((cruv)crvr0).e(crwr0.a.e);
        azzc azzc0 = new azzc();
        azzc0.a = new cruj(((cruv)crvr0), crwr1);
        azzc0.c = new Feature[]{cruh.a};
        azzc0.d = 0x3F4E;
        evql evql0 = ((azts)crvr0).jn(azzc0.a());
        evql0.b(new csex(csdj0));
        evql0.A(new csey(csdj0));
        if(hvjh.f()) {
            csff.e(evql0, "getConsentInformation", csdj0);
        }
    }
}

