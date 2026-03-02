import android.accounts.Account;

public final class eklu implements ibts {
    public final eklz a;

    public eklu(eklz eklz0) {
        this.a = eklz0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = new lqi();
        eklx eklx0 = new eklx(this.a, ((Account)object0), ((lqi)object1));
        this.a.f.execute(eklx0);
        return object1;
    }
}

