import android.os.IInterface;
import com.google.android.gms.backup.extension.download.ClientInfo;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadResult;

public interface arua extends IInterface {
    void a(CustomBackupDataDownloadResult arg1);

    void b(ClientInfo arg1);

    void c(float arg1, int arg2);
}

