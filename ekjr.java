import android.content.Context;

public final class ekjr implements lsk {
    private final ejyv a;
    private final Context b;
    private final gmcg c;
    private final ekmk d;
    private final ekmp e;
    private final eghw f;

    public ekjr(Context context0, gmcg gmcg0, eghw eghw0, ekmk ekmk0, ekmp ekmp0, ejyv ejyv0) {
        this.b = context0;
        this.c = gmcg0;
        this.d = ekmk0;
        this.f = eghw0;
        this.e = ekmp0;
        this.a = ejyv0;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        if(!class0.isAssignableFrom(ekjq.class)) {
            throw new IllegalArgumentException("ViewModelFactory cannot create an instance of " + class0);
        }
        ekmc ekmc0 = new ekmc(this.c, this.b, this.a);
        ejyn ejyn0 = new ejyn(this.b);
        return (lsb)class0.cast(new ekjq(ekmc0, this.f, this.d, this.e, this.a, ejyn0));
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        return lsi.c(this, class0);
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }

    public static ekjr d(Context context0) {
        Context context1 = context0.getApplicationContext();
        return new ekjr(context1, new bblp(0x7FFFFFFF, 9), new eghw(fofa.a()), new ekmk(context1), new ekmp(context1), ejyv.d(context1));
    }
}

