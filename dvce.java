import android.content.Context;
import java.io.File;

public final class dvce implements ibth {
    public final dvcl a;
    public final Context b;
    public final File c;
    public final ibth d;

    public dvce(dvcl dvcl0, Context context0, File file0, ibth ibth0) {
        this.a = dvcl0;
        this.b = context0;
        this.c = file0;
        this.d = ibth0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.L(this.b, this.c);
        this.d.a();
        return ibom.a;
    }
}

