import java.util.List;

public final class badl implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)abzh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        abzh abzh0 = (abzh)hftp0.b_message;
        hfuo hfuo0 = abzh0.b;
        if(!hfuo0.c()) {
            abzh0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(((List)object0), abzh0.b);
        return (abzh)hftp0.N_build();
    }
}

