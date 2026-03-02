import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

public final class ahhq implements glzn {
    public final ahia a;
    public final Boolean b;
    public final gged_interceptors c;

    public ahhq(ahia ahia0, Boolean boolean0, gged_interceptors gged0) {
        this.a = ahia0;
        this.b = boolean0;
        this.c = gged0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ahia ahia0 = this.a;
        Boolean boolean0 = this.b;
        if(!((Boolean)object0).booleanValue()) {
            return ahia0.a(boolean0.booleanValue());
        }
        InternalCredentialWrapper internalCredentialWrapper0 = (InternalCredentialWrapper)gggq.r(this.c);
        batl.s(internalCredentialWrapper0.b);
        bxie bxie0 = aeny.a(internalCredentialWrapper0.b);
        String s = (String)MoreObjects.firstNonNull(ahia0.d.g, ahia0.c);
        return glzd.f(ahia0.b.a(bxie0, ahia0.c, internalCredentialWrapper0.a, ahia0.d.f, s, ahia0.d.h), new ahht(ahia0, boolean0.booleanValue(), internalCredentialWrapper0), gmap.a);
    }
}

