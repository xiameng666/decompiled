import android.os.Trace;
import java.io.DataOutput;
import java.util.Arrays;
import java.util.concurrent.Callable;

final class erpw implements Callable {
    private final DataOutput a;
    private final byte[] b;

    public erpw(DataOutput dataOutput0, byte[] arr_b) {
        this.a = dataOutput0;
        this.b = arr_b;
    }

    @Override
    public final Object call() {
        oyn.a("PipeWriteManager-call");
        int v = Arrays.hashCode(this.b);
        erpy.a.j("Writing " + this.b.length + " bytes with hash " + v, new Object[0]);
        this.a.writeInt(this.b.length);
        this.a.write(this.b);
        Trace.endSection();
        return null;
    }
}

