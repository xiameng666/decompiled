import android.os.Parcel;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

public abstract class bcuk extends wby implements bcul {
    public bcuk() {
        super("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                FenceTriggerInfoImpl fenceTriggerInfoImpl0 = (FenceTriggerInfoImpl)wbz.a(parcel0, FenceTriggerInfoImpl.CREATOR);
                bcuk.gr(parcel0);
                this.b(fenceTriggerInfoImpl0);
                break;
            }
            case 2: {
                FenceStateImpl fenceStateImpl0 = (FenceStateImpl)wbz.a(parcel0, FenceStateImpl.CREATOR);
                bcuk.gr(parcel0);
                this.a(fenceStateImpl0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

