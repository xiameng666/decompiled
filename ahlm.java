import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.BiometricPromptUiOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;

public final class ahlm {
    public PublicKeyCredentialRequestOptions a;
    public BrowserOptions b;
    public kvt c;
    public ResultReceiver d;
    private String e;
    private String f;
    private bxnm g;
    private boolean h;
    private long i;
    private BiometricPromptUiOptions j;
    private byte k;

    public ahlm() {
    }

    public ahlm(AuthenticationOptions authenticationOptions0) {
        this.a = authenticationOptions0.a;
        this.e = authenticationOptions0.b;
        this.f = authenticationOptions0.c;
        this.b = authenticationOptions0.d;
        this.g = authenticationOptions0.e;
        this.c = authenticationOptions0.f;
        this.h = authenticationOptions0.g;
        this.i = authenticationOptions0.h;
        this.d = authenticationOptions0.i;
        this.j = authenticationOptions0.j;
        this.k = 3;
    }

    public final AuthenticationOptions a() {
        gfsx gfsx0 = (this.k & 2) == 0 ? gfqx.a : gfsx.m(Long.valueOf(this.i));
        if(!gfsx0.i()) {
            this.f(System.currentTimeMillis());
        }
        if(this.k == 3) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = this.a;
            if(publicKeyCredentialRequestOptions0 != null) {
                String s = this.e;
                if(s != null) {
                    String s1 = this.f;
                    if(s1 != null) {
                        bxnm bxnm0 = this.g;
                        if(bxnm0 != null) {
                            return new AuthenticationOptions(publicKeyCredentialRequestOptions0, s, s1, this.b, bxnm0, this.c, this.h, this.i, this.d, this.j);
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" publicKeyCredentialRequestOptions");
        }
        if(this.e == null) {
            stringBuilder0.append(" sessionId");
        }
        if(this.f == null) {
            stringBuilder0.append(" callingPackage");
        }
        if(this.g == null) {
            stringBuilder0.append(" invocationType");
        }
        if((this.k & 1) == 0) {
            stringBuilder0.append(" hasValidatedRp");
        }
        if((this.k & 2) == 0) {
            stringBuilder0.append(" startTime");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(String s) {
        if(s == null) {
            throw new NullPointerException("Null callingPackage");
        }
        this.f = s;
    }

    public final void c(boolean z) {
        this.h = z;
        this.k = (byte)(this.k | 1);
    }

    public final void d(bxnm bxnm0) {
        if(bxnm0 == null) {
            throw new NullPointerException("Null invocationType");
        }
        this.g = bxnm0;
    }

    public final void e(String s) {
        if(s == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.e = s;
    }

    public final void f(long v) {
        this.i = v;
        this.k = (byte)(this.k | 2);
    }
}

