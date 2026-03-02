import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.libraries.bluetooth.fastpair.fmd.FmdResponse;

public final class fgsm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v;
        fgsn fgsn0 = FmdResponse.d();
        fgsn0.b(parcel0.readInt());
        fgsn0.c(parcel0.readInt());
        try {
            String s = parcel0.readString();
            if(s != null) {
                switch(s) {
                    case "UNKNOWN": {
                        v = 1;
                        break;
                    }
                    case "VERSION_IGNORED": {
                        v = 3;
                        break;
                    }
                    case "VERSION_MISSING": {
                        v = 4;
                        break;
                    }
                    case "VERSION_UPDATED": {
                        v = 2;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
                fgsn0.a = v;
                return fgsn0.a();
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        return fgsn0.a();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FmdResponse[v];
    }
}

