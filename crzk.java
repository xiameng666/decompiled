import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

public final class crzk extends cjtm {
    private static final bboh a;
    private final crxi b;
    private final GetConsentInformationRequest c;
    private crxn d;
    private Context e;
    private crwl f;

    static {
        crzk.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crzk(crxi crxi0, GetConsentInformationRequest getConsentInformationRequest0, azug azug0) {
        super(0x9E, "GetConsentInformation", azug0);
        this.b = crxi0;
        if(getConsentInformationRequest0 != null && getConsentInformationRequest0.d == null) {
            crwr crwr0 = new crwr(getConsentInformationRequest0);
            crwr0.a.d = crxn.b();
            getConsentInformationRequest0 = crwr0.a;
        }
        if(getConsentInformationRequest0 != null && getConsentInformationRequest0.c == null) {
            crwr crwr1 = new crwr(getConsentInformationRequest0);
            crwr1.a(Integer.valueOf(0));
            getConsentInformationRequest0 = crwr1.a;
        }
        this.c = getConsentInformationRequest0;
    }

    final void b(GetConsentInformationResponse getConsentInformationResponse0, boolean z) {
        this.c(getConsentInformationResponse0, z, Status.b);
    }

    final void c(GetConsentInformationResponse getConsentInformationResponse0, boolean z, Status status0) {
        Level level0 = cslm.h();
        ggtj ggtj0 = crzk.a.g(level0);
        GetConsentInformationRequest getConsentInformationRequest0 = this.c;
        ggtj0.Y("GetConsent <%s> for %s. Response:{%s}\nNewCache:%b", getConsentInformationRequest0.a, this.f.c, getConsentInformationResponse0, Boolean.valueOf(z));
        if(hvkk.f()) {
            crxn crxn0 = this.d();
            String s = getConsentInformationRequest0.a;
            String s1 = this.f.c;
            gfsx gfsx0 = hvjq.f() ? gfsx.m(status0) : gfqx.a;
            crxn0.u(getConsentInformationRequest0, getConsentInformationResponse0, s, s1, gfsx0);
        }
        else {
            crxn crxn1 = this.d();
            String s2 = getConsentInformationRequest0.a;
            String s3 = this.f.c;
            gfsx gfsx1 = hvjq.f() ? gfsx.m(status0) : gfqx.a;
            crxn1.u(null, getConsentInformationResponse0, s2, s3, gfsx1);
        }
        try {
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
            this.b.f(Status.b, getConsentInformationResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzk.a.i()).s(remoteException0)).R("Unable to complete api callback for success response:{%s}, error message: %s", getConsentInformationResponse0, new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }

    private final crxn d() {
        synchronized(this) {
            if(this.d == null) {
                this.d = new crxn(this.e);
            }
        }
        return this.d;
    }

    private final void e(String s, Long long0, hfys hfys0, acse acse0) {
        a.e(crzk.a.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
        this.h(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure."), long0, s, hfys0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        GetConsentInformationResponse getConsentInformationResponse1;
        boolean z;
        ProtoLiteBuilder hftp1;
        if(hvko.b() > 0L && hvko.g() > 0L) {
            gmde.d(hvko.g(), TimeUnit.MILLISECONDS);
        }
        bboh bboh0 = crzk.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        GetConsentInformationRequest getConsentInformationRequest0 = this.c;
        ggtj0.S("Exec GetConsent. req:{%s} enabled:%b", getConsentInformationRequest0, hvko.C());
        this.e = context0;
        if(!hvko.C() && !crvw.u()) {
            ((ggtj)bboh0.j()).x("MDP_NOT_ENABLED. Feature is off.");
            this.j(new Status(27013, "MDP_NOT_ENABLED. Feature is off."));
            return;
        }
        String s = null;
        crwl crwl0 = crwm.c().a(getConsentInformationRequest0.a, null);
        this.f = crwl0;
        if(crwl0 == null) {
            ((ggtj)bboh0.j()).x("MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId");
            this.j(new Status(27005, "MDP_INVALID_CARRIER_PLAN_ID. No matching client found for carrierPlanId: " + getConsentInformationRequest0.a));
            return;
        }
        crxn crxn0 = this.d();
        gizg gizg0 = crxn0.D(13, "GTAF_Server", this.f.c);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h()) {
            crxn.T(hftp0, getConsentInformationRequest0.e);
        }
        String s1 = getConsentInformationRequest0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        s1.getClass();
        gizg1.e = s1;
        long v = getConsentInformationRequest0.d == null ? 0L : ((long)getConsentInformationRequest0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v;
        crxn0.e(((gizg)hftp0.N_build()), hhct.q, getConsentInformationRequest0.c);
        crvw crvw0 = crvw.c();
        if(crvw0 == null) {
            ((ggtj)bboh0.j()).x("MDP_NOT_ENABLED. Cache is missing/disabled.");
            this.j(new Status(27013, "MDP_NOT_ENABLED. Cache is missing/disabled."));
            return;
        }
        if(hvjw.n() && crvw0.l() != null) {
            hfys hfys0 = crvw0.l();
            int v1 = hfys0.g;
            ConsentStatus consentStatus0 = new ConsentStatus();
            crwp.a((hhcr.b(v1) == null ? hhcr.k : hhcr.b(v1)).a(), consentStatus0);
            GetConsentInformationResponse getConsentInformationResponse0 = new GetConsentInformationResponse();
            getConsentInformationResponse0.a = consentStatus0;
            getConsentInformationResponse0.d = this.c.c;
            getConsentInformationResponse0.e = this.c.d;
            getConsentInformationResponse0.c = (long)hfys0.h;
            getConsentInformationResponse0.f = (int)1;
            bboh0.g(cslm.h()).B("Per-device consent status returned from cache: %s", (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)));
            this.b(getConsentInformationResponse0, false);
            return;
        }
        String s2 = this.f.d;
        Long long0 = crvw0.o(s2);
        if(long0 != null && ((long)long0) > 0L) {
            hfys hfys1 = crvw0.k(long0, s2);
            if(hfys1 == null) {
                hftp1 = ((ProtoLiteMessage)hfys.a).v_newBuilder();
                long v2 = (long)long0;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hfys)hftv0).b = v2;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s2.getClass();
                ((hfys)hftv1).c = s2;
                String s3 = this.f.c;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((hfys)hftv2).d = s3;
                String s4 = getConsentInformationRequest0.a;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                s4.getClass();
                ((hfys)hftv3).e = s4;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((hfys)hftv4).f = "";
                hhcr hhcr0 = hhcr.e;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hfys hfys2 = (hfys)hftp1.b_message;
                hfys2.g = hhcr0.a();
                long v3 = System.currentTimeMillis();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp1.b_message;
                ((hfys)hftv5).h = v3;
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hfys)hftp1.b_message).i = -1;
                crvw0.w(long0, s2, ((hfys)hftp1.N_build()));
                bboh0.g(cslm.h()).R("Creating new consent cache <%d, %s>", long0, s2);
                z = true;
            }
            else {
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hfys1).jf(5, null);
                hftp2.X(((ProtoLiteMessage)hfys1));
                hftp1 = hftp2;
                z = false;
            }
            hhcr hhcr1 = hhcr.b(((hfys)hftp1.b_message).g);
            if(hhcr1 == null) {
                hhcr1 = hhcr.k;
            }
            if(hhcr1 != hhcr.b && hhcr1 != hhcr.d && getConsentInformationRequest0.b) {
                if(hvjn.f() && !csli.t(context0)) {
                    ((ggtj)bboh0.j()).x("MDP_NO_NETWORK: Need a valid network connection.");
                    this.h(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."), long0, s2, ((hfys)hftp1.N_build()));
                    return;
                }
                cryd cryd0 = new cryd(context0, hvko.u(), this.f.a, ((int)hvko.f()));
                try {
                    if(!hvlb.f()) {
                        getConsentInformationResponse1 = this.i(long0) ? cryd0.j(long0, this.f.e, getConsentInformationRequest0.c, getConsentInformationRequest0.d, hvjt.b()) : cryd0.h(long0, this.f.e, getConsentInformationRequest0.c, getConsentInformationRequest0.d);
                    }
                    else if(this.i(long0)) {
                        getConsentInformationResponse1 = cryd0.j(long0, this.f.e, getConsentInformationRequest0.c, getConsentInformationRequest0.d, hvjt.b());
                    }
                    else {
                        getConsentInformationResponse1 = cryd0.i(long0, this.f.e, getConsentInformationRequest0.c, getConsentInformationRequest0.d, ckji.b);
                    }
                }
                catch(acse acse0) {
                    this.e(s2, long0, ((hfys)hftp1.N_build()), acse0);
                    return;
                }
                catch(iapl iapl0) {
                    this.g(s2, long0, ((hfys)hftp1.N_build()), iapl0);
                    return;
                }
                catch(InterruptedException interruptedException0) {
                    a.e(crzk.a.j(), "INTERRUPTED. Asynchronous GetConsent was interrupted: %s", new gpnd(gpnc.a, interruptedException0.getMessage()), interruptedException0);
                    this.h(new Status(14, "INTERRUPTED. Asynchronous GetConsent was interrupted."), long0, s2, ((hfys)hftp1.N_build()));
                    return;
                }
                catch(ExecutionException executionException0) {
                    if((executionException0.getCause() instanceof iapl)) {
                        this.g(s2, long0, ((hfys)hftp1.N_build()), ((iapl)executionException0.getCause()));
                        return;
                    }
                    if((executionException0.getCause() instanceof acse)) {
                        this.e(s2, long0, ((hfys)hftp1.N_build()), ((acse)executionException0.getCause()));
                        return;
                    }
                    Throwable throwable0 = executionException0.getCause();
                    ggtj ggtj1 = (ggtj)((ggtj)crzk.a.j()).s(throwable0);
                    if(throwable0 != null) {
                        s = throwable0.getMessage();
                    }
                    ggtj1.B("MDP_SERVER_GTAF_FAILURE_ASYNC. Asynchronous GetConsent failed: %s", new gpnd(gpnc.a, s));
                    this.h(new Status(27052, "MDP_SERVER_GTAF_FAILURE_ASYNC: Asynchronous GetConsent RPC call failed."), long0, s2, ((hfys)hftp1.N_build()));
                    return;
                }
                catch(TimeoutException timeoutException0) {
                    a.e(crzk.a.j(), "TIMEOUT. Asynchronous GetConsent timed out: %s", new gpnd(gpnc.a, timeoutException0.getMessage()), timeoutException0);
                    this.h(new Status(15, "TIMEOUT. Asynchronous GetConsent timed out."), long0, s2, ((hfys)hftp1.N_build()));
                    return;
                }
                if(hhcr1 != hhcr.c && hhcr1 != hhcr.f) {
                    hhcr hhcr2 = hhcr.b(getConsentInformationResponse1.a.a);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hfys hfys3 = (hfys)hftp1.b_message;
                    hfys3.g = hhcr2.a();
                    this.k(s2, long0, ((hfys)hftp1.N_build()));
                    GetConsentInformationResponse getConsentInformationResponse2 = new GetConsentInformationResponse();
                    getConsentInformationResponse2.a = getConsentInformationResponse1.a;
                    getConsentInformationResponse2.b = getConsentInformationResponse1.b;
                    getConsentInformationResponse2.c = getConsentInformationResponse1.c;
                    getConsentInformationResponse2.d = getConsentInformationResponse1.d;
                    getConsentInformationResponse2.e = getConsentInformationResponse1.e;
                    getConsentInformationResponse2.f = getConsentInformationResponse1.f;
                    getConsentInformationResponse2.c = (long)((hfys)hftp1.b_message).h;
                    if(hvjq.f()) {
                        GetConsentInformationResponse getConsentInformationResponse3 = new GetConsentInformationResponse();
                        getConsentInformationResponse3.a = getConsentInformationResponse2.a;
                        getConsentInformationResponse3.b = getConsentInformationResponse2.b;
                        getConsentInformationResponse3.c = getConsentInformationResponse2.c;
                        getConsentInformationResponse3.d = getConsentInformationResponse2.d;
                        getConsentInformationResponse3.e = getConsentInformationResponse2.e;
                        getConsentInformationResponse3.f = getConsentInformationResponse2.f;
                        getConsentInformationResponse3.f = (int)3;
                        getConsentInformationResponse2 = getConsentInformationResponse3;
                    }
                    this.b(getConsentInformationResponse2, true);
                    return;
                }
                ConsentStatus consentStatus1 = new ConsentStatus();
                crwp.a(hhcr1.a(), consentStatus1);
                GetConsentInformationResponse getConsentInformationResponse4 = new GetConsentInformationResponse();
                getConsentInformationResponse4.a = consentStatus1;
                getConsentInformationResponse4.b = getConsentInformationResponse1.b;
                getConsentInformationResponse4.c = (long)((hfys)hftp1.b_message).h;
                if(hvjq.f()) {
                    getConsentInformationResponse4.f = (int)3;
                }
                this.b(getConsentInformationResponse4, false);
                return;
            }
            ConsentStatus consentStatus2 = new ConsentStatus();
            crwp.a(hhcr1.a(), consentStatus2);
            GetConsentInformationResponse getConsentInformationResponse5 = new GetConsentInformationResponse();
            getConsentInformationResponse5.a = consentStatus2;
            getConsentInformationResponse5.d = getConsentInformationRequest0.c;
            getConsentInformationResponse5.e = getConsentInformationRequest0.d;
            getConsentInformationResponse5.c = (long)((hfys)hftp1.b_message).h;
            if(hvjq.f()) {
                getConsentInformationResponse5.f = (int)1;
            }
            bboh0.g(cslm.h()).X("Consent status returned from cache <%d, %s>: %s", long0, s2, hhcr1);
            this.b(getConsentInformationResponse5, z);
            return;
        }
        ((ggtj)bboh0.j()).x("MDP_INVALID_ARGUMENT. Cannot find matching carrier.");
        this.j(new Status(27000, "MDP_INVALID_ARGUMENT. Cannot find matching carrier."));
    }

    private final void g(String s, Long long0, hfys hfys0, iapl iapl0) {
        a.e(crzk.a.j(), "StatusException while getting consent information: %s", new gpnd(gpnc.a, iapl0.getMessage()), iapl0);
        this.h(crxw.a(iapl0), long0, s, hfys0);
    }

    private final void h(Status status0, Long long0, String s, hfys hfys0) {
        if(!hvjq.f() && !hvje.i()) {
            this.j(status0);
            return;
        }
        crvw crvw0 = crvw.c();
        ConsentAgreementText consentAgreementText0 = crvw0.d(long0);
        if(consentAgreementText0 == null) {
            this.j(status0);
            return;
        }
        hhcr hhcr0 = hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g);
        if(hhcr0 == hhcr.e) {
            crvx crvx0 = crvw0.d;
            crwa crwa0 = crvx0.a(long0);
            if(crwa0 == null) {
                hhcr0 = null;
            }
            else if(crvx0.f(long0) != null) {
                hfyr hfyr0 = crwa0.b();
                if(hfyr0 == null) {
                    hhcr0 = null;
                }
                else {
                    hhcr0 = hhcr.b(hfyr0.d) == null ? hhcr.k : hhcr.b(hfyr0.d);
                }
            }
            else {
                hhcr0 = null;
            }
            if(hhcr0 == null) {
                this.j(status0);
                return;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfys0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfys0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfys hfys1 = (hfys)hftp0.b_message;
            hfys1.g = hhcr0.a();
            this.k(s, long0, ((hfys)hftp0.N_build()));
        }
        GetConsentInformationResponse getConsentInformationResponse0 = new GetConsentInformationResponse();
        getConsentInformationResponse0.b = consentAgreementText0;
        getConsentInformationResponse0.c = (long)hfys0.h;
        ConsentStatus consentStatus0 = new ConsentStatus();
        crwp.a(hhcr0.a(), consentStatus0);
        getConsentInformationResponse0.a = consentStatus0;
        getConsentInformationResponse0.d = this.c.c;
        getConsentInformationResponse0.e = this.c.d;
        getConsentInformationResponse0.f = (int)2;
        this.c(getConsentInformationResponse0, hhcr0 != hhcr.c && hhcr0 != hhcr.f, status0);
    }

    private final boolean i(Long long0) {
        if(Long.compare(hvjt.b(), 0L) <= 0) {
            return false;
        }
        if(!this.f.c.equals("CLIENT_MdpUx")) {
            return false;
        }
        return hvjq.f() || hvje.i() ? crvw.c().d(long0) != null : false;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Long long0;
        String s3;
        String s2;
        Level level0 = cslm.h();
        crzk.a.g(level0).B("Error status: {%s}", status0);
        String s = this.f == null ? "CLIENT_TestInvalid" : this.f.c;
        if(hvkk.f()) {
            this.d().o(this.c.e, hhct.s, ((long)status0.i), s, (this.c == null ? null : this.c.a), (this.c == null ? null : this.c.c), (this.c == null ? null : this.c.d));
        }
        else {
            crxn crxn0 = this.d();
            long v = (long)status0.i;
            GetConsentInformationRequest getConsentInformationRequest0 = this.c;
            hhct hhct0 = hhct.s;
            String s1 = getConsentInformationRequest0 == null ? null : getConsentInformationRequest0.a;
            Integer integer0 = getConsentInformationRequest0 == null ? null : getConsentInformationRequest0.c;
            if(getConsentInformationRequest0 == null) {
                s2 = s1;
                s3 = s;
                long0 = null;
            }
            else {
                s2 = s1;
                s3 = s;
                long0 = getConsentInformationRequest0.d;
            }
            crxn0.n(hhct0, v, s3, s2, integer0, long0);
        }
        try {
            this.b.f(status0, null, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ggtj ggtj0 = (ggtj)((ggtj)crzk.a.i()).s(remoteException0);
            gpnd gpnd0 = new gpnd(gpnc.a, status0);
            ggtj0.R("Unable to complete API callback for failure: %s, status: {%s}", new gpnd(gpnc.a, remoteException0.getMessage()), gpnd0);
        }
    }

    private final void k(String s, Long long0, hfys hfys0) {
        boolean z = crvw.c().w(long0, s, hfys0);
        crxn crxn0 = crxn.c();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giyo)hftv0).b = 5;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giyo)hftp0.b_message).c = z;
        giyo giyo0 = (giyo)hftp0.N_build();
        Integer integer0 = this.c.c;
        crxn0.j(giyo0, (this.f == null ? "CLIENT_TestInvalid" : this.f.c), Integer.valueOf((integer0 == null ? 0 : ((int)integer0))));
    }
}

