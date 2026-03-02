import android.accounts.Account;

public final class dwkm implements lsk {
    private final Account a;
    private final dvgq b;
    private final domj c;
    private final azts d;

    public dwkm(azts azts0, Account account0, dvgq dvgq0, domj domj0) {
        this.d = azts0;
        this.a = account0;
        this.b = dvgq0;
        this.c = domj0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        return lsi.b(class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        ibuq.f(class0, "modelClass");
        if(class0.isAssignableFrom(dwkl.class)) {
            return new dwkl(lrm.a(ltx0), this.d, this.a, this.b, this.c);
        }
        throw new IllegalArgumentException(class0.getCanonicalName() + " is not assignable from EditUserCreatedPassViewModel");
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

