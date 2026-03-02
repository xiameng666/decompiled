import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.ProfilelessRecallSummary;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;

public final class bsgl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        String s = null;
        StockProfileImageEntity stockProfileImageEntity0 = null;
        ProfilelessRecallSummary profilelessRecallSummary0 = null;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int v1 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int v2 = 0;
        int v3 = 0;
        boolean z7 = false;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v4, Status.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v4);
                    break;
                }
                case 5: {
                    z2 = baua.D(parcel0, v4);
                    break;
                }
                case 6: {
                    stockProfileImageEntity0 = (StockProfileImageEntity)baua.m(parcel0, v4, StockProfileImageEntity.CREATOR);
                    break;
                }
                case 7: {
                    z3 = baua.D(parcel0, v4);
                    break;
                }
                case 8: {
                    z4 = baua.D(parcel0, v4);
                    break;
                }
                case 9: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 10: {
                    z5 = baua.D(parcel0, v4);
                    break;
                }
                case 11: {
                    z6 = baua.D(parcel0, v4);
                    break;
                }
                case 12: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 13: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 14: {
                    z7 = baua.D(parcel0, v4);
                    break;
                }
                case 15: {
                    profilelessRecallSummary0 = (ProfilelessRecallSummary)baua.m(parcel0, v4, ProfilelessRecallSummary.CREATOR);
                    break;
                }
                case 16: {
                    boolean0 = baua.n(parcel0, v4);
                    break;
                }
                case 17: {
                    boolean1 = baua.n(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProfileSettingsEntity(status0, s, z, z1, z2, stockProfileImageEntity0, z3, z4, v1, z5, z6, v2, v3, z7, profilelessRecallSummary0, boolean0, boolean1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProfileSettingsEntity[v];
    }
}

