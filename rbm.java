import android.content.Context;

final class rbm {
    public final Context a;
    public final rdd b;
    public final rck c;
    public final rbl d;
    public final rbl e;
    public boolean f;

    public rbm(Context context0, rdd rdd0, rck rck0) {
        this.a = context0;
        this.b = rdd0;
        this.c = rck0;
        this.d = new rbl(this, true);
        this.e = new rbl(this, false);
    }
}

