import java.util.List;

public final class bxmg implements gfsi {
    private final Class a;
    private final gftc b;
    private final gfsi c;

    public bxmg(Class class0, gftc gftc0, gfsi gfsi0) {
        gftb.check(gftc0);
        this.a = class0;
        this.b = gftc0;
        this.c = gfsi0;
    }

    public final bxmf a(Throwable throwable0) {
        if(!this.c(throwable0)) {
            return new bxmf(false, null);
        }
        Throwable throwable1 = (Throwable)this.a.cast(throwable0);
        return new bxmf(true, this.c.apply(throwable1));
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return this.a(((Throwable)object0));
    }

    public static bxmf b(Throwable throwable0, List list0) {
        for(Object object0: list0) {
            bxmf bxmf0 = ((bxmg)object0).a(throwable0);
            if(bxmf0.a) {
                return bxmf0;
            }
        }
        return new bxmf(false, null);
    }

    public final boolean c(Throwable throwable0) {
        Class class0 = this.a;
        if(!class0.isAssignableFrom(throwable0.getClass())) {
            return false;
        }
        Throwable throwable1 = (Throwable)class0.cast(throwable0);
        return this.b.a(throwable1);
    }
}

