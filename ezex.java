import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import java.text.BreakIterator;
import java.util.Set;

public final class ezex {
    public static final ggeo a;
    public static final ggeo b;
    public final Context c;
    public final String d;
    public final Bundle e;
    public final KeyguardManager f;

    static {
        ezex.a = ggeo.n("Bluetooth", awkv.bg, "PhonePosition", awkv.bh, "Place", awkv.bi);
        ezex.b = ggeo.n("Bluetooth", bbdi.gx, "PhonePosition", bbdi.gy, "Place", bbdi.gz);
    }

    public ezex(Context context0, String s, Bundle bundle0) {
        this.c = context0;
        this.d = s;
        this.e = bundle0;
        this.f = (KeyguardManager)context0.getSystemService("keyguard");
    }

    public final void a(Set set0, BreakIterator breakIterator0, String s) {
        breakIterator0.setText(s);
        int v = breakIterator0.first();
        for(int v1 = breakIterator0.next(); true; v1 = breakIterator0.next()) {
            int v2 = v;
            v = v1;
            if(v == -1) {
                break;
            }
            String s1 = s.substring(v2, v);
            if(!bbqr.d(s1)) {
                set0.add(s1);
            }
        }
    }
}

