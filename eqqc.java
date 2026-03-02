import android.content.Context;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import j..util.Objects;

final class eqqc implements Runnable {
    final Context a;
    final eqqd b;

    public eqqc(eqqd eqqd0, Context context0) {
        this.a = context0;
        Objects.requireNonNull(eqqd0);
        this.b = eqqd0;
        super();
    }

    @Override
    public final void run() {
        bboe bboe0 = this.b.am;
        if(bboe0 == null) {
            return;
        }
        bboe0.a(((TargetChimeraActivity)this.a));
    }
}

