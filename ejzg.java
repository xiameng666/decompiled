import java.util.Set;

public final class ejzg implements gfsi {
    public final Set a;

    public ejzg(Set set0) {
        this.a = set0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ejyo)hftp0.b_message).m = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        hfuo hfuo0 = ejyo0.m;
        if(!hfuo0.c()) {
            ejyo0.m = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, ejyo0.m);
        return (ejyo)hftp0.N_build();
    }
}

