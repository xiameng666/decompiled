import android.content.Context;
import android.os.UserManager;
import android.provider.Settings.Secure;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.Iterator;

public final class ezwu {
    public static final ezwf a;
    public static final ezwf b;
    public static final ezwf c;
    public static final ezwf d;
    public static final ezwf e;
    public static final ezwf f;
    public static final ezwf g;
    public static final ezwf h;
    public static final ezwf i;
    public static final ezwf j;
    public static final ezwf k;
    public static final ezwf l;
    public static final ezwf m;
    public static final ezwf n;
    public static final ezwf o;
    public static final ezwf p;
    private static final baun q;
    private static int r;
    private static final ezwe s;

    static {
        ezwu.q = fabk.c("SystemUpdate");
        ezwu.r = -1;
        ezwe ezwe0 = new ezwe("config.flag.");
        ezwu.s = ezwe0;
        ezwu.a = ezwe0.d("title", "", hvzy.S);
        ezwu.b = new ezwe("config.flag.").c("size_value", Long.valueOf(-1L), hvzy.M);
        ezwu.c = ezwe0.d("description", "", hvzy.f);
        ezwu.d = ezwe0.d("url", "", hvzy.V);
        ezwu.e = ezwe0.d("install_success_message", "", hvzy.o);
        ezwu.f = ezwe0.d("install_failure_message", "", hvzy.n);
        ezwu.g = ezwe0.d("required_setup", "", hvzy.I);
        ezwu.h = ezwe0.b("is_security_update", Boolean.valueOf(false), hvzy.p);
        ezwu.i = ezwe0.d("streaming_property_files", "", hvzy.R);
        ezwu.j = ezwe0.d("end_of_life_url", "", hvzy.m);
        ezwu.k = ezwe0.d("ota_property_files", "", hvzy.D);
        ezwu.l = ezwe0.d("experiment_id", "", hwcy.f);
        ezwu.m = ezwe0.d("overdue_dialog_escalation_phases", "", hvxj.a);
        ezwu.n = ezwe0.d("overdue_dialog_retry_delay_period_phases", "", hvxj.b);
        Long long0 = (long)0L;
        ezwu.o = ezwe0.a("check_config_update_period_sec", long0);
        ezwu.p = ezwe0.a("check_config_update_flex_sec", long0);
    }

    public static int a(Context context0) {
        int v = ezwu.r;
        if(v == -1) {
            try {
                Iterator iterator0 = ModuleManager.get(context0).getAllModules().iterator();
                while(true) {
                label_3:
                    if(!iterator0.hasNext()) {
                        return -1;
                    }
                    Object object0 = iterator0.next();
                    ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                    if(moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.ota_base")) {
                        ezwu.r = moduleManager$ModuleInfo0.moduleVersion;
                        return moduleManager$ModuleInfo0.moduleVersion;
                    }
                }
            }
            catch(Exception exception0) {
                ezwu.q.g("Failed to get the module version: %s", exception0, new Object[0]);
                return -1;
            }
            goto label_3;
        }
        return v;
    }

    public static boolean b(Context context0) {
        boolean z;
        if(ezwp.b()) {
            ibuq.f(context0, "context");
            if(hvzk.c()) {
                if(bbqa.d()) {
                    UserManager userManager0 = (UserManager)context0.getSystemService("user");
                    gftb.check(userManager0);
                    z = userManager0.isAdminUser();
                }
                else {
                    z = bbmn.u(context0);
                }
                if(z) {
                    return ((Boolean)ezwo.d(hvzy.K, Boolean.class)).booleanValue();
                }
            }
            return !hvzk.d() || !bbmn.s(context0) ? false : ((Boolean)ezwo.d(hvzy.K, Boolean.class)).booleanValue();
        }
        return ezwp.a(context0) ? ((Boolean)ezwo.d(hvzy.K, Boolean.class)).booleanValue() : false;
    }

    public static boolean c(SystemUpdateStatus systemUpdateStatus0) {
        return systemUpdateStatus0.o == 0L;
    }

    public static boolean d(Context context0) {
        return Settings.Secure.getInt(context0.getContentResolver(), "ota_triggered_by_setupwizard", 0) != 0;
    }
}

