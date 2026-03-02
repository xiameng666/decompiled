import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

public interface iavd extends Closeable {
    iavn a(SocketAddress arg1, iavc arg2, iakt arg3);

    Collection b();

    ScheduledExecutorService c();

    @Override
    void close();
}

