import j..util.Objects;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Date;

final class blqz implements blrs {
    final blzl a;
    final byte[] b;
    final blre c;
    final blrk d;

    public blqz(blre blre0, blrk blrk0, blzl blzl0, byte[] arr_b) {
        this.d = blrk0;
        this.a = blzl0;
        this.b = arr_b;
        Objects.requireNonNull(blre0);
        this.c = blre0;
        super();
    }

    @Override  // blrs
    public final void a(bmby bmby0) {
        this.d.a(bmby0);
    }

    @Override  // blrs
    public final void b(bmhg bmhg0) {
        byte[] arr_b;
        Signature signature0;
        blzl blzl0;
        blre blre0;
        try {
            try {
                blre0 = this.c;
                blzl0 = this.a;
                if(blre0.e.containsKey(blzl0)) {
                    signature0 = (Signature)blre0.e.remove(blzl0);
                    goto label_14;
                }
            }
            catch(blqp exception0) {
                goto label_20;
            }
            try {
                arr_b = blzl0.getClass() == blzn.class ? blre0.b.g(blzl0) : null;
                goto label_12;
            }
            catch(blqp blqp0) {
                try {
                    throw new bmby("Credential metadata does not exist", blqp0);
                label_12:
                    blzo blzo0 = blzl0.a();
                    signature0 = ((blqr)blre0.d.get(blzo0)).b(blzl0, arr_b);
                label_14:
                    signature0.update(this.b);
                    byte[] arr_b1 = signature0.sign();
                    this.c.b.d(this.a, new Date(System.currentTimeMillis()));
                    this.d.b(arr_b1, bmhg0);
                }
                catch(blqp exception0) {
                    goto label_20;
                }
            }
        }
        catch(SignatureException exception0) {
        label_20:
            bmby bmby1 = new bmby(exception0);
            this.d.a(bmby1);
        }
        catch(bmby bmby0) {
            this.d.a(bmby0);
        }
    }
}

