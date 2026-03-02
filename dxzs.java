import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;

public final class dxzs {
    private final Context a;
    private final frii b;

    public dxzs(Context context0, frii frii0) {
        ibuq.f(context0, "context");
        ibuq.f(frii0, "protoDataStoreFactory");
        super();
        this.a = context0;
        this.b = frii0;
    }

    public final frli a(Account account0, String s) {
        frce frce0 = new frce(this.a);
        frce0.c(account0);
        frce0.d("paysecard");
        String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{s, "octopus_card_provision_status.pb"}, 2));
        ibuq.e(s1, "format(...)");
        frce0.e(s1);
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dyiu.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = this.b.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        return frli0;
    }
}

