import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.concurrent.ExecutorService;

public final class eyhf extends eygy {
    public final String c;
    public final exyg d;
    private final aayq e;

    @AssistedInject
    public eyhf(@Assisted aayq aayq0, @Assisted String s, exyg exyg0, bboh bboh0, @Assisted azug azug0) {
        ibuq.f(aayq0, "callbacks");
        ibuq.f(s, "bluetoothAddress");
        super(bboh0, azug0);
        this.e = aayq0;
        this.c = s;
        this.d = exyg0;
    }

    @Override  // eygy
    protected final gmcd b(Context context0, ExecutorService executorService0) {
        ibuq.f(context0, "context");
        ibuq.f(executorService0, "executor");
        return icpu.e(iccl.b(new icds(executorService0)), new eyhe(this, null));
    }

    @Override  // eygy
    public final void c(Status status0, Object object0) {
        ibuq.f(status0, "status");
        ApiMetadata apiMetadata0 = cckf.d(bbdp.h);
        this.e.a(status0, (((Boolean)object0) == null ? false : ((Boolean)object0).booleanValue()), apiMetadata0);
    }
}

