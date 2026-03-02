import android.app.PendingIntent;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import java.util.concurrent.Executor;

public final class kti implements ibts {
    public final CancellationSignal a;
    public final kty b;
    public final Executor c;
    public final kjk d;

    public kti(CancellationSignal cancellationSignal0, kty kty0, Executor executor0, kjk kjk0) {
        this.a = cancellationSignal0;
        this.b = kty0;
        this.c = executor0;
        this.d = kjk0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        PendingIntent pendingIntent0 = ((CreateCredentialHandle)object0).a;
        CreateCredentialResponse createCredentialResponse0 = ((CreateCredentialHandle)object0).b;
        Executor executor0 = this.c;
        CancellationSignal cancellationSignal0 = this.a;
        kjk kjk0 = this.d;
        if(pendingIntent0 == null && createCredentialResponse0 == null) {
            knt.a(cancellationSignal0, new ktv(executor0, kjk0));
            return ibom.a;
        }
        if(pendingIntent0 != null) {
            kty kty0 = this.b;
            Intent intent0 = new Intent(kty0.e, HiddenActivity.class);
            kty.b(kty0.i, intent0, "CREATE_PUBLIC_KEY_CREDENTIAL");
            intent0.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent0);
            try {
                kty0.e.startActivity(intent0);
            }
            catch(Exception unused_ex) {
                knt.a(cancellationSignal0, new ktw(kty0));
            }
        }
        if(createCredentialResponse0 != null) {
            kiu kiu0 = kit.a(createCredentialResponse0.a, createCredentialResponse0.b);
            if((kiu0 instanceof kjb)) {
                knt.a(cancellationSignal0, new ktc(executor0, kjk0, kiu0));
                return ibom.a;
            }
        }
        if(pendingIntent0 == null) {
            knt.a(cancellationSignal0, new ktd(executor0, kjk0));
        }
        return ibom.a;
    }
}

