import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bmer implements azys {
    public final bmfn a;
    public final PublicKeyCredentialRequestOptions b;
    public final String c;

    public bmer(bmfn bmfn0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s) {
        this.a = bmfn0;
        this.b = publicKeyCredentialRequestOptions0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfc bmfc0 = new bmfc(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.e(bmfc0, this.b, this.c, apiMetadata0);
    }
}

