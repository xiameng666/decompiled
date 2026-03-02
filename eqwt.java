import android.app.RemoteLockscreenValidationSession;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;

public abstract class eqwt extends wby implements eqwu {
    public eqwt() {
        super("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                this.c();
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.d();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                VerificationInfo verificationInfo0 = (VerificationInfo)wbz.a(parcel0, VerificationInfo.CREATOR);
                eqwt.gr(parcel0);
                this.g(verificationInfo0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.a();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                int v1 = parcel0.readInt();
                eqwt.gr(parcel0);
                this.i(v1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                eqwt.gr(parcel0);
                this.j(bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                BootstrapProgressResult bootstrapProgressResult0 = (BootstrapProgressResult)wbz.a(parcel0, BootstrapProgressResult.CREATOR);
                eqwt.gr(parcel0);
                this.k(bootstrapProgressResult0);
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 8: {
                RemoteLockscreenValidationSession remoteLockscreenValidationSession0 = (RemoteLockscreenValidationSession)wbz.a(parcel0, RemoteLockscreenValidationSession.CREATOR);
                eqwt.gr(parcel0);
                this.h(remoteLockscreenValidationSession0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                int v2 = parcel0.readInt();
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                eqwt.gr(parcel0);
                this.e(v2, bundle1);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                BootstrapCompletionResult bootstrapCompletionResult0 = (BootstrapCompletionResult)wbz.a(parcel0, BootstrapCompletionResult.CREATOR);
                eqwt.gr(parcel0);
                this.b(bootstrapCompletionResult0);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                QuickStartTargetEventData quickStartTargetEventData0 = (QuickStartTargetEventData)wbz.a(parcel0, QuickStartTargetEventData.CREATOR);
                eqwt.gr(parcel0);
                this.f(quickStartTargetEventData0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

