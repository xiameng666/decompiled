import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
public final class blro {
    private static final bboh a;
    private final Context b;
    private final long c;
    private bmcc d;
    private final azts e;

    static {
        blro.a = bnaa.e("SafetyNetAttestationClient");
    }

    public blro(Context context0, long v) {
        azts azts0 = new azts(context0, null);
        super();
        this.b = context0;
        this.e = azts0;
        this.c = v;
    }

    public final bmcc a() {
        bmcc bmcc0 = this.d;
        if(bmcc0 != null) {
            return bmcc0;
        }
        throw new bmby("Failed to get attestation statement.");
    }

    public final void b(byte[] arr_b, byte[] arr_b1) {
        try {
            byte[] arr_b2 = blzb.a().digest(glwl.d(new byte[][]{arr_b, arr_b1}));
            if(arr_b2 != null && arr_b2.length >= 16) {
                azui azui0 = (azui)evrg.o(this.e.bN(arr_b2), this.c, TimeUnit.MILLISECONDS);
                if(azui0 == null) {
                    ((ggtj)blro.a.i()).x("The SafetyNet attestation result is null");
                    this.c();
                    return;
                }
                String s = azui0.f();
                if(s == null) {
                    ((ggtj)blro.a.i()).x("JWS result returned from SafetyNet attestation was empty");
                    this.d = null;
                    return;
                }
                this.d = new bmcc(String.valueOf(azqk.a(this.b)), s.getBytes());
                return;
            }
            ((ggtj)blro.a.i()).x("The nonce for SafetyNet attestation is not valid");
            this.c();
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            a.ae(blro.a.i(), "SafetyNet attestation failed", exception0);
            this.c();
        }
    }

    private final void c() {
        ((ggtj)blro.a.i()).x("SafetyNet verification has failed");
        this.d = null;
    }
}

