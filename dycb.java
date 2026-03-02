import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.concurrent.Executor;

public final class dycb {
    public final frli a;
    private final Context b;
    private final Account c;
    private final String d;

    public dycb(Context context0, Account account0, String s) {
        ibuq.f(context0, "context");
        ibuq.f(account0, "account");
        super();
        this.b = context0;
        this.c = account0;
        this.d = s;
        frce frce0 = new frce(context0);
        frce0.c(account0);
        frce0.d("paysecardprepaid");
        String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{s, "secure_element_my_commute_data.pb"}, 2));
        ibuq.e(s1, "format(...)");
        frce0.e(s1);
        Uri uri0 = frce0.a();
        ibuq.e(uri0, "build(...)");
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dymo.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.a = frli0;
    }

    public final gmcd a() {
        gmcd gmcd0 = this.a.a();
        ibuq.e(gmcd0, "getData(...)");
        return gmcd0;
    }

    public final gmcd b(Executor executor0, ibts ibts0) {
        ibuq.f(executor0, "executor");
        dyca dyca0 = new dyca(ibts0);
        return this.a.b(dyca0, executor0);
    }
}

