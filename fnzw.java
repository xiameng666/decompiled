import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class fnzw {
    public Context a;
    public fodo b;
    public fnxq c;
    private foag d;
    private fnjd e;
    private ExecutorService f;
    private fngf g;
    private fobh h;
    private ficq i;
    private gfsx j;

    public fnzw() {
        throw null;
    }

    public fnzw(byte[] arr_b) {
        this.j = gfqx.a;
    }

    public final fnzx a() {
        if(!this.c().i()) {
            this.d(Executors.newCachedThreadPool(fnwu.a()));
        }
        Object object0 = this.c().d();
        fnjd fnjd0 = new fnjd(this.b().a);
        this.e = fnjd0;
        this.d = new foag(fnjd0, this.b().a);
        this.b();
        gftb.check(this.b().b);
        this.g = new fngs(this.a, ((ExecutorService)object0), this.b().a, this.b().b);
        fobh fobh0 = this.h;
        gfsx gfsx0 = fobh0 == null ? gfqx.a : gfsx.m(fobh0);
        if(!gfsx0.i()) {
            this.h = new fobg(this.b().a, this.a);
        }
        ficq ficq0 = this.i;
        if(ficq0 == null) {
            throw new IllegalStateException("Property \"vePrimitives\" has not been set");
        }
        if(!(ficq0 instanceof ficp)) {
            this.b = new fodr(this.b().a, fnjd0, ficq0, this.j, ((gful_cronetEngineProvider)new fodp()));
        }
        foag foag0 = this.d;
        if(foag0 != null) {
            fnjd fnjd1 = this.e;
            if(fnjd1 != null) {
                ExecutorService executorService0 = this.f;
                if(executorService0 != null) {
                    fngf fngf0 = this.g;
                    if(fngf0 != null) {
                        fobh fobh1 = this.h;
                        if(fobh1 != null) {
                            ficq ficq1 = this.i;
                            if(ficq1 != null) {
                                fodo fodo0 = this.b;
                                if(fodo0 != null) {
                                    fnxq fnxq0 = this.c;
                                    if(fnxq0 != null) {
                                        return new fnzx(foag0, fnjd1, executorService0, fngf0, fobh1, ficq1, fodo0, fnxq0, this.j);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.d == null) {
            stringBuilder0.append(" limitedAvailableAccountsModel");
        }
        if(this.e == null) {
            stringBuilder0.append(" internalAccountsModel");
        }
        if(this.f == null) {
            stringBuilder0.append(" backgroundExecutor");
        }
        if(this.g == null) {
            stringBuilder0.append(" avatarImageLoader");
        }
        if(this.h == null) {
            stringBuilder0.append(" oneGoogleEventLogger");
        }
        if(this.i == null) {
            stringBuilder0.append(" vePrimitives");
        }
        if(this.b == null) {
            stringBuilder0.append(" visualElements");
        }
        if(this.c == null) {
            stringBuilder0.append(" accountLayer");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final fnxq b() {
        fnxq fnxq0 = this.c;
        if(fnxq0 != null) {
            return fnxq0;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    public final gfsx c() {
        ExecutorService executorService0 = this.f;
        return executorService0 == null ? gfqx.a : gfsx.m(executorService0);
    }

    public final void d(ExecutorService executorService0) {
        if(executorService0 == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        this.f = executorService0;
    }

    public final void e(ficq ficq0) {
        if(ficq0 == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        this.i = ficq0;
    }
}

