import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.auth.ContinueSessionResponse;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeResponse;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import java.util.ArrayList;
import java.util.List;

public class erhv extends wby implements erhw {
    public erhv() {
        super("com.google.android.gms.smartdevice.setup.auth.internal.ISecondDeviceAuthCallbacks");
    }

    @Override  // erhw
    public void a(Status status0, List list0) {
    }

    @Override  // erhw
    public void b(Status status0, GetChallengeResponse getChallengeResponse0) {
    }

    @Override  // erhw
    public void c(Status status0, List list0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetChallengeResponse getChallengeResponse0 = (GetChallengeResponse)wbz.a(parcel0, GetChallengeResponse.CREATOR);
                erhv.gr(parcel0);
                this.b(status0, getChallengeResponse0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(StartSessionResponse.CREATOR);
                erhv.gr(parcel0);
                this.c(status1, arrayList0);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList1 = parcel0.createTypedArrayList(ContinueSessionResponse.CREATOR);
                erhv.gr(parcel0);
                this.a(status2, arrayList1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

