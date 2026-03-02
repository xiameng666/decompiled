import com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService;
import j..util.Objects;

public final class aruj implements gaep {
    final CustomBackupDownloadManagerChimeraService a;
    final aruk b;

    public aruj(aruk aruk0, CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0) {
        this.a = customBackupDownloadManagerChimeraService0;
        Objects.requireNonNull(aruk0);
        this.b = aruk0;
        super();
    }

    @Override  // gaep
    public final void a(Throwable throwable0) {
        aruk.a.i("Portal Registration Failed %s", throwable0, new Object[0]);
        arui arui0 = new arui(this, this.a);
        this.b.c.d(arui0);
    }

    @Override  // gaep
    public final void b(boolean z) {
        aruk.a.h("Registered to Portal successfully,isPortalAvailable %s ", new Object[]{Boolean.valueOf(z)});
        this.b.c(2);
        arto arto0 = arto.a(this.a);
        artu artu0 = arto0.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        artu artu1 = (artu)hftp0.b_message;
        artu1.b |= 16;
        artu1.g = true;
        arto0.c(((artu)hftp0.N_build()));
    }
}

