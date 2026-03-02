import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class ehrs implements gfsi {
    public final AtomicLong a;
    public final AtomicLong b;
    public final AtomicBoolean c;

    public ehrs(AtomicLong atomicLong0, AtomicLong atomicLong1, AtomicBoolean atomicBoolean0) {
        this.a = atomicLong0;
        this.b = atomicLong1;
        this.c = atomicBoolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((ehtw)object0).b & 2) != 0) {
            this.a.set(((ehtw)object0).e);
        }
        if((((ehtw)object0).b & 4) != 0) {
            this.b.set(((ehtw)object0).f);
        }
        if(((ehtw)object0).c) {
            this.c.set(true);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ehtw)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((ehtw)object0))));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ehtw ehtw0 = (ehtw)hftp0.b_message;
            ehtw0.b |= 1;
            ehtw0.c = false;
            return (ehtw)hftp0.N_build();
        }
        return (ehtw)object0;
    }
}

