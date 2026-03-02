import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.credential.manager.PasswordManagerChimeraActivity;
import java.io.Serializable;

public final class bcyl implements acn {
    public final PasswordManagerChimeraActivity a;

    public bcyl(PasswordManagerChimeraActivity passwordManagerChimeraActivity0) {
        this.a = passwordManagerChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        gfsx gfsx0;
        int v = ((ActivityResult)object0).a;
        beso beso0 = this.a.l;
        if(v == 0) {
            Intent intent0 = ((ActivityResult)object0).b;
            if(intent0 != null && "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent0.getAction())) {
                Serializable serializable0 = intent0.getSerializableExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION");
                gfsx0 = (serializable0 instanceof IntentSender.SendIntentException) ? gfsx.m(((IntentSender.SendIntentException)serializable0)) : gfqx.a;
            }
            else {
                gfsx0 = gfqx.a;
            }
        }
        else {
            gfsx0 = gfqx.a;
        }
        beik beik0 = beso0.a;
        evqp evqp0 = beik0.b;
        if(evqp0 == null) {
            ((ggtj)beik.a.j()).x("Could not report back result of successful resolution.");
            return;
        }
        if(v == -1) {
            evqp0.b(null);
        }
        else if(gfsx0.i()) {
            evqp0.a(new beij(((Throwable)gfsx0.d())));
        }
        else {
            evqp0.a(new beij());
        }
        beik0.b = null;
    }
}

