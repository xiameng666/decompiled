import android.app.backup.BackupManagerMonitor;
import android.os.Bundle;
import android.os.SystemClock;
import j..util.Objects;

final class arfl extends BackupManagerMonitor {
    final arfm a;

    public arfl(arfm arfm0) {
        Objects.requireNonNull(arfm0);
        this.a = arfm0;
        super();
    }

    public final void onEvent(Bundle bundle0) {
        hqhq hqhq0 = hqhq.a;
        if(hqhq0.j().an()) {
            boolean z = hqhq0.j().aP();
            arem arem0 = this.a.a;
            if(z) {
                hkye hkye0 = aqqm.a(bundle0);
                if(hkye0 != null) {
                    arem0.j.add(hkye0);
                }
                return;
            }
            hkxz hkxz0 = (hkxz)((ProtoLiteMessage)hkye.a).v_newBuilder();
            long v = SystemClock.elapsedRealtime();
            if(!hkxz0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkxz0).ensureMutable();
            }
            hkye hkye1 = (hkye)hkxz0.b_message;
            hkye1.b |= 1;
            hkye1.c = v;
            if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_ID") && bundle0.containsKey("android.app.backup.extra.LOG_EVENT_CATEGORY")) {
                int v1 = bundle0.getInt("android.app.backup.extra.LOG_EVENT_ID");
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye2 = (hkye)hkxz0.b_message;
                hkye2.b |= 2;
                hkye2.d = v1;
                int v2 = bundle0.getInt("android.app.backup.extra.LOG_EVENT_CATEGORY");
                if(!hkxz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkxz0).ensureMutable();
                }
                hkye hkye3 = (hkye)hkxz0.b_message;
                hkye3.b |= 4;
                hkye3.e = v2;
                if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME")) {
                    String s = bundle0.getString("android.app.backup.extra.LOG_EVENT_PACKAGE_NAME");
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    hkye hkye4 = (hkye)hkxz0.b_message;
                    s.getClass();
                    hkye4.b |= 8;
                    hkye4.f = s;
                }
                if(bundle0.containsKey("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION")) {
                    int v3 = bundle0.getInt("android.app.backup.extra.LOG_EVENT_PACKAGE_VERSION");
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    hkye hkye5 = (hkye)hkxz0.b_message;
                    hkye5.b |= 16;
                    hkye5.g = v3;
                }
                if(bundle0.containsKey("android.app.backup.extra.LOG_CANCEL_ALL")) {
                    boolean z1 = bundle0.getBoolean("android.app.backup.extra.LOG_CANCEL_ALL");
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    hkye hkye6 = (hkye)hkxz0.b_message;
                    hkye6.b |= 0x20;
                    hkye6.h = z1;
                }
                if(bundle0.containsKey("android.app.backup.extra.LOG_ILLEGAL_KEY")) {
                    arem.a.f("BackupManagerMonitor.EXTRA_LOG_ILLEGAL_KEY: %s", new Object[]{bundle0.getString("android.app.backup.extra.LOG_ILLEGAL_KEY")});
                }
                if(bundle0.containsKey("android.app.backup.extra.LOG_PREFLIGHT_ERROR")) {
                    long v4 = bundle0.getLong("android.app.backup.extra.LOG_PREFLIGHT_ERROR");
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    hkye hkye7 = (hkye)hkxz0.b_message;
                    hkye7.b |= 0x80;
                    hkye7.j = v4;
                }
                if(bundle0.containsKey("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP")) {
                    String s1 = bundle0.getString("android.app.backup.extra.LOG_EXCEPTION_FULL_BACKUP");
                    String s2 = s1.split(":")[0];
                    if(!hkxz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hkxz0).ensureMutable();
                    }
                    hkye hkye8 = (hkye)hkxz0.b_message;
                    s2.getClass();
                    hkye8.b |= 0x100;
                    hkye8.k = s2;
                    arem.a.f("BackupManagerMonitor.EXTRA_LOG_EXCEPTION_FULL_BACKUP: %s", new Object[]{s1});
                }
                hkye hkye9 = (hkye)((ProtoLiteBuilder)hkxz0).N_build();
                arem0.j.add(hkye9);
                return;
            }
            arem.a.f("Event id and category are not optional fields.", new Object[0]);
            return;
        }
        arem.a.j("Backup manager monitor logs disabled, not logging", new Object[0]);
    }
}

