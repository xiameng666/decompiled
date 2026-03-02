import java.util.concurrent.Callable;

public final class eqdf implements Callable {
    public final eqdn a;

    public eqdf(eqdn eqdn0) {
        this.a = eqdn0;
    }

    @Override
    public final Object call() {
        eqde eqde0 = new eqde(this.a);
        return Boolean.valueOf(this.a.c.post(eqde0));
    }
}

