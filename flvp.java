import java.security.KeyPair;
import java.security.PublicKey;
import java.util.concurrent.Callable;

public final class flvp implements Callable {
    public final flvq a;
    public final hnxl b;
    public final hnxb c;
    public final gmcd d;
    public final String e;
    public final gmcd f;
    public final gmcd g;

    public flvp(flvq flvq0, hnxl hnxl0, hnxb hnxb0, gmcd gmcd0, String s, gmcd gmcd1, gmcd gmcd2) {
        this.a = flvq0;
        this.b = hnxl0;
        this.c = hnxb0;
        this.d = gmcd0;
        this.e = s;
        this.f = gmcd1;
        this.g = gmcd2;
    }

    @Override
    public final Object call() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.b.getClass();
        ((hnwp)hftv0).c = this.b;
        ((hnwp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwp hnwp0 = (hnwp)hftp0.b_message;
        this.c.getClass();
        hnwp0.d = this.c;
        hnwp0.b |= 2;
        String s = (String)gmbu.r(this.d);
        String s1 = (String)gmbu.r(this.f);
        PublicKey publicKey0 = ((KeyPair)gmbu.r(this.g)).getPublic();
        hnwm hnwm0 = this.a.a(s, this.e, s1, publicKey0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnwp hnwp1 = (hnwp)hftp0.b_message;
        hnwm0.getClass();
        hnwp1.e = hnwm0;
        hnwp1.b |= 4;
        return (hnwp)hftp0.N_build();
    }
}

