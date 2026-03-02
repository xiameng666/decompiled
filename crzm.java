import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import j..util.Objects;
import j..util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class crzm extends cjtm {
    private static final bboh a;
    private final crxi b;
    private final MdpUpsellOfferRequest c;
    private final Object d;
    private final boolean e;
    private volatile Context f;
    private crxn g;
    private crwl h;

    static {
        crzm.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crzm(crxi crxi0, MdpUpsellOfferRequest mdpUpsellOfferRequest0, azug azug0) {
        super(0x9E, "GetUpsellOffer", azug0);
        this.d = new Object();
        this.b = crxi0;
        if(mdpUpsellOfferRequest0 != null && mdpUpsellOfferRequest0.d == null) {
            crvl crvl0 = new crvl(mdpUpsellOfferRequest0);
            crvl0.d = crxn.b();
            mdpUpsellOfferRequest0 = crvl0.a();
        }
        boolean z = false;
        if(mdpUpsellOfferRequest0 != null && mdpUpsellOfferRequest0.c == null) {
            crvl crvl1 = new crvl(mdpUpsellOfferRequest0);
            crvl1.c = (int)0;
            mdpUpsellOfferRequest0 = crvl1.a();
        }
        if(hvlq.q() && Objects.equals(mdpUpsellOfferRequest0.f, "esim_context")) {
            z = true;
        }
        this.e = z;
        this.c = mdpUpsellOfferRequest0;
    }

    private final crxn b() {
        synchronized(this.d) {
            if(this.g == null) {
                this.g = new crxn(this.f);
            }
        }
        return this.g;
    }

    private final void c(Context context0) {
        boolean z;
        MdpUpsellOfferResponse mdpUpsellOfferResponse0;
        if(this.h == null) {
            this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: " + this.c.a));
            return;
        }
        if(hvjn.f() && !csli.t(context0)) {
            this.j(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
            return;
        }
        String s = this.h.a;
        String s1 = this.h.d;
        cryd cryd0 = new cryd(context0, hvko.u(), s, ((int)hvko.f()));
        try {
            mdpUpsellOfferResponse0 = hvlb.f() ? cryd0.d(s1, this.c, ckjn.b) : cryd0.d(s1, this.c, null);
        }
        catch(acse unused_ex) {
            this.j(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
            return;
        }
        catch(iapl iapl0) {
            this.j(crxw.a(iapl0));
            return;
        }
        if(this.e) {
            this.d(mdpUpsellOfferResponse0, false, false);
            return;
        }
        if(hvjn.e()) {
            try {
                crvw crvw0 = crvw.c();
                ContentValues contentValues0 = new ContentValues();
                crwh.c(s1, contentValues0);
                crwh.b(crvw0.o(s1), contentValues0);
                contentValues0.put("upsell_offer", gale.b(mdpUpsellOfferResponse0));
                crwi crwi0 = crwh.a(contentValues0);
                z = crvw0.d.j(crwi0);
            }
            catch(SQLiteException sQLiteException0) {
                a.e(crzm.a.i(), "Unexpected exception in writing SimDB cache in getUpsellOfferOperation: %s", new gpnd(gpnc.a, sQLiteException0.getMessage()), sQLiteException0);
                z = false;
            }
            crxn crxn0 = crxn.c();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giyo)hftv0).b = 7;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giyo)hftp0.b_message).c = z;
            giyo giyo0 = (giyo)hftp0.N_build();
            Integer integer0 = this.c.c;
            crxn0.j(giyo0, (this.h == null ? "CLIENT_TestInvalid" : this.h.c), Integer.valueOf((integer0 == null ? 0 : ((int)integer0))));
        }
        else {
            z = false;
        }
        this.d(mdpUpsellOfferResponse0, false, z);
    }

    private final void d(MdpUpsellOfferResponse mdpUpsellOfferResponse0, boolean z, boolean z1) {
        String s = this.h == null ? "CLIENT_TestInvalid" : this.h.c;
        MdpUpsellOfferRequest mdpUpsellOfferRequest0 = this.c;
        String s1 = mdpUpsellOfferRequest0 == null ? "" : mdpUpsellOfferRequest0.a;
        Level level0 = cslm.h();
        crzm.a.g(level0).Z("UpsellOffer <%s> for %s. FromCache:%b, Response:{%s}\nCachePutSuccess:%b", s1, s, Boolean.valueOf(z), mdpUpsellOfferResponse0, Boolean.valueOf(z1));
        try {
            if(hvkk.f()) {
                this.b().y(mdpUpsellOfferRequest0, mdpUpsellOfferResponse0, s1, z, s);
            }
            else {
                this.b().y(null, mdpUpsellOfferResponse0, s1, z, s);
            }
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
            this.b.d(Status.b, mdpUpsellOfferResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzm.a.i()).s(remoteException0)).R("Unable to complete api callback for success response:{%s} with error: %s", new gpnd(gpnc.a, mdpUpsellOfferResponse0), new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s3;
        long v = 0L;
        if(hvko.b() > 0L && hvko.i() > 0L) {
            gmde.d(hvko.i(), TimeUnit.MILLISECONDS);
        }
        bboh bboh0 = crzm.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        MdpUpsellOfferRequest mdpUpsellOfferRequest0 = this.c;
        ggtj0.B("Exec GetOffer. req:{%s}", mdpUpsellOfferRequest0);
        this.f = context0;
        boolean z = this.e;
        if(!z && hvjk.l()) {
            this.j(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        }
        if(mdpUpsellOfferRequest0 != null) {
            MdpUpsellOfferResponse mdpUpsellOfferResponse0 = null;
            String s = mdpUpsellOfferRequest0.a;
            if(s != null && !s.isEmpty()) {
                this.h = z ? crwm.c().a(s, "ui_esim") : crwm.c().a(s, (mdpUpsellOfferRequest0.b == null ? null : mdpUpsellOfferRequest0.b.getString("for_test")));
                String s1 = this.h == null ? "CLIENT_TestInvalid" : this.h.c;
                hvjn.d();
                if(z) {
                    crxn crxn0 = this.b();
                    Optional optional0 = Optional.ofNullable(mdpUpsellOfferRequest0.i);
                    Optional optional1 = Optional.ofNullable(mdpUpsellOfferRequest0.j);
                    crxn0.q(hhct.dQ, s, optional0, optional1, mdpUpsellOfferRequest0.g.longValue(), 0L);
                    this.c(context0);
                    return;
                }
                crxn crxn1 = this.b();
                gizg gizg0 = crxn1.D(6, "GTAF_Server", s1);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gizg0));
                if(hvkk.h()) {
                    crxn.T(hftp0, mdpUpsellOfferRequest0.b);
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gizg)hftp0.b_message).e = s;
                Long long0 = mdpUpsellOfferRequest0.d;
                if(long0 != null) {
                    v = (long)long0;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gizg)hftp0.b_message).t = v;
                crxn1.e(((gizg)hftp0.N_build()), hhct.k, mdpUpsellOfferRequest0.c);
                String s2 = this.h == null ? null : this.h.d;
                if(hvko.C() && hvjt.d()) {
                    Long long1 = crvw.c().o(s2);
                    hfys hfys0 = hvko.r().isEmpty() ? crvw.c().k(long1, s2) : crvw.c().j(csli.g(context0));
                    if(hfys0 == null || (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.b && (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.d) {
                        ggtj ggtj1 = bboh0.g(cslm.h());
                        if(hfys0 == null) {
                            s3 = "no record";
                        }
                        else {
                            s3 = hhcr.b(hfys0.g);
                            if(s3 == null) {
                                s3 = hhcr.k;
                            }
                        }
                        ggtj1.B("User has not consented yet. Status: %s", s3);
                        this.j(new Status(0x698F, "MDP_REQUIRE_CONSENT. User has not consented yet."));
                        return;
                    }
                }
                if(hvjn.e()) {
                    Bundle bundle0 = mdpUpsellOfferRequest0.b;
                    if(bundle0 != null && bundle0.size() > 0) {
                        String s4 = bundle0.getString("bypass_local_cache");
                        if(s4 == null || !s4.equalsIgnoreCase("true")) {
                            goto label_65;
                        }
                    }
                    else {
                        try {
                        label_65:
                            crvw crvw0 = crvw.c();
                            Long long2 = crvw0.o(s2);
                            crwi crwi0 = crvw0.d.e(long2, s2);
                            if(crwi0 != null) {
                                byte[] arr_b = crwi0.a.getAsByteArray("upsell_offer");
                                if(arr_b != null) {
                                    mdpUpsellOfferResponse0 = (MdpUpsellOfferResponse)gale.a(arr_b, MdpUpsellOfferResponse.CREATOR);
                                }
                            }
                        }
                        catch(SQLiteException sQLiteException0) {
                            a.ae(crzm.a.i(), "Unexpected exception in reading cache in GetUpsellOfferOperation", sQLiteException0);
                        }
                        if(mdpUpsellOfferResponse0 != null) {
                            this.d(new MdpUpsellOfferResponse(mdpUpsellOfferResponse0.a, mdpUpsellOfferResponse0.b, mdpUpsellOfferResponse0.c, mdpUpsellOfferResponse0.d, mdpUpsellOfferResponse0.e, mdpUpsellOfferResponse0.f, this.c.c, this.c.d, mdpUpsellOfferResponse0.i, mdpUpsellOfferResponse0.j), true, false);
                            return;
                        }
                    }
                }
                this.c(context0);
                return;
            }
        }
        ((ggtj)bboh0.i()).x("Invalid arguments. Need an non-empty Carrier Plan Id.");
        this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. Need an non-empty Carrier Plan Id."));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Long long0;
        String s3;
        String s2;
        Level level0 = cslm.h();
        crzm.a.g(level0).B("Error status:{%s}", status0);
        String s = this.h == null ? "CLIENT_TestInvalid" : this.h.c;
        if(hvkk.f()) {
            this.b().o(this.c.b, hhct.m, ((long)status0.i), s, (this.c == null ? null : this.c.a), (this.c == null ? null : this.c.c), (this.c == null ? null : this.c.d));
        }
        else {
            crxn crxn0 = this.b();
            long v = (long)status0.i;
            MdpUpsellOfferRequest mdpUpsellOfferRequest0 = this.c;
            hhct hhct0 = hhct.m;
            String s1 = mdpUpsellOfferRequest0 == null ? null : mdpUpsellOfferRequest0.a;
            Integer integer0 = mdpUpsellOfferRequest0 == null ? null : mdpUpsellOfferRequest0.c;
            if(mdpUpsellOfferRequest0 == null) {
                s2 = s1;
                s3 = s;
                long0 = null;
            }
            else {
                s2 = s1;
                s3 = s;
                long0 = mdpUpsellOfferRequest0.d;
            }
            crxn0.n(hhct0, v, s3, s2, integer0, long0);
        }
        try {
            this.b.d(status0, null, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzm.a.i()).s(remoteException0)).R("Unable to complete api callback for failure:{%s} with error: %s", new gpnd(gpnc.a, status0), new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }
}

