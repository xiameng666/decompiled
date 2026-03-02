import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;

public final class ahhn implements aerh {
    public final agpp a;
    public final String b;
    public final aenn c;
    private final agqf d;

    public ahhn(Context context0, String s, Credential credential0) {
        this.d = agpq.b(context0);
        this.a = agpq.a(context0);
        batl.q(s);
        this.b = s;
        batl.s(credential0);
        this.c = aenn.a(credential0);
    }

    @Override  // aerh
    public final bxnj b() {
        return bxnj.u;
    }

    @Override  // aerh
    public final gmcd c(aerq aerq0) {
        ggdy ggdy0 = new ggdy();
        gged_interceptors gged0 = aeny.b();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            bxie bxie0 = (bxie)gged0.get(v1);
            gmcd gmcd0 = this.d.d(bxie0);
            aerq0.b(bxnj.K, gmcd0);
            ggdy0.i(glzd.f(glzd.g(gmcd0, new ahhj(this, aerq0, bxie0), gmap.a), new bxks(new ahhk(this)), gmap.a));
        }
        return glzd.g(bxkv.b(ggdy0.h(), new ahhl()), new ahhm(this, aerq0), gmap.a);
    }
}

