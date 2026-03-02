import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

public final class lcw implements ibth {
    public final ldf a;

    public lcw(ldf ldf0) {
        this.a = ldf0;
    }

    @Override  // ibth
    public final Object a() {
        try(ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.open(((File)new lcx(this.a).a()), 0x38000000)) {
            ibuq.c(parcelFileDescriptor0);
            NativeSharedCounter nativeSharedCounter0 = lds.a;
            if(nativeSharedCounter0 == null) {
                throw new IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
            }
            int v = parcelFileDescriptor0.getFd();
            if(nativeSharedCounter0.nativeTruncateFile(v) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long v1 = nativeSharedCounter0.nativeCreateSharedCounter(v);
            if(v1 >= 0L) {
                return new ldt(nativeSharedCounter0, v1);
            }
            throw new IOException("Failed to mmap counter file");
        }
    }
}

