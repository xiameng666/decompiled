import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.featurestatus.internal.binder.ProgressBar;
import com.google.android.gms.libs.featurestatus.internal.binder.ProgressColor;

public final class ccrh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        double f = 0.0;
        ProgressColor progressColor0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    f = baua.b(parcel0, v1);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    progressColor0 = (ProgressColor)baua.m(parcel0, v1, ProgressColor.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProgressBar(f, s, progressColor0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProgressBar[v];
    }
}

