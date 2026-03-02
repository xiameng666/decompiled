import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.setup.auth.ContinueSessionRequest;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeRequest;
import com.google.android.gms.smartdevice.setup.auth.SecondDeviceAuthChimeraService;
import com.google.android.gms.smartdevice.setup.auth.StartSessionRequest;
import java.util.ArrayList;
import java.util.List;

public final class erhy extends wby implements cjug, erhz {
    public erhr a;
    private final cjts b;
    private final String c;
    private final String d;

    public erhy() {
        super("com.google.android.gms.smartdevice.setup.auth.internal.ISecondDeviceAuthService");
    }

    public erhy(Context context0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.smartdevice.setup.auth.internal.ISecondDeviceAuthService");
        this.c = s;
        this.d = s1;
        this.b = cjts0;
        this.a = new erhr(context0, null);
    }

    @Override  // erhz
    public final void a(erhw erhw0, List list0, ApiMetadata apiMetadata0) {
        SecondDeviceAuthChimeraService.a.d("Dispatch continueSessionOperation.", new Object[0]);
        azug azug0 = this.d(apiMetadata0);
        erij erij0 = new erij(erhw0, list0, this.a, azug0);
        this.b.b(erij0);
    }

    @Override  // erhz
    public final void b(erhw erhw0, GetChallengeRequest getChallengeRequest0, ApiMetadata apiMetadata0) {
        SecondDeviceAuthChimeraService.a.d("Dispatch GetChallengeOperation.", new Object[0]);
        azug azug0 = this.d(apiMetadata0);
        erik erik0 = new erik(erhw0, getChallengeRequest0, this.a, azug0);
        this.b.b(erik0);
    }

    @Override  // erhz
    public final void c(erhw erhw0, List list0, ApiMetadata apiMetadata0) {
        SecondDeviceAuthChimeraService.a.d("Dispatch StartSessionOperation.", new Object[0]);
        azug azug0 = this.d(apiMetadata0);
        eril eril0 = new eril(erhw0, list0, this.a, azug0);
        this.b.b(eril0);
    }

    private final azug d(ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.eP);
        azuf0.g(bbdq.aT);
        azuf0.d(this.c);
        azuf0.c(this.d);
        return azuf0.a();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        erhw erhw0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.setup.auth.internal.ISecondDeviceAuthCallbacks");
                    erhw0 = (iInterface0 instanceof erhw) ? ((erhw)iInterface0) : new erhu(iBinder0);
                }
                GetChallengeRequest getChallengeRequest0 = (GetChallengeRequest)wbz.a(parcel0, GetChallengeRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                erhy.gr(parcel0);
                this.b(erhw0, getChallengeRequest0, apiMetadata0);
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.setup.auth.internal.ISecondDeviceAuthCallbacks");
                    erhw0 = (iInterface1 instanceof erhw) ? ((erhw)iInterface1) : new erhu(iBinder1);
                }
                ArrayList arrayList0 = parcel0.createTypedArrayList(StartSessionRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                erhy.gr(parcel0);
                this.c(erhw0, arrayList0, apiMetadata1);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.setup.auth.internal.ISecondDeviceAuthCallbacks");
                    erhw0 = (iInterface2 instanceof erhw) ? ((erhw)iInterface2) : new erhu(iBinder2);
                }
                ArrayList arrayList1 = parcel0.createTypedArrayList(ContinueSessionRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                erhy.gr(parcel0);
                this.a(erhw0, arrayList1, apiMetadata2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

