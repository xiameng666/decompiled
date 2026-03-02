import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bmej implements azys {
    public final bmen a;
    public final BrowserPublicKeyCredentialRequestOptions b;

    public bmej(bmen bmen0, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0) {
        this.a = bmen0;
        this.b = browserPublicKeyCredentialRequestOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmne bmne0 = (bmne)object0;
        bmem bmem0 = new bmem(this.a, ((evqp)object1));
        bmnk bmnk0 = (bmnk)bmne0.H();
        ApiMetadata apiMetadata0 = cclr.b(bmne0.r);
        bmnk0.a(bmem0, this.b, apiMetadata0);
    }
}

