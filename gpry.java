import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.gms.mdns.MdnsServiceInfo.TextEntry;
import com.google.gms.mdns.MdnsServiceInfo;
import j..time.Instant;
import java.util.ArrayList;

public final class gpry implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        String s = parcel0.readString();
        String[] arr_s = parcel0.createStringArray();
        ArrayList arrayList0 = parcel0.createStringArrayList();
        String[] arr_s1 = parcel0.createStringArray();
        int v = parcel0.readInt();
        ArrayList arrayList1 = parcel0.createStringArrayList();
        ArrayList arrayList2 = parcel0.createStringArrayList();
        ArrayList arrayList3 = parcel0.createTypedArrayList(MdnsServiceInfo.TextEntry.CREATOR);
        int v1 = parcel0.readInt();
        Instant instant0 = Instant.ofEpochSecond(parcel0.readLong());
        return new MdnsServiceInfo(s, arr_s, arrayList0, arr_s1, v, arrayList1, arrayList2, arrayList3, v1, ((Network)parcel0.readParcelable(Network.class.getClassLoader())), instant0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdnsServiceInfo[v];
    }
}

