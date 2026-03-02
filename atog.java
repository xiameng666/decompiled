import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

public final class atog implements Runnable {
    public final atoh a;
    public final evqp b;
    public final BackupStatsRequestConfig c;

    public atog(atoh atoh0, evqp evqp0, BackupStatsRequestConfig backupStatsRequestConfig0) {
        this.a = atoh0;
        this.b = evqp0;
        this.c = backupStatsRequestConfig0;
    }

    @Override
    public final void run() {
        ApplicationBackupStats[] arr_applicationBackupStats = this.a.a.a(this.c);
        this.b.b(arr_applicationBackupStats);
    }
}

