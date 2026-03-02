import java.util.concurrent.atomic.AtomicReference;

public final class fkzs implements gfsi {
    public final AtomicReference a;

    public fkzs(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((flak)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((flak)object0))));
        for(int v = 0; v < ((flak)((flah)hftp0).b_message).f.size(); ++v) {
            flaj flaj0 = ((flah)hftp0).k(v);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)flaj0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)flaj0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            flaj flaj1 = (flaj)hftp1.b_message;
            flaj1.b &= -5;
            flaj1.e = 0L;
            ((flah)hftp0).o(v, ((flaj)hftp1.N_build()));
        }
        Object object1 = (flak)((ProtoLiteBuilder)(((flah)hftp0))).N_build();
        this.a.set(object1);
        return object1;
    }
}

