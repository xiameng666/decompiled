import androidx.activity.result.ActivityResult;

public final class duwe implements acn {
    public final duwt a;

    public duwe(duwt duwt0) {
        this.a = duwt0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        int v = ((ActivityResult)object0).a;
        duwt duwt0 = this.a;
        if(v == -1) {
            duyb duyb0 = duwt0.z();
            icnl icnl0 = duyb0.h;
            hkas hkas0 = ((duxk)icnl0.b()).a;
            if(hkas0 == null) {
                ((ggtj)duyb.a.j()).x("Issuer is null. Checking initPushProvisioning is already triggered");
                icnl0.g(duxk.a(((duxk)icnl0.b()), null, null, false, new IllegalStateException("No supported issuers found."), null, false, 51));
                return;
            }
            duyb0.j(hkas0);
            return;
        }
        if(v == 0) {
            ((ggtj)duwt.a.h()).x("Biometric setup cancelled");
            duwt0.ar();
        }
    }
}

