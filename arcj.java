import android.os.IBinder.DeathRecipient;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

public final class arcj implements IBinder.DeathRecipient {
    public final arcl a;

    public arcj(arcl arcl0) {
        this.a = arcl0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        D2dSourceChimeraActivity.j.d("#doBinderDied", new Object[0]);
        this.a.c();
        this.a.a.p();
    }
}

