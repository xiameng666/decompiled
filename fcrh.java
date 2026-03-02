import java.util.function.Supplier;

public final class fcrh implements Supplier {
    public final fcrl a;
    public final String b;

    public fcrh(fcrl fcrl0, String s) {
        this.a = fcrl0;
        this.b = s;
    }

    @Override
    public final Object get() {
        return this.a.b.i(this.b, "/restore/restore_finished", new byte[0]);
    }
}

