import java.io.Closeable;

public interface igrs extends Closeable {
    long a();

    @Override
    void close();
}

