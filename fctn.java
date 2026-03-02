import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import j..util.Objects;

public final class fctn extends aaw {
    final WearBackupOptInChimeraActivity a;

    public fctn(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0) {
        Objects.requireNonNull(wearBackupOptInChimeraActivity0);
        this.a = wearBackupOptInChimeraActivity0;
        super(true);
    }

    @Override  // aaw
    public final void b() {
        this.a.m.b(3, gico.l);
        this.g(false);
        this.a.getOnBackPressedDispatcher().d();
    }
}

