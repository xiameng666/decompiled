import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public interface kjo {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context arg1, kis arg2, CancellationSignal arg3, Executor arg4, kjk arg5);

    void onGetCredential(Context arg1, kka arg2, CancellationSignal arg3, Executor arg4, kjk arg5);

    void onPrepareCredential(kka arg1, CancellationSignal arg2, Executor arg3, kjk arg4);
}

