import android.content.Context;

public final class esxo implements esxp {
    public final esxq a;
    public final Context b;
    public final int c;

    public esxo(esxq esxq0, Context context0, int v) {
        this.a = esxq0;
        this.b = context0;
        this.c = v;
    }

    @Override  // esxp
    public final void a(esyn esyn0) {
        esyn0.a(this.b, this.a.b, this.c);
    }
}

