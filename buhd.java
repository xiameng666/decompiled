import android.content.Intent;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googleone.StorageManagementIntentRequest;

public final class buhd implements azys {
    public final StorageManagementIntentRequest a;

    public buhd(StorageManagementIntentRequest storageManagementIntentRequest0) {
        this.a = storageManagementIntentRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bugv bugv0 = (bugv)object0;
        bugy bugy0 = (bugy)bugv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bugv0.r);
        Intent intent0 = bugy0.a(this.a, apiMetadata0);
        azzf.b(Status.b, intent0, ((evqp)object1));
    }
}

