import android.app.PendingIntent;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.os.UserHandle;
import j..util.Objects;
import java.nio.charset.StandardCharsets;
import jeb.synthetic.TWR;

final class albc extends alfu {
    final albd a;

    public albc(albd albd0) {
        Objects.requireNonNull(albd0);
        this.a = albd0;
        super();
    }

    @Override  // alfv
    public final PendingIntent a(Intent intent0, int v) {
        baun baun0 = albe.a;
        baun0.h("XPF-getPendingIntentForUser: %s X->G on G", new Object[]{v});
        if(!hpzm.A()) {
            baun0.m("XPF-getPendingIntentForUser() is called while enablePersonalToWorkStreaming is off.", new Object[0]);
            return null;
        }
        alaj alaj0 = this.a.a.m;
        if(alaj0 == null) {
            baun0.m("XPF-No getPendingIntentForUserListener found!", new Object[0]);
            return null;
        }
        alao alao0 = alaj0.a;
        if(!alao0.g(v)) {
            return null;
        }
        try(ywg ywg0 = alna.a(alao0.e)) {
            if(ywg0 == null) {
                TWR.useResource$NT(null);
                alao.a.f("XPF-getPendingIntentForUser() called but personal profile is not available.", new Object[0]);
                return null;
            }
            gftb.check(alao0.g);
            return alao0.g.a().a(intent0, v);
        }
        catch(ywm ywm0) {
            alao.a.g("XPF-Unavailable profile.", ywm0, new Object[0]);
            return null;
        }
    }

    @Override  // alfv
    public final Intent c(String s, int v) {
        baun baun0 = albe.a;
        baun0.h("XPF-getLaunchIntentForUser: %s X->G on G", new Object[]{v});
        if(!hpzm.A()) {
            baun0.m("XPF-getLaunchIntentForUser() is called while enablePersonalToWorkStreaming is off.", new Object[0]);
            return null;
        }
        alak alak0 = this.a.a.n;
        if(alak0 == null) {
            baun0.m("XPF-No getLaunchIntentForUserListener found!", new Object[0]);
            return null;
        }
        alao alao0 = alak0.a;
        if(!alao0.g(v)) {
            return null;
        }
        try(ywg ywg0 = alna.a(alao0.e)) {
            if(ywg0 == null) {
                TWR.useResource$NT(null);
                alao.a.f("XPF-getLaunchIntentForUser() called but personal profile is not available.", new Object[0]);
                return null;
            }
            gftb.check(alao0.g);
            return alao0.g.a().b(s, v);
        }
        catch(ywm ywm0) {
            alao.a.g("XPF-Unavailable profile.", ywm0, new Object[0]);
            return null;
        }
    }

    @Override  // alfv
    public final void d(String s) {
        baun baun0 = albe.a;
        baun0.h("onAssociationDialogShown: %s B->G", new Object[0]);
        alaz alaz0 = this.a.a.h;
        if(alaz0 == null) {
            baun0.m("No associationObserver found!", new Object[0]);
            return;
        }
        if(!((alao)alaz0).h(s)) {
            alao.a.h("Ignore sending AssociationDialogShown. Account does not match:%s", new Object[]{s});
            return;
        }
        alao.a.h("onAssociationDialogShown", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((aldt)hftv0).b = 6;
        aldk aldk0 = aldk.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        aldt aldt0 = (aldt)hftp0.b_message;
        aldt0.c = aldk0.a();
        ((alao)alaz0).c(((aldt)hftp0.N_build()));
    }

    @Override  // alfv
    public final void e(boolean z, String s, String s1) {
        baun baun0 = albe.a;
        Boolean boolean0 = Boolean.valueOf(z);
        baun0.h("onAssociationResultMessage: %s B->G", new Object[]{boolean0});
        albe albe0 = this.a.a;
        alaz alaz0 = albe0.h;
        if(alaz0 == null) {
            baun0.m("No associationObserver found!", new Object[0]);
            return;
        }
        if(((alao)alaz0).h(s)) {
            gmbu.t(alol.a(s).h(z), new alam(((alao)alaz0), s), gmap.a);
            alao.a.h("sendAppsSetupResponse. result:%s, error:%s", new Object[]{boolean0, s1});
            int v = 3;
            if(z) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldt.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((aldt)hftv0).b = 1;
                aldk aldk0 = aldk.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aldt aldt0 = (aldt)hftp0.b_message;
                aldt0.c = aldk0.a();
                ((alao)alaz0).c(((aldt)hftp0.N_build()));
            }
            else {
                switch(s1) {
                    case "NO_ERROR": {
                        break;
                    }
                    case "canceled": {
                        v = 6;
                        break;
                    }
                    case "discovery_timeout": {
                        v = 5;
                        break;
                    }
                    case "system_error": {
                        v = 7;
                        break;
                    }
                    case "user_rejected": {
                        v = 4;
                        break;
                    }
                    default: {
                        v = 2;
                    }
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aldt.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((aldt)hftv1).b = v - 2;
                aldk aldk1 = aldk.b;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aldt aldt1 = (aldt)hftp1.b_message;
                aldt1.c = aldk1.a();
                ((alao)alaz0).c(((aldt)hftp1.N_build()));
            }
        }
        else {
            alao.a.h("Ignore sending AppsSetupResponse. Account does not match:%s", new Object[]{s});
        }
        if(albe0.q != null && albe0.j != null) {
            albe0.b();
            return;
        }
        baun0.h("No callback to send association result B->G", new Object[0]);
    }

    @Override  // alfv
    public final void f(boolean z, String s) {
        baun baun0 = albe.a;
        baun0.h("onAssociationState: %s B->G", new Object[]{Boolean.valueOf(z)});
        albe albe0 = this.a.a;
        alaz alaz0 = albe0.h;
        if(alaz0 == null) {
            baun0.m("No associationObserver found!", new Object[0]);
            return;
        }
        alaz0.a(z, s);
        if(albe0.q != null && albe0.j != null) {
            albe0.b();
            return;
        }
        baun0.h("No callback to send association state B->G", new Object[0]);
    }

    @Override  // alfv
    public final void g(String s, String s1, int v) {
        baun baun0 = albe.a;
        baun0.h("onStreamedAppChanged: User: %s X->G on G", new Object[]{v});
        if(!albt.c()) {
            baun0.m("onStreamedAppChanged() is called while Exo feature is off.", new Object[0]);
            return;
        }
        if(this.a.a.o != null) {
            aloz aloz0 = alpa.b().a(s);
            if(aloz0 == null) {
                alao.a.f("onStreamedAppChangedListener() called while there is no MessageProcessor for deviceId=%s", new Object[]{s});
                return;
            }
            UserHandle userHandle0 = UserHandle.of(v);
            alsw alsw0 = aloz0.f.b(s1, userHandle0, null);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)alsz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            alsz alsz0 = (alsz)hftp0.b_message;
            alsw0.getClass();
            alsz0.c = alsw0;
            alsz0.b |= 1;
            aloz0.l(((MessageLite)hftp0.N_build()));
            if(hpzm.D()) {
                aloz0.p(true);
            }
            return;
        }
        baun0.m("No onStreamedAppChangedListener found!", new Object[0]);
    }

    @Override  // alfv
    public final void h(String s, byte[] arr_b) {
        String s2;
        ByteString hfsf1;
        boolean z;
        alar alar0 = this.a.a.q;
        if(alar0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldw.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((aldw)hftp0.b_message).c = hfsf0;
            aldw aldw0 = (aldw)hftp0.N_build();
            alat alat0 = alar0.a;
            alao alao0 = alat0.a(s);
            if(alao0 != null) {
                if(hpzc.a.b().m()) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aldo.a).v_newBuilder();
                    ConnectivityManager connectivityManager0 = alat0.d;
                    if(connectivityManager0 == null) {
                        alat.a.m("ExoGMSConnectionManager", new Object[]{"ConnectivityManager is null"});
                        z = false;
                    }
                    else {
                        NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                        z = networkCapabilities0 != null && networkCapabilities0.hasTransport(0) && !networkCapabilities0.hasTransport(1);
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((aldo)hftp1.b_message).c = z;
                    if(!z) {
                        WifiManager wifiManager0 = alat0.e;
                        if(wifiManager0 == null) {
                            alat.a.m("ExoGMSConnectionManager", new Object[]{"WifiManager is null"});
                            hfsf1 = ByteString.b;
                        }
                        else {
                            String s1 = wifiManager0.getConnectionInfo().getSSID();
                            if(s1.equals("<unknown ssid>")) {
                                alat.a.m("ExoGMSConnectionManager", new Object[]{"SSID could not be obtained."});
                                hfsf1 = ByteString.b;
                            }
                            else {
                                ghfz ghfz0 = ghgc.a;
                                if(s1.length() > 2 && s1.startsWith("\"") && s1.endsWith("\"")) {
                                    s2 = s1.substring(1, s1.length() - 1);
                                }
                                else {
                                    try {
                                        s2 = ByteString.B(s1).toStringUtf8();
                                    }
                                    catch(NumberFormatException unused_ex) {
                                        alat.a.f("ExoGMSConnectionManager", new Object[]{"NumberFormatException while coverting ssid to UTF-8"});
                                        hfsf1 = ByteString.b;
                                        goto label_44;
                                    }
                                }
                                hfsf1 = ByteString.copyFrom(ghfz0.c(s2, StandardCharsets.UTF_8).e());
                            }
                        }
                    label_44:
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        aldo aldo0 = (aldo)hftp1.b_message;
                        hfsf1.getClass();
                        aldo0.b = hfsf1;
                    }
                    aldo aldo1 = (aldo)hftp1.N_build();
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)aldw0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)aldw0));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    aldw aldw1 = (aldw)hftp2.b_message;
                    aldo1.getClass();
                    aldw1.d = aldo1;
                    aldw1.b |= 1;
                    alao0.d(((aldw)hftp2.N_build()));
                }
                else {
                    alao0.d(aldw0);
                }
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hfjb.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                albe.a.d("CDS_GMS Log WebRtcSignal Sent Session: %s", new Object[]{((long)((hfjb)hftv0).b)});
                this.a.a.p.a(((hfjb)hftv0), 13);
            }
            catch(hfur hfur0) {
                albe.a.n("Failed to log signaling message to be sent to device.", hfur0, new Object[0]);
            }
            return;
        }
        albe.a.h("No callback to send message B->G", new Object[0]);
    }

    @Override  // alfv
    public final void i(String s) {
        alap alap0 = (alap)this.a.a.f.get(s);
        if(alap0 != null) {
            alat alat0 = alap0.a;
            alao alao0 = (alao)alat0.b.get(alap0.b);
            if(alao0 != null) {
                if(hpzc.g()) {
                    alce alce0 = alao0.d;
                    if(!alce0.c()) {
                        alao.a.h("Starting proximity checks", new Object[0]);
                        alah alah0 = new alah(alao0);
                        alai alai0 = new alai(alao0);
                        alce.a.h("Starting proximity pinger", new Object[0]);
                        alce0.e = alah0;
                        alce0.f = alai0;
                        alce0.d = 2;
                        alce0.b.removeCallbacksAndMessages(null);
                        alcd alcd0 = new alcd(alce0);
                        alce0.b.postDelayed(alcd0, 60000L);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aldx.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((aldx)hftp0.b_message).b = 1;
                        alao0.e(((aldx)hftp0.N_build()));
                    }
                }
                alao0.f = 2;
            }
            alat0.g(false);
            return;
        }
        albe.a.h("No stream started listener to send message B->G", new Object[0]);
    }

    @Override  // alfv
    public final void j(String s) {
        alaq alaq0 = (alaq)this.a.a.e.get(s);
        if(alaq0 != null) {
            alaq0.a();
            return;
        }
        albe.a.h("No stream stopped listener to send message B->G", new Object[0]);
    }

    @Override  // alfv
    public final void k() {
        albe albe0 = this.a.a;
        if(albe0.q != null && albe0.j != null) {
            albe0.b();
            return;
        }
        albe.a.h("No callback to send teardown message B->G", new Object[0]);
    }
}

