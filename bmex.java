import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bmex implements azys {
    public final bmfn a;
    public final bmgg b;
    public final PublicKeyCredentialRequestOptions c;

    public bmex(bmfn bmfn0, bmgg bmgg0, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0) {
        this.a = bmfn0;
        this.b = bmgg0;
        this.c = publicKeyCredentialRequestOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfh bmfh0 = new bmfh(this.a, ((evqp)object1));
        bmgc bmgc0 = new bmgc(this.a, this.b, bmnu0);
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.k(this.a.a.toString(), bmfh0, this.c, bmgc0, apiMetadata0);
    }
}

