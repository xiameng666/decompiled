import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

public final class bmet implements azys {
    public final bmfn a;
    public final PublicKeyCredentialCreationOptions b;
    public final String c;
    public final boolean d;

    public bmet(bmfn bmfn0, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s, boolean z) {
        this.a = bmfn0;
        this.b = publicKeyCredentialCreationOptions0;
        this.c = s;
        this.d = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfi bmfi0 = new bmfi(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.b(bmfi0, this.b, this.c, this.d, apiMetadata0);
    }
}

