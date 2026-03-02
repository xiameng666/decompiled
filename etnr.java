import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

public final class etnr {
    public static Intent a(Context context0, AccountInfo accountInfo0, String s) {
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.tapandpay.notifications.GmsCoreRenderedNotificationInteractionIntentOperation", "com.google.android.gms.tapandpay.notifications.GMS_CORE_ON_DELETE_ACTION");
        batl.s(intent0);
        bauc.l(accountInfo0, intent0, "extra_account_info");
        intent0.putExtra("campaign_id", s);
        return intent0;
    }

    public static Intent b(Context context0, AccountInfo accountInfo0, String s, int v, Intent intent0) {
        Intent intent1 = IntentOperation.getStartIntent(context0, "com.google.android.gms.tapandpay.notifications.GmsCoreRenderedNotificationInteractionIntentOperation", "com.google.android.gms.tapandpay.notifications.GMS_CORE_CLICK_ACTION");
        batl.s(intent1);
        bauc.l(accountInfo0, intent1, "extra_account_info");
        intent1.putExtra("campaign_id", s).putExtra("target_type_for_logging", v - 1).putExtra("extra_next_intent", intent0);
        return intent1;
    }

    public static Intent c(esgi esgi0, byte[] arr_b, int v, CardInfo cardInfo0) {
        Intent intent0 = IntentOperation.getStartIntent(esgi0.d, "com.google.android.gms.tapandpay.notifications.UpdateGunsReadStateForNotificationIntentOperation", "com.google.android.gms.tapandpay.notifications.UPDATE_GUNS");
        batl.s(intent0);
        return intent0.putExtra("account_id", esgi0.a).putExtra("account_name", esgi0.b).putExtra("read_state", v - 1).putExtra("extra_card_info", cardInfo0).putExtra("coalesced_notification", arr_b);
    }
}

