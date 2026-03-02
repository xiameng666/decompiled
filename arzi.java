import android.accounts.Account;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GoogleAccount;

public final class arzi implements gfsi {
    public final aqee a;

    public arzi(aqee aqee0) {
        this.a = aqee0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Account account0 = this.a.a();
        for(Object object1: ((GetAccountsResponse)object0).a) {
            if(account0 != null && ((GoogleAccount)object1).c.equals(account0.name)) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}

