import j..time.Instant;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Locale;
import java.util.concurrent.Callable;

public final class flvm implements Callable {
    public final flvq a;
    public final hnxl b;
    public final Instant c;
    public final KeyPair d;
    public final hnxb e;
    public final gmcd f;
    public final String g;

    public flvm(flvq flvq0, hnxl hnxl0, Instant instant0, KeyPair keyPair0, hnxb hnxb0, gmcd gmcd0, String s) {
        this.a = flvq0;
        this.b = hnxl0;
        this.c = instant0;
        this.d = keyPair0;
        this.e = hnxb0;
        this.f = gmcd0;
        this.g = s;
    }

    @Override
    public final Object call() {
        hnxl hnxl0 = this.b;
        String s = flwn.a(hnxl0.d).toString();
        String s1 = String.format(Locale.US, "%s:%d", s.toLowerCase(Locale.US), glxs.a(this.c));
        KeyPair keyPair0 = this.d;
        ByteString hfsf0 = flck.a(s1, keyPair0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwn.a).v_newBuilder();
        long v = glxs.a(this.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnwn)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hnxl0.getClass();
        ((hnwn)hftv1).c = hnxl0;
        ((hnwn)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwn hnwn0 = (hnwn)hftp0.b_message;
        this.e.getClass();
        hnwn0.d = this.e;
        hnwn0.b |= 2;
        String s2 = (String)gmbu.r(this.f);
        PublicKey publicKey0 = keyPair0.getPublic();
        hnwm hnwm0 = this.a.a(s2, this.g, null, publicKey0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        hnwm0.getClass();
        ((hnwn)hftv2).h = hnwm0;
        ((hnwn)hftv2).b |= 4;
        if(hfsf0 == null) {
            return (hnwn)hftp0.N_build();
        }
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hnwn)hftv3).f = 2;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnwn)hftp0.b_message).g = hfsf0;
        return (hnwn)hftp0.N_build();
    }
}

