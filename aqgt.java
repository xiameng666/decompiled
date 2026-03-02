import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;

public interface aqgt extends IInterface {
    void a(ParcelFileDescriptor arg1, ParcelableBackupDataOutput arg2, ParcelFileDescriptor arg3);

    void c(ParcelableBackupDataInput arg1, int arg2, ParcelFileDescriptor arg3);
}

