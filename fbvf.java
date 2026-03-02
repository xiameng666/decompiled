import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvf extends fbny {
    final hchx b;
    final fbvw c;

    public fbvf(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hchx hchx0) {
        this.b = hchx0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a);
        return hzhy.d() ? this.c.W(s + "/payments/apis-secure/upstreamservice/submit?s7e_mode=proto", gamm0, this.b, fbvw.c, 75) : this.c.W(s + "/payments/apis-secure/upstreamservice/submit?s7e_mode=proto", gamm0, this.b, fbvw.b, 75);
    }
}

