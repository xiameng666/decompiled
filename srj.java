import java.io.ByteArrayOutputStream;

public final class srj {
    public final ieoq a;

    public srj(ieoq ieoq0) {
        this.a = ieoq0;
    }

    public srj(byte[] arr_b) {
        ieax ieax0 = iegv.b("secp256r1");
        ieok ieok0 = new ieok(ieax0.b(), ieax0.c(), ieax0.a);
        this.a = new ieoq(ieok0.a.s(arr_b), new ieok(ieok0.a, ieok0.b, ieok0.c));
    }

    public final byte[] a() {
        return stf.a(this.a.c.u().f());
    }

    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        stq.a(str.c("04"), byteArrayOutputStream0);
        stq.a(this.a(), byteArrayOutputStream0);
        stq.a(stf.a(this.a.c.v().f()), byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }
}

