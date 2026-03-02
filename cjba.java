import android.content.Context;
import android.os.UserHandle;
import com.google.android.gms.libs.identity.ClientIdentity;

public final class cjba {
    private final ClientIdentity a;
    private final Context b;
    private boolean c;
    private UserHandle d;

    public cjba(ClientIdentity clientIdentity0, Context context0, boolean z, UserHandle userHandle0) {
        this.a = clientIdentity0;
        this.b = context0;
        this.c = z;
        this.d = userHandle0;
        if(!z && context0 == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(userHandle0 == null && context0 == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final ClientIdentity a(UserHandle userHandle0) {
        ibuq.f(userHandle0, "userHandle");
        if(!this.c) {
            ibuq.c(this.b);
            this.a.k(this.b, new String[]{"android.permission.UPDATE_DEVICE_STATS"});
            this.c = true;
        }
        ClientIdentity clientIdentity0 = this.a;
        if(!ibuq.m(userHandle0, clientIdentity0.getUserHandleForUid()) && !ibuq.m(userHandle0, this.d)) {
            ibuq.c(this.b);
            clientIdentity0.k(this.b, new String[]{"android.permission.INTERACT_ACROSS_USERS"});
            this.d = userHandle0;
        }
        return clientIdentity0;
    }
}

