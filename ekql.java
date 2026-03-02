import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class ekql extends wby implements ekqm {
    public ekql() {
        super("com.google.android.gms.scheduler.IGmsTaskScheduler");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ekqp ekqp0;
        switch(v) {
            case 1: {
                Intent intent0 = (Intent)wbz.a(parcel0, Intent.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    ekqp0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.scheduler.ISchedulerCallbacks");
                    ekqp0 = (iInterface0 instanceof ekqp) ? ((ekqp)iInterface0) : new ekqn(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekql.gr(parcel0);
                this.a(intent0, ekqp0, apiMetadata0);
                return true;
            }
            case 2: {
                int v1 = parcel0.readInt();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ekql.gr(parcel0);
                this.b(v1, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

