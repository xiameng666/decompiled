import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemProperties;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Locale;

public final class epfa {
    public final bbot a;

    public epfa(Context context0, epev epev0, Bundle bundle0) {
        this.a = new bbot(context0);
        if(bundle0 != null && bundle0.getBoolean("savedWebView")) {
            WebView webView0 = this.b();
            if(webView0 != null) {
                webView0.restoreState(bundle0);
            }
        }
        else {
            ContentResolver contentResolver0 = context0.getContentResolver();
            ContentResolver contentResolver1 = context0.getContentResolver();
            String s = epev0.q == null ? null : fftn.e(contentResolver1, epev0.q);
            if(TextUtils.isEmpty(s)) {
                if(bbnp.n(context0)) {
                    s = epev0.s;
                    if(s == null) {
                        s = epev0.r;
                    }
                }
                else {
                    s = epev0.r;
                }
            }
            if(TextUtils.isEmpty(s)) {
                s = epev0.u;
            }
            if(TextUtils.isEmpty(s)) {
                s = "";
            }
            if(s.contains("%m")) {
                try {
                    Configuration configuration0 = new Configuration();
                    Settings.System.getConfiguration(contentResolver0, configuration0);
                    s = configuration0.mcc == 0 ? s.replace("%m", "%s") : s.replace("%m", Integer.toString(configuration0.mcc));
                }
                catch(Exception unused_ex) {
                    s = s.replace("%m", "%s");
                }
            }
            if(s.contains("%s")) {
                Locale locale0 = Locale.getDefault();
                s = s.replace("%s", locale0.getLanguage() + "_" + locale0.getCountry().toLowerCase(Locale.US));
            }
            if(s.contains("%y")) {
                s = s.replace("%y", Locale.getDefault().getLanguage());
            }
            if(s.contains("%z")) {
                try {
                    TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
                    Configuration configuration1 = new Configuration();
                    Settings.System.getConfiguration(contentResolver0, configuration1);
                    if(telephonyManager0 != null && configuration1.mcc != 0) {
                        String s1 = telephonyManager0.getSimCountryIso();
                        if(TextUtils.isEmpty(s1)) {
                            s1 = "us";
                        }
                        s = s.replace("%z", s1);
                        goto label_44;
                    }
                    goto label_43;
                }
                catch(Exception unused_ex) {
                label_43:
                    s = s.replace("%z", Locale.getDefault().getCountry().toLowerCase(Locale.US));
                }
            }
        label_44:
            String s2 = epev0.t == null ? s : epev0.t;
            epfb.a.h(epev0.name() + ", urls:[" + s + ", " + s2 + "]", new Object[0]);
            try {
                this.a.b = bbot.b(s);
                this.a.c = bbot.b(s2);
                String s3 = context0.getString((SystemProperties.get("ro.carrier", "").equals("wifi-only") ? 0x7F150900 : 0x7F1508FF));  // string:common_url_load_unsuccessful_message_wifi_only "Your Android device isn\'t 
                                                                                                                                         // connected to a Wi-Fi network. To view this information now, visit %s with a web 
                                                                                                                                         // browser."
                this.a.d = String.format(this.a.a.getResources().getConfiguration().locale, s3, this.a.c);
                this.a.c();
                this.a.e.loadUrl(this.a.b);
            }
            catch(RuntimeException unused_ex) {
                epfb.a.f("Unexpected runtime error occurred when init " + this.a.toString(), new Object[0]);
            }
            WebView webView1 = this.b();
            if(webView1 != null) {
                webView1.getSettings().setDisabledActionModeMenuItems(7);
                View view0 = this.a();
                WebView webView2 = this.b();
                boolean z = pza.a("FORCE_DARK");
                StringBuilder stringBuilder0 = new StringBuilder("[configWebViewDayNightMode] hasFeatureForceDark=");
                stringBuilder0.append(z);
                if(z) {
                    stringBuilder0.append(", setForceDarkAllowed, forceDarkMode=");
                    view0.setForceDarkAllowed(true);
                    int v = bagv.k(view0.getContext()) ? 2 : 0;
                    stringBuilder0.append(v);
                    if(bbqa.c() && epfa.c(webView2)) {
                        stringBuilder0.append(", use Algorithmic Darkening");
                        epfb.a.f("Successfully configured WebView to use Algorithmic Darkening", new Object[0]);
                    }
                    else {
                        webView2.getSettings().setForceDark(v);
                        if(pza.a("FORCE_DARK_STRATEGY")) {
                            stringBuilder0.append(", setForceDarkStrategy");
                            WebSettings webSettings0 = webView2.getSettings();
                            if(!pza.e.d()) {
                                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                            }
                            pyb.a(webSettings0).a.setForceDarkBehavior(2);
                        }
                    }
                }
                epfb.a.h(stringBuilder0.toString(), new Object[0]);
            }
        }
    }

    public final View a() {
        return this.a.a();
    }

    final WebView b() {
        ViewGroup viewGroup0 = this.a.a();
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if((view0 instanceof WebView)) {
                return (WebView)view0;
            }
        }
        return null;
    }

    private static boolean c(WebView webView0) {
        try {
            pyb.b(webView0.getSettings());
            return true;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            epfb.a.g("Failed to use AlgorithmicDarkeningAllowed.", unsupportedOperationException0, new Object[0]);
            return false;
        }
    }
}

