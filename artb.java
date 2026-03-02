import com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService;

public final class artb implements Runnable {
    public final artc a;

    public artb(artc artc0) {
        this.a = artc0;
    }

    @Override
    public final void run() {
        CustomBackupDownloadManagerChimeraService customBackupDownloadManagerChimeraService0 = this.a.a;
        arsy arsy0 = customBackupDownloadManagerChimeraService0.h;
        if(arsy0 != null) {
            arsy0.c(2);
        }
        customBackupDownloadManagerChimeraService0.a();
    }
}

