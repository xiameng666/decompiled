import android.content.Context;
import android.os.Looper;

public final class gask {
    public final Context a;
    public final gasy b;
    public final boolean c;
    public final clht d;
    public boolean e;
    public boolean f;
    private final ibts g;

    public gask(Context context0, gasy gasy0) {
        gaxl.a();
        boolean z = hzmb.a.b().j();
        super();
        this.a = context0;
        this.b = gasy0;
        this.g = gasj.a;
        this.c = z;
        this.d = new clht(Looper.getMainLooper());
    }

    public final void a() {
        if(this.e) {
            this.g.a(this);
        }
        else if(this.f) {
            int v = this.b.c.d.size();
            gass gass0 = v == 0 ? null : ((gatb)this.b.c.d.get(v - 1)).f;
            if(gass0 == null || !gass0.ax()) {
                this.g.a(this);
            }
        }
        this.e = false;
        this.f = false;
    }
}

