import com.google.location.nearby.direct.client.internal.OperationStatus;
import j..util.Objects;

final class gykf implements gyim {
    final gykk a;

    public gykf(gykk gykk0) {
        Objects.requireNonNull(gykk0);
        this.a = gykk0;
        super();
    }

    @Override  // gyim
    public final void a(MessageLite hfvm0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gygi)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gygi)hfvm0))));
        gykk gykk0 = this.a;
        gyhu gyhu0 = gykk0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gygi gygi0 = (gygi)hftp0.b_message;
        gyhu0.getClass();
        gygi0.c = gyhu0;
        gygi0.b |= 1;
        gygi gygi1 = (gygi)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyiv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyiv)hftv0).c = 8;
        ((gyiv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyiv gyiv0 = (gyiv)hftp1.b_message;
        gygi1.getClass();
        gyiv0.h = gygi1;
        gyiv0.b |= 0x20;
        gykk0.e(new OperationStatus(((gyiv)hftp1.N_build())));
    }
}

