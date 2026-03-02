import android.content.Context;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;

public final class cqim {
    public final Context a;

    public cqim() {
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        this.a = context0;
    }

    public final void a() {
        hgzq hgzq0 = cqil.a(hgzp.ag, this.a);
        cewq.v().j(((ProtoLiteMessage)hgzq0));
    }

    public final void b() {
        hgzq hgzq0 = cqil.a(hgzp.T, this.a);
        cexv.v().j(((ProtoLiteMessage)hgzq0));
    }
}

