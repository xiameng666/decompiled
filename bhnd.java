import java.io.Closeable;
import java.util.Map;

public interface bhnd extends Closeable {
    String a(Map arg1);

    boolean b();

    @Override
    void close();
}

