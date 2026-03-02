import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class pc {
    public static final PorterDuff.Mode a;
    private static pc b;
    private ut c;

    static {
        pc.a = PorterDuff.Mode.SRC_IN;
    }

    final ColorStateList a(Context context0, int v) {
        ColorStateList colorStateList0;
        synchronized(this) {
            colorStateList0 = this.c.a(context0, v);
        }
        return colorStateList0;
    }

    public static PorterDuffColorFilter b(int v, PorterDuff.Mode porterDuff$Mode0) {
        PorterDuffColorFilter porterDuffColorFilter0;
        synchronized(pc.class) {
            porterDuffColorFilter0 = ut.b(v, porterDuff$Mode0);
        }
        return porterDuffColorFilter0;
    }

    public final Drawable c(Context context0, int v) {
        Drawable drawable0;
        synchronized(this) {
            drawable0 = this.c.c(context0, v);
        }
        return drawable0;
    }

    public static pc d() {
        synchronized(pc.class) {
            if(pc.b == null) {
                pc.f();
            }
        }
        return pc.b;
    }

    public final void e(Context context0) {
        synchronized(this) {
            this.c.f(context0);
        }
    }

    public static void f() {
        synchronized(pc.class) {
            if(pc.b == null) {
                pc pc0 = new pc();
                pc.b = pc0;
                pc0.c = ut.e();
                pc.b.c.h(new pb());
            }
        }
    }

    final Drawable g(Context context0, int v) {
        Drawable drawable0;
        synchronized(this) {
            drawable0 = this.c.d(context0, v, true);
        }
        return drawable0;
    }
}

