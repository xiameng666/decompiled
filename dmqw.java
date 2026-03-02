import com.google.android.gms.pay.LowBalanceNotificationSettingsIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;

public final class dmqw extends dmqc {
    public final dlfy b;

    public dmqw() {
        super("com.google.android.gms.payprocesspayment.view.VIEW_PROCESSPAYMENT_LOW_BALANCE_NOTIFICATION_SETTINGS");
        this.b = new dlfy();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
        LowBalanceNotificationSettingsIntentArgs lowBalanceNotificationSettingsIntentArgs0 = payIntentArgs0.r;
        batl.s(lowBalanceNotificationSettingsIntentArgs0);
        batl.t(lowBalanceNotificationSettingsIntentArgs0.a, "Must set a google payment method id");
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.r = this.b.a;
    }
}

