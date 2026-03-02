import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderResponse;

public final class gchs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return new PaySePerformSdkOperationAsyncTaskLoaderResponse(parcel0.readInt(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), ((gfbf)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gfbf.a).jf(7, null)))));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaySePerformSdkOperationAsyncTaskLoaderResponse[v];
    }
}

