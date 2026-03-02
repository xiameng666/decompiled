import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

public final class abxj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DocumentId documentId0 = null;
        String s = null;
        DocumentContents documentContents0 = null;
        String s1 = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        int v3 = -1;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    documentId0 = (DocumentId)baua.m(parcel0, v5, DocumentId.CREATOR);
                    break;
                }
                case 2: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 5: {
                    documentContents0 = (DocumentContents)baua.m(parcel0, v5, DocumentContents.CREATOR);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 7: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new UsageInfo(documentId0, v4, v1, s, documentContents0, z, v3, v2, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UsageInfo[v];
    }
}

