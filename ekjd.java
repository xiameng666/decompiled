import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ekjd implements evqc {
    final ekje a;

    public ekjd(ekje ekje0) {
        Objects.requireNonNull(ekje0);
        this.a = ekje0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.w("RestoreResultLD", "Error occurs when calling api to restore contacts!");
        ekje ekje0 = this.a;
        if((exception0 instanceof aztb) && ((aztb)exception0).b() == Status.f.i) {
            ekje0.ii(Boolean.valueOf(true));
            return;
        }
        ekje0.ii(Boolean.valueOf(false));
    }
}

