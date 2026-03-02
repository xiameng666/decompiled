import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

public final class aqgo extends wbx implements aqgq {
    public aqgo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.backup.IBackupStatsService");
    }

    @Override  // aqgq
    public final void a() {
        this.jp(7, this.jo());
    }

    @Override  // aqgq
    public final void b(ApplicationBackupStats applicationBackupStats0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, applicationBackupStats0);
        this.jp(3, parcel0);
    }

    @Override  // aqgq
    public final void c(String s, long v) {
        Parcel parcel0 = this.jo();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.jp(6, parcel0);
    }

    @Override  // aqgq
    public final ApplicationBackupStats[] d(BackupStatsRequestConfig backupStatsRequestConfig0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, backupStatsRequestConfig0);
        Parcel parcel1 = this.hM(2, parcel0);
        ApplicationBackupStats[] arr_applicationBackupStats = (ApplicationBackupStats[])parcel1.createTypedArray(ApplicationBackupStats.CREATOR);
        parcel1.recycle();
        return arr_applicationBackupStats;
    }
}

