import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import com.google.android.gms.backup.transport.scheduling.RequireIdleWifiAndChargingBackupTask;
import com.google.android.gms.backup.transport.scheduling.RequireWifiAndChargingBackupTask;
import j..util.Objects;
import java.util.LinkedHashMap;

public final class atmv {
    public static final int a;
    private static final baun b;

    static {
        atmv.b = aqql.a("BackupSchedulingCoordinator");
    }

    public static final void a(Context context0) {
        aqjk aqjk0 = new aqjk(context0);
        if(atmy.a()) {
            clks clks0 = new clks();
            clks0.w("com.google.android.gms.backup.transport.scheduling.RequireWifiAndChargingBackupTask");
            clks0.t("require_wifi_but_not_idle_backup_task");
            clks0.a = clkz.n;
            clks0.l(true);
            clks0.p = true;
            clks0.e();
            clks0.v(2);
            if(atff.c(context0)) {
                clks0.k();
            }
            cljp.a(context0).f(clks0.a());
            RequireWifiAndChargingBackupTask.a.j("Scheduled", new Object[0]);
        }
        else {
            RequireWifiAndChargingBackupTask.a.j("Won\'t schedule, disabled", new Object[0]);
        }
        if(atmx.a()) {
            clks clks1 = new clks();
            clks1.w("com.google.android.gms.backup.transport.scheduling.RequireIdleWifiAndChargingBackupTask");
            clks1.t("require_idle_wifi_and_charging_backup_task");
            clks1.a = clkz.j;
            clks1.l(true);
            clks1.p = true;
            clks1.e();
            clks1.j();
            clks1.v(2);
            if(atff.c(context0)) {
                clks1.k();
            }
            cljp.a(context0).f(clks1.a());
            RequireIdleWifiAndChargingBackupTask.a.j("Scheduled", new Object[0]);
        }
        else {
            RequireIdleWifiAndChargingBackupTask.a.j("Won\'t schedule, disabled", new Object[0]);
        }
        hqgx hqgx0 = hqgx.a;
        if(hqgx0.c().l()) {
            String s = Settings.Secure.getString(context0.getContentResolver(), "backup_manager_constants");
            if(Objects.equals(s, "null")) {
                s = null;
            }
            if(hqgx0.c().u()) {
                atmw.a.j("Resetting backup manager constants", new Object[0]);
                if(!gfta.c(s)) {
                    atmw.a(context0, s, "");
                }
            }
            else if(hqgx.b() > 23L) {
                atmw.a.f("K/V scheduling interval must be <24hr", new Object[0]);
            }
            else {
                String s1 = Long.toString(hqgx.b() * 3600000L);
                if(gfta.c(s)) {
                    atmw.a(context0, s, "key_value_backup_interval_milliseconds=" + s1);
                }
                else {
                    try {
                        LinkedHashMap linkedHashMap0 = new LinkedHashMap(gfud.e(',').a('=').a(s));
                        String s2 = (String)linkedHashMap0.get("key_value_backup_interval_milliseconds");
                        if(s2 != null && s2.trim().equals(s1)) {
                            atmw.a.d("Target value already set: %s", new Object[]{s});
                        }
                        else {
                            linkedHashMap0.put("key_value_backup_interval_milliseconds", s1);
                            atmw.a(context0, s, new gfsr(new gfss(","), "=").a(linkedHashMap0));
                        }
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        atmw.a.n("Unexpected backup_manager_constants value: %s", illegalArgumentException0, new Object[]{s});
                    }
                }
            }
        }
        hqgx hqgx1 = hqgx.a;
        if(hqgx1.c().w()) {
            if(Build.VERSION.SDK_INT < 34) {
                atmv.b.d("Can\'t set framework scheduling enabled state on version <U", new Object[0]);
                return;
            }
            boolean z = hqgx1.c().q();
            atmv.b.h("Setting framework scheduling enabled state: " + z, new Object[0]);
            if(aqjk0.g()) {
                aqjk0.a.setFrameworkSchedulingEnabled(z);
            }
        }
    }
}

