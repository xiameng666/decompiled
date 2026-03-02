import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;

public final class bztx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Intent intent0 = null;
        String s = null;
        String s1 = null;
        BitmapTeleporter bitmapTeleporter0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    intent0 = (Intent)baua.m(parcel0, v1, Intent.CREATOR);
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
                    bitmapTeleporter0 = (BitmapTeleporter)baua.m(parcel0, v1, BitmapTeleporter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LaunchData(intent0, s, s1, bitmapTeleporter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LaunchData[v];
    }
}

