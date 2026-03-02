import java.util.List;

public final class ejzf implements gfsi {
    public final List a;

    public ejzf(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ejyo)hftp0.b_message).j = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        hfuo hfuo0 = ejyo0.j;
        if(!hfuo0.c()) {
            ejyo0.j = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, ejyo0.j);
        return (ejyo)hftp0.N_build();
    }
}

