import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;

public final class bmek implements azys {
    public final bmen a;
    public final BrowserPublicKeyCredentialRequestOptions b;

    public bmek(bmen bmen0, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0) {
        this.a = bmen0;
        this.b = browserPublicKeyCredentialRequestOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmne bmne0 = (bmne)object0;
        bmel bmel0 = new bmel(this.a, ((evqp)object1));
        bmnk bmnk0 = (bmnk)bmne0.H();
        ApiMetadata apiMetadata0 = cclr.b(bmne0.r);
        bmnk0.a(bmel0, this.b, apiMetadata0);
    }
}

