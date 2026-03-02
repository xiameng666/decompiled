import java.util.List;

public final class bwtm implements gfsi {
    public final List a;

    public bwtm(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        List list0 = this.a;
        bwne.b("Writing %d client cache records", Integer.valueOf(list0.size()));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((bwla)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((bwla)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bwla)hftp0.b_message).b = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwla bwla0 = (bwla)hftp0.b_message;
        hfuo hfuo0 = bwla0.b;
        if(!hfuo0.c()) {
            bwla0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, bwla0.b);
        return (bwla)hftp0.N_build();
    }
}

