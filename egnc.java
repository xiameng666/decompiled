import java.util.Set;

public final class egnc implements gfsi {
    public final Set a;

    public egnc(Set set0) {
        this.a = set0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)egnm.a).v_newBuilder();
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((egnm)hftv0).c = hfwn0;
        ((egnm)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        egnm egnm0 = (egnm)hftp0.b_message;
        hfuf hfuf0 = egnm0.d;
        if(!hfuf0.c()) {
            egnm0.d = ProtoLiteMessage.C(hfuf0);
        }
        Set set0 = this.a;
        hfrj.E(set0, egnm0.d);
        egnm egnm1 = (egnm)hftp0.N_build();
        int v = ((egnn)object0).b.size();
        if(v > 0) {
            ggfp ggfp0 = ggfp.G(((egnm)((egnn)object0).b.get(v - 1)).d);
            gftb.z(set0, "set1");
            gftb.z(ggfp0, "set2");
            if(new ggoa(set0, ggfp0).isEmpty()) {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((egnn)object0))).jf(5, null);
                hftp1.X(((ProtoLiteMessage)(((egnn)object0))));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                egnn egnn0 = (egnn)hftp1.b_message;
                egnm1.getClass();
                egnn0.b();
                egnn0.b.set(v - 1, egnm1);
                return (egnn)hftp1.N_build();
            }
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((egnn)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((egnn)object0))));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        egnn egnn1 = (egnn)hftp2.b_message;
        egnm1.getClass();
        egnn1.b();
        egnn1.b.add(egnm1);
        return (egnn)hftp2.N_build();
    }
}

