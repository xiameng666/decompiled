import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class eqvp extends cjtm {
    private final equm a;
    private final eqvw b;

    public eqvp(eqvw eqvw0, equm equm0, azug azug0) {
        super(76, "GetRestoreInformationOperation", azug0);
        this.b = eqvw0;
        this.a = equm0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqoj eqoj0;
        int v1;
        equm.a.d("getRestoreInformation called", new Object[0]);
        Bundle bundle0 = new Bundle();
        equm equm0 = this.a;
        gmcd gmcd0 = glzd.f(equm0.c.b.a.a(), new eron(), gmap.a);
        int v = 2;
        try {
            ereg.a.d("Read FlowType", new Object[0]);
            eqoh eqoh0 = (eqoh)((glyq)gmcd0).u();
            if(eqoh0 == eqoh.b) {
                v1 = 1;
            }
            else if(eqoh0 == eqoh.c) {
                v1 = 2;
            }
            else if(eqoh0 == eqoh.d) {
                v1 = 3;
            }
            else if(eqoh0 == eqoh.e) {
                v1 = 4;
            }
            else if(eqoh0 == eqoh.f) {
                v1 = 5;
            }
            else {
                v1 = 0;
            }
        }
        catch(InterruptedException | ExecutionException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            ereg.a.d("Restore flow type read error.", new Object[0]);
            v1 = 0;
        }
        eqvw eqvw0 = this.b;
        if(v1 != 0) {
            bundle0.putByte("SETUP_FLOW", ((byte)v1));
            gmcd gmcd1 = glzd.f(equm0.c.b.a.a(), new erok(), gmap.a);
            try {
                ereg.a.d("Read Restore App", new Object[0]);
                eqoi eqoi0 = (eqoi)((glyq)gmcd1).u();
                if(eqoi0 == eqoi.b) {
                    v = 1;
                }
                else {
                    goto label_44;
                }
            }
            catch(InterruptedException | ExecutionException exception1) {
                if((exception1 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                }
                ereg.a.m("Restore App read error.", new Object[0]);
                v = 0;
            }
            goto label_46;
        label_44:
            if(eqoi0 != eqoi.c) {
                v = 0;
            }
        label_46:
            bundle0.putByte("RESTORE_APP", ((byte)v));
            gmcd gmcd2 = glzd.f(equm0.c.b.a.a(), new eroj(), gmap.a);
            try {
                ereg.a.d("Read Source device infos", new Object[0]);
                eqoj0 = (eqoj)((glyq)gmcd2).u();
            }
            catch(InterruptedException | ExecutionException exception2) {
                if((exception2 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                }
                ereg.a.m("Read Source device infos error", new Object[0]);
                eqoj0 = eqoj.a;
            }
            if(!gfqz.e(Build.MANUFACTURER, "samsung")) {
                bundle0.putString("SOURCE_ANDROID_ID", eqoj0.c);
            }
            bundle0.putString("SOURCE_MANUFACTURER", eqoj0.d);
            bundle0.putString("SOURCE_MODEL", eqoj0.e);
            equm0.c(eqvw0, Status.b, bundle0);
            return;
        }
        equm0.c(eqvw0, new Status(13), bundle0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Bundle bundle0 = new Bundle();
        this.b.f(status0, bundle0);
    }
}

