import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class fdyu implements fdyk, ferc, ffmd {
    public static final AtomicReference a;
    public final ffmv b;
    public final fdyb c;
    public final fepj d;
    public final AtomicReference e;
    public final AtomicReference f;
    public final AtomicReference g;
    public final Object h;
    public final AtomicReference i;
    public final HashMap j;
    public ffgl k;
    public fdri l;
    private static final ggfp m;
    private final fdpl n;
    private final feqp o;
    private final boolean p;
    private final Set q;
    private final HashMap r;

    static {
        fdyu.a = new AtomicReference();
        fdyu.m = ggfp.L("com.google.android.wearable.datatransfer.OPEN_CONNECTION", "com.google.android.wearable.datatransfer.DATA_TRANSFER", "com.google.android.wearable.datatransfer.DATA_TRANSFER_ACK");
    }

    public fdyu(fdpl fdpl0, ffmv ffmv0, fdyb fdyb0, fepj fepj0, feqp feqp0) {
        this.e = new AtomicReference();
        this.f = new AtomicReference();
        this.g = new AtomicReference();
        this.h = new Object();
        this.q = Collections.newSetFromMap(new ConcurrentHashMap());
        this.i = new AtomicReference();
        this.r = new HashMap();
        this.j = new HashMap();
        this.n = fdpl0;
        this.b = ffmv0;
        this.c = fdyb0;
        this.p = hzyw.a.b().c();
        this.d = fepj0;
        this.o = feqp0;
    }

    @Override  // ffmd
    public final void G() {
        ((SharedPreferences)this.i.get()).edit().clear().commit();
        synchronized(this.r) {
            this.r.clear();
        }
        synchronized(this.j) {
            this.j.clear();
        }
    }

    static int a(int v, int v1) {
        return (v + 0x20F) * 0x1F + v1;
    }

    public final int b(fdpl fdpl0, String s, boolean z, String s1, byte[] arr_b, feyj feyj0, ffeq ffeq0, fdyr fdyr0, MessageOptions messageOptions0) {
        int v12;
        int v11;
        int v5;
        int v4;
        fdyr fdyr1;
        int v14;
        int v13;
        MessageOptions messageOptions1;
        String s10;
        fdyy fdyy1;
        feyj feyj1;
        String s9;
        boolean z2;
        fdpl fdpl1;
        byte[] arr_b5;
        String s8;
        int v7;
        byte[] arr_b2;
        String s5;
        int v;
        if(Objects.equals(s, "cloud")) {
            return 1;
        }
        hzya.i();
        if(!ffgp.m() && hzya.e()) {
            try {
                fepj fepj0 = this.d;
                if(fdyr0 == null) {
                    ghki ghki0 = fepj.a;
                    if(!(s1 instanceof String)) {
                        String s2 = ghki0.a;
                        int v1 = s2.length();
                        if(s1.length() >= v1) {
                            int v2 = 0;
                            while(true) {
                                if(v2 >= v1) {
                                    goto label_21;
                                }
                                if(s2.charAt(v2) != s1.charAt(v2)) {
                                    break;
                                }
                                ++v2;
                            }
                        }
                        v = -1;
                    }
                    else if(!s1.startsWith(ghki0.a)) {
                        v = -1;
                    }
                    else {
                        goto label_21;
                    }
                }
                else {
                label_21:
                    ggeo ggeo0 = fepj0.b(s).c;
                    Integer integer0 = (Integer)ggeo0.get(new feoy(fdpl0, s1));
                    if(integer0 != null) {
                        v = (int)integer0;
                    }
                    else if(ffgp.l() && Objects.equals(s1, "/mcu/echo_service")) {
                        Integer integer1 = (Integer)ggeo0.get(new feoy(ffgp.a, s1));
                        v = integer1 == null ? -1 : ((int)integer1);
                    }
                    else {
                        v = -1;
                    }
                }
                if(v == -1) {
                    v7 = -1;
                    s5 = s1;
                }
                else {
                    String s3 = fdpl0.b;
                    Integer integer2 = v;
                    ffmn.a("rpcs", "Sending message to node %s, app %s, path %s though offload path: endpoint %d", new Object[]{s, ffmr.a(s3), s1, integer2});
                    if(fdyr0 == null) {
                        byte[] arr_b1 = arr_b == null ? new byte[0] : arr_b;
                        if(ffeq0 == null) {
                            s5 = s1;
                            if(Log.isLoggable("rpcs", 3) || this.p) {
                                Log.d("rpcs", String.format("sendOffloadedMessage: (message:0), %s, size %d, %s", ffmr.a(fdpl0.b), ((int)arr_b1.length), s5));
                            }
                            ferb ferb1 = this.o.a(s);
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wtr.a).v_newBuilder();
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)wta.a).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ((wta)hftp3.b_message).b = v;
                            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ((wta)hftp3.b_message).c = hfsf1;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            wtr wtr1 = (wtr)hftp2.b_message;
                            wta wta0 = (wta)hftp3.N_build();
                            wta0.getClass();
                            wtr1.c = wta0;
                            wtr1.b = 2;
                            ferb1.a(((wtr)hftp2.N_build()));
                            fdny.a(fdnm.h);
                            v7 = 0;
                        }
                        else {
                            String s4 = fdyu.d(s3, s, s1, new MessageOptions(0));
                            synchronized(this.r) {
                                fdys fdys0 = this.h(s4, false);
                                v4 = fdys0.a;
                                v5 = fdys0.a();
                            }
                            int v6 = fdyu.a(v4, v5);
                            if(!Log.isLoggable("rpcs", 3) && !this.p) {
                                s5 = s1;
                                arr_b2 = arr_b1;
                                v7 = v6;
                            }
                            else {
                                v7 = v6;
                                arr_b2 = arr_b1;
                                s5 = s1;
                                Log.d("rpcs", String.format("sendOffloadedMessage: (request:%11s:%d:%d), %s, size %d, %s", s4, v4, v6, ffmr.a(fdpl0.b), ((int)arr_b1.length), s1));
                            }
                            this.c.b.put(Integer.valueOf(v7), integer2);
                            this.c.a(v7, ffeq0);
                            ferb ferb0 = this.o.a(s);
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wtr.a).v_newBuilder();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wtc.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((wtc)hftv0).b = v;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((wtc)hftp1.b_message).c = v7;
                            ByteString hfsf0 = ByteString.copyFrom(arr_b2);
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((wtc)hftp1.b_message).d = hfsf0;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            wtr wtr0 = (wtr)hftp0.b_message;
                            wtc wtc0 = (wtc)hftp1.N_build();
                            wtc0.getClass();
                            wtr0.c = wtc0;
                            wtr0.b = 3;
                            ferb0.a(((wtr)hftp0.N_build()));
                            fdny.a(fdnm.i);
                        }
                    }
                    else {
                        byte[] arr_b3 = fdyr0.b == null ? new byte[0] : fdyr0.b;
                        if(Log.isLoggable("rpcs", 3) || this.p) {
                            String s6 = ffmr.a(s3);
                            Log.d("rpcs", String.format("sendOffloadedMessage: (response:%d), %s, size %d", ((int)fdyr0.a), s6, ((int)arr_b3.length)));
                        }
                        int v8 = fdyr0.a - 0x3FB2;
                        ferb ferb2 = this.o.a(s);
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)wtr.a).v_newBuilder();
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)wtd.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((wtd)hftp5.b_message).b = v8;
                        ByteString hfsf2 = ByteString.copyFrom(arr_b3);
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((wtd)hftp5.b_message).c = hfsf2;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        wtr wtr2 = (wtr)hftp4.b_message;
                        wtd wtd0 = (wtd)hftp5.N_build();
                        wtd0.getClass();
                        wtr2.c = wtd0;
                        wtr2.b = 4;
                        ferb2.a(((wtr)hftp4.N_build()));
                        fdny.a(fdnm.j);
                        v7 = 0;
                        s5 = s1;
                    }
                }
            }
            catch(IOException iOException0) {
                ffmn.g("rpcs", iOException0, "failed to send to offload connection %s", new Object[]{s});
                fdny.a(fdnm.g);
                return -1;
            }
            if(v7 != -1) {
                return v7;
            }
        }
        else {
            s5 = s1;
        }
        fdxu fdxu0 = (fdxu)this.g.get();
        fdyy fdyy0 = (fdyy)this.e.get();
        if(fdxu0 != null && fdyu.m.contains(s5)) {
            synchronized(fdxu0.d) {
                fdxu0.r();
                fdyo fdyo0 = fdxu0.g.b(s);
                boolean z1 = fdyo0 != null && fdyo0.d;
            }
            if(z1) {
                if(Log.isLoggable("rpcs", 3)) {
                    Log.d("rpcs", "Data transfer packet dropped, because connection is metered");
                }
                fdny.c(fdnv.d, fdpl0.b, fdpl0.c);
                fdyu.i(fdpl0, feyj0, fdyr0, s1, arr_b, 3, 16);
                return -1;
            }
        }
        if(bbqa.a()) {
            hzxo.c();
            if(hzxo.a.b().b() && fdyy0.d(s)) {
                ffmn.a("rpcs", "Dropping RPC targeting same/local node", new Object[0]);
                ffbw ffbw0 = fdyy0.c(-1, -1, fdpl0, s, s1, arr_b, feyj0, false, null, messageOptions0);
                ffmn.a("rpctransport", "Dropping RPC because the target is the local node: %s", new Object[]{ffda.a(ffbw0)});
                fdny.c(fdnv.d, fdpl0.b, fdpl0.c);
                fdyy.n(ffbw0, 3, 2, 19);
                fdyy0.g.j("unknown", ffbw0, "target is local node");
                return -1;
            }
        }
        byte[] arr_b4 = arr_b;
        if(!fdyy0.d(s)) {
            fdxn fdxn0 = fdyy0.b.a(s);
            if(fdxn0 == null || !fdyy0.a.containsKey(fdxn0.a)) {
                fdny.c(fdnv.d, fdpl0.b, fdpl0.c);
                fdyy0.o(fdyy0.c(-1, -1, fdpl0, s, s1, arr_b4, feyj0, false, null, messageOptions0));
                fdyu.i(fdpl0, feyj0, fdyr0, s1, arr_b, 3, 2);
                return -1;
            }
        }
        String s7 = fdyu.d(fdpl0.b, s, s1, messageOptions0);
        synchronized(this.r) {
            fdys fdys1 = this.h(s7, z);
            v11 = fdys1.a;
            v12 = fdys1.a();
        }
        if(Log.isLoggable("rpcs", 2) || this.p) {
            if(feyj0 == null) {
                if(arr_b4 == null) {
                    s8 = "null";
                    arr_b5 = null;
                }
                else {
                    s8 = String.valueOf(arr_b4.length);
                    arr_b5 = arr_b4;
                }
                Log.d("rpcs", String.format("sendMessage: (%11s:%d:%d), %s, size %s, %s", s7, v11, v12, ffmr.a(fdpl0.b), s8, s1));
                arr_b4 = arr_b5;
            }
            else {
                Log.d("rpcs", String.format("sendMessage: (%11s:%d:%d), %s, channel request", s7, v11, v12, ffmr.a(fdpl0.b)));
            }
        }
        if(ffeq0 == null) {
            fdpl1 = fdpl0;
            z2 = false;
            s9 = s1;
            fdyy1 = fdyy0;
            s10 = s;
            messageOptions1 = messageOptions0;
            v13 = v11;
            v14 = v12;
            fdyr1 = fdyr0;
            feyj1 = feyj0;
        }
        else {
            this.c.a(fdyu.a(v11, v12), ffeq0);
            fdpl1 = fdpl0;
            z2 = true;
            s9 = s1;
            feyj1 = feyj0;
            fdyy1 = fdyy0;
            s10 = s;
            messageOptions1 = messageOptions0;
            v13 = v11;
            v14 = v12;
            fdyr1 = fdyr0;
        }
        ffbw ffbw1 = fdyy1.c(v13, v14, fdpl1, s10, s9, arr_b4, feyj1, z2, fdyr1, messageOptions1);
        if(Log.isLoggable("rpctransport", 2)) {
            Log.v("rpctransport", "sendRpc: " + ffda.a(ffbw1));
        }
        String s11 = ffmv.b(ffbw1);
        String s12 = String.format(Locale.US, " [%s:%3d:%3d] %s %-31s %s %s", s11, ((int)ffbw1.k), ((int)ffbw1.c), ffbw1.f, ffmr.a(ffbw1.d), ffbw1.g, ffmv.a(ffbw1));
        fdyy1.g.c("send", s12);
        if(fdyy1.l(null, ffbw1)) {
            fdny.b(fdnv.c, ffbw1.d);
            return fdyu.a(v13, v14);
        }
        fdny.b(fdnv.d, ffbw1.d);
        return -1;
    }

    public static fdyu c() {
        fdyu fdyu0 = (fdyu)fdyu.a.get();
        batl.s(fdyu0);
        return fdyu0;
    }

    public static String d(String s, String s1, String s2, MessageOptions messageOptions0) {
        if(fdyy.e(s, s2)) {
            return a.r("voice", s1, ":");
        }
        return messageOptions0.a == 1 ? a.r("hi", s1, ":") : a.r("lo", s1, ":");
    }

    public final void e(fdyv fdyv0) {
        batl.s(fdyv0);
        this.q.add(fdyv0);
    }

    public final void f(int v, int v1, fdpl fdpl0, String s, byte[] arr_b, String s1, feyj feyj0, boolean z, fdyr fdyr0, MessageOptions messageOptions0) {
        Intent intent0;
        feyi feyi0;
        if(Log.isLoggable("rpcs", 2) || this.p) {
            String s2 = fdpl0.b;
            String s3 = fdyu.d(s2, "local", s, messageOptions0);
            if(feyj0 == null) {
                Log.d("rpcs", String.format("deliverMessage: (%11s:%d:%d), %s, size %s, %s", s3, v, v1, ffmr.a(s2), (arr_b == null ? "null" : String.valueOf(arr_b.length)), s));
            }
            else {
                Log.d("rpcs", String.format("deliverMessage: (%11s:%d:%d), %s, channel request", s3, v, v1, ffmr.a(s2)));
            }
        }
        if(hzyw.c()) {
            AtomicReference atomicReference0 = this.f;
            if(atomicReference0.get() == null) {
                Log.w("rpcs", "isRpcAllowed: Connection service manager is null. Allowing all RPCs.");
            }
            else if(!((felm)atomicReference0.get()).s(s1, fdpl0.b)) {
                String s4 = fdpl0.b;
                String s5 = String.format(Locale.ENGLISH, "RPCs from node \'%s\' are not allowed for \'%s\'", s1, s4);
                Log.w("rpcs", String.format("deliverReceivedMessage: %s", s5));
                if(feyj0 == null) {
                    String s6 = String.format(Locale.US, "*%s DROPPED %s", ffmv.k(messageOptions0.a, v, v1, s1, s4, s, arr_b), s5);
                    this.b.c("receive", s6);
                }
                else {
                    String s7 = String.format(Locale.US, "*%s DROPPED %s", ffmv.l(v, v1, s1, s4, s, feyj0), s5);
                    this.b.c("receive", s7);
                }
                fdyu.i(fdpl0, feyj0, fdyr0, s, arr_b, 2, 17);
                return;
            }
        }
        fdyu.i(fdpl0, feyj0, fdyr0, s, arr_b, 2, 0);
        boolean z1 = true;
        if(feyj0 != null) {
            String s8 = String.format(Locale.US, " %s", ffmv.l(v, v1, s1, fdpl0.b, s, feyj0));
            this.b.c("receive", s8);
            fdri fdri0 = this.l;
            if(fdri0 == null) {
                return;
            }
            if(Log.isLoggable("ChannelManager", 2)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("received ChannelRequest from ");
                stringBuilder0.append(s1);
                stringBuilder0.append(":");
                StringBuilder stringBuilder1 = new StringBuilder("\n  ");
                int v2 = stringBuilder1.length();
                stringBuilder0.append(stringBuilder1);
                stringBuilder0.append("minimum_version: ");
                stringBuilder0.append(feyj0.c);
                stringBuilder0.append(stringBuilder1);
                stringBuilder0.append("origin: ");
                stringBuilder0.append(feyj0.d);
                if((feyj0.b & 4) != 0) {
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("control {");
                    stringBuilder1.append("  ");
                    feye feye0 = feyj0.e == null ? feye.a : feyj0.e;
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("type: ");
                    int v3 = feyd.a(feye0.c);
                    if(v3 == 0) {
                        stringBuilder0.append("CHANNEL_CONTROL_OPEN");
                    }
                    else {
                        switch(v3) {
                            case 1: {
                                stringBuilder0.append("CHANNEL_CONTROL_OPEN");
                                break;
                            }
                            case 2: {
                                stringBuilder0.append("CHANNEL_CONTROL_OPEN_ACK");
                                break;
                            }
                            default: {
                                stringBuilder0.append("CHANNEL_CONTROL_CLOSE");
                            }
                        }
                    }
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("channel_id: ");
                    stringBuilder0.append(feye0.d);
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("from_channel_opener: ");
                    stringBuilder0.append(feye0.e);
                    fdrl.b(stringBuilder0, stringBuilder1, "package_name", feye0.f);
                    fdrl.b(stringBuilder0, stringBuilder1, "signature_digest", feye0.g);
                    fdrl.b(stringBuilder0, stringBuilder1, "path", feye0.h);
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("close_error_code: ");
                    stringBuilder0.append(feye0.i);
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("allow_over_metered: ");
                    stringBuilder0.append(feye0.j);
                    stringBuilder1.setLength(v2);
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("}");
                }
                if((feyj0.b & 8) != 0) {
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("data {");
                    stringBuilder1.append("  ");
                    feyh feyh0 = feyj0.f == null ? feyh.a : feyj0.f;
                    if((feyh0.b & 1) != 0) {
                        stringBuilder0.append(stringBuilder1);
                        stringBuilder0.append("header {");
                        stringBuilder1.append("  ");
                        fdrl.a((feyh0.c == null ? feyg.a : feyh0.c), stringBuilder0, stringBuilder1);
                        stringBuilder1.setLength(stringBuilder1.length());
                        stringBuilder0.append(stringBuilder1);
                        stringBuilder0.append("}");
                    }
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("payload: <size: ");
                    stringBuilder0.append(feyh0.d.size());
                    stringBuilder0.append(">");
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("final_message: ");
                    stringBuilder0.append(feyh0.e);
                    stringBuilder1.setLength(v2);
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("}");
                }
                if((feyj0.b & 16) != 0) {
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("data_ack {");
                    stringBuilder1.append("  ");
                    feyf feyf0 = feyj0.g == null ? feyf.a : feyj0.g;
                    int v4 = stringBuilder1.length();
                    if((feyf0.b & 1) != 0) {
                        stringBuilder0.append("header {");
                        stringBuilder1.append("  ");
                        fdrl.a((feyf0.c == null ? feyg.a : feyf0.c), stringBuilder0, stringBuilder1);
                        stringBuilder1.setLength(v4);
                        stringBuilder0.append(stringBuilder1);
                        stringBuilder0.append("}");
                    }
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("final_message: ");
                    stringBuilder0.append(feyf0.d);
                    stringBuilder1.setLength(v2);
                    stringBuilder0.append(stringBuilder1);
                    stringBuilder0.append("}");
                }
                Log.v("ChannelManager", stringBuilder0.toString());
            }
            int v5 = feyj0.c;
            if(v5 <= 1) {
                int v6 = feyj0.d;
                switch(v6) {
                    case 0: {
                        feyi0 = feyi.a;
                        break;
                    }
                    case 1: {
                        feyi0 = feyi.b;
                        break;
                    }
                    default: {
                        feyi0 = null;
                    }
                }
                if(feyi0 == null) {
                    Log.w("ChannelManager", "Dropping ChannelRequest with unknown origin: " + v6);
                    return;
                }
                int v7 = feyj0.b;
                if((v7 & 4) != 0) {
                    feye feye1 = feyj0.e == null ? feye.a : feyj0.e;
                    int v8 = feyd.a(feye1.c);
                    if(v8 != 0) {
                        switch(v8) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                if(Log.isLoggable("ChannelManager", 2)) {
                                    Log.v("ChannelManager", "Posting onChannelOpenAck: " + s1);
                                }
                                fdri0.b(new fdqw(fdri0, s1, feye1));
                                return;
                            }
                            default: {
                                if(Log.isLoggable("ChannelManager", 2)) {
                                    Log.v("ChannelManager", String.format("Posting onChannelClose(%s, request)", s1));
                                }
                                fdri0.b(new fdql(fdri0, s1, feye1));
                                return;
                            }
                        }
                    }
                    if(Log.isLoggable("ChannelManager", 2)) {
                        Log.v("ChannelManager", String.format("Posting onChannelOpenRequest(%s, request)", s1));
                    }
                    fdri0.b(new fdqv(fdri0, s1, feye1, feyi0));
                    return;
                }
                if((v7 & 8) != 0) {
                    feyh feyh1 = feyj0.f == null ? feyh.a : feyj0.f;
                    batl.s(s1);
                    batl.s(feyh1);
                    if((feyh1.b & 1) == 0) {
                        Log.w("ChannelManager", "Received ChannelDataRequest with no header");
                    }
                    if(Log.isLoggable("ChannelManager", 2)) {
                        Log.v("ChannelManager", String.format("Posting onChannelDataRequest(%s, request)", s1));
                    }
                    fdri0.b(new fdqm(fdri0, s1, feyh1));
                    return;
                }
                if((v7 & 16) == 0) {
                    return;
                }
                feyf feyf1 = feyj0.g == null ? feyf.a : feyj0.g;
                batl.s(s1);
                batl.s(feyf1);
                if((feyf1.b & 1) == 0) {
                    Log.w("ChannelManager", "Received ChannelDataAckRequest with no header");
                }
                if(Log.isLoggable("ChannelManager", 2)) {
                    Log.v("ChannelManager", String.format("Posting onChannelDataAckRequest(%s, request)", s1));
                }
                fdri0.b(new fdqn(fdri0, s1, feyf1));
                return;
            }
            Log.w("ChannelManager", "Dropping ChannelRequest with unsupported version: " + v5);
            return;
        }
        String s9 = fdpl0.b;
        fdob.h(6, s9);
        String s10 = s;
        String s11 = String.format(Locale.US, " %s", ffmv.k(messageOptions0.a, v, v1, s1, s9, s10, arr_b));
        this.b.c("receive", s11);
        if(fdyr0 != null) {
            fdyb fdyb0 = this.c;
            int v9 = fdyr0.a;
            fdyb0.c.removeMessages(v9);
            Integer integer0 = v9;
            ffeq ffeq0 = (ffeq)fdyb0.a.remove(integer0);
            if(ffeq0 == null) {
                fdyb0.d.a(0L, 1L, ayvf.b);
                Log.w("RpcResponseHandler", String.format("Could not find the response callback to deliver response to %s(%s) id: %d", ffmr.a(s9), s10, integer0));
            }
            else {
                ffeq0.a(v9, fdyr0.b);
            }
            fdyb0.b.remove(integer0);
            return;
        }
        if(Objects.equals(fdpl0, this.n)) {
            for(Object object0: this.q) {
                boolean z2 = ((fdyv)object0).a(fdyu.a(v, v1), fdpl0, s10, arr_b, s1, z);
                s10 = s10;
                if(!z2) {
                    continue;
                }
                return;
            }
        }
        synchronized(this.h) {
            ffgl ffgl0 = this.k;
            if(ffgl0 != null) {
                int v11 = fdyu.a(v, v1);
                ffgm ffgm0 = ffgl0.a;
                fdpl fdpl1 = ffgm0.F.b(fdpl0, s10);
                ffmn.e("WearableService", "onMessageReceived: %s %d", new Object[]{fdpl1, v11});
                Uri uri0 = fdzj.b(s1, s10);
                if(z) {
                    intent0 = new Intent("com.google.android.gms.wearable.REQUEST_RECEIVED", uri0).setPackage(fdpl1.c);
                }
                else {
                    intent0 = new Intent("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri0).setPackage(fdpl1.c);
                    z1 = false;
                }
                MessageEventParcelable messageEventParcelable0 = new MessageEventParcelable(v11, s10, arr_b, s1);
                ffgm0.j(fdpl1, new ffgk(ffgl0, intent0, z1, messageEventParcelable0, new fdiu(messageEventParcelable0.a, messageEventParcelable0.d, fdpl1, messageEventParcelable0.b, messageOptions0), arr_b, s1));
            }
        }
    }

    public final int g(fdpl fdpl0, String s, String s1, byte[] arr_b, ffeq ffeq0, fdyr fdyr0, MessageOptions messageOptions0) {
        batl.t(fdpl0, "appKey was null");
        batl.t(s, "target was null");
        batl.t(s1, "action was null");
        return this.b(fdpl0, s, true, s1, arr_b, null, ffeq0, fdyr0, messageOptions0);
    }

    private final fdys h(String s, boolean z) {
        int v;
        String s1 = z ? s : s + " nopreserve";
        HashMap hashMap0 = this.r;
        fdys fdys0 = (fdys)hashMap0.get(s1);
        if(fdys0 == null) {
            if(z) {
                v = ((SharedPreferences)this.i.get()).getInt(s, 1) + 1;
                ((SharedPreferences)this.i.get()).edit().putInt(s, v).apply();
            }
            else {
                v = 0;
            }
            fdys fdys1 = new fdys(v);
            hashMap0.put(s1, fdys1);
            return fdys1;
        }
        return fdys0;
    }

    private static final void i(fdpl fdpl0, feyj feyj0, fdyr fdyr0, String s, byte[] arr_b, int v, int v1) {
        if(hzxv.h()) {
            fdnh fdnh0 = new fdnh();
            fdnh0.c(fdpl0.b);
            fdnh0.b = 1;
            fdnh0.e = v;
            if(!gfta.c(s)) {
                fdnh0.a = s;
            }
            if(feyj0 == null) {
                fdnh0.c = fdyr0 == null ? 2 : 3;
                fdnh0.b((arr_b == null ? 0 : arr_b.length));
            }
            else {
                fdoy.b(fdnh0, feyj0);
            }
            fdnh0.d = v1;
            fdnd fdnd0 = fdob.b().c;
            if(fdnd0 != null) {
                fdnd0.b(fdnh0.a());
            }
        }
    }
}

