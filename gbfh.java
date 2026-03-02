import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;

public class gbfh extends jxh {
    public hdtb a;
    private int b;
    private boolean c;

    @Override  // jxh
    public final void a(int v) {
    }

    @Override  // jxh
    public final void b(Typeface typeface0) {
        this.f(Typeface.create(typeface0, (this.c ? 2 : 0)));
        hdtb hdtb0 = this.a;
        if(hdtb0 != null) {
            this.g(this.b, hdtb0.c, hdtb0.d);
        }
    }

    public void f(Typeface typeface0) {
    }

    public void g(int v, int v1, int v2) {
    }

    public final void h(Context context0, int v, boolean z, int v1) {
        try {
            this.b = v1;
            this.c = z;
            gaxl.a();
            if(hzlv.a.b().P()) {
                Typeface typeface0 = jxi.a(context0, v);
                if(typeface0 != null) {
                    this.b(typeface0);
                    return;
                }
                jxi.c(context0, v, this);
                return;
            }
            jxi.c(context0, v, this);
        }
        catch(Resources.NotFoundException unused_ex) {
        }
    }
}

