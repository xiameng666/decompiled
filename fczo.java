import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.wearable.AppTheme;

public final class fczo {
    public static int a(AppTheme appTheme0) {
        int v = appTheme0.d();
        if(v == 1) {
            return 0x7F1610F7;  // style:WearableSmallTheme
        }
        return v == 2 ? 0x7F1610F2 : 0x7F1610ED;  // style:WearableMediumTheme
    }

    public static Context b(Context context0, AppTheme appTheme0) {
        Context context1 = new ContextThemeWrapper(context0, fczo.a(appTheme0));
        return appTheme0.b() == 1 ? fyhn.a(context1) : context1;
    }

    public static LayoutInflater c(AppTheme appTheme0, LayoutInflater layoutInflater0) {
        return layoutInflater0.cloneInContext(fczo.b(layoutInflater0.getContext(), appTheme0));
    }

    public static AppTheme d() {
        fcdy fcdy0 = new fcdy();
        fczo.j(fcdy0);
        return fcdy0.a;
    }

    public static AppTheme e(Bundle bundle0) {
        if(bundle0 != null) {
            AppTheme appTheme0 = (AppTheme)bundle0.get("theme");
            return appTheme0 == null ? fczo.d() : appTheme0;
        }
        return fczo.d();
    }

    public static void f(Window window0) {
        if(Build.VERSION.SDK_INT >= 35) {
            kex.b(window0.getDecorView(), new fczn());
            window0.setNavigationBarContrastEnforced(false);
            window0.setNavigationBarColor(0);
        }
    }

    public static void g(AppTheme appTheme0, Intent intent0, Activity activity0) {
        int v2;
        if(intent0.hasExtra("theme")) {
            Bundle bundle0 = intent0.getExtras();
            batl.s(bundle0);
            String s = bundle0.getString("theme");
            if(s != null) {
                switch(s) {
                    case "dark": {
                        appTheme0.a = 3;
                        break;
                    }
                    case "light": {
                        appTheme0.a = 2;
                        break;
                    }
                    case "system": {
                        appTheme0.a = 1;
                    }
                }
            }
        }
        if(intent0.hasExtra("is_dynamic_color_enabled")) {
            Bundle bundle1 = intent0.getExtras();
            batl.s(bundle1);
            boolean z = bundle1.getBoolean("is_dynamic_color_enabled");
            Boolean.valueOf(z).getClass();
            appTheme0.b = z ? 1 : 2;
        }
        int v = appTheme0.a();
        if(fczo.i(appTheme0)) {
            int v1 = appTheme0.a();
            if(v1 == 3) {
                v2 = 0x7F1610E2;  // style:WearableExpressiveDarkTheme
            }
            else if(v1 == 2) {
                v2 = 0x7F1610E3;  // style:WearableExpressiveLightTheme
            }
            else {
                v2 = 0x7F1610EC;  // style:WearableExpressiveTheme
            }
        }
        else if(v == 3) {
            v2 = 0x7F1610F8;  // style:WearableTosDarkTheme
        }
        else {
            v2 = v == 2 ? 0x7F1610F9 : 0x7F161100;  // style:WearableTosLightTheme
        }
        activity0.setTheme(v2);
        if(appTheme0.a() == 3) {
            jg.r(2);
        }
        else if(appTheme0.a() == 2) {
            jg.r(1);
        }
        else {
            jg.r(-1);
        }
        android.app.Activity activity1 = activity0.getContainerActivity();
        Context context0 = appTheme0.b() == 1 ? fyhn.a(activity1) : activity1;
        if(context0 == activity1) {
            context0 = new ContextThemeWrapper(context0, v2);
        }
        int v3 = fyho.d(context0, 0x1010031, "page and window background color");
        activity0.getWindow().getDecorView().setBackgroundColor(v3);
        View view0 = activity0.getWindow().getDecorView();
        if(!fyho.i(v3)) {
            WindowInsetsController windowInsetsController0 = view0.getWindowInsetsController();
            if(windowInsetsController0 != null) {
                windowInsetsController0.setSystemBarsAppearance(0, 8);
            }
        }
        activity0.getWindow().setStatusBarColor(v3);
        activity0.getWindow().setNavigationBarColor(v3);
        activity0.getWindow().addFlags(0x80000000);
        fczo.f(activity0.getWindow());
    }

    public static void h(LinearLayout linearLayout0, AppTheme appTheme0, TextView[] arr_textView) {
        int v = 0;
        int v1 = appTheme0.c();
        if(!fczo.i(appTheme0)) {
            if(v1 == 2) {
                linearLayout0.setGravity(1);
                while(v < arr_textView.length) {
                    TextView textView0 = arr_textView[v];
                    if(textView0 != null) {
                        textView0.setTextAlignment(4);
                    }
                    ++v;
                }
                return;
            }
            linearLayout0.setGravity(0x800003);
            while(v < arr_textView.length) {
                TextView textView1 = arr_textView[v];
                if(textView1 != null) {
                    textView1.setTextAlignment(5);
                }
                ++v;
            }
        }
    }

    public static boolean i(AppTheme appTheme0) {
        return hzxi.c() && appTheme0.e == 1;
    }

    public static void j(fcdy fcdy0) {
        AppTheme appTheme0 = fcdy0.a;
        if(appTheme0.a == 0) {
            fcdy0.a(1);
        }
        if(appTheme0.b == 0) {
            fcdy0.b(1);
        }
        if(appTheme0.c == 0) {
            fcdy0.c(1);
        }
        if(appTheme0.d == 0) {
            fcdy0.d(3);
        }
    }
}

