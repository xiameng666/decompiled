import android.accounts.Account;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.auth.easyunlock.userpresence.TrustStateTracker.TrustStateBroadcastReceiver;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import j..util.Objects;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class ajli implements akyo {
    public final Set a;
    public final Object b;
    public boolean c;
    private static final bboh d;
    private static final Role e;
    private final akzc f;
    private final ajlf g;

    static {
        ajli.d = ajlr.a("ProximityAuthClient");
        ajli.e = new Role("easy_unlock", 8);
    }

    public ajli(Context context0, Set set0) {
        this.f = new akzc(context0);
        this.g = new ajlf(context0, this);
        this.a = new HashSet(set0);
        this.b = new Object();
    }

    public final evql a() {
        if(!this.c) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            arrayList0.add(this.f.e(((RemoteDevice)object0).b, ajli.e));
        }
        return evrg.e(arrayList0);
    }

    public final List b() {
        evql evql0;
        synchronized(this.b) {
            evql0 = this.f.b(ajli.e);
            try {
                evrg.o(evql0, 5L, TimeUnit.SECONDS);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                a.ae(ajli.d.j(), "Couldn\'t retrieve connection infos", exception0);
                return ggna.a;
            }
        }
        return (List)evql0.j();
    }

    public final void c() {
        synchronized(this.b) {
            if(this.c) {
                return;
            }
            akzc akzc0 = this.f;
            akzc0.f(this);
            for(Object object1: this.a) {
                evql evql0 = akzc0.c(((RemoteDevice)object1), ajli.e);
                try {
                    evrg.o(evql0, 5L, TimeUnit.SECONDS);
                }
                catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                    a.ae(ajli.d.j(), "Error registering device for role", exception0);
                }
            }
        }
        this.c = true;
    }

    @Override  // akyo
    public final void d(String s, int v, int v1, int v2) {
        if(v != 1) {
            return;
        }
        synchronized(this.b) {
            RemoteDevice remoteDevice0 = this.h(s);
            if(remoteDevice0 == null && !s.isEmpty()) {
                ((ggtj)ajli.d.j()).B("Can\'t update connection status: %s", s);
            }
            else {
                ajlf ajlf0 = this.g;
                synchronized(ajlf0.f) {
                    if(remoteDevice0 != null) {
                        String s1 = remoteDevice0.b;
                        if(v2 == 3) {
                            ajlf0.h.add(s1);
                        }
                        else {
                            ajlf0.h.remove(s1);
                        }
                    }
                    if(ajlf0.h.isEmpty()) {
                        ajll ajll1 = ajlf0.c;
                        if(ajll1.d()) {
                            ((ggtj)ajlf.a.h()).x("Stop tracking lock screen status updates.");
                            if(ajll1.h.remove(ajlf0) && ajll1.h.isEmpty()) {
                                ajme ajme1 = ajll1.c;
                                synchronized(ajme1.d) {
                                    ajme1.f.remove(ajll1);
                                    if(ajme1.f.isEmpty()) {
                                        ajme1.e.a.unregisterReceiver(ajme1.e);
                                        ajme1.c.c();
                                        ajme1.g = 0;
                                    }
                                }
                                ajmb ajmb1 = ajll1.d;
                                synchronized(ajmb1.b) {
                                    ajmb1.e.remove(ajll1);
                                    if(ajmb1.e.isEmpty()) {
                                        ajmb1.c.unregisterReceiver(ajmb1.f);
                                        ajmb1.f = null;
                                    }
                                }
                            }
                        }
                    }
                    else {
                        ajll ajll0 = ajlf0.c;
                        if(!ajll0.d()) {
                            ((ggtj)ajlf.a.h()).x("Start tracking lock screen status updates.");
                            if(ajll0.h.add(ajlf0) && ajll0.h.size() == 1) {
                                ajme ajme0 = ajll0.c;
                                synchronized(ajme0.d) {
                                    ajme0.b(false);
                                    List list0 = ajme0.f;
                                    if(list0.isEmpty()) {
                                        IntentFilter intentFilter0 = new IntentFilter();
                                        intentFilter0.addAction("android.intent.action.SCREEN_ON");
                                        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
                                        intentFilter0.addAction("android.intent.action.USER_PRESENT");
                                        jwe.b(ajme0.e.a, ajme0.e, intentFilter0, 2);
                                        if(ajme0.g == 2) {
                                            ajme0.c.b();
                                        }
                                    }
                                    list0.add(ajll0);
                                }
                                ajmb ajmb0 = ajll0.d;
                                gmbu.t(ajmb0.d.a(), new ajlz(ajmb0, ajll0), gmap.a);
                                synchronized(ajmb0.b) {
                                    ajmb0.e.add(ajll0);
                                    if(ajmb0.f == null) {
                                        ajmb0.f = new TrustStateTracker.TrustStateBroadcastReceiver(ajmb0);
                                        IntentFilter intentFilter1 = new IntentFilter();
                                        intentFilter1.addAction("com.google.android.gms.trustagent.TRUST_STATE_CHANGED");
                                        jwe.b(ajmb0.c, ajmb0.f, intentFilter1, 2);
                                    }
                                }
                            }
                        }
                    }
                    if(v2 == 3) {
                        ajlf0.c.a();
                        ajlf0.j = 0;
                    }
                    else if(v1 == 2) {
                        int v9 = ajlf0.j;
                        if(v9 >= 4) {
                            ((ggtj)ajlf.a.h()).B("Forcing device sync for %s", remoteDevice0);
                            if(remoteDevice0 != null) {
                                Account account0 = new Account(remoteDevice0.d, "com.google");
                                ajlf0.g.f(account0);
                            }
                            else if(hpue.a.c().b()) {
                                ajlb ajlb0 = new ajlb(ajlf0);
                                ajlf0.i.execute(ajlb0);
                            }
                            ajlf0.j = 0;
                        }
                        else {
                            ajlf0.j = v9 + 1;
                        }
                    }
                }
            }
        }
    }

    @Override  // akyo
    public final void e(String s, String s1, byte[] arr_b) {
        ajlm ajlm0;
        byte[] arr_b1;
        Object object2;
        String s2;
        JSONObject jSONObject0;
        Object object1;
        ajlf ajlf0;
        RemoteDevice remoteDevice0;
        Object object0 = this.b;
        synchronized(object0) {
            if(Objects.equals(s1, "easy_unlock")) {
                remoteDevice0 = this.h(s);
                if(remoteDevice0 == null) {
                    goto label_90;
                }
                else {
                    ajlf0 = this.g;
                    object1 = ajlf0.f;
                    __monitor_enter(object1);
                    goto label_8;
                }
                goto label_95;
            }
            goto label_97;
        }
        try {
        label_8:
            jSONObject0 = new JSONObject(new String(arr_b));
            s2 = jSONObject0.getString("type");
            if(s2.equals("event")) {
                String s3 = jSONObject0.getString("name");
                Integer integer0 = (Integer)ajlo.b.get(s3);
                if(integer0 == null) {
                    ((ggtj)ajlo.a.j()).B("Received an unknown event: %s", jSONObject0.getString("name"));
                    integer0 = (int)-1;
                }
                ((ggtj)ajlf.a.h()).x("Handling status update message...");
                if(new ajlo(((int)integer0)).c == 0) {
                    __monitor_enter(object1);
                    goto label_19;
                }
            }
            else {
                goto label_51;
            }
            goto label_88;
        }
        catch(JSONException | ajku exception0) {
            goto label_83;
        }
        catch(Throwable throwable1) {
            goto label_86;
        }
        try {
        label_19:
            object2 = ajlf0.e.c;
            __monitor_enter(object2);
        }
        catch(Throwable throwable2) {
            goto label_47;
        }
        try {
            String s4 = ajlf0.e.a.getString(0x7F1502F4, new Object[]{ajlf0.e.d});  // string:auth_proximity_auth_device_unlocked_content "%s unlocked"
            String s5 = ajlf0.e.a.getString(0x7F1502F5, new Object[]{ajlf0.e.d});  // string:auth_proximity_auth_device_unlocked_dialog_content "The %s will remain unlocked 
                                                                                   // as long as this phone is unlocked and nearby"
            Bundle bundle0 = new Bundle();
            bundle0.putString("android.substName", "Smart Lock");
            juo juo0 = new juo(ajlf0.e.a);
            juo0.s(avyq.a(ajlf0.e.a, 0x7F08024B));
            juo0.V(System.currentTimeMillis());
            juo0.h(true);
            juo0.e(bundle0);
            juo0.m = -1;
            juo0.E(2);
            juo0.D("Smart Lock");
            juo0.k(s4);
            Intent intent0 = new Intent(ajlf0.e.a, ajlu.class);
            intent0.putExtra("dialog_content_msg", s5);
            juo0.h = cjok.a(ajlf0.e.a, 0, intent0, 0xA000000);
            juo0.J = "easy-unlock-notification-channel-id";
            Notification notification0 = juo0.a();
            ajlf0.e.b.y("EasyUnlockNotifications", 2, evuh.bf, notification0);
            goto label_44;
        }
        catch(Throwable throwable3) {
            try {
                __monitor_exit(object2);
                throw throwable3;
            label_44:
                __monitor_exit(object2);
                goto label_49;
            }
            catch(Throwable throwable2) {
            }
        }
        try {
        label_47:
            __monitor_exit(object1);
            throw throwable2;
        label_49:
            __monitor_exit(object1);
        }
        catch(JSONException | ajku exception0) {
            goto label_83;
        }
        catch(Throwable throwable1) {
            goto label_86;
        }
        goto label_88;
        try {
            try {
            label_51:
                if(s2.equals("decrypt_request")) {
                    goto label_74;
                }
                else if(s2.equals("unlock_request")) {
                    ((ggtj)ajlf.a.h()).x("Handling unlock request message...");
                    ajli ajli0 = ajlf0.b;
                    String s6 = remoteDevice0.b;
                    try {
                        JSONObject jSONObject1 = new JSONObject();
                        jSONObject1.put("type", "unlock_response");
                        arr_b1 = jSONObject1.toString().getBytes("UTF-8");
                    }
                    catch(UnsupportedEncodingException unsupportedEncodingException0) {
                        throw new RuntimeException(unsupportedEncodingException0);
                    }
                    ajli0.f(s6, arr_b1);
                }
                else {
                    if(!s2.equals("poll_screen_state")) {
                        throw new ajku(String.format("Received unexpected type of message: %s.", s2));
                    }
                    goto label_66;
                }
                goto label_88;
            }
            catch(JSONException exception0) {
                goto label_83;
            }
            try {
            label_66:
                boolean z = jSONObject0.getString("type").equals("poll_screen_state");
            }
            catch(JSONException jSONException0) {
                throw new IllegalStateException("Failed to parse JSON", jSONException0);
            }
        }
        catch(ajku exception0) {
            goto label_83;
        }
        catch(Throwable throwable1) {
            goto label_86;
        }
        if(z) {
            try {
                ((ggtj)ajlf.a.h()).x("Handling poll screen state message...");
                ajlf0.c.a();
            }
            catch(JSONException | ajku exception0) {
                goto label_83;
            }
            catch(Throwable throwable1) {
                goto label_86;
            }
            goto label_88;
        }
        try {
            try {
                try {
                    throw new JSONException("Unexpected type.");
                }
                catch(JSONException jSONException0) {
                    try {
                        throw new IllegalStateException("Failed to parse JSON", jSONException0);
                        try {
                        label_74:
                            ajlm0 = new ajlm(Base64.decode(jSONObject0.getString("encrypted_data"), 8));
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            throw new JSONException("Failed to decode the data.".concat(illegalArgumentException0.toString()));
                        }
                        ((ggtj)ajlf.a.h()).x("Handling decrypt request message...");
                        ajlc ajlc0 = new ajlc(ajlf0, remoteDevice0);
                        gmbu.t(glzd.g(ajlf0.i.e(ajlc0), new ajld(new ajla(ajlf0.d.a), ajlm0), gmap.a), new ajle(ajlf0, remoteDevice0), gmap.a);
                        goto label_88;
                    }
                    catch(JSONException exception0) {
                    }
                    goto label_83;
                }
            }
            catch(ajku exception0) {
            label_83:
                a.ae(ajlf.a.j(), "Exception when handling the message.", exception0);
                goto label_88;
            }
        }
        catch(Throwable throwable1) {
            try {
            label_86:
                __monitor_exit(object1);
                throw throwable1;
            label_88:
                __monitor_exit(object1);
                goto label_95;
            label_90:
                ((ggtj)ajli.d.j()).B("Unknown device for received message: %s", s);
                goto label_95;
            }
            catch(Throwable throwable0) {
            }
        }
        __monitor_exit(object0);
        throw throwable0;
    label_95:
        __monitor_exit(object0);
        return;
    label_97:
        __monitor_exit(object0);
    }

    public final void f(String s, byte[] arr_b) {
        synchronized(this.b) {
            if(!this.c) {
                return;
            }
            if(this.h(s) == null) {
                ((ggtj)ajli.d.j()).B("Can\'t send message for device: %s", s);
            }
            else {
                WireMessageParams wireMessageParams0 = new WireMessageParams(s, arr_b, "easy_unlock");
                this.f.g(wireMessageParams0);
            }
        }
    }

    public final void g() {
        synchronized(this.b) {
            if(!this.c) {
                return;
            }
            evql evql0 = this.a();
            try {
                evrg.o(evql0, 5L, TimeUnit.SECONDS);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                a.ae(ajli.d.j(), "Error registering device for role", exception0);
            }
        }
    }

    private final RemoteDevice h(String s) {
        for(Object object0: this.a) {
            RemoteDevice remoteDevice0 = (RemoteDevice)object0;
            if(remoteDevice0.b.equals(s)) {
                return remoteDevice0;
            }
        }
        return null;
    }
}

