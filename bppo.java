import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class bppo implements glzn {
    public final bpqt a;
    public final gtbc b;

    public bppo(bpqt bpqt0, gtbc gtbc0) {
        this.a = bpqt0;
        this.b = gtbc0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        hfuo hfuo0 = this.b.c;
        ggdy ggdy0 = gged_interceptors.e(((gged_interceptors)object0).size());
        bpqt bpqt0 = this.a;
        fqvs fqvs0 = bpqt0.e;
        hfwn hfwn0 = hfyn.j(TimeUnit.MILLISECONDS.toSeconds(fqvs0.a.d().toEpochMilli()) - ((long)(((int)TimeUnit.HOURS.toSeconds(((long)fqvs0.c.c()))))));
        for(int v = 0; v < ((gged_interceptors)object0).size(); ++v) {
            fqva fqva0 = (fqva)((gged_interceptors)object0).get(v);
            hfuo hfuo1 = fqva0.e.b;
            hfwn hfwn1 = ((gtaz)hfuo0.get(v)).g;
            if(hfwn1 == null) {
                hfwn1 = hfwn.a;
            }
            List list0 = ggia.h(hfuo1, new fqvr());
            if(hfym.a(hfwn1, hfwn0) <= 0) {
                hfwn1 = hfwn0;
            }
            int v1 = Collections.binarySearch(list0, hfwn1, hfym.a);
            int v2 = v1 >= 0 ? v1 + 1 : -(v1 + 1);
            if(v2 != hfuo1.size()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtdw.a).v_newBuilder();
                gsyz gsyz0 = fqva0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gtdw gtdw0 = (gtdw)hftp0.b_message;
                gsyz0.getClass();
                gtdw0.c = gsyz0;
                gtdw0.b |= 1;
                gtbq gtbq0 = (gtbq)((ProtoLiteMessage)gtbr.a).v_newBuilder();
                gtbq0.a(hfuo1.subList(v2, hfuo1.size()));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gtdw gtdw1 = (gtdw)hftp0.b_message;
                gtbr gtbr0 = (gtbr)((ProtoLiteBuilder)gtbq0).N_build();
                gtbr0.getClass();
                gtdw1.d = gtbr0;
                gtdw1.b |= 2;
                long v3 = fqva0.g;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gtdw)hftp0.b_message).e = v3;
                ggdy0.i(((gtdw)hftp0.N_build()));
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        return gged0.isEmpty() ? gdtf.j(gmbx.a, new bpqa(((gged_interceptors)object0)), bpqt0.b) : gdtf.j(fqvs0.b.o(gged0), new bpqa(((gged_interceptors)object0)), bpqt0.b);
    }
}

