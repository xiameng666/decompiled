import com.google.android.gms.common.api.Status;

public final class ebvq implements ibts {
    public final ebvs a;
    public final ficj b;

    public ebvq(ebvs ebvs0, ficj ficj0) {
        this.a = ebvs0;
        this.b = ficj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ibuq.c(((dyig)object0));
        ibuq.f(((dyig)object0), "value");
        ProtoLiteBuilder hftp0 = dyga0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = 2;
        dyfy dyfy0 = (dyfy)hftp0.b_message;
        ((dyig)object0).getClass();
        dyfy0.c = (dyig)object0;
        dyfy0.b = 8;
        byte[] arr_b = dyga0.a().toBytesArray();
        this.a.c.b(status0, arr_b);
        int v1 = dyif.a(((dyig)object0).b);
        if(v1 == 0) {
            throw null;
        }
        if(v1 - 1 != 0) {
            switch(v1 - 1) {
                case 1: {
                    v = 4;
                    break;
                }
                case 2: {
                    v = 6;
                    break;
                }
                default: {
                    if(v1 - 1 != 3) {
                        throw new ibnq();
                    }
                    v = 1;
                    break;
                }
            }
        }
        this.b.c(v - 1);
        this.b.close();
        return ibom.a;
    }
}

