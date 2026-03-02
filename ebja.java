import android.content.Context;
import j..time.Duration;
import j..time.Instant;
import j..time.LocalDateTime;
import j..util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.List;

public final class ebja {
    public static final List a(dylc dylc0) {
        gged_interceptors gged0 = dypd.b(dylc0);
        ibuq.e(gged0, "getCommuterPassData(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            gutb gutb0 = (gutb)object0;
            ibuq.c(gutb0);
            int v = gutb0.b;
            int v1 = guta.a(v);
            Object object1 = null;
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 0: {
                    if(!dzdt.I((v == 1 ? ((gusx)gutb0.c) : gusx.a))) {
                        dymq dymq0 = dymp.a(((ProtoLiteMessage)dymk.a).v_newBuilder());
                        dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                        ibuq.e(dyna0, "getServiceProvider(...)");
                        dymq0.d(dyna0);
                        String s = dylc0.d;
                        ibuq.e(s, "getServiceProviderCardId(...)");
                        dymq0.e(s);
                        gurh gurh0 = gurg.a(((ProtoLiteMessage)gutc.a).v_newBuilder());
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gusy.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        gusx gusx0 = gutb0.b == 1 ? ((gusx)gutb0.c) : gusx.a;
                        gusv gusv0 = gusv.b(gusx0.l) == null ? gusv.d : gusv.b(gusx0.l);
                        ibuq.e(gusv0, "getPasmoPassTransportationType(...)");
                        ibuq.f(gusv0, "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gusy gusy0 = (gusy)hftp0.b_message;
                        gusy0.c = gusv0.a();
                        gusy0.b |= 1;
                        ProtoLiteMessage hftv0 = hftp0.N_build();
                        ibuq.e(hftv0, "build(...)");
                        ibuq.f(((gusy)hftv0), "value");
                        ProtoLiteBuilder hftp1 = gurh0.a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gutc gutc0 = (gutc)hftp1.b_message;
                        ((gusy)hftv0).getClass();
                        gutc0.c = (gusy)hftv0;
                        gutc0.b = 1;
                        dymq0.b(gurh0.a());
                        hfwn hfwn0 = hfyn.h((gutb0.b == 1 ? ((gusx)gutb0.c) : gusx.a).h);
                        ibuq.e(hfwn0, "fromMillis(...)");
                        dymq0.c(hfwn0);
                        object1 = dymq0.a();
                    }
                    break;
                }
                case 1: {
                    if(!dzdt.N(gutb0)) {
                        dymq dymq1 = dymp.a(((ProtoLiteMessage)dymk.a).v_newBuilder());
                        dyna dyna1 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
                        ibuq.e(dyna1, "getServiceProvider(...)");
                        dymq1.d(dyna1);
                        String s1 = dylc0.d;
                        ibuq.e(s1, "getServiceProviderCardId(...)");
                        dymq1.e(s1);
                        gurh gurh1 = gurg.a(((ProtoLiteMessage)gutc.a).v_newBuilder());
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gutd.a).v_newBuilder();
                        ibuq.f(hftp2, "builder");
                        String s2 = (gutb0.b == 2 ? ((gusr)gutb0.c) : gusr.a).b;
                        ibuq.e(s2, "getJreTicketId(...)");
                        ibuq.f(s2, "value");
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gutd gutd0 = (gutd)hftp2.b_message;
                        s2.getClass();
                        gutd0.b |= 1;
                        gutd0.c = s2;
                        ProtoLiteMessage hftv1 = hftp2.N_build();
                        ibuq.e(hftv1, "build(...)");
                        ibuq.f(((gutd)hftv1), "value");
                        ProtoLiteBuilder hftp3 = gurh1.a;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        gutc gutc1 = (gutc)hftp3.b_message;
                        ((gutd)hftv1).getClass();
                        gutc1.c = (gutd)hftv1;
                        gutc1.b = 2;
                        dymq1.b(gurh1.a());
                        hfwn hfwn1 = hfyn.h((gutb0.b == 2 ? ((gusr)gutb0.c) : gusr.a).g);
                        ibuq.e(hfwn1, "fromMillis(...)");
                        dymq1.c(hfwn1);
                        object1 = dymq1.a();
                    }
                }
            }
            arrayList0.add(object1);
            continue;
        }
        return ibpo.ag(arrayList0);
    }

    public static final void b(Context context0, long v) {
        ibuq.f(context0, "context");
        if(!hwsd.M()) {
            return;
        }
        Instant instant0 = Instant.ofEpochMilli(v);
        ibuq.e(instant0, "ofEpochMilli(...)");
        LocalDateTime localDateTime0 = instant0.atZone(DesugarTimeZone.a(ebjb.a)).toLocalDate().atStartOfDay();
        ibuq.e(localDateTime0, "atStartOfDay(...)");
        Instant instant1 = localDateTime0.plusHours(hwsd.d()).plusMinutes(hwsd.e()).atZone(DesugarTimeZone.a(ebjb.a)).toInstant();
        ibuq.e(instant1, "toInstant(...)");
        Instant instant2 = localDateTime0.plusHours(hwsd.b()).plusMinutes(hwsd.c()).atZone(DesugarTimeZone.a(ebjb.a)).toInstant();
        ibuq.e(instant2, "toInstant(...)");
        if(instant0.isAfter(instant2)) {
            instant1 = instant1.plus(Duration.ofDays(1L));
            ibuq.e(instant1, "plus(...)");
            instant2 = instant2.plus(Duration.ofDays(1L));
            ibuq.e(instant2, "plus(...)");
        }
        long v1 = Math.max(0L, Duration.between(instant0, instant1).toSeconds());
        long v2 = Duration.between(instant0, instant2).toSeconds();
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.q("felica.emoney.commuterpass.renewal.notification");
        clkn0.e(v1, v2);
        clkn0.y(0, 1);
        clkn0.v(1);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

