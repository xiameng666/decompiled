import android.content.Context;
import android.os.Process;
import j..util.Objects;

public final class fwxp implements gful_cronetEngineProvider {
    public final Context a;

    public fwxp(Context context0) {
        this.a = context0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        fvaf fvaf0;
        huvd huvd0 = huvd.a;
        boolean z = huvd0.f().w();
        Context context0 = this.a;
        if(z) {
            fvaf0 = fvap.a(context0, 0x609, gfqx.a);
        }
        else {
            fvae fvae0 = new fvae();
            fvae0.b(context0);
            fvae0.c(0x609);
            fvaf0 = fvae0.a();
        }
        gpir gpir0 = fvaf0.a();
        fhad fhad0 = fhae.a();
        fhad0.b(fvaf0.a);
        fhae fhae0 = fhad0.a();
        fhbw fhbw0 = new fhbw();
        fhbw0.a(new gxms());
        int v = Process.myUid();
        fhbu fhbu0 = fhbu.b(fhae0, fhbw0);
        iakw[] arr_iakw = {gpmu.d()};
        gxmu gxmu0 = (gxmu)gxmu.f(new gxmt(), iala.b(cmma.g(fvaf0.b.intValue(), v, fhae0, fhbw0).a(gxmx.c), arr_iakw));
        String s = String.format("%s:%s", huvd0.f().s(), huvd0.f().d());
        Object object0 = (gxmu)((gxmu)((gxmu)gxmu0.q(gpho.a, s)).q(gpji.g, gpir0)).p(new iakw[]{fhbu0});
        return !Objects.equals(huvd.i(), "") ? ((gxmu)((ibjo)object0).m(huvd.i())) : object0;
    }
}

