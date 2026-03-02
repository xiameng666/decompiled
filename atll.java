import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class atll {
    public static final baun a;
    public static final gmcg b;
    public static final iccd c;

    static {
        atll.a = aqql.a("PostD2dAppTransferHelper");
        bblp bblp0 = new bblp(1, 9);
        atll.b = bblp0;
        atll.c = new icds(bblp0);
    }

    public static void a(List list0, List list1, Context context0) {
        wpm wpm0 = new wpm(context0, atll.c);
        atmb atmb0 = new atmb(context0);
        atll.f(new atlj(context0, list0, list1, atmb0, wpm0), "Failed to setup post d2d app transfer database", atmb0);
    }

    public static void b(atmd atmd0, atmb atmb0) {
        gged_interceptors gged0 = atmd0.b(new HashSet(hqlt.m().b));
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged0.get(v1);
            if(atmd0.g(s)) {
                atmd0.i(s, 5);
                Boolean boolean0 = Boolean.valueOf(atmd0.f(s));
                atmb0.d(s, gifh.i, boolean0, "unregistered: the app is not in the allowlist");
            }
            else {
                atmb0.b(s, gifh.i, "Can not find app info in db on refresh Pixel Impulse listener");
            }
        }
    }

    public static void c(wpq wpq0, atmd atmd0, wpm wpm0, atmb atmb0) {
        synchronized(atll.class) {
            atll.f(new atli(wpq0, atmb0, atmd0, wpm0), "Failed to handle PixelStateChangeEvents", atmb0);
        }
    }

    static void d(List list0, wpm wpm0) {
        if(hqlt.a.o().Y()) {
            HashSet hashSet0 = new HashSet(hqlt.m().b);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                String s = (String)object0;
                if(hashSet0.contains(s)) {
                    atll.a.j("packageName: %s passes allowlist", new Object[]{s});
                    arrayList0.add(s);
                }
                else {
                    atll.a.j("packageName: %s is not in allowlist", new Object[]{s});
                }
            }
            list0 = arrayList0;
        }
        if(!list0.isEmpty()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)c.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aq.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            aq aq0 = (aq)hftp1.b_message;
            aq0.b |= 2;
            aq0.d = true;
            for(Object object1: list0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                c c0 = (c)hftp0.b_message;
                ((String)object1).getClass();
                hfuo hfuo0 = c0.b;
                if(!hfuo0.c()) {
                    c0.b = ProtoLiteMessage.E(hfuo0);
                }
                c0.b.add(((String)object1));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                aq aq1 = (aq)hftp1.b_message;
                ((String)object1).getClass();
                hfuo hfuo1 = aq1.c;
                if(!hfuo1.c()) {
                    aq1.c = ProtoLiteMessage.E(hfuo1);
                }
                aq1.c.add(((String)object1));
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wpt.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)wpr.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            wpr wpr0 = (wpr)hftp3.b_message;
            wpr0.b |= 1;
            wpr0.c = "PostD2dAppTransferListener";
            hftr hftr0 = (hftr)((ProtoLiteMessage)wps.a).v_newBuilder();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            wps wps0 = (wps)hftr0.b_message;
            c c1 = (c)hftp0.N_build();
            c1.getClass();
            wps0.c = c1;
            wps0.b |= 1;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            wps wps1 = (wps)hftr0.b_message;
            aq aq2 = (aq)hftp1.N_build();
            aq2.getClass();
            wps1.d = aq2;
            wps1.b |= 2;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            wpr wpr1 = (wpr)hftp3.b_message;
            wps wps2 = (wps)((ProtoLiteBuilder)hftr0).N_build();
            wps2.getClass();
            wpr1.d = wps2;
            wpr1.b |= 2;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            wpt wpt0 = (wpt)hftp2.b_message;
            wpr wpr2 = (wpr)hftp3.N_build();
            wpr2.getClass();
            hfuo hfuo2 = wpt0.b;
            if(!hfuo2.c()) {
                wpt0.b = ProtoLiteMessage.E(hfuo2);
            }
            wpt0.b.add(wpr2);
            wpt wpt1 = (wpt)hftp2.N_build();
            ibuq.f(wpt1, "clientConfig");
            wpk wpk0 = new wpk(wpm0, wpt1, null);
            wpm0.c.a(wpk0);
            return;
        }
        wpl wpl0 = new wpl(wpm0, null);
        wpm0.c.a(wpl0);
    }

    public static void e(atmd atmd0, wpm wpm0, atmb atmb0) {
        atll.f(new atlh(atmd0, atmb0, wpm0), "Failed to sync app state with allowlist and refresh pixel impulse listener", atmb0);
    }

    private static void f(Runnable runnable0, String s, atmb atmb0) {
        gmcd gmcd0 = gmbu.l(runnable0, atll.b);
        atlg atlg0 = new atlg(s, atmb0);
        glyi.f(gmcd0, Throwable.class, atlg0, atll.b);
    }
}

