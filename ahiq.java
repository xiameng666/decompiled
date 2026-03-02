import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

public final class ahiq implements glzn {
    public final ahiw a;
    public final aerq b;
    public final gged_interceptors c;

    public ahiq(ahiw ahiw0, aerq aerq0, gged_interceptors gged0) {
        this.a = ahiw0;
        this.b = aerq0;
        this.c = gged0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ahiw ahiw0 = this.a;
        aerq aerq0 = this.b;
        if(((gged_interceptors)object0).isEmpty()) {
            Credential credential0 = ahiw0.d;
            String s = credential0.f;
            if(!gfta.c(s)) {
                gfsx gfsx0 = ahiw.a(credential0);
                if(gfsx0.i()) {
                    return ahiw0.d(aerq0, gged_interceptors.l(new InternalCredentialWrapper(credential0, ((bxie)gfsx0.d()).a())));
                }
            }
            if(gfta.c(s) && !((agjw)agjw.a.b()).b(ahiw0.c)) {
                throw bxma.e(0x6F0F);
            }
            ahir ahir0 = new ahir(ahiw0);
            return glzd.f(bxkv.b(gged_interceptors.h(gggq.j(this.c, ahir0)), new ahis()), new ahit(ahiw0, this.c), gmap.a);
        }
        return ahiw0.d(aerq0, gggq.j(ggog.g(gggq.j(((gged_interceptors)object0), new ahil())), new ahim(ahiw0)));
    }
}

