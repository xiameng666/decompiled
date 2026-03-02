import com.google.android.gms.pay.googlesettings.features.status.PayFeatureStatusIntentOperation;
import dagger.android.AndroidInjector;

public final class dnqk implements AndroidInjector {
    private final dola a;

    public dnqk(dola dola0) {
        this.a = dola0;
    }

    static final edse a() {
        return new edse(dlnj.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        PayFeatureStatusIntentOperation payFeatureStatusIntentOperation0 = (PayFeatureStatusIntentOperation)object0;
        payFeatureStatusIntentOperation0.b = dnqk.a();
        payFeatureStatusIntentOperation0.d = new dqew(donc.a(), dolc.b(this.a), dxei.b(dlnj.a()), dnql.a(), new dmkl(dlnj.a()), dnqk.a());
    }
}

