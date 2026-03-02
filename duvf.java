import com.google.android.gms.pay.pass.idcard.view.provisioning.push.IdPushProvisioningChimeraActivity;
import dagger.android.AndroidInjector;

public final class duvf implements AndroidInjector {
    private final dlmk a;

    public duvf(dlmk dlmk0) {
        this.a = dlmk0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((IdPushProvisioningChimeraActivity)object0).l = new etgl(dlmm.a(this.a));
    }
}

