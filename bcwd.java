import android.os.IInterface;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

public interface bcwd extends IInterface {
    void a(Status arg1, DataHolder arg2);

    void b(Status arg1, FenceStateImpl arg2);

    void c(Status arg1, FenceStateMapImpl arg2);

    void d(Status arg1, Snapshot arg2);

    void e(Status arg1);

    void f(Status arg1, WriteBatchImpl arg2);

    void g(Status arg1, DataHolder arg2);
}

