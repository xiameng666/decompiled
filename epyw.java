import android.os.Trace;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

final class epyw implements Runnable {
    public final ExecutorService a;
    public boolean b;
    final epyx c;
    private final InputStream d;
    private final byte[] e;

    public epyw(epyx epyx0, InputStream inputStream0) {
        Objects.requireNonNull(epyx0);
        this.c = epyx0;
        super();
        this.e = new byte[0x8000];
        this.d = inputStream0;
        this.a = new bblp(1, 9);
    }

    @Override
    public final void run() {
        oyn.a("FidoReadWriteStreamHandler-readFidoDataRunnable");
        this.b = false;
        while(true) {
            try {
                byte[] arr_b = this.e;
                int v = this.d.read(arr_b, 0, 0x8000);
                if(v == -1) {
                    break;
                }
                byte[] arr_b1 = Arrays.copyOf(arr_b, v);
                SecondDeviceAuthPayload secondDeviceAuthPayload0 = new SecondDeviceAuthPayload();
                secondDeviceAuthPayload0.h.add(Integer.valueOf(4));
                secondDeviceAuthPayload0.c = arr_b1;
                MessagePayload messagePayload0 = new MessagePayload();
                messagePayload0.am(secondDeviceAuthPayload0);
                this.c.b.b(messagePayload0);
            }
            catch(IOException iOException0) {
                Trace.endSection();
                epyx.a.l(iOException0);
                if(this.b) {
                    return;
                }
                this.c.b.a(10701, "Reading data from Fido pipe failed.", null);
                break;
            }
        }
        Trace.endSection();
    }
}

