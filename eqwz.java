import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.AdvertisingOptions;
import com.google.android.gms.nearby.connection.v3.dct.SupportedServices;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.StartServicePayload;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;
import com.google.android.gms.smartdevice.quickstart.WifiConnectionResult;
import com.google.android.gms.smartdevice.quickstart.WifiTransferOptions;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeRequest;
import j..util.Collection.-EL;
import j..util.Objects;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqwz extends wby implements eqxa {
    final TargetQuickStartChimeraService a;

    public eqwz() {
        super("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
    }

    public eqwz(TargetQuickStartChimeraService targetQuickStartChimeraService0) {
        Objects.requireNonNull(targetQuickStartChimeraService0);
        this.a = targetQuickStartChimeraService0;
        super("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
    }

    @Override  // eqxa
    public final List a() {
        return this.a.e.e.a().k;
    }

    @Override  // eqxa
    public final void b(WifiConnectionResult wifiConnectionResult0) {
        eqzp eqzp0 = this.a.e;
        if(eqzp0 != null) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("wifi_connection_status", wifiConnectionResult0.a);
            }
            catch(JSONException jSONException0) {
                eqzp.f.l(jSONException0);
                return;
            }
            int v = wifiConnectionResult0.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjjo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            eray eray0 = eqzp0.k;
            gjjo gjjo0 = (gjjo)hftp0.b_message;
            gjjo0.b |= 1;
            gjjo0.c = v;
            gjjo gjjo1 = (gjjo)hftp0.N_build();
            ProtoLiteBuilder hftp1 = eray0.y(gjjm.r);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gjle gjle0 = (gjle)hftp1.b_message;
            gjjo1.getClass();
            gjle0.k = gjjo1;
            gjle0.b |= 0x800;
            eray0.k(((gjle)hftp1.N_build()));
            eqzp0.o(jSONObject0);
        }
    }

    @Override  // eqxa
    public final void c(BootstrapOptions bootstrapOptions0) {
        byte[] arr_b1;
        byte[] arr_b;
        TargetQuickStartChimeraService targetQuickStartChimeraService0 = this.a;
        eqzh eqzh0 = targetQuickStartChimeraService0.f;
        if(eqzh0 != null && targetQuickStartChimeraService0.d.g) {
            if(eqzh0.e == null) {
                throw new IllegalStateException("DctDeviceMessageSender is null");
            }
            try {
                arr_b = null;
                GetChallengeRequest getChallengeRequest0 = new GetChallengeRequest();
                arr_b1 = eqzh0.f.a(getChallengeRequest0).a;
            }
            catch(erhq erhq0) {
                eqzh.a.m("Get challenge returned exception " + erhq0.toString(), new Object[0]);
                arr_b1 = null;
            }
            if(arr_b1 == null) {
                eqzh.a.m("Failed to get challenge", new Object[0]);
                eqzh0.a(0x29FF, null);
                return;
            }
            if(eqzh0.g == null) {
                try {
                    eqzh0.g = new eqtr(eqzh0.b, arr_b1);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    eqzh.a.l(packageManager$NameNotFoundException0);
                    return;
                }
            }
            try {
                arr_b = eqzh0.g.a().e();
            }
            catch(hhrm unused_ex) {
            }
            if(arr_b == null) {
                eqzh.a.m("Failed to build account request", new Object[0]);
            }
        }
        else {
            eqzp eqzp0 = targetQuickStartChimeraService0.e;
            if(eqzp0 != null) {
                eqzp0.k.o(gjjm.J);
                eqzp0.b.set(false);
                epzc epzc0 = new epzc();
                epzc0.c(11, bbod.c(hygh.b()));
                Context context0 = eqzp0.g;
                epzc0.c(19, ((long)azqk.a(context0)) >= hyis.i());
                bootstrapOptions0.y(epzc0.b);
                bootstrapOptions0.ai(epzc0.a);
                bootstrapOptions0.x(eqsh.b(context0));
                Account[] arr_account = cchj.b(context0).p("com.google");
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_account.length; ++v) {
                    Account account0 = arr_account[v];
                    BootstrapAccount bootstrapAccount0 = BootstrapAccount.p(account0);
                    if(hyis.m()) {
                        bootstrapAccount0.t(bbmn.w(context0, account0.name));
                    }
                    arrayList0.add(bootstrapAccount0);
                }
                bootstrapOptions0.q(arrayList0);
                eqzp0.m = bootstrapOptions0;
                MessagePayload messagePayload0 = new MessagePayload();
                messagePayload0.w(bootstrapOptions0);
                eqzp0.n(messagePayload0);
                targetQuickStartChimeraService0.e.A();
            }
        }
    }

    @Override  // eqxa
    public final void d(WifiTransferOptions wifiTransferOptions0) {
        eqzp eqzp0 = this.a.e;
        if(eqzp0 != null) {
            eqzp0.x(wifiTransferOptions0);
        }
    }

    @Override  // eqxa
    public final void e(QuickStartTargetEventData quickStartTargetEventData0) {
        TargetQuickStartChimeraService targetQuickStartChimeraService0 = this.a;
        eqzp eqzp0 = targetQuickStartChimeraService0.e;
        if(eqzp0 != null) {
            switch(quickStartTargetEventData0.a) {
                case 14: {
                    batl.s(quickStartTargetEventData0.j);
                    eqzp0.y(((gged_interceptors)Collection.-EL.stream(quickStartTargetEventData0.j).map(new eqrs()).collect(ggaf.a)));
                    targetQuickStartChimeraService0.e.p();
                    return;
                }
                case 15: {
                    eqzp0.l(quickStartTargetEventData0.k);
                }
            }
        }
    }

    @Override  // eqxa
    public final void f(int v, TargetQuickStartOptions targetQuickStartOptions0, eqwu eqwu0) {
        if(hyis.n()) {
            synchronized(TargetQuickStartChimeraService.b) {
                this.a.e(v, targetQuickStartOptions0, eqwu0);
            }
            return;
        }
        this.a.e(v, targetQuickStartOptions0, eqwu0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eqxd eqxd0 = null;
        switch(v) {
            case 2: {
                this.j();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                WifiTransferOptions wifiTransferOptions0 = (WifiTransferOptions)wbz.a(parcel0, WifiTransferOptions.CREATOR);
                eqwz.gr(parcel0);
                this.d(wifiTransferOptions0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                BootstrapOptions bootstrapOptions0 = (BootstrapOptions)wbz.a(parcel0, BootstrapOptions.CREATOR);
                eqwz.gr(parcel0);
                this.c(bootstrapOptions0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetStartRestoreCallbacks");
                    eqxd0 = (iInterface0 instanceof eqxd) ? ((eqxd)iInterface0) : new eqxb(iBinder0);
                }
                eqwz.gr(parcel0);
                this.h(eqxd0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.a.e.v();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                byte[] arr_b = parcel0.createByteArray();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetLskfCallbacks");
                    eqxd0 = (iInterface1 instanceof eqwo) ? ((eqwo)iInterface1) : new eqwm(iBinder1);
                }
                eqwz.gr(parcel0);
                this.l(arr_b, ((eqwo)eqxd0));
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetStartServiceOnSourceCallbacks");
                    eqxd0 = (iInterface2 instanceof eqxg) ? ((eqxg)iInterface2) : new eqxe(iBinder2);
                }
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                eqwz.gr(parcel0);
                this.i(((eqxg)eqxd0), s, s1, bundle0);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                QuickStartTargetEventData quickStartTargetEventData0 = (QuickStartTargetEventData)wbz.a(parcel0, QuickStartTargetEventData.CREATOR);
                eqwz.gr(parcel0);
                this.e(quickStartTargetEventData0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                List list0 = this.a();
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 13: {
                int v1 = parcel0.readInt();
                TargetQuickStartOptions targetQuickStartOptions0 = (TargetQuickStartOptions)wbz.a(parcel0, TargetQuickStartOptions.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartCallbacks");
                    eqxd0 = (iInterface3 instanceof eqwu) ? ((eqwu)iInterface3) : new eqws(iBinder3);
                }
                eqwz.gr(parcel0);
                this.f(v1, targetQuickStartOptions0, ((eqwu)eqxd0));
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                WifiConnectionResult wifiConnectionResult0 = (WifiConnectionResult)wbz.a(parcel0, WifiConnectionResult.CREATOR);
                eqwz.gr(parcel0);
                this.b(wifiConnectionResult0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetOsMigrationCallbacks");
                    eqxd0 = (iInterface4 instanceof eqwr) ? ((eqwr)iInterface4) : new eqwp(iBinder4);
                }
                eqwz.gr(parcel0);
                this.g(((eqwr)eqxd0));
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                this.k();
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetOsMigrationCallbacks");
                    eqxd0 = (iInterface5 instanceof eqwr) ? ((eqwr)iInterface5) : new eqwp(iBinder5);
                }
                eqwz.gr(parcel0);
                TargetQuickStartChimeraService.a.d("registerOsMigrationCallbacks", new Object[0]);
                synchronized(TargetQuickStartChimeraService.b) {
                    this.a.d.d = eqxd0;
                }
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eqxa
    public final void g(eqwr eqwr0) {
        TargetQuickStartChimeraService.a.d("StartDctAdvertising", new Object[0]);
        TargetQuickStartChimeraService targetQuickStartChimeraService0 = this.a;
        targetQuickStartChimeraService0.h.c = gjld.e;
        if(targetQuickStartChimeraService0.f == null) {
            targetQuickStartChimeraService0.f = new eqzh(targetQuickStartChimeraService0, targetQuickStartChimeraService0.h, new erhr(targetQuickStartChimeraService0, targetQuickStartChimeraService0.h));
        }
        synchronized(TargetQuickStartChimeraService.b) {
            eqzf eqzf0 = targetQuickStartChimeraService0.d;
            eqzh eqzh0 = targetQuickStartChimeraService0.f;
            eqzf.a.d("startAdvertising", new Object[0]);
            eqzf0.f = eqzh0;
            eqzf0.d = eqwr0;
            SecureRandom secureRandom0 = new SecureRandom();
            StringBuilder stringBuilder0 = new StringBuilder(6);
            for(int v = 0; v < 6; ++v) {
                stringBuilder0.append("abcdefghjkmnpqrstvwxyz23456789".charAt(secureRandom0.nextInt(30)));
            }
            eqzf0.e = stringBuilder0.toString();
            eqrm eqrm0 = new eqrm(eqzf0.b);
            String s = eqzf0.e;
            cjpa cjpa0 = eqrm0.b.c();
            cjpa0.h("os_migration_password", s);
            cjpd.g(cjpa0);
            AdvertisingOptions advertisingOptions0 = new AdvertisingOptions();
            advertisingOptions0.a = Strategy.c;
            advertisingOptions0.b = true;
            advertisingOptions0.f = new int[]{11, 6, 5};
            advertisingOptions0.e = new int[]{4};
            advertisingOptions0.o = eqzf0.e;
            cvxu cvxu0 = new cvxu();
            cvxu0.b(gged_interceptors.l(new SupportedServices(2)));
            advertisingOptions0.p = cvxu0.a();
            cvxh.a(advertisingOptions0);
            evql evql0 = eqzf0.c.d("endpointName".getBytes(StandardCharsets.UTF_8), eqzf0.h, advertisingOptions0);
            evql0.A(new eqzb());
            evql0.b(new eqzc());
        }
    }

    @Override  // eqxa
    public final void h(eqxd eqxd0) {
        TargetQuickStartChimeraService targetQuickStartChimeraService0 = this.a;
        targetQuickStartChimeraService0.g = eqxd0;
        if(targetQuickStartChimeraService0.e == null) {
            try {
                eray eray0 = targetQuickStartChimeraService0.h;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjlg.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gjlg)hftv0).e = 2;
                ((gjlg)hftv0).b |= 4;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjlg gjlg0 = (gjlg)hftp0.b_message;
                gjlg0.b |= 8;
                gjlg0.f = 13L;
                eray0.q(((gjlg)hftp0.N_build()));
                eqxd0.a(13);
            }
            catch(RemoteException remoteException0) {
                TargetQuickStartChimeraService.a.l(remoteException0);
            }
            return;
        }
        TargetQuickStartChimeraService targetQuickStartChimeraService1 = this.a;
        if(!targetQuickStartChimeraService1.c.i) {
            try {
                TargetQuickStartChimeraService.a.d("Connection is lost between target and source.", new Object[0]);
                eray eray1 = targetQuickStartChimeraService1.h;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjlg.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((gjlg)hftv1).e = 2;
                ((gjlg)hftv1).b |= 4;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjlg gjlg1 = (gjlg)hftp1.b_message;
                gjlg1.b |= 8;
                gjlg1.f = 10584L;
                eray1.q(((gjlg)hftp1.N_build()));
                eqxd0.a(10584);
            }
            catch(RemoteException remoteException1) {
                TargetQuickStartChimeraService.a.l(remoteException1);
            }
            return;
        }
        TargetQuickStartChimeraService targetQuickStartChimeraService2 = this.a;
        eqzp eqzp0 = targetQuickStartChimeraService2.e;
        eqzp.f.h("Send Start Restore request", new Object[0]);
        eray eray2 = eqzp0.k;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjlg.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gjlg)hftp2.b_message).e = 1;
        ((gjlg)hftp2.b_message).b |= 4;
        eray2.q(((gjlg)hftp2.N_build()));
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("request_start_restore", true);
        }
        catch(JSONException jSONException0) {
            eqzp.f.l(jSONException0);
            return;
        }
        eqzp0.u = targetQuickStartChimeraService2;
        eqzp0.o(jSONObject0);
    }

    @Override  // eqxa
    public final void i(eqxg eqxg0, String s, String s1, Bundle bundle0) {
        TargetQuickStartChimeraService targetQuickStartChimeraService0 = this.a;
        if(!targetQuickStartChimeraService0.c.i) {
            TargetQuickStartChimeraService.a.d("The target device is not connected to the source device.", new Object[0]);
            eray eray0 = targetQuickStartChimeraService0.h;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjkz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjkz)hftp0.b_message).e = 2;
            ((gjkz)hftp0.b_message).b |= 4;
            eray0.r(((gjkz)hftp0.N_build()));
            try {
                StartServiceResponse startServiceResponse0 = new StartServiceResponse(2);
                eqxg0.a(Status.b, startServiceResponse0);
            }
            catch(RemoteException remoteException0) {
                TargetQuickStartChimeraService.a.l(remoteException0);
            }
            return;
        }
        eqzp eqzp0 = this.a.e;
        eqzp.f.d("startServiceOnSource()", new Object[0]);
        kau kau0 = new kau(s, s1);
        eqsl eqsl0 = new eqsl(new bblp(1, 10), null, hyis.a.k().o(), new eqzl(eqzp0, s, s1, eqxg0, kau0));
        eqsl0.a();
        kau kau1 = new kau(eqxg0, eqsl0);
        eqzp0.v.put(kau0, kau1);
        eqzp.f.d("sendStartServicePayload()", new Object[0]);
        MessagePayload messagePayload0 = new MessagePayload();
        StartServicePayload startServicePayload0 = new StartServicePayload();
        startServicePayload0.q(s);
        startServicePayload0.p(s1);
        startServicePayload0.c = bundle0;
        startServicePayload0.a.add(Integer.valueOf(3));
        eqzp.f.j("sendStartServicePayload: %s", new Object[]{startServicePayload0});
        messagePayload0.an(startServicePayload0);
        eqzp0.n(messagePayload0);
    }

    @Override  // eqxa
    public final void j() {
        this.a.f();
    }

    @Override  // eqxa
    public final void k() {
        TargetQuickStartChimeraService.a.d("StopDctAdvertising", new Object[0]);
        synchronized(TargetQuickStartChimeraService.b) {
            this.a.d.a();
        }
    }

    @Override  // eqxa
    public final void l(byte[] arr_b, eqwo eqwo0) {
        eqzp eqzp0 = this.a.e;
        eqzp0.i = eqwo0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("encrypted_lskf_guess", bbmu.a(arr_b));
            eqzp0.o(jSONObject0);
        }
        catch(JSONException jSONException0) {
            eqzp.f.n("Error sending encryptedLskfGuess.", jSONException0, new Object[0]);
            eqzp0.u(7);
        }
    }
}

