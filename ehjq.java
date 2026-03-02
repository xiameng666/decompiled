import android.os.ParcelFileDescriptor;
import java.io.File;

public final class ehjq {
    public final ParcelFileDescriptor a;
    public final ParcelFileDescriptor b;

    public ehjq(File file0) {
        this.a = ParcelFileDescriptor.open(file0, 0x10000000);
        try {
            this.b = ParcelFileDescriptor.open(file0, 0x10000000);
        }
        catch(Exception exception0) {
            bbpb.a(this.a);
            throw exception0;
        }
    }
}

