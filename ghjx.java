import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class ghjx extends FilterInputStream implements InputStreamRetargetInterface, DataInput {
    public ghjx(InputStream inputStream0) {
        super(inputStream0);
    }

    private final byte a() {
        int v = this.in.read();
        if(v != -1) {
            return (byte)v;
        }
        throw new EOFException();
    }

    @Override
    public final boolean readBoolean() {
        return this.readUnsignedByte() != 0;
    }

    @Override
    public final byte readByte() {
        return (byte)this.readUnsignedByte();
    }

    @Override
    public final char readChar() {
        return (char)this.readUnsignedShort();
    }

    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }

    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }

    @Override
    public final void readFully(byte[] arr_b) {
        ghjj.c(this, arr_b);
    }

    @Override
    public final void readFully(byte[] arr_b, int v, int v1) {
        ghjj.d(this, arr_b, v, v1);
    }

    @Override
    public final int readInt() {
        int v = this.a();
        int v1 = this.a();
        int v2 = this.a();
        return glwy.d(this.a(), ((byte)v2), ((byte)v1), ((byte)v));
    }

    @Override
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override
    public final long readLong() {
        int v = this.a();
        int v1 = this.a();
        int v2 = this.a();
        int v3 = this.a();
        int v4 = this.a();
        int v5 = this.a();
        int v6 = this.a();
        return glxd.d(this.a(), ((byte)v6), ((byte)v5), ((byte)v4), ((byte)v3), ((byte)v2), ((byte)v1), ((byte)v));
    }

    @Override
    public final short readShort() {
        return (short)this.readUnsignedShort();
    }

    @Override
    public final String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        int v = this.in.read();
        if(v >= 0) {
            return v;
        }
        throw new EOFException();
    }

    @Override
    public final int readUnsignedShort() {
        int v = this.a();
        return glwy.d(((byte)0), ((byte)0), this.a(), ((byte)v));
    }

    @Override
    public final int skipBytes(int v) {
        return (int)this.in.skip(((long)v));
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

