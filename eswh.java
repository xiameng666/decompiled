import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tapandpay.hce.observemode.EnableObserveModeAlarmScheduler..ExternalSyntheticLambda0;

public final class eswh {
    public static final eswg a;
    public static final bboh b;
    public static volatile eswh c;
    public ibns d;
    private final gmcg e;

    static {
        eswh.a = new eswg();
        eswh.b = bboh.b("TapAndPay", bbcu.aM);
    }

    public eswh() {
        this.e = new bblp(0x7FFFFFFF, 10);
    }

    public static final eswh a() {
        return eswh.a.a();
    }

    public final void b() {
        ibns ibns0 = this.d;
        if(ibns0 != null) {
            cjnn cjnn0 = (cjnn)ibns0.a;
            if(cjnn0 != null) {
                cjnn0.a();
            }
        }
        this.d = null;
    }

    public final void c(Context context0, long v) {
        ibuq.f(context0, "context");
        long v1 = SystemClock.elapsedRealtime() + v;
        ibns ibns0 = this.d;
        if(ibns0 != null) {
            if(((Number)ibns0.b).longValue() >= v1) {
                ((cjnn)ibns0.a).a();
                goto label_9;
            }
            ((ggtj)eswh.b.j()).x("Another alarm already scheduled ahead of this, skipping");
            return;
        }
    label_9:
        cjnr cjnr0 = cjnm.b(context0);
        EnableObserveModeAlarmScheduler..ExternalSyntheticLambda0 enableObserveModeAlarmScheduler$$ExternalSyntheticLambda00 = new EnableObserveModeAlarmScheduler..ExternalSyntheticLambda0(this, new eswj(context0), context0);
        this.d = new ibns(cjnm.a(cjnr0, "tapandpay_enable_observe_mode", 3, v1, this.e, enableObserveModeAlarmScheduler$$ExternalSyntheticLambda00), v1);
    }
}

