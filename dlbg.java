import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import java.io.DataInputStream;
import java.io.IOException;

@Deprecated
public final class dlbg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Object object0;
        byte[] arr_b;
        int v;
        ParcelFileDescriptor parcelFileDescriptor0 = parcel0.readFileDescriptor();
        try {
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0));
            v = dataInputStream0.available();
            arr_b = new byte[v];
            dataInputStream0.read(arr_b);
            dataInputStream0.close();
            parcelFileDescriptor0.close();
        }
        catch(IOException iOException0) {
            throw new dlbh("Couldn\'t read from unlinked file.", iOException0);
        }
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel1.unmarshall(arr_b, 0, v);
            parcel1.setDataPosition(0);
            int v2 = baua.h(parcel1);
            SyncRequest syncRequest0 = null;
            while(parcel1.dataPosition() < v2) {
                int v3 = parcel1.readInt();
                if(((char)v3) == 1) {
                    syncRequest0 = (SyncRequest)baua.m(parcel1, v3, SyncRequest.CREATOR);
                }
                else {
                    baua.C(parcel1, v3);
                }
            }
            baua.A(parcel1, v2);
            object0 = new TeleportingSyncRequest(syncRequest0);
        }
        finally {
            parcel1.recycle();
        }
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TeleportingSyncRequest[v];
    }
}

