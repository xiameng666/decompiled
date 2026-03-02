import android.graphics.Matrix;
import android.graphics.Rect;

public final class bbi implements Runnable {
    public final bbk a;
    public final bcn b;
    public final Matrix c;
    public final bcn d;
    public final Rect e;
    public final bbc f;
    public final jqt g;

    public bbi(bbk bbk0, bcn bcn0, Matrix matrix0, bcn bcn1, Rect rect0, bbc bbc0, jqt jqt0) {
        this.a = bbk0;
        this.b = bcn0;
        this.c = matrix0;
        this.d = bcn1;
        this.e = rect0;
        this.f = bbc0;
        this.g = jqt0;
    }

    @Override
    public final void run() {
        jqt jqt0 = this.g;
        bbk bbk0 = this.a;
        if(bbk0.m) {
            bms bms0 = this.b.e().d();
            long v = this.b.e().c();
            int v1 = bbk0.c ? 0 : bbk0.a;
            Rect rect0 = this.e;
            int v2 = this.b.e().a();
            bcq bcq0 = new bcq(bms0, v, v1, this.c, v2);
            bdo bdo0 = new bdo(this.d, bcq0);
            if(!rect0.isEmpty()) {
                bdo0.f(rect0);
            }
            this.f.a(bdo0);
            jqt0.b(null);
            return;
        }
        jqt0.c(new jzf("ImageAnalysis is detached"));
    }
}

