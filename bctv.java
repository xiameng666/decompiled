import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import j..util.Objects;
import java.util.ArrayList;

public final class bctv extends bcvr {
    final FenceUpdateRequestImpl a;

    public bctv(bctw bctw0, aztw aztw0, FenceUpdateRequestImpl fenceUpdateRequestImpl0) {
        this.a = fenceUpdateRequestImpl0;
        Objects.requireNonNull(bctw0);
        super(aztw0);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        ((bcvt)azsr0).N();
        if(((bcvt)azsr0).d == null) {
            ((bcvt)azsr0).d = new yfn(((bcvt)azsr0).b, bcua.a);
        }
        FenceUpdateRequestImpl fenceUpdateRequestImpl0 = this.a;
        yfn yfn0 = ((bcvt)azsr0).d;
        ArrayList arrayList0 = fenceUpdateRequestImpl0.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            UpdateFenceOperation updateFenceOperation0 = (UpdateFenceOperation)arrayList0.get(v1);
            if(updateFenceOperation0.c == null) {
                aqcs aqcs0 = updateFenceOperation0.d;
                if(aqcs0 != null) {
                    updateFenceOperation0.c = (bcul)yfn0.a(aqcs0);
                }
            }
        }
        bcwg bcwg0 = (bcwg)((bcvt)azsr0).H();
        bcwc bcwc0 = new bcwc(this, null, null, null, null);
        ApiMetadata apiMetadata0 = cclr.a(((bcvt)azsr0).r);
        bcwg0.d(bcwc0, ((bcvt)azsr0).c.b, ((bcvt)azsr0).c.a, ((bcvt)azsr0).c.d, fenceUpdateRequestImpl0, apiMetadata0);
    }
}

