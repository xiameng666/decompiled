import com.google.android.gms.common.api.Status;

public final class ebuc implements ibts {
    public final ebuf a;
    public final ficj b;

    public ebuc(ebuf ebuf0, ficj ficj0) {
        this.a = ebuf0;
        this.b = ficj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ibuq.c(((eczc)object0));
        dygo dygo0 = ((eczc)object0) == eczc.b ? dygo.b : dygo.a;
        ibuq.f(dygo0, "value");
        ProtoLiteBuilder hftp0 = dyga0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp0.b_message;
        dyfy0.c = dygo0.a();
        dyfy0.b = 3;
        byte[] arr_b = dyga0.a().toBytesArray();
        this.a.c.b(status0, arr_b);
        this.b.c(1);
        this.b.close();
        return ibom.a;
    }
}

