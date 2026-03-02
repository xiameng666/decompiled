import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import j..util.Objects;
import java.security.Signature;
import java.security.SignatureException;

final class blrc implements blrs {
    final Signature a;
    final boolean b;
    final blzp c;
    final byte[] d;
    final blzl e;
    final blre f;
    final blrk g;

    public blrc(blre blre0, blrk blrk0, Signature signature0, boolean z, blzp blzp0, byte[] arr_b, blzl blzl0) {
        this.g = blrk0;
        this.a = signature0;
        this.b = z;
        this.c = blzp0;
        this.d = arr_b;
        this.e = blzl0;
        Objects.requireNonNull(blre0);
        this.f = blre0;
        super();
    }

    @Override  // blrs
    public final void a(bmby bmby0) {
        this.g.a(bmby0);
    }

    @Override  // blrs
    public final void b(bmhg bmhg0) {
        try {
            Signature signature0 = this.a;
            if(signature0 == null && !this.b) {
                evql evql0 = new ajes(AppContextProvider.a()).o(this.c.d(), this.d);
                evql0.b(new blra(evql0, this.g, bmhg0));
                evql0.A(new blrb(this.g));
                return;
            }
            if(signature0 == null && this.b) {
                try {
                    Signature signature1 = ((blqr)this.f.d.get(blzo.a)).b(this.e, null);
                    signature1.update(this.d);
                    byte[] arr_b = signature1.sign();
                    this.g.b(arr_b, bmhg0);
                }
                catch(SignatureException signatureException0) {
                    bmby bmby1 = new bmby(signatureException0);
                    this.g.a(bmby1);
                }
                return;
            }
            try {
                signature0.update(this.d);
                byte[] arr_b1 = signature0.sign();
                this.g.b(arr_b1, bmhg0);
            }
            catch(SignatureException signatureException1) {
                bmby bmby2 = new bmby(signatureException1);
                this.g.a(bmby2);
            }
        }
        catch(bmby bmby0) {
            this.g.a(bmby0);
        }
    }
}

