import java.util.function.Supplier;

public final class fcju implements Supplier {
    public final fckl a;
    public final ffam b;

    public fcju(fckl fckl0, ffam ffam0) {
        this.a = fckl0;
        this.b = ffam0;
    }

    @Override
    public final Object get() {
        byte[] arr_b = this.b.toBytesArray();
        return this.a.b.i(this.a.d, "/restore/start_key_recovery", arr_b);
    }
}

