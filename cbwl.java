import android.content.Context;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;

public final class cbwl implements gful_cronetEngineProvider {
    public final cbwx a;

    public cbwl(cbwx cbwx0) {
        this.a = cbwx0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Context context0 = AppContextProvider.a();
        cmcb cmcb0 = new cmcb();
        cmcb0.c(context0);
        cmcb0.f(cbwx.a());
        cmcb0.a = new cbwo(context0);
        cmcb0.b = this.a.a;
        cmcb0.e(((frii)cbwk.a.mr()));
        cmcb0.d("languageprofile");
        return cmcb0.a(cbwz.e);
    }
}

