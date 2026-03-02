import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

public final class ats {
    public static final Object a;
    public volatile Size b;
    private static final Size c;
    private static final Size d;
    private static final Size e;
    private static volatile ats f;
    private final DisplayManager g;
    private final DisplayManager.DisplayListener h;
    private volatile Display[] i;
    private final aye j;
    private final axy k;

    static {
        ats.c = new Size(0x780, 1080);
        ats.d = new Size(320, 0xF0);
        ats.e = new Size(640, 480);
        ats.a = new Object();
    }

    private ats(Context context0) {
        this.h = new atr(this);
        this.i = null;
        this.b = null;
        this.j = new aye();
        this.k = new axy();
        this.g = (DisplayManager)context0.getSystemService("display");
    }

    public final Size a() {
        Point point0 = new Point();
        this.c(false).getRealSize(point0);
        Size size0 = new Size(point0.x, point0.y);
        if(bri.a(size0) < bri.a(ats.d)) {
            size0 = this.k.a == null ? null : ((Size)SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.US)));
            if(size0 == null) {
                size0 = ats.e;
            }
        }
        if(size0.getHeight() > size0.getWidth()) {
            size0 = new Size(size0.getHeight(), size0.getWidth());
        }
        int v = size0.getWidth() * size0.getHeight();
        Size size1 = ats.c;
        if(v > size1.getWidth() * size1.getHeight()) {
            size0 = size1;
        }
        if(this.j.a != null) {
            Size size2 = ExtraCroppingQuirk.b(bmo.a);
            return size2 == null || size2.getWidth() * size2.getHeight() <= size0.getWidth() * size0.getHeight() ? size0 : size2;
        }
        return size0;
    }

    final Size b() {
        synchronized(ats.a) {
            if(this.b != null) {
                return this.b;
            }
            this.b = this.a();
        }
        return this.b;
    }

    public final Display c(boolean z) {
        Display[] arr_display;
        synchronized(ats.a) {
            if(this.i == null) {
                this.i = this.g.getDisplays();
            }
            arr_display = this.i;
        }
        if(arr_display.length == 1) {
            return arr_display[0];
        }
        Display display0 = ats.g(arr_display, z);
        if(display0 == null && z) {
            display0 = ats.g(arr_display, false);
        }
        if(display0 != null) {
            return display0;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public static ats d(Context context0) {
        if(ats.f == null) {
            Object object0 = ats.a;
            synchronized(object0) {
                if(ats.f == null) {
                    ats.f = new ats(context0);
                    ats.f.g.registerDisplayListener(ats.f.h, new Handler(Looper.getMainLooper()));
                }
            }
            return ats.f;
        }
        return ats.f;
    }

    static void e(ats ats0) {
        ats0.i = null;
    }

    static void f(ats ats0) {
        ats0.b = null;
    }

    private static final Display g(Display[] arr_display, boolean z) {
        int v1 = -1;
        Display display0 = null;
        for(int v = 0; v < arr_display.length; ++v) {
            Display display1 = arr_display[v];
            if(!z || display1.getState() != 1) {
                Point point0 = new Point();
                display1.getRealSize(point0);
                if(point0.x * point0.y > v1) {
                    v1 = point0.x * point0.y;
                    display0 = display1;
                }
            }
        }
        return display0;
    }
}

