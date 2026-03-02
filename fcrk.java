import java.util.function.Supplier;

public final class fcrk implements Supplier {
    public final fcrl a;
    public final String b;
    public final ffap c;

    public fcrk(fcrl fcrl0, String s, ffap ffap0) {
        this.a = fcrl0;
        this.b = s;
        this.c = ffap0;
    }

    @Override
    public final Object get() {
        byte[] arr_b = this.c.toBytesArray();
        return this.a.b.i(this.b, "/restore/key_recovery_result", arr_b);
    }
}

