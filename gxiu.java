import java.io.Closeable;

public interface gxiu extends Closeable {
    void a();

    void b(byte[] arg1);

    void c(byte[] arg1, byte[] arg2);

    @Override
    void close();

    void d();
}

