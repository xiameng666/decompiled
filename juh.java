import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class juh {
    final Bundle a;
    public final jvz[] b;
    public boolean c;
    boolean d;
    public final int e;
    public final boolean f;
    @Deprecated
    public int g;
    public CharSequence h;
    public PendingIntent i;
    public boolean j;
    private IconCompat k;

    public juh(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
        this((v == 0 ? null : IconCompat.j(null, "", v)), charSequence0, pendingIntent0);
    }

    public juh(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0) {
        this(iconCompat0, charSequence0, pendingIntent0, new Bundle(), null, true, 0, true, false, false);
    }

    public juh(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, jvz[] arr_jvz, boolean z, int v, boolean z1, boolean z2, boolean z3) {
        this.d = true;
        this.k = iconCompat0;
        if(iconCompat0 != null && (iconCompat0.b == -1 ? jxx.b(iconCompat0.c) : iconCompat0.b) == 2) {
            this.g = iconCompat0.a();
        }
        this.h = juo.c(charSequence0);
        this.i = pendingIntent0;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.a = bundle0;
        this.b = arr_jvz;
        this.c = z;
        this.e = v;
        this.d = z1;
        this.f = z2;
        this.j = z3;
    }

    public final IconCompat a() {
        if(this.k == null) {
            int v = this.g;
            if(v != 0) {
                this.k = IconCompat.j(null, "", v);
            }
        }
        return this.k;
    }
}

