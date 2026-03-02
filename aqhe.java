import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.common.api.ApiMetadata;

public final class aqhe implements azys {
    public final aqhi a;
    public final boolean b;
    public final String c;
    public final BackupOptInSettings d;

    public aqhe(aqhi aqhi0, boolean z, String s, BackupOptInSettings backupOptInSettings0) {
        this.a = aqhi0;
        this.b = z;
        this.c = s;
        this.d = backupOptInSettings0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        asad asad0 = (asad)object0;
        aqhh aqhh0 = new aqhh(this.a, ((evqp)object1));
        asan asan0 = (asan)asad0.H();
        ApiMetadata apiMetadata0 = cclr.a(asad0.r);
        asan0.c(aqhh0, this.b, this.c, this.d, apiMetadata0);
    }
}

