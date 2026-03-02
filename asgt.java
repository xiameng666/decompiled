import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import j..util.Objects;

final class asgt implements Runnable {
    final asgu a;

    public asgt(asgu asgu0) {
        Objects.requireNonNull(asgu0);
        this.a = asgu0;
        super();
    }

    @Override
    public final void run() {
        asgu asgu0 = this.a;
        if(!asgu0.d.isCancelled() && !asgu0.d.isDone()) {
            if(asgu0.f) {
                asgu0.f = false;
                return;
            }
            if(asgu0.g.get()) {
                CustomBackupResult customBackupResult0 = new CustomBackupResult(false, "TIMEOUT_PROGRESS");
                asgu0.e.c(asgu0.b, customBackupResult0);
            }
            else {
                CustomBackupResult customBackupResult1 = new CustomBackupResult(false, "TIMEOUT_PROGRESS");
                asgu0.e.d(asgu0.b, customBackupResult1);
            }
            asgu0.b();
            return;
        }
        asgu0.c();
    }
}

