import com.google.android.gms.backup.settings.component.EnhancedBackupOptInChimeraActivity;
import j..util.Objects;

public final class asht implements aqzm {
    final EnhancedBackupOptInChimeraActivity a;

    public asht(EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity0) {
        Objects.requireNonNull(enhancedBackupOptInChimeraActivity0);
        this.a = enhancedBackupOptInChimeraActivity0;
        super();
    }

    @Override  // aqzm
    public final void a(Throwable throwable0) {
        EnhancedBackupOptInChimeraActivity.j.f("Error getting disabled backup flavors.", new Object[0]);
    }

    @Override  // aqzm
    public final void b(Object object0) {
        gftb.check(((gged_interceptors)object0));
        if(((gged_interceptors)object0).isEmpty()) {
            this.a.b();
            return;
        }
        this.a.o();
    }
}

