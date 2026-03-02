import java.util.ArrayList;

public final class cyuq implements gfsi {
    public final kar a;

    public cyuq(kar kar0) {
        this.a = kar0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyez)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyez)object0))));
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < ((cyez)((cyey)hftp0).b_message).b.size(); ++v1) {
            cyex cyex0 = ((cyey)hftp0).a(v1);
            int v2 = cygh.b(cyex0.f) == 0 ? 1 : cygh.b(cyex0.f);
            if(v2 != 3 && v2 != 4 && v2 != 6) {
                arrayList0.add(cyex0);
            }
            else {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)cyex0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)cyex0));
                arrayList1.add(hftp1);
            }
        }
        this.a.accept(arrayList1);
        if(!((cyey)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cyey)hftp0))).ensureMutable();
        }
        ((cyez)((cyey)hftp0).b_message).b = hfvv.a;
        int v3 = arrayList1.size();
        for(int v = 0; v < v3; ++v) {
            ((cyey)hftp0).k(((cyex)((ProtoLiteBuilder)arrayList1.get(v)).N_build()));
        }
        ((cyey)hftp0).l(arrayList0);
        return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
    }
}

