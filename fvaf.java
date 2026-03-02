import android.content.Context;
import android.os.Process;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class fvaf {
    public final Context a;
    public final Integer b;
    final Provider c;
    final Provider d;
    final Provider e;
    private final gfsx f;

    public fvaf(Context context0, Integer integer0, gfsx gfsx0) {
        this.a = context0;
        this.f = gfsx0;
        this.b = integer0;
        Factory factory0 = InstanceFactory.a(context0);
        this.c = factory0;
        Provider provider0 = DoubleCheck.b(new gpik(factory0));
        this.d = provider0;
        this.e = DoubleCheck.b(new gpil(provider0));
    }

    public final gpir a() {
        return new gpir(((gpiq)this.e.get()));
    }

    public final gxto b() {
        gpgz gpgz0;
        int v = (int)this.b;
        gpir gpir0 = this.a();
        fhad fhad0 = fhae.a();
        fhad0.b(this.a);
        fhae fhae0 = fhad0.a();
        fhbw fhbw0 = new fhbw();
        fhbw0.a(new gxtm());
        gxtt gxtt0 = gxtt.c;
        fhbu fhbu0 = fhbu.b(fhae0, fhbw0);
        if(huvd.k()) {
            gfsx gfsx0 = this.f;
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                gpgz0 = cmma.e(new cmlz(cmma.d(gfsx.m(fhae0), gfsx.m(fhbw0), gfsx.m(object0))), v, Process.myUid());
            }
            else {
                gpgz0 = cmma.g(v, Process.myUid(), fhae0, fhbw0);
            }
        }
        else {
            gpgz0 = cmma.g(v, Process.myUid(), fhae0, fhbw0);
        }
        iakr iakr0 = gpgz0.a(gxtt0);
        gxto gxto0 = (gxto)gxto.f(new gxtn(), iakr0);
        String s = String.format("%s:%s", huxh.d(), huxh.b());
        return (gxto)((gxto)((gxto)gxto0.q(gpho.a, s)).q(gpji.g, gpir0)).p(new iakw[]{fhbu0});
    }
}

