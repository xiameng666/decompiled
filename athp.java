import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class athp {
    public static final aqql a;
    public final File b;
    public ArrayList c;

    static {
        athp.a = new aqql(new String[]{"TertiaryKeyRotationWindowedCount"});
    }

    public athp(File file0) {
        this.b = file0;
        this.c = new ArrayList();
        try {
            this.c = new ArrayList(athp.b(file0));
        }
        catch(IOException iOException0) {
            athp.a.g("Error reading tertiary_key_rotation_windowed_count", iOException0, new Object[0]);
        }
    }

    public final void a() {
        long v = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(24L);
        long v1 = System.currentTimeMillis();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.c;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Long long0 = (Long)arrayList1.get(v3);
            long v4 = (long)long0;
            if(v4 >= 1L + v && v4 <= v1) {
                arrayList0.add(long0);
            }
        }
        this.c = arrayList0;
    }

    private static gged_interceptors b(File file0) {
        if(!file0.exists()) {
            return ggna.a;
        }
        ggdy ggdy0 = new ggdy();
        try {
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            try {
                DataInputStream dataInputStream0 = new DataInputStream(fileInputStream0);
                try {
                    while(true) {
                        ggdy0.i(Long.valueOf(dataInputStream0.readLong()));
                    }
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(dataInputStream0, throwable1);
                    throw throwable1;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(fileInputStream0, throwable0);
                throw throwable0;
            }
        }
        catch(EOFException unused_ex) {
            return ggdy0.h();
        }
    }
}

