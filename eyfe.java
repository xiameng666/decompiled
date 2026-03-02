import j..time.Duration;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class eyfe implements ibts {
    public final gzyo a;
    public final List b;

    public eyfe(gzyo gzyo0, List list0) {
        this.a = gzyo0;
        this.b = list0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ((gzxd)object0).b(gzxz.i);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzyp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzyo gzyo0 = this.a;
        ibuq.f(gzyo0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyp gzyp0 = (gzyp)hftp0.b_message;
        gzyp0.c = gzyo0.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzyn.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        List list0 = DesugarCollections.unmodifiableList(((gzyn)hftp1.b_message).b);
        ibuq.e(list0, "getConnectionDurationsList(...)");
        new hfxu(list0);
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object1: this.b) {
            arrayList0.add(hfyo.a(((Duration)object1)));
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzyn gzyn0 = (gzyn)hftp1.b_message;
        hfuo hfuo0 = gzyn0.b;
        if(!hfuo0.c()) {
            gzyn0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, gzyn0.b);
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzyn)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyp gzyp1 = (gzyp)hftp0.b_message;
        ((gzyn)hftv0).getClass();
        gzyp1.d = (gzyn)hftv0;
        gzyp1.b |= 1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gzyp)hftv1), "value");
        ProtoLiteBuilder hftp2 = ((gzxd)object0).a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp2.b_message;
        ((gzyp)hftv1).getClass();
        gzzc0.d = (gzyp)hftv1;
        gzzc0.c = 9;
        return ibom.a;
    }
}

