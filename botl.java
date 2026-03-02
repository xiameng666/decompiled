import java.util.concurrent.atomic.AtomicReference;

public final class botl implements gfsi {
    public final boul a;
    public final AtomicReference b;

    public botl(boul boul0, AtomicReference atomicReference0) {
        this.a = boul0;
        this.b = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqzc fqzc0 = ((fqzl)object0).y;
        if(fqzc0 == null) {
            fqzc0 = fqzc.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqzc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqzc0));
        boul.y(hftp0, this.a.f.d());
        fqzc fqzc1 = (fqzc)hftp0.N_build();
        this.b.set(fqzc1);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((fqzl)object0))));
        if(!((fqyg)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyg)hftp1))).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)((fqyg)hftp1).b_message;
        fqzc1.getClass();
        fqzl0.y = fqzc1;
        fqzl0.b |= 0x20000;
        return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp1))).N_build();
    }
}

