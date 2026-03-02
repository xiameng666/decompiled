import android.app.backup.SelectBackupTransportCallback;
import android.content.ComponentName;
import android.content.Context;
import java.util.Locale;

public final class aqxf implements aqxc {
    public static final baun a;
    public final String b;
    private final Context c;
    private final aqjk d;
    private final String e;
    private boolean f;
    private final SelectBackupTransportCallback g;
    private final aqxb h;

    static {
        aqxf.a = aqql.a("SwitchTransportTaskO");
    }

    public aqxf(Context context0, aqjk aqjk0, aqxb aqxb0, String s, String s1) {
        this.g = new aqxe(this);
        this.c = context0;
        this.d = aqjk0;
        this.h = aqxb0;
        this.e = s;
        this.b = s1;
    }

    @Override  // aqxc
    public final void a() {
        synchronized(this) {
            this.f = true;
        }
    }

    @Override  // aqxc
    public final void b() {
        synchronized(this) {
            if(!this.f) {
                ComponentName componentName0 = new ComponentName(this.c, this.e);
                aqjk aqjk0 = this.d;
                SelectBackupTransportCallback selectBackupTransportCallback0 = this.g;
                if(aqjk0.g()) {
                    aqjk0.a.selectBackupTransport(componentName0, selectBackupTransportCallback0);
                }
            }
        }
    }

    public final void c() {
        int v1;
        synchronized(this) {
            if(this.f) {
                return;
            }
            String s = this.d.d();
            if("com.google.android.gms/.backup.BackupTransportService".equals(s)) {
                v1 = 1;
            }
            else {
                v1 = "com.google.android.gms/.backup.migrate.service.D2dTransport".equals(s) ? 2 : 0;
            }
            aqxb aqxb0 = this.h;
            int v2 = aqxb0.a;
            if(v1 == v2) {
                aqxb0.q(null);
                return;
            }
            aqxb0.r(new aqxk(String.format(Locale.US, "Tried to set transport to %d but set it to %d", v2, v1)));
        }
    }
}

