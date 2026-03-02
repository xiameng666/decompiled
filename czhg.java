import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import java.io.DataInputStream;
import java.io.IOException;

public final class czhg extends czhh {
    @Override  // czhh
    public final ParcelByteArray a(Parcel parcel0) {
        byte[] arr_b;
        ParcelByteArray parcelByteArray0 = super.a(parcel0);
        ParcelFileDescriptor parcelFileDescriptor0 = parcelByteArray0.b;
        if(parcelFileDescriptor0 != null) {
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0));
            try {
                arr_b = new byte[dataInputStream0.readInt()];
                dataInputStream0.read(arr_b);
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Could not read from parcel file descriptor", iOException0);
            }
            finally {
                ParcelByteArray.a(dataInputStream0);
            }
            parcelByteArray0.a = arr_b;
            return parcelByteArray0;
        }
        return parcelByteArray0;
    }

    @Override  // czhh
    public final Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }
}

