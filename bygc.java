import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.identitycredentials.ui.CredentialChooserChimeraActivity;

public final class bygc implements ibts {
    public final CredentialChooserChimeraActivity a;

    public bygc(CredentialChooserChimeraActivity credentialChooserChimeraActivity0) {
        this.a = credentialChooserChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ActivityResult)object0), "it");
        byof byof0 = this.a.a();
        bxzy bxzy0 = new bxzy(((ActivityResult)object0).a, ((ActivityResult)object0).b);
        icnl icnl0 = byof0.f;
        if(icnl0.b() != null) {
            Object object1 = icnl0.b();
            ibuq.c(object1);
            bxzv bxzv0 = ((byom)object1).c;
            int v = bxzy0.a;
            Intent intent0 = bxzy0.b;
            byom byom0 = null;
            if(v == 0) {
                if(((byom)object1).f) {
                    byof0.x();
                    return ibom.a;
                }
                byof0.p(byao.a);
                byom byom1 = (byom)byof0.b.b();
                if(byom1 != null) {
                    byom0 = byom.a(byom1, null, null, null, bxzz.a, null, null, 0xF3);
                }
                icnl0.g(byom0);
                return ibom.a;
            }
            if(bxzv0 == null) {
                Log.w("CredentialSelector", "Illegal state: received a provider result but found no matching entry.");
                byof0.r();
            }
            else {
                byaa byaa0 = new byaa(v, intent0);
                Intent intent1 = bxvq.b(new byal(bxzv0.a, bxzv0.b, bxzv0.c, byaa0), byof0.a);
                if(bxzv0.f) {
                    byom byom2 = (byom)icnl0.b();
                    if(byom2 != null) {
                        byom0 = byom.a(byom2, null, null, null, null, new bxzt(bxzu.b, intent1), null, 0xEF);
                    }
                    icnl0.g(byom0);
                    return ibom.a;
                }
                if(intent1 != null) {
                    byom byom3 = (byom)icnl0.b();
                    if(byom3 != null) {
                        byom0 = byom.a(byom3, null, null, null, null, new bxzt(bxzu.b, intent1), null, 0xEF);
                    }
                    icnl0.g(byom0);
                    return ibom.a;
                }
            }
        }
        return ibom.a;
    }
}

