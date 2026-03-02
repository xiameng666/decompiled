import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public final class auax extends SelectableChannel implements ReadableByteChannel {
    protected final SocketChannel a;

    public auax(SocketChannel socketChannel0) {
        this.a = socketChannel0;
    }

    public final int a(ByteBuffer byteBuffer0) {
        return this.a.write(byteBuffer0);
    }

    public final Socket b() {
        return this.a.socket();
    }

    @Override
    public final Object blockingLock() {
        return this.a.blockingLock();
    }

    @Override
    public final SelectableChannel configureBlocking(boolean z) {
        return this.a.configureBlocking(z);
    }

    @Override
    public final void implCloseChannel() {
        this.a.close();
    }

    @Override
    public final boolean isBlocking() {
        return this.a.isBlocking();
    }

    @Override
    public final boolean isRegistered() {
        return this.a.isRegistered();
    }

    @Override
    public final SelectionKey keyFor(Selector selector0) {
        return this.a.keyFor(selector0);
    }

    @Override
    public final SelectorProvider provider() {
        return this.a.provider();
    }

    @Override
    public final int read(ByteBuffer byteBuffer0) {
        return this.a.read(byteBuffer0);
    }

    @Override
    public final SelectionKey register(Selector selector0, int v, Object object0) {
        return this.a.register(selector0, v, object0);
    }

    @Override
    public final int validOps() {
        return this.a.validOps();
    }
}

