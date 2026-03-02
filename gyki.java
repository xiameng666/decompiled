import com.google.location.nearby.direct.client.internal.OperationStatus;
import j..util.Objects;

final class gyki implements gyim {
    final gykk a;

    public gyki(gykk gykk0) {
        Objects.requireNonNull(gykk0);
        this.a = gykk0;
        super();
    }

    @Override  // gyim
    public final void a(MessageLite hfvm0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gygm)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gygm)hfvm0))));
        gykk gykk0 = this.a;
        gyhu gyhu0 = gykk0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gygm gygm0 = (gygm)hftp0.b_message;
        gyhu0.getClass();
        gygm0.c = gyhu0;
        gygm0.b |= 1;
        gygm gygm1 = (gygm)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyiv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyiv)hftv0).c = 4;
        ((gyiv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyiv gyiv0 = (gyiv)hftp1.b_message;
        gygm1.getClass();
        gyiv0.f = gygm1;
        gyiv0.b |= 8;
        gykk0.e(new OperationStatus(((gyiv)hftp1.N_build())));
    }
}

