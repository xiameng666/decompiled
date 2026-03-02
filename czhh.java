import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;

public class czhh implements Parcelable.Creator {
    public ParcelByteArray a(Parcel parcel0) {
        int v = baua.h(parcel0);
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                parcelFileDescriptor0 = (ParcelFileDescriptor)baua.m(parcel0, v1, ParcelFileDescriptor.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new ParcelByteArray(parcelFileDescriptor0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelByteArray[v];
    }
}

