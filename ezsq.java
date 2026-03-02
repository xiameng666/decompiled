import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.auth.UserRecoverableAuthException;
import j..time.Instant;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ezsq {
    public static final int a;
    private final Context b;
    private final gful_cronetEngineProvider c;
    private final gful_cronetEngineProvider d;
    private final ezsg e;
    private final ezss f;
    private final flan g;
    private final gfsi h;
    private final gfsi i;
    private final flam j;
    private final ezqo k;

    static {
        ezqu.c();
    }

    public ezsq(Context context0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, ezsg ezsg0, ezss ezss0, flan flan0, gfsi gfsi0, gfsi gfsi1, flam flam0, ezqo ezqo0) {
        this.b = context0;
        if(!hzdj.a.l().I()) {
            gful0 = new ezsh(ezsq.c());
        }
        this.c = gful0;
        this.d = gful1;
        this.e = ezsg0;
        this.f = ezss0;
        this.g = flan0;
        this.h = gfsi0;
        this.i = gfsi1;
        this.j = flam0;
        this.k = ezqo0;
    }

    public final baqr a(Account account0) {
        baqr baqr0 = new baqr();
        baqr0.a = this.b.getApplicationInfo().uid;
        baqr0.b = account0;
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        baqr0.l("https://www.googleapis.com/auth/webhistory");
        return baqr0;
    }

    public static ezsq b(Context context0) {
        Context context1 = context0.getApplicationContext();
        return new ezsq(context1, ((gful_cronetEngineProvider)() -> {
            hffp hffp0 = hffq.a(cmma.i(0x1001, cmmk.a).a(hfhp.p));
            String s = ezsq.k().toString();
            return (hffp)hffp0.q(gpho.a, s);
        }), ((gful_cronetEngineProvider)new ezsl(context1)), new ezsg(context1), ezrp.a(context1), ezry.d(context1), new ezsm(context1), new ezsn(context0), ezry.c(context1), ezry.a(context1));
    }

    // Detected as a lambda impl.
    public static hffp c() {
        hffp hffp0 = hffq.a(cmma.i(0x1001, cmmk.a).a(hfhp.p));
        String s = ezsq.k().toString();
        return (hffp)hffp0.q(gpho.a, s);
    }

    public final hffw d(baqr baqr0, ezsp ezsp0) {
        hffw hffw0;
        this.f();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        try {
            hffw0 = this.n(baqr0, ezsp0, this.g.a(baqr0.b).a(), atomicBoolean0);
        }
        finally {
            ezsq.g(atomicBoolean0);
        }
        return hffw0;
    }

    public final List e() {
        return bbmn.h(this.b, "com.google.android.gms");
    }

    public final List f() {
        ezss ezss0;
        ezro ezro0;
        List list0 = this.e();
        HashSet hashSet0 = new HashSet();
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            ezro0 = (ezro)this.f;
            ezss0 = ezro0.a;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Account account0 = (Account)object0;
            try {
                hashSet0.add(acso.e(((ezse)ezss0).a, account0.name));
            }
            catch(acse | IOException exception0) {
                ezqu.b().j().p(((int)hzdj.c())).s(exception0).ar(0x4496).x("Failed to resolve account ID during wipeout.");
            }
        }
        File[] arr_file = (hrnt.i() ? new File(ccsb.a.b(((ezse)ezss0).a.getFilesDir(), ezse.c())) : new File(((ezse)ezss0).a.getFilesDir(), ezse.c())).listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file0 = arr_file[v];
                if(!hashSet0.contains(file0.getName()) && !ezse.b(file0)) {
                    ezqu.b().j().p(((int)hzdj.c())).ar(0x4495).x("Failure during wipeout.");
                }
            }
        }
        ezss ezss1 = ezro0.b;
        if(ezss1 != null) {
            ezrd ezrd0 = new ezrd(((ezrg)ezss1), list0, null);
            icbc.a(((ezrg)ezss1).b, ezrd0);
        }
        fkzl fkzl0 = this.g.b();
        Objects.requireNonNull(this.g);
        Iterable iterable0 = gggq.j(list0, new ezsj(this.g));
        try {
            Iterable iterable1 = gggq.j(gggq.j(iterable0, new fkzj()), new fkzm());
            fkzo.a(fkzl0.a.a.a(iterable1));
        }
        catch(IOException iOException0) {
            fkzl0.b.j().s(iOException0).ar(0x48B9).x("Failed to flush sync metadata!");
        }
        try {
            flam flam0 = this.j;
            HashSet hashSet1 = new HashSet(list0);
            HashSet hashSet2 = new HashSet();
            for(Object object1: hashSet1) {
                hashSet2.add(flam0.a(((Account)object1)));
            }
            hashSet2.add(flam0.b());
            Uri uri0 = flam0.b();
            ArrayList arrayList0 = new ArrayList(uri0.getPathSegments());
            gftb.b(((boolean)(arrayList0.isEmpty() ^ 1)), "Can\'t retrieve Uri parent!");
            arrayList0.remove(arrayList0.size() - 1);
            Uri uri1 = uri0.buildUpon().path(gfss.d('/').b(arrayList0)).build();
            frbx frbx0 = flam0.a;
            Iterable iterable2 = frbx0.i(uri1) ? frbx0.c(uri1) : ggna.a;
            for(Object object2: iterable2) {
                Uri uri2 = (Uri)object2;
                if(!hashSet2.contains(uri2)) {
                    frbx0.k(uri2);
                }
            }
        }
        catch(Exception exception1) {
            ezqu.b().j().p(((int)hzdj.c())).s(exception1).ar(0x44A3).x("Sync metadata wipeout failed!");
        }
        return list0;
    }

    public static void g(AtomicBoolean atomicBoolean0) {
        if(atomicBoolean0.compareAndSet(true, false)) {
            long v = hzdj.a.l().p();
            if(v > 0L) {
                ezqh.b(v, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void h(baqr baqr0, ezsp ezsp0, AtomicBoolean atomicBoolean0) {
        fkzk fkzk0 = this.g.a(baqr0.b).a();
        if(hzdj.a.l().Z() && ezsp0 == ezsp.a && fkzk0.b().isEmpty()) {
            return;
        }
        this.n(baqr0, ezsp0, fkzk0, atomicBoolean0);
    }

    public final hfgv i(baqr baqr0, hfgu hfgu0) {
        hfgv hfgv0;
        baqr baqr1 = new baqr(baqr0);
        baqr1.e = "com.google.android.gms";
        baqr1.l("https://www.googleapis.com/auth/webhistory");
        Account account0 = baqr0.b;
        if(((ezrk)this.h.apply(account0)).b()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfgu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hfgu0));
            hfem hfem0 = this.l(account0);
            if(!((hfgs)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hfgs)hftp0))).ensureMutable();
            }
            hfgu hfgu1 = (hfgu)((hfgs)hftp0).b_message;
            hfem0.getClass();
            hfgu1.e = hfem0;
            hfgu1.b |= 4;
            if(!((hfgs)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hfgs)hftp0))).ensureMutable();
            }
            hfgu hfgu2 = (hfgu)((hfgs)hftp0).b_message;
            hfgu2.b |= 16;
            hfgu2.g = true;
            hfgu0 = (hfgu)((ProtoLiteBuilder)(((hfgs)hftp0))).N_build();
        }
        if(hzdj.n()) {
            hfgv0 = ezsq.m().b(hfgu0);
        }
        else {
            hffp hffp0 = (hffp)this.c.mr();
            gphs gphs0 = new gphs(baqr0.b.name, "google");
            hffp hffp1 = (hffp)hffp0.q(gphs.a, gphs0);
            if(hzdj.o()) {
                hffp1 = (hffp)hffp1.q(cmlp.a, ckzl.b);
            }
            hfgv0 = hffp1.b(hfgu0);
        }
        ezmc ezmc0 = this.j((hfgv0.b == null ? hffw.a : hfgv0.b), baqr1.b);
        this.e.b(baqr0.b, (hfgv0.b == null ? hffw.a : hfgv0.b), ezmc0);
        return hfgv0;
    }

    private final ezmc j(hffw hffw0, Account account0) {
        ezrj ezrj0 = new ezrj(this.f.a(account0), new ezts(this.b, account0.name));
        if((hffw0.b & 1) != 0) {
            try {
                hfem hfem0 = hffw0.d == null ? hfem.a : hffw0.d;
                Object object0 = this.i.apply(account0);
                azzc azzc0 = new azzc();
                azzc0.a = new bkbk(((bkbt)object0), hfem0);
                azzc0.d = 0x70D;
                evrg.n(((azts)object0).iG(azzc0.a()));
            }
            catch(ExecutionException executionException0) {
                throw new IOException("Internal writeDeviceLevelSettings() API call failed!", executionException0.getCause());
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new IOException("Internal writeDeviceLevelSettings() API call interrupted!", interruptedException0);
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ezmc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ezmc ezmc0 = (ezmc)hftp0.b_message;
        hffw0.getClass();
        ezmc0.c = hffw0;
        ezmc0.b |= 1;
        long v = Instant.now().toEpochMilli();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ezmc ezmc1 = (ezmc)hftp0.b_message;
        ezmc1.b |= 2;
        ezmc1.d = v;
        return ezrj0.b(((ezmc)hftp0.N_build()));
    }

    private static glvr k() {
        return glvr.a(hzdj.a.l().B(), ((int)hzdj.a.l().f()));
    }

    private final hfem l(Account account0) {
        try {
            Object object0 = this.i.apply(account0);
            azzc azzc0 = new azzc();
            azzc0.a = new bkbl(((bkbt)object0));
            azzc0.d = 0x70C;
            return (hfem)evrg.n(((azts)object0).iG(azzc0.a()));
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            return hfem.a;
        }
    }

    private static hffp m() {
        gftb.check(cmmk.a);
        hffp hffp0 = hffq.a(cmma.a(0x1001, -1, cmml.a, gfqx.a, gfqx.a).a.a(hfhp.p));
        String s = ezsq.k().toString();
        return (hffp)hffp0.q(gpho.a, s);
    }

    private final hffw n(baqr baqr0, ezsp ezsp0, fkzk fkzk0, AtomicBoolean atomicBoolean0) {
        hfgf hfgf0;
        hffw hffw0;
        hfgq hfgq0;
        Account account0 = baqr0.b;
        baqr baqr1 = new baqr(baqr0);
        baqr1.e = "com.google.android.gms";
        baqr1.l("https://www.googleapis.com/auth/webhistory");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hffu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffu hffu0 = (hffu)hftp0.b_message;
        boolean z = true;
        hffu0.b |= 1;
        hffu0.c = "com.google.android.gms#udc-facs";
        Object object0 = this.d.mr();
        if(object0 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfft.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfft hfft0 = (hfft)hftp1.b_message;
            hfft0.b = 2;
            hfft0.c = object0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hffu hffu1 = (hffu)hftp0.b_message;
            hfft hfft1 = (hfft)hftp1.N_build();
            hfft1.getClass();
            hffu1.d = hfft1;
            hffu1.b |= 2;
        }
        if(((ezrk)this.h.apply(account0)).b()) {
            hfem hfem0 = this.l(account0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hffu hffu2 = (hffu)hftp0.b_message;
            hfem0.getClass();
            hffu2.f = hfem0;
            hffu2.b |= 4;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hffu hffu3 = (hffu)hftp0.b_message;
            hffu3.b |= 8;
            hffu3.g = true;
        }
        Iterable iterable0 = gggq.j(fkzk0.b(), new ezsi());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hffu hffu4 = (hffu)hftp0.b_message;
        hffu4.b();
        for(Object object1: iterable0) {
            hffu4.e.i(((hfgq)object1).l);
        }
        switch(ezsp0.ordinal()) {
            case 1: {
                hfgq0 = hfgq.b;
                break;
            }
            case 2: {
                hfgq0 = hfgq.i;
                break;
            }
            case 3: {
                hfgq0 = hfgq.j;
                break;
            }
            default: {
                hfgq0 = hfgq.a;
            }
        }
        if(hfgq0 != hfgq.a) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hffu hffu5 = (hffu)hftp0.b_message;
            hfgq0.getClass();
            hffu5.b();
            hffu5.e.i(hfgq0.l);
        }
        hffu hffu6 = (hffu)hftp0.N_build();
        boolean z1 = false;
        try {
            if(hzdj.n()) {
                hffw0 = ezsq.m().a(hffu6);
            }
            else {
                hffp hffp0 = (hffp)this.c.mr();
                gphs gphs0 = new gphs(baqr0.b.name, "google");
                hffp hffp1 = (hffp)hffp0.q(gphs.a, gphs0);
                if(hzdj.o()) {
                    hffp1 = (hffp)hffp1.q(cmlp.a, ckzl.b);
                }
                hffw0 = hffp1.a(hffu6);
            }
        }
        catch(acse | iapl | iapn exception0) {
            fkzn fkzn0 = fkzk0.a;
            if(fkzn0 != null) {
                try {
                    fkzo.a(fkzn0.a.c());
                }
                catch(IOException iOException0) {
                    fkzk0.b.j().s(iOException0).ar(0x48B7).x("Failed to update metadata after sync failed!");
                }
            }
            ezqo ezqo0 = this.k;
            if((exception0 instanceof iapl)) {
                hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                if(!hfgf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfgf0).ensureMutable();
                }
                ((hfgi)hfgf0.b_message).c = 3;
                ((hfgi)hfgf0.b_message).b |= 1;
                int v = ((iapl)exception0).a.t.r;
                if(!hfgf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfgf0).ensureMutable();
                }
                hfgi hfgi0 = (hfgi)hfgf0.b_message;
                hfgi0.b |= 0x20;
                hfgi0.i = v;
            }
            else if((exception0 instanceof iapn)) {
                hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                if(!hfgf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfgf0).ensureMutable();
                }
                ((hfgi)hfgf0.b_message).c = 3;
                ((hfgi)hfgf0.b_message).b |= 1;
                int v1 = ((iapn)exception0).a.t.r;
                if(!hfgf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfgf0).ensureMutable();
                }
                hfgi hfgi1 = (hfgi)hfgf0.b_message;
                hfgi1.b |= 0x20;
                hfgi1.i = v1;
            }
            else {
                if((exception0 instanceof acsr)) {
                    hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                    if(!hfgf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfgf0).ensureMutable();
                    }
                    ((hfgi)hfgf0.b_message).c = 7;
                }
                else if((exception0 instanceof acsy)) {
                    hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                    if(!hfgf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfgf0).ensureMutable();
                    }
                    ((hfgi)hfgf0.b_message).c = 6;
                }
                else if((exception0 instanceof UserRecoverableAuthException)) {
                    hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                    if(!hfgf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfgf0).ensureMutable();
                    }
                    ((hfgi)hfgf0.b_message).c = 5;
                }
                else if((exception0 instanceof acse)) {
                    hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                    if(!hfgf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfgf0).ensureMutable();
                    }
                    ((hfgi)hfgf0.b_message).c = 4;
                }
                else {
                    hfgf0 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
                    if(!hfgf0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hfgf0).ensureMutable();
                    }
                    ((hfgi)hfgf0.b_message).c = 2;
                }
                ((hfgi)hfgf0.b_message).b |= 1;
            }
            fphm.b(fkzk0.a(), new ezsi(), hfgf0);
            hfgi hfgi2 = fphm.a(hfgf0);
            boolean z2 = ezsp0 == ezsp.c;
            boolean z3 = ezsp0 == ezsp.b;
            if(ezsp0 != ezsp.d) {
                z = false;
            }
            ezqo0.c(hfgi2, z2, z3, z);
            ezsq.o(false, ezsp0, fkzk0, false, atomicBoolean0);
            ezqu.b().j().p(((int)hzdj.c())).s(exception0).ar(0x449D).x("Account sync failed!");
            throw exception0;
        }
        ezmc ezmc0 = this.j(hffw0, account0);
        this.e.b(account0, hffw0, ezmc0);
        boolean z4 = ezmc0 == null || !((ProtoLiteMessage)(ezmc0.c == null ? hffw.a : ezmc0.c)).equals(hffw0);
        fkzn fkzn1 = fkzk0.a;
        if(fkzn1 != null) {
            try {
                fkzo.a(fkzn1.a.d());
            }
            catch(IOException iOException1) {
                fkzk0.b.j().s(iOException1).ar(0x48B8).x("Failed to update metadata after sync completed successfully!");
            }
        }
        ezqo ezqo1 = this.k;
        hfgf hfgf1 = (hfgf)((ProtoLiteMessage)hfgi.a).v_newBuilder();
        if(!hfgf1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hfgf1).ensureMutable();
        }
        ((hfgi)hfgf1.b_message).c = 1;
        ((hfgi)hfgf1.b_message).b |= 1;
        fphm.b(fkzk0.a(), new ezsi(), hfgf1);
        if(!hfgf1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hfgf1).ensureMutable();
        }
        hfgi hfgi3 = (hfgi)hfgf1.b_message;
        hfgi3.b |= 16;
        hfgi3.h = z4;
        hfgi hfgi4 = fphm.a(hfgf1);
        boolean z5 = ezsp0 == ezsp.c;
        boolean z6 = ezsp0 == ezsp.b;
        if(ezsp0 == ezsp.d) {
            z1 = true;
        }
        ezqo1.c(hfgi4, z5, z6, z1);
        ezsq.o(true, ezsp0, fkzk0, z4, atomicBoolean0);
        return hffw0;
    }

    private static void o(boolean z, ezsp ezsp0, fkzk fkzk0, boolean z1, AtomicBoolean atomicBoolean0) {
        if(ezqh.c(hzdj.a.l().o())) {
            ezqg ezqg0 = ezqh.a();
            ggfp ggfp0 = fkzk0.b();
            ezmk ezmk0 = ezmk.b;
            boolean z2 = ggfp0.contains(ezmk0);
            boolean z3 = false;
            boolean z4 = ezsp0 == ezsp.b;
            boolean z5 = ezsp0 == ezsp.c;
            boolean z6 = ezsp0 == ezsp.d;
            ggqj ggqj0 = fkzk0.b().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                if(((ezmk)object0) == ezmk0) {
                    continue;
                }
                else {
                    z3 = true;
                }
                break;
            }
            ((frpe)ezqg0.b.mr()).b(new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z3), Boolean.valueOf(z1)});
            atomicBoolean0.set(true);
        }
    }
}

