import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;

public interface bcwg extends IInterface {
    void a(bcwd arg1, String arg2, String arg3, String arg4, ContextDataFilterImpl arg5, ApiMetadata arg6);

    void b(bcwd arg1, String arg2, String arg3, String arg4, SnapshotRequest arg5, ApiMetadata arg6);

    void c(bcwd arg1, String arg2, String arg3, String arg4, bcwa arg5, PendingIntent arg6, ApiMetadata arg7);

    void d(bcwd arg1, String arg2, String arg3, String arg4, FenceUpdateRequestImpl arg5, ApiMetadata arg6);

    void e(bcwd arg1, String arg2, String arg3, String arg4, InterestUpdateBatchImpl arg5, ApiMetadata arg6);

    void f(bcwd arg1, String arg2, String arg3, String arg4, ContextDataFilterImpl arg5, ApiMetadata arg6);

    void g(bcwd arg1, String arg2, String arg3, String arg4, ContextDataFilterImpl arg5, bcwa arg6, PendingIntent arg7, ApiMetadata arg8);
}

