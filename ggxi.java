import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import j..util.Objects;
import java.io.InputStream;
import java.io.OutputStream;

final class ggxi extends InputStream implements InputStreamRetargetInterface {
    final ggxj a;
    final ggxh b;

    public ggxi(ggxh ggxh0, ggxj ggxj0) {
        this.a = ggxj0;
        Objects.requireNonNull(ggxh0);
        this.b = ggxh0;
        super();
    }

    @Override
    public final int read() {
        ggxj ggxj0 = this.a;
        long v = ggxj0.a;
        if(v == ggxj0.b) {
            return -1;
        }
        ggxj0.a = 1L + v;
        return this.b.a(v) & 0xFF;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

