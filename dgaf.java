import android.accounts.Account;
import android.content.Context;
import android.util.ArraySet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class dgaf {
    public final dfsk a;
    public final SecureRandom b;
    public final ExecutorService c;
    private final dhtl d;
    private final Context e;

    public dgaf(Context context0, dfsk dfsk0, dhtl dhtl0) {
        this.c = cuui.b();
        this.e = context0;
        this.a = dfsk0;
        this.d = dhtl0;
        this.b = new SecureRandom();
    }

    public final dbxa a(Account account0, String s) {
        if(account0 == null) {
            dcvz.a.e().p("Sender certificates must be tied to an account.", new Object[0]);
            return dbxa.a;
        }
        File file0 = dizg.g(this.e, account0, s);
        if(!file0.exists()) {
            try {
                file0.createNewFile();
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).h("Failed to read sender certificate to disk. File %s not exist and unable to create", s);
            }
            dcvz.a.b().h("Failed to find sender certificate file %s. Creating a new file.", file0);
            return dbxa.a;
        }
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            hftc hftc0 = hftc.a();
            hfsl hfsl0 = hfsl.N(fileInputStream0);
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)dbxa.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur1) {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
                hfur1.a = hftv0;
                throw hfur1;
            }
            catch(hfwr hfwr0) {
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            }
            catch(IOException iOException1) {
                if((iOException1.getCause() instanceof hfur)) {
                    throw (hfur)iOException1.getCause();
                }
                hfur hfur3 = new hfur(iOException1);
                hfur3.a = hftv0;
                throw hfur3;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (dbxa)hftv0;
        }
        catch(hfur hfur0) {
            dcvz.a.e().f(hfur0).p("Failed to read proto objects. Delete all certificate files.", new Object[0]);
            file0.delete();
            return dbxa.a;
        }
        catch(IOException | IllegalStateException exception0) {
            dcvz.a.e().f(exception0).h("Failed to read sender certificates from file %s", s);
            return dbxa.a;
        }
    }

    public final dgae b(byte[] arr_b) {
        dgae dgae4;
        synchronized(this) {
            if(arr_b.length == 1) {
                Account account0 = this.a.c();
                dbwz dbwz0 = null;
                if(account0 != null) {
                    boolean z = this.i(account0);
                    for(Object object0: this.a(account0, "nearby_sharing_private_sender_certificate_book").b) {
                        dbwz dbwz1 = (dbwz)object0;
                        if(!dgaf.m(dbwz1) && System.currentTimeMillis() <= dgaf.l(dbwz1.d)) {
                            dbwz0 = dbwz1;
                            break;
                        }
                    }
                    if(dbwz0 == null) {
                        dizg.k(this.e, account0, new String[]{"nearby_sharing_private_sender_certificate_book"});
                    }
                    else if(z) {
                        this.e(new dgaa(this, account0));
                    }
                }
                if(dbwz0 == null) {
                    return new dgae(arr_b, this.k());
                }
                byte[] arr_b1 = dbwz0.c.toByteArray();
                if(arr_b1 == null) {
                    return new dgae(arr_b, this.k());
                }
                byte[] arr_b2 = dizs.d(arr_b1, arr_b, 8);
                return arr_b2 == null ? new dgae(arr_b, this.k()) : new dgae(arr_b, arr_b2);
            }
            dgae4 = new dgae(arr_b, this.k());
        }
        return dgae4;
    }

    public final void c(dcpv dcpv0) {
        synchronized(this) {
            Account account0 = this.a.c();
            if(account0 == null) {
                return;
            }
            dcvz.a.b().p("Removing remote sender certificates.", new Object[0]);
            dizg.k(this.e, account0, new String[]{"nearby_sharing_sender_certificate_book_from_selected_contacts", "nearby_sharing_sender_certificate_book_from_all_contacts", "nearby_sharing_sender_certificate_book_from_self_share"});
            this.e(new dgab(this, account0, dcpv0));
        }
    }

    public final void d() {
        synchronized(this) {
            dizg.l(this.e, new String[]{"nearby_sharing_private_sender_certificate_book", "nearby_sharing_sender_certificate_book_from_selected_contacts", "nearby_sharing_sender_certificate_book_from_all_contacts", "nearby_sharing_sender_certificate_book_from_self_share"});
            dcvz.a.b().p("SenderCertificateManager has been reset", new Object[0]);
        }
    }

    final void e(Runnable runnable0) {
        this.c.execute(runnable0);
    }

    public final void f(boolean z, dcpv dcpv0) {
        synchronized(this) {
            dcvz.a.b().h("Running sender sync force = %s", Boolean.valueOf(z));
            dfsk dfsk0 = this.a;
            Account account0 = dfsk0.c();
            if(account0 == null) {
                return;
            }
            if(this.i(account0)) {
                dfsk0.M(account0, false);
            }
            this.e(new dgac(this, account0, z, dcpv0));
        }
    }

    public final boolean g(Account account0, dcpv dcpv0) {
        ArraySet arraySet0 = new ArraySet();
        ArraySet arraySet1 = new ArraySet();
        ArraySet arraySet2 = new ArraySet();
        cunk cunk0 = this.d.d(account0, dcpv0);
        if(!cunk0.d()) {
            return false;
        }
        for(Object object0: ((List)cunk0.c())) {
            dhtk dhtk0 = (dhtk)object0;
            if(dhtk0.c) {
                arraySet2.add(dhtk0.a);
                arraySet1.add(dhtk0.a);
                arraySet0.add(dhtk0.a);
            }
            if(dhtk0.b) {
                arraySet0.add(dhtk0.a);
            }
            else {
                arraySet1.add(dhtk0.a);
            }
        }
        return this.j(account0, new ArrayList(arraySet0), "nearby_sharing_sender_certificate_book_from_selected_contacts") && this.j(account0, new ArrayList(arraySet1), "nearby_sharing_sender_certificate_book_from_all_contacts") && this.j(account0, new ArrayList(arraySet2), "nearby_sharing_sender_certificate_book_from_self_share");
    }

    public final boolean h(Account account0, dcpv dcpv0) {
        dbxa dbxa0 = this.a(account0, "nearby_sharing_private_sender_certificate_book");
        return dbxa0.b.size() == 0 ? true : this.d.q(account0, dbxa0.b, dcpv0);
    }

    private final boolean i(Account account0) {
        long v = System.currentTimeMillis();
        int v1 = 0;
        for(Object object0: this.a(account0, "nearby_sharing_private_sender_certificate_book").b) {
            dbwz dbwz0 = (dbwz)object0;
            if(!dgaf.m(dbwz0)) {
                v = Math.max(v, dbwz0.e);
                ++v1;
            }
        }
        boolean z = false;
        while(v1 < 3) {
            byte[] arr_b = this.k();
            TimeUnit timeUnit0 = TimeUnit.MINUTES;
            int v2 = (int)hvqs.n();
            long v3 = v - timeUnit0.toMillis(((long)this.b.nextInt(v2)));
            long v4 = TimeUnit.DAYS.toMillis(hvqs.a.aT().bY()) + v;
            TimeUnit timeUnit1 = TimeUnit.MINUTES;
            int v5 = (int)hvqs.n();
            long v6 = v4 + timeUnit1.toMillis(((long)this.b.nextInt(v5)));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbwz.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((dbwz)hftv0).b |= 1;
            ((dbwz)hftv0).c = hfsf0;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((dbwz)hftv1).b |= 2;
            ((dbwz)hftv1).d = v3;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbwz dbwz1 = (dbwz)hftp0.b_message;
            dbwz1.b |= 4;
            dbwz1.e = v6;
            dbwz dbwz2 = (dbwz)hftp0.N_build();
            if(this.j(account0, gged_interceptors.l(dbwz2), "nearby_sharing_private_sender_certificate_book")) {
                v = dbwz2.e;
                z = true;
            }
            else {
                dcvz.a.e().p("Failed to save the certificate.", new Object[0]);
            }
            ++v1;
        }
        if(z) {
            dcvz.a.b().p("New private sender certificate generated and saved.", new Object[0]);
            this.a.M(account0, false);
        }
        return z;
    }

    private final boolean j(Account account0, List list0, String s) {
        File file0 = dizg.g(this.e, account0, s);
        if(!file0.exists()) {
            try {
                file0.createNewFile();
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).h("Failed to save sender certificate to disk. Unable to create the file %s.", s);
                return false;
            }
        }
        ArraySet arraySet0 = new ArraySet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            dbwz dbwz0 = (dbwz)object0;
            if(!arraySet0.contains(dbwz0.c) && !dgaf.m(dbwz0)) {
                arraySet0.add(dbwz0.c);
                arrayList0.add(dbwz0);
            }
        }
        for(Object object1: this.a(account0, s).b) {
            dbwz dbwz1 = (dbwz)object1;
            if(!arraySet0.contains(dbwz1.c) && !dgaf.m(dbwz1)) {
                arraySet0.add(dbwz1.c);
                arrayList0.add(dbwz1);
            }
        }
        if("nearby_sharing_private_sender_certificate_book".equals(s)) {
            Collections.sort(arrayList0, new dgad());
        }
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbxa.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbxa dbxa0 = (dbxa)hftp0.b_message;
            hfuo hfuo0 = dbxa0.b;
            if(!hfuo0.c()) {
                dbxa0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, dbxa0.b);
            ((dbxa)hftp0.N_build()).writeToStream(fileOutputStream0);
            dcvz.a.b().h("Saved sender certificates to file %s.", s);
            return true;
        }
        catch(IOException iOException1) {
            dcvz.a.e().f(iOException1).h("Failed to sender certificates to file %s.", s);
            return false;
        }
    }

    private final byte[] k() {
        return dizs.f(8, this.b);
    }

    private static long l(long v) {
        return 1800000L + v >= v ? 1800000L + v : 0x7FFFFFFFFFFFFFFFL;
    }

    private static final boolean m(dbwz dbwz0) {
        return (dbwz0.b & 1) != 0 && dbwz0.c.size() == 8 && dgaf.l(dbwz0.e) <= System.currentTimeMillis();
    }
}

