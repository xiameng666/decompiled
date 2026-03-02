import com.google.android.gms.pay.pass.common.template.api.LinkedPassFromServerResponse;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Offer;

public final class dvhh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((guzp)object0).b) {
            ggdy0.i(new Offer(((guzn)object1), gfqx.a, 0L, 0L, false, false, false, 0, gfqx.a, ggna.a, true, guwd.a));
        }
        gged_interceptors gged0 = ggdy0.h();
        gtlv gtlv0 = ((guzp)object0).c;
        if(gtlv0 == null) {
            gtlv0 = gtlv.a;
        }
        return new LinkedPassFromServerResponse(gged0, gfta.a(gtlv0.b));
    }
}

