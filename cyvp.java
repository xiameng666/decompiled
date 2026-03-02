import java.util.ArrayList;
import java.util.List;

public final class cyvp implements gfsi {
    public final List a;

    public cyvp(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((cyxt)object0).c) {
            cyxs cyxs0 = (cyxs)object1;
            if(!this.a.contains(cyxs0.d)) {
                arrayList0.add(cyxs0);
            }
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyxt)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyxt)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((cyxt)hftp0.b_message).c = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cyxt cyxt0 = (cyxt)hftp0.b_message;
        cyxt0.b();
        hfrj.E(arrayList0, cyxt0.c);
        return (cyxt)hftp0.N_build();
    }
}

