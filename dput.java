import com.google.android.gms.pay.notifications.CancelNotificationIntentOperation;
import dagger.android.AndroidInjector;

public final class dput implements AndroidInjector {
    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((CancelNotificationIntentOperation)object0).a = new cjlv(dlnj.a(), new cjky(dlnj.a()));
    }
}

