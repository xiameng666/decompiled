import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.quickstart.AccountSelectionData;
import com.google.android.gms.smartdevice.quickstart.QuickStartSourceEventData;
import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqwk extends wby implements eqwl {
    final SourceQuickStartChimeraService a;

    public eqwk() {
        super("com.google.android.gms.smartdevice.quickstart.ISourceQuickStartService");
    }

    public eqwk(SourceQuickStartChimeraService sourceQuickStartChimeraService0) {
        Objects.requireNonNull(sourceQuickStartChimeraService0);
        this.a = sourceQuickStartChimeraService0;
        super("com.google.android.gms.smartdevice.quickstart.ISourceQuickStartService");
    }

    @Override  // eqwl
    public final int a() {
        return this.a.e.B;
    }

    @Override  // eqwl
    public final void b(ConnectionRequest connectionRequest0, eqwi eqwi0) {
        ConnectionRequest connectionRequest1 = connectionRequest0;
        if(connectionRequest1.g) {
            SourceQuickStartChimeraService sourceQuickStartChimeraService0 = this.a;
            String s = sourceQuickStartChimeraService0.e.p;
            if(s != null || connectionRequest1.e != null) {
                if(s != null) {
                    SourceQuickStartChimeraService.a.d("Reconnect with key=%s", new Object[]{s});
                    connectionRequest1 = new ConnectionRequest(connectionRequest1.a, connectionRequest1.b, connectionRequest1.c, connectionRequest1.d, sourceQuickStartChimeraService0.e.p, connectionRequest1.f, true, connectionRequest1.h, connectionRequest1.i, connectionRequest1.j, connectionRequest1.k);
                }
                sourceQuickStartChimeraService0.f.e(gjkj.B);
                sourceQuickStartChimeraService0.g.b(3);
                sourceQuickStartChimeraService0.e.B = 1002;
                if(connectionRequest1.i) {
                    sourceQuickStartChimeraService0.c.e(hyis.a.k().r());
                }
                else {
                    sourceQuickStartChimeraService0.c.e(hyis.a.k().s());
                }
                if(!hyis.q() && sourceQuickStartChimeraService0.c.f()) {
                    sourceQuickStartChimeraService0.c.d();
                    goto label_33;
                }
                sourceQuickStartChimeraService0.c.a();
                goto label_33;
            }
        }
        SourceQuickStartChimeraService sourceQuickStartChimeraService1 = this.a;
        if(sourceQuickStartChimeraService1.e.B == 1000) {
            baun baun0 = SourceQuickStartChimeraService.a;
            baun0.d("Connect.", new Object[0]);
            sourceQuickStartChimeraService1.f.e(gjkj.j);
            eraz.a(2, 0L, 0, 0, "", 0, 0, 0, false);
            eqyw eqyw0 = sourceQuickStartChimeraService1.e;
            eqyw0.B = 1000;
            String s1 = connectionRequest1.c;
            if(s1 != null) {
                sourceQuickStartChimeraService1.j = s1;
                eqyw0.G = sourceQuickStartChimeraService1.j;
                baun0.d("Set advertisingId=%s", new Object[]{sourceQuickStartChimeraService1.j});
            }
        label_33:
            SourceQuickStartChimeraService sourceQuickStartChimeraService2 = this.a;
            if(sourceQuickStartChimeraService2.h == null) {
                sourceQuickStartChimeraService2.h = new eqyf(eqwi0, sourceQuickStartChimeraService2.e);
            }
            sourceQuickStartChimeraService2.d.a(connectionRequest1, sourceQuickStartChimeraService2.h).z(new eqye(this));
            return;
        }
        SourceQuickStartChimeraService.a.m("Not in pending initial connection state.", new Object[0]);
    }

    @Override  // eqwl
    public final void c(String s) {
        SourceQuickStartChimeraService.a.d("continueOutOfBand.", new Object[0]);
        this.a.f.e(gjkj.p);
        eqak eqak0 = this.a.d.l;
        if(eqak0 != null && (eqak0.b.c != null && eqak0.b.i != null)) {
            eqak0.a = s;
            eqak0.f();
        }
    }

    @Override  // eqwl
    public final void d() {
        SourceQuickStartChimeraService.a.d("continueWithPin.", new Object[0]);
        this.a.f.e(gjkj.q);
        this.a.d.e();
    }

    @Override  // eqwl
    public final void e() {
        SourceQuickStartChimeraService.a.d("disconnect.", new Object[0]);
        this.a.d.b();
    }

    @Override  // eqwl
    public final void f(int v, AccountSelectionData accountSelectionData0) {
        eqyw eqyw0 = this.a.e;
        if(v != 0) {
            ArrayList arrayList0 = new ArrayList();
            BootstrapOptions bootstrapOptions0 = eqyw0.q;
            batl.s(bootstrapOptions0);
            eqyw0.x(arrayList0, bootstrapOptions0);
            return;
        }
        batl.s(accountSelectionData0);
        ArrayList arrayList1 = ggia.b(accountSelectionData0.a);
        BootstrapOptions bootstrapOptions1 = eqyw0.q;
        batl.s(bootstrapOptions1);
        eqyw0.x(arrayList1, bootstrapOptions1);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eqwi eqwi0 = null;
        switch(v) {
            case 1: {
                ConnectionRequest connectionRequest0 = (ConnectionRequest)wbz.a(parcel0, ConnectionRequest.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ISourceQuickStartCallbacks");
                    eqwi0 = (iInterface0 instanceof eqwi) ? ((eqwi)iInterface0) : new eqwg(iBinder0);
                }
                eqwk.gr(parcel0);
                this.b(connectionRequest0, eqwi0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                this.e();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                String s = parcel0.readString();
                eqwk.gr(parcel0);
                this.c(s);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ISourceQuickStartCallbacks");
                    eqwi0 = (iInterface1 instanceof eqwi) ? ((eqwi)iInterface1) : new eqwg(iBinder1);
                }
                eqwk.gr(parcel0);
                this.k(eqwi0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                int v1 = parcel0.readInt();
                eqwk.gr(parcel0);
                this.h(v1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                this.g();
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.d();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                parcel1.writeNoException();
                parcel1.writeInt(this.a());
                return true;
            }
            case 10: {
                long v2 = parcel0.readLong();
                eqwk.gr(parcel0);
                this.n(v2);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                this.j();
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                int v3 = parcel0.readInt();
                AccountSelectionData accountSelectionData0 = (AccountSelectionData)wbz.a(parcel0, AccountSelectionData.CREATOR);
                eqwk.gr(parcel0);
                this.f(v3, accountSelectionData0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                eqwk.gr(parcel0);
                if(bundle0.containsKey("source_error")) {
                    this.a.e.l(bundle0.getInt("source_error"));
                }
                else {
                    eqyw eqyw0 = this.a.e;
                    ArrayList arrayList0 = bundle0.getParcelableArrayList("accounts");
                    batl.s(arrayList0);
                    if(hyis.s() && arrayList0.isEmpty()) {
                        eqyw0.l(10905);
                    }
                    else {
                        eqyw0.n(eqsh.f(arrayList0));
                    }
                }
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                eqwk.gr(parcel0);
                this.i(bundle1);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                this.l();
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                QuickStartSourceEventData quickStartSourceEventData0 = (QuickStartSourceEventData)wbz.a(parcel0, QuickStartSourceEventData.CREATOR);
                eqwk.gr(parcel0);
                this.m(quickStartSourceEventData0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eqwl
    public final void g() {
        eqyw eqyw0 = this.a.e;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("await_user_verification", true);
        }
        catch(JSONException jSONException0) {
            eqyw.f.l(jSONException0);
        }
        eqyw0.o(jSONObject0);
    }

    @Override  // eqwl
    public final void h(int v) {
        eqyw eqyw0 = this.a.e;
        eqyw0.z = SystemClock.elapsedRealtime();
        if(v != 0) {
        label_8:
            boolean z = true;
            eqyw0.y = v == 0;
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("user_verification_result", v);
                if(eqyw0.q != null) {
                    z = false;
                }
                jSONObject0.put("is_first_user_verification", z);
            }
            catch(JSONException jSONException0) {
                eqyw.f.l(jSONException0);
            }
            eqyw0.o(jSONObject0);
        }
        else if(eqyw0.x == 4) {
            eqyw0.u();
            v = 0;
        }
        else {
            v = 0;
            goto label_8;
        }
        if(eqyw0.q != null && (v == 0 || v == 2)) {
            eqyw.f.d("Second user verification completed. Starting account transfer.", new Object[0]);
            BootstrapOptions bootstrapOptions0 = eqyw0.q;
            batl.s(bootstrapOptions0);
            eqyw0.y(bootstrapOptions0);
        }
    }

    @Override  // eqwl
    public final void i(Bundle bundle0) {
        String s = bundle0.getString("wifi_ssid");
        batl.s(s);
        String s1 = bundle0.getString("wifi_security_type");
        batl.s(s1);
        String s2 = bundle0.getString("wifi_pre_shared_key");
        boolean z = bundle0.getBoolean("wifi_hidden_ssid");
        eqyw eqyw0 = this.a.e;
        eqyw0.t = erqr.a(s1, s, s2, false);
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("wifi_ssid", s);
            jSONObject0.put("wifi_hidden_ssid", z);
            jSONObject0.put("wifi_security_type", s1);
            if(s2 != null) {
                jSONObject0.put("wifi_pre_shared_key", s2);
            }
            eqyw0.A(jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqyw.f.m("JSONException " + jSONException0.toString(), new Object[0]);
            eqyw0.z(eqyw0.r());
        }
    }

    @Override  // eqwl
    public final void j() {
        eqam eqam0 = this.a.d;
        String s = eqam0.i;
        if(s == null) {
            eqam.b.m("No pending connection to accept", new Object[0]);
            return;
        }
        eqmu eqmu0 = new eqmu(eqam0.e, eqam0.y);
        eqam0.c.c(s, eqmu0);
    }

    @Override  // eqwl
    public final void k(eqwi eqwi0) {
        SourceQuickStartChimeraService.a.d("registerCallbacks", new Object[0]);
        SourceQuickStartChimeraService sourceQuickStartChimeraService0 = this.a;
        sourceQuickStartChimeraService0.i = eqwi0;
        sourceQuickStartChimeraService0.e.h = eqwi0;
        sourceQuickStartChimeraService0.e.A = true;
        eqyf eqyf0 = sourceQuickStartChimeraService0.h;
        if(eqyf0 == null) {
            sourceQuickStartChimeraService0.h = new eqyf(eqwi0, sourceQuickStartChimeraService0.e);
            return;
        }
        eqyf0.a = eqwi0;
    }

    @Override  // eqwl
    public final void l() {
        this.a.e.B(8);
    }

    @Override  // eqwl
    public final void m(QuickStartSourceEventData quickStartSourceEventData0) {
        switch(quickStartSourceEventData0.a) {
            case 10: {
                List list0 = quickStartSourceEventData0.d;
                eqyw eqyw0 = this.a.e;
                batl.s(list0);
                if(hyis.s() && list0.isEmpty()) {
                    eqyw0.l(10905);
                    return;
                }
                MessagePayload messagePayload0 = new MessagePayload();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    StartSessionResponse startSessionResponse0 = new StartSessionResponse();
                    startSessionResponse0.p(((FallbackAccount)object0).b);
                    startSessionResponse0.q(((FallbackAccount)object0).d);
                    arrayList0.add(startSessionResponse0);
                }
                messagePayload0.am(new SecondDeviceAuthPayload(arrayList0));
                messagePayload0.x(6);
                eqyw0.n(messagePayload0);
                return;
            }
            case 11: {
                this.a.e.l(quickStartSourceEventData0.e);
            }
        }
    }

    @Override  // eqwl
    public final void n(long v) {
        this.a.f.j(v);
    }
}

