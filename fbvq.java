import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerRefreshRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvq extends fbny {
    final gfld b;
    final InstrumentManagerRefreshRequest c;
    final fbvw e;

    public fbvq(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, gfld gfld0, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest0) {
        this.b = gfld0;
        this.c = instrumentManagerRefreshRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/InstrumentManager/RefreshPage?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 37);
    }
}

