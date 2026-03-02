import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.ExpeditedUpdateStatus;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.UpdateDescription;
import com.google.android.gms.update.UpdateInfo;

public final class ezvq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int v4 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        String s = null;
        DownloadOptions downloadOptions0 = null;
        InstallationOptions installationOptions0 = null;
        ActivityStatus activityStatus0 = null;
        String s1 = null;
        String s2 = null;
        UpdateDescription updateDescription0 = null;
        ExpeditedUpdateStatus expeditedUpdateStatus0 = null;
        UpdateInfo updateInfo0 = null;
        long v5 = 0L;
        long v6 = 0L;
        long v7 = 0L;
        long v8 = 0L;
        long v9 = 0L;
        long v10 = 0L;
        long v11 = 0L;
        long v12 = 0L;
        long v13 = 0L;
        double f = 0.0;
        while(parcel0.dataPosition() < v) {
            int v14 = parcel0.readInt();
            switch(((char)v14)) {
                case 1: {
                    s = baua.s(parcel0, v14);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v14);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v14);
                    break;
                }
                case 4: {
                    v2 = baua.f(parcel0, v14);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v14);
                    break;
                }
                case 6: {
                    f = baua.b(parcel0, v14);
                    break;
                }
                case 7: {
                    downloadOptions0 = (DownloadOptions)baua.m(parcel0, v14, DownloadOptions.CREATOR);
                    break;
                }
                case 8: {
                    installationOptions0 = (InstallationOptions)baua.m(parcel0, v14, InstallationOptions.CREATOR);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v14);
                    break;
                }
                case 10: {
                    z2 = baua.D(parcel0, v14);
                    break;
                }
                case 11: {
                    z3 = baua.D(parcel0, v14);
                    break;
                }
                case 12: {
                    z4 = baua.D(parcel0, v14);
                    break;
                }
                case 13: {
                    z5 = baua.D(parcel0, v14);
                    break;
                }
                case 14: {
                    v5 = baua.i(parcel0, v14);
                    break;
                }
                case 15: {
                    v6 = baua.i(parcel0, v14);
                    break;
                }
                case 16: {
                    v7 = baua.i(parcel0, v14);
                    break;
                }
                case 17: {
                    v8 = baua.i(parcel0, v14);
                    break;
                }
                case 18: {
                    activityStatus0 = (ActivityStatus)baua.m(parcel0, v14, ActivityStatus.CREATOR);
                    break;
                }
                case 19: {
                    v9 = baua.i(parcel0, v14);
                    break;
                }
                case 20: {
                    s1 = baua.s(parcel0, v14);
                    break;
                }
                case 21: {
                    z6 = baua.D(parcel0, v14);
                    break;
                }
                case 22: {
                    v10 = baua.i(parcel0, v14);
                    break;
                }
                case 23: {
                    s2 = baua.s(parcel0, v14);
                    break;
                }
                case 24: {
                    updateDescription0 = (UpdateDescription)baua.m(parcel0, v14, UpdateDescription.CREATOR);
                    break;
                }
                case 25: {
                    z7 = baua.D(parcel0, v14);
                    break;
                }
                case 26: {
                    z8 = baua.D(parcel0, v14);
                    break;
                }
                case 27: {
                    z9 = baua.D(parcel0, v14);
                    break;
                }
                case 28: {
                    z10 = baua.D(parcel0, v14);
                    break;
                }
                case 30: {
                    z11 = baua.D(parcel0, v14);
                    break;
                }
                case 0x1F: {
                    expeditedUpdateStatus0 = (ExpeditedUpdateStatus)baua.m(parcel0, v14, ExpeditedUpdateStatus.CREATOR);
                    break;
                }
                case 0x20: {
                    v11 = baua.i(parcel0, v14);
                    break;
                }
                case 33: {
                    v12 = baua.i(parcel0, v14);
                    break;
                }
                case 34: {
                    v4 = baua.f(parcel0, v14);
                    break;
                }
                case 35: {
                    v13 = baua.i(parcel0, v14);
                    break;
                }
                case 36: {
                    z12 = baua.D(parcel0, v14);
                    break;
                }
                case 37: {
                    z13 = baua.D(parcel0, v14);
                    break;
                }
                case 38: {
                    z14 = baua.D(parcel0, v14);
                    break;
                }
                case 39: {
                    bundle0 = baua.j(parcel0, v14);
                    break;
                }
                case 40: {
                    updateInfo0 = (UpdateInfo)baua.m(parcel0, v14, UpdateInfo.CREATOR);
                    break;
                }
                case 41: {
                    z15 = baua.D(parcel0, v14);
                    break;
                }
                default: {
                    baua.C(parcel0, v14);
                }
            }
        }
        baua.A(parcel0, v);
        return new SystemUpdateStatus(s, z, v1, v2, v3, f, downloadOptions0, installationOptions0, z1, z2, z3, z4, z5, v5, v6, v7, v8, activityStatus0, v9, s1, z6, v10, s2, updateDescription0, z7, z8, z9, z10, z11, expeditedUpdateStatus0, v11, v12, v4, v13, z12, z13, z14, bundle0, updateInfo0, z15);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SystemUpdateStatus[v];
    }
}

