import android.content.Context;
import android.net.ConnectivityManager;
import java.io.PrintWriter;

public final class ekup implements ekur {
    public int a;
    private final ggeo b;
    private final Context c;

    public ekup(Context context0) {
        ggek ggek0 = new ggek();
        ggek0.i(Integer.valueOf(3), new ekuo(this, 2, ggna.a));
        ggek0.i(Integer.valueOf(7), new ekuo(this, 1, gged_interceptors.l(Integer.valueOf(11))));
        this.b = ggek0.b();
        this.c = context0;
    }

    public final ConnectivityManager a() {
        return (ConnectivityManager)this.c.getSystemService("connectivity");
    }

    @Override  // ekur
    public final void b(PrintWriter printWriter0) {
        synchronized(this) {
            ekuq.a(printWriter0, this.a);
        }
    }

    @Override  // ekur
    public final void c(Context context0, int v) {
        synchronized(this) {
            ekuo ekuo0 = (ekuo)this.b.get(Integer.valueOf(v));
            if(ekuo0 != null) {
                this.a |= ekuo0.a;
                ekuo0.a(this.a());
            }
        }
    }
}

