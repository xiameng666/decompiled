import android.content.Context;

final class ci extends cl {
    private final boolean b;
    private boolean c;
    private eb d;

    public ci(gw gw0, boolean z) {
        ibuq.f(gw0, "operation");
        super(gw0);
        this.b = z;
    }

    public final eb a(Context context0) {
        ibuq.f(context0, "context");
        if(this.c) {
            return this.d;
        }
        eb eb0 = ed.a(context0, this.a.c, this.a.a == gv.b, this.b);
        this.d = eb0;
        this.c = true;
        return eb0;
    }
}

