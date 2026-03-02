import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.List;

public final class ebtu implements ibts {
    public final ebtx a;
    public final ficj b;

    public ebtu(ebtx ebtx0, ficj ficj0) {
        this.a = ebtx0;
        this.b = ficj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyhc.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((dyhc)hftp0.b_message).b);
        ibuq.e(list0, "getMfiCardsList(...)");
        new hfxu(list0);
        ibuq.c(((gged_interceptors)object0));
        ibuq.f(((gged_interceptors)object0), "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyhc dyhc0 = (dyhc)hftp0.b_message;
        hfuo hfuo0 = dyhc0.b;
        if(!hfuo0.c()) {
            dyhc0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(((gged_interceptors)object0), dyhc0.b);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyhc)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyhc)hftv0).getClass();
        dyfy0.c = (dyhc)hftv0;
        dyfy0.b = 13;
        byte[] arr_b = dyga0.a().toBytesArray();
        this.a.c.b(status0, arr_b);
        this.b.c(1);
        this.b.close();
        return ibom.a;
    }
}

