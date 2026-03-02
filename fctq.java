import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import j..util.Objects;

public final class fctq implements gmbg {
    final WearBackupOptInChimeraActivity a;

    public fctq(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0) {
        Objects.requireNonNull(wearBackupOptInChimeraActivity0);
        this.a = wearBackupOptInChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        WearBackupOptInChimeraActivity.j.n("Failed to fetch storage quota", throwable0, new Object[0]);
        this.a.c(0L);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.c(((fexu)object0).c);
    }
}

