import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.EmbeddedLandingPageSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvb extends fbny {
    final hcge b;
    final EmbeddedLandingPageSubmitRequest c;
    final fbvw e;

    public fbvb(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hcge hcge0, EmbeddedLandingPageSubmitRequest embeddedLandingPageSubmitRequest0) {
        this.b = hcge0;
        this.c = embeddedLandingPageSubmitRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/embeddedlandingpageservice/submit?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 61);
    }
}

