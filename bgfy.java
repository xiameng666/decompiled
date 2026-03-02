import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class bgfy {
    public static PendingIntent a(Context context0, CredentialManagerInvocationParams credentialManagerInvocationParams0, Intent intent0, int v, boolean z) {
        bdin.b(intent0);
        beco.a(intent0, credentialManagerInvocationParams0.b);
        Bundle bundle0 = Bundle.EMPTY;
        if(hsas.e()) {
            if(bbqa.d()) {
                bundle0 = ActivityOptions.makeBasic().setPendingIntentCreatorBackgroundActivityStartMode(1).toBundle();
                return z ? cjok.b(context0, v, intent0, 0x44000000, bundle0) : cjok.b(context0, v, intent0, 0x4000000, bundle0);
            }
        }
        else if(Build.VERSION.SDK_INT >= 34) {
            bundle0 = ActivityOptions.makeBasic().setPendingIntentCreatorBackgroundActivityStartMode(1).toBundle();
        }
        return z ? cjok.b(context0, v, intent0, 0x44000000, bundle0) : cjok.b(context0, v, intent0, 0x4000000, bundle0);
    }
}

