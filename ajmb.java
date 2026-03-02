import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.LinkedList;
import java.util.List;

public final class ajmb {
    public static final bboh a;
    public final Object b;
    public final Context c;
    public final ajly d;
    public final List e;
    public BroadcastReceiver f;
    private static ajmb g;

    static {
        ajmb.a = ajlr.a("TrustStateTracker");
    }

    private ajmb(Context context0) {
        ajly ajly0 = new ajly(context0);
        super();
        batl.s(context0);
        this.c = context0;
        this.e = new LinkedList();
        this.b = new Object();
        this.d = ajly0;
    }

    public static ajmb a(Context context0) {
        synchronized(ajmb.class) {
            if(ajmb.g == null) {
                ajmb.g = new ajmb(context0.getApplicationContext());
            }
        }
        return ajmb.g;
    }
}

