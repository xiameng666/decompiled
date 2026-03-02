import android.content.Context;
import android.content.Intent;

final class eacy extends ibsl implements ibtw {
    final eada a;

    public eacy(eada eada0, ibrl ibrl0) {
        this.a = eada0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eacy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eacy(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Intent intent0;
        ibnx.b(object0);
        eada eada0 = this.a;
        eagu eagu0 = eada0.g;
        if((eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d)) == eagt.j && eagu0.l.size() > 0) {
            frli frli0 = eada0.e.a(eada0.b, eada0.d);
            dyjb dyjb0 = (dyjb)frli0.a().get();
            ((glyq)frli0.b(new eacq(new eacp()), eada0.f)).u();
            String s = eagu0.k;
            ibuq.e(s, "getSessionId(...)");
            if(s.length() != 0 && ibuq.m(dyjb0.c, eagu0.k) && System.currentTimeMillis() - hfyn.b((dyjb0.d == null ? hfwn.a : dyjb0.d)) < hwnm.a.f().e()) {
                Context context0 = eada0.c;
                if((dyjb0.b & 2) != 0) {
                    ibuq.e(eagu0, "provisionData");
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)eagu0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)eagu0));
                    eagw eagw0 = eagv.a(hftp0);
                    ByteString hfsf0 = dyjb0.e;
                    ibuq.e(hfsf0, "getAuditToken(...)");
                    eagw0.b(hfsf0);
                    eagu0 = eagw0.a();
                }
                intent0 = dlnf.ah(context0, eagu0, gfqx.a, false);
            }
            else {
                Context context1 = eada0.c;
                int v = dypl.a((dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c))).a;
                ibuq.e(eagu0, "provisionData");
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)eagu0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)eagu0));
                eagw eagw1 = eagv.a(hftp1);
                ProtoLiteBuilder hftp2 = eagw1.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((eagu)hftp2.b_message).k = eagu.a.k;
                eagu eagu1 = eagw1.a();
                intent0 = new Intent("com.google.android.gms.pay.secard.view.provision.VIEW_PUSH_PROVISION_SPLASH_FRAGMENT").setClassName(context1, "com.google.android.gms.pay.main.PayActivity").putExtra("secure_element_service_provider", v).putExtra("SecureElementProvisionData", eagu1.toBytesArray());
            }
        }
        else {
            intent0 = dlnf.ai(eada0.c, eagu0);
        }
        ibuq.c(intent0);
        eada0.c(intent0);
        return ibom.a;
    }
}

