import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public final class egzd extends egyu {
    public static final ggeo a;
    public final PackageManager b;
    public final File c;
    private static egzd d;

    static {
        egzd.a = ggeo.m(Integer.valueOf(2), "com.google.android.contacts", Integer.valueOf(3), "com.google.android.gm");
        egzd.d = null;
    }

    private egzd(Context context0) {
        this.c = context0.getDir("contacts-backup-sync-user-action-leveldb", 0);
        this.b = context0.getPackageManager();
    }

    @Override  // egyu
    public final Map a() {
        Map map0 = new HashMap();
        synchronized(this) {
            levelDb$Iterator0.seekToFirst();
            while(true) {
                if(!levelDb$Iterator0.isValid()) {
                    break;
                }
                gfsx gfsx0 = egzd.d(levelDb$Iterator0.value());
                if(gfsx0.i()) {
                    map0.put(new String(levelDb$Iterator0.key(), "UTF-8"), gfsx0.d());
                }
                levelDb$Iterator0.next();
            }
        }
        if(hwxy.d()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gioq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gioq)hftv0).c = 3;
            ((gioq)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gioq)hftp0.b_message).d = 1;
            ((gioq)hftp0.b_message).b |= 2;
            int v1 = map0.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gioq gioq0 = (gioq)hftp0.b_message;
            gioq0.b |= 4;
            gioq0.e = v1;
            egzd.g(hftp0);
        }
        return map0;
    }

    @Override  // egyu
    public final void b(String s, egpd egpd0) {
        gioq gioq0 = gioq.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gioq0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gioq)hftp0.b_message).c = 1;
        ((gioq)hftp0.b_message).b |= 1;
        if(s == null) {
            egig.b("FSA2_SuggestionStorage", "Invalid key format.");
            if(hwxy.d()) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gioq)hftp0.b_message).d = 2;
                ((gioq)hftp0.b_message).b |= 2;
                egzd.g(hftp0);
            }
        }
        else {
            String s1 = egzf.c(s);
            int v = 0;
            if(s1 == null) {
                egig.b("FSA2_SuggestionStorage", "prefix cannot be null.");
            }
            else {
                synchronized(this) {
                    levelDb$Iterator0.seek(egzd.f(s1));
                    while(true) {
                        if(!levelDb$Iterator0.isValid() || !egzd.e(levelDb$Iterator0.key(), s1)) {
                            break;
                        }
                        ++v;
                        levelDb$Iterator0.next();
                    }
                }
                __monitor_exit(this);
            }
            hwxy hwxy0 = hwxy.a;
            if(((long)v) < hwxy0.b().b()) {
                synchronized(this) {
                label_130:
                    try(egyv egyv3 = new egyv(this.c)) {
                        byte[] arr_b1 = egzd.f(s);
                        byte[] arr_b2 = egpd0.toBytesArray();
                        egyv3.a.put(arr_b1, arr_b2);
                    }
                }
                __monitor_exit(this);
                if(hwxy.d()) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gioq)hftv0).d = 1;
                    ((gioq)hftv0).b |= 2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gioq gioq3 = (gioq)hftp0.b_message;
                    gioq3.b |= 8;
                    gioq3.f = 1;
                    egzd.g(hftp0);
                }
            }
            else if(hwxy0.b().e()) {
                String s2 = egzf.c(s);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gioq0).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gioq)hftp1.b_message).c = 4;
                ((gioq)hftp1.b_message).b |= 1;
                HashMap hashMap0 = new HashMap();
                if(s2 == null) {
                    egig.b("FSA2_SuggestionStorage", "prefix cannot be null.");
                    if(hwxy.d()) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gioq)hftp1.b_message).d = 2;
                        ((gioq)hftp1.b_message).b |= 2;
                        egzd.g(hftp1);
                    }
                }
                else {
                    synchronized(this) {
                        levelDb$Iterator1.seek(egzd.f(s2));
                        while(true) {
                            if(!levelDb$Iterator1.isValid() || !egzd.e(levelDb$Iterator1.key(), s2)) {
                                break;
                            }
                            gfsx gfsx0 = egzd.d(levelDb$Iterator1.value());
                            if(gfsx0.i()) {
                                hashMap0.put(new String(levelDb$Iterator1.key(), "UTF-8"), gfsx0.d());
                            }
                            levelDb$Iterator1.next();
                        }
                    }
                    __monitor_exit(this);
                    if(hwxy.d()) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gioq)hftp1.b_message).d = 1;
                        ((gioq)hftp1.b_message).b |= 2;
                        int v1 = hashMap0.size();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gioq gioq1 = (gioq)hftp1.b_message;
                        gioq1.b |= 4;
                        gioq1.e = v1;
                        egzd.g(hftp1);
                    }
                }
                if(!hashMap0.isEmpty()) {
                    Iterator iterator0 = hashMap0.entrySet().iterator();
                    Object object0 = iterator0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        Map.Entry map$Entry1 = (Map.Entry)object1;
                        if(((egpd)map$Entry1.getValue()).e <= ((egpd)map$Entry0.getValue()).e) {
                            map$Entry0 = map$Entry1;
                        }
                    }
                    synchronized(this) {
                        byte[] arr_b = egzd.f(((String)map$Entry0.getKey()));
                        egyv2.a.delete(arr_b);
                    }
                    __monitor_exit(this);
                }
                if(hwxy.d()) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gioq gioq2 = (gioq)hftp0.b_message;
                    gioq2.b |= 16;
                    gioq2.g = 1;
                    synchronized(this) {
                        goto label_130;
                    }
                }
                else {
                    __monitor_enter(this);
                    goto label_130;
                }
            }
            else if(!hwxy0.b().j()) {
                synchronized(this) {
                    goto label_130;
                }
            }
        }
    }

    public static egzd c(Context context0) {
        synchronized(egzd.class) {
            if(egzd.d == null) {
                egzd.d = new egzd(context0);
            }
        }
        return egzd.d;
    }

    public static gfsx d(byte[] arr_b) {
        if(arr_b != null) {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)egpd.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return gfsx.m(((egpd)hftv0));
        }
        return gfqx.a;
    }

    public static boolean e(byte[] arr_b, String s) {
        return arr_b == null ? false : new String(arr_b, "UTF-8").startsWith(s);
    }

    public static byte[] f(String s) {
        return s.getBytes("UTF-8");
    }

    public static void g(ProtoLiteBuilder hftp0) {
        efpr.a();
        gioq gioq0 = (gioq)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gisr gisr0 = (gisr)hftp1.b_message;
        gioq0.getClass();
        gisr0.z = gioq0;
        gisr0.b |= 0x200000;
        efpt.b(null, hftp1);
    }
}

