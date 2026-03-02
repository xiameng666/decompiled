import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

abstract class blpl implements blpi {
    protected PrivateKey a;
    private Signature b;

    protected blpl(PrivateKey privateKey0) {
        this.a = privateKey0;
        this.b = null;
    }

    @Override  // blpi
    public long a() {
        return -11644473600000L;
    }

    @Override  // blpi
    public gfsx c() {
        return gfqx.a;
    }

    @Override  // blpi
    public final gfsx d() {
        return gfsx.l(this.b);
    }

    @Override  // blpi
    public gfsx e() {
        return gfqx.a;
    }

    @Override  // blpi
    public gmcd g(byte[] arr_b) {
        batl.s(this.b);
        try {
            this.b.update(arr_b);
            byte[] arr_b1 = this.b.sign();
            this.b = null;
            return gmbu.i(arr_b1);
        }
        catch(SignatureException signatureException0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = signatureException0;
            bxly0.b = "Failed to sign the data.";
            throw bxly0.a();
        }
    }

    @Override  // blpi
    public void i() {
    }

    @Override  // blpi
    public void j() {
        batl.b(this.b == null);
        try {
            Signature signature0 = Signature.getInstance("SHA256withECDSA");
            this.b = signature0;
            PrivateKey privateKey0 = this.a;
            batl.s(privateKey0);
            signature0.initSign(privateKey0);
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Failed to initialize the signature.";
            throw bxly0.a();
        }
    }

    @Override  // blpi
    public final boolean m() {
        return false;
    }

    @Override  // blpi
    public boolean o() {
        return false;
    }
}

