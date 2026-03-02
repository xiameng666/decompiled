import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.common.api.ApiMetadata;

public final class aiaz implements azys {
    public final String a;
    public final VerificationToken b;

    public aiaz(String s, VerificationToken verificationToken0) {
        this.a = s;
        this.b = verificationToken0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        aibd aibd0 = (aibd)object0;
        ahyl ahyl0 = (ahyl)aibd0.H();
        ApiMetadata apiMetadata0 = cclr.a(aibd0.r);
        ((evqp)object1).b(ahyl0.a(this.a, this.b, apiMetadata0));
    }
}

