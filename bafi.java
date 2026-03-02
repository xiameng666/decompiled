import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public final class bafi {
    public static int a(int v, Context context0) {
        if(v >= 0) {
            return v;
        }
        if(hoxq.a.b().b() && jys.d() && context0.getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            UserManager userManager0 = (UserManager)context0.getSystemService("user");
            if(userManager0 != null && userManager0.isUserOfType("android.os.usertype.profile.COMMUNAL")) {
                return 5;
            }
        }
        if(bbnp.c(context0)) {
            return 2;
        }
        hpaj.d();
        return 0;
    }

    public static boolean b(int v, Context context0) {
        switch(bafi.a(v, context0)) {
            case 2: 
            case 3: 
            case 5: {
                return true;
            }
            case 6: {
                return hpaj.d();
            }
            default: {
                return false;
            }
        }
    }

    public static boolean c() {
        return !hpaj.a.c().b().b.contains(Build.MANUFACTURER);
    }
}

