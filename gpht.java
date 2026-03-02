import java.util.Set;
import java.util.concurrent.Callable;

public final class gpht implements Callable {
    public final gpkt a;
    public final gphv b;
    public final gphs c;
    public final Set d;

    public gpht(gpkt gpkt0, gphv gphv0, gphs gphs0, Set set0) {
        this.a = gpkt0;
        this.b = gphv0;
        this.c = gphs0;
        this.d = set0;
    }

    @Override
    public final Object call() {
        return ((Boolean)this.a.b.j(gphu.a)).booleanValue() ? this.b.a(this.c, this.d) : this.b.b(this.c, this.d);
    }
}

