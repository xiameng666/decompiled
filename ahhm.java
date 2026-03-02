import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;

public final class ahhm implements glzn {
    public final ahhn a;
    public final aerq b;

    public ahhm(ahhn ahhn0, aerq aerq0) {
        this.a = ahhn0;
        this.b = aerq0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((Iterable)object0)) {
            batl.s(((InternalCredentialWrapper)object1).b);
            bxie bxie0 = aeny.a(((InternalCredentialWrapper)object1).b);
            heqb heqb0 = agry.c(((InternalCredentialWrapper)object1).a, this.a.b);
            gmcd gmcd0 = glzd.f(((agrx)this.a.a).b.c(bxie0, heqb0), new agrj(((InternalCredentialWrapper)object1).a), gmap.a);
            this.b.b(bxnj.af, gmcd0);
            arrayList0.add(gmcd0);
        }
        return gmbu.c(arrayList0).a(new glzq(), gmap.a);
    }
}

