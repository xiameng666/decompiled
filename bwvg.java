import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.HashSet;
import java.util.Set;

public final class bwvg {
    public final Context a;
    public final bwzn b;
    public final bwuj c;
    public final Set d;
    public final Set e;
    public final Object f;
    public final bwmx g;
    private final bwuc h;
    private final bwts i;
    private final bwtl j;
    private final NativeIndex k;
    private final bwqf l;

    public bwvg(Context context0, bwmx bwmx0, bwzn bwzn0, bwuj bwuj0, bwuc bwuc0, bwts bwts0, bwtl bwtl0, NativeIndex nativeIndex0, bwqf bwqf0) {
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new Object();
        this.a = context0;
        this.g = bwmx0;
        this.b = bwzn0;
        this.c = bwuj0;
        this.h = bwuc0;
        this.i = bwts0;
        this.j = bwtl0;
        this.k = nativeIndex0;
        this.l = bwqf0;
    }

    public final void a(bwvl bwvl0) {
        this.b(bwvl0, 300000L);
    }

    public final void b(bwvl bwvl0, long v) {
        String s;
        String s2;
        String s1;
        synchronized(this.c.b.p()) {
            s = this.c.b.q(bwvl0);
            bwnq bwnq0 = this.c.b.c(bwvl0);
            if(bwnq0 == null) {
                s1 = null;
                s2 = null;
            }
            else {
                s1 = bwnq0.d;
                s2 = bwnq0.f;
            }
        }
        if(s2 != null && s1 != null) {
            if(bwvl0 == null) {
                bwne.g("Corpus doesn\'t exist: %s", null);
                return;
            }
            if(s == null) {
                bwne.g("Corpus incarnation doesn\'t exist: %s", bwvl0.c());
                return;
            }
            synchronized(this.f) {
                Set set0 = this.d;
                if(!set0.contains(s)) {
                    set0.add(s);
                    bwvf bwvf0 = new bwvf(this, s2, s1, s);
                    bwvd bwvd0 = new bwvd(this.a, this.b, this.c, this.h, this.i, this.j, this.k, this.l, s2, bwvl0, s, v, bwvf0, null);
                    this.b.h(bwvd0);
                    return;
                }
            }
            return;
        }
        bwne.g("Corpus doesn\'t exist: %s", bwvl0);
    }
}

