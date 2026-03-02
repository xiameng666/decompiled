import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class buue implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjaq.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjan.a).v_newBuilder();
        hjak hjak0 = hjak.s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hjan)hftv0).c = hjak0.u;
        ((hjan)hftv0).b |= 1;
        hjam hjam0 = hjam.h;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hjan)hftp1.b_message).d = hjam0.i;
        ((hjan)hftp1.b_message).b |= 2;
        hjan hjan0 = (hjan)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hjan0.getClass();
        ((hjaq)hftv1).f = hjan0;
        ((hjaq)hftv1).b |= 0x400;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hjaq)hftp0.b_message).c = 2;
        ((hjaq)hftp0.b_message).b |= 2;
        Object object0 = hftp0.N_build();
        ibuq.e(object0, "build(...)");
        Preconditions.f(object0);
        return object0;
    }
}

