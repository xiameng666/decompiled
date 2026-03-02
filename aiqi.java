import java.util.concurrent.atomic.AtomicReference;

public final class aiqi implements gfsi {
    public final AtomicReference a;

    public aiqi(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((ajar)object0) != null) {
            this.a.set(((ajar)object0).c);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajar)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((ajar)object0))));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ajar)hftp0.b_message).c = hfvv.a;
            ajap ajap0 = ajap.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ajar)hftp0.b_message).d = ajap0.d;
            ((ajar)hftp0.b_message).b |= 1;
            return (ajar)hftp0.N_build();
        }
        ((ggtj)aiqk.a.i()).x("No buffer data on device!");
        return null;
    }
}

