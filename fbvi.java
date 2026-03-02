import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.BuyflowRefreshRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvi extends fbny {
    final gerb b;
    final BuyflowRefreshRequest c;
    final fbvw e;

    public fbvi(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, gerb gerb0, BuyflowRefreshRequest buyflowRefreshRequest0) {
        this.b = gerb0;
        this.c = buyflowRefreshRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/buyflowservice/refresh?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 35);
    }
}

