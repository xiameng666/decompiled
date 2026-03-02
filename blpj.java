import android.content.Context;
import android.security.keystore.KeyInfo;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

public class blpj implements blpi {
    private final bmco a;
    private final byte[] b;
    private final String c;
    private final KeyInfo d;
    private final boolean e;
    private Signature f;

    public blpj(Context context0, byte[] arr_b, String s, boolean z) {
        gftb.check(context0);
        gftb.check(arr_b);
        gftb.check(s);
        this.a = new bmdz(context0);
        this.b = arr_b;
        this.c = s;
        this.d = blpt.c(s);
        this.e = z;
        this.f = null;
    }

    public blpj(bmco bmco0, byte[] arr_b, String s, KeyInfo keyInfo0) {
        gftb.check(arr_b);
        gftb.check(keyInfo0);
        this.a = bmco0;
        this.b = arr_b;
        this.c = s;
        this.d = keyInfo0;
        this.e = false;
        this.f = null;
    }

    @Override  // blpi
    public final long a() {
        return -11644473600000L;
    }

    @Override  // blpi
    public final gfsx b() {
        return gfqx.a;
    }

    @Override  // blpi
    public final gfsx c() {
        return gfqx.a;
    }

    @Override  // blpi
    public final gfsx d() {
        return gfsx.l(this.f);
    }

    @Override  // blpi
    public gfsx e() {
        return gfqx.a;
    }

    @Override  // blpi
    public gmcd f() {
        this.a.c(this.c, System.currentTimeMillis());
        return fhra.b(this.a.b(this.c));
    }

    @Override  // blpi
    public final gmcd g(byte[] arr_b) {
        if(!this.s()) {
            gftb.checkTrue(this.f == null);
            try {
                Signature signature0 = Signature.getInstance("SHA256withECDSA");
                this.f = signature0;
                signature0.initSign(blpt.a(this.c));
            }
            catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = exception0;
                bxly0.b = "Failed to init the signature.";
                throw bxly0.a();
            }
        }
        gftb.check(this.f);
        try {
            this.f.update(arr_b);
            return gmbu.i(this.f.sign());
        }
        catch(SignatureException signatureException0) {
            bxly bxly1 = new bxly();
            bxly1.a = 8;
            bxly1.c = signatureException0;
            bxly1.b = "Failed to sign the data.";
            throw bxly1.a();
        }
    }

    @Override  // blpi
    public final PublicKey h() {
        PublicKey publicKey0 = blpt.b(this.c);
        if(publicKey0 != null) {
            return publicKey0;
        }
        bxly bxly0 = new bxly();
        bxly0.a = 8;
        bxly0.b = "Failed to get the public key.";
        throw bxly0.a();
    }

    @Override  // blpi
    public final void i() {
    }

    @Override  // blpi
    public final void j() {
        gftb.checkTrue(this.f == null);
        if(this.s()) {
            try {
                Signature signature0 = Signature.getInstance("SHA256withECDSA");
                this.f = signature0;
                signature0.initSign(blpt.a(this.c));
            }
            catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = exception0;
                bxly0.b = "Failed to init the signature.";
                throw bxly0.a();
            }
        }
    }

    @Override  // blpi
    public final boolean k() {
        return this.d.isUserAuthenticationRequired() && this.d.getUserAuthenticationValidityDurationSeconds() <= 0;
    }

    @Override  // blpi
    public boolean l() {
        return false;
    }

    @Override  // blpi
    public final boolean m() {
        return false;
    }

    @Override  // blpi
    public boolean n() {
        return false;
    }

    @Override  // blpi
    public final boolean o() {
        return false;
    }

    @Override  // blpi
    public boolean p() {
        return this.e;
    }

    @Override  // blpi
    public final boolean q() {
        return this.d.isTrustedUserPresenceRequired();
    }

    @Override  // blpi
    public final byte[] r() {
        return this.b;
    }

    private final boolean s() {
        return this.q() || this.k();
    }
}

