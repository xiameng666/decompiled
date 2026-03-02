import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.MessageOptions;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class fdyy implements fdwx {
    public final Map a;
    public final fdyq b;
    public final fdxz c;
    public final fdza d;
    public final SharedPreferences e;
    public final fdvx f;
    public final ffmv g;
    public volatile fdyu h;
    public volatile String i;
    public final fdye j;
    public final clht k;
    private final bsoj l;
    private final fdsh m;
    private final ffew n;
    private final fedp o;
    private final SharedPreferences.OnSharedPreferenceChangeListener p;

    public fdyy(fdye fdye0, bsoj bsoj0, fdyq fdyq0, fdxz fdxz0, ffew ffew0, fedp fedp0, fdvx fdvx0, ffmv ffmv0, fdso fdso0, fdsh fdsh0, SharedPreferences sharedPreferences0) {
        this.a = new ConcurrentHashMap();
        fdyx fdyx0 = new fdyx(this);
        this.p = fdyx0;
        this.e = sharedPreferences0;
        this.l = bsoj0;
        this.f = fdvx0;
        this.g = ffmv0;
        batl.s(fdye0);
        this.j = fdye0;
        this.b = fdyq0;
        this.c = fdxz0;
        this.n = ffew0;
        this.o = fedp0;
        this.m = fdsh0;
        this.d = new fdza(fdso0);
        HandlerThread handlerThread0 = new HandlerThread("RpcTransportHandler", 0);
        handlerThread0.start();
        this.k = new clht(handlerThread0.getLooper());
        ffem.e(sharedPreferences0, fdyx0);
        if(Log.isLoggable("rpctransport", 2)) {
            Log.v("rpctransport", "SharedPreferences change listener registered");
        }
    }

    static MessageOptions a(ffbw ffbw0) {
        int v = ffbv.a(ffbw0.n);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 2) {
            v1 = 0;
        }
        return new MessageOptions(v1);
    }

    public static fdvw b(String s, boolean z, String s1) {
        if(z) {
            return new fdvw(ffaw.i, s1, null);
        }
        if(!Objects.equals(s1, "com.google.android.gms") && !Objects.equals(s1, "com.google.android.wearable.app")) {
            return new fdvw(ffaw.h, s1, null);
        }
        if(TextUtils.isEmpty(s)) {
            s = "(no path)";
        }
        return new fdvw(ffaw.h, s1, s);
    }

    public final ffbw c(int v, int v1, fdpl fdpl0, String s, String s1, byte[] arr_b, feyj feyj0, boolean z, fdyr fdyr0, MessageOptions messageOptions0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw.b(((ffbw)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((ffbw)hftv0).b |= 0x20;
        ((ffbw)hftv0).g = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ffbw)hftv1).b |= 0x200;
        ((ffbw)hftv1).k = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw0 = (ffbw)hftp0.b_message;
        boolean z1 = true;
        ffbw0.b |= 1;
        ffbw0.c = v1;
        String s2 = fdpl0.b;
        batl.s(s2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw1 = (ffbw)hftp0.b_message;
        int v2 = 2;
        ffbw1.b |= 2;
        ffbw1.d = s2;
        String s3 = fdpl0.d;
        batl.s(s3);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw2 = (ffbw)hftp0.b_message;
        ffbw2.b |= 4;
        ffbw2.e = s3;
        batl.s(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw3 = (ffbw)hftp0.b_message;
        ffbw3.b |= 8;
        ffbw3.f = s;
        String s4 = this.j.a().a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s4.getClass();
        ((ffbw)hftv2).b |= 0x80;
        ((ffbw)hftv2).i = s4;
        if(messageOptions0.a == 1) {
            v2 = 3;
        }
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((ffbw)hftv3).n = v2 - 1;
        ((ffbw)hftv3).b |= 0x1000;
        if(z) {
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw4 = (ffbw)hftp0.b_message;
            ffbw4.b |= 0x400;
            ffbw4.l = true;
        }
        if(fdyr0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw5 = (ffbw)hftp0.b_message;
            ffbw5.b |= 0x800;
            ffbw5.m = fdyr0.a;
        }
        if(arr_b != null && feyj0 != null) {
            z1 = false;
        }
        batl.c(z1, "can\'t set data and channel");
        if(feyj0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffbw)hftp0.b_message).j = feyj0;
            ((ffbw)hftp0.b_message).b |= 0x100;
        }
        if(arr_b != null) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw6 = (ffbw)hftp0.b_message;
            ffbw6.b |= 0x40;
            ffbw6.h = hfsf0;
        }
        return (ffbw)hftp0.N_build();
    }

    public final boolean d(String s) {
        return Objects.equals(this.j.a().a, s);
    }

    public static boolean e(String s, String s1) {
        return Objects.equals(s, "com.google.android.wearable.app") && s1.startsWith("/s3");
    }

    @Override  // fdwx
    public final void f(String s, ffau ffau0, fdwt fdwt0) {
        if((ffau0.b & 0x100) != 0) {
            this.p(s, (ffau0.k == null ? ffbw.a : ffau0.k));
        }
        if((ffau0.b & 0x200) != 0) {
            this.p(s, (ffau0.l == null ? ffbw.a : ffau0.l));
        }
        if((ffau0.b & 0x2000) != 0) {
            this.p(s, (ffau0.p == null ? ffbw.a : ffau0.p));
        }
    }

    @Override  // fdwx
    public final void g(String s, fdww fdww0) {
    }

    @Override  // fdwx
    public final void h(fdwy fdwy0, fdww fdww0) {
        String s = fdwy0.b().a;
        this.a.put(s, fdwy0);
    }

    @Override  // fdwx
    public final void i(String s) {
        this.a.remove(s);
    }

    @Override  // fdwx
    public final boolean j() {
        return false;
    }

    public static boolean k(String s) {
        if(fdsl.a.a.equals(s)) {
            return false;
        }
        try {
            UUID.fromString(s);
            return false;
        }
        catch(IllegalArgumentException unused_ex) {
            try {
                Long.parseLong(s, 16);
                return false;
            }
            catch(NumberFormatException unused_ex) {
                if(Log.isLoggable("rpctransport", 2)) {
                    Log.v("rpctransport", a.a(s, "nodeLooksMadeUp: nodeId ", " doesn\'t look like a uuid or integer, assuming made up"));
                }
                return true;
            }
        }
    }

    public final boolean l(String s, ffbw ffbw0) {
        fdym fdym0;
        int v6;
        int v = 4;
        feyj feyj0 = null;
        if(this.j.a().a.equals(ffbw0.f)) {
            fdyr fdyr0 = (ffbw0.b & 0x800) == 0 ? null : new fdyr(ffbw0.m, ffbw0.h.toByteArray());
            fdyu fdyu0 = this.h;
            int v1 = ffbw0.k;
            int v2 = ffbw0.c;
            String s1 = ffbw0.i;
            fdpl fdpl0 = fdpl.a(ffbw0.d, ffbw0.e);
            fdpl fdpl1 = this.n.a(s1, fdpl0);
            String s2 = ffbw0.g;
            byte[] arr_b = ffbw0.h.toByteArray();
            String s3 = ffbw0.i;
            if((ffbw0.b & 0x100) != 0) {
                feyj0 = ffbw0.j;
                if(feyj0 == null) {
                    feyj0 = feyj.a;
                }
            }
            boolean z = ffbw0.l;
            MessageOptions messageOptions0 = fdyy.a(ffbw0);
            if(v1 <= 0) {
                fdyu0.f(v1, v2, fdpl1, s2, arr_b, s3, feyj0, z, fdyr0, messageOptions0);
                return true;
            }
            String s4 = fdyu.d(fdpl1.b, s3, s2, messageOptions0);
            HashMap hashMap0 = fdyu0.j;
            synchronized(hashMap0) {
                fdym0 = (fdym)hashMap0.get(s4);
                if(fdym0 == null) {
                    fdym0 = new fdym(s4, fdyu0);
                    hashMap0.put(s4, fdym0);
                }
            }
            fdyt fdyt0 = new fdyt(fdpl1, s2, v1, v2, arr_b, s3, feyj0, z, fdyr0, messageOptions0);
            long v4 = SystemClock.elapsedRealtime();
            fdym0.a(fdyt0, v1, fdyt0.d, v4);
            return true;
        }
        if(ffbw0.f.equals(s)) {
            if(Log.isLoggable("rpctransport", 3)) {
                Log.d("rpctransport", "sendRpcInternal: dropping since target is the same as the last hop, " + s + ", " + ffda.a(ffbw0));
            }
            this.g.j("unknown", ffbw0, a.a(s, "last hop (", ") is same as target"));
            this.q(ffbw0, 4);
            return false;
        }
        hzvv.d();
        if(hzvv.c() && (this.o != null && !this.o.f(ffbw0.f, fdpl.a(ffbw0.d, ffbw0.e)))) {
            ffmn.e("rpctransport", "sendRpcInternal: DataTargetValidation - Target NOT valid. - Target nodeId: %s, Target AppKey: %s, RpcRequestId: %s", new Object[]{ffbw0.f, fdpl.a(ffbw0.d, ffbw0.e), ((int)ffbw0.c)});
            this.g.j(ffbw0.f, ffbw0, "Target is NOT valid");
            this.q(ffbw0, 18);
            fdny.b(fdnv.e, ffbw0.d);
            return false;
        }
        fdxn fdxn0 = this.b.a(ffbw0.f);
        if(fdxn0 != null) {
            if(Log.isLoggable("rpctransport", 3)) {
                Log.d("rpctransport", "sendRpcInternal: found route, " + fdxn0.toString() + ", " + ffda.a(ffbw0));
            }
            String s5 = fdxn0.a;
            if(s5.equals(s)) {
                if(Log.isLoggable("rpctransport", 3)) {
                    Log.d("rpctransport", "sendRpcInternal: the best route, " + fdxn0.toString() + ", is the same as the node that sent this to us " + s + ", dropping " + ffda.a(ffbw0));
                }
                this.g.j("unknown", ffbw0, a.a(s, "the best route is the last hop (", ")"));
                this.q(ffbw0, 5);
                return false;
            }
            fdwy fdwy0 = (fdwy)this.a.get(s5);
            if(fdwy0 == null) {
                if(Log.isLoggable("rpctransport", 3)) {
                    Log.d("rpctransport", "sendRpcInternal: rpcWriter for " + fdxn0.toString() + " is null, send failed. " + ffda.a(ffbw0));
                }
                fdob.h(8, ffbw0.d);
                this.g.j(s5, ffbw0, a.a(s5, "rpcWriter for ", " is null"));
                this.q(ffbw0, 3);
                return false;
            }
            if(fdwy0 == fdsl.b) {
                if(Log.isLoggable("rpctransport", 3)) {
                    Log.d("rpctransport", "sendRpcInternal: sending to cloud, " + ffda.a(ffbw0));
                }
                return this.s(ffbw0);
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
            if(ffbw0.l) {
            label_92:
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffau ffau2 = (ffau)hftp0.b_message;
                ffbw0.getClass();
                ffau2.p = ffbw0;
                ffau2.b |= 0x2000;
            }
            else {
                int v5 = ffbw0.b;
                if((v5 & 0x800) != 0) {
                    goto label_92;
                }
                else if((v5 & 0x100) != 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ffau ffau0 = (ffau)hftp0.b_message;
                    ffbw0.getClass();
                    ffau0.l = ffbw0;
                    ffau0.b |= 0x200;
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ffau ffau1 = (ffau)hftp0.b_message;
                    ffbw0.getClass();
                    ffau1.k = ffbw0;
                    ffau1.b |= 0x100;
                }
            }
            if(fdyy.e(ffbw0.d, ffbw0.g)) {
                v6 = 8;
            }
            else {
                if(fdyy.a(ffbw0).a == 1) {
                    v = 10;
                }
                else if((ffbw0.b & 0x100) != 0 && hzyw.a.b().a()) {
                    v = 9;
                }
                v6 = v;
            }
            try {
                fdwy0.c(v6, 0L, ((ffau)hftp0.N_build()), null);
                this.g.i(s5, ffbw0);
                this.q(ffbw0, 0);
                if(Log.isLoggable("rpctransport", 2)) {
                    Log.v("rpctransport", "writeRpcToWriter: success: " + ffda.a(ffbw0));
                }
                return true;
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("rpctransport", 2)) {
                    Log.v("rpctransport", "writeRpcToWriter: failed: " + ffda.a(ffbw0), iOException0);
                }
                this.g.j(s5, ffbw0, "IOException from MessageWriter: " + iOException0.getMessage());
                this.q(ffbw0, 6);
                if(Log.isLoggable("rpctransport", 2)) {
                    return false;
                }
                Log.v("rpctransport", "writeRpcToWriter: failed: " + ffda.a(ffbw0));
                return false;
            }
            catch(InterruptedException interruptedException0) {
                if(Log.isLoggable("rpctransport", 2)) {
                    Log.v("rpctransport", "writeRpcToWriter: failed: " + ffda.a(ffbw0), interruptedException0);
                }
                this.g.j(s5, ffbw0, "InterruptedException from MessageWriter: " + interruptedException0.getMessage());
                this.q(ffbw0, 7);
                Thread.currentThread().interrupt();
                return true;
            }
        }
        this.o(ffbw0);
        this.q(ffbw0, 2);
        return false;
    }

    public final void m(ffbw ffbw0, int v) {
        this.r(ffbw0, 3, v);
    }

    public static final void n(ffbw ffbw0, int v, int v1, int v2) {
        if(hzxv.h()) {
            fdnh fdnh0 = new fdnh();
            fdnh0.c(ffbw0.d);
            fdnh0.b = v1;
            fdnh0.e = v;
            int v3 = ffbw0.b;
            if((v3 & 0x20) != 0) {
                fdnh0.a = ffbw0.g;
            }
            if((v3 & 0x100) == 0) {
                fdnh0.c = ffbw0.l ? 3 : 2;
                fdnh0.b(((v3 & 0x40) == 0 ? 0 : ffbw0.h.size()));
            }
            else {
                fdoy.b(fdnh0, (ffbw0.j == null ? feyj.a : ffbw0.j));
            }
            fdnh0.d = v2;
            fdnd fdnd0 = fdob.b().c;
            if(fdnd0 != null) {
                fdnd0.b(fdnh0.a());
            }
        }
    }

    public final void o(ffbw ffbw0) {
        if(Log.isLoggable("rpctransport", 3)) {
            Log.d("rpctransport", "sendRpcInternal: can\'t find route, " + ffda.a(ffbw0));
        }
        fdob.h(7, ffbw0.d);
        this.g.j("unknown", ffbw0, "no route to target");
    }

    private final void p(String s, ffbw ffbw0) {
        ProtoLiteBuilder hftp0;
        if(Log.isLoggable("rpctransport", 2)) {
            Log.v("rpctransport", "onRpcRequestFromMessageProto: " + ffda.a(ffbw0));
        }
        if(ffbw0.i.isEmpty()) {
            hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffbw0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ffbw0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw1 = (ffbw)hftp0.b_message;
            s.getClass();
            ffbw1.b |= 0x80;
            ffbw1.i = s;
        }
        else {
            hftp0 = null;
        }
        if(fdyy.k(ffbw0.f)) {
            if(hftp0 == null) {
                hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffbw0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)ffbw0));
            }
            String s1 = this.j.a().a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw2 = (ffbw)hftp0.b_message;
            s1.getClass();
            ffbw2.b |= 8;
            ffbw2.f = s1;
        }
        if(hftp0 != null) {
            ffbw0 = (ffbw)hftp0.N_build();
            if(Log.isLoggable("rpctransport", 2)) {
                Log.v("rpctransport", "onRpcRequestFromMessageProto, updated request: " + ffda.a(ffbw0));
            }
        }
        this.g.d(s, ffbw0);
        if(this.l(s, ffbw0)) {
            fdny.b(fdnv.a, ffbw0.d);
            return;
        }
        fdny.b(fdnv.b, ffbw0.d);
    }

    private final void q(ffbw ffbw0, int v) {
        this.r(ffbw0, 4, v);
    }

    private final void r(ffbw ffbw0, int v, int v1) {
        int v2 = 1;
        if((ffbw0.b & 8) != 0) {
            v2 = ffbw0.f.equals(this.j.a().a) ? 2 : 3;
        }
        fdyy.n(ffbw0, v2, v, v1);
    }

    private final boolean s(ffbw ffbw0) {
        byte[] arr_b3;
        int v12;
        byte[] arr_b2;
        int v11;
        int v10;
        int v8;
        int v5;
        boolean z;
        if(!ffgp.b().E()) {
            if(Log.isLoggable("rpctransport", 3)) {
                Log.d("rpctransport", "Not connected to cloud. Skip sending rpc to cloud.");
            }
            this.g.j(fdsl.a.a, ffbw0, "next hop is the cloud, but not connected");
            this.m(ffbw0, 8);
            return false;
        }
        if(ffbw0.d.equals("com.google.android.wearable.app") && ffbw0.g.startsWith("/clockwork_proxy/proxy")) {
            if(Log.isLoggable("rpctransport", 3)) {
                Log.d("rpctransport", "Not sending proxy rpc to cloud node.");
            }
            fdny.b(fdnv.g, ffbw0.d);
            this.m(ffbw0, 9);
            return false;
        }
        String s = this.c.a();
        if(s == null) {
            this.g.j(fdsl.a.a, ffbw0, "next hop is the cloud, but not configured");
            this.m(ffbw0, 10);
            return false;
        }
        String s1 = this.i;
        int v = 2;
        if(s1 != null) {
            if(Log.isLoggable("rpctransport", 2)) {
                Log.v("rpctransport", String.format("Not sending RPC to cloud during migration for node:%s", s1));
            }
            this.g.j(fdsl.a.a, ffbw0, "Not sending RPC to cloud during migration");
            this.m(ffbw0, 11);
            return false;
        }
        try {
            fdvw fdvw0 = fdyy.b(ffbw0.g, (ffbw0.b & 0x100) != 0, ffbw0.d);
            if(hzuz.r()) {
                fdsh fdsh0 = this.m;
                byte[] arr_b = fdza.b(ffbw0);
                String s2 = ffbw0.g;
                fdso fdso0 = this.d.a;
                if(fdso0.o()) {
                    String s3 = (ffbw0.b & 0x100) == 0 ? fdso0.h(s2) : null;
                    arr_b = fdso0.q(arr_b, s3);
                    z = true;
                    s2 = s3;
                }
                else {
                    z = false;
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzw.a).v_newBuilder();
                String s4 = ffbw0.i;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s4.getClass();
                ((hkzw)hftv0).f = s4;
                String s5 = ffbw0.d;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s5.getClass();
                ((hkzw)hftv1).h = s5;
                String s6 = ffbw0.e;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                s6.getClass();
                ((hkzw)hftv2).i = s6;
                int v1 = ffbw0.c;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                ((hkzw)hftv3).j = v1;
                String s7 = ffbw0.f;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp0.b_message;
                s7.getClass();
                ((hkzw)hftv4).g = s7;
                int v2 = ffbw0.k;
                if(!hftv4.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp0.b_message;
                ((hkzw)hftv5).k = v2;
                boolean z1 = ffbw0.l;
                if(!hftv5.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp0.b_message;
                ((hkzw)hftv6).m = z1;
                int v3 = ffbw0.m;
                if(!hftv6.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hkzw)hftp0.b_message).n = v3;
                long v4 = Long.parseLong(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp0.b_message;
                ((hkzw)hftv7).e = v4;
                if(!hftv7.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hkzw)hftp0.b_message).o = z;
                if(hzuz.k()) {
                    switch((ffbv.a(ffbw0.n) == 0 ? 1 : ffbv.a(ffbw0.n)) - 1) {
                        case 1: {
                            v = 3;
                            break;
                        }
                        case 2: {
                            v = 4;
                        }
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hkzw)hftp0.b_message).l = v - 2;
                }
                if((ffbw0.b & 0x100) == 0) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hkzv.a).v_newBuilder();
                    String s8 = gfta.b(s2);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((hkzv)hftp2.b_message).b = s8;
                    ByteString hfsf1 = ByteString.copyFrom(arr_b);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((hkzv)hftp2.b_message).c = hfsf1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hkzw hkzw1 = (hkzw)hftp0.b_message;
                    hkzv hkzv0 = (hkzv)hftp2.N_build();
                    hkzv0.getClass();
                    hkzw1.d = hkzv0;
                    hkzw1.c = 13;
                }
                else {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkzs.a).v_newBuilder();
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hkzs)hftp1.b_message).b = hfsf0;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hkzw hkzw0 = (hkzw)hftp0.b_message;
                    hkzs hkzs0 = (hkzs)hftp1.N_build();
                    hkzs0.getClass();
                    hkzw0.d = hkzs0;
                    hkzw0.c = 12;
                }
                hkzw hkzw2 = (hkzw)hftp0.N_build();
                fdsd fdsd0 = new fdsd(hkzw2);
                fdsh0.w.a.offer(fdsd0);
                if(hzuz.r()) {
                    fdsh0.j.b(5);
                }
                else {
                    fdsh0.i.f(5);
                }
                fdob.i(6, ffbw0.d);
                if(Log.isLoggable("rpctransport", 3)) {
                    Log.d("rpctransport", "sent RPC to cloudsync, " + hkzw2);
                }
            }
            else {
                fdvx fdvx0 = this.f;
                fdvx0.a(fdvw0, "msgsSent", 1);
                fdvx0.a(fdvw0, "bytesSent", ffbw0.h.size());
                fdza fdza0 = this.d;
                byte[] arr_b1 = fdza.b(ffbw0);
                String s9 = ffbw0.g;
                fdso fdso1 = fdza0.a;
                if(fdso1.o()) {
                    s9 = (ffbw0.b & 0x100) == 0 ? fdso1.h(s9) : null;
                    arr_b1 = fdso1.q(arr_b1, s9);
                    v5 = 1;
                }
                else {
                    v5 = 0;
                }
                int v6 = arr_b1 == null || arr_b1.length == 0 ? 1 : arr_b1.length / fdza0.b + (arr_b1.length % fdza0.b == 0 ? 0 : 1);
                Bundle[] arr_bundle = new Bundle[v6];
                int v7 = v6 <= 1 ? 0 : fdza.c(ffbw0, s9, arr_b1);
                if(arr_b1 == null) {
                    v8 = 0;
                    arr_b1 = null;
                }
                else {
                    v8 = arr_b1.length;
                }
                int v9 = 0;
                while(v9 < v6) {
                    if(v6 <= 1) {
                        v10 = v9;
                        v11 = v8;
                        arr_b2 = arr_b1;
                        v12 = v5;
                    }
                    else {
                        v10 = v9;
                        int v13 = v10 * fdza0.b;
                        v11 = v8;
                        int v14 = Math.min(fdza0.b, arr_b1.length - v13);
                        arr_b2 = new byte[v14];
                        v12 = v5;
                        System.arraycopy(arr_b1, v13, arr_b2, 0, v14);
                    }
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("type", "rpc");
                    bundle0.putString("networkId", s);
                    bundle0.putString("sourceNodeId", ffbw0.i);
                    bundle0.putString("pkgName", ffbw0.d);
                    bundle0.putString("pkgCert", ffbw0.e);
                    bundle0.putString("requestId", Integer.toString(ffbw0.c));
                    bundle0.putString("targetNodeId", ffbw0.f);
                    bundle0.putString("generation", Integer.toString(ffbw0.k));
                    if((ffbw0.b & 0x100) == 0) {
                        arr_b3 = arr_b1;
                        bundle0.putString("path", s9);
                        bundle0.putString("isChannel", "0");
                        if(arr_b3 != null) {
                            bundle0.putByteArray("rawData", arr_b2);
                        }
                    }
                    else {
                        arr_b3 = arr_b1;
                        bundle0.putString("isChannel", "1");
                        bundle0.putByteArray("rawData", arr_b2);
                    }
                    if(hzuz.k()) {
                        bundle0.putString("priority", Integer.toString((ffbv.a(ffbw0.n) == 0 ? 1 : ffbv.a(ffbw0.n)) - 1));
                    }
                    bundle0.putString("requiresResponse", Boolean.toString(ffbw0.l));
                    if((ffbw0.b & 0x800) != 0) {
                        bundle0.putString("senderRequestId", Integer.toString(ffbw0.m));
                    }
                    if(v6 > 1) {
                        if(v10 == 0) {
                            if(Log.isLoggable("rpctransport", 2)) {
                                Log.v("rpctransport", a.x(v6, v7, "splitting message hash ", " into ", " splits"));
                            }
                            v10 = 0;
                        }
                        bundle0.putString("cw_split", Integer.toString(v10));
                        bundle0.putString("cw_numSplits", Integer.toString(v6));
                        bundle0.putString("cw_hash", Integer.toString(v7));
                        bundle0.putString("cw_maxSplitLen", Integer.toString(fdza0.b));
                        bundle0.putString("cw_totalSize", Integer.toString(v11));
                    }
                    if(v12 != 0) {
                        bundle0.putString("encrypted", Boolean.toString(true));
                    }
                    arr_bundle[v10] = bundle0;
                    v9 = v10 + 1;
                    v8 = v11;
                    v5 = v12;
                    arr_b1 = arr_b3;
                }
                for(int v15 = 0; v15 < v6; ++v15) {
                    Bundle bundle1 = arr_bundle[v15];
                    fdvx0.a(fdvw0, "chunksSent", 1);
                    String s10 = hzzi.l() + "@google.com";
                    this.l.c(s10, Integer.toString(ffbw0.c), 0L, bundle1);
                    fdob.i(6, ffbw0.d);
                    if(Log.isLoggable("rpctransport", 3)) {
                        Log.d("rpctransport", "sent RPC to cloud, " + bundle1);
                    }
                }
            }
            this.m(ffbw0, 0);
            this.g.i(fdsl.a.a, ffbw0);
            return true;
        }
        catch(IOException iOException0) {
            Log.w("rpctransport", "error sending RPC to cloud");
            this.g.j(fdsl.a.a, ffbw0, "IOException while sending to cloud: " + iOException0.getMessage());
            this.m(ffbw0, 14);
            return false;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            this.g.j(fdsl.a.a, ffbw0, "GeneralSecurityException while sending to cloud: " + generalSecurityException0.getMessage());
            this.m(ffbw0, 15);
            return false;
        }
    }
}

