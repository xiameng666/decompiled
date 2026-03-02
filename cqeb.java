import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

public interface cqeb extends IInterface {
    void a(cqdy arg1, SyncRequest arg2, CallerInfo arg3, ApiMetadata arg4);

    void b(cqdy arg1, TeleportingSyncRequest arg2, CallerInfo arg3, ApiMetadata arg4);
}

