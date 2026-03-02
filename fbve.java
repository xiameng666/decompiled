import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbve extends fbny {
    final gfky b;
    final fbvw c;

    public fbve(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, gfky gfky0) {
        this.b = gfky0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/InstrumentManager/Initialize";
        return this.c.V(s, gamm0, this.b, 68);
    }
}

