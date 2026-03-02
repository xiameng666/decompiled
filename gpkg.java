import android.content.Context;
import android.net.Network;
import jeb.synthetic.TWR;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.CronetEngine;

public final class gpkg implements glzm {
    public final gphr a;
    public final cmlu b;

    public gpkg(cmlu cmlu0, gphr gphr0) {
        this.b = cmlu0;
        this.a = gphr0;
    }

    @Override  // glzm
    public final gmcd a() {
        gmcd gmcd0;
        ianj_grpcChannel ianj0;
        gdqb gdqb0 = gdsp.e("com/google/frameworks/client/data/android/impl/TransportChannel", "<init>", 43, "FrameworkChannel#getTransportChannel");
        try {
            Context context0 = this.b.a;
            ibnf ibnf0 = this.b.b;
            gfsx gfsx0 = this.b.c;
            gfsx gfsx1 = this.b.d;
            gfsx gfsx2 = this.b.e;
            CronetEngine cronetEngine0 = (CronetEngine)ibnf0.get();
            boolean z = cmln.a.a(cronetEngine0);
            gphr gphr0 = this.a;
            if(z) {
                gdrc gdrc0 = clib.c.a("createCronetChannelForXrpc");
                try {
                    iate iate0 = iate.j(gphr0.b(), gphr0.a(), ((CronetEngine)ibnf0.get()));
                    iate0.h(new CronetEngine.Builder(context0).getDefaultUserAgent());
                    iate0.f(gphr0.d);
                    Integer integer0 = gphr0.f;
                    if(integer0 != null) {
                        iate0.k(bbfl.a.c(integer0.intValue()));
                    }
                    Integer integer1 = gphr0.e;
                    if(integer1 != null && ((int)integer1) != -1) {
                        iate0.m(integer1.intValue());
                    }
                    if(gfsx2.i()) {
                        iate0.g = (Network)gfsx2.d();
                    }
                    if(hrpw.a.b().h()) {
                        iakw[] arr_iakw = new iakw[1];
                        fhre fhre0 = fhre.a;
                        if(fhre0 == null) {
                            synchronized(fhre.class) {
                                fhre fhre1 = fhre.a;
                                if(fhre1 == null) {
                                    fhre1 = new fhre(fhrj.b());
                                    fhre.a = fhre1;
                                }
                                fhre0 = fhre1;
                            }
                        }
                        arr_iakw[0] = fhre0;
                        iate0.g(arr_iakw);
                    }
                    ianj0 = cmma.h(iate0, context0, gphr0, gfsx0, gfsx1);
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(gdrc0, throwable1);
                    throw throwable1;
                }
                gdrc0.close();
            }
            else {
                if(gfsx2.i()) {
                    ((ggtj)((bboh)cmma.a.mr()).j()).x("Specified network is not used - Cronet is not available, binding to network is not supported here.");
                }
                bboh bboh0 = (bboh)cmma.a.mr();
                ibgx ibgx0 = new ibgx(gphr0.b(), gphr0.a());
                ibgx0.m(new cmlx(gphr0));
                ibgx0.g(new iakw[]{fhrj.b()});
                ianj0 = cmma.h(ibgx0, context0, gphr0, gfsx0, gfsx1);
            }
            gmcd0 = gmbu.i(ianj0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(gdqb0, throwable0);
            throw throwable0;
        }
        gdqb0.close();
        return gmcd0;
    }
}

