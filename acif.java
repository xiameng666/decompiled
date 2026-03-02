import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.SearchResult.MatchInfo;
import com.google.android.gms.appsearch.SearchResult;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import java.util.ArrayList;
import java.util.List;

public final class acif implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        double f = 0.0;
        GenericDocumentParcel genericDocumentParcel0 = null;
        List list0 = null;
        String s = null;
        String s1 = null;
        List list1 = null;
        List list2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    genericDocumentParcel0 = (GenericDocumentParcel)baua.m(parcel0, v1, GenericDocumentParcel.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, SearchResult.MatchInfo.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    f = baua.b(parcel0, v1);
                    break;
                }
                case 6: {
                    list1 = baua.y(parcel0, v1, SearchResult.CREATOR);
                    break;
                }
                case 7: {
                    int v2 = baua.g(parcel0, v1);
                    int v3 = parcel0.dataPosition();
                    if(v2 == 0) {
                        list2 = null;
                    }
                    else {
                        ArrayList arrayList0 = new ArrayList();
                        int v4 = parcel0.readInt();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            arrayList0.add(Double.valueOf(parcel0.readDouble()));
                        }
                        parcel0.setDataPosition(v3 + v2);
                        list2 = arrayList0;
                    }
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SearchResult(genericDocumentParcel0, list0, s, s1, f, list1, list2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SearchResult[v];
    }
}

