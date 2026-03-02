import android.os.ParcelFileDescriptor;
import java.io.Closeable;

public final class ehju implements Closeable {
    public final ParcelFileDescriptor a;
    private boolean b;

    public ehju(ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = parcelFileDescriptor0;
        ehjv.a.incrementAndGet();
    }

    public final void a(boolean z) {
        if(!this.b) {
            this.b = true;
            ehjv.a.decrementAndGet();
            if(z) {
                bbpb.a(this.a);
            }
        }
    }

    @Override
    public final void close() {
        this.a(true);
    }
}

