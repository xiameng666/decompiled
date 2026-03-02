import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import com.google.android.gms.mobiledataplan.service.operations.GetCarrierPlanIdOperation.1;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

public final class crzj extends cjtm {
    public static final bboh a;
    public static final Long b;
    public final MdpCarrierPlanIdRequest c;
    public volatile Context d;
    public gspd e;
    public String f;
    public String g;
    public crwl h;
    public final gmcg i;
    private final crxi j;
    private final Object n;
    private final Object o;
    private crxn p;
    private boolean q;

    static {
        crzj.a = bboh.b("MobileDataPlan", bbcu.ck);
        crzj.b = (long)-1L;
    }

    public crzj(crxi crxi0, MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0, azug azug0) {
        super(0x9E, "GetCarrierPlanId", azug0);
        this.n = new Object();
        this.o = new Object();
        this.j = crxi0;
        if(mdpCarrierPlanIdRequest0 != null && mdpCarrierPlanIdRequest0.d == null) {
            cruw cruw0 = new cruw(mdpCarrierPlanIdRequest0);
            cruw0.a.d = crxn.b();
            mdpCarrierPlanIdRequest0 = cruw0.a;
        }
        if(mdpCarrierPlanIdRequest0 != null && mdpCarrierPlanIdRequest0.c == null) {
            cruw cruw1 = new cruw(mdpCarrierPlanIdRequest0);
            cruw1.b(Integer.valueOf(0));
            mdpCarrierPlanIdRequest0 = cruw1.a;
        }
        this.c = mdpCarrierPlanIdRequest0;
        this.i = new bblp(1, 10);
    }

    public final Status b(String s, clcq clcq0, String s1, String s2) {
        crzh crzh0;
        int v = s2 == null ? 500 : clcq0.a();
        String s3 = String.format("GetCpid MDP_SERVER_CARRIER_FAILURE. Http error from carrier: %s Error: %s", s1, s);
        try {
            if(s2 == null) {
                this.i(crzj.h(v), s1);
                return new Status(27007, s3);
            }
            int v1 = 2;
            JSONObject jSONObject0 = new JSONObject(s2);
            if(hvkk.i() && jSONObject0.has("error")) {
                if(jSONObject0.has("cause")) {
                    int v2 = jSONObject0.getInt("cause");
                    crzi[] arr_crzi = crzi.values();
                    for(int v3 = 0; v3 < arr_crzi.length; ++v3) {
                        crzi crzi0 = arr_crzi[v3];
                        if(crzi0.l == v2) {
                            v1 = crzi0.m;
                            break;
                        }
                    }
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizd.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gizd)hftv0).b = v;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizd gizd0 = (gizd)hftp0.b_message;
                gizd0.c = hbxy.a(v1);
                gizd gizd1 = (gizd)hftp0.N_build();
                crzh0 = new crzh(jSONObject0.getString("error"), gizd1);
            }
            else {
                if(jSONObject0.has("cause")) {
                    switch(jSONObject0.getString("cause")) {
                        case "ACCOUNT_SUSPENDED": {
                            v1 = 19;
                            break;
                        }
                        case "BACKEND_FAILURE": {
                            v1 = 8;
                            break;
                        }
                        case "BAD_CPID": {
                            v1 = 7;
                            break;
                        }
                        case "BAD_REQUEST": {
                            v1 = 6;
                            break;
                        }
                        case "DUPLICATE_TRANSACTION": {
                            v1 = 5;
                            break;
                        }
                        case "ERROR_CAUSE_UNSPECIFIED": {
                            break;
                        }
                        case "INCOMPATIBLE_PLAN": {
                            v1 = 4;
                            break;
                        }
                        case "INELIGIBLE_FOR_SERVICE": {
                            v1 = 16;
                            break;
                        }
                        case "INVALID_IMSI": {
                            v1 = 15;
                            break;
                        }
                        case "INVALID_NUMBER": {
                            v1 = 3;
                            break;
                        }
                        case "PAYMENT_MISSING": {
                            v1 = 14;
                            break;
                        }
                        case "REQUEST_QUEUED": {
                            v1 = 9;
                            break;
                        }
                        case "SERVICE_NOT_SUBSCRIBED": {
                            v1 = 18;
                            break;
                        }
                        case "SERVICE_UNAVAILABLE": {
                            v1 = 17;
                            break;
                        }
                        case "SIM_RELOAD_REQUIRED": {
                            v1 = 12;
                            break;
                        }
                        case "TOO_MANY_REQUESTS": {
                            v1 = 13;
                            break;
                        }
                        case "UNRECOGNIZED": {
                            v1 = 1;
                            break;
                        }
                        case "USER_OPT_OUT": {
                            v1 = 11;
                            break;
                        }
                        case "USER_ROAMING": {
                            v1 = 10;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizd.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((gizd)hftv1).b = v;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizd gizd2 = (gizd)hftp1.b_message;
                gizd2.c = hbxy.a(v1);
                gizd gizd3 = (gizd)hftp1.N_build();
                crzh0 = new crzh(jSONObject0.getString("errorMessage"), gizd3);
            }
            this.i(crzh0, s1);
            return new Status(27007, s3);
        }
        catch(IllegalArgumentException | JSONException exception0) {
            if(hvkk.i()) {
                ((ggtj)((ggtj)crzj.a.j()).s(exception0)).R("Http error response from carrier malformed; url: %s \n Response code: %s", new gpnd(gpnc.a, s1), new gpnd(gpnc.a, v));
            }
            this.i(crzj.h(v), s1);
            return new Status(27007, s3);
        }
    }

    public final void c(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0, boolean z, boolean z1) {
        bboh bboh0 = crzj.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        Long long0 = (long)mdpCarrierPlanIdResponse0.e;
        String s = this.h.c;
        Boolean boolean0 = Boolean.valueOf(hvko.D());
        ggtj0.aa("ClientCpid <%d, %s> is updated for %s. FromCache:%b, CacheUpdated:%b, isCpidManagementEnabled: %b", long0, mdpCarrierPlanIdResponse0.a, s, Boolean.valueOf(z), Boolean.valueOf(z1), boolean0);
        if(hvkk.f()) {
            this.g().v(this.c, mdpCarrierPlanIdResponse0, z, this.h.c);
        }
        else {
            this.g().v(null, mdpCarrierPlanIdResponse0, z, this.h.c);
        }
        if(hvjk.a.e().p()) {
            MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0 = this.c;
            if(!mdpCarrierPlanIdRequest0.b().isEmpty()) {
                mdpCarrierPlanIdRequest0.b();
                mdpCarrierPlanIdResponse0 = this.e(mdpCarrierPlanIdResponse0, mdpCarrierPlanIdRequest0.b());
            }
            else if(!hvjk.f().isEmpty()) {
                hvjk.f();
                mdpCarrierPlanIdResponse0 = this.e(mdpCarrierPlanIdResponse0, hvjk.f());
            }
        }
        if(this.l()) {
            ((ggtj)bboh0.j()).B("The operation has completed before. Drop the success callback for %s.", this.h.c);
            return;
        }
        this.k(true);
        try {
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dm);
            this.j.a(Status.b, mdpCarrierPlanIdResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzj.a.i()).s(remoteException0)).R("Unable to complete api success callback for %s with exception: %s", this.h.c, new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }

    public final void d(String s, Network network0) {
        Level level0 = cslm.h();
        crzj.a.g(level0).R("enableUnsMigrationForCpidOperation = true, for url: %s, over network: %s", s, network0);
        clcf clcf0 = clcg.e(s, clbk.a, clbj.a);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        clbs clbs0 = clbv.a(this.d);
        crzf crzf0 = new crzf(this, byteArrayOutputStream0, byteArrayOutputStream0, s);
        int v = this.d.getApplicationInfo().uid;
        clcj clcj0 = clbs0.e(clcf0, crzf0, this.i, v, 0x6100);
        clcj0.n("GET");
        if(network0 != null) {
            clcj0.k(network0);
        }
        clcn clcn0 = clcj0.e();
        try {
            clcp clcp0 = (clcp)clcn0.a().get(hvlb.b(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            a.ae(crzj.a.j(), "Error occurred while fetching CPID through UNS.", exception0);
        }
    }

    private final MdpCarrierPlanIdResponse e(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0, String s) {
        String s1 = mdpCarrierPlanIdResponse0.c;
        String s2 = mdpCarrierPlanIdResponse0.d;
        long v = mdpCarrierPlanIdResponse0.e;
        String s3 = mdpCarrierPlanIdResponse0.f;
        int v1 = mdpCarrierPlanIdResponse0.g;
        CarrierSupportInfo carrierSupportInfo0 = mdpCarrierPlanIdResponse0.h;
        Integer integer0 = mdpCarrierPlanIdResponse0.i;
        Long long0 = mdpCarrierPlanIdResponse0.j;
        return new MdpCarrierPlanIdResponse(crwm.c().d(s, this.c.a), mdpCarrierPlanIdResponse0.b, s1, s2, v, s3, v1, carrierSupportInfo0, integer0, long0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Status status0;
        if(hvko.b() > 0L && hvko.h() > 0L) {
            gmde.d(hvko.h(), TimeUnit.MILLISECONDS);
        }
        this.d = context0;
        bboh bboh0 = crzj.a;
        bboh0.g(cslm.h()).B("GCM Token: %s", crxd.a().c(context0));
        ggtj ggtj0 = bboh0.g(cslm.h());
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0 = this.c;
        ggtj0.B("Exec GetCpid. req:{%s}", mdpCarrierPlanIdRequest0);
        new ccmp().a(bbdg.pP);
        if(hvlb.e()) {
            mdpCarrierPlanIdRequest0.a();
            if(mdpCarrierPlanIdRequest0.a().length() > 0) {
                bboh0.g(cslm.h()).B("Found iccid: %s in MdpCarrierPlanIdRequest", mdpCarrierPlanIdRequest0.a());
                this.g = mdpCarrierPlanIdRequest0.a();
            }
            else {
                this.g = csli.g(context0);
            }
        }
        else {
            this.g = csli.g(context0);
        }
        this.k(false);
        if(hvjk.l()) {
            bboh0.g(cslm.h()).x("MDP_MODULE_DISABLED. Likely because the carrier is not supported.");
            this.j(new Status(27101, "MDP_MODULE_DISABLED. Likely because the carrier is not supported."));
            return;
        }
        if(mdpCarrierPlanIdRequest0 != null && !mdpCarrierPlanIdRequest0.a.isEmpty()) {
            this.h = crwm.c().b(mdpCarrierPlanIdRequest0.a);
            hvko.D();
            crxn crxn0 = this.g();
            String s = "CLIENT_TestInvalid";
            gizg gizg0 = crxn0.D(2, "GTAF_Server", (this.h == null ? "CLIENT_TestInvalid" : this.h.c));
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gizg0));
            long v = mdpCarrierPlanIdRequest0.d == null ? 0L : ((long)mdpCarrierPlanIdRequest0.d);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).t = v;
            if(hvkk.h()) {
                crxn.T(hftp0, mdpCarrierPlanIdRequest0.b);
            }
            if(hvlb.d()) {
                crxn0.e(((gizg)hftp0.N_build()), hhct.c, mdpCarrierPlanIdRequest0.c);
            }
            crxn0.e(((gizg)hftp0.N_build()), hhct.b, mdpCarrierPlanIdRequest0.c);
            if(this.h != null) {
                hvko hvko0 = hvko.a;
                if(hvko0.q().J() && csli.c(context0) == null) {
                    this.j(new Status(27054, "MDP_MCC_MNC_UNSUPPORTED. No supported MCC/MNC by GTAF in the device SIMs."));
                    return;
                }
                if(hvko0.q().I()) {
                    crwl crwl0 = this.h;
                    String s1 = csli.k(context0);
                    switch(crwl0.a) {
                        case "AIzaSyCChP9IaeaDS_LLGBI0P9CDQwTzCxn1kp8": 
                        case "AIzaSyCqrNxCAJrrk_NQqIUp1-baqW05d3JYeOc": {
                            if(!hvko0.q().w().b.contains(s1)) {
                                this.j(new Status(0x69AF, "MDP_MCC_MNC_UNSUPPORTED_BY_CLIENT. MCC/MNC of active SIM is not supported by client"));
                                return;
                            }
                        }
                    }
                }
                if(hvko.D() && !this.h.a.equals("AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4") && !mdpCarrierPlanIdRequest0.c() && !this.h.a.equals("AIzaSyCTa7aViyHnB3GLIqhL5hQFZGb675SoCIA")) {
                    crvw crvw0 = crvw.c();
                    if(!TextUtils.isEmpty(this.g)) {
                        Long long0 = crvw0.p(this.g);
                        gspd gspd0 = crvw0.f(long0);
                        if(gspd0 != null) {
                            Long long1 = crvw0.q(this.g);
                            if(long1 != null) {
                                long v1 = ((long)long1) - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                                if(!hvjq.h() || v1 >= 0L) {
                                    String s2 = crvw0.s(this.g);
                                    if(!TextUtils.isEmpty(s2)) {
                                        String s3 = mdpCarrierPlanIdRequest0.b == null || mdpCarrierPlanIdRequest0.b.size() <= 0 ? null : mdpCarrierPlanIdRequest0.b.getString("cpid_to_be_invalidated");
                                        if(TextUtils.isEmpty(s2) || !s2.equals(s3)) {
                                            goto label_71;
                                        }
                                        this.g().O(hhct.bB, 19, "Local_Cache", this.h.c);
                                        if(!crvw.c().y(this.g, long0, null, 0L)) {
                                            ((ggtj)bboh0.j()).x("Invalidate carrier cpid: cache update failed!");
                                            goto label_74;
                                        label_71:
                                            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0 = new MdpCarrierPlanIdResponse(crwm.c().d(s2, mdpCarrierPlanIdRequest0.a), v1, gspd0.d, gspd0.e, ((long)long0), s2, 1, cryi.e((gspd0.f == null ? gsnm.a : gspd0.f)), null, null);
                                            this.c(new MdpCarrierPlanIdResponse(mdpCarrierPlanIdResponse0.a, mdpCarrierPlanIdResponse0.b, mdpCarrierPlanIdResponse0.c, mdpCarrierPlanIdResponse0.d, mdpCarrierPlanIdResponse0.e, mdpCarrierPlanIdResponse0.f, mdpCarrierPlanIdResponse0.g, mdpCarrierPlanIdResponse0.h, mdpCarrierPlanIdRequest0.c, mdpCarrierPlanIdRequest0.d), true, false);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                label_74:
                    bboh0.g(cslm.h()).x("No cached CPID found, retrieving from GTAF");
                }
                bboh0.g(cslm.h()).x("Getting CPID endpoints from GTAF and CPID from the Carrier");
                if(hvko.B() && !csli.t(this.d)) {
                    ((ggtj)bboh0.j()).x("MDP_NO_NETWORK: Need a valid network connection.");
                    this.j(new Status(27018, "MDP_NO_NETWORK: Need a valid network connection."));
                    return;
                }
                cryd cryd0 = new cryd(this.d, hvko.u(), mdpCarrierPlanIdRequest0.a, ((int)hvko.f()));
                try {
                    this.e = hvlb.f() ? cryd0.g(mdpCarrierPlanIdRequest0.c, mdpCarrierPlanIdRequest0.d, this.h.c, ckjo.b) : cryd0.f(mdpCarrierPlanIdRequest0.c, mdpCarrierPlanIdRequest0.d, this.h.c);
                    goto label_100;
                }
                catch(acse acse0) {
                    a.e(crzj.a.j(), "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure with message: %s", new gpnd(gpnc.a, acse0.getMessage()), acse0);
                    status0 = new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure.");
                }
                catch(iapl iapl0) {
                    iapk iapk0 = iapl0.a;
                    if(iapk0 == null) {
                    label_96:
                        Level level0 = cslm.h();
                        ((ggtj)crzj.a.g(level0).s(iapl0)).B("StatusException while getting CarrierPlanId with message: %s", new gpnd(gpnc.a, iapl0.getMessage()));
                        status0 = crxw.a(iapl0);
                    }
                    else {
                        if(iapk0.t == iaph.f) {
                            status0 = new Status(27001, "MDP_UNSUPPORTED_CARRIER. " + iapk0.toString());
                            goto label_101;
                        }
                        goto label_96;
                    }
                }
                goto label_101;
            label_100:
                status0 = null;
            label_101:
                if(hvjq.e()) {
                    String s4 = csli.k(this.d);
                    if(!TextUtils.isEmpty(s4)) {
                        crvw.c().D(this.g, s4.substring(0, 3), s4.substring(3));
                    }
                }
                if(status0 == null) {
                    if(!hvkk.j()) {
                        goto label_115;
                    }
                    this.g().B(this.e, this.h.c);
                    goto label_115;
                }
                if(hvkk.j()) {
                    crxn.c().A(status0.i, this.h.c, this.c.c, this.c.d);
                }
                if(hvjq.a.c().v() && (status0.i != 27001 && status0.i != 27009 && (status0.i != 27012 && status0.i != 27017 && status0.i != 27038))) {
                    gspd gspd1 = crvw.c().g(this.g);
                    if(gspd1 != null && gspd1.b.size() > 0) {
                        this.e = gspd1;
                    label_115:
                        if(this.e != null && this.e.b.size() != 0) {
                            if(hvjq.j()) {
                                boolean z = crvw.c().C(this.g, this.e);
                                crxn crxn1 = crxn.c();
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp1.b_message;
                                ((giyo)hftv0).b = 8;
                                if(!hftv0.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((giyo)hftp1.b_message).c = z;
                                giyo giyo0 = (giyo)hftp1.N_build();
                                crwl crwl1 = this.h;
                                if(crwl1 != null) {
                                    s = crwl1.c;
                                }
                                Integer integer0 = this.c.c;
                                crxn1.j(giyo0, s, Integer.valueOf((integer0 == null ? 0 : ((int)integer0))));
                            }
                            String s5 = (String)this.e.b.get(0);
                            if(hvlb.d()) {
                                gfsx gfsx0 = gfsx.m(csli.f(this.g, this.d));
                                s5 = Uri.parse(s5).buildUpon().appendQueryParameter("hashedImsi", ((String)((gftm)gfsx0).a)).build().toString();
                            }
                            Context context1 = this.d;
                            Level level1 = cslm.h();
                            csli.a.g(level1).Z("ConnectedOnWifi ? %s cellularAvailable ? %s hasSim ? %s isTesting ? %s cpidv2Enabled ? %s", Boolean.valueOf(csli.w(context1)), Boolean.valueOf(csli.s(context1)), Boolean.valueOf(csli.q(context1)), cslm.d(), Boolean.valueOf(hvlb.d()));
                            if(!hvlb.d() && hvko.B() && !csli.x(context1) && csli.w(context1)) {
                                ConnectivityManager connectivityManager0 = (ConnectivityManager)this.d.getSystemService("connectivity");
                                NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder();
                                networkRequest$Builder0.addTransportType(0).addCapability(12);
                                GetCarrierPlanIdOperation.1 getCarrierPlanIdOperation$10 = new GetCarrierPlanIdOperation.1(this, s5, connectivityManager0);
                                try {
                                    connectivityManager0.requestNetwork(networkRequest$Builder0.build(), getCarrierPlanIdOperation$10, ((int)TimeUnit.SECONDS.toMillis(hvko.e())));
                                }
                                catch(SecurityException securityException0) {
                                    a.ae(crzj.a.j(), "Permission denied while querying CPID endpoint", securityException0);
                                    this.j(new Status(27047, "MDP_NOT_ON_CELLULAR_PERMISSION_DENIED: Permission denied when attempting to query CPID endpoint"));
                                }
                                return;
                            }
                            this.d(s5, null);
                            return;
                        }
                        ((ggtj)crzj.a.j()).x("MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT. Carrier endpoints are empty.");
                        this.j(new Status(27006, "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT. Carrier endpoints are empty."));
                        return;
                    }
                    Level level2 = cslm.h();
                    crzj.a.g(level2).x("Cache either did not have an entry or had zero endpoint URLs.");
                    this.j(status0);
                    return;
                }
                this.j(status0);
                return;
            }
            ((ggtj)bboh0.j()).x("MDP_INVALID_API_KEY. Need an authorized API key.");
            this.j(new Status(27004, "MDP_INVALID_API_KEY. Need an authorized API key."));
            return;
        }
        ((ggtj)bboh0.i()).x("Invalid arguments. Need a non-empty API key.");
        this.j(new Status(27004, "MDP_INVALID_API_KEY. Need a non-empty API key."));
    }

    private final crxn g() {
        synchronized(this.n) {
            if(this.p == null) {
                this.p = new crxn(this.d);
            }
        }
        return this.p;
    }

    private static crzh h(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gizd)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizd gizd0 = (gizd)hftp0.b_message;
        gizd0.c = hbxy.a(2);
        return new crzh(null, ((gizd)hftp0.N_build()));
    }

    private final void i(crzh crzh0, String s) {
        String s3;
        String s1;
        int v;
        if(hvkk.i()) {
            ggtj ggtj0 = (ggtj)crzj.a.j();
            gpnc gpnc0 = gpnc.a;
            gpnd gpnd0 = new gpnd(gpnc0, s);
            gpnd gpnd1 = new gpnd(gpnc0, ((int)crzh0.b.b));
            switch(crzh0.b.c) {
                case 0: {
                    v = 2;
                    break;
                }
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 4;
                    break;
                }
                case 3: {
                    v = 5;
                    break;
                }
                case 4: {
                    v = 6;
                    break;
                }
                case 5: {
                    v = 7;
                    break;
                }
                case 6: {
                    v = 8;
                    break;
                }
                case 7: {
                    v = 9;
                    break;
                }
                case 8: {
                    v = 10;
                    break;
                }
                case 9: {
                    v = 11;
                    break;
                }
                case 10: {
                    v = 12;
                    break;
                }
                case 11: {
                    v = 13;
                    break;
                }
                case 12: {
                    v = 14;
                    break;
                }
                case 13: {
                    v = 15;
                    break;
                }
                case 14: {
                    v = 16;
                    break;
                }
                case 15: {
                    v = 17;
                    break;
                }
                case 16: {
                    v = 18;
                    break;
                }
                case 17: {
                    v = 19;
                    break;
                }
                default: {
                    v = 0;
                }
            }
            if(v == 0) {
                s1 = "UNRECOGNIZED";
            }
            else {
                switch(v) {
                    case 2: {
                        s1 = "ERROR_CAUSE_UNSPECIFIED";
                        break;
                    }
                    case 3: {
                        s1 = "INVALID_NUMBER";
                        break;
                    }
                    case 4: {
                        s1 = "INCOMPATIBLE_PLAN";
                        break;
                    }
                    case 5: {
                        s1 = "DUPLICATE_TRANSACTION";
                        break;
                    }
                    case 6: {
                        s1 = "BAD_REQUEST";
                        break;
                    }
                    case 7: {
                        s1 = "BAD_CPID";
                        break;
                    }
                    case 8: {
                        s1 = "BACKEND_FAILURE";
                        break;
                    }
                    case 9: {
                        s1 = "REQUEST_QUEUED";
                        break;
                    }
                    case 10: {
                        s1 = "USER_ROAMING";
                        break;
                    }
                    case 11: {
                        s1 = "USER_OPT_OUT";
                        break;
                    }
                    case 12: {
                        s1 = "SIM_RELOAD_REQUIRED";
                        break;
                    }
                    case 13: {
                        s1 = "TOO_MANY_REQUESTS";
                        break;
                    }
                    case 14: {
                        s1 = "PAYMENT_MISSING";
                        break;
                    }
                    case 15: {
                        s1 = "INVALID_IMSI";
                        break;
                    }
                    case 16: {
                        s1 = "INELIGIBLE_FOR_SERVICE";
                        break;
                    }
                    case 17: {
                        s1 = "SERVICE_UNAVAILABLE";
                        break;
                    }
                    case 18: {
                        s1 = "SERVICE_NOT_SUBSCRIBED";
                        break;
                    }
                    default: {
                        s1 = "ACCOUNT_SUSPENDED";
                    }
                }
            }
            ggtj0.Y("GetCpid MDP_SERVER_CARRIER_HTTP_FAILURE. Http error from carrier; url: %s \n Response code: %s \n error cause: %s \n error message: %s", gpnd0, gpnd1, new gpnd(gpnc0, s1), new gpnd(gpnc0, crzh0.a));
        }
        crxn crxn0 = this.g();
        gizd gizd0 = crzh0.b;
        Bundle bundle0 = this.c.b;
        String s2 = this.f;
        Integer integer0 = this.c == null ? null : this.c.c;
        Long long0 = this.c == null ? null : this.c.d;
        gizg gizg0 = crxn0.D(3, "Error", (this.h == null ? "CLIENT_TestInvalid" : this.h.c));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).C = gizd0;
        ((gizg)hftp0.b_message).b |= 0x40000;
        if(hvlb.d()) {
            s3 = s2;
            crxn0.U(hftp0, bundle0, hhct.g, 27057L, s3, integer0, long0);
        }
        else {
            s3 = s2;
        }
        crxn0.U(hftp0, bundle0, hhct.f, 27057L, s3, integer0, long0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        String s = this.h == null ? "CLIENT_TestInvalid" : this.h.c;
        bboh bboh0 = crzj.a;
        bboh0.g(cslm.h()).R("GetCpid failed for %s. Error status:{%s}", s, status0);
        synchronized(this.o) {
            if(this.l()) {
                ((ggtj)bboh0.j()).R("The operation has completed before. Drop the failure callback for %s: {%s}", this.h.c, status0);
                return;
            }
            this.k(true);
        }
        if(hvkk.f()) {
            this.g().o(this.c.b, hhct.f, ((long)status0.i), s, this.f, (this.c == null ? null : this.c.c), (this.c == null ? null : this.c.d));
        }
        else {
            this.g().n(hhct.f, ((long)status0.i), s, this.f, (this.c == null ? null : this.c.c), (this.c == null ? null : this.c.d));
        }
        try {
            this.j.a(status0, null, ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            ((ggtj)((ggtj)crzj.a.i()).s(remoteException0)).R("Unable to complete api failure callback for %s with exception %s", this.h.c, new gpnd(gpnc.a, remoteException0.getMessage()));
        }
    }

    private final void k(boolean z) {
        synchronized(this.o) {
            this.q = z;
        }
    }

    private final boolean l() {
        synchronized(this.o) {
        }
        return this.q;
    }
}

