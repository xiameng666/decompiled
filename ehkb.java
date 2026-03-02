import android.content.Context;

public final class ehkb {
    private final ayud a;

    public ehkb(Context context0, String s) {
        ayud ayud0 = new aytt(context0, s).a();
        super();
        this.a = ayud0;
    }

    public final void a(String s, MessageLite hfvm0, int v) {
        synchronized(this) {
            ayuc ayuc0 = this.a.i(hfvm0);
            ayuc0.o(s);
            ayuc0.k = hlqe.b(v);
            ayuc0.d();
        }
    }
}

