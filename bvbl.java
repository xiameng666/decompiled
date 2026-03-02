import android.content.Intent;
import com.google.android.gms.googlesettings.ui.GoogleSettingsLauncherChimeraActivity;

public final class bvbl implements ibts {
    public final ibvd a;

    public bvbl(ibvd ibvd0) {
        this.a = ibvd0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((cmgf)object0), "$this$maybeLogSemanticEvent");
        ibvd ibvd0 = this.a;
        cmfb cmfb0 = cjan.d(((Intent)ibvd0.a));
        if(cmfb0 != null) {
            ((cmgf)object0).f(cmfb0);
        }
        awkv awkv0 = awkv.b(GoogleSettingsLauncherChimeraActivity.m(((Intent)ibvd0.a)));
        if(awkv0 == null) {
            awkv0 = awkv.a;
        }
        ((cmgf)object0).c(awkv0);
        bbdi bbdi0 = bbdi.b(GoogleSettingsLauncherChimeraActivity.l(((Intent)ibvd0.a)));
        if(bbdi0 == null) {
            bbdi0 = bbdi.a;
        }
        ibuq.f(bbdi0, "value");
        ProtoLiteBuilder hftp0 = ((cmgf)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cmfe cmfe0 = (cmfe)hftp0.b_message;
        cmfe0.f = bbdi0.a();
        cmfe0.b |= 8;
        return ibom.a;
    }
}

