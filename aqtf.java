import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aqtf {
    public final gful_cronetEngineProvider a;
    public final gful_cronetEngineProvider b;
    public final fpwn c;
    public final fpwo d;
    public final gful_cronetEngineProvider e;
    public final gful_cronetEngineProvider f;
    public final gful_cronetEngineProvider g;
    public final gful_cronetEngineProvider h;
    public final gful_cronetEngineProvider i;
    public final gful_cronetEngineProvider j;
    public final gful_cronetEngineProvider k;
    public final gful_cronetEngineProvider l;
    public final gful_cronetEngineProvider m;
    private final gful_cronetEngineProvider n;
    private final gful_cronetEngineProvider o;
    private final gful_cronetEngineProvider p;
    private final gful_cronetEngineProvider q;

    public aqtf(Context context0) {
        this(context0, new aqrd(context0, new bblp(3, 9)), new aquw(context0));
    }

    public aqtf(Context context0, aqrd aqrd0, aquw aquw0) {
        aqsr aqsr0 = new aqsr(context0);
        aqss aqss0 = new aqss(context0);
        aqst aqst0 = new aqst(context0, aquw0);
        aqsu aqsu0 = new aqsu(context0, aqrd0);
        aqsw aqsw0 = new aqsw(context0, aqrd0);
        aqsx aqsx0 = new aqsx(context0, aqrd0, aquw0);
        aqsy aqsy0 = new aqsy(context0);
        aqsz aqsz0 = new aqsz(context0);
        aqta aqta0 = new aqta(context0);
        super();
        this.a = gfus.a(((gful_cronetEngineProvider)new aqsq()));
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new aqsv()));
        this.n = gful0;
        this.b = gfus.a(((gful_cronetEngineProvider)new aqtb()));
        this.c = new fpwn(context0.getPackageManager(), ((gful_cronetEngineProvider)new aqsk()));
        this.d = fpwo.g(context0.getPackageManager(), gful0);
        this.e = gfus.a(((gful_cronetEngineProvider)aqsr0));
        this.f = gfus.a(((gful_cronetEngineProvider)aqss0));
        this.g = gfus.a(((gful_cronetEngineProvider)aqst0));
        this.h = gfus.a(((gful_cronetEngineProvider)aqsu0));
        this.i = gfus.a(((gful_cronetEngineProvider)aqsw0));
        this.j = gfus.a(((gful_cronetEngineProvider)aqsx0));
        this.p = gfus.a(((gful_cronetEngineProvider)aqsy0));
        this.l = gfus.a(((gful_cronetEngineProvider)aqsz0));
        this.m = gfus.a(((gful_cronetEngineProvider)aqta0));
        this.k = gfus.a(((gful_cronetEngineProvider)new aqtc(this)));
        this.o = gfus.a(((gful_cronetEngineProvider)new aqtd(this)));
        this.q = gfus.a(((gful_cronetEngineProvider)new aqte(this)));
    }

    public aqtf(Context context0, aquw aquw0) {
        this(context0, new aqrd(context0, new bblp(3, 9)), aquw0);
    }

    @Deprecated
    public final aqtk a() {
        return (aqtk)this.p.mr();
    }

    public final aqty b() {
        return (aqty)this.q.mr();
    }

    public final aqtz c() {
        return (aqtz)this.o.mr();
    }

    public static final boolean d(aqvg aqvg0) {
        try {
            aqvg0.b();
            return true;
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return false;
        }
    }
}

