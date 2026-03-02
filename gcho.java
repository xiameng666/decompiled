import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderResponse;

public final class gcho implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return new PaySeFetchCardAsyncTaskLoaderResponse(gciq.h(parcel0, ((Parser)((ProtoLiteMessage)gfbf.a).jf(7, null))));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaySeFetchCardAsyncTaskLoaderResponse[v];
    }
}

