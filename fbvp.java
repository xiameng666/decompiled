import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvp extends fbny {
    final gflf b;
    final InstrumentManagerSubmitRequest c;
    final fbvw e;

    public fbvp(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, gflf gflf0, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest0) {
        this.b = gflf0;
        this.c = instrumentManagerSubmitRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/InstrumentManager/SavePage?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 36);
    }
}

