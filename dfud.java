import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater.DeviceContactsEnabledReceiver;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dfud {
    public final Context a;
    public final dfsk b;
    public final dgbf c;
    public final dgah d;
    public final dhtl e;
    public final ExecutorService f;
    public final Handler g;
    public final AtomicBoolean h;
    public final dcpn i;
    public final BroadcastReceiver j;
    public final ContentObserver k;
    private final dgaf l;

    public dfud(Context context0, dfsk dfsk0, dgbf dgbf0, dgah dgah0, dgaf dgaf0, dhtl dhtl0, ExecutorService executorService0, dcpn dcpn0) {
        this.g = new clht(Looper.getMainLooper());
        this.h = new AtomicBoolean(false);
        this.j = new ContactBookUpdater.DeviceContactsEnabledReceiver(this);
        this.k = new dfua(this);
        this.a = context0;
        this.b = dfsk0;
        this.c = dgbf0;
        this.d = dgah0;
        this.l = dgaf0;
        this.e = dhtl0;
        this.f = executorService0;
        this.i = dcpn0;
    }

    // Detected as a lambda impl.
    public final dfty a(Account account0, dbxw dbxw0, dcpv dcpv0) {
        dfty dfty0 = dfty.b;
        long v = System.currentTimeMillis();
        if(((dbxx)dbxw0.b_message).c.size() > 0) {
            dcvz.a.b().p("Updating all contacts reachability.", new Object[0]);
            dbxx dbxx0 = (dbxx)((ProtoLiteBuilder)dbxw0).N_build();
            gzbo gzbo0 = this.e.i(account0, dbxx0, dcpv0);
            if(gzbo0 == null) {
                return dfty.a;
            }
            bxd bxd0 = new bxd();
            for(Object object0: gzbo0.b) {
                bxd0.put(((gzbn)object0).b, ((gzbn)object0));
            }
            try {
                dgbf dgbf0 = this.c;
                boolean z = false;
                for(int v1 = 0; v1 < ((dbxx)dbxw0.b_message).c.size(); ++v1) {
                    dbxv dbxv0 = dbxw0.a(v1);
                    gzbn gzbn0 = (gzbn)bxd0.get((dbxv0.c == null ? dbya.a : dbxv0.c).d);
                    if(gzbn0 != null && gzbn0.c != dbxv0.i) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxv0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)dbxv0));
                        dbxu dbxu0 = (dbxu)hftp0;
                        boolean z1 = gzbn0.c;
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv1 = (dbxv)dbxu0.b_message;
                        dbxv1.b |= 16;
                        dbxv1.i = z1;
                        boolean z2 = gzbn0.d;
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv2 = (dbxv)dbxu0.b_message;
                        dbxv2.b |= 0x20;
                        dbxv2.j = z2;
                        if(!dbxu0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)dbxu0).ensureMutable();
                        }
                        dbxv dbxv3 = (dbxv)dbxu0.b_message;
                        dbxv3.b |= 0x40;
                        dbxv3.k = v;
                        if(hvqz.P()) {
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            hfvv hfvv0 = hfvv.a;
                            ((dbxv)dbxu0.b_message).m = hfvv0;
                            hfuo hfuo0 = gzbn0.e;
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            dbxv dbxv4 = (dbxv)dbxu0.b_message;
                            hfuo hfuo1 = dbxv4.m;
                            if(!hfuo1.c()) {
                                dbxv4.m = ProtoLiteMessage.E(hfuo1);
                            }
                            hfrj.E(hfuo0, dbxv4.m);
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            ((dbxv)dbxu0.b_message).n = hfvv0;
                            hfuo hfuo2 = gzbn0.f;
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            dbxv dbxv5 = (dbxv)dbxu0.b_message;
                            hfuo hfuo3 = dbxv5.n;
                            if(!hfuo3.c()) {
                                dbxv5.n = ProtoLiteMessage.E(hfuo3);
                            }
                            hfrj.E(hfuo2, dbxv5.n);
                        }
                        dbxw0.l(v1, dbxu0);
                        z = true;
                    }
                }
                if(z) {
                    dgbf0.h(account0, dbxw0);
                    dfty0 = dfty.c;
                }
                this.b.v(account0, v);
                return dfty0;
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).p("Failed to save reachability changes in ContactBook.", new Object[0]);
                return dfty.a;
            }
        }
        return dfty0;
    }

    public final gmcd b(Account account0, boolean z, dcpv dcpv0) {
        return glzd.f(this.c.d(account0), new dftq(this, account0, z, dcpv0), this.f);
    }

    public final void c(dcpv dcpv0) {
        ((dgao)this.d).n().C(dcpv0);
        this.l.c(dcpv0);
    }

    public final void d(Runnable runnable0) {
        this.f.execute(runnable0);
    }

    public final boolean e(Account account0, dbxw dbxw0, dcpv dcpv0) {
        dfts dfts0 = () -> {
            dfty dfty0 = dfty.b;
            long v = System.currentTimeMillis();
            if(((dbxx)dbxw0.b_message).c.size() > 0) {
                dcvz.a.b().p("Updating all contacts reachability.", new Object[0]);
                dbxx dbxx0 = (dbxx)((ProtoLiteBuilder)dbxw0).N_build();
                gzbo gzbo0 = this.e.i(account0, dbxx0, dcpv0);
                if(gzbo0 == null) {
                    return dfty.a;
                }
                bxd bxd0 = new bxd();
                for(Object object0: gzbo0.b) {
                    bxd0.put(((gzbn)object0).b, ((gzbn)object0));
                }
                try {
                    dgbf dgbf0 = this.c;
                    boolean z = false;
                    for(int v1 = 0; v1 < ((dbxx)dbxw0.b_message).c.size(); ++v1) {
                        dbxv dbxv0 = dbxw0.a(v1);
                        gzbn gzbn0 = (gzbn)bxd0.get((dbxv0.c == null ? dbya.a : dbxv0.c).d);
                        if(gzbn0 != null && gzbn0.c != dbxv0.i) {
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxv0).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)dbxv0));
                            dbxu dbxu0 = (dbxu)hftp0;
                            boolean z1 = gzbn0.c;
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            dbxv dbxv1 = (dbxv)dbxu0.b_message;
                            dbxv1.b |= 16;
                            dbxv1.i = z1;
                            boolean z2 = gzbn0.d;
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            dbxv dbxv2 = (dbxv)dbxu0.b_message;
                            dbxv2.b |= 0x20;
                            dbxv2.j = z2;
                            if(!dbxu0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)dbxu0).ensureMutable();
                            }
                            dbxv dbxv3 = (dbxv)dbxu0.b_message;
                            dbxv3.b |= 0x40;
                            dbxv3.k = v;
                            if(hvqz.P()) {
                                if(!dbxu0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)dbxu0).ensureMutable();
                                }
                                hfvv hfvv0 = hfvv.a;
                                ((dbxv)dbxu0.b_message).m = hfvv0;
                                hfuo hfuo0 = gzbn0.e;
                                if(!dbxu0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)dbxu0).ensureMutable();
                                }
                                dbxv dbxv4 = (dbxv)dbxu0.b_message;
                                hfuo hfuo1 = dbxv4.m;
                                if(!hfuo1.c()) {
                                    dbxv4.m = ProtoLiteMessage.E(hfuo1);
                                }
                                hfrj.E(hfuo0, dbxv4.m);
                                if(!dbxu0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)dbxu0).ensureMutable();
                                }
                                ((dbxv)dbxu0.b_message).n = hfvv0;
                                hfuo hfuo2 = gzbn0.f;
                                if(!dbxu0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)dbxu0).ensureMutable();
                                }
                                dbxv dbxv5 = (dbxv)dbxu0.b_message;
                                hfuo hfuo3 = dbxv5.n;
                                if(!hfuo3.c()) {
                                    dbxv5.n = ProtoLiteMessage.E(hfuo3);
                                }
                                hfrj.E(hfuo2, dbxv5.n);
                            }
                            dbxw0.l(v1, dbxu0);
                            z = true;
                        }
                    }
                    if(z) {
                        dgbf0.h(account0, dbxw0);
                        dfty0 = dfty.c;
                    }
                    this.b.v(account0, v);
                    return dfty0;
                }
                catch(IOException iOException0) {
                    dcvz.a.e().f(iOException0).p("Failed to save reachability changes in ContactBook.", new Object[0]);
                    return dfty.a;
                }
            }
            return dfty0;
        };
        return ((dfty)cuuc.g("checkAndUpdateContactsReachability", evrg.a(this.f, dfts0), hvqs.r())) != dfty.a;
    }

    public final boolean f(Account account0, dbxx dbxx0, dcpv dcpv0) {
        String s;
        dfsk dfsk0 = this.b;
        if(!dfud.g(dfsk0.d(account0).f)) {
            cunf cunf0 = dcvz.a.b();
            switch(dfsk0.d(account0).f) {
                case 0: {
                    s = "@com.google.android.gms:string/common_hidden";
                    break;
                }
                case 1: 
                case 2: {
                    s = "@com.google.android.gms:string/common_people_settings_title";
                    break;
                }
                case 3: {
                    s = "@com.google.android.gms:string/common_everyone";
                    break;
                }
                case 4: {
                    s = "Your devices";
                    break;
                }
                default: {
                    s = "previous visibility";
                }
            }
            cunf0.h("Cannot upload contacts: visibility is %s.", s);
            dbxx0 = dbxx.a;
        }
        return this.e.p(account0, dbxx0, ggna.a, dcpv0);
    }

    public static final boolean g(int v) {
        return v == 1 || v == 2 || v == 3;
    }

    public final void h(dcpv dcpv0) {
        this.d(new dftw(this, dcpv0));
    }
}

