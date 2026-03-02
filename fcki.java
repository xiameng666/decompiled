import java.util.function.Supplier;

public final class fcki implements Supplier {
    public final fckl a;
    public final fezp b;

    public fcki(fckl fckl0, fezp fezp0) {
        this.a = fckl0;
        this.b = fezp0;
    }

    @Override
    public final Object get() {
        byte[] arr_b = this.b.toBytesArray();
        evql evql0 = this.a.b.i(this.a.d, "/restore/get_devices", arr_b);
        fcjy fcjy0 = new fcjy();
        return evql0.h(this.a.c, fcjy0);
    }
}

