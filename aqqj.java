import android.content.Context;
import j..time.Duration;
import j..time.Instant;

final class aqqj extends ibsl implements ibtw {
    int a;
    final aqqk b;
    final ghys c;
    final ghyr d;
    final Long e;
    final Context f;

    public aqqj(aqqk aqqk0, ghys ghys0, ghyr ghyr0, Long long0, Context context0, ibrl ibrl0) {
        this.b = aqqk0;
        this.c = ghys0;
        this.d = ghyr0;
        this.e = long0;
        this.f = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aqqj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aqqj(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        Boolean boolean0 = Boolean.valueOf(true);
        Boolean boolean1 = Boolean.valueOf(false);
        if(this.a == 0) {
            ibnx.b(object0);
            Boolean boolean2 = (Boolean)aqqk.b.get();
            if(ibuq.m(boolean2, boolean0)) {
                aqqk.c(this.c, this.d, this.e);
                return ibom.a;
            }
            if(ibuq.m(boolean2, boolean1)) {
                aqqk.d(this.c, this.d, this.e);
                return ibom.a;
            }
            ((ggtj)aqqk.a.h()).B("null shouldSample, evaluating sampling value. Event %s", this.d.name());
            try {
                aqqz aqqz0 = new aqqz(this.f);
                long v = hqjs.a.e().b();
                aqqi aqqi0 = new aqqi(aqqz0, null);
                this.a = 1;
                object0 = icfo.c(v, aqqi0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_22:
                if(((aqqq)object0) == null) {
                    ((ggtj)aqqk.a.i()).x("Timeout reading from LogSamplingProtoDataStore. Defaulting to no sampling.");
                    aqqk.d(aqqk.e(this.c, false, true, false, 5), this.d, this.e);
                    return ibom.a;
                }
                bboh bboh0 = aqqk.a;
                ((ggtj)bboh0.h()).x("Evaluating whether required time has passed for sampling");
                hfwn hfwn0 = ((aqqq)object0).c;
                if(hfwn0 == null) {
                    hfwn0 = hfwn.a;
                }
                ibuq.e(hfwn0, "getFirstLogUploadMillis(...)");
                Instant instant0 = hfyo.d(hfwn0).plus(Duration.ofDays(hqjs.a.e().a()));
                ibuq.e(instant0, "plus(...)");
                Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
                ibuq.e(instant1, "ofEpochMilli(...)");
                if(instant1.isAfter(instant0)) {
                    ((ggtj)bboh0.h()).B("Setting shouldSample to true. Event %s", this.d.name());
                    aqqk.b.set(boolean0);
                    aqqk.c(this.c, this.d, this.e);
                    return ibom.a;
                }
                ((ggtj)bboh0.h()).B("Setting shouldSample to false. Event %s", this.d.name());
                aqqk.b.set(boolean1);
                aqqk.d(this.c, this.d, this.e);
            }
            catch(Exception exception0) {
                a.ae(aqqk.a.i(), "Failed to evaluate sampling, logging without sampling. Sampling state remains undetermined.", exception0);
                aqqk.d(aqqk.e(this.c, false, false, true, 3), this.d, this.e);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Exception exception0) {
                a.ae(aqqk.a.i(), "Failed to evaluate sampling, logging without sampling. Sampling state remains undetermined.", exception0);
                aqqk.d(aqqk.e(this.c, false, false, true, 3), this.d, this.e);
                return ibom.a;
            }
        }
        goto label_22;
    }
}

