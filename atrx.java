import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.EqualizerBandSettings;
import com.google.android.gms.cast.EqualizerSettings;

public final class atrx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        EqualizerBandSettings equalizerBandSettings0 = null;
        EqualizerBandSettings equalizerBandSettings1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    equalizerBandSettings0 = (EqualizerBandSettings)baua.m(parcel0, v1, EqualizerBandSettings.CREATOR);
                    break;
                }
                case 3: {
                    equalizerBandSettings1 = (EqualizerBandSettings)baua.m(parcel0, v1, EqualizerBandSettings.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new EqualizerSettings(equalizerBandSettings0, equalizerBandSettings1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new EqualizerSettings[v];
    }
}

