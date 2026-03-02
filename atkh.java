import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Locale;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

final class atkh implements Closeable {
    private static final Checksum a;
    private final DataInputStream b;
    private final BitSet c;
    private int d;
    private boolean e;

    static {
        atkh.a = new Adler32();
    }

    private atkh(DataInputStream dataInputStream0, BitSet bitSet0) {
        this.d = -1;
        this.b = dataInputStream0;
        this.c = bitSet0;
    }

    public static atkh a(atju atju0) {
        boolean z2;
        BitSet bitSet0;
        boolean z1;
        boolean z = true;
        try(RandomAccessFile randomAccessFile0 = atju0.c()) {
            z1 = Long.compare(randomAccessFile0.length(), 8L) > 0;
            gftb.i(z1, "expected at least %s bytes, found %s", 9, randomAccessFile0.length());
            int v = glwy.a(randomAccessFile0.length() - 8L);
            byte[] arr_b = new byte[v];
            randomAccessFile0.readFully(arr_b);
            byte[] arr_b1 = new byte[8];
            randomAccessFile0.readFully(arr_b1);
            atkh.a.reset();
            atkh.a.update(arr_b, 0, v);
            long v1 = atkh.a.getValue();
            long v2 = glxd.c(arr_b1);
            if(v1 != v2) {
                throw new IOException(String.format("checksum mismatch (actual: %s, expected: %s)", v1, v2));
            }
            bitSet0 = new BitSet(v * 8);
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        alab1:
            while(true) {
            label_28:
                if(byteBuffer0.remaining() <= 0) {
                    goto label_53;
                }
                int v4 = byteBuffer0.get();
                int v5 = 1;
                int v6 = 0;
                for(int v3 = 0; true; ++v3) {
                    if(v6 >= 8) {
                        break alab1;
                    }
                    z2 = (v4 & v5) != 0;
                    bitSet0.set(v3, z2);
                    v5 = (byte)(v5 + v5);
                    ++v6;
                }
            }
        }
        goto label_28;
    label_53:
        RandomAccessFile randomAccessFile1 = atju0.b();
        if(randomAccessFile1.length() <= 8L) {
            z = false;
        }
        gftb.b(z, "file length <= CHECKSUM_BYTES");
        long v7 = randomAccessFile1.length() - 8L;
        randomAccessFile1.seek(v7);
        long v8 = randomAccessFile1.readLong();
        randomAccessFile1.seek(0L);
        return new atkh(new DataInputStream(new atjw(new CheckedInputStream(new ghji(new atla(randomAccessFile1), v7), new Adler32()), v8)), bitSet0);
    }

    public final gfsx b() {
        gfsx gfsx0;
        DataInputStream dataInputStream0;
        gftb.r(((boolean)(this.e ^ 1)), "already closed");
        ++this.d;
        byte[] arr_b = new byte[0x20];
        int v;
        for(v = 0; true; v += v1) {
            dataInputStream0 = this.b;
            if(v >= 0x20) {
                break;
            }
            int v1 = dataInputStream0.read(arr_b, v, 0x20 - v);
            if(v1 == -1) {
                break;
            }
        }
        if(v == 0) {
            gfsx0 = gfqx.a;
        }
        else {
            if(v != 0x20) {
                throw new EOFException(String.format(Locale.US, "EOF reached after reading %s bytes, expected at least %s.", v, ((int)0x20)));
            }
            gfsx0 = gfsx.m(arr_b);
        }
        gfsx gfsx1 = gfsx0.i() ? gfsx.m(new athu(((byte[])gfsx0.d()))) : gfqx.a;
        if(!gfsx1.i()) {
            return gfqx.a;
        }
        if(this.c.get(this.d)) {
            gfsx gfsx2 = gfsx.m(Integer.valueOf(dataInputStream0.readInt()));
            return gfsx.m(new atkc(((athu)gfsx1.d()), gfsx2));
        }
        return gfsx.m(new atkc(((athu)gfsx1.d()), gfqx.a));
    }

    @Override
    public final void close() {
        if(this.e) {
            return;
        }
        this.e = true;
        this.b.close();
    }
}

