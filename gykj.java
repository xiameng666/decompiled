import com.google.location.nearby.direct.client.internal.OperationStatus;
import j..util.Objects;

final class gykj implements gyim {
    final gykk a;

    public gykj(gykk gykk0) {
        Objects.requireNonNull(gykk0);
        this.a = gykk0;
        super();
    }

    @Override  // gyim
    public final void a(MessageLite hfvm0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gyic)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gyic)hfvm0))));
        gykk gykk0 = this.a;
        gyhu gyhu0 = gykk0.a();
        if(!((gyib)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gyib)hftp0))).ensureMutable();
        }
        gyic gyic0 = (gyic)((gyib)hftp0).b_message;
        gyhu0.getClass();
        gyic0.c = gyhu0;
        gyic0.b |= 1;
        gyic gyic1 = (gyic)((ProtoLiteBuilder)(((gyib)hftp0))).N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyiv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyiv)hftv0).c = 5;
        ((gyiv)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyiv gyiv0 = (gyiv)hftp1.b_message;
        gyic1.getClass();
        gyiv0.g = gyic1;
        gyiv0.b |= 16;
        gykk0.e(new OperationStatus(((gyiv)hftp1.N_build())));
    }
}

