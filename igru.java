import java.nio.ByteBuffer;
import org.tensorflow.lite.NativeInterpreterWrapper;
import org.tensorflow.lite.NativeInterpreterWrapperExperimental;
import org.tensorflow.lite.TensorImpl;

public final class igru implements AutoCloseable {
    public NativeInterpreterWrapper a;

    public igru(ByteBuffer byteBuffer0) {
        NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental0 = new NativeInterpreterWrapperExperimental(byteBuffer0);
        super();
        this.a = nativeInterpreterWrapperExperimental0;
        this.a();
        NativeInterpreterWrapper.getSignatureKeys(this.a.b);
    }

    public final void a() {
        if(this.a != null) {
            return;
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final TensorImpl b(int v) {
        this.a();
        return this.a.a(v);
    }

    @Override
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper0 = this.a;
        if(nativeInterpreterWrapper0 != null) {
            nativeInterpreterWrapper0.close();
            this.a = null;
        }
    }

    @Override
    protected final void finalize() {
        try {
            this.close();
        }
        finally {
            super.finalize();
        }
    }
}

