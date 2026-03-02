import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class arqi implements arrf {
    public final ParcelFileDescriptor a;

    public arqi(ParcelFileDescriptor parcelFileDescriptor0) {
        this.a = parcelFileDescriptor0;
    }

    @Override  // arrf
    public final InputStream a() {
        return new ParcelFileDescriptor.AutoCloseInputStream(this.a);
    }
}

