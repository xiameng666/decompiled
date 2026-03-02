import com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService;

public final class arui implements Runnable {
    public final aruj a;
    public final CustomBackupDownloadManagerChimeraService b;

    public arui(aruj aruj0, CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0) {
        this.a = aruj0;
        this.b = customBackupDownloadManagerChimeraService0;
    }

    @Override
    public final void run() {
        this.a.b.c(3);
        aruk.a.d("Saving failure status and starting service for download", new Object[0]);
        aruk.a.d("Saving portal failure status", new Object[0]);
        CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0 = this.b;
        arto arto0 = arto.a(customBackupDownloadManagerChimeraService0);
        artu artu0 = arto0.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        artu artu1 = (artu)hftp0.b_message;
        artu1.b |= 0x20;
        artu1.h = true;
        arto0.c(((artu)hftp0.N_build()));
        CustomBackupDownloadManagerChimeraService.d(customBackupDownloadManagerChimeraService0.getApplicationContext());
    }
}

