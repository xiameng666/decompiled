import java.io.Closeable;
import java.util.Iterator;

public interface bxfw extends Closeable, Iterator {
    @Override
    void close();
}

