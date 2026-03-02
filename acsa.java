import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.auth.TokenData;

public final class acsa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TokenData tokenData0 = null;
        String s = null;
        Intent intent0 = null;
        PendingIntent pendingIntent0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    tokenData0 = (TokenData)baua.m(parcel0, v1, TokenData.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    intent0 = (Intent)baua.m(parcel0, v1, Intent.CREATOR);
                    break;
                }
                case 4: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetHubTokenInternalResponse(tokenData0, s, intent0, pendingIntent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetHubTokenInternalResponse[v];
    }
}

