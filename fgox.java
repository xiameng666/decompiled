import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

public final class fgox implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        String s = gfta.b(parcel0.readString());
        fgoy fgoy0 = TrueWirelessHeadset.j();
        fgoy0.h(s);
        fgoy0.f(((HeadsetPiece)HeadsetPiece.CREATOR.createFromParcel(parcel0)));
        fgoy0.i(((HeadsetPiece)HeadsetPiece.CREATOR.createFromParcel(parcel0)));
        fgoy0.c(((HeadsetPiece)HeadsetPiece.CREATOR.createFromParcel(parcel0)));
        fgoy0.a = (Uri)parcel0.readParcelable(Uri.class.getClassLoader());
        fgoy0.e(parcel0.readLong());
        fgoy0.g(gfta.b(parcel0.readString()));
        fgoy0.b(parcel0.readLong());
        fgoy0.d(parcel0.readByte() != 0);
        return fgoy0.a();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TrueWirelessHeadset[v];
    }
}

