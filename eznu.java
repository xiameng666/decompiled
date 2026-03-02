import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;

public final class eznu extends ezmz {
    private static final ggtl c;

    static {
        eznu.c = ezqu.c();
    }

    public eznu(bkcm bkcm0, ezrk ezrk0) {
        super("ReadDeviceLevelSettingsOperation", bkcm0, ezrk0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eznu.c.h().ar(0x443C).B("Executing operation \'%s\'...", this.q());
        ezrk ezrk0 = this.b;
        hfem hfem0 = ezrk0.b() ? ezrk0.a() : hfem.a;
        bkcm bkcm0 = this.a;
        ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult0 = new ReadDeviceLevelSettingsResult(hfem0.toBytesArray());
        bkcm0.d(Status.b, readDeviceLevelSettingsResult0);
        eznu.c.h().ar(0x443D).B("Operation \'%s\' successful!", this.q());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.d(status0, null);
        eznu.c.j().ar(17470).P("Operation \'%s\' failed with status \'%d\'!", this.q(), status0.i);
    }
}

