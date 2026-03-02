import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import j..util.Objects;

final class fchn extends aaw {
    final BackupOptInChimeraActivity a;

    public fchn(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        Objects.requireNonNull(backupOptInChimeraActivity0);
        this.a = backupOptInChimeraActivity0;
        super(true);
    }

    @Override  // aaw
    public final void b() {
        this.a.s.d(this.a.q, gico.m);
        this.g(false);
        this.a.getOnBackPressedDispatcher().d();
    }
}

