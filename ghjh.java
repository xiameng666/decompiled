import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

public final class ghjh implements DataOutput {
    final DataOutput a;
    final ByteArrayOutputStream b;

    public ghjh(ByteArrayOutputStream byteArrayOutputStream0) {
        this.b = byteArrayOutputStream0;
        this.a = new DataOutputStream(byteArrayOutputStream0);
    }

    public final byte[] a() {
        return this.b.toByteArray();
    }

    @Override
    public final void write(int v) {
        try {
            this.a.write(v);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void write(byte[] arr_b) {
        try {
            this.a.write(arr_b);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        try {
            this.a.write(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeBoolean(boolean z) {
        try {
            this.a.writeBoolean(z);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeByte(int v) {
        try {
            this.a.writeByte(v);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeBytes(String s) {
        try {
            this.a.writeBytes(s);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeChar(int v) {
        try {
            this.a.writeChar(v);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeChars(String s) {
        try {
            this.a.writeChars(s);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeDouble(double f) {
        try {
            this.a.writeDouble(f);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeFloat(float f) {
        try {
            this.a.writeFloat(f);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeInt(int v) {
        try {
            this.a.writeInt(v);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeLong(long v) {
        try {
            this.a.writeLong(v);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeShort(int v) {
        try {
            this.a.writeShort(v);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @Override
    public final void writeUTF(String s) {
        try {
            this.a.writeUTF(s);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

