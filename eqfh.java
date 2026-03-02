import java.util.concurrent.Callable;

public final class eqfh implements Callable {
    public final eqfo a;

    public eqfh(eqfo eqfo0) {
        this.a = eqfo0;
    }

    @Override
    public final Object call() {
        eqfi eqfi0 = new eqfi(this.a);
        return Boolean.valueOf(this.a.f.post(eqfi0));
    }
}

