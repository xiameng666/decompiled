import android.content.Context;

public final class abte implements lsk {
    private final Context a;

    public abte(Context context0) {
        this.a = context0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        if(!class0.isAssignableFrom(abtd.class)) {
            throw new IllegalArgumentException("ViewModel provider cannot create an instance of " + class0);
        }
        axzj axzj0 = axzj.b();
        aysr aysr0 = new aysr(this.a, axzj0, null);
        bech bech0 = new bech(this.a);
        return (lsb)class0.cast(new abtd(this.a, aysr0, bech0));
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        return lsi.c(this, class0);
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

