import com.google.android.gms.common.api.Status;

public final class ebut implements ibts {
    public final ebuw a;

    public ebut(ebuw ebuw0) {
        this.a = ebuw0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ibuq.c(((Boolean)object0));
        ProtoLiteBuilder hftp0 = dyga0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp0.b_message;
        dyfy0.b = 18;
        dyfy0.c = (Boolean)object0;
        byte[] arr_b = dyga0.a().toBytesArray();
        this.a.c.b(status0, arr_b);
        return ibom.a;
    }
}

