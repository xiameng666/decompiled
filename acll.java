import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class acll implements Callable {
    public final ArrayList a;
    public final List b;
    public final ProtoLiteBuilder c;

    public acll(ArrayList arrayList0, ProtoLiteBuilder hftp0, List list0) {
        this.a = arrayList0;
        this.c = hftp0;
        this.b = list0;
    }

    @Override
    public final Object call() {
        ProtoLiteBuilder hftp0;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        int v1 = 0;
        for(int v2 = 0; true; ++v2) {
            hftp0 = this.c;
            if(v1 >= v) {
                break;
            }
            String s = ((aclv)gmbu.r(((gmcd)arrayList0.get(v1)))).a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acmm.a).v_newBuilder();
            hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s.getClass();
            ((acmm)hftv0).b |= 1;
            ((acmm)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            acmm acmm0 = (acmm)hftp1.b_message;
            hfwn0.getClass();
            acmm0.d = hfwn0;
            acmm0.b |= 2;
            hftp0.bk(((String)this.b.get(v2)), ((acmm)hftp1.N_build()));
            ++v1;
        }
        return (acmr)hftp0.N_build();
    }
}

