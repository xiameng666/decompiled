import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

public final class etlr {
    public static Intent a(esgi esgi0, gfpe gfpe0, int v) {
        Intent intent0 = IntentOperation.getStartIntent(esgi0.d, "com.google.android.gms.tapandpay.issuer.CheckEligibilityIntentOperation", "com.google.android.gms.tapandpay.issuer.ACTION_CHECK_ELIGIBILITY");
        batl.s(intent0);
        bauc.l(esgi0.a(), intent0, "extra_account_info");
        intent0.putExtra("EXTRA_TOKENIZATION_ENTRY_POINT", v).putExtra("token_provisioning_data", gfpe0.toBytesArray());
        return intent0;
    }

    public static List b() {
        return gged_interceptors.m(gtnd.c, gtnd.d);
    }
}

