import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Callable;
import java.util.logging.Level;

final class cryx implements Callable {
    public static final bboh a;
    private final Context b;
    private final Integer c;
    private final Long d;
    private final crvw e;

    static {
        cryx.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cryx(Context context0, Integer integer0) {
        this.b = context0;
        this.c = integer0;
        this.d = crxn.b();
        this.e = crvw.c();
    }

    @Override
    public final Object call() {
        hhct hhct0;
        Status status0;
        gspd gspd0;
        Context context0 = this.b;
        Object object0 = Boolean.valueOf(false);
        if(context0 == null) {
            Level level0 = cslm.h();
            cryx.a.g(level0).B("%s: call: null context; quitting.", "BgTaskListCpidEndpoints");
            return object0;
        }
        for(Object object1: csli.A(context0, 2)) {
            cslv cslv0 = (cslv)object1;
            if(cslv0.d) {
                Level level1 = cslm.h();
                ggtj ggtj0 = cryx.a.g(level1);
                String s = cslv0.b;
                ggtj0.R("%s: runForCpidQuotaCheck: mccmnc: %s.", "BgTaskListCpidEndpoints", s);
                Integer integer0 = this.c;
                Long long0 = this.d;
                crxn crxn0 = crxn.c();
                long v = (long)long0;
                gizg gizg0 = crxn0.D(17, "GTAF_Server", "MDP_BgTask");
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gizg0));
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizz.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gizz)hftv0).c = s;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((gizz)hftv1).d = true;
                long v1 = cslv0.c;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gizz)hftp1.b_message).e = v1;
                gizz gizz0 = (gizz)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg1 = (gizg)hftp0.b_message;
                gizz0.getClass();
                gizg1.x = gizz0;
                gizg1.b |= 0x2000;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gizg)hftp0.b_message).t = v;
                if(hvlb.d()) {
                    crxn0.e(((gizg)hftp0.N_build()), hhct.bU, integer0);
                }
                crxn0.e(((gizg)hftp0.N_build()), hhct.bQ, integer0);
                cryd cryd0 = new cryd(context0, hvko.u(), "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4", ((int)hvko.f()));
                try {
                    gspd0 = hvlb.f() ? cryd0.g(integer0, long0, "MDP_BgTask", ckjo.c) : cryd0.f(integer0, long0, "MDP_BgTask");
                    status0 = null;
                    goto label_69;
                }
                catch(acse acse0) {
                    Level level2 = cslm.h();
                    ((ggtj)cryx.a.g(level2).s(acse0)).R("%s: makeGrpcCall: MDP_SERVER_GTAF_AUTH_FAILURE. message: %s", "BgTaskListCpidEndpoints", acse0.getMessage());
                    status0 = new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure.");
                }
                catch(iapl iapl0) {
                    iapk iapk0 = iapl0.a;
                    if(iapk0 == null) {
                    label_65:
                        Level level4 = cslm.h();
                        ((ggtj)cryx.a.g(level4).s(iapl0)).R("%s: makeGrpcCall: StatusException. message: %s", "BgTaskListCpidEndpoints", iapl0.getMessage());
                        status0 = crxw.a(iapl0);
                    }
                    else {
                        if(iapk0.t == iaph.f) {
                            Level level3 = cslm.h();
                            cryx.a.g(level3).B("%s: call: MDP_UNSUPPORTED_CARRIER.", "BgTaskListCpidEndpoints");
                            status0 = new Status(27001, "MDP_UNSUPPORTED_CARRIER. " + iapk0.toString());
                            goto label_68;
                        }
                        goto label_65;
                    }
                }
            label_68:
                gspd0 = null;
            label_69:
                String s1 = cslv0.a;
                if(hvjq.e()) {
                    String s2 = cslv0.b;
                    if(!TextUtils.isEmpty(s2)) {
                        boolean z = crvw.c().D(s1, s2.substring(0, 3), s2.substring(3));
                        crxn crxn1 = crxn.c();
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp2.b_message;
                        ((giyo)hftv2).c = z;
                        if(!hftv2.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((giyo)hftp2.b_message).b = 10;
                        crxn1.j(((giyo)hftp2.N_build()), "MDP_BgTask", this.c);
                    }
                }
                if(status0 == null) {
                    if(gspd0 == null) {
                        status0 = new Status(27003, "MDP_BAD_RESPONSE. ListCpidEndpointsResponse object is null.");
                    }
                    else if(gspd0.b.size() == 0) {
                        status0 = new Status(27006, "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT. Carrier endpoints are empty.");
                    }
                    else {
                        long v2 = gspd0.c;
                        if(v2 <= 0L) {
                            status0 = new Status(27003, a.u(v2, "MDP_BAD_RESPONSE. Carrier ID is <= 0: "));
                        }
                        else {
                            Long long1 = this.e.o(s1);
                            if(long1 != null && ((long)long1) > 0L && gspd0.c != ((long)long1)) {
                                Level level5 = cslm.h();
                                cryx.a.g(level5).X("%s: makeGrpcCall: cached carrierId: %s, rpc carrierId:%s", "BgTaskListCpidEndpoints", long1, Long.valueOf(gspd0.c));
                            }
                        }
                    }
                }
                crxn crxn2 = crxn.c();
                int v3 = status0 == null ? 0 : status0.i;
                Integer integer1 = this.c;
                Long long2 = this.d;
                long v4 = (long)long2;
                gizg gizg2 = crxn2.D(17, (v3 == 0 || v3 == 16 ? "GTAF_Server" : "Error"), "MDP_BgTask");
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg2).jf(5, null);
                hftp3.X(((ProtoLiteMessage)gizg2));
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gizz.a).v_newBuilder();
                String s3 = cslv0.b;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp4.b_message;
                ((gizz)hftv3).c = s3;
                boolean z1 = cslv0.d;
                if(!hftv3.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp4.b_message;
                ((gizz)hftv4).d = z1;
                long v5 = cslv0.c;
                if(!hftv4.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((gizz)hftp4.b_message).e = v5;
                gizz gizz1 = (gizz)hftp4.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gizg gizg3 = (gizg)hftp3.b_message;
                gizz1.getClass();
                gizg3.x = gizz1;
                gizg3.b |= 0x2000;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp3.b_message;
                ((gizg)hftv5).h = (long)v3;
                if(!hftv5.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gizg)hftp3.b_message).t = v4;
                switch(v3) {
                    case 0: {
                        hhct0 = hhct.bS;
                        break;
                    }
                    case 16: {
                        hhct0 = hhct.bR;
                        break;
                    }
                    default: {
                        hhct0 = hhct.bT;
                    }
                }
                crxn2.e(((gizg)hftp3.N_build()), hhct0, integer1);
                hvlb.d();
                if(hvkk.j() && status0 != null) {
                    crxn.c().A(status0.i, "MDP_BgTask", integer1, long2);
                    Level level6 = cslm.h();
                    cryx.a.g(level6).R("%s: makeGrpcCall: failure: %s", "BgTaskListCpidEndpoints", status0);
                    return Boolean.valueOf(((Boolean)object0).booleanValue());
                }
                if(gspd0 != null && gspd0.h != ((int)integer1)) {
                    Level level7 = cslm.h();
                    cryx.a.g(level7).X("%s: makeGrpcCall: response had different EventFlowId. Request: %s, Response: %s", "BgTaskListCpidEndpoints", integer1, Integer.valueOf(gspd0.h));
                }
                if(gspd0 != null && gspd0.g != ((long)long2)) {
                    Level level8 = cslm.h();
                    cryx.a.g(level8).X("%s: makeGrpcCall: response had different uniqueRequestId. Request: %s, Response: %s", "BgTaskListCpidEndpoints", long2, Long.valueOf(gspd0.g));
                }
                boolean z2 = crvw.c().C(s1, gspd0);
                crxn crxn3 = crxn.c();
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp5.b_message;
                ((giyo)hftv6).b = 8;
                if(!hftv6.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((giyo)hftp5.b_message).c = z2;
                crxn3.j(((giyo)hftp5.N_build()), "MDP_BgTask", integer1);
                if(hvkk.j()) {
                    crxn.c().B(gspd0, "MDP_BgTask");
                }
                Level level9 = cslm.h();
                cryx.a.g(level9).S("%s: makeGrpcCall: saved in cache? %s", "BgTaskListCpidEndpoints", z2);
                return Boolean.valueOf(z2);
            }
        }
        Level level10 = cslm.h();
        cryx.a.g(level10).B("%s: runForCpidQuotaCheck: supported SIMs are not default SIM.", "BgTaskListCpidEndpoints");
        return Boolean.valueOf(false);
    }
}

