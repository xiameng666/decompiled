import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class athr implements atia {
    public final ggfn a;
    public boolean b;
    private final atgd c;
    private final ggfn d;

    public athr(atgd atgd0) {
        this.a = new ggfn();
        this.d = new ggfn();
        this.c = atgd0;
    }

    @Override  // atia
    public final void a(atjv atjv0) {
        gftb.r(((boolean)(this.b ^ 1)), "Cannot process chunk after close()");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arar.a).v_newBuilder();
        int v = atjv0.b();
        hftc hftc0 = hftc.a();
        hftp0.Y(atjv0.a, v, hftc0);
        arar arar0 = (arar)hftp0.N_build();
        this.a.i(arar0);
        athu athu0 = this.c.a(atjv0.a);
        this.d.i(athu0);
    }

    @Override  // atia
    public final byte[] b() {
        gftb.r(this.b, "Must close() before getDigest()");
        MessageDigest messageDigest0 = athr.d();
        ggfp ggfp0 = this.d.h();
        gged_interceptors gged0 = gged_interceptors.D(ggmi.a, ggfp0);
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            messageDigest0.update(((athu)gged0.get(v1)).a);
        }
        return messageDigest0.digest();
    }

    @Override  // atia
    public final void c() {
    }

    @Override
    public final void close() {
        this.b = true;
    }

    private static MessageDigest d() {
        try {
            return MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new aqli("Digest unavailable: SHA-256", noSuchAlgorithmException0);
        }
    }
}

