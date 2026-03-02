import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvt extends fbny {
    final hcgr b;
    final PurchaseManagerSubmitRequest c;
    final fbvw e;

    public fbvt(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hcgr hcgr0, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest0) {
        this.b = hcgr0;
        this.c = purchaseManagerSubmitRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/purchasemanager/submit?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 41);
    }
}

