import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.internal.connection.ParcelableFileWithMetaData;
import com.google.android.gms.nearby.internal.connection.ParcelableResponse;

public final class czhn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        byte[][] arr2_b = null;
        ParcelableFileWithMetaData[] arr_parcelableFileWithMetaData = null;
        ParcelByteArray[] arr_parcelByteArray = null;
        boolean z = false;
        boolean z1 = false;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    arr2_b = baua.M(parcel0, v2);
                    break;
                }
                case 5: {
                    arr_parcelableFileWithMetaData = (ParcelableFileWithMetaData[])baua.J(parcel0, v2, ParcelableFileWithMetaData.CREATOR);
                    break;
                }
                case 6: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    arr_parcelByteArray = (ParcelByteArray[])baua.J(parcel0, v2, ParcelByteArray.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ParcelableResponse(z, v1, s, arr2_b, arr_parcelableFileWithMetaData, z1, arr_parcelByteArray);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelableResponse[v];
    }
}

