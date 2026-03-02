import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.util.Pair;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class egyo {
    private static final gged_interceptors a;
    private static final gged_interceptors b;
    private static final gged_interceptors c;
    private static egyo d;
    private final egyp e;
    private final cchj f;
    private final ehjc g;
    private final egyq h;
    private final Context i;
    private final egyr j;

    static {
        Integer integer0 = (int)1;
        Integer integer1 = (int)3;
        egyo.a = gged_interceptors.m(integer0, integer1);
        Integer integer2 = (int)4;
        egyo.b = gged_interceptors.l(integer2);
        egyo.c = gged_interceptors.n(integer0, integer1, integer2);
    }

    private egyo(Context context0, cchj cchj0) {
        egyp egyp0 = egyp.b(context0);
        egyq egyq0 = new egyq(context0);
        super();
        this.i = context0.getApplicationContext();
        this.e = egyp0;
        this.f = cchj0;
        this.g = new ehjc(cchj0);
        this.h = egyq0;
        this.j = new egyr(context0);
    }

    public final Pair a() {
        return !bbqa.a() || !hxba.i() || !this.n() ? Pair.create(Boolean.valueOf(true), this.l()) : Pair.create(Boolean.valueOf(false), null);
    }

    public final BackupAndSyncOptInState b() {
        return this.c(true);
    }

    public final BackupAndSyncOptInState c(boolean z) {
        String[] arr_s;
        if(hxba.a.e().B()) {
            try {
                egig.e("BackupAndSyncOptIn", "Local account type is " + this.i.getResources().getString(Resources.getSystem().getIdentifier("config_rawContactsLocalAccountType", "string", "android")));
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                egig.l("BackupAndSyncOptIn", "Failed to log local account type", resources$NotFoundException0);
            }
        }
        if(hxba.q()) {
            try {
                if(this.m()) {
                    return egyo.k();
                }
            }
            catch(cjuh unused_ex) {
                return egyo.k();
            }
        }
        Pair pair0 = this.a();
        if(((Boolean)pair0.first).booleanValue()) {
            egpr egpr0 = (egpr)pair0.second;
            if(z) {
                boolean z1 = hxba.v();
                boolean z2 = hxba.w();
                Account[] arr_account = this.g.c(z1, z2);
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_account.length; ++v) {
                    arrayList0.add(arr_account[v].name);
                }
                arr_s = (String[])arrayList0.toArray(new String[0]);
            }
            else {
                arr_s = new String[0];
            }
            boolean z3 = hwzg.f();
            if(egpr0.c && egyo.p(egpr0.d, z, arr_s)) {
                return new BackupAndSyncOptInState(egpr0.d, egyo.q(egpr0.e), 3, arr_s);
            }
            if(z3 && egpr0.f && egyo.p(egpr0.d, z, arr_s)) {
                return new BackupAndSyncOptInState(egpr0.d, egyo.q(egpr0.e), 5, arr_s);
            }
            if(z) {
                return arr_s.length > 0 ? new BackupAndSyncOptInState(null, new int[0], 2, arr_s) : egyo.k();
            }
            return new BackupAndSyncOptInState(null, new int[0], 2, arr_s);
        }
        return egyo.k();
    }

    public static egyo d(Context context0) {
        egyo egyo0;
        synchronized(egyo.class) {
            egyo0 = egyo.e(context0, cchj.b(context0));
        }
        return egyo0;
    }

    public static egyo e(Context context0, cchj cchj0) {
        synchronized(egyo.class) {
            if(egyo.d == null) {
                egyo.d = new egyo(context0, cchj0);
            }
        }
        return egyo.d;
    }

    public final void f(int[] arr_v) {
        synchronized(this) {
            this.r(arr_v, 1);
        }
    }

    public final void g(String s, BackupAndSyncOptInOptions backupAndSyncOptInOptions0) {
        egpp egpp0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(s != null) {
            if(!backupAndSyncOptInOptions0.a) {
                if(!this.o(s)) {
                    throw new cjuh(4, "Account attempting to opt in backup and sync is not signed in.");
                }
                if(bbqa.a() && hxba.i() && this.n() || !hxba.v() && this.g.a(s) || (!hxba.w() || !backupAndSyncOptInOptions0.b) && this.g.b(s)) {
                    throw new cjuh(5, String.format("Account %s is not eligible for backup and sync.", s));
                }
                if(hxba.q() && this.m()) {
                    throw new cjuh(13, "Contacts count exceeds the system limit.");
                }
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)egpq.a).v_newBuilder();
            long v1 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egpq egpq0 = (egpq)hftp0.b_message;
            egpq0.b |= 1;
            egpq0.c = v1;
            egpq egpq1 = (egpq)hftp0.N_build();
            egyp egyp0 = this.e;
            egpr egpr0 = egyp0.a();
            if(!hwzg.f()) {
                if(egpr0.c) {
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)egpr0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)egpr0));
                    egpp0 = (egpp)hftp2;
                    if(!egpp0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)egpp0).ensureMutable();
                    }
                    egpr egpr8 = (egpr)egpp0.b_message;
                    egpr8.b |= 2;
                    egpr8.d = s;
                    if(!egpp0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)egpp0).ensureMutable();
                    }
                    egpr egpr9 = (egpr)egpp0.b_message;
                    egpq1.getClass();
                    egpr9.g = egpq1;
                    egpr9.b |= 8;
                }
                else {
                    egpp0 = (egpp)((ProtoLiteMessage)egpr.a).v_newBuilder();
                    if(!egpp0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)egpp0).ensureMutable();
                    }
                    egpr.c(((egpr)egpp0.b_message));
                    if(!egpp0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)egpp0).ensureMutable();
                    }
                    egpr egpr10 = (egpr)egpp0.b_message;
                    egpr10.b |= 2;
                    egpr10.d = s;
                    egpp0.a(egyo.a);
                    if(!egpp0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)egpp0).ensureMutable();
                    }
                    egpr egpr11 = (egpr)egpp0.b_message;
                    egpq1.getClass();
                    egpr11.g = egpq1;
                    egpr11.b |= 8;
                }
            }
            else if(backupAndSyncOptInOptions0.c && !egpr0.f) {
                egpp0 = (egpp)((ProtoLiteMessage)egpr.a).v_newBuilder();
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr1 = (egpr)egpp0.b_message;
                egpr1.b |= 4;
                egpr1.f = true;
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr2 = (egpr)egpp0.b_message;
                egpr2.b |= 2;
                egpr2.d = s;
                egpp0.a(egyo.c);
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr3 = (egpr)egpp0.b_message;
                egpq1.getClass();
                egpr3.g = egpq1;
                egpr3.b |= 8;
            }
            else if(!egpr0.f && !egpr0.c) {
                egpp0 = (egpp)((ProtoLiteMessage)egpr.a).v_newBuilder();
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr.c(((egpr)egpp0.b_message));
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr4 = (egpr)egpp0.b_message;
                egpr4.b |= 2;
                egpr4.d = s;
                egpp0.a(egyo.a);
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr5 = (egpr)egpp0.b_message;
                egpq1.getClass();
                egpr5.g = egpq1;
                egpr5.b |= 8;
            }
            else {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)egpr0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)egpr0));
                egpp0 = (egpp)hftp1;
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr6 = (egpr)egpp0.b_message;
                egpr6.b |= 2;
                egpr6.d = s;
                if(!egpp0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)egpp0).ensureMutable();
                }
                egpr egpr7 = (egpr)egpp0.b_message;
                egpq1.getClass();
                egpr7.g = egpq1;
                egpr7.b |= 8;
            }
            egyp0.c(((egpr)((ProtoLiteBuilder)egpp0).N_build()));
            egyr egyr0 = this.j;
            if(hxba.f()) {
                for(Object object0: hxba.d().b) {
                    String s1 = (String)object0;
                    if(!egyr0.a(s1)) {
                        continue;
                    }
                    Intent intent0 = new Intent("com.google.android.gms.people.contactssync.BACKUP_SYNC_OPTED_IN_EXPLICIT").setPackage(s1);
                    egyr0.a.sendBroadcast(intent0);
                }
            }
            if(hxba.m()) {
                eglf.b.a();
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
            return;
        }
        throw new cjuh(5, "Account name is null.");
    }

    public final void h() {
        synchronized(this) {
            this.e.c(egpr.a);
            if(hxba.f()) {
                Iterator iterator0 = hxba.d().b.iterator();
                while(iterator0.hasNext()) {
                    egyr egyr0 = this.j;
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    if(egyr0.a(s)) {
                        Intent intent0 = new Intent("com.google.android.gms.people.contactssync.BACKUP_SYNC_OPTED_OUT_EXPLICIT").setPackage(s);
                        egyr0.a.sendBroadcast(intent0);
                    }
                }
            }
            if(hxba.m()) {
                eglf.b.a();
            }
        }
    }

    public final void i(int[] arr_v) {
        synchronized(this) {
            this.r(arr_v, 2);
        }
    }

    public final void j() {
        synchronized(this) {
            egpr egpr0 = this.l();
            if(egpr0.c) {
                hxba hxba0 = hxba.a;
                if(hxba0.e().X()) {
                    long v1 = hxba0.e().g();
                    egpq egpq0 = egpr0.g == null ? egpq.a : egpr0.g;
                    long v2 = System.currentTimeMillis();
                    if(v2 < egpq0.c || v2 > egpq0.c + TimeUnit.MILLISECONDS.convert(v1, TimeUnit.SECONDS)) {
                        goto label_10;
                    }
                }
                else {
                label_10:
                    if(!this.o(egpr0.d)) {
                        this.h();
                    }
                }
            }
        }
    }

    private static BackupAndSyncOptInState k() {
        return new BackupAndSyncOptInState(null, new int[0], 1, new String[0]);
    }

    private final egpr l() {
        return this.e.a();
    }

    private final boolean m() {
        return ((long)(this.h.b() + this.h.e("account_type = \"com.google\""))) > hxba.a.e().l();
    }

    private final boolean n() {
        try {
            return this.i.getResources().getBoolean(Resources.getSystem().getIdentifier("config_rawContactsAccountRestrictionEnabled", "bool", "android"));
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            egig.c("BackupAndSyncOptIn", "Failed to check resources config_rawContactsAccountRestrictionEnabled", resources$NotFoundException0);
            return true;
        }
    }

    private final boolean o(String s) {
        Account[] arr_account = this.f.p("com.google");
        for(int v = 0; v < arr_account.length; ++v) {
            if(s.equals(arr_account[v].name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean p(String s, boolean z, String[] arr_s) {
        return z ? Arrays.asList(arr_s).contains(s) : true;
    }

    private static int[] q(List list0) {
        if(list0 == null) {
            return null;
        }
        int v = list0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = (int)(((Integer)list0.get(v1)));
        }
        return arr_v;
    }

    private final void r(int[] arr_v, int v) {
        synchronized(this) {
            egyp egyp0 = this.e;
            egpr egpr0 = egyp0.a();
            if(egpr0.c && arr_v != null) {
                ArrayList arrayList0 = new ArrayList();
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    Integer integer0 = (int)arr_v[v2];
                    if(egyo.b.contains(integer0)) {
                        arrayList0.add(integer0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    TreeSet treeSet0 = new TreeSet();
                    treeSet0.addAll(egpr0.e);
                    if(v == 1) {
                        treeSet0.addAll(arrayList0);
                    }
                    else {
                        treeSet0.removeAll(arrayList0);
                    }
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)egpr0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)egpr0));
                    if(!((egpp)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((egpp)hftp0))).ensureMutable();
                    }
                    ((egpr)((egpp)hftp0).b_message).e = hfty.a;
                    for(Object object0: treeSet0) {
                        int v3 = (int)(((Integer)object0));
                        if(!((egpp)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((egpp)hftp0))).ensureMutable();
                        }
                        egpr egpr1 = (egpr)((egpp)hftp0).b_message;
                        egpr1.b();
                        egpr1.e.i(v3);
                    }
                    egyp0.c(((egpr)((ProtoLiteBuilder)(((egpp)hftp0))).N_build()));
                }
            }
        }
    }
}

