import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.Map.-EL;

public final class dxzb implements gfsi {
    public final gged_interceptors a;
    public final gged_interceptors b;

    public dxzb(gged_interceptors gged0, gged_interceptors gged1) {
        this.a = gged0;
        this.b = gged1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dmpz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dmpz)object0))));
        gged_interceptors gged0 = this.a;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged0.get(v1);
            ggdy ggdy0 = new ggdy();
            ggdy0.k(((gged_interceptors)Collection.-EL.stream(this.b).map(new dxzc()).collect(ggaf.a)));
            ggdy0.k(((dmpx)Map.-EL.getOrDefault(DesugarCollections.unmodifiableMap(((dmpz)object0).b), s, dmpx.a)).b);
            gged_interceptors gged1 = ggdy0.h();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dmpx.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dmpx dmpx0 = (dmpx)hftp1.b_message;
            hfuo hfuo0 = dmpx0.b;
            if(!hfuo0.c()) {
                dmpx0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged1, dmpx0.b);
            ((dmpv)hftp0).a(s, ((dmpx)hftp1.N_build()));
        }
        return (dmpz)((ProtoLiteBuilder)(((dmpv)hftp0))).N_build();
    }
}

