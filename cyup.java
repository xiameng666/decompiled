import j..util.DesugarCollections;
import java.util.ArrayList;

public final class cyup implements gfsi {
    public final cyex a;

    public cyup(cyex cyex0) {
        this.a = cyex0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        cyex cyex0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyez)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyez)object0))));
        for(int v = 0; true; ++v) {
            cyex0 = this.a;
            if(v >= ((cyez)((cyey)hftp0).b_message).b.size()) {
                break;
            }
            if(cyex0.c == ((cyey)hftp0).a(v).c) {
                ((cyey)hftp0).m(v);
                break;
            }
        }
        long v1 = System.currentTimeMillis();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: DesugarCollections.unmodifiableList(((cyez)((cyey)hftp0).b_message).b)) {
            cyex cyex1 = (cyex)object1;
            if(v1 >= cyex1.d && v1 <= cyex1.e) {
                arrayList0.add(cyex1);
            }
        }
        if(!((cyey)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cyey)hftp0))).ensureMutable();
        }
        ((cyez)((cyey)hftp0).b_message).b = hfvv.a;
        ((cyey)hftp0).l(arrayList0);
        ((cyey)hftp0).k(cyex0);
        return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
    }
}

