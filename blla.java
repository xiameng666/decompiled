import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.HybridRequestData;

public final class blla extends cjtm {
    private final bmnx a;
    private final HybridRequestData b;
    private final bnaf c;

    public blla(bmnx bmnx0, HybridRequestData hybridRequestData0, bnaf bnaf0, azug azug0) {
        super(0x94, "InitiateHybridDataTransferFlow", azug0);
        this.a = bmnx0;
        this.b = hybridRequestData0;
        this.c = bnaf0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        batl.s(context0);
        batl.s(this.b);
        batl.s(this.c);
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.fido.fido2.ui.hybrid.HybridAuthenticateActivity");
        intent0.putExtra("ClientFlowExtra", true);
        intent0.putExtra("SessionContextSourceExtra", this.c);
        intent0.putExtra("HybridRequestDataExtra", bauc.n(this.b));
        PendingIntent pendingIntent0 = bbmq.g(context0, intent0, 0xC000000);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
        this.a.c(Status.b, pendingIntent0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

