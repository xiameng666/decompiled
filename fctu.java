import java.util.concurrent.atomic.AtomicReference;

public final class fctu implements gfsi {
    public final AtomicReference a;

    public fctu(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffck.a).v_newBuilder();
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfwn0.getClass();
        ((ffck)hftv0).c = hfwn0;
        ((ffck)hftv0).b |= 1;
        long v = ((ffck)object0).d + 1L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffck ffck0 = (ffck)hftp0.b_message;
        ffck0.b |= 2;
        ffck0.d = v;
        Object object1 = (ffck)hftp0.N_build();
        this.a.set(object1);
        return object1;
    }
}

