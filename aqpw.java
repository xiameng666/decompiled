import android.app.Activity;
import android.content.Context;

public final class aqpw {
    private static aqqc a;

    public static aqqc a(Context context0) {
        gftb.b(((boolean)(context0 instanceof Activity ^ 1)), "The context provided should be Application context");
        if(aqpw.a == null) {
            bbfe_BaseGrpcServer bbfe0 = aqpw.b(context0, context0.getApplicationInfo().uid);
            if(hqlt.D()) {
                bbfe0.addHeader("x-backup-gmsversion", Integer.toString(0xF1B18AD));
            }
            aqpw.a = new aqqc(bbfe0);
        }
        return aqpw.a;
    }

    public static bbfe_BaseGrpcServer b(Context context0, int v) {
        return new bbfe_BaseGrpcServer(context0, hqln.a.b().d(), ((int)hqln.a.b().b()), v, 0x405);
    }
}

