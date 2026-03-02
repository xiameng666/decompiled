import java.util.concurrent.atomic.AtomicReference;

public final class boxw implements gfsi {
    public final boxz a;
    public final AtomicReference b;

    public boxw(boxz boxz0, AtomicReference atomicReference0) {
        this.a = boxz0;
        this.b = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqyp fqyp0 = ((fqzl)object0).f;
        if(fqyp0 == null) {
            fqyp0 = fqyp.b;
        }
        int v = fqyo.a(fqyp0.e) == 0 ? 1 : fqyo.a(fqyp0.e);
        if(v != 2 && v != 4) {
            return (fqzl)object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqyp0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqyp0));
        if(!((fqym)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqym)hftp0))).ensureMutable();
        }
        ((fqyp)((fqym)hftp0).b_message).e = (v == 4 ? 10 : 9) - 1;
        ((fqyp)((fqym)hftp0).b_message).c |= 2;
        hfwn hfwn0 = hfyg.b(this.a.c.d());
        if(!((fqym)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqym)hftp0))).ensureMutable();
        }
        fqyp fqyp1 = (fqyp)((fqym)hftp0).b_message;
        hfwn0.getClass();
        fqyp1.d = hfwn0;
        fqyp1.c |= 1;
        fqyp fqyp2 = (fqyp)((ProtoLiteBuilder)(((fqym)hftp0))).N_build();
        this.b.set(fqyp2);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzl)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((fqzl)object0))));
        if(!((fqyg)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyg)hftp1))).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)((fqyg)hftp1).b_message;
        fqyp2.getClass();
        fqzl0.f = fqyp2;
        fqzl0.b |= 2;
        return (fqzl)((ProtoLiteBuilder)(((fqyg)hftp1))).N_build();
    }
}

