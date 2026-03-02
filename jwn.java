import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public final class jwn {
    public static final jwo a(jwo jwo0) {
        if(TextUtils.isEmpty(jwo0.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        if(jwo0.c != null && jwo0.c.length != 0) {
            return jwo0;
        }
        throw new IllegalArgumentException("Shortcut must have an intent");
    }

    public static final void b(ComponentName componentName0, jwo jwo0) {
        jwo0.d = componentName0;
    }

    public static final void c(IconCompat iconCompat0, jwo jwo0) {
        jwo0.h = iconCompat0;
    }

    public static final void d(int v, jwo jwo0) {
        jwo0.m = v;
    }

    public static final void e(CharSequence charSequence0, jwo jwo0) {
        jwo0.e = charSequence0;
    }

    public static final void f(Intent intent0, jwo jwo0) {
        jwo0.c = new Intent[]{intent0};
    }
}

