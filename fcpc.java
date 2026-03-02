import com.google.android.gms.wearable.backup.wear.KeyRecoveryChimeraActivity;
import j..util.Objects;

public final class fcpc {
    public final int a;
    final KeyRecoveryChimeraActivity b;

    public fcpc(KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0, int v) {
        Objects.requireNonNull(keyRecoveryChimeraActivity0);
        this.b = keyRecoveryChimeraActivity0;
        super();
        this.a = v;
    }

    public final void a() {
        KeyRecoveryChimeraActivity.j.f("onOtherError", new Object[0]);
        fcpa fcpa0 = new fcpa(this);
        this.b.runOnUiThread(fcpa0);
    }
}

