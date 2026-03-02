import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.Adler32;
import java.util.zip.Checksum;
import jeb.synthetic.TWR;

final class atkf implements Closeable {
    public static final aqql a;
    public final atkh b;
    public final athv c;
    public boolean d;
    private static final Checksum e;
    private final RandomAccessFile f;

    static {
        atkf.a = new aqql(new String[]{"ChunkedBackupDataReader"});
        atkf.e = new Adler32();
    }

    public atkf(atju atju0, athv athv0) {
        this.b = atkh.a(atju0);
        this.f = atju0.d();
        this.c = athv0;
    }

    public final byte[] a(int v) {
        Checksum checksum0 = atkf.e;
        checksum0.reset();
        this.f.seek(((long)v));
        int v1 = this.f.readInt();
        checksum0.update(glwy.l(v1), 0, 4);
        atkf.a.j("Reading %d chunk bytes from offset %d\n", new Object[]{v1, ((int)(v + 4))});
        byte[] arr_b = new byte[v1];
        try {
            this.f.readFully(arr_b);
        }
        catch(EOFException eOFException0) {
            throw new IllegalStateException("Unexpected EOF while reading chunk data at offset: " + (v + 4), eOFException0);
        }
        checksum0.update(arr_b, 0, v1);
        long v2 = checksum0.getValue();
        long v3 = this.f.readLong();
        if(v2 == v3) {
            return arr_b;
        }
        throw new IOException(String.format("checksum mismatch (actual: %s, expected: %s)", v2, v3));
    }

    @Override
    public final void close() {
        RandomAccessFile randomAccessFile0;
        if(this.d) {
            return;
        }
        try {
            this.d = true;
            randomAccessFile0 = this.f;
            this.b.close();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(randomAccessFile0, throwable0);
            throw throwable0;
        }
        randomAccessFile0.close();
    }
}

