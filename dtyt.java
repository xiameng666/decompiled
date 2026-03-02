import com.google.android.gms.mdocstore.types.ProvisioningId;
import java.util.List;

public final class dtyt implements evpo {
    public final dtyw a;
    public final String b;

    public dtyt(dtyw dtyw0, String s) {
        this.a = dtyw0;
        this.b = s;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Object object0 = ((List)evql0.j()).get(0);
        ibuq.d(object0, "null cannot be cast to non-null type com.google.internal.tapandpay.v1.mdocs.local.MdocProto.MdocInfo");
        Object object1 = ((List)evql0.j()).get(1);
        ibuq.d(object1, "null cannot be cast to non-null type com.google.wallet.googlepay.frontend.api.mobiledocument.DisplayConfig");
        gtxf gtxf0 = gtxf.b(((gtxg)object0).h);
        if(gtxf0 == null) {
            gtxf0 = gtxf.f;
        }
        ggeo ggeo0 = dtsw.a(gtxf0);
        ProvisioningId provisioningId0 = new ProvisioningId(this.b);
        return this.a.a.j(provisioningId0, ggeo0).c(new dtyv(((gtxg)object0), ((hjzq)object1)));
    }
}

