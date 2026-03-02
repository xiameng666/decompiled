import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.security.snet.SnetWatchdogTaskService;
import java.util.concurrent.TimeUnit;

public final class elhc {
    public static Bundle a(Context context0) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("snet_idle_mode_wake_interval_ms", TimeUnit.HOURS.toMillis(hxvy.a.f().e()));
        bundle0.putLong("snet_watchdog_timeout_ms", SnetWatchdogTaskService.b);
        bundle0.putLong("snet_watchdog_idle_mode_timeout_ms", SnetWatchdogTaskService.a);
        bundle0.putInt("snet_max_exception_string_size", 0x800);
        bundle0.putString("snet_report_event_logs", hxvy.a.f().v());
        bundle0.putBoolean("snet_log_execution_points", hxvy.p());
        boolean z = false;
        bundle0.putBoolean("snet_report_non_system_apps", false);
        bundle0.putBoolean("snet_report_system_apps", false);
        bundle0.putBoolean("snet_report_more_app_info", false);
        bundle0.putBoolean("snet_report_google_page", false);
        bundle0.putBoolean("snet_report_proxy", false);
        bundle0.putString("debug_status", hxvy.a.f().q());
        bundle0.putString("snet_sd_card_jpeg_name", "");
        bundle0.putString("snet_logcat_tags", hxvy.a.f().u());
        bundle0.putInt("snet_logcat_lines", 0);
        bundle0.putString("snet_tags_whitelist", hxvy.a.f().A());
        bundle0.putString("snet_idle_tags_whitelist", hxvy.a.f().t());
        bundle0.putInt("snet_num_sys_part_files", 5);
        bundle0.putString("snet_sys_part_files", hxvy.a.f().y());
        bundle0.putLong("snet_num_sys_ca_certs", hxvy.a.f().g());
        bundle0.putBoolean("snet_log_sys_ca_cert", hxvy.a.f().T());
        bundle0.putString("snet_requested_ca_certs", "");
        bundle0.putBoolean("clearcut_idle_logging_enabled", true);
        bundle0.putBoolean("clearcut_jar_logging_enabled", true);
        bundle0.putString("device_country", bapf.f(context0, "device_country", ""));
        bundle0.putString("snet_system_properties", hxvy.a.f().z());
        bundle0.putString("snet_selected_files", hxvy.a.f().w());
        String s = hxvy.a.f().s();
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                String[] arr_s1 = s1.split("-");
                try {
                    if(arr_s1.length != 2) {
                        if(Integer.parseInt(s1) == 15) {
                            z = true;
                            break;
                        }
                        continue;
                    }
                    else if(Integer.parseInt(arr_s1[0]) <= 15 && Integer.parseInt(arr_s1[1]) >= 15) {
                        z = true;
                    }
                    else {
                        continue;
                    }
                    break;
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
        bundle0.putBoolean("snet_is_targeted_by_gservices", z);
        return bundle0;
    }
}

