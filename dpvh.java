import android.accounts.Account;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class dpvh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        AccountInfo accountInfo0 = (AccountInfo)object0;
        return new Account(accountInfo0.b, accountInfo0.a);
    }
}

