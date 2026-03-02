import android.content.Context;
import android.provider.Settings.Global;
import java.util.concurrent.Executor;

public final class ereg {
    public static final erqc a;
    public final erop b;
    public final Context c;
    private final Executor d;

    static {
        ereg.a = new erqc(new String[]{"RestoreInfoStoreHelper"});
    }

    public ereg(Context context0) {
        this.b = new erop(context0);
        this.d = gmap.a;
        this.c = context0;
    }

    public final void a(gmcd gmcd0) {
        gmbu.t(gmcd0, new eref(this), this.d);
    }

    public final void b(byte b) {
        Settings.Global.putInt(this.c.getContentResolver(), "quick_start_flow_type", ((int)b));
        eroo eroo0 = new eroo(b);
        this.a(this.b.a.b(eroo0, gmap.a));
    }

    public final void c(byte b) {
        erom erom0 = new erom(b);
        this.a(this.b.a.b(erom0, gmap.a));
    }
}

