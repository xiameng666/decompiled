import android.accounts.Account;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import java.util.Map;

public final class ahfx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        frif frif0;
        ahgd ahgd0 = (ahgd)ahgd.a.b();
        synchronized(ahgd0.c) {
            Map map0 = ahgd0.d;
            if(!map0.containsKey(((Account)object0))) {
                frie frie0 = frif.a();
                frce frce0 = new frce(AppContextProvider.a());
                frce0.d("auth_api_credentials");
                frce0.c(((Account)object0));
                frce0.e("gislamssettings.pb");
                frie0.f(frce0.a());
                frie0.e(((MessageLite)ahge.a));
                frgw frgw0 = frgx.a();
                frgw0.a = new ahfu();
                frgw0.g = 59;
                frgw0.b(new bbll(1, 9));
                frgw0.c = new ahgc();
                hhec hhec0 = hhed.a(cmma.i(0x100B, cmmk.a).a(hhep.c));
                gphs gphs0 = new gphs(((Account)object0).name, "google");
                frgw0.b = (hhec)hhec0.q(gphs.a, gphs0);
                frgw0.d = new frjp(ahgd0.b);
                frie0.h(frgw0.a());
                map0.put(((Account)object0), frie0.a());
            }
            frif0 = (frif)map0.get(((Account)object0));
        }
        frli frli0 = cjtb.a.a(frif0);
        return glzd.g(frjd.d(frli0), new ahfz(frli0), gmap.a);
    }
}

