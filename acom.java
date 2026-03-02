import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public final class acom extends cjtm {
    private static final baun a;
    private final acoy b;
    private final bccd c;
    private final bcqx d;
    private final UUID e;

    static {
        acom.a = bcrh.a("api_is_pnvr_constellation_device");
    }

    public acom(Context context0, acoy acoy0, azug azug0) {
        super(0xC7, "IsPnvrConstellationDevice", azug0);
        this.b = acoy0;
        this.c = new bccd(context0);
        this.d = bcqx.a(context0);
        this.e = UUID.randomUUID();
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        boolean z;
        if(!hrcv.a.b().h()) {
            acom.a.h("isPnvrConstellationDevice API is not enabled", new Object[0]);
            this.d.f(this.e, gmfz.ca, gmfx.aN);
            this.j(new Status(34500));
            return;
        }
        try {
            bcbz bcbz0 = new bcbz(this.c);
            hodo hodo0 = (hodo)icpu.b(this.c.b, this.c.a, iccm.a, bcbz0).get();
            z = hodo0 == hodo.b || hodo0 == hodo.c;
            acom.a.d("IsPnvrConstellationDevice result = %s", new Object[]{Boolean.valueOf(z)});
        }
        catch(InterruptedException | ExecutionException exception0) {
            acom.a.g("Failed to get permission state: ", exception0, new Object[0]);
            this.d.f(this.e, gmfz.ca, gmfx.cX);
            this.j(new Status(34507));
            return;
        }
        this.d.o(this.e, gmfz.ca, gmgd.z);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
        this.b.d(Status.b, z, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
        this.b.d(status0, false, apiMetadata0);
    }
}

