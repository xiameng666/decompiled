import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.Response;

public final class elcs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        GetGlobalSearchSourcesCall.GlobalSearchSource[] arr_getGlobalSearchSourcesCall$GlobalSearchSource = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    arr_getGlobalSearchSourcesCall$GlobalSearchSource = (GetGlobalSearchSourcesCall.GlobalSearchSource[])baua.J(parcel0, v1, GetGlobalSearchSourcesCall.GlobalSearchSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetGlobalSearchSourcesCall.Response(status0, arr_getGlobalSearchSourcesCall$GlobalSearchSource);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetGlobalSearchSourcesCall.Response[v];
    }
}

