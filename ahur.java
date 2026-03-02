import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahur implements azys {
    public final ahwl a;
    public final String b;
    public final BeginSignInRequest c;
    public final boolean d;

    public ahur(ahwl ahwl0, String s, BeginSignInRequest beginSignInRequest0, boolean z) {
        this.a = ahwl0;
        this.b = s;
        this.c = beginSignInRequest0;
        this.d = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahtq ahtq0 = new ahtq(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.q(ahtq0, this.b, this.c, this.d, apiMetadata0);
    }
}

