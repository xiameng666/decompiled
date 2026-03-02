import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

public abstract class rup extends wby implements ruq {
    public rup() {
        super("com.android.onboarding.tasks.IOnboardingTaskManagerService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        rzz rzz8;
        rzz rzz7;
        rzz rzz6;
        rzz rzz5;
        rzz rzz4;
        rzz rzz3;
        rzz rzz2;
        rzz rzz1;
        rzz rzz0;
        rut rut0 = null;
        switch(v) {
            case 1: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                PersistableBundle persistableBundle0 = (PersistableBundle)wbz.a(parcel0, PersistableBundle.CREATOR);
                rup.gr(parcel0);
                boolean z = this.p(erasedOnboardingTaskToken0, persistableBundle0);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 2: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken1 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                rup.gr(parcel0);
                ErasedOnboardingTaskState erasedOnboardingTaskState0 = this.c(erasedOnboardingTaskToken1);
                parcel1.writeNoException();
                wbz.g(parcel1, erasedOnboardingTaskState0);
                return true;
            }
            case 3: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken2 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                rup.gr(parcel0);
                PersistableBundle persistableBundle1 = this.fd(erasedOnboardingTaskToken2);
                parcel1.writeNoException();
                wbz.g(parcel1, persistableBundle1);
                return true;
            }
            case 4: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken3 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                PersistableBundle persistableBundle2 = (PersistableBundle)wbz.a(parcel0, PersistableBundle.CREATOR);
                rup.gr(parcel0);
                this.j(erasedOnboardingTaskToken3, persistableBundle2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken4 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.onboarding.tasks.IOnboardingTaskManagerServiceListener");
                    rut0 = (iInterface0 instanceof rut) ? ((rut)iInterface0) : new rur(iBinder0);
                }
                rup.gr(parcel0);
                this.n(erasedOnboardingTaskToken4, rut0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken5 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.android.onboarding.tasks.IOnboardingTaskManagerServiceListener");
                    rut0 = (iInterface1 instanceof rut) ? ((rut)iInterface1) : new rur(iBinder1);
                }
                rup.gr(parcel0);
                this.fh(erasedOnboardingTaskToken5, rut0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken6 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                int v1 = parcel0.readInt();
                byte[] arr_b = parcel0.createByteArray();
                int v2 = parcel0.readInt();
                int v3 = parcel0.readInt();
                int v4 = parcel0.readInt();
                rup.gr(parcel0);
                boolean z1 = this.o(erasedOnboardingTaskToken6, v1, arr_b, v2, v3, v4);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 8: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken7 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                int v5 = parcel0.readInt();
                int v6 = parcel0.readInt();
                int v7 = parcel0.readInt();
                int v8 = parcel0.readInt();
                rup.gr(parcel0);
                byte[] arr_b1 = this.q(erasedOnboardingTaskToken7, v5, v6, v7, v8);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b1);
                return true;
            }
            case 9: {
                ErasedOnboardingTaskToken erasedOnboardingTaskToken8 = (ErasedOnboardingTaskToken)wbz.a(parcel0, ErasedOnboardingTaskToken.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.android.onboarding.tasks.IGetTaskStateListener");
                    rut0 = (iInterface2 instanceof run) ? ((run)iInterface2) : new rul(iBinder2);
                }
                rup.gr(parcel0);
                this.i(erasedOnboardingTaskToken8, ((run)rut0));
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                int v9 = this.a();
                parcel1.writeNoException();
                parcel1.writeInt(v9);
                return true;
            }
            case 11: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    rzz0 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz0 = (iInterface3 instanceof rzz) ? ((rzz)iInterface3) : new rzx(iBinder3);
                }
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    rzz1 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz1 = (iInterface4 instanceof rzz) ? ((rzz)iInterface4) : new rzx(iBinder4);
                }
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.android.onboarding.tasks.service.IUnitCallback");
                    rut0 = (iInterface5 instanceof saf) ? ((saf)iInterface5) : new sad(iBinder5);
                }
                rup.gr(parcel0);
                this.m(rzz0, rzz1, ((saf)rut0));
                return true;
            }
            case 12: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 == null) {
                    rzz2 = null;
                }
                else {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz2 = (iInterface6 instanceof rzz) ? ((rzz)iInterface6) : new rzx(iBinder6);
                }
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.android.onboarding.tasks.service.IResultCallback");
                    rut0 = (iInterface7 instanceof sac) ? ((sac)iInterface7) : new saa(iBinder7);
                }
                rup.gr(parcel0);
                this.h(rzz2, ((sac)rut0));
                return true;
            }
            case 13: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 == null) {
                    rzz3 = null;
                }
                else {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz3 = (iInterface8 instanceof rzz) ? ((rzz)iInterface8) : new rzx(iBinder8);
                }
                IBinder iBinder9 = parcel0.readStrongBinder();
                if(iBinder9 != null) {
                    IInterface iInterface9 = iBinder9.queryLocalInterface("com.android.onboarding.tasks.service.IObserver");
                    rut0 = (iInterface9 instanceof rzt) ? ((rzt)iInterface9) : new rzr(iBinder9);
                }
                rup.gr(parcel0);
                rzw rzw0 = this.e(rzz3, ((rzt)rut0));
                parcel1.writeNoException();
                wbz.h(parcel1, rzw0);
                return true;
            }
            case 14: {
                IBinder iBinder10 = parcel0.readStrongBinder();
                if(iBinder10 == null) {
                    rzz4 = null;
                }
                else {
                    IInterface iInterface10 = iBinder10.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz4 = (iInterface10 instanceof rzz) ? ((rzz)iInterface10) : new rzx(iBinder10);
                }
                IBinder iBinder11 = parcel0.readStrongBinder();
                if(iBinder11 != null) {
                    IInterface iInterface11 = iBinder11.queryLocalInterface("com.android.onboarding.tasks.service.IResultCallback");
                    rut0 = (iInterface11 instanceof sac) ? ((sac)iInterface11) : new saa(iBinder11);
                }
                rup.gr(parcel0);
                this.g(rzz4, ((sac)rut0));
                return true;
            }
            case 15: {
                IBinder iBinder12 = parcel0.readStrongBinder();
                if(iBinder12 == null) {
                    rzz5 = null;
                }
                else {
                    IInterface iInterface12 = iBinder12.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz5 = (iInterface12 instanceof rzz) ? ((rzz)iInterface12) : new rzx(iBinder12);
                }
                IBinder iBinder13 = parcel0.readStrongBinder();
                if(iBinder13 != null) {
                    IInterface iInterface13 = iBinder13.queryLocalInterface("com.android.onboarding.tasks.service.IObserver");
                    rut0 = (iInterface13 instanceof rzt) ? ((rzt)iInterface13) : new rzr(iBinder13);
                }
                rup.gr(parcel0);
                rzw rzw1 = this.d(rzz5, ((rzt)rut0));
                parcel1.writeNoException();
                wbz.h(parcel1, rzw1);
                return true;
            }
            case 16: {
                IBinder iBinder14 = parcel0.readStrongBinder();
                if(iBinder14 == null) {
                    rzz6 = null;
                }
                else {
                    IInterface iInterface14 = iBinder14.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz6 = (iInterface14 instanceof rzz) ? ((rzz)iInterface14) : new rzx(iBinder14);
                }
                IBinder iBinder15 = parcel0.readStrongBinder();
                if(iBinder15 == null) {
                    rzz7 = null;
                }
                else {
                    IInterface iInterface15 = iBinder15.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz7 = (iInterface15 instanceof rzz) ? ((rzz)iInterface15) : new rzx(iBinder15);
                }
                IBinder iBinder16 = parcel0.readStrongBinder();
                if(iBinder16 != null) {
                    IInterface iInterface16 = iBinder16.queryLocalInterface("com.android.onboarding.tasks.service.IUnitCallback");
                    rut0 = (iInterface16 instanceof saf) ? ((saf)iInterface16) : new sad(iBinder16);
                }
                rup.gr(parcel0);
                this.k(rzz6, rzz7, ((saf)rut0));
                return true;
            }
            case 17: {
                IBinder iBinder17 = parcel0.readStrongBinder();
                if(iBinder17 == null) {
                    rzz8 = null;
                }
                else {
                    IInterface iInterface17 = iBinder17.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz8 = (iInterface17 instanceof rzz) ? ((rzz)iInterface17) : new rzx(iBinder17);
                }
                IBinder iBinder18 = parcel0.readStrongBinder();
                if(iBinder18 != null) {
                    IInterface iInterface18 = iBinder18.queryLocalInterface("com.android.onboarding.tasks.service.IResultCallback");
                    rut0 = (iInterface18 instanceof sac) ? ((sac)iInterface18) : new saa(iBinder18);
                }
                rup.gr(parcel0);
                this.f(rzz8, ((sac)rut0));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

