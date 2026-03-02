import android.os.PersistableBundle;

public final class sat implements sca {
    public final sbe a;
    public final ryh b;
    public final PersistableBundle c;

    public sat(sbe sbe0, ryh ryh0, PersistableBundle persistableBundle0) {
        this.a = sbe0;
        this.b = ryh0;
        this.c = persistableBundle0;
    }

    @Override  // sca
    public final void a(ibts ibts0, ibts ibts1) {
        rzy rzy0 = new rzy(this.b);
        rzy rzy1 = new rzy(this.c);
        sae sae0 = new sae(ibts1, ibts0);
        this.a.a.m(rzy0, rzy1, sae0);
    }
}

