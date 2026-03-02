import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Checksum;
import jeb.synthetic.TWR;

final class atkg implements Closeable {
    public final atki a;
    public final DataOutputStream b;
    public final Map c;
    public final Checksum d;
    public boolean e;

    public atkg(atki atki0, OutputStream outputStream0) {
        this.a = atki0;
        Adler32 adler320 = new Adler32();
        this.d = adler320;
        adler320.reset();
        this.b = new DataOutputStream(new CheckedOutputStream(outputStream0, adler320));
        this.c = new HashMap();
    }

    @Override
    public final void close() {
        DataOutputStream dataOutputStream0;
        atki atki0;
        if(this.e) {
            return;
        }
        try {
            this.e = true;
            atki0 = this.a;
            try {
                dataOutputStream0 = this.b;
                dataOutputStream0.flush();
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(dataOutputStream0, throwable1);
                throw throwable1;
            }
            dataOutputStream0.close();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(atki0, throwable0);
            throw throwable0;
        }
        atki0.close();
    }
}

