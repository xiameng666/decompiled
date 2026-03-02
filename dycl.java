import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.Arrays;

public final class dycl {
    public final frli a;

    public dycl(String s, String s1) {
        ibuq.f(s, "accountId");
        ibuq.f(s1, "env");
        super();
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("paysecard");
        String s2 = String.format("%s_%s_%s", Arrays.copyOf(new Object[]{s, s1, "secure_element_pending_card_provision.pb"}, 3));
        ibuq.e(s2, "format(...)");
        frce0.e(s2);
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dymw.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.a = frli0;
    }

    public final gmcd a() {
        dyce dyce0 = new dyce(new dycd());
        return this.a.b(dyce0, gmap.a);
    }

    public final gmcd b() {
        gmcd gmcd0 = this.a.a();
        ibuq.e(gmcd0, "getData(...)");
        return gmcd0;
    }

    public final gmcd c(dymv dymv0) {
        ibuq.f(dymv0, "status");
        dyck dyck0 = new dyck(new dycj(dymv0));
        return this.a.b(dyck0, gmap.a);
    }

    public final gmcd d(dymw dymw0) {
        ibuq.f(dymw0, "data");
        dycg dycg0 = new dycg(new dycf(dymw0));
        return this.a.b(dycg0, gmap.a);
    }
}

