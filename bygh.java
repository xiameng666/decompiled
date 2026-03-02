import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.identitycredentials.ui.CredentialChooserChimeraActivity;
import java.util.Objects;

public final class bygh extends ibsl implements ibtw {
    final byom a;
    final CredentialChooserChimeraActivity b;

    public bygh(byom byom0, CredentialChooserChimeraActivity credentialChooserChimeraActivity0, ibrl ibrl0) {
        this.a = byom0;
        this.b = credentialChooserChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bygh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bygh(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        byom byom0 = this.a;
        if(byom0 != null) {
            bxzt bxzt0 = byom0.e;
            if(bxzt0 != null) {
                CredentialChooserChimeraActivity credentialChooserChimeraActivity0 = this.b;
                Intent intent0 = bxzt0.b;
                if(intent0 != null) {
                    credentialChooserChimeraActivity0.setResult(-1, intent0);
                }
                switch(bxzt0.a.ordinal()) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        Objects.toString(bxzt0);
                        bxzl.i(credentialChooserChimeraActivity0.a().a(), byah.b);
                        credentialChooserChimeraActivity0.b();
                        return ibom.a;
                    }
                    case 3: {
                        bxzl.i(credentialChooserChimeraActivity0.a().a(), byah.h);
                        Intent intent1 = new Intent("android.settings.CREDENTIAL_PROVIDER");
                        intent1.setData(Uri.parse("package: com.google.android.gms"));
                        credentialChooserChimeraActivity0.startActivity(intent1);
                        credentialChooserChimeraActivity0.b();
                        return ibom.a;
                    }
                    case 4: {
                        bxzl.i(credentialChooserChimeraActivity0.a().a(), byah.d);
                        credentialChooserChimeraActivity0.b();
                        return ibom.a;
                    }
                    case 5: {
                        bxzl.i(credentialChooserChimeraActivity0.a().a(), byah.c);
                        credentialChooserChimeraActivity0.b();
                        return ibom.a;
                    }
                    case 6: {
                        Log.w("CredentialSelector", "Request cancelled for internal error");
                        bxzl.i(credentialChooserChimeraActivity0.a().a(), byah.e);
                        credentialChooserChimeraActivity0.b();
                        return ibom.a;
                    }
                    default: {
                        Objects.toString(bxzt0);
                        Log.w("CredentialSelector", "Unexpected state; finishing the activity: " + bxzt0.toString());
                        bxzl.i(credentialChooserChimeraActivity0.a().a(), byah.a);
                        credentialChooserChimeraActivity0.b();
                        return ibom.a;
                    }
                }
            }
        }
        return ibom.a;
    }
}

