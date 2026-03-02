import android.accounts.Account;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.Component;

@Component(modules = {dola.class})
public interface dolg {
    Account a();

    AccountInfo b();

    String c();

    String d();

    boolean e();
}

