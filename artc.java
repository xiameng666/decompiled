import com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService;
import j..util.Objects;

public final class artc extends gaeg {
    final CustomBackupDownloadManagerChimeraService a;

    public artc(CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0) {
        Objects.requireNonNull(customBackupDownloadManagerChimeraService0);
        this.a = customBackupDownloadManagerChimeraService0;
        super();
    }

    @Override  // gaeh
    public final void a() {
        CustomBackupDownloadManagerChimeraService.a.d("onPortalSessionStart: invoking downloadDataBlocking on a separate thread", new Object[0]);
        artb artb0 = new artb(this);
        this.a.d.d(artb0);
    }

    @Override  // gaeh
    public final void c() {
        CustomBackupDownloadManagerChimeraService.a.d("onSuspend called. No further action identified", new Object[0]);
    }

    @Override  // gaeh
    public final void d() {
        CustomBackupDownloadManagerChimeraService.a.d("onAllowMobileData called. No further action identified", new Object[0]);
    }

    @Override  // gaeh
    public final void e() {
        CustomBackupDownloadManagerChimeraService.a.d("On remaining values called. No further action identified", new Object[0]);
    }

    @Override  // gaeh
    public final void f(gaef gaef0) {
        CustomBackupDownloadManagerChimeraService.a.d("onSetCallback called", new Object[0]);
        this.a.j = gaef0;
        gftb.check(this.a.g);
        this.a.g.g = gaef0;
    }
}

