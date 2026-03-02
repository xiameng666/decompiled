import android.content.Context;
import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class asfu {
    public static final baun a;
    public final Map b;
    public final Map c;
    public final Map d;
    private final int e;
    private final Context f;
    private final aqqk g;
    private final gful_cronetEngineProvider h;

    static {
        asfu.a = aqql.a("BackUpNowLogger");
    }

    public asfu(Context context0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, boolean z) {
        this.h = gfus.a(((gful_cronetEngineProvider)new asfs()));
        this.e = aqra.a();
        this.b = new ConcurrentHashMap();
        this.c = (Map)gful0.mr();
        this.d = (Map)gful1.mr();
        this.f = context0;
        this.g = new aqqk(context0, z);
    }

    public final asft a(String s) {
        return this.b.containsKey(s) ? ((asft)this.b.get(s)) : new asft();
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ghyz ghyz0 = (ghyz)((ProtoLiteMessage)ghza.a).v_newBuilder();
        if(!ghyz0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)ghyz0).ensureMutable();
        }
        ghza ghza0 = (ghza)ghyz0.b_message;
        ghza0.b |= 2;
        ghza0.d = v;
        ghyz0.a(asfu.h(this.b));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghza ghza1 = (ghza)((ProtoLiteBuilder)ghyz0).N_build();
        ghza1.getClass();
        ghys0.C = ghza1;
        ghys0.c |= 1;
        this.e(((ghys)hftp0.N_build()), ghyr.D);
    }

    public final void c(String s, CustomBackupResult customBackupResult0) {
        this.i(s, customBackupResult0, true);
    }

    public final void d(String s, CustomBackupResult customBackupResult0) {
        this.i(s, customBackupResult0, false);
    }

    public final void e(ghys ghys0, ghyr ghyr0) {
        this.g.b(ghys0, ghyr0, Long.valueOf(this.e));
    }

    public final void f(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        gibh gibh0 = (gibh)((ProtoLiteMessage)gibj.a).v_newBuilder();
        if(!gibh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gibh0).ensureMutable();
        }
        gibj gibj0 = (gibj)gibh0.b_message;
        gibj0.b |= 1;
        gibj0.c = false;
        if(!gibh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gibh0).ensureMutable();
        }
        ((gibj)gibh0.b_message).d = v - 1;
        ((gibj)gibh0.b_message).b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gibj gibj1 = (gibj)((ProtoLiteBuilder)gibh0).N_build();
        gibj1.getClass();
        ghys0.L = gibj1;
        ghys0.c |= 0x8000;
        this.e(((ghys)hftp0.N_build()), ghyr.T);
    }

    public final void g(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gibl)hftp0.b_message).c = v - 1;
        ((gibl)hftp0.b_message).b |= 1;
        gibl gibl0 = (gibl)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gibl0.getClass();
        ghys0.ao = gibl0;
        ghys0.d |= 0x10000;
        this.e(((ghys)hftp1.N_build()), ghyr.aB);
    }

    public static final List h(Map map0) {
        List list0 = new ArrayList(map0.size());
        for(Object object0: map0.keySet()) {
            asft asft0 = (asft)map0.get(((String)object0));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghyw.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((String)object0).getClass();
            ((ghyw)hftv0).b |= 1;
            ((ghyw)hftv0).c = (String)object0;
            ghyy ghyy0 = asft0.a;
            if(ghyy0 != null) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ghyw)hftp0.b_message).d = ghyy0.j;
                ((ghyw)hftp0.b_message).b |= 2;
            }
            List list1 = asft0.b;
            if(list1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghyw ghyw0 = (ghyw)hftp0.b_message;
                hfuo hfuo0 = ghyw0.e;
                if(!hfuo0.c()) {
                    ghyw0.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list1, ghyw0.e);
            }
            list0.add(((ghyw)hftp0.N_build()));
        }
        return list0;
    }

    private final void i(String s, CustomBackupResult customBackupResult0, boolean z) {
        int v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gibz)hftv0).b |= 1;
        ((gibz)hftv0).c = s;
        if(customBackupResult0.a) {
            v = 2;
        }
        else {
            switch(customBackupResult0.b) {
                case "APP_NETWORK_SETTINGS": {
                    v = 12;
                    break;
                }
                case "BACKUP_CANCELED": {
                    v = 10;
                    break;
                }
                case "BACKUP_THROTTLED": {
                    v = 14;
                    break;
                }
                case "CLIENT_APP_BACKUP_DISABLED": {
                    v = 5;
                    break;
                }
                case "GENERIC": {
                    v = 3;
                    break;
                }
                case "NETWORK_METERED": {
                    v = 8;
                    break;
                }
                case "ONGOING_BACKUP": {
                    v = 9;
                    break;
                }
                case "OUT_OF_STORAGE": {
                    v = 13;
                    break;
                }
                case "PERMISSION_ISSUE": {
                    v = 4;
                    break;
                }
                case "TIMEOUT_OVERALL": {
                    v = 6;
                    break;
                }
                case "TIMEOUT_PROGRESS": {
                    v = 7;
                    break;
                }
                case "WORK_PROFILE": {
                    v = 11;
                    break;
                }
                default: {
                    v = 1;
                }
            }
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gibz)hftv1).d = v - 1;
        ((gibz)hftv1).b |= 2;
        if(z) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gibz gibz0 = (gibz)hftp0.b_message;
            gibz0.b |= 4;
            gibz0.g = true;
        }
        else {
            ggca ggca0 = (ggca)this.c.remove(s);
            if(ggca0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gibz gibz1 = (gibz)hftp0.b_message;
                hfuo hfuo0 = gibz1.e;
                if(!hfuo0.c()) {
                    gibz1.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(ggca0, gibz1.e);
            }
            ArrayList arrayList0 = (ArrayList)this.d.remove(s);
            if(arrayList0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gibz gibz2 = (gibz)hftp0.b_message;
                hfuo hfuo1 = gibz2.f;
                if(!hfuo1.c()) {
                    gibz2.f = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(arrayList0, gibz2.f);
            }
        }
        if(((Boolean)this.h.mr()).booleanValue()) {
            Context context0 = this.f;
            if(context0 != null) {
                int v1 = fpwp.a(context0.getPackageManager(), s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gibz gibz3 = (gibz)hftp0.b_message;
                gibz3.b |= 8;
                gibz3.h = v1;
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gibz gibz4 = (gibz)hftp0.N_build();
        gibz4.getClass();
        ghys0.N = gibz4;
        ghys0.c |= 0x20000;
        this.e(((ghys)hftp1.N_build()), ghyr.V);
    }
}

