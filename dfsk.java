import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArraySet;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import j..util.Objects;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class dfsk {
    private final Context a;
    private final String b;
    private dfsi c;
    private final Set d;

    public dfsk(Context context0, String s) {
        this.d = new ArraySet();
        this.a = context0;
        this.b = s;
    }

    public final void A(String s) {
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = this.c();
            String s1 = cuua.e(s);
            dbws dbws0 = dizg.b(context0, account0);
            for(Object object0: this.d) {
                ((dfsj)object0).a(s1);
            }
            if(Objects.equals(dbws0.I, s1)) {
                return;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            s1.getClass();
            dbws1.c |= 1;
            dbws1.I = s1;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void B(boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = dcww.b(context0).g() ? null : this.c();
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x20000;
            dbws1.u = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void C(String s) {
        synchronized(this) {
            Account account0 = this.c();
            if(account0 != null) {
                Context context0 = this.a;
                dbws dbws0 = dizg.b(context0, account0);
                if((dbws0.b & 2) == 0 || !s.equals(dbws0.e)) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)dbws0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws1 = (dbws)hftp0.b_message;
                    s.getClass();
                    dbws1.b |= 2;
                    dbws1.e = s;
                    dizg.p(context0, account0, ((dbws)hftp0.N_build()));
                }
            }
        }
    }

    public final void D(boolean z) {
        synchronized(this) {
            Account account0 = this.c();
            if(account0 != null) {
                Context context0 = this.a;
                dbws dbws0 = dizg.b(context0, account0);
                if(dbws0.v != z) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)dbws0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws1 = (dbws)hftp0.b_message;
                    dbws1.b |= 0x40000;
                    dbws1.v = z;
                    dizg.p(context0, account0, ((dbws)hftp0.N_build()));
                }
            }
        }
    }

    public final void E(String s, String s1) {
        synchronized(this) {
            Account account0 = this.c();
            if(account0 != null) {
                Context context0 = this.a;
                dbws dbws0 = dizg.b(context0, account0);
                boolean z = false;
                boolean z1 = (dbws0.b & 4) == 0 || !Objects.equals(s, dbws0.f);
                if((dbws0.b & 0x80000) == 0 || !Objects.equals(s1, dbws0.w)) {
                    z = true;
                }
                if(z1 || z) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)dbws0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s.getClass();
                    ((dbws)hftv0).b |= 4;
                    ((dbws)hftv0).f = s;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws1 = (dbws)hftp0.b_message;
                    s1.getClass();
                    dbws1.b |= 0x80000;
                    dbws1.w = s1;
                    dizg.p(context0, account0, ((dbws)hftp0.N_build()));
                }
            }
        }
    }

    public final void F(int v) {
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = this.c();
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x10000000;
            dbws1.E = v;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void G(Account account0, boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x200000;
            dbws1.x = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void H() {
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = dcww.b(context0).g() ? null : this.c();
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x20000000;
            dbws1.F = true;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void I(Account account0, boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x1000;
            dbws1.p = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void J(Account account0, Boolean boolean0) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            boolean z = boolean0.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x4000000;
            dbws1.C = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void K(Account account0, Boolean boolean0) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            boolean z = boolean0.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x2000;
            dbws1.q = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void L(Account account0, boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x8000000;
            dbws1.D = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void M(Account account0, boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x10000;
            dbws1.t = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void N(dfsj dfsj0) {
        synchronized(this) {
            this.d.remove(dfsj0);
        }
    }

    public final void O() {
        synchronized(this) {
            if(this.R()) {
                return;
            }
            Account account0 = this.c();
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x1000000;
            dbws1.A = true;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final boolean P(Account account0) {
        boolean z;
        synchronized(this) {
            z = dizg.b(this.a, account0).y;
        }
        return z;
    }

    public final boolean Q(Account account0) {
        boolean z;
        synchronized(this) {
            z = dizg.b(this.a, account0).x;
        }
        return z;
    }

    public final boolean R() {
        boolean z;
        synchronized(this) {
            Account account0 = this.c();
            z = dizg.b(this.a, account0).A;
        }
        return z;
    }

    public final boolean S(Account account0) {
        boolean z;
        synchronized(this) {
            z = dizg.b(this.a, account0).p;
        }
        return z;
    }

    public final boolean T(Account account0) {
        boolean z;
        synchronized(this) {
            z = dizg.b(this.a, account0).q;
        }
        return z;
    }

    public final boolean U(Account account0) {
        boolean z;
        synchronized(this) {
            z = dizg.b(this.a, account0).t;
        }
        return z;
    }

    public final boolean V(Account account0, int v) {
        long v3;
        synchronized(this) {
            if(account0 == null) {
                return false;
            }
            dbws dbws0 = dizg.b(this.a, account0);
            long v2 = System.currentTimeMillis();
            switch(v) {
                case 1: {
                    v3 = dbws0.l;
                    break;
                }
                case 2: {
                    v3 = dbws0.H;
                    break;
                }
                default: {
                    v3 = 0L;
                }
            }
            if(v2 >= v3 && v2 - v3 < (v == 2 ? TimeUnit.MINUTES.toMillis(hvqs.a.aT().S()) : TimeUnit.DAYS.toMillis(hvqs.a.aT().O()))) {
                switch(v) {
                    case 1: {
                        if((dbws0.b & 8) != 0 && dbws0.g) {
                            return true;
                        }
                        break;
                    }
                    case 2: {
                        if((dbws0.b & 0x40000000) != 0 && dbws0.G) {
                            return true;
                        }
                    }
                }
                return false;
            }
            this.o(account0, v, false);
            dcvz.a.b().p("Reset ignore flag to false!", new Object[0]);
        }
        return false;
    }

    public final boolean W(Account account0) {
        long v3;
        long v2;
        long v1;
        synchronized(this) {
            v1 = System.currentTimeMillis();
            v2 = dizg.b(this.a, account0).m;
            if(Long.compare(v1, v2) < 0) {
                return true;
            }
            v3 = TimeUnit.SECONDS.toMillis(hvqs.a.aT().ci());
        }
        return Long.compare(v1 - v2, v3) > 0;
    }

    public final boolean X() {
        boolean z;
        synchronized(this) {
            Account account0 = dcww.b(this.a).g() ? null : this.c();
            z = dizg.b(this.a, account0).B;
        }
        return z;
    }

    public final boolean Y() {
        synchronized(this) {
            Account account0 = dcww.b(this.a).g() ? null : this.c();
            dbws dbws0 = dizg.b(this.a, account0);
            if((dbws0.b & 0x20000) != 0) {
                return dbws0.u;
            }
        }
        return true;
    }

    public final boolean Z() {
        boolean z;
        synchronized(this) {
            Account account0 = this.c();
            z = dizg.b(this.a, account0).z;
        }
        return z;
    }

    public final int a() {
        synchronized(this) {
            Account account0 = dcww.b(this.a).g() ? null : this.c();
            dbws dbws0 = dizg.b(this.a, account0);
            if(!dcww.b(this.a).g() && (hvqz.ag() && account0 == null)) {
                return 3;
            }
            if((dbws0.b & 0x40) != 0) {
                return dbws0.j;
            }
        }
        return 2;
    }

    public final boolean aa(Account account0) {
        String s1;
        String s2;
        synchronized(this) {
            if(account0 != null && !hvqs.a.aT().dt()) {
                Context context0 = this.a;
                if(!djak.a(context0)) {
                    if(account0.equals(this.c())) {
                        dcvz.a.a().h("Ignoring setting account to %s, since it is already set", account0);
                        return true;
                    }
                    String s = this.i();
                    dbws dbws0 = dizg.b(context0, account0);
                    if((dbws0.b & 1) == 0) {
                        try {
                            s2 = acso.e(context0, account0.name);
                        }
                        catch(acse | IOException exception0) {
                            dcvz.a.c().f(exception0).h("Failed to find obfuscated Gaia id for %s.", Integer.valueOf(Objects.hashCode(account0)));
                            s2 = null;
                        }
                        if(TextUtils.isEmpty(s2)) {
                            dcvz.a.a().h("Account %s does not have account id, Failed to set as active account", account0);
                            return false;
                        }
                        Context context1 = this.a;
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)dbws0));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        dbws dbws1 = (dbws)hftp0.b_message;
                        s2.getClass();
                        dbws1.b |= 1;
                        dbws1.d = s2;
                        if(!dizg.p(context1, account0, ((dbws)hftp0.N_build()))) {
                            dcvz.a.a().h("Failed to set account %s", account0);
                            return false;
                        }
                        s1 = s2;
                    }
                    else {
                        s1 = dbws0.d;
                    }
                    if(s1 == null) {
                        throw new NullPointerException("Null accountId");
                    }
                    this.c = new dfsi(account0, s1);
                    dcvz.a.a().h("Successfully set %s as active account", account0);
                    String s3 = this.i();
                    if(!s3.equals(s)) {
                        for(Object object0: this.d) {
                            ((dfsj)object0).a(s3);
                        }
                    }
                    return true;
                }
            }
            this.c = null;
            dcvz.a.b().p("Removed active account", new Object[0]);
        }
        return true;
    }

    private final cjpc ab() {
        return cjqh.a(this.a, "nearby", "nearbysharing:service:state", 0);
    }

    private final void ac(String s, boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = dcww.b(context0).g() ? null : this.c();
            dbws dbws0 = dizg.b(context0, account0);
            if(Objects.equals(dbws0.h, s)) {
                return;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((dbws)hftv0).b |= 16;
            ((dbws)hftv0).h = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x2000000;
            dbws1.B = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final int b() {
        int v1;
        synchronized(this) {
            Account account0 = this.c();
            v1 = dizg.b(this.a, account0).E;
        }
        return v1;
    }

    public final Account c() {
        synchronized(this) {
            if(!djak.a(this.a)) {
                dfsi dfsi0 = this.c;
                if(dfsi0 != null) {
                    return dfsi0.a;
                }
            }
        }
        return null;
    }

    public final DeviceVisibility d(Account account0) {
        DeviceVisibility deviceVisibility0;
        synchronized(this) {
            dbyl dbyl0 = new dbyl();
            dbyl0.a = (int)hvqs.s();
            Context context0 = this.a;
            if(dcww.b(context0).g()) {
                account0 = null;
            }
            dbws dbws0 = dizg.b(context0, account0);
            if((dbws0.b & 0x400) != 0) {
                int v1 = dbws0.n;
                if(v1 == -1) {
                    dcvz.a.e().p("Previous visibility is unknown, clear previous visibility in metadata.", new Object[0]);
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)dbws0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws1 = (dbws)hftp0.b_message;
                    dbws1.b &= 0xFFFFFBFF;
                    dbws1.n = 0;
                    dizg.p(context0, account0, ((dbws)hftp0.N_build()));
                }
                else {
                    dbyl0.b = v1;
                }
            }
            if((dbws0.b & 0x20) != 0) {
                int v2 = dbws0.i;
                if(v2 == -1) {
                    dcvz.a.e().p("Device visibility is unknown, clear device visibility in metadata.", new Object[0]);
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)dbws0));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dbws dbws2 = (dbws)hftp1.b_message;
                    dbws2.b &= -33;
                    dbws2.i = 0;
                    dizg.p(context0, account0, ((dbws)hftp1.N_build()));
                }
                else {
                    if(v2 == 2) {
                        v2 = 4;
                    }
                    dbyl0.a = v2;
                }
            }
            dbyl0.b();
            if((dbws0.b & 0x800) != 0 && dbws0.o == 1) {
                dbyl0.b();
            }
            int v3 = dbws0.b;
            if((0x8000 & v3) != 0) {
                dbyl0.e = dbws0.s;
            }
            if((v3 & 0x4000) != 0) {
                long v4 = dbws0.r;
                if(v4 != 0L) {
                    long v5 = v4 - System.currentTimeMillis();
                    if(v5 > 0L) {
                        dbyl0.d = v5;
                    }
                    else {
                        int v6 = dbyl0.a().g;
                        this.z(v6, 0L);
                        dbyl0.a = v6;
                    }
                }
            }
            deviceVisibility0 = dbyl0.a();
        }
        return deviceVisibility0;
    }

    public final String e() {
        dfsi dfsi0;
        synchronized(this) {
            dfsi0 = this.c;
            if(dfsi0 == null) {
                return null;
            }
        }
        return dfsi0.b;
    }

    public final String f() {
        dfsi dfsi0;
        synchronized(this) {
            dfsi0 = this.c;
            if(dfsi0 == null) {
                return null;
            }
        }
        return dfsi0.a.name;
    }

    public final String g() {
        synchronized(this) {
        }
        return this.b;
    }

    public final String h(Account account0) {
        String s;
        synchronized(this) {
            Context context0 = this.a;
            if(dcww.b(context0).g()) {
                account0 = null;
            }
            s = dizg.b(context0, account0).h;
        }
        return s;
    }

    public final String i() {
        dbws dbws0;
        synchronized(this) {
            Account account0 = this.c();
            dbws0 = dizg.b(this.a, account0);
            if(dbws0.I.isEmpty() && (hvqz.A() || hvqz.D())) {
                return hvqs.aY();
            }
        }
        return dbws0.I;
    }

    public final String j(Account account0) {
        synchronized(this) {
            if(account0 != null) {
                dbws dbws0 = dizg.b(this.a, account0);
                if((dbws0.b & 2) != 0) {
                    return dbws0.e;
                }
            }
        }
        return null;
    }

    public final String k(Account account0) {
        synchronized(this) {
            if(account0 != null) {
                dbws dbws0 = dizg.b(this.a, account0);
                if((dbws0.b & 0x80000) != 0) {
                    return dbws0.w;
                }
            }
        }
        return null;
    }

    public final String l(Account account0) {
        synchronized(this) {
            if(account0 != null) {
                dbws dbws0 = dizg.b(this.a, account0);
                if((dbws0.b & 4) != 0) {
                    return dbws0.f;
                }
            }
        }
        return null;
    }

    public final void m(Account account0) {
        synchronized(this) {
            String s = cjpd.c(this.ab(), "device_name", "");
            int v1 = cjpd.a(this.ab(), "data_usage", 2);
            if(account0 == null) {
                if(TextUtils.isEmpty(this.h(this.c())) && !TextUtils.isEmpty(s)) {
                    this.x(s);
                }
                if(this.a() == 2 && v1 != 2) {
                    this.w(v1);
                }
            }
        }
    }

    public final void n(PrintWriter printWriter0) {
        synchronized(this) {
            printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.AccountManager"));
            printWriter0.write(String.format("  Device Id: %s\n", this.b));
            printWriter0.write(String.format("  Account Name: %s\n", (this.c == null ? null : this.c.a.name)));
        }
    }

    public final void o(Account account0, int v, boolean z) {
        synchronized(this) {
            if(account0 != null) {
                Context context0 = this.a;
                dbws dbws0 = dizg.b(context0, account0);
                if(v == 1) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)dbws0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws1 = (dbws)hftp0.b_message;
                    dbws1.b |= 8;
                    dbws1.g = z;
                    long v2 = System.currentTimeMillis();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws2 = (dbws)hftp0.b_message;
                    dbws2.b |= 0x100;
                    dbws2.l = v2;
                    dizg.p(context0, account0, ((dbws)hftp0.N_build()));
                    return;
                }
                if(v == 2) {
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)dbws0));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dbws dbws3 = (dbws)hftp1.b_message;
                    dbws3.b |= 0x40000000;
                    dbws3.G = z;
                    long v3 = System.currentTimeMillis();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dbws dbws4 = (dbws)hftp1.b_message;
                    dbws4.b |= 0x80000000;
                    dbws4.H = v3;
                    dizg.p(context0, account0, ((dbws)hftp1.N_build()));
                }
            }
        }
    }

    public final void p() {
        synchronized(this) {
            if(this.Z()) {
                return;
            }
            Account account0 = this.c();
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x800000;
            dbws1.z = true;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void q(dfsj dfsj0) {
        synchronized(this) {
            this.d.add(dfsj0);
            dfsj0.a(this.i());
        }
    }

    public final void r() {
        synchronized(this) {
            this.aa(null);
            dizg.l(this.a, new String[]{"nearby_sharing_account_metadata"});
            cjpa cjpa0 = this.ab().c();
            cjpa0.j("data_usage");
            cjpa0.j("device_name");
            cjpa0.j("visibility");
            cjpd.g(cjpa0);
            dcvz.a.b().p("Reset AccountManager.", new Object[0]);
        }
    }

    public final void s() {
        synchronized(this) {
            if(this.c() == null) {
                Context context0 = this.a;
                dbws dbws0 = dizg.b(context0, null);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)dbws0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((dbws)hftp0.b_message).c |= 4;
                ((dbws)hftp0.b_message).K = false;
                dizg.p(context0, null, ((dbws)hftp0.N_build()));
            }
        }
    }

    public final void t() {
        synchronized(this) {
            if(!this.R()) {
                return;
            }
            Account account0 = this.c();
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x1000000;
            dbws1.A = false;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void u(Account account0, boolean z) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x400000;
            dbws1.y = z;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void v(Account account0, long v) {
        synchronized(this) {
            Context context0 = this.a;
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x200;
            dbws1.m = v;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void w(int v) {
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = dcww.b(context0).g() ? null : this.c();
            dbws dbws0 = dizg.b(context0, account0);
            if(dbws0.j == v) {
                return;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x40;
            dbws1.j = v;
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }

    public final void x(String s) {
        synchronized(this) {
            this.ac(s, false);
        }
    }

    public final void y(String s) {
        synchronized(this) {
            this.ac(s, true);
        }
    }

    public final void z(int v, long v1) {
        int v4;
        long v3;
        synchronized(this) {
            Context context0 = this.a;
            Account account0 = dcww.b(context0).g() ? null : this.c();
            dbws dbws0 = dizg.b(context0, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(Long.compare(v1, 1L) < 0) {
                v3 = 0L;
            }
            else if(v == 3) {
                v3 = System.currentTimeMillis() + v1;
                v = 3;
            }
            else {
                v3 = 0L;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x4000;
            dbws1.r = v3;
            boolean z = false;
            if(djak.a(context0)) {
                v4 = 0;
            }
            else {
                v4 = (dbws0.b & 0x20) == 0 ? 1 : dbws0.i;
                int v5 = (dbws0.b & 0x400) == 0 ? 1 : dbws0.n;
                if(v4 == 3) {
                    if(dbws0.s && v1 == 0L) {
                        v4 = 3;
                    }
                    else {
                        v4 = v5 == 3 ? 1 : v5;
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((dbws)hftv0).b |= 0x400;
            ((dbws)hftv0).n = v4;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            int v6 = ((dbws)hftv1).b | 0x20;
            ((dbws)hftv1).b = v6;
            ((dbws)hftv1).i = v;
            if(v == 1) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dbws.b(((dbws)hftp0.b_message));
            }
            else {
                if((v6 & 0x800) == 0) {
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws.b(((dbws)hftp0.b_message));
                }
                if(v == 3) {
                    if(v1 == 0L) {
                        z = true;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbws dbws2 = (dbws)hftp0.b_message;
                    dbws2.b |= 0x8000;
                    dbws2.s = z;
                }
            }
            dizg.p(context0, account0, ((dbws)hftp0.N_build()));
        }
    }
}

