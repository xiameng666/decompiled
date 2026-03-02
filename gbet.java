import android.content.Context;

public final class gbet {
    public final gbdr a;
    public final Context b;
    public gbdp c;
    public int d;
    int e;
    boolean f;
    public gbxm g;
    public gass h;

    public gbet(Context context0, gbdr gbdr0) {
        this.a = gbdr0;
        this.b = context0;
    }

    public final void a() {
        this.f = true;
    }

    public final void b() {
        this.f = false;
    }

    public final void c() {
        this.e = this.d;
    }

    public final void d(hdry hdry0, boolean z) {
        if(this.c != null && this.c.g(hdry0) && gbcc.b(this.d, hdry0) != z) {
            this.d = z ? hdry0.g | this.d : ~hdry0.g & this.d;
            this.h.Y();
        }
    }

    public final boolean e(gbdq gbdq0, int[] arr_v) {
        boolean z = this.f;
        if(!z) {
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                int v2 = this.d;
                if(gbdq0.f(v1, this.e) != gbdq0.f(v1, v2)) {
                    return true;
                }
            }
        }
        return z;
    }
}

