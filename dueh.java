import android.content.Context;
import android.content.Intent;

public final class dueh implements ibth {
    public final duew a;
    public final Context b;
    public final gtxf c;
    public final ibth d;

    public dueh(duew duew0, Context context0, gtxf gtxf0, ibth ibth0) {
        this.a = duew0;
        this.b = context0;
        this.c = gtxf0;
        this.d = ibth0;
    }

    @Override  // ibth
    public final Object a() {
        int v = dtzb.d(this.c);
        Intent intent0 = dlnf.bH(this.b, v);
        this.a.startActivity(intent0);
        this.d.a();
        return ibom.a;
    }
}

