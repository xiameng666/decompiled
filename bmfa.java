import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;

public final class bmfa implements azys {
    public final bmfn a;
    public final BrowserPublicKeyCredentialCreationOptions b;

    public bmfa(bmfn bmfn0, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0) {
        this.a = bmfn0;
        this.b = browserPublicKeyCredentialCreationOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfd bmfd0 = new bmfd(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.a(bmfd0, this.b, apiMetadata0);
    }
}

