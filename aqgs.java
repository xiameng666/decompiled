import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;

public abstract class aqgs extends wby implements aqgt {
    public aqgs() {
        super("com.google.android.gms.backup.IChimeraModuleBackupAgent");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                ParcelableBackupDataOutput parcelableBackupDataOutput0 = (ParcelableBackupDataOutput)wbz.a(parcel0, ParcelableBackupDataOutput.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor1 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                aqgs.gr(parcel0);
                this.a(parcelFileDescriptor0, parcelableBackupDataOutput0, parcelFileDescriptor1);
                break;
            }
            case 2: {
                ParcelableBackupDataInput parcelableBackupDataInput0 = (ParcelableBackupDataInput)wbz.a(parcel0, ParcelableBackupDataInput.CREATOR);
                int v1 = parcel0.readInt();
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                aqgs.gr(parcel0);
                this.c(parcelableBackupDataInput0, v1, parcelFileDescriptor2);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

