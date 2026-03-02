import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;

public final class blup implements kba {
    public final bluv a;

    public blup(bluv bluv0) {
        this.a = bluv0;
    }

    @Override  // kba
    public final Object a() {
        gfsx gfsx0;
        bluv bluv0 = this.a;
        blwa blwa0 = bluv0.ai.a;
        bmae bmae0 = bluv0.ai.b;
        bluv bluv1 = bluv0.ai.c;
        if(blwa0.k != 1 || !bmae0.p) {
            gfsx0 = gfqx.a;
        }
        else if(blwa0.f.d) {
            gfsx0 = gfqx.a;
        }
        else {
            Context context0 = blwa0.g.getContext();
            if(context0 == null) {
            label_23:
                String s2 = bluv1.getString(0x7F1511E1);  // string:fido_verify_your_unlock_identity_title "Use your screen lock"
                String s3 = bluv1.getString(0x7F1511DF, new Object[]{bmae0.k});  // string:fido_verify_your_identity_description "%s needs to verify it\'s you."
                batl.r(s2, "title cannot be empty");
                batl.r(s3, "description cannot be empty");
                blvd blvd0 = new blvd();
                Bundle bundle1 = new Bundle();
                bundle1.putString("title", s2);
                bundle1.putString("description", s3);
                blvd0.setArguments(bundle1);
                gfsx0 = gfsx.m(blvd0);
            }
            else {
                BiometricManager biometricManager0 = (BiometricManager)context0.getSystemService(BiometricManager.class);
                if(biometricManager0 != null && biometricManager0.canAuthenticate() == 0) {
                    String s = bluv1.getString(0x7F1511E1);  // string:fido_verify_your_unlock_identity_title "Use your screen lock"
                    String s1 = bluv1.getString(0x7F1511DF, new Object[]{bmae0.k});  // string:fido_verify_your_identity_description "%s needs to verify it\'s you."
                    batl.r(s, "title cannot be empty");
                    batl.r(s1, "description cannot be empty");
                    blui blui0 = new blui();
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("title", s);
                    bundle0.putString("description", s1);
                    blui0.setArguments(bundle0);
                    gfsx0 = gfsx.m(blui0);
                    goto label_35;
                }
                goto label_23;
            }
        }
    label_35:
        if(!gfsx0.i()) {
            return blul.c(bluu.e);
        }
        bluv0.b.c.g(bluv0, new blut(bluv0));
        bluy bluy0 = bluv0.b;
        gfsx gfsx1 = bluv0.d.i() ? ((blpi)bluv0.d.d()).d() : gfqx.a;
        bluy0.a = gfsx1;
        bluv0.b.d.ii(gfsx0.d());
        blul blul0 = bluv0.a;
        synchronized(blul0.g) {
            blul0.f = new gmcu();
        }
        return blul0.f;
    }
}

