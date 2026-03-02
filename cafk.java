import android.content.Context;
import com.google.android.gms.intrusiondetection.ui.IntrusionDetectionSettingsChimeraActivity;
import j..util.Objects;

final class cafk implements acl {
    final cafl a;

    public cafk(cafl cafl0) {
        Objects.requireNonNull(cafl0);
        this.a = cafl0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        cafl cafl0 = this.a;
        if(!cafl0.k) {
            cafl0.k = true;
            ((caev)cafl0.h()).e(((IntrusionDetectionSettingsChimeraActivity)cafl0));
        }
    }
}

