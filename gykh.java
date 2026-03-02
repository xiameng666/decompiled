import com.google.location.nearby.direct.client.internal.OperationStatus;
import j..util.Objects;

final class gykh implements gyim {
    final gykk a;

    public gykh(gykk gykk0) {
        Objects.requireNonNull(gykk0);
        this.a = gykk0;
        super();
    }

    @Override  // gyim
    public final void a(MessageLite hfvm0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gyig)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gyig)hfvm0))));
        gykk gykk0 = this.a;
        gyhu gyhu0 = gykk0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyig gyig0 = (gyig)hftp0.b_message;
        gyhu0.getClass();
        gyig0.c = gyhu0;
        gyig0.b |= 1;
        gyig gyig1 = (gyig)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyiv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyiv)hftv0).c = 3;
        ((gyiv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyiv gyiv0 = (gyiv)hftp1.b_message;
        gyig1.getClass();
        gyiv0.e = gyig1;
        gyiv0.b |= 4;
        gykk0.e(new OperationStatus(((gyiv)hftp1.N_build())));
    }
}

