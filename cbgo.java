import android.content.Context;

public final class cbgo {
    public final Context a;
    public final ibrt b;

    public cbgo(Context context0, ibrt ibrt0) {
        ibuq.f(context0, "context");
        ibuq.f(ibrt0, "blockingContext");
        super();
        this.a = context0;
        this.b = ibrt0;
    }

    public final Object a(ibrl ibrl0) {
        cbgn cbgn0 = new cbgn(this, null);
        return icbd.a(this.b, cbgn0, ibrl0);
    }
}

