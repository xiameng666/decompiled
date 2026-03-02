import android.os.IInterface;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetUpdatedParams;

public interface ddpc extends IInterface {
    void a(OnShareTargetDiscoveredParams arg1);

    void c(OnShareTargetDistanceChangedParams arg1);

    void d(OnShareTargetLostParams arg1);

    void e(OnShareTargetUpdatedParams arg1);
}

