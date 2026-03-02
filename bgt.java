import android.graphics.Matrix;
import android.graphics.Rect;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class bgt {
    public final int a;
    public final bca b;
    public final bca c;
    public final Rect d;
    public final int e;
    public final int f;
    public final Matrix g;
    public final String h;
    public final List i;
    final gmcd j;
    public int k;
    public final bgw l;

    public bgt(bjl bjl0, bhe bhe0, bgw bgw0, gmcd gmcd0, int v) {
        this.k = -1;
        this.a = v;
        this.b = bhe0.h();
        this.c = bhe0.i();
        this.f = bhe0.b();
        this.e = bhe0.c();
        this.d = bhe0.e();
        this.g = bhe0.d();
        this.l = bgw0;
        this.h = String.valueOf(bjl0.hashCode());
        this.i = new ArrayList();
        for(Object object0: ((List)Objects.requireNonNull(bjl0.a()))) {
            bjp bjp0 = (bjp)object0;
            this.i.add(Integer.valueOf(0));
        }
        this.j = gmcd0;
        bcs.h("ProcessingRequest");
    }

    final boolean a() {
        return this.l.e;
    }
}

