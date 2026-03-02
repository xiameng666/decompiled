import android.accounts.Account;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.BiometricPromptUiOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;

public final class ahna {
    public PublicKeyCredentialCreationOptions a;
    public BrowserOptions b;
    public Account c;
    public kvt d;
    public Boolean e;
    public ResultReceiver f;
    private String g;
    private String h;
    private bxnm i;
    private long j;
    private BiometricPromptUiOptions k;
    private byte l;

    public ahna() {
    }

    public ahna(RegistrationOptions registrationOptions0) {
        this.a = registrationOptions0.a;
        this.g = registrationOptions0.b;
        this.h = registrationOptions0.c;
        this.b = registrationOptions0.d;
        this.c = registrationOptions0.e;
        this.i = registrationOptions0.f;
        this.d = registrationOptions0.g;
        this.e = Boolean.valueOf(registrationOptions0.h);
        this.j = registrationOptions0.i;
        this.f = registrationOptions0.j;
        this.k = registrationOptions0.k;
        this.l = 1;
    }

    public final RegistrationOptions a() {
        gfsx gfsx0 = this.l == 0 ? gfqx.a : gfsx.m(Long.valueOf(this.j));
        if(!gfsx0.i()) {
            this.e(System.currentTimeMillis());
        }
        if(this.l == 1) {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = this.a;
            if(publicKeyCredentialCreationOptions0 != null) {
                String s = this.g;
                if(s != null) {
                    String s1 = this.h;
                    if(s1 != null) {
                        bxnm bxnm0 = this.i;
                        if(bxnm0 != null) {
                            Boolean boolean0 = this.e;
                            if(boolean0 != null) {
                                return new RegistrationOptions(publicKeyCredentialCreationOptions0, s, s1, this.b, this.c, bxnm0, this.d, boolean0, this.j, this.f, this.k);
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" publicKeyCredentialCreationOptions");
        }
        if(this.g == null) {
            stringBuilder0.append(" sessionId");
        }
        if(this.h == null) {
            stringBuilder0.append(" callingPackage");
        }
        if(this.i == null) {
            stringBuilder0.append(" invocationType");
        }
        if(this.e == null) {
            stringBuilder0.append(" hasValidatedRp");
        }
        if(this.l == 0) {
            stringBuilder0.append(" startTime");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null callingPackage");
        }
        this.h = s;
    }

    public final void c(bxnm bxnm0) {
        if(bxnm0 == null) {
            throw new NullPointerException("Null invocationType");
        }
        this.i = bxnm0;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.g = s;
    }

    public final void e(long v) {
        this.j = v;
        this.l = 1;
    }
}

