import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

public final class ruo extends wbx implements ruq {
    public ruo(IBinder iBinder0) {
        super(iBinder0, "com.android.onboarding.tasks.IOnboardingTaskManagerService");
    }

    @Override  // ruq
    public final int a() {
        Parcel parcel0 = this.hM(10, this.jo());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // ruq
    public final ErasedOnboardingTaskState c(ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        Parcel parcel1 = this.hM(2, parcel0);
        ErasedOnboardingTaskState erasedOnboardingTaskState0 = (ErasedOnboardingTaskState)wbz.a(parcel1, ErasedOnboardingTaskState.CREATOR);
        parcel1.recycle();
        return erasedOnboardingTaskState0;
    }

    @Override  // ruq
    public final rzw d(rzz rzz0, rzt rzt0) {
        rzw rzw0;
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, rzz0);
        wbz.h(parcel0, rzt0);
        Parcel parcel1 = this.hM(15, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            rzw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.onboarding.tasks.service.IObserverHandle");
            rzw0 = (iInterface0 instanceof rzw) ? ((rzw)iInterface0) : new rzu(iBinder0);
        }
        parcel1.recycle();
        return rzw0;
    }

    @Override  // ruq
    public final rzw e(rzz rzz0, rzt rzt0) {
        throw null;
    }

    @Override  // ruq
    public final void f(rzz rzz0, sac sac0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, rzz0);
        wbz.h(parcel0, sac0);
        this.jq(17, parcel0);
    }

    @Override  // ruq
    public final PersistableBundle fd(ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        throw null;
    }

    @Override  // ruq
    public final void fh(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        wbz.h(parcel0, rut0);
        this.jp(6, parcel0);
    }

    @Override  // ruq
    public final void g(rzz rzz0, sac sac0) {
        throw null;
    }

    @Override  // ruq
    public final void h(rzz rzz0, sac sac0) {
        throw null;
    }

    @Override  // ruq
    public final void i(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, run run0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        wbz.h(parcel0, run0);
        this.jp(9, parcel0);
    }

    @Override  // ruq
    public final void j(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0) {
        throw null;
    }

    @Override  // ruq
    public final void k(rzz rzz0, rzz rzz1, saf saf0) {
        throw null;
    }

    @Override  // ruq
    public final void m(rzz rzz0, rzz rzz1, saf saf0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, rzz0);
        wbz.h(parcel0, rzz1);
        wbz.h(parcel0, saf0);
        this.jq(11, parcel0);
    }

    @Override  // ruq
    public final void n(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        wbz.h(parcel0, rut0);
        this.jp(5, parcel0);
    }

    @Override  // ruq
    public final boolean o(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, int v, byte[] arr_b, int v1, int v2, int v3) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        parcel0.writeInt(v);
        parcel0.writeByteArray(arr_b);
        parcel0.writeInt(v1);
        parcel0.writeInt(v2);
        parcel0.writeInt(v3);
        Parcel parcel1 = this.hM(7, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // ruq
    public final boolean p(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        wbz.f(parcel0, persistableBundle0);
        Parcel parcel1 = this.hM(1, parcel0);
        boolean z = wbz.i(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // ruq
    public final byte[] q(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, int v, int v1, int v2, int v3) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, erasedOnboardingTaskToken0);
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        parcel0.writeInt(v2);
        parcel0.writeInt(v3);
        Parcel parcel1 = this.hM(8, parcel0);
        byte[] arr_b = parcel1.createByteArray();
        parcel1.recycle();
        return arr_b;
    }
}

