import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public final class fogm implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ParcelFileDescriptor parcelFileDescriptor0 = ((efoa)object0).b();
        if(parcelFileDescriptor0 == null) {
            return null;
        }
        try(ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0)) {
            return BitmapFactory.decodeStream(parcelFileDescriptor$AutoCloseInputStream0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }
}

