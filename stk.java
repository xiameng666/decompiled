import java.io.ByteArrayOutputStream;

public final class stk {
    public final sti a;
    private final byte[] b;

    public stk(sti sti0, byte[] arr_b) {
        this.a = sti0;
        this.b = stm.a(arr_b);
    }

    public final byte[] a() {
        return stm.a(this.b);
    }

    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byteArrayOutputStream0.write(((int)this.a.f));
        stq.b(this.b.length, byteArrayOutputStream0);
        stq.a(this.b, byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }
}

