import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.featurestatus.internal.binder.Action;
import com.google.android.gms.libs.featurestatus.internal.binder.Buttons;
import com.google.android.gms.libs.featurestatus.internal.binder.ContextualCard;
import com.google.android.gms.libs.featurestatus.internal.binder.ProgressBar;

public final class ccqv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        String s = null;
        String s1 = null;
        Action action0 = null;
        Buttons buttons0 = null;
        ProgressBar progressBar0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    action0 = (Action)baua.m(parcel0, v3, Action.CREATOR);
                    break;
                }
                case 5: {
                    progressBar0 = (ProgressBar)baua.m(parcel0, v3, ProgressBar.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    buttons0 = (Buttons)baua.m(parcel0, v3, Buttons.CREATOR);
                    break;
                }
                case 8: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContextualCard(s, s1, action0, buttons0, progressBar0, v1, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContextualCard[v];
    }
}

