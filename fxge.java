import java.util.function.Supplier;

public final class fxge implements Supplier {
    public final fxgr a;

    public fxge(fxgr fxgr0) {
        this.a = fxgr0;
    }

    @Override
    public final Object get() {
        return bhnc.a(this.a.e, "SeismicDataCollection");
    }
}

