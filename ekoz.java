import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.safetynet.RecaptchaResultData;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public class ekoz extends wby implements ekpa {
    public ekoz() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override  // ekpa
    public void a(Status status0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public void b(Status status0, AttestationData attestationData0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public void c(Status status0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public final void d(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public final void e(Status status0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public void f(Status status0, HarmfulAppsInfo harmfulAppsInfo0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                AttestationData attestationData0 = (AttestationData)wbz.a(parcel0, AttestationData.CREATOR);
                ekoz.gr(parcel0);
                this.b(status0, attestationData0);
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                ekoz.gr(parcel0);
                this.d(s);
                return true;
            }
            case 3: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                SafeBrowsingData safeBrowsingData0 = (SafeBrowsingData)wbz.a(parcel0, SafeBrowsingData.CREATOR);
                ekoz.gr(parcel0);
                this.i(status1, safeBrowsingData0);
                return true;
            }
            case 4: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                boolean z = wbz.i(parcel0);
                ekoz.gr(parcel0);
                this.a(status2, z);
                return true;
            }
            case 6: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                RecaptchaResultData recaptchaResultData0 = (RecaptchaResultData)wbz.a(parcel0, RecaptchaResultData.CREATOR);
                ekoz.gr(parcel0);
                this.g(status3, recaptchaResultData0);
                return true;
            }
            case 8: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                HarmfulAppsInfo harmfulAppsInfo0 = (HarmfulAppsInfo)wbz.a(parcel0, HarmfulAppsInfo.CREATOR);
                ekoz.gr(parcel0);
                this.f(status4, harmfulAppsInfo0);
                return true;
            }
            case 10: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                boolean z1 = wbz.i(parcel0);
                ekoz.gr(parcel0);
                this.e(status5, z1);
                return true;
            }
            case 11: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                ekoz.gr(parcel0);
                this.c(status6);
                return true;
            }
            case 15: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                RemoveHarmfulAppData removeHarmfulAppData0 = (RemoveHarmfulAppData)wbz.a(parcel0, RemoveHarmfulAppData.CREATOR);
                ekoz.gr(parcel0);
                this.h(status7, removeHarmfulAppData0);
                return true;
            }
            case 16: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                String s1 = parcel0.readString();
                int v1 = parcel0.readInt();
                ekoz.gr(parcel0);
                this.j(status8, s1, v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // ekpa
    public final void g(Status status0, RecaptchaResultData recaptchaResultData0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public final void h(Status status0, RemoveHarmfulAppData removeHarmfulAppData0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public final void i(Status status0, SafeBrowsingData safeBrowsingData0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ekpa
    public final void j(Status status0, String s, int v) {
        throw new UnsupportedOperationException();
    }
}

