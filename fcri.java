import java.util.function.Supplier;

public final class fcri implements Supplier {
    public final fcrl a;
    public final String b;

    public fcri(fcrl fcrl0, String s) {
        this.a = fcrl0;
        this.b = s;
    }

    @Override
    public final Object get() {
        return this.a.b.i(this.b, "/restore/ready_to_restore", new byte[0]);
    }
}

