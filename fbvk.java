import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvk extends fbny {
    final hcgx b;
    final fbvw c;

    public fbvk(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hcgx hcgx0) {
        this.b = hcgx0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/readytopayservice/getaccounteligibility";
        return this.c.V(s, gamm0, this.b, 0x4F);
    }
}

