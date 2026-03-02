import android.app.PendingIntent;
import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.location.settings.DrivingConditionChimeraProvider;
import java.util.ArrayList;

public final class fuxr {
    public final Context a;
    public final fuxv b;
    public final fuxq c;
    public final DrivingConditionChimeraProvider d;

    public fuxr(Context context0, DrivingConditionChimeraProvider drivingConditionChimeraProvider0) {
        this.a = context0;
        this.d = drivingConditionChimeraProvider0;
        this.b = new fuxv();
        fuxq fuxq0 = new fuxq();
        this.c = fuxq0;
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, 0, fuxq.a(context0), 0x2000000);
        if(humo.e()) {
            context0 = ModuleManager.requireSubmoduleContext(context0, "driving_mode");
        }
        cniy cniy0 = new cniy(context0);
        ArrayList arrayList0 = new ArrayList();
        if(humy.a.b().K() && huml.c()) {
            cmms cmms0 = new cmms();
            cmms0.a = 16;
            cmms0.b(0);
            arrayList0.add(cmms0.a());
            cmms cmms1 = new cmms();
            cmms1.a = 16;
            cmms1.b(1);
            arrayList0.add(cmms1.a());
        }
        else {
            cmms cmms2 = new cmms();
            cmms2.a = 0;
            cmms2.b(0);
            arrayList0.add(cmms2.a());
            cmms cmms3 = new cmms();
            cmms3.a = 0;
            cmms3.b(1);
            arrayList0.add(cmms3.a());
        }
        cmms cmms4 = new cmms();
        cmms4.a = 8;
        cmms4.b(0);
        arrayList0.add(cmms4.a());
        cmms cmms5 = new cmms();
        cmms5.a = 7;
        cmms5.b(0);
        arrayList0.add(cmms5.a());
        evql evql0 = cniy0.e(new ActivityTransitionRequest(arrayList0, "ardnd", null), pendingIntent0);
        evql0.b(new fuxm(fuxq0));
        evql0.A(new fuxn(fuxq0));
    }
}

