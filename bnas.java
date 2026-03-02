import android.util.Pair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

public final class bnas extends bnar {
    public bnat d;
    public Pair e;

    public bnas(byte[] arr_b, Pair pair0) {
        gfsx gfsx0 = gfsx.m(arr_b);
        gfsx gfsx1 = gfsx.m(pair0);
        super(gfsx0, gfqx.a, gfsx1);
    }

    public bnas(byte[] arr_b, ECPublicKey eCPublicKey0) {
        super(gfsx.m(arr_b), gfsx.m(eCPublicKey0), gfqx.a);
    }

    public final byte[] d() {
        gfuy.a(this.e == null);
        gfsx gfsx0 = this.a;
        if(gfsx0.i()) {
            bnat bnat0 = new bnat(2);
            this.d = bnat0;
            bnat0.c(new byte[]{0});
            this.d.d(((ECPublicKey)gfsx0.d()).getW());
        }
        else {
            bnat bnat1 = new bnat(3);
            this.d = bnat1;
            bnat1.c(new byte[]{1});
            this.d.d(((ECPublicKey)((Pair)this.b.d()).first).getW());
        }
        this.d.f(((byte[])((gftm)this.c).a));
        Pair pair0 = bnas.a();
        this.e = pair0;
        byte[] arr_b = bnat.g(((ECPublicKey)pair0.first).getW());
        this.d.c(arr_b);
        this.d.e(arr_b);
        if(gfsx0.i()) {
            this.d.e(bnas.c(((ECPrivateKey)this.e.second), ((ECPublicKey)gfsx0.d())));
        }
        return glwl.d(new byte[][]{arr_b, this.d.h(new byte[0])});
    }
}

