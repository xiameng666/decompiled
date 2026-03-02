import java.util.concurrent.atomic.AtomicInteger;

public final class eroq implements gfsi {
    public final AtomicInteger a;

    public eroq(AtomicInteger atomicInteger0) {
        this.a = atomicInteger0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        AtomicInteger atomicInteger0 = this.a;
        if((((eqog)object0).b & 1) == 0) {
            atomicInteger0.set(1);
        }
        else {
            atomicInteger0.set(((eqog)object0).c + 1);
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eqog)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eqog)object0))));
        int v = atomicInteger0.get();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqog eqog0 = (eqog)hftp0.b_message;
        eqog0.b |= 1;
        eqog0.c = v;
        return (eqog)hftp0.N_build();
    }
}

