import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;

public final class bmeq implements azys {
    public final bmfn a;
    public final BrowserPublicKeyCredentialCreationOptions b;
    public final String c;
    public final boolean d;

    public bmeq(bmfn bmfn0, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0, String s, boolean z) {
        this.a = bmfn0;
        this.b = browserPublicKeyCredentialCreationOptions0;
        this.c = s;
        this.d = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfk bmfk0 = new bmfk(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.g(bmfk0, this.b, this.c, this.d, apiMetadata0);
    }
}

