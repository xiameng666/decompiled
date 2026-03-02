import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import java.nio.charset.StandardCharsets;

public final class bdie extends wby implements bdif {
    private final evqp a;

    public bdie() {
        super("com.google.android.gms.credential.manager.common.ISettingsCallback");
    }

    public bdie(evqp evqp0) {
        super("com.google.android.gms.credential.manager.common.ISettingsCallback");
        this.a = evqp0;
    }

    @Override  // bdif
    public final void a(Status status0, byte[] arr_b, ApiMetadata apiMetadata0) {
        CredentialManagerAccount credentialManagerAccount0 = null;
        if(!status0.e()) {
            azzf.b(status0, null, this.a);
            return;
        }
        if(arr_b == null) {
            azzf.b(status0, gfqx.a, this.a);
            return;
        }
        String s = new String(arr_b, StandardCharsets.UTF_8);
        if(!TextUtils.isEmpty(s)) {
            credentialManagerAccount0 = bdim.a(s) ? new CredentialManagerAccount("pwm.constant.LocalAccount") : CredentialManagerAccount.a(s);
        }
        if(credentialManagerAccount0 == null) {
            status0 = new Status(43501, "SETTING_DESERIALIZATION_FAILED");
        }
        azzf.b(status0, gfsx.l(credentialManagerAccount0), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            byte[] arr_b = parcel0.createByteArray();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bdie.gr(parcel0);
            this.a(status0, arr_b, apiMetadata0);
            return true;
        }
        return false;
    }
}

