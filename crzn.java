import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class crzn extends cjtm {
    private static final bboh a;
    private final crxi b;
    private final MdpPurchaseOfferRequest c;
    private final Object d;
    private volatile Context e;
    private crxn f;
    private crwl g;

    static {
        crzn.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crzn(crxi crxi0, MdpPurchaseOfferRequest mdpPurchaseOfferRequest0, azug azug0) {
        super(0x9E, "PurchaseOffer", azug0);
        this.d = new Object();
        this.b = crxi0;
        if(mdpPurchaseOfferRequest0 != null && mdpPurchaseOfferRequest0.g == null) {
            crvi crvi0 = new crvi(mdpPurchaseOfferRequest0);
            crvi0.g = crxn.b();
            mdpPurchaseOfferRequest0 = crvi0.a();
        }
        if(mdpPurchaseOfferRequest0 != null && mdpPurchaseOfferRequest0.f == null) {
            crvi crvi1 = new crvi(mdpPurchaseOfferRequest0);
            crvi1.f = (int)0;
            mdpPurchaseOfferRequest0 = crvi1.a();
        }
        this.c = mdpPurchaseOfferRequest0;
    }

    private final crxn b() {
        synchronized(this.d) {
            if(this.f == null) {
                this.f = new crxn(this.e);
            }
        }
        return this.f;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse0;
        String s6;
        if(hvko.b() > 0L && hvko.k() > 0L) {
            gmde.d(hvko.k(), TimeUnit.MILLISECONDS);
        }
        bboh bboh0 = crzn.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        MdpPurchaseOfferRequest mdpPurchaseOfferRequest0 = this.c;
        ggtj0.B("Exec PurchaseOffer. req:{%s}", mdpPurchaseOfferRequest0);
        this.e = context0;
        if(!hvjk.l()) {
            if(!hvko.a.q().ac()) {
                ((ggtj)bboh0.j()).x("MDP_NOT_ENABLED. The API is not enabled on this device.");
                this.j(new Status(27013, "MDP_NOT_ENABLED. The API is not enabled on this device."));
                return;
            }
            if(mdpPurchaseOfferRequest0 != null) {
                String s = mdpPurchaseOfferRequest0.a;
                if(s != null && !s.isEmpty()) {
                    Bundle bundle0 = mdpPurchaseOfferRequest0.e;
                    crwl crwl0 = crwm.c().a(s, (bundle0 == null ? null : bundle0.getString("for_test")));
                    this.g = crwl0;
                    String s1 = "CLIENT_TestInvalid";
                    crxn crxn0 = this.b();
                    gizg gizg0 = crxn0.D(10, "GTAF_Server", (crwl0 == null ? "CLIENT_TestInvalid" : crwl0.c));
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)gizg0));
                    if(hvkk.h()) {
                        crxn.T(hftp0, bundle0);
                    }
                    int v = hgky.b(mdpPurchaseOfferRequest0.h);
                    switch(v) {
                        case 0: {
                            throw null;
                        }
                        case 1: {
                            v = 2;
                        }
                    }
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizp.a).v_newBuilder();
                    String s2 = mdpPurchaseOfferRequest0.b;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    s2.getClass();
                    ((gizp)hftv0).b = s2;
                    String s3 = mdpPurchaseOfferRequest0.d;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    s3.getClass();
                    ((gizp)hftv1).c = s3;
                    String s4 = mdpPurchaseOfferRequest0.c;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    s4.getClass();
                    ((gizp)hftv2).d = s4;
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gizp gizp0 = (gizp)hftp1.b_message;
                    gizp0.e = hgky.a(v);
                    gizp gizp1 = (gizp)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gizg gizg1 = (gizg)hftp0.b_message;
                    gizp1.getClass();
                    gizg1.l = gizp1;
                    gizg1.b |= 4;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gizg)hftp0.b_message).e = s;
                    long v1 = mdpPurchaseOfferRequest0.g == null ? 0L : ((long)mdpPurchaseOfferRequest0.g);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gizg)hftp0.b_message).t = v1;
                    crxn0.e(((gizg)hftp0.N_build()), hhct.n, mdpPurchaseOfferRequest0.f);
                    String s5 = this.g == null ? null : this.g.d;
                    if(hvko.C() && hvjt.d()) {
                        Long long0 = crvw.c().o(s5);
                        hfys hfys0 = hvko.r().isEmpty() ? crvw.c().k(long0, s5) : crvw.c().j(csli.g(context0));
                        if(hfys0 == null || (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.b && (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.d) {
                            ggtj ggtj1 = bboh0.g(cslm.h());
                            if(hfys0 == null) {
                                s6 = "no record";
                            }
                            else {
                                s6 = hhcr.b(hfys0.g);
                                if(s6 == null) {
                                    s6 = hhcr.k;
                                }
                            }
                            ggtj1.B("User has not consented yet. Status: %s", s6);
                            this.j(new Status(0x698F, "MDP_REQUIRE_CONSENT. User has not consented yet."));
                            return;
                        }
                    }
                    if(this.g == null) {
                        ((ggtj)bboh0.j()).x("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId.");
                        this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: " + s));
                        return;
                    }
                    if(hvjn.f() && !csli.t(context0)) {
                        ((ggtj)bboh0.j()).x("MDP_NO_NETWORK: Need a valid network connection.");
                        this.j(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
                        return;
                    }
                    String s7 = this.g.a;
                    String s8 = this.g.d;
                    cryd cryd0 = new cryd(context0, hvko.u(), s7, ((int)hvko.f()));
                    try {
                        if(hvlb.f()) {
                            crvi crvi0 = new crvi(mdpPurchaseOfferRequest0);
                            crvi0.a = s8;
                            mdpPurchaseOfferResponse0 = cryd0.c(crvi0.a(), ckjk.b);
                        }
                        else {
                            crvi crvi1 = new crvi(mdpPurchaseOfferRequest0);
                            crvi1.a = s8;
                            mdpPurchaseOfferResponse0 = cryd0.c(crvi1.a(), null);
                        }
                    }
                    catch(acse acse0) {
                        a.e(crzn.a.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
                        this.j(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
                        return;
                    }
                    catch(iapl iapl0) {
                        ggsu ggsu0 = crzn.a.j();
                        Status status0 = crxw.a(iapl0);
                        a.e(ggsu0, "StatusException while purchasing offer: %s", new gpnd(gpnc.a, status0), iapl0);
                        this.j(crxw.a(iapl0));
                        return;
                    }
                    if(mdpPurchaseOfferResponse0 == null) {
                        ((ggtj)bboh0.j()).x("MDP_SERVER_GTAF_EMPTY_RESPONSE. Failed purchase.");
                        this.j(new Status(27010, "MDP_SERVER_GTAF_EMPTY_RESPONSE. Failed purchase."));
                        return;
                    }
                    ggtj ggtj2 = bboh0.g(cslm.h());
                    MdpPurchaseOfferRequest mdpPurchaseOfferRequest1 = this.c;
                    String s9 = mdpPurchaseOfferRequest1.a;
                    ggtj2.X("PurchaseOffer <%s> for %s. Response:{%s}", s9, this.g.c, mdpPurchaseOfferResponse0);
                    crwl crwl1 = this.g;
                    if(crwl1 != null) {
                        s1 = crwl1.c;
                    }
                    if(hvkk.f()) {
                        this.b().x(mdpPurchaseOfferRequest1, mdpPurchaseOfferResponse0, s9, s1);
                    }
                    else {
                        this.b().x(null, mdpPurchaseOfferResponse0, s9, s1);
                    }
                    try {
                        ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
                        this.b.e(Status.b, mdpPurchaseOfferResponse0, apiMetadata0);
                    }
                    catch(RemoteException remoteException0) {
                        ((ggtj)((ggtj)crzn.a.i()).s(remoteException0)).R("Unable to complete api callback for success response:{%s}, exception: %s", new gpnd(gpnc.a, mdpPurchaseOfferResponse0), new gpnd(gpnc.a, remoteException0.getMessage()));
                    }
                    return;
                }
            }
            ((ggtj)bboh0.i()).x("Invalid arguments. Need an non-empty Carrier Plan Id.");
            this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. Need an non-empty Carrier Plan Id."));
            return;
        }
        ((ggtj)bboh0.j()).x("MDP_MODULE_DISABLED. Likely because the carrier is not supported.");
        this.j(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Long long0;
        String s3;
        String s2;
        Level level0 = cslm.h();
        crzn.a.g(level0).B("PurchaseOfferOperation Failure Status:{%s}", status0);
        String s = this.g == null ? "CLIENT_TestInvalid" : this.g.c;
        if(hvkk.f()) {
            this.b().o(this.c.e, hhct.p, ((long)status0.i), s, (this.c == null ? null : this.c.a), (this.c == null ? null : this.c.f), (this.c == null ? null : this.c.g));
        }
        else {
            crxn crxn0 = this.b();
            long v = (long)status0.i;
            MdpPurchaseOfferRequest mdpPurchaseOfferRequest0 = this.c;
            hhct hhct0 = hhct.p;
            String s1 = mdpPurchaseOfferRequest0 == null ? null : mdpPurchaseOfferRequest0.a;
            Integer integer0 = mdpPurchaseOfferRequest0 == null ? null : mdpPurchaseOfferRequest0.f;
            if(mdpPurchaseOfferRequest0 == null) {
                s2 = s1;
                s3 = s;
                long0 = null;
            }
            else {
                s2 = s1;
                s3 = s;
                long0 = mdpPurchaseOfferRequest0.g;
            }
            crxn0.n(hhct0, v, s3, s2, integer0, long0);
        }
        try {
            this.b.e(status0, null, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzn.a.i()).s(remoteException0)).R("Unable to complete api callback for failure:{%s} with exception: %s", new gpnd(gpnc.a, status0), new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }
}

