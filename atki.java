import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.BitSet;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Checksum;
import jeb.synthetic.TWR;

final class atki implements Closeable {
    public final DataOutputStream a;
    public final BitSet b;
    public boolean c;
    private final DataOutputStream d;
    private final Checksum e;
    private final Checksum f;
    private int g;

    private atki(OutputStream outputStream0, OutputStream outputStream1) {
        Adler32 adler320 = new Adler32();
        this.e = adler320;
        this.a = atki.d(outputStream0, adler320);
        Adler32 adler321 = new Adler32();
        this.f = adler321;
        this.d = atki.d(outputStream1, adler321);
        this.b = new BitSet();
        this.g = -1;
    }

    public static atki a(atju atju0) {
        return new atki(atki.c(atju0.b()), atki.c(atju0.c()));
    }

    public final void b(atkc atkc0) {
        gftb.r(((boolean)(this.c ^ 1)), "already closed");
        ++this.g;
        DataOutputStream dataOutputStream0 = this.a;
        dataOutputStream0.write(atkc0.a.a);
        gfsx gfsx0 = atkc0.b;
        if(gfsx0.i()) {
            dataOutputStream0.writeInt(((Integer)gfsx0.d()).intValue());
            this.b.set(this.g);
        }
    }

    private static BufferedOutputStream c(RandomAccessFile randomAccessFile0) {
        atlb atlb0 = new atlb(randomAccessFile0);
        return hqlt.y() ? new BufferedOutputStream(atlb0, ((int)hqlt.g())) : new BufferedOutputStream(atlb0, 0x2000);
    }

    @Override
    public final void close() {
        DataOutputStream dataOutputStream1;
        DataOutputStream dataOutputStream0;
        if(this.c) {
            return;
        }
        try {
            this.c = true;
            dataOutputStream0 = this.a;
            try {
                dataOutputStream1 = this.d;
                dataOutputStream0.flush();
                dataOutputStream0.writeLong(this.e.getValue());
                BitSet bitSet0 = this.b;
                byte[] arr_b = new byte[(bitSet0.length() + 7) / 8];
                for(int v = 0; v < bitSet0.length(); ++v) {
                    if(bitSet0.get(v)) {
                        arr_b[v / 8] = (byte)(1 << v % 8 | arr_b[v / 8]);
                    }
                }
                dataOutputStream1.write(arr_b);
                dataOutputStream1.flush();
                dataOutputStream1.writeLong(this.f.getValue());
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(dataOutputStream1, throwable1);
                throw throwable1;
            }
            dataOutputStream1.close();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(dataOutputStream0, throwable0);
            throw throwable0;
        }
        dataOutputStream0.close();
    }

    private static DataOutputStream d(OutputStream outputStream0, Checksum checksum0) {
        return new DataOutputStream(new CheckedOutputStream(outputStream0, checksum0));
    }
}

