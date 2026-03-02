import android.content.Context;
import dagger.Lazy;
import dagger.internal.InstanceFactory;
import java.util.concurrent.Executor;

public final class fotj {
    public final fotf a;
    public final ibnf b;
    public final fpef c;
    public final ibnf d;
    public final Lazy e;
    private final foli f;
    private final Executor g;

    public fotj(fotf fotf0, ibnf ibnf0, foli foli0, fpeg fpeg0, ibnf ibnf1, Executor executor0, Lazy lazy0, ibnf ibnf2) {
        this.a = fotf0;
        this.f = foli0;
        this.b = ibnf0;
        this.g = executor0;
        this.d = new foth(ibnf1);
        Context context0 = (Context)((InstanceFactory)fpeg0.a).a;
        context0.getClass();
        Executor executor1 = (Executor)fpeg0.b.get();
        executor1.getClass();
        fpek fpek0 = (fpek)fpeg0.c.get();
        fpek0.getClass();
        Boolean boolean0 = (Boolean)fpeg0.d.get();
        gfsx gfsx0 = (gfsx)((InstanceFactory)fpeg0.e).a;
        gfsx0.getClass();
        this.c = new fpef(context0, executor1, fpek0, lazy0, true, gfsx0, ibnf2, ((fpeb)fpeg0.f).a());
        this.e = lazy0;
    }

    public final long a(String s) {
        if(!this.f.a) {
            fpef fpef0 = this.c;
            if(fpef0.c.b()) {
                return -1L;
            }
            return fpef0.b ? fpef0.a.a(s) : -1L;
        }
        return -1L;
    }

    public final gmcd b(fotb fotb0) {
        return this.f.a ? gmbu.g() : gmbu.n(new foti(this, fotb0), this.g);
    }

    public final boolean c(String s) {
        return this.a(s) != -1L;
    }

    public final boolean d() {
        return this.c.b && this.c.a.d();
    }
}

