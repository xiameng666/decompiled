import android.content.Intent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.RenewCommuterPassForSePrepaidCardRequest;
import j..util.Objects;
import org.json.JSONObject;

final class dxqa extends ibsl implements ibtw {
    Object a;
    int b;
    final dxqb c;

    public dxqa(dxqb dxqb0, ibrl ibrl0) {
        this.c = dxqb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxqa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxqa(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object6;
        Object object5;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                dxqb dxqb0 = this.c;
                dxqb0.m();
                if(dxqb0.i == null) {
                    throw new IllegalStateException("Payment data is null");
                }
                Object object4 = Objects.requireNonNull((dxqb0.i == null ? null : dxsy.i(dxqb0.i)));
                ibuq.e(object4, "requireNonNull(...)");
                String s = dxsy.h(((JSONObject)object4));
                ftem ftem0 = dxqb0.h;
                dyna dyna0 = dzdt.f(ftem0.c);
                ftfu ftfu0 = ftem0.A == null ? ftfu.a : ftem0.A;
                dyjr dyjr0 = ftfu0.d == null ? dyjr.a : ftfu0.d;
                ibuq.e(dyjr0, "getPassFareInfo(...)");
                if(dxsy.j(ftem0)) {
                    String s1 = dxqb0.l.name;
                    evll evll0 = evlk.a(((ProtoLiteMessage)evlj.a).v_newBuilder());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)evky.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    ftfu ftfu1 = ftem0.A == null ? ftfu.a : ftem0.A;
                    dyib dyib0 = ftfu1.h == null ? dyib.a : ftfu1.h;
                    ibuq.e(dyib0, "getMfiCardInfo(...)");
                    ibuq.f(dyib0, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    evky evky0 = (evky)hftp0.b_message;
                    dyib0.getClass();
                    evky0.e = dyib0;
                    evky0.b |= 2;
                    ibuq.f(dyjr0, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    evky evky1 = (evky)hftp0.b_message;
                    dyjr0.getClass();
                    evky1.c = dyjr0;
                    evky1.b |= 1;
                    ibuq.f(s, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    evky evky2 = (evky)hftp0.b_message;
                    s.getClass();
                    evky2.d = s;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((evky)hftv0), "value");
                    ProtoLiteBuilder hftp1 = evll0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    evlj evlj0 = (evlj)hftp1.b_message;
                    ((evky)hftv0).getClass();
                    evlj0.c = (evky)hftv0;
                    evlj0.b = 29;
                    ftmi ftmi0 = eekn.e(s1, evll0.a());
                    evql evql0 = dxqb0.m.a(ftmi0);
                    this.a = dyna0;
                    this.b = 1;
                    object5 = fsdk.a(evql0, this);
                    if(object5 == object1) {
                        return object1;
                    }
                    object6 = dyna0;
                    goto label_98;
                }
                else {
                    RenewCommuterPassForSePrepaidCardRequest renewCommuterPassForSePrepaidCardRequest0 = new RenewCommuterPassForSePrepaidCardRequest();
                    renewCommuterPassForSePrepaidCardRequest0.a = dxqb0.l;
                    ftfu ftfu2 = ftem0.A == null ? ftfu.a : ftem0.A;
                    renewCommuterPassForSePrepaidCardRequest0.b = ednj.a((ftfu2.g == null ? hjqn.a : ftfu2.g));
                    renewCommuterPassForSePrepaidCardRequest0.c = s;
                    renewCommuterPassForSePrepaidCardRequest0.d = dyjr0.toBytesArray();
                    renewCommuterPassForSePrepaidCardRequest0.e = dypl.a(dyna0);
                    azzc azzc0 = new azzc();
                    azzc0.a = new doof(renewCommuterPassForSePrepaidCardRequest0);
                    azzc0.c = new Feature[]{dlde.P};
                    azzc0.b = false;
                    azzc0.d = 7317;
                    azzd azzd0 = azzc0.a();
                    evql evql1 = dxqb0.n.iG(azzd0);
                    this.a = dyna0;
                    this.b = 2;
                    object3 = fsdk.a(evql1, this);
                    if(object3 == object1) {
                        return object1;
                    }
                    object2 = dyna0;
                label_83:
                    dxqb dxqb1 = this.c;
                    if(ibnw.b(object3)) {
                        ProtoSafeParcelable protoSafeParcelable0 = (ProtoSafeParcelable)object3;
                        ibuq.c(object2);
                        dxqb1.r(((dyna)object2));
                        dxqb1.i(new Intent());
                    }
                    Throwable throwable0 = ibnw.a(object3);
                    if(throwable0 != null) {
                        dxmi.q(dxqb1, dxsy.f(throwable0), null, null, 6);
                        return ibom.a;
                    }
                }
                break;
            }
            case 1: {
                object6 = this.a;
                ibnx.b(object0);
                object5 = ((ibnw)object0).a;
            label_98:
                dxqb dxqb2 = this.c;
                if(ibnw.b(object5)) {
                    ftok ftok0 = (ftok)object5;
                    ibuq.c(object6);
                    dxqb2.r(((dyna)object6));
                    dxqb2.i(new Intent());
                }
                Throwable throwable1 = ibnw.a(object5);
                if(throwable1 != null) {
                    dxmi.q(dxqb2, dxsy.f(throwable1), null, null, 6);
                    return ibom.a;
                }
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                goto label_83;
            }
        }
        return ibom.a;
    }
}

