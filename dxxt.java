import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.Arrays;

public final class dxxt {
    public final frli a;
    public static final int b;

    static {
        bboh.b("pay", bbcu.cZ);
    }

    public dxxt(String s, String s1) {
        ibuq.f(s, "accountId");
        ibuq.f(s1, "env");
        super();
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("pay");
        String s2 = String.format("%s_%s_%s", Arrays.copyOf(new Object[]{s, s1, "bulk_import_data.pb"}, 3));
        ibuq.e(s2, "format(...)");
        frce0.e(s2);
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dltz.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.a = frli0;
    }
}

