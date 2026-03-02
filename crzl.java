import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class crzl extends cjtm {
    private static final bboh a;
    private final crxi b;
    private final MdpDataPlanStatusRequest c;
    private final Object d;
    private volatile Context e;
    private crxn f;
    private crwl g;

    static {
        crzl.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crzl(crxi crxi0, MdpDataPlanStatusRequest mdpDataPlanStatusRequest0, azug azug0) {
        super(0x9E, "GetDataPlanStatus", azug0);
        this.d = new Object();
        this.b = crxi0;
        if(mdpDataPlanStatusRequest0 != null && mdpDataPlanStatusRequest0.d == null) {
            crvb crvb0 = new crvb(mdpDataPlanStatusRequest0);
            crvb0.c(Long.valueOf(crxn.b()));
            mdpDataPlanStatusRequest0 = crvb0.a;
        }
        if(mdpDataPlanStatusRequest0 != null && mdpDataPlanStatusRequest0.c == null) {
            crvb crvb1 = new crvb(mdpDataPlanStatusRequest0);
            crvb1.b(Integer.valueOf(0));
            mdpDataPlanStatusRequest0 = crvb1.a;
        }
        this.c = mdpDataPlanStatusRequest0;
    }

    private final crxn b() {
        synchronized(this.d) {
            if(this.f == null) {
                this.f = new crxn(this.e);
            }
        }
        return this.f;
    }

    private final void c(MdpDataPlanStatusResponse mdpDataPlanStatusResponse0, boolean z, boolean z1) {
        String s = this.g == null ? "CLIENT_TestInvalid" : this.g.c;
        Level level0 = cslm.h();
        ggtj ggtj0 = crzl.a.g(level0);
        MdpDataPlanStatusRequest mdpDataPlanStatusRequest0 = this.c;
        ggtj0.Z("DataPlanStatus <%s> for %s. FromCache:%b, Response:{%s}\nCachePutSuccess:%b", mdpDataPlanStatusRequest0.a, s, Boolean.valueOf(z), mdpDataPlanStatusResponse0, Boolean.valueOf(z1));
        try {
            if(hvkk.f()) {
                this.b().w(mdpDataPlanStatusRequest0, mdpDataPlanStatusResponse0, z, s);
            }
            else {
                this.b().w(null, mdpDataPlanStatusResponse0, z, s);
            }
            new cslg().b(mdpDataPlanStatusResponse0);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
            this.b.c(Status.b, mdpDataPlanStatusResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzl.a.i()).s(remoteException0)).R("Unable to complete api callback with success response:{%s} because of exception %s", new gpnd(gpnc.a, mdpDataPlanStatusResponse0), new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        boolean z;
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse1;
        String s3;
        long v = 0L;
        if(hvko.b() > 0L && hvko.j() > 0L) {
            gmde.d(hvko.j(), TimeUnit.MILLISECONDS);
        }
        bboh bboh0 = crzl.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        MdpDataPlanStatusRequest mdpDataPlanStatusRequest0 = this.c;
        ggtj0.B("Exec GetDataPlan. req:{%s}", mdpDataPlanStatusRequest0);
        this.e = context0;
        if(hvjk.l()) {
            ((ggtj)bboh0.j()).x("MDP_MODULE_DISABLED. Likely because the carrier is not supported.");
            this.j(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        }
        if(mdpDataPlanStatusRequest0 != null && (mdpDataPlanStatusRequest0.a != null && !mdpDataPlanStatusRequest0.a.isEmpty())) {
            MdpDataPlanStatusResponse mdpDataPlanStatusResponse0 = null;
            crwl crwl0 = crwm.c().a(mdpDataPlanStatusRequest0.a, (mdpDataPlanStatusRequest0.b == null ? null : mdpDataPlanStatusRequest0.b.getString("for_test")));
            this.g = crwl0;
            String s = "CLIENT_TestInvalid";
            hvjn.d();
            crxn crxn0 = this.b();
            gizg gizg0 = crxn0.D(4, "GTAF_Server", (crwl0 == null ? "CLIENT_TestInvalid" : crwl0.c));
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            if(hvkk.h()) {
                crxn.T(hftp0, mdpDataPlanStatusRequest0.b);
            }
            String s1 = mdpDataPlanStatusRequest0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            s1.getClass();
            gizg1.e = s1;
            Long long0 = mdpDataPlanStatusRequest0.d;
            if(long0 != null) {
                v = (long)long0;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).t = v;
            crxn0.e(((gizg)hftp0.N_build()), hhct.h, mdpDataPlanStatusRequest0.c);
            String s2 = this.g == null ? null : this.g.d;
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
            if(hvjn.d()) {
                if(mdpDataPlanStatusRequest0.b != null && mdpDataPlanStatusRequest0.b.size() > 0) {
                    String s4 = mdpDataPlanStatusRequest0.b.getString("bypass_local_cache");
                    if(s4 == null || !s4.equalsIgnoreCase("true")) {
                        goto label_56;
                    }
                }
                else {
                label_56:
                    if(!hvlq.j() || !mdpDataPlanStatusRequest0.b.containsKey("campaign_id")) {
                        try {
                            ((ggtj)bboh0.h()).x("GetDataPlanStatus is retrieved from cache");
                            mdpDataPlanStatusResponse0 = crvw.c().b(s2);
                        }
                        catch(SQLiteException sQLiteException0) {
                            a.e(crzl.a.i(), "Unexpected exception in reading cache in GetDataPlanStatusOperation: %s", new gpnd(gpnc.a, sQLiteException0.getMessage()), sQLiteException0);
                        }
                        if(mdpDataPlanStatusResponse0 != null) {
                            this.c(crvd.a(mdpDataPlanStatusResponse0.a, mdpDataPlanStatusResponse0.b, mdpDataPlanStatusResponse0.c, mdpDataPlanStatusResponse0.d, mdpDataPlanStatusResponse0.e, this.c.c, this.c.d, mdpDataPlanStatusResponse0.h, mdpDataPlanStatusResponse0.i, mdpDataPlanStatusResponse0.j, mdpDataPlanStatusResponse0.k), true, false);
                            return;
                        }
                    }
                }
            }
            if(this.g == null) {
                ((ggtj)crzl.a.j()).x("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId.");
                this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: " + this.c.a));
                return;
            }
            if(hvjn.f() && !csli.t(context0)) {
                ((ggtj)crzl.a.j()).x("MDP_NO_NETWORK: Need a valid network connection.");
                this.j(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
                return;
            }
            String s5 = this.g.a;
            String s6 = this.g.d;
            cryd cryd0 = new cryd(context0, hvko.u(), s5, ((int)hvko.f()));
            try {
                mdpDataPlanStatusResponse1 = hvlb.f() ? cryd0.b(s6, this.c, ckjm.b) : cryd0.a(s6, this.c);
            }
            catch(acse acse0) {
                a.e(crzl.a.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
                this.j(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."));
                return;
            }
            catch(iapl iapl0) {
                a.e(crzl.a.j(), "StatusException while getting data plan status: %s", new gpnd(gpnc.a, iapl0.getMessage()), iapl0);
                this.j(crxw.a(iapl0));
                return;
            }
            if(hvjn.d()) {
                try {
                    crvw crvw0 = crvw.c();
                    ContentValues contentValues0 = new ContentValues();
                    crwh.c(s6, contentValues0);
                    crwh.b(crvw0.o(s6), contentValues0);
                    contentValues0.put("data_plan", gale.b(mdpDataPlanStatusResponse1));
                    crwi crwi0 = crwh.a(contentValues0);
                    z = crvw0.d.j(crwi0);
                }
                catch(SQLiteException sQLiteException1) {
                    a.e(crzl.a.i(), "Unexpected exception in writing SimDB cache in GetDataPlanStatusOperation: %s", new gpnd(gpnc.a, sQLiteException1.getMessage()), sQLiteException1);
                    z = false;
                }
                crxn crxn1 = crxn.c();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((giyo)hftv0).b = 6;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((giyo)hftp1.b_message).c = z;
                giyo giyo0 = (giyo)hftp1.N_build();
                crwl crwl1 = this.g;
                if(crwl1 != null) {
                    s = crwl1.c;
                }
                Integer integer0 = this.c.c;
                crxn1.j(giyo0, s, Integer.valueOf((integer0 == null ? 0 : ((int)integer0))));
            }
            else {
                z = false;
            }
            this.c(mdpDataPlanStatusResponse1, false, z);
            return;
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
        crzl.a.g(level0).B("Error status:{%s}", status0);
        String s = this.g == null ? "CLIENT_TestInvalid" : this.g.c;
        if(hvkk.f()) {
            this.b().o(this.c.b, hhct.j, ((long)status0.i), s, (this.c == null ? null : this.c.a), (this.c == null ? null : this.c.c), (this.c == null ? null : this.c.d));
        }
        else {
            crxn crxn0 = this.b();
            long v = (long)status0.i;
            MdpDataPlanStatusRequest mdpDataPlanStatusRequest0 = this.c;
            hhct hhct0 = hhct.j;
            String s1 = mdpDataPlanStatusRequest0 == null ? null : mdpDataPlanStatusRequest0.a;
            Integer integer0 = mdpDataPlanStatusRequest0 == null ? null : mdpDataPlanStatusRequest0.c;
            if(mdpDataPlanStatusRequest0 == null) {
                s2 = s1;
                s3 = s;
                long0 = null;
            }
            else {
                s2 = s1;
                s3 = s;
                long0 = mdpDataPlanStatusRequest0.d;
            }
            crxn0.n(hhct0, v, s3, s2, integer0, long0);
        }
        try {
            this.b.c(status0, null, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ggtj ggtj0 = (ggtj)((ggtj)crzl.a.i()).s(remoteException0);
            gpnd gpnd0 = new gpnd(gpnc.a, status0);
            ggtj0.R("Unable to complete api callback for failure: %s with status:{%s}", new gpnd(gpnc.a, remoteException0.getMessage()), gpnd0);
        }
    }
}

