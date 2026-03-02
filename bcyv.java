import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public final class bcyv {
    private final cchj a;

    public bcyv(cchj cchj0) {
        this.a = cchj0;
    }

    public final List a() {
        List list0 = this.b();
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            list1.add(((Account)object0).name);
        }
        return list1;
    }

    public final List b() {
        Account[] arr_account = this.a.p("com.google");
        ibuq.e(arr_account, "getAccountsByType(...)");
        return ibpg.N(arr_account);
    }
}

