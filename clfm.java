import java.io.Closeable;
import java.nio.ByteBuffer;

public abstract class clfm implements Closeable {
    public abstract long a();

    public abstract void b(clfn arg1, ByteBuffer arg2);

    public abstract void c(clfn arg1);

    @Override
    public void close() {
    }
}

