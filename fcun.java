import java.util.function.Supplier;

public final class fcun implements Supplier {
    public final pxf a;

    public fcun(pxf pxf0) {
        this.a = pxf0;
    }

    @Override
    public final Object get() {
        return new fcuk(this.a);
    }
}

