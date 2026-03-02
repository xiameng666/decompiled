import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.GetSchemaResponse;
import com.google.android.gms.appsearch.InternalSetSchemaResponse;
import com.google.android.gms.appsearch.SearchResultPage;
import com.google.android.gms.appsearch.SearchSuggestionResult;
import com.google.android.gms.appsearch.SetSchemaResponse.MigrationFailure;
import com.google.android.gms.appsearch.StorageInfo;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import java.util.List;

public class acjc implements Parcelable.Creator {
    public AppSearchResultParcel a(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        InternalSetSchemaResponse internalSetSchemaResponse0 = null;
        GetSchemaResponse getSchemaResponse0 = null;
        List list0 = null;
        GenericDocumentParcel genericDocumentParcel0 = null;
        SearchResultPage searchResultPage0 = null;
        List list1 = null;
        List list2 = null;
        StorageInfo storageInfo0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    internalSetSchemaResponse0 = (InternalSetSchemaResponse)baua.m(parcel0, v2, InternalSetSchemaResponse.CREATOR);
                    break;
                }
                case 4: {
                    getSchemaResponse0 = (GetSchemaResponse)baua.m(parcel0, v2, GetSchemaResponse.CREATOR);
                    break;
                }
                case 5: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                case 6: {
                    genericDocumentParcel0 = (GenericDocumentParcel)baua.m(parcel0, v2, GenericDocumentParcel.CREATOR);
                    break;
                }
                case 7: {
                    searchResultPage0 = (SearchResultPage)baua.m(parcel0, v2, SearchResultPage.CREATOR);
                    break;
                }
                case 8: {
                    list1 = baua.y(parcel0, v2, SetSchemaResponse.MigrationFailure.CREATOR);
                    break;
                }
                case 9: {
                    list2 = baua.y(parcel0, v2, SearchSuggestionResult.CREATOR);
                    break;
                }
                case 10: {
                    storageInfo0 = (StorageInfo)baua.m(parcel0, v2, StorageInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AppSearchResultParcel(v1, s, internalSetSchemaResponse0, getSchemaResponse0, list0, genericDocumentParcel0, searchResultPage0, list1, list2, storageInfo0);
    }

    public static void b(AppSearchResultParcel appSearchResultParcel0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, appSearchResultParcel0.b);
        baub.v(parcel0, 2, appSearchResultParcel0.c, false);
        baub.t(parcel0, 3, appSearchResultParcel0.d, v, false);
        baub.t(parcel0, 4, appSearchResultParcel0.e, v, false);
        baub.x(parcel0, 5, appSearchResultParcel0.f, false);
        baub.t(parcel0, 6, appSearchResultParcel0.g, v, false);
        baub.t(parcel0, 7, appSearchResultParcel0.h, v, false);
        baub.y(parcel0, 8, appSearchResultParcel0.i, false);
        baub.y(parcel0, 9, appSearchResultParcel0.j, false);
        baub.t(parcel0, 10, appSearchResultParcel0.k, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.a(parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppSearchResultParcel[v];
    }
}

