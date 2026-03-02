import java.util.List;

public final class fhfj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hggq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hggq hggq0 = (hggq)hftp0.b_message;
        hfuo hfuo0 = hggq0.b;
        if(!hfuo0.c()) {
            hggq0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(((List)object0), hggq0.b);
        return (hggq)hftp0.N_build();
    }
}

