import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.SetupWizardSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvv extends fbny {
    final hcdl b;
    final SetupWizardSubmitRequest c;
    final fbvw e;

    public fbvv(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hcdl hcdl0, SetupWizardSubmitRequest setupWizardSubmitRequest0) {
        this.b = hcdl0;
        this.c = setupWizardSubmitRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/androidsetupwizardservice/submit?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 43);
    }
}

