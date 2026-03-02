import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.featurestatus.internal.binder.Button;
import com.google.android.gms.libs.featurestatus.internal.binder.Buttons;

public final class ccqu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Button button0 = null;
        Button button1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    button0 = (Button)baua.m(parcel0, v1, Button.CREATOR);
                    break;
                }
                case 2: {
                    button1 = (Button)baua.m(parcel0, v1, Button.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Buttons(button0, button1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Buttons[v];
    }
}

