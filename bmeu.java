import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

public final class bmeu implements azys {
    public final bmfn a;
    public final PublicKeyCredentialCreationOptions b;
    public final String c;

    public bmeu(bmfn bmfn0, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s) {
        this.a = bmfn0;
        this.b = publicKeyCredentialCreationOptions0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfb bmfb0 = new bmfb(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.d(bmfb0, this.b, this.c, apiMetadata0);
    }
}

