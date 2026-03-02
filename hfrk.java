import java.io.IOException;
import java.io.OutputStream;

public abstract class hfrk implements MessageLite {
    public int memoizedHashCode;

    public hfrk() {
        this.memoizedHashCode = 0;
    }

    public int ox(hfwc hfwc0) {
        throw null;
    }

    @Override  // MessageLite
    public final ByteString getDefaultInstanceForType() {
        try {
            byte[] arr_b = new byte[this.getSerializedSize()];
            CodedOutputStream hfsq0 = CodedOutputStream.ad(arr_b);
            this.writeTo(hfsq0);
            return hfrz.a(hfsq0, arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(bcnm.j(this, "Serializing ", " to a ByteString threw an IOException (should never happen)."), iOException0);
        }
    }

    @Override  // MessageLite
    public final void writeDelimitedTo(OutputStream outputStream0) {
        int v = this.getSerializedSize();
        hfsn hfsn0 = new hfsn(outputStream0, CodedOutputStream.P(CodedOutputStream.Y(v) + v));
        ((CodedOutputStream)hfsn0).writeRawVarint32(v);
        this.writeTo(((CodedOutputStream)hfsn0));
        ((CodedOutputStream)hfsn0).flush();
    }

    @Override  // MessageLite
    public final void writeToStream(OutputStream outputStream0) {
        hfsn hfsn0 = new hfsn(outputStream0, CodedOutputStream.P(this.getSerializedSize()));
        this.writeTo(((CodedOutputStream)hfsn0));
        ((CodedOutputStream)hfsn0).flush();
    }

    @Override  // MessageLite
    public final byte[] toBytesArray() {
        try {
            byte[] arr_b = new byte[this.getSerializedSize()];
            CodedOutputStream hfsq0 = CodedOutputStream.ad(arr_b);
            this.writeTo(hfsq0);
            hfsq0.ae();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException(bcnm.j(this, "Serializing ", " to a byte array threw an IOException (should never happen)."), iOException0);
        }
    }
}

