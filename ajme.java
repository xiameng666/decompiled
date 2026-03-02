import android.app.KeyguardManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ajme {
    public static final bboh a = null;
    public final KeyguardManager b;
    public final ajmc c;
    public final Object d;
    public final ajlv e;
    public final List f;
    public int g;
    private static final String h = "ajme";
    private static ajme i;

    static {
        ajme.a = bboh.b("ajme", bbcu.dK);
    }

    public ajme(Context context0) {
        this.b = (KeyguardManager)context0.getSystemService("keyguard");
        this.c = ajmc.a(context0);
        this.f = new LinkedList();
        this.e = new ajlv(context0);
        this.d = new Object();
        this.g = 0;
    }

    public static ajme a(Context context0) {
        synchronized(ajme.class) {
            if(ajme.i == null) {
                ajme.i = new ajme(context0.getApplicationContext());
            }
        }
        return ajme.i;
    }

    public final void b(boolean z) {
        int v = 1;
        synchronized(this.d) {
            int v2 = z || !this.b.inKeyguardRestrictedInputMode() ? 1 : 0;
            if(1 == v2) {
                v = 2;
            }
            if(v == this.g) {
                return;
            }
            this.g = v;
            if(v2 == 0) {
                for(Object object2: new ArrayList(this.f)) {
                    ((ajmd)object2).b();
                }
            }
            else {
                for(Object object1: new ArrayList(this.f)) {
                    ((ajmd)object1).c();
                }
            }
        }
    }
}

