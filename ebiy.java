import android.content.Context;
import android.os.Bundle;
import j..time.Duration;
import j..time.Instant;
import j..time.ZonedDateTime;
import j..time.temporal.ChronoField;
import j..util.DesugarCollections;
import j..util.DesugarTimeZone;
import j..util.Map.-EL;
import java.util.List;

public final class ebiy implements ibts {
    public final Instant a;
    public final List b;
    public final ibvd c;
    public final hfwn d;
    public final Context e;

    public ebiy(Instant instant0, List list0, ibvd ibvd0, hfwn hfwn0, Context context0) {
        this.a = instant0;
        this.b = list0;
        this.c = ibvd0;
        this.d = hfwn0;
        this.e = context0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dymo)object0), "secureElementMyCommuteData");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dymo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dymo)object0))));
        dyms dyms0 = dymr.a(((dymj)hftp0));
        Instant instant0 = this.a;
        hfwn hfwn0 = hfyn.h(instant0.toEpochMilli());
        ibuq.e(hfwn0, "fromMillis(...)");
        dyms0.b(hfwn0);
        dyms0.f();
        dyms0.c();
        dyms0.f();
        dymj dymj0 = dyms0.a;
        if(!dymj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)dymj0).ensureMutable();
        }
        dymo dymo0 = (dymo)dymj0.b_message;
        hfuo hfuo0 = dymo0.d;
        if(!hfuo0.c()) {
            dymo0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.b, dymo0.d);
        dyms0.g();
        if(!dymj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)dymj0).ensureMutable();
        }
        ((dymo)dymj0.b_message).b().clear();
        for(Object object1: ((List)this.c.a)) {
            dylf dylf0 = (dylf)object1;
            dylc dylc0 = dylf0.d == null ? dylc.a : dylf0.d;
            String s = (dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)).name() + (dylf0.d == null ? dylc.a : dylf0.d).d;
            hfwn hfwn1 = (hfwn)Map.-EL.getOrDefault(DesugarCollections.unmodifiableMap(((dymo)object0).e), s, hfyn.c);
            dyms0.g();
            ibuq.c(hfwn1);
            dyms0.e(s, hfwn1);
            if(hfym.a(hfwn1, this.d) < 0) {
                dylc dylc1 = dylf0.d == null ? dylc.a : dylf0.d;
                ibuq.e(dylc1, "getSePrepaidCardData(...)");
                ibwm ibwm0 = new ibwm(0, 23);
                ibwb ibwb0 = ibwc.a;
                int v;
                for(v = ibwt.k(ibwm0, ibwb0); true; v = ibwt.k(new ibwm(0, 23), ibwb0)) {
                    ZonedDateTime zonedDateTime0 = instant0.atZone(DesugarTimeZone.a(ebjb.a)).plusHours(((long)v));
                    long v1 = (long)(zonedDateTime0.get(ChronoField.HOUR_OF_DAY) * 60 + zonedDateTime0.get(ChronoField.MINUTE_OF_HOUR));
                    if(hwsd.x() * 60L + hwsd.z() - 60L > v1 || v1 > hwsd.u() * 60L + hwsd.w()) {
                        break;
                    }
                }
                long v2 = Duration.ofHours(v).toSeconds();
                clkn clkn0 = new clkn();
                clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
                clkn0.t("felica.emoney.refresh.commuterpass.data." + ((dyna.b(dylc1.c) == null ? dyna.k : dyna.b(dylc1.c)).name() + "." + dylc1.d).hashCode());
                clkn0.e(v2, 3600L + v2);
                clkn0.y(0, 1);
                Bundle bundle0 = new Bundle();
                bundle0.putString("cid", (dylc1.i == null ? dyih.a : dylc1.i).c);
                bundle0.putInt("service_provider_number", (dyna.b(dylc1.c) == null ? dyna.k : dyna.b(dylc1.c)).a());
                clkn0.u = bundle0;
                clko clko0 = clkn0.a();
                cljp.a(this.e).f(clko0);
            }
        }
        return dyms0.a();
    }
}

