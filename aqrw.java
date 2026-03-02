import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

public final class aqrw implements Callable {
    public final aqrx a;

    public aqrw(aqrx aqrx0) {
        this.a = aqrx0;
    }

    @Override
    public final Object call() {
        int v;
        aqrx.a.j("Starting contact backup async", new Object[0]);
        grov grov0 = this.a.a();
        if(((ProtoLiteMessage)grov0).isImmutable()) {
            v = ((ProtoLiteMessage)grov0).t(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else {
            v = grov0.memoizedSerializedSize & 0x7FFFFFFF;
            if(v == 0x7FFFFFFF) {
                v = ((ProtoLiteMessage)grov0).t(null);
                if(v < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v);
                }
                grov0.memoizedSerializedSize = grov0.memoizedSerializedSize & 0x80000000 | v;
            }
        }
        byte[] arr_b = new byte[v];
        ((ProtoLiteMessage)grov0).writeTo(CodedOutputStream.ad(arr_b));
        return new ByteArrayInputStream(arr_b);
    }
}

