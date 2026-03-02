import com.google.android.gms.tapandpay.notifications.LocalNotificationTaskOperation;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

public final class etnh implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;

    public etnh(domv domv0) {
        etng etng0 = new etng(domv0);
        this.a = etng0;
        cjkz cjkz0 = new cjkz(etng0);
        this.b = cjkz0;
        this.c = new cjlw(etng0, cjkz0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((LocalNotificationTaskOperation)object0).b = DoubleCheck.a(this.c);
    }
}

