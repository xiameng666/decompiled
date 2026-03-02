import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;

public final class eslh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        NotificationSettings notificationSettings0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                notificationSettings0 = (NotificationSettings)baua.m(parcel0, v1, NotificationSettings.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetNotificationSettingsResponse(notificationSettings0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetNotificationSettingsResponse[v];
    }
}

