import java.util.concurrent.atomic.AtomicReference;

public final class bnte implements gfsi {
    public final fqzn a;
    public final boolean b;
    public final AtomicReference c;

    public bnte(fqzn fqzn0, boolean z, AtomicReference atomicReference0) {
        this.a = fqzn0;
        this.b = z;
        this.c = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = gggq.a(((fqzo)object0).b, new bntb());
        if(v >= 0 && !this.b) {
            fqzn fqzn0 = (fqzn)((fqzo)object0).b.get(v);
            this.c.set(fqzn0);
            return (fqzo)object0;
        }
        fqzn fqzn1 = this.a;
        if(v >= 0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzo)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((fqzo)object0))));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fqzo fqzo0 = (fqzo)hftp0.b_message;
            fqzn1.getClass();
            fqzo0.b();
            fqzo0.b.set(v, fqzn1);
            return (fqzo)hftp0.N_build();
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzo)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((fqzo)object0))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fqzo fqzo1 = (fqzo)hftp1.b_message;
        fqzn1.getClass();
        fqzo1.b();
        fqzo1.b.add(fqzn1);
        return (fqzo)hftp1.N_build();
    }
}

