import java.util.LinkedHashMap;
import java.util.Map;

public final class dcux implements dixg {
    private final dcpn a;
    private final Map b;
    private final dizj c;

    public dcux(dcpn dcpn0, dizj dizj0) {
        ibuq.f(dcpn0, "analyticsLogger");
        ibuq.f(dizj0, "eventMetadataDataStore");
        super();
        this.a = dcpn0;
        this.c = dizj0;
        this.b = new LinkedHashMap();
    }

    @Override  // dixg
    public final iced a(dixi dixi0, ibts ibts0, Object object0) {
        ibuq.f(ibts0, "next");
        ibuq.f(object0, "event");
        if((object0 instanceof dcwj)) {
            dcvz.a.b().h("[AnalyticsMiddleware] %s", object0);
            this.b.put(((dcwj)object0).a, new dcwq(((dcwj)object0).b, ((dcwj)object0).c, new icad(icac.a())));
            return null;
        }
        if((object0 instanceof dcwl)) {
            cunf cunf0 = dcvz.a;
            cunf0.b().h("[AnalyticsMiddleware] %s", object0);
            long v = icac.a();
            gyza gyza0 = ((dcwl)object0).a;
            dcwq dcwq0 = (dcwq)this.b.remove(gyza0);
            if(dcwq0 != null) {
                long v1 = icad.d(v, dcwq0.c);
                gyte gyte0 = gytd.a(((ProtoLiteMessage)gyqv.a).v_newBuilder());
                gzat gzat0 = dcpt.y(dcwq0.b);
                ibuq.e(gzat0, "mapToSharingUseCase(...)");
                gyte0.g(gzat0);
                gyte0.b(this.c.a().g);
                gyqv gyqv0 = gyte0.a();
                dcov dcov0 = dcpt.i(gyza0, ibzw.h(v1), dcwq0.a, gyqv0, true);
                this.a.i(dcov0);
                return null;
            }
            cunf0.e().h("[AnalyticsMiddleware] skipping log for screen %s, could not find tracking data", gyza0);
            return null;
        }
        return (iced)ibts0.a(object0);
    }
}

