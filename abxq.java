import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class abxq extends wby implements abxr {
    private final evqp a;

    public abxq() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public abxq(evqp evqp0) {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.a = evqp0;
    }

    @Override  // abxr
    public final void a(Status status0, ParcelFileDescriptor parcelFileDescriptor0, ApiMetadata apiMetadata0) {
        azzf.b(status0, parcelFileDescriptor0, this.a);
    }

    @Override  // abxr
    public final void b(GetRecentContextCall.Response getRecentContextCall$Response0, ApiMetadata apiMetadata0) {
        azzf.b(getRecentContextCall$Response0.a, getRecentContextCall$Response0.b, this.a);
    }

    @Override  // abxr
    public final void c(Status status0, ApiMetadata apiMetadata0) {
        azzf.b(status0, null, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxq.gr(parcel0);
                this.c(status0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxq.gr(parcel0);
                this.a(status1, parcelFileDescriptor0, apiMetadata1);
                return true;
            }
            case 4: {
                GetRecentContextCall.Response getRecentContextCall$Response0 = (GetRecentContextCall.Response)wbz.a(parcel0, GetRecentContextCall.Response.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxq.gr(parcel0);
                this.b(getRecentContextCall$Response0, apiMetadata2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

