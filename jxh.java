import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class jxh {
    // Detected as a lambda impl.
    public abstract void a(int arg1);

    // Detected as a lambda impl.
    public abstract void b(Typeface arg1);

    public final void c(int v) {
        jxh.e().post(() -> ;);
    }

    public final void d(Typeface typeface0) {
        jxh.e().post(() -> ;);
    }

    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }
}

