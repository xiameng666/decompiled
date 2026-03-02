import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;

public final class egbs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        int v1 = 0;
        BackupSyncContactInfo backupSyncContactInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    backupSyncContactInfo0 = (BackupSyncContactInfo)baua.m(parcel0, v2, BackupSyncContactInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetBackupSyncSuggestionResponse(v1, s, backupSyncContactInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetBackupSyncSuggestionResponse[v];
    }
}

