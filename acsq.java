import android.content.Context;
import android.os.RemoteException;

@Deprecated
public final class acsq {
    public final Context a;
    public final gful_cronetEngineProvider b;

    public acsq(Context context0) {
        this.a = context0;
        this.b = gfus.a(((gful_cronetEngineProvider)new acsp(context0)));
    }

    public final evql a() {
        try {
            return evrg.d(((adgg)this.b.mr()).e(this.a));
        }
        catch(RemoteException | azqj | azqi exception0) {
            return evrg.c(exception0);
        }
    }
}

