import android.content.Context;
import java.security.SecureRandom;

final class czqp extends czvg {
    public final Context a;
    public final String b;
    public final czuo c;
    public final czql d;
    public int e;
    public gyxo f;
    public czuc g;
    private final SecureRandom h;
    private final cump i;

    public czqp(Context context0, czql czql0, String s, czuo czuo0, SecureRandom secureRandom0, cump cump0) {
        super(37, cump0);
        this.f = gyxo.b;
        this.a = context0;
        this.b = s;
        this.c = czuo0;
        this.h = secureRandom0;
        this.i = cump0;
        if(!czri.V()) {
            czqk czqk0 = new czqk();
            czqk0.c(czql0.c);
            czqk0.a = czql0.d;
            czqk0.e(czql0.a);
            czqk0.b(czql0.b);
            czqk0.f(czql0.e);
            czqk0.d(czql0.f);
            czry czry0 = czql0.b.a;
            czqk0.b(new czsy(czry0, null, czql0.b.c, 0, czql0.b.e, czql0.b.f, (czry0 == null ? null : czry0.h)));
            this.d = czqk0.a();
            return;
        }
        this.d = czql0;
    }

    @Override  // czvg
    public final czvf a() {
        czqo czqo0 = new czqo(this);
        long v = hvog.o();
        int v1 = (int)hvog.a.bk().X();
        gfsx gfsx0 = (gfsx)gxyl.a(czqo0, "ConnectBleSocket", new gxyk(new gxyj(v + ((long)this.h.nextInt(v1))), this.i.a, 3));
        czuc czuc0 = gfsx0 == null ? null : ((czuc)gfsx0.g());
        this.g = czuc0;
        return czuc0 == null ? czvf.c : this.i(38);
    }
}

