import android.view.Surface;
import j..util.Objects;
import java.util.concurrent.Executor;

public final class bsh implements bpa {
    public final bss a;
    public final bsr b;
    public final int c;
    public final bdq d;
    public final bdq e;

    public bsh(bss bss0, bsr bsr0, int v, bdq bdq0, bdq bdq1) {
        this.a = bss0;
        this.b = bsr0;
        this.c = v;
        this.d = bdq0;
        this.e = bdq1;
    }

    @Override  // bpa
    public final gmcd a(Object object0) {
        kay.i(((Surface)object0));
        bsr bsr0 = this.b;
        try {
            bsr0.f();
        }
        catch(bjy bjy0) {
            return new bpu(bjy0);
        }
        bsv bsv0 = new bsv(((Surface)object0), this.c, this.a.g.b, this.d, this.e);
        Objects.requireNonNull(bsr0);
        bsm bsm0 = new bsm(bsr0);
        Executor executor0 = bol.a();
        bsv0.c.hB(bsm0, executor0);
        kay.d(bsr0.q == null, "Consumer can only be linked once.");
        bsr0.q = bsv0;
        return bpt.b(bsv0);
    }
}

