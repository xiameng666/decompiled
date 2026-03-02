import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class juf {
    public boolean a;
    public final Bundle b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final IconCompat g;
    private final CharSequence h;
    private final PendingIntent i;
    private ArrayList j;

    public juf(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
        this((v == 0 ? null : IconCompat.j(null, "", v)), charSequence0, pendingIntent0, new Bundle());
    }

    public juf(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0) {
        this(iconCompat0, charSequence0, pendingIntent0, new Bundle());
    }

    private juf(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0) {
        this.a = true;
        this.d = true;
        this.g = iconCompat0;
        this.h = juo.c(charSequence0);
        this.i = pendingIntent0;
        this.b = bundle0;
        this.j = null;
        this.a = true;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.f = false;
    }

    public final juh a() {
        if(this.e && this.i == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = this.j;
        if(arrayList2 != null) {
            int v = arrayList2.size();
            for(int v1 = 0; v1 < v; ++v1) {
                jvz jvz0 = (jvz)arrayList2.get(v1);
                if(!jvz0.d && ((jvz0.c == null || jvz0.c.length == 0) && !jvz0.g.isEmpty())) {
                    arrayList0.add(jvz0);
                }
                else {
                    arrayList1.add(jvz0);
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            jvz[] arr_jvz = (jvz[])arrayList0.toArray(new jvz[arrayList0.size()]);
        }
        return arrayList1.isEmpty() ? new juh(this.g, this.h, this.i, this.b, null, this.a, this.c, this.d, this.e, this.f) : new juh(this.g, this.h, this.i, this.b, ((jvz[])arrayList1.toArray(new jvz[arrayList1.size()])), this.a, this.c, this.d, this.e, this.f);
    }

    public final void b(jvz jvz0) {
        if(this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(jvz0);
    }

    public final void c(jug jug0) {
        Bundle bundle0 = new Bundle();
        int v = jug0.a;
        if(v != 1) {
            bundle0.putInt("flags", v);
        }
        this.b.putBundle("android.wearable.EXTENSIONS", bundle0);
    }
}

