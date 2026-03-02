import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.im.InstrumentManagerExtras;

public final class fblb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return new InstrumentManagerExtras(((gfla)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gfla.a).jf(7, null)))));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InstrumentManagerExtras[v];
    }
}

