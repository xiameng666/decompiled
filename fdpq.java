import android.text.TextUtils;
import android.util.Log;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class fdpq implements ffmj {
    public final Map a;
    public final String b;
    public final fdul c;
    public volatile fdwy d;

    public fdpq(String s, fdul fdul0) {
        this.a = new ConcurrentHashMap();
        this.b = s;
        this.c = fdul0;
    }

    public final void a(String s, File file0, Set set0) {
        if(this.d == null) {
            return;
        }
        Map map0 = this.a;
        fdpp fdpp0 = (fdpp)map0.get(s);
        if(fdpp0 == null) {
            fdwt fdwt0 = file0 == null ? null : new fdwt(s, file0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbx ffbx0 = (ffbx)hftp0.b_message;
            s.getClass();
            ffbx0.b |= 1;
            ffbx0.c = s;
            fdpp0 = new fdpp(hftp0, fdwt0);
        }
        ProtoLiteBuilder hftp1 = fdpp0.b;
        fexb fexb0 = ((ffbx)hftp1.b_message).d;
        if(fexb0 == null) {
            fexb0 = fexb.a;
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)fexb0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)fexb0));
        HashSet hashSet0 = new HashSet();
        for(Object object0: DesugarCollections.unmodifiableList(((fexb)hftp2.b_message).b)) {
            hashSet0.add(fdpl.a(((fexi)object0).c, ((fexi)object0).d));
        }
        for(Object object1: set0) {
            fdpl fdpl0 = (fdpl)object1;
            if(!hashSet0.contains(fdpl0)) {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fexi.a).v_newBuilder();
                String s1 = fdpl0.b;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp3.b_message;
                s1.getClass();
                ((fexi)hftv0).b |= 1;
                ((fexi)hftv0).c = s1;
                String s2 = fdpl0.d;
                if(!hftv0.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fexi fexi0 = (fexi)hftp3.b_message;
                s2.getClass();
                fexi0.b |= 2;
                fexi0.d = s2;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fexb fexb1 = (fexb)hftp2.b_message;
                fexi fexi1 = (fexi)hftp3.N_build();
                fexi1.getClass();
                hfuo hfuo0 = fexb1.b;
                if(!hfuo0.c()) {
                    fexb1.b = ProtoLiteMessage.E(hfuo0);
                }
                fexb1.b.add(fexi1);
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ffbx ffbx1 = (ffbx)hftp1.b_message;
        fexb fexb2 = (fexb)hftp2.N_build();
        fexb2.getClass();
        ffbx1.d = fexb2;
        ffbx1.b |= 2;
        map0.put(s, fdpp0);
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp4.b_message;
        ffbx ffbx2 = (ffbx)hftp1.N_build();
        ffbx2.getClass();
        ffau0.c = ffbx2;
        ffau0.b |= 1;
        ffau ffau1 = (ffau)hftp4.N_build();
        if(Log.isLoggable("assets", 3)) {
            Log.d("assets", "Sending SetAsset message for " + s);
        }
        this.b(ffau1, fdpp0.a);
    }

    public final void b(ffau ffau0, fdwt fdwt0) {
        String s;
        int v = 7;
        fdwy fdwy0 = this.d;
        if(fdwy0 != null) {
            if((ffau0.b & 1) != 0 && fdwt0 != null) {
                long v1 = fdwt0.b.length();
                if(v1 > 0x80000L) {
                    v = 2;
                }
                else {
                    v = v1 <= 0x8000L ? 5 : 6;
                }
            }
            try {
                fdwy0.c(v, 0L, ffau0, fdwt0);
            }
            catch(InterruptedException interruptedException0) {
                Log.w("assets", "interrupted while writing message, will try again later", interruptedException0);
                Thread.currentThread().interrupt();
                return;
            }
            catch(IOException iOException0) {
                Log.w("assets", "error while writing message, will try again later", iOException0);
                return;
            }
            if(hzxv.e()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdog.a).v_newBuilder();
                int v2 = ffau0.b;
                if((v2 & 1) != 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((fdog)hftp0.b_message).c = 1;
                    ((fdog)hftp0.b_message).b |= 1;
                    gfss gfss0 = new gfss(",");
                    ffbx ffbx0 = ffau0.c == null ? ffbx.a : ffau0.c;
                    ggdy ggdy0 = new ggdy();
                    for(Object object0: (ffbx0.d == null ? fexb.a : ffbx0.d).b) {
                        ggdy0.i(((fexi)object0).c);
                    }
                    s = gfss0.b(ggdy0.h());
                }
                else if((v2 & 4) == 0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((fdog)hftp0.b_message).c = 2;
                    ((fdog)hftp0.b_message).b |= 1;
                    s = "";
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((fdog)hftp0.b_message).c = 3;
                    ((fdog)hftp0.b_message).b |= 1;
                    boolean z = (ffau0.e == null ? fezj.a : ffau0.e).f;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fdog fdog0 = (fdog)hftp0.b_message;
                    fdog0.b |= 2;
                    fdog0.d = z;
                    s = (ffau0.e == null ? fezj.a : ffau0.e).c;
                }
                int v3 = fdwt0 == null ? 0 : ((int)fdwt0.b.length());
                fdnd fdnd0 = fdob.b().c;
                if(fdnd0 != null) {
                    fdnd0.e(s, 3, v3, ((fdog)hftp0.N_build()));
                }
            }
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Peer: " + this.b);
        bbpd0.println(a.aj(this.a, "Outstanding Sends: "));
        for(Object object0: this.a.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            ProtoLiteBuilder hftp0 = ((fdpp)((Map.Entry)object0).getValue()).b;
            Locale locale0 = Locale.US;
            String s1 = ((ffbx)hftp0.b_message).c;
            Integer integer0 = ((ffbx)hftp0.b_message).e.size();
            fexb fexb0 = ((ffbx)hftp0.b_message).d;
            if(fexb0 == null) {
                fexb0 = fexb.a;
            }
            bbpd0.println("  " + s + ", " + String.format(locale0, "SetAsset{%s,%d,%s}", s1, integer0, (fexb0 == null || fexb0.b.size() == 0 ? "" : TextUtils.join(",", fexb0.b))));
        }
    }
}

