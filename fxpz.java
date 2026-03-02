import android.content.Context;

public final class fxpz {
    public final Context a;
    public fxqc b;
    public final bzs c;

    public fxpz(Context context0) {
        this.c = new bzs();
        this.a = context0;
    }

    public final void a() {
        this.b();
        this.c();
    }

    public final void b() {
        fxqc fxqc0 = this.b;
        if(fxqc0 != null) {
            fxqc0.c();
            this.b = null;
        }
    }

    public final void c() {
        bzs bzs0;
        for(int v = 0; true; ++v) {
            bzs0 = this.c;
            if(v >= bzs0.d_num) {
                break;
            }
            ((fxqc)bzs0.i(v)).c();
        }
        bzs0.clear();
    }
}

