import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.authzen.gencode.server.api.SyncTxResponseEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.SyncTxResponseWebViewPromptEntity;
import java.util.HashSet;
import java.util.List;

public final class aijh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    list0 = baua.y(parcel0, v1, SyncTxResponseWebViewPromptEntity.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new SyncTxResponseEntity(hashSet0, s, list0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SyncTxResponseEntity[v];
    }
}

