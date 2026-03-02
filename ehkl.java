import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ehkl implements gfsi {
    public final List a;

    public ehkl(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        igyq igyq0 = ((igyu)object0).d;
        if(igyq0 == null) {
            igyq0 = igyq.a;
        }
        ArrayList arrayList0 = new ArrayList(igyq0.b);
        Collections.sort(arrayList0, new ehkm());
        ehkn ehkn0 = new ehkn();
        ehko ehko0 = (ehko)Collections.max(this.a, ehkn0);
        long v = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(ehko0.a);
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= arrayList0.size()) {
                v1 = arrayList0.size();
                break;
            }
            if(v <= ((igyp)arrayList0.get(v1)).c) {
                break;
            }
        }
        arrayList0.subList(0, v1).clear();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((igyu)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((igyu)object0))));
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)igyq0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)igyq0));
        if(!((igyo)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((igyo)hftp1))).ensureMutable();
        }
        ((igyq)((igyo)hftp1).b_message).b = hfvv.a;
        if(!((igyo)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((igyo)hftp1))).ensureMutable();
        }
        igyq igyq1 = (igyq)((igyo)hftp1).b_message;
        igyq1.b();
        hfrj.E(arrayList0, igyq1.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        igyu igyu0 = (igyu)hftp0.b_message;
        igyq igyq2 = (igyq)((ProtoLiteBuilder)(((igyo)hftp1))).N_build();
        igyq2.getClass();
        igyu0.d = igyq2;
        igyu0.b |= 2;
        return (igyu)hftp0.N_build();
    }
}

