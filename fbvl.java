import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.VerifyMerchantRegistrationServerRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvl extends fbny {
    final VerifyMerchantRegistrationServerRequest b;
    final fbvw c;

    public fbvl(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, VerifyMerchantRegistrationServerRequest verifyMerchantRegistrationServerRequest0) {
        this.b = verifyMerchantRegistrationServerRequest0;
        Objects.requireNonNull(fbvw0);
        this.c = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/ocrservice/verifymerchantregistration";
        MessageLite hfvm0 = this.b.a();
        return this.c.V(s, gamm0, hfvm0, 78);
    }
}

