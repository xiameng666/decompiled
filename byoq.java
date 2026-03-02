import android.hardware.biometrics.BiometricPrompt.AuthenticationCallback;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class byoq extends BiometricPrompt.AuthenticationCallback {
    final ibts a;
    final ibtx b;
    final bxzv c;
    final ibts d;
    final ibth e;
    final int f;
    final ibth g;

    public byoq(ibts ibts0, ibtx ibtx0, bxzv bxzv0, ibts ibts1, ibth ibth0, int v, ibth ibth1) {
        this.a = ibts0;
        this.b = ibtx0;
        this.c = bxzv0;
        this.d = ibts1;
        this.e = ibth0;
        this.f = v;
        this.g = ibth1;
        super();
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
        int v4;
        super.onAuthenticationError(v, charSequence0);
        Objects.toString(charSequence0);
        if(this.e.a() == byao.d && v == 5) {
            return;
        }
        this.a.a(byao.c);
        int v1 = this.f;
        List list0 = ibpo.g(new Integer[]{((int)0x80FF), ((int)0x800F), ((int)0xFF), ((int)15)});
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                int v2 = ((Number)object0).intValue() | 0x10000;
                if(!hufl.i()) {
                    if(v2 == v1) {
                        goto label_16;
                    }
                    continue;
                }
                else if(v2 == v1) {
                }
                else {
                    continue;
                }
            label_16:
                int v3 = 1;
                if(hufl.i()) {
                    v4 = v == 7 ? 1 : 0;
                    if(v != 9) {
                        v3 = 0;
                    }
                }
                else {
                    v4 = v == 7 ? 1 : 0;
                    if(v != 9) {
                        v3 = 0;
                    }
                }
                if((v4 | v3) == 0) {
                    break;
                }
                this.g.a();
                return;
            }
        }
        if(v == 10) {
            this.g.a();
            return;
        }
        Log.w("BiometricHandler", "Sending error to provider with error code " + v + " and error string " + charSequence0 + ".");
        byam byam0 = new byam(v, charSequence0);
        this.b.a(this.c, null, byam0);
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationHelp(int v, CharSequence charSequence0) {
        super.onAuthenticationHelp(v, charSequence0);
        Objects.toString(charSequence0);
    }

    @Override  // android.hardware.biometrics.BiometricPrompt$AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0) {
        super.onAuthenticationSucceeded(biometricPrompt$AuthenticationResult0);
        try {
            if(biometricPrompt$AuthenticationResult0 != null) {
                this.a.a(byao.c);
                this.b.a(this.c, biometricPrompt$AuthenticationResult0, null);
                return;
            }
            this.d.a("The biometric flow succeeded but unexpectedly returned a null value.");
        }
        catch(Exception exception0) {
            this.d.a(a.i(exception0, "The biometric flow succeeded but failed on handling the result. See: \n", "\n"));
        }
    }
}

