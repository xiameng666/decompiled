import android.content.Intent;

public final class bdcd implements bdbm {
    public final aysr a;
    public final Intent b;

    public bdcd(aysr aysr0, String s) {
        this.a = aysr0;
        this.b = new Intent().putExtra("component_name", "MultipassPasswordManager").setPackage(s);
    }

    @Override  // bdbm
    public final evql a(MessageLite hfvm0) {
        return this.h(new bdby(this, hfvm0));
    }

    @Override  // bdbm
    public final evql b(ggds ggds0) {
        ggdy ggdy0 = new ggdy();
        ggqj ggqj0 = ggds0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ggdy0.i(this.a(((MessageLite)object0)));
        }
        return evrg.e(ggdy0.h());
    }

    @Override  // bdbm
    public final evql c() {
        return this.h(new bdbv(this));
    }

    @Override  // bdbm
    public final evql d() {
        return this.h(new bdbw(this)).g(new bdbx(this));
    }

    @Override  // bdbm
    public final evql e(MessageLite hfvm0) {
        return this.h(new bdca(this, hfvm0));
    }

    public final evql f(ggds ggds0) {
        ggdy ggdy0 = new ggdy();
        ggqj ggqj0 = ggds0.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            ggdy0.i(this.e(((MessageLite)object0)));
        }
        return evrg.e(ggdy0.h());
    }

    public static final boolean g(Exception exception0) {
        return (exception0 instanceof aztb) && ((aztb)exception0).b() == 11002;
    }

    private final evql h(bdcc bdcc0) {
        return bdcc0.a().e(new bdbu(this, bdcc0));
    }
}

