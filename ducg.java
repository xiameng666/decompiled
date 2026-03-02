import android.app.Activity;
import com.google.android.gms.pay.pass.idcard.view.MdocPresentationChimeraActivity;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class ducg implements AndroidInjector {
    private final dlmk a;

    public ducg(dlmk dlmk0) {
        this.a = dlmk0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        MdocPresentationChimeraActivity mdocPresentationChimeraActivity0 = (MdocPresentationChimeraActivity)object0;
        Activity activity0 = this.a.a.getContainerActivity();
        Preconditions.f(activity0);
        mdocPresentationChimeraActivity0.k = activity0;
        mdocPresentationChimeraActivity0.x = new etgl(dlmm.a(this.a));
        mdocPresentationChimeraActivity0.y = new duif();
    }
}

