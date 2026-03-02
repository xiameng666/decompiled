import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ParcelUuid;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobilesubscription.serviceconfig.GetAuthResultResponse;
import j..util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bcro implements bcsg, evpz {
    public static final baun a;
    private static final boolean b;
    private final hofs c;
    private final bbxx d;
    private final bcrd e;
    private final TelephonyManager f;
    private final bcrm g;
    private final atql h;
    private csml i;
    private CountDownLatch j;
    private long k;
    private final bcsi l;

    static {
        bcro.a = bcrh.a("carrierId verifier");
        bcro.b = Build.TYPE.equals("userdebug");
    }

    public bcro(hofs hofs0, bbxx bbxx0, bcrd bcrd0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)AppContextProvider.a().getSystemService("phone");
        bcrm bcrm0 = bcrm.t(bcrd0);
        atql atql0 = new atql(AppContextProvider.a().getApplicationContext());
        bcqx bcqx0 = bcqx.a(AppContextProvider.a());
        super();
        this.k = 0L;
        this.c = hofs0;
        this.d = bbxx0;
        this.e = bcrd0;
        this.f = telephonyManager0;
        this.g = bcrm0;
        this.h = atql0;
        this.l = new bcsi(bcqx0);
    }

    @Override  // bcsg
    public final hofs a() {
        if(!this.g.u()) {
            this.l.c(this.e, this.c, gmfz.x, gmfx.ae, "carrier id invoked but not supported");
            this.h(gmfx.ae, "carrier id invoked but not supported");
            hobo hobo0 = bcro.i(3);
            return this.d.j(this.e, this.c, hobo0);
        }
        int v = (int)hrfs.a.e().d();
        return this.f(this.c, v);
    }

    @Override  // bcsg
    public final hofs b() {
        return this.c;
    }

    @Override  // bcsg
    public final String c() {
        hoer hoer0 = this.c.c == 4 ? ((hoer)this.c.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        return (hobj0.e == null ? hobk.a : hobj0.e).b;
    }

    @Override  // bcsg
    public final void d() {
        this.k = System.currentTimeMillis();
        if(hrel.c()) {
            this.l.e(this.e, 4);
        }
    }

    final String e(Integer integer0, hobh hobh0) {
        gmfx gmfx0;
        if(hrfm.e() && hobh0.b.startsWith(hrde.d())) {
            try {
                return this.g(integer0);
            }
            catch(bcrc bcrc0) {
                if(hrfm.g()) {
                    this.l.b(this.e, gmfz.bl, bcrc0.a, bcrc0.getMessage());
                }
                throw bcrc0;
            }
        }
        if(hrde.f()) {
            baun baun0 = bcro.a;
            baun0.d("Calling Carrier Auth API", new Object[0]);
            EAPAKARequest eAPAKARequest0 = new EAPAKARequest(hobh0.b, ((int)hobh0.c), ((int)hobh0.d), integer0, 0);
            this.j = new CountDownLatch(1);
            azzc azzc0 = new azzc();
            azzc0.a = new atqk(this.h, eAPAKARequest0);
            azzc0.c = new Feature[]{bbvm.c};
            azzc0.d = 11601;
            azzd azzd0 = azzc0.a();
            evql evql0 = this.h.iG(azzd0);
            evql0.z(this);
            try {
                this.j.await(60000L, TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                this.l.c(this.e, this.c, gmfz.x, gmfx.aE, "carrier id interrupted exception");
                this.h(gmfx.aE, "carrier id interrupted exception");
                throw new bcrc("CarrierAuth API was interrupted.", gmfx.aE, false, interruptedException0);
            }
            if(this.j.getCount() <= 0L) {
                if(evql0.n()) {
                    String s = ((EAPAKAResponse)evql0.j()).a;
                    baun0.d("Successfully call CarrierAuth API. RESPONSE: %s", new Object[]{s});
                    return s;
                }
                Exception exception0 = evql0.i();
                baun0.g("Failed to challenge via CarrierAuth API", exception0, new Object[0]);
                if((exception0 instanceof NoSuchMethodException)) {
                    gmfx0 = gmfx.y;
                }
                else if((exception0 instanceof IllegalAccessException)) {
                    gmfx0 = gmfx.z;
                }
                else if((exception0 instanceof InvocationTargetException)) {
                    gmfx0 = gmfx.x;
                }
                else {
                    gmfx0 = gmfx.a;
                }
                throw new bcrc("No API available for getting ISIM challenge response", gmfx0, false);
            }
            this.l.c(this.e, this.c, gmfz.x, gmfx.ai, "carrier id api timeout");
            this.h(gmfx.ai, "carrier id api timeout");
            throw new bcrc("CarrierAuth API timeout.", gmfx.ai, false);
        }
        bcro.a.d("Not calling Carrier Auth API", new Object[0]);
        return integer0 == null ? this.f.getIccAuthentication(hobh0.d, hobh0.c, hobh0.b) : this.f.createForSubscriptionId(integer0.intValue()).getIccAuthentication(hobh0.d, hobh0.c, hobh0.b);
    }

    private final hofs f(hofs hofs0, int v) {
        String s;
        int v1;
        hofs hofs1 = hofs0;
        baun baun0 = bcro.a;
        baun0.j("do verification", new Object[0]);
        if(v <= 0) {
            this.l.c(this.e, this.c, gmfz.x, gmfx.af, "max attempt exceeded");
            this.h(gmfx.af, "max attempt exceeded");
            hobo hobo0 = bcro.i(4);
            return this.d.j(this.e, hofs1, hobo0);
        }
        if((hofs1.e == null ? hoft.a : hofs1.e).b == 1) {
            try {
                hoer hoer0 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
                hobh hobh0 = hobj0.c == 4 ? ((hobh)hobj0.d) : hobh.a;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hobh0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hobh0));
                ProtoLiteMessage hftv0 = hftp0.b_message;
                if(((hobh)hftv0).d == 0) {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hobh)hftp0.b_message).d = 2;
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hofs1).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)hofs1));
                    hoer hoer1 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hoer1).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)hoer1));
                    hoer hoer2 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                    hobj hobj1 = hoer2.c == null ? hobj.a : hoer2.c;
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hobj1).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)hobj1));
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hobj hobj2 = (hobj)hftp3.b_message;
                    hobh hobh1 = (hobh)hftp0.N_build();
                    hobh1.getClass();
                    hobj2.d = hobh1;
                    hobj2.c = 4;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hoer hoer3 = (hoer)hftp2.b_message;
                    hobj hobj3 = (hobj)hftp3.N_build();
                    hobj3.getClass();
                    hoer3.c = hobj3;
                    hoer3.b |= 1;
                    if(!((hofq)hftp1).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((hofq)hftp1))).ensureMutable();
                    }
                    hofs hofs2 = (hofs)((hofq)hftp1).b_message;
                    hoer hoer4 = (hoer)hftp2.N_build();
                    hoer4.getClass();
                    hofs2.d = hoer4;
                    hofs2.c = 4;
                    hofs1 = (hofs)((ProtoLiteBuilder)(((hofq)hftp1))).N_build();
                }
                hoft hoft0 = hofs1.e == null ? hoft.a : hofs1.e;
                hofa hofa0 = hoft0.b == 1 ? ((hofa)hoft0.c) : hofa.a;
                hfuo hfuo0 = (hofa0.c == null ? hofc.a : hofa0.c).b;
                hobh hobh2 = (hobh)hftp0.N_build();
                if(hrfs.a.e().s()) {
                    try {
                        bcrk bcrk0 = bcrk.b(AppContextProvider.a(), this.e);
                        Context context0 = AppContextProvider.a();
                        v1 = bcrk0.a(hfuo0, this.e, context0);
                    }
                    catch(bcqi bcqi0) {
                        this.l.c(this.e, this.c, gmfz.x, gmfx.ah, bcqi0.getMessage());
                        this.h(gmfx.ah, bcqi0.getMessage());
                        throw new bcrc(bcqi0.getCause(), gmfx.ah);
                    }
                    if(v1 == -1) {
                        baun0.d("Verifying with CarrierId default", new Object[0]);
                        s = this.e(null, hobh2);
                    }
                    else {
                        baun0.d("Verifying with CarrierId for subId", new Object[0]);
                        s = this.e(Integer.valueOf(v1), hobh2);
                    }
                }
                else {
                    s = this.e(null, hobh2);
                }
                if(s == null) {
                    bcsi bcsi0 = this.l;
                    bcrd bcrd0 = this.e;
                    bcsi0.c(bcrd0, this.c, gmfz.x, gmfx.ad, "null isim response");
                    gmfz gmfz0 = gmfz.x;
                    gmfx gmfx0 = gmfx.ad;
                    this.h(gmfx0, "null isim response");
                    if(hrfi.a.e().n() && bcro.b) {
                        bcsi0.b(bcrd0, gmfz0, gmfx0, "Googler with UserDebug with null isim response");
                        Intent intent0 = new Intent("com.google.android.apps.scone.connectivitymonitor.action.BUGREPORT");
                        intent0.setClassName("com.google.android.apps.scone", "com.google.android.apps.scone.connectivitymonitor.CMBroadCastReceiver");
                        intent0.putExtra("com.google.android.apps.scone.connectivitymonitor.extra.APP_NAME", "Constellation");
                        intent0.putExtra("com.google.android.apps.scone.connectivitymonitor.extra.DESCRIPTION", "Null ISIM Response in EAP-AKA Challenge.");
                        intent0.putExtra("com.google.android.apps.scone.connectivitymonitor.extra.EVENT_ID", ParcelUuid.fromString(bcrd0.a));
                        AppContextProvider.a().sendBroadcast(intent0);
                    }
                    throw new bcrc("Got null ISIM response", gmfx0, false);
                }
                bbxx bbxx0 = this.d;
                bcrd bcrd1 = this.e;
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hobi.a).v_newBuilder();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((hobi)hftp5.b_message).b = s;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hobo hobo1 = (hobo)hftp4.b_message;
                hobi hobi0 = (hobi)hftp5.N_build();
                hobi0.getClass();
                hobo1.c = hobi0;
                hobo1.b = 2;
                hofs hofs3 = bbxx0.j(bcrd1, hofs1, ((hobo)hftp4.N_build()));
                bcrg.e();
                if(bcrg.c(hofs3)) {
                    hoer hoer5 = hofs3.c == 4 ? ((hoer)hofs3.d) : hoer.a;
                    hobj hobj4 = hoer5.c == null ? hobj.a : hoer5.c;
                    String s1 = (hobj4.e == null ? hobk.a : hobj4.e).b;
                    hoer hoer6 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
                    hobj hobj5 = hoer6.c == null ? hobj.a : hoer6.c;
                    if(s1.equals((hobj5.e == null ? hobk.a : hobj5.e).b)) {
                        return this.f(hofs3, v - 1);
                    }
                }
                if(hrel.c() && hofs3 != null) {
                    bcrg.e();
                    if(bcrg.d(hofs3)) {
                        this.l.f(bcrd1, 7, System.currentTimeMillis() - this.k);
                    }
                }
                return hofs3;
            }
            catch(bcrc bcrc0) {
                gmfx gmfx1 = bcrc0.a;
                gmfx gmfx2 = gmfx.ad;
                if(gmfx1 == gmfx2) {
                    this.h(gmfx2, bcrc0.getMessage());
                    hobo hobo2 = bcro.i(5);
                    return this.d.j(this.e, hofs1, hobo2);
                }
                if(!Objects.equals(bcrc0.getMessage(), "No API available for getting ISIM challenge response")) {
                    gmfx gmfx3 = gmfx.ah;
                    if(gmfx1 == gmfx3) {
                        this.h(gmfx3, bcrc0.getMessage());
                        hobo hobo3 = bcro.i(8);
                        return this.d.j(this.e, hofs1, hobo3);
                    }
                    hobo hobo4 = bcro.i(9);
                    return this.d.j(this.e, hofs1, hobo4);
                }
                this.h(gmfx.aj, bcrc0.getMessage());
                hobo hobo5 = bcro.i(6);
                return this.d.j(this.e, hofs1, hobo5);
            }
        }
        hobo hobo6 = bcro.i(7);
        return this.d.j(this.e, hofs1, hobo6);
    }

    private final String g(Integer integer0) {
        StringBuilder stringBuilder0;
        if(hrfm.g()) {
            this.l.a(this.e, this.c, gmfz.bk);
        }
        if(integer0 == null) {
            throw new bcrc("Null subscription IDs are not supported by TS.43", gmfx.bU, false);
        }
        if(this.i == null) {
            this.i = new csml(AppContextProvider.a(), new csmb());
        }
        csng csng0 = new csng();
        csng0.a = (int)integer0;
        csng0.b();
        csng0.b = "ap6000";
        try {
            String s = this.f.createForSubscriptionId(integer0.intValue()).getSubscriberId();
            if(s == null || s.length() < 15) {
                throw new bcrc("Unable to fetch IMSI", gmfx.Q, false);
            }
            stringBuilder0 = new StringBuilder("00");
            stringBuilder0.append(s.substring(3, 15));
            stringBuilder0.append("0");
        }
        catch(SecurityException securityException0) {
            throw new bcrc("Permission denied while fetching IMSI for TS.43", gmfx.aD, false, securityException0);
        }
        csng0.e = stringBuilder0.toString();
        csng0.c();
        if(hrfm.a.c().f()) {
            csng0.f = this.e.a;
        }
        evql evql0 = this.i.e(csng0.a());
        try {
            evrg.o(evql0, hrde.a.b().a(), TimeUnit.SECONDS);
        }
        catch(ExecutionException executionException0) {
            if((executionException0.getCause() instanceof aztb)) {
                return hrde.a.b().c() + ((aztb)executionException0.getCause()).b() + ":" + executionException0.getCause().getMessage();
            }
            throw new bcrc("TS.43 verification failed", gmfx.aF, false, executionException0);
        }
        catch(InterruptedException interruptedException0) {
            throw new bcrc("TS.43 verification was interrupted", gmfx.aE, false, interruptedException0);
        }
        catch(TimeoutException timeoutException0) {
            throw new bcrc("TS.43 verification timed out", gmfx.aG, false, timeoutException0);
        }
        GetAuthResultResponse getAuthResultResponse0 = (GetAuthResultResponse)evql0.j();
        if(getAuthResultResponse0 != null) {
            String s1 = getAuthResultResponse0.f;
            if(!TextUtils.isEmpty(s1)) {
                if(hrfm.g()) {
                    this.l.a.n(this.e.a, gmfz.bl, gmgd.p);
                }
                return hrfm.a.c().g() ? s1 : hrde.d() + s1;
            }
        }
        throw new bcrc("TS.43 token not obtained", gmfx.bV, false);
    }

    private final void h(gmfx gmfx0, String s) {
        if(hrel.c()) {
            this.l.d(this.e, 7, gmfx0, s);
        }
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        CountDownLatch countDownLatch0 = this.j;
        if(countDownLatch0 != null) {
            countDownLatch0.countDown();
        }
    }

    private static hobo i(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hobi.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hobi)hftp1.b_message).c = v - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hobo hobo0 = (hobo)hftp0.b_message;
        hobi hobi0 = (hobi)hftp1.N_build();
        hobi0.getClass();
        hobo0.c = hobi0;
        hobo0.b = 2;
        return (hobo)hftp0.N_build();
    }
}

