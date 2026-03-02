import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bmep implements azys {
    public final bmfn a;
    public final BrowserPublicKeyCredentialRequestOptions b;

    public bmep(bmfn bmfn0, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0) {
        this.a = bmfn0;
        this.b = browserPublicKeyCredentialRequestOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmff bmff0 = new bmff(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.i(this.b, bmff0, apiMetadata0);
    }
}

