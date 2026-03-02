import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahuq implements azys {
    public final ahwl a;
    public final InternalSignInCredentialWrapper b;
    public final CallingAppInfoCompat c;
    public final String d;

    public ahuq(ahwl ahwl0, InternalSignInCredentialWrapper internalSignInCredentialWrapper0, CallingAppInfoCompat callingAppInfoCompat0, String s) {
        this.a = ahwl0;
        this.b = internalSignInCredentialWrapper0;
        this.c = callingAppInfoCompat0;
        this.d = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahwd ahwd0 = new ahwd(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.H(ahwd0, this.b, this.c, this.d, apiMetadata0);
    }
}

