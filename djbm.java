import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.PowerManager;
import android.util.TypedValue;
import android.view.Display;

public final class djbm {
    public static int a(Context context0) {
        return djbm.n(context0, 0x7F040296);  // attr:colorAccent
    }

    public static int b(Context context0) {
        return kgq.r(((xiy)context0).getWindowManager().getCurrentWindowMetrics().getWindowInsets()).f(0x207).e;
    }

    public static int c(Context context0) {
        return djbm.n(context0, 0x1010406);
    }

    public static int d(Context context0) {
        if(Long.compare(hvqs.u(), 0L) != 0) {
            switch(((int)hvqs.u())) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                case 3: {
                    return 3;
                }
                case 4: {
                    return 4;
                }
                case 5: {
                    return 5;
                }
                case 6: {
                    return 6;
                }
                default: {
                    dcvz.a.e().h("Unknown device type override %d", Long.valueOf(hvqs.u()));
                }
            }
        }
        hvqz hvqz0 = hvqz.a;
        if(hvqz0.b().bn() && context0.getPackageManager().hasSystemFeature("android.software.xr.api.spatial")) {
            return 6;
        }
        if(!context0.getPackageManager().hasSystemFeature("org.chromium.arc") && !context0.getPackageManager().hasSystemFeature("com.google.desktop.gms")) {
            if(djbm.j(context0)) {
                SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
                if(sensorManager0 != null && sensorManager0.getDefaultSensor(36) != null) {
                    return hvqz0.b().bm() ? 5 : 1;
                }
                return 2;
            }
            return 1;
        }
        return 3;
    }

    public static int e(Context context0, float f) {
        return (int)TypedValue.applyDimension(1, f, context0.getResources().getDisplayMetrics());
    }

    public static Drawable f(Context context0, Bitmap bitmap0, float f) {
        int v = djbm.e(context0, f);
        Bitmap bitmap1 = dizk.c(bitmap0, v, v);
        return new BitmapDrawable(context0.getResources(), bitmap1);
    }

    public static boolean g() {
        return gfqz.e("samsung", Build.MANUFACTURER);
    }

    public static boolean h(Context context0) {
        if(!djbm.g()) {
            return false;
        }
        Configuration configuration0 = context0.getResources().getConfiguration();
        try {
            Class class0 = configuration0.getClass();
            if(class0.getField("SEM_DESKTOP_MODE_ENABLED").getInt(class0) == class0.getField("semDesktopModeEnabled").getInt(configuration0)) {
                return true;
            }
        }
        catch(NoSuchFieldException | IllegalAccessException | IllegalArgumentException unused_ex) {
        }
        return false;
    }

    public static boolean i(Context context0) {
        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        boolean z = powerManager0 != null && powerManager0.isInteractive() && (keyguardManager0 == null || !keyguardManager0.isKeyguardLocked());
        Display display0 = ((DisplayManager)context0.getSystemService(DisplayManager.class)).getDisplay(0);
        return display0 == null ? z : z && display0.getState() != 1;
    }

    public static boolean j(Context context0) {
        return context0.getResources().getBoolean(0x7F050025);  // bool:isTablet
    }

    public static Drawable k(Context context0) {
        Drawable drawable0 = context0.getResources().getDrawable(0x7F080ED3);  // drawable:sharing_common_progress_waiting
        if(drawable0 != null) {
            return drawable0;
        }
        throw new IllegalArgumentException("Drawable 2131234515 not found");
    }

    public static int l(Context context0) {
        int v;
        Resources resources0 = context0.getResources();
        try {
            v = resources0.getIdentifier("config_navBarInteractionMode", "integer", "android");
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            dcvz.a.e().f(resources$NotFoundException0).p("Failed to get system resource ID. Incompatible framework version?", new Object[0]);
            return -1;
        }
        if(v != 0) {
            try {
                return resources0.getInteger(v);
            }
            catch(Resources.NotFoundException resources$NotFoundException1) {
                dcvz.a.e().f(resources$NotFoundException1).p("Failed to get system resource ID. Incompatible framework version?", new Object[0]);
                return -1;
            }
        }
        dcvz.a.e().p("Failed to get system resource ID. Incompatible framework version?", new Object[0]);
        return -1;
    }

    public static int m(Context context0) {
        int v = djbm.d(context0);
        if(v != 1) {
            switch(v) {
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 5: {
                    return 6;
                }
                case 6: {
                    return 7;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    private static int n(Context context0, int v) {
        int v2;
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{v});
        try {
            v2 = typedArray0.getColor(0, 0);
        }
        finally {
            typedArray0.recycle();
        }
        return v2;
    }
}

