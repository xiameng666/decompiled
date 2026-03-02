import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnStateUpdateParams;

public final class ddph extends wby implements ddpi {
    private azyf a;

    public ddph() {
        super("com.google.android.gms.nearby.sharing.internal.IStateUpdateCallback");
    }

    public ddph(azyf azyf0) {
        super("com.google.android.gms.nearby.sharing.internal.IStateUpdateCallback");
        this.a = azyf0;
    }

    @Override  // ddpi
    public final void a(OnStateUpdateParams onStateUpdateParams0) {
        synchronized(this) {
            azyf azyf0 = this.a;
            if(azyf0 == null) {
                return;
            }
            azyf0.b(new dduh(this));
        }
    }

    public final void c() {
        synchronized(this) {
            this.a = null;
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            OnStateUpdateParams onStateUpdateParams0 = (OnStateUpdateParams)wbz.a(parcel0, OnStateUpdateParams.CREATOR);
            ddph.gr(parcel0);
            this.a(onStateUpdateParams0);
            return true;
        }
        return false;
    }
}

