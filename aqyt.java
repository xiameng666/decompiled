import android.content.Context;
import java.util.Collection;

public final class aqyt {
    private static final baun a;
    private final Context b;

    static {
        aqyt.a = aqql.a("ComponentEnablerUtil");
    }

    public aqyt(Context context0) {
        this.b = context0;
    }

    public final void a(String s, boolean z) {
        Context context0 = this.b;
        int v = bbmq.a(context0, s);
        if(!(z ? v != 1 : v != 2)) {
            return;
        }
        try {
            bbmq.G(context0, s, z);
        }
        catch(IllegalArgumentException unused_ex) {
            aqyt.a.m("Unable to set component \'%s\' to enabled=%b", new Object[]{s, Boolean.valueOf(z)});
        }
    }

    public final void b(Collection collection0, boolean z) {
        for(Object object0: collection0) {
            this.a(((String)object0), z);
        }
    }

    public final void c(String[] arr_s, boolean z) {
        for(int v = 0; v < arr_s.length; ++v) {
            this.a(arr_s[v], z);
        }
    }
}

