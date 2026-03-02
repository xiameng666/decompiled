import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.internal.connection.ParcelableOneWayMessage;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.ParcelableRequest;
import com.google.android.gms.nearby.internal.connection.ParcelableResponse;

public final class czhl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        byte[] arr_b = null;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        String s = null;
        ParcelFileDescriptor parcelFileDescriptor1 = null;
        Uri uri0 = null;
        ParcelByteArray parcelByteArray0 = null;
        String s1 = null;
        String s2 = null;
        ParcelableRequest parcelableRequest0 = null;
        ParcelableResponse parcelableResponse0 = null;
        ParcelableOneWayMessage parcelableOneWayMessage0 = null;
        long v3 = 0L;
        long v4 = 0L;
        long v5 = 0L;
        long v6 = -1L;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v3 = baua.i(parcel0, v7);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v7);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v7);
                    break;
                }
                case 4: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)baua.m(parcel0, v7, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 6: {
                    v6 = baua.i(parcel0, v7);
                    break;
                }
                case 7: {
                    parcelFileDescriptor1 = (ParcelFileDescriptor)baua.m(parcel0, v7, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 8: {
                    uri0 = (Uri)baua.m(parcel0, v7, Uri.CREATOR);
                    break;
                }
                case 9: {
                    v4 = baua.i(parcel0, v7);
                    break;
                }
                case 10: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 11: {
                    parcelByteArray0 = (ParcelByteArray)baua.m(parcel0, v7, ParcelByteArray.CREATOR);
                    break;
                }
                case 12: {
                    v5 = baua.i(parcel0, v7);
                    break;
                }
                case 13: {
                    s1 = baua.s(parcel0, v7);
                    break;
                }
                case 14: {
                    s2 = baua.s(parcel0, v7);
                    break;
                }
                case 15: {
                    parcelableRequest0 = (ParcelableRequest)baua.m(parcel0, v7, ParcelableRequest.CREATOR);
                    break;
                }
                case 16: {
                    parcelableResponse0 = (ParcelableResponse)baua.m(parcel0, v7, ParcelableResponse.CREATOR);
                    break;
                }
                case 17: {
                    v2 = baua.f(parcel0, v7);
                    break;
                }
                case 18: {
                    parcelableOneWayMessage0 = (ParcelableOneWayMessage)baua.m(parcel0, v7, ParcelableOneWayMessage.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new ParcelablePayload(v3, v1, arr_b, parcelFileDescriptor0, s, v6, parcelFileDescriptor1, uri0, v4, z, parcelByteArray0, v5, s1, s2, parcelableRequest0, parcelableResponse0, parcelableOneWayMessage0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelablePayload[v];
    }
}

