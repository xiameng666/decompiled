import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bmes implements azys {
    public final bmfn a;
    public final BrowserPublicKeyCredentialRequestOptions b;
    public final String c;
    public final boolean d;

    public bmes(bmfn bmfn0, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, String s, boolean z) {
        this.a = bmfn0;
        this.b = browserPublicKeyCredentialRequestOptions0;
        this.c = s;
        this.d = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfj bmfj0 = new bmfj(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.h(bmfj0, this.b, this.c, this.d, apiMetadata0);
    }
}

