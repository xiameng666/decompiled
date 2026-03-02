import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnInstallUpdateParams;

public final class ddoj extends wby implements ddok {
    private azyf a;

    public ddoj() {
        super("com.google.android.gms.nearby.sharing.internal.IInstallUpdateCallback");
    }

    public ddoj(azyf azyf0) {
        super("com.google.android.gms.nearby.sharing.internal.IInstallUpdateCallback");
        this.a = azyf0;
    }

    @Override  // ddok
    public final void a(OnInstallUpdateParams onInstallUpdateParams0) {
        synchronized(this) {
            azyf azyf0 = this.a;
            if(azyf0 == null) {
                return;
            }
            azyf0.b(new ddpt(this, onInstallUpdateParams0));
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
            OnInstallUpdateParams onInstallUpdateParams0 = (OnInstallUpdateParams)wbz.a(parcel0, OnInstallUpdateParams.CREATOR);
            ddoj.gr(parcel0);
            this.a(onInstallUpdateParams0);
            return true;
        }
        return false;
    }
}

