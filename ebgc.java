import com.google.android.gms.pay.service.operation.idcard.ProvisionCdiIntentOperation;
import dagger.android.AndroidInjector;

public final class ebgc implements AndroidInjector {
    private final dola a;

    public ebgc(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ProvisionCdiIntentOperation)object0).b = dpsv.a(dlnj.a(), dolc.b(this.a));
    }
}

