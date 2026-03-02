import java.util.concurrent.Callable;

public final class grbz implements Callable {
    public final grco a;
    public final grce b;

    public grbz(grco grco0, grce grce0) {
        this.a = grco0;
        this.b = grce0;
    }

    @Override
    public final Object call() {
        byte[] arr_b = grcj.b(this.a.c.toByteArray(), this.b.a);
        ibuq.e(arr_b, "decryptReencryptedLookupHash(...)");
        return hfxt.a(arr_b);
    }
}

