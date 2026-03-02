import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvu extends fbny {
    final hcdf b;
    final fbvw c;

    public fbvu(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hcdf hcdf0) {
        this.b = hcdf0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/androidsetupwizardservice/initialize";
        return this.c.V(s, gamm0, this.b, 42);
    }
}

