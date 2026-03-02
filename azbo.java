import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;

final class azbo {
    public final ByteBuffer a;

    public azbo(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
    }

    public final byte a(int v) {
        try {
            return this.a.get(v);
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception reading from buffer", runtimeException0);
        }
    }

    public final int b(int v) {
        try {
            return this.a.getInt(v);
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception reading from buffer", runtimeException0);
        }
    }

    public final int c() {
        return this.a.capacity();
    }

    public final long d(int v) {
        try {
            return this.a.getLong(v);
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception reading from buffer", runtimeException0);
        }
    }

    public final void e() {
        try {
            ByteBuffer byteBuffer0 = this.a;
            if((byteBuffer0 instanceof MappedByteBuffer)) {
                ((MappedByteBuffer)byteBuffer0).force();
            }
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception syncing buffer to disk", runtimeException0);
        }
    }

    public final void f(int v, byte b) {
        try {
            this.a.put(v, b);
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception writing to buffer", runtimeException0);
        }
    }

    public final void g(int v, int v1) {
        try {
            this.a.putInt(v, v1);
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception writing to buffer", runtimeException0);
        }
    }

    public final void h(int v, long v1) {
        try {
            this.a.putLong(v, v1);
        }
        catch(RuntimeException runtimeException0) {
            throw new IOException("Exception writing to buffer", runtimeException0);
        }
    }
}

