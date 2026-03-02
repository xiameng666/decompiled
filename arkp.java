import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public abstract class arkp extends arkq {
    private static final aqql a;
    private final ByteArrayOutputStream b;

    static {
        arkp.a = new aqql(new String[]{"ProtobufLiteExpectation"});
    }

    protected arkp(arin arin0, hkyj hkyj0) {
        super(arin0, hkyj0);
        this.b = new ByteArrayOutputStream();
    }

    @Override  // arkq
    public final OutputStream b() {
        return this.b;
    }

    @Override  // arkq
    protected final void c() {
        byte[] arr_b = this.b.toByteArray();
        try {
            this.f(this.e(arr_b));
        }
        catch(hfur hfur0) {
            arkp.a.n("Unable to parse protobuf lite.", hfur0, new Object[0]);
            this.c.l(3, hfur0.getMessage(), true);
        }
    }

    protected abstract MessageLite e(byte[] arg1);

    protected abstract void f(MessageLite arg1);
}

