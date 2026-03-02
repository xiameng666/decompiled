import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public final class cyuu {
    private final cjpc a;

    public cyuu(Context context0) {
        cjpc cjpc0 = cygf.a(context0);
        super();
        this.a = cjpc0;
    }

    public final Set a(String s) {
        Set set0;
        synchronized(this) {
            set0 = new HashSet(this.c());
            if(set0.add(s)) {
                cjpa cjpa0 = this.a.c();
                cjpa0.i("ACL_CONNECTED_DEVICES", set0);
                cygf.b(cjpa0);
            }
        }
        return set0;
    }

    public final Set b(String s) {
        Set set0;
        synchronized(this) {
            set0 = new HashSet(this.d());
            if(set0.add(s)) {
                cjpa cjpa0 = this.a.c();
                cjpa0.i("IS_DISABLED_BY_FAST_PAIR", set0);
                cygf.b(cjpa0);
            }
        }
        return set0;
    }

    public final Set c() {
        Set set0;
        synchronized(this) {
            HashSet hashSet0 = new HashSet();
            set0 = cjpd.e(this.a, "ACL_CONNECTED_DEVICES", hashSet0);
        }
        return set0;
    }

    public final Set d() {
        Set set0;
        synchronized(this) {
            HashSet hashSet0 = new HashSet();
            set0 = cjpd.e(this.a, "IS_DISABLED_BY_FAST_PAIR", hashSet0);
        }
        return set0;
    }

    public final Set e(String s) {
        Set set0;
        synchronized(this) {
            set0 = new HashSet(this.c());
            if(set0.remove(s)) {
                cjpa cjpa0 = this.a.c();
                cjpa0.i("ACL_CONNECTED_DEVICES", set0);
                cygf.b(cjpa0);
            }
        }
        return set0;
    }

    public final Set f(String s) {
        Set set0;
        synchronized(this) {
            set0 = new HashSet(this.d());
            if(set0.remove(s)) {
                cjpa cjpa0 = this.a.c();
                cjpa0.i("IS_DISABLED_BY_FAST_PAIR", set0);
                cygf.b(cjpa0);
            }
        }
        return set0;
    }

    public final void g() {
        synchronized(this) {
            cjpa cjpa0 = this.a.c();
            cjpa0.j("ACL_CONNECTED_DEVICES");
            cygf.b(cjpa0);
        }
    }

    public final void h() {
        synchronized(this) {
            cjpa cjpa0 = this.a.c();
            cjpa0.j("IS_DISABLED_BY_FAST_PAIR");
            cygf.b(cjpa0);
        }
    }
}

