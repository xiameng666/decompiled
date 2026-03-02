import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.Arrays;

public final class dxzo {
    public final gmcg a;
    public final frli b;
    private final Account c;
    private final String d;

    public dxzo(Account account0, String s, gmcg gmcg0) {
        ibuq.f(account0, "account");
        ibuq.f(gmcg0, "highSpeedExecutor");
        super();
        this.c = account0;
        this.d = s;
        this.a = gmcg0;
        frce frce0 = new frce(AppContextProvider.a());
        frce0.c(account0);
        frce0.d("pay");
        String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{s, "payment_method_jp_tokenize_tip_data.pb"}, 2));
        ibuq.e(s1, "format(...)");
        frce0.e(s1);
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dxfb.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.b = frli0;
    }
}

