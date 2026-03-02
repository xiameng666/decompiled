import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvc extends fbny {
    final hchn b;
    final fbvw c;

    public fbvc(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hchn hchn0) {
        this.b = hchn0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/timelineview/initialize";
        return this.c.V(s, gamm0, this.b, 62);
    }
}

