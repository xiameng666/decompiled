import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.Callable;

public final class fedy implements Callable {
    public final feea a;
    public final PipedOutputStream b;

    public fedy(feea feea0, PipedOutputStream pipedOutputStream0) {
        this.a = feea0;
        this.b = pipedOutputStream0;
    }

    @Override
    public final Object call() {
        long v1;
        try(FileInputStream fileInputStream0 = new FileInputStream(this.a.a); OutputStream outputStream0 = this.a.c.c(this.b, this.a.b)) {
            this.a.d.set(fileInputStream0);
            this.a.e.set(outputStream0);
            v1 = ghjj.b(fileInputStream0, outputStream0);
        }
        finally {
            try {
                this.b.close();
            }
            catch(IOException iOException0) {
                Log.e("CloudNode", "Failed to close PipedOutputStream", iOException0);
            }
        }
        return v1;
    }
}

