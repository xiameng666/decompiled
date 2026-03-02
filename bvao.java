import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BoundService;

public final class bvao implements jqv {
    public final Context a;

    public bvao(Context context0) {
        this.a = context0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        Intent intent0 = BoundService.getStartIntent(this.a, "com.google.android.gms.googlesettings.session.lifecycle.service.START");
        bvap bvap0 = new bvap(jqt0, this.a);
        if(intent0 == null || !bbic.a().d(this.a, intent0, bvap0, 1)) {
            jqt0.c(new RuntimeException("Unable to bind to service"));
        }
        return ibom.a;
    }
}

