import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.activeunlock.DeviceIdentifier;
import com.google.android.gms.activeunlock.SettingsTileState;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.concurrent.ExecutorService;

public final class eyhn extends eygy {
    public final DeviceIdentifier c;
    public final eyhy d;
    public final exki e;
    private final azug f;
    private final aayu g;

    @AssistedInject
    public eyhn(@Assisted aayu aayu0, @Assisted DeviceIdentifier deviceIdentifier0, eyhy eyhy0, exki exki0, bboh bboh0, @Assisted azug azug0) {
        ibuq.f(aayu0, "callbacks");
        ibuq.f(deviceIdentifier0, "deviceIdentifier");
        ibuq.f(exki0, "rangingCapabilityRepository");
        super(bboh0, azug0);
        this.g = aayu0;
        this.c = deviceIdentifier0;
        this.d = eyhy0;
        this.e = exki0;
        this.f = azug0;
    }

    @Override  // eygy
    protected final gmcd b(Context context0, ExecutorService executorService0) {
        ibuq.f(context0, "context");
        ibuq.f(executorService0, "executor");
        return icpu.e(iccl.b(new icds(executorService0)), new eyhm(this, context0, null));
    }

    @Override  // eygy
    public final void c(Status status0, Object object0) {
        ibuq.f(status0, "status");
        ApiMetadata apiMetadata0 = cckf.c(this.f);
        Parcel parcel0 = this.g.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, ((SettingsTileState)object0));
        wbz.f(parcel0, apiMetadata0);
        this.g.jq(1, parcel0);
    }

    public final void d(Context context0) {
        if(eyef.a(context0)) {
            this.e.d();
        }
    }
}

