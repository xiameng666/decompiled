import com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

public final class etnj implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final domv d;

    public etnj(domv domv0) {
        this.d = domv0;
        etni etni0 = new etni(domv0);
        this.a = etni0;
        cjkz cjkz0 = new cjkz(etni0);
        this.b = cjkz0;
        this.c = new cjlw(etni0, cjkz0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        TapAndPayNotificationIntentOperation tapAndPayNotificationIntentOperation0 = (TapAndPayNotificationIntentOperation)object0;
        tapAndPayNotificationIntentOperation0.c = new fseb(this.d.h());
        tapAndPayNotificationIntentOperation0.a = DoubleCheck.a(this.c);
    }
}

