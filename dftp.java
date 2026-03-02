import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.ContactInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class dftp {
    public final dgbf a;
    public final dfud b;
    public final dfsk c;

    public dftp(dgbf dgbf0, dfud dfud0, dfsk dfsk0) {
        this.a = dgbf0;
        this.b = dfud0;
        this.c = dfsk0;
    }

    public final int a(ContactFilter contactFilter0) {
        Account account0 = this.c.c();
        if(account0 == null) {
            return 0;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.b(account0).c) {
            arrayList0.add(dftp.b(((dbxv)object0)));
        }
        return dizu.a(arrayList0, contactFilter0).size();
    }

    public static Contact b(dbxv dbxv0) {
        ContactInfo contactInfo0;
        long v = (dbxv0.c == null ? dbya.a : dbxv0.c).c;
        Long long0 = v;
        String s = (dbxv0.c == null ? dbya.a : dbxv0.c).d;
        String s1 = dbxv0.d;
        String s2 = null;
        Uri uri0 = dbxv0.e.isEmpty() ? null : Uri.parse(dbxv0.e);
        boolean z = dbxv0.h;
        Boolean boolean0 = Boolean.valueOf(z);
        boolean z1 = false;
        if(dbxv0.g.size() == 0 && dbxv0.f.size() == 0) {
            contactInfo0 = new ContactInfo(0, null);
        }
        else {
            if(dbxv0.g.size() > 0) {
                s2 = (String)dbxv0.g.get(0);
            }
            if(s2 == null) {
                contactInfo0 = new ContactInfo(2, ((String)dbxv0.f.get(0)));
            }
            else {
                String s3 = PhoneNumberUtils.formatNumber(s2, Locale.getDefault().getCountry());
                if(s3 != null) {
                    s2 = s3;
                }
                contactInfo0 = new ContactInfo(1, s2);
            }
        }
        boolean z2 = dbxv0.i;
        Boolean boolean1 = Boolean.valueOf(z2);
        if(dbxv0.j || dbxv0.l) {
            z1 = true;
        }
        batl.c(((boolean)(TextUtils.isEmpty(s) ^ 1)), "Contact\'s lookupKey must not be null or empty.");
        batl.c(((boolean)(1 ^ TextUtils.isEmpty(s1))), "Contact\'s displayName must not be null or empty.");
        long0.getClass();
        boolean0.getClass();
        boolean1.getClass();
        Boolean.valueOf(z1).getClass();
        return new Contact(v, s, s1, uri0, z, contactInfo0, z2, z1);
    }

    public final gmcd c(int v, int v1, ContactFilter contactFilter0, Executor executor0) {
        dfsk dfsk0 = this.c;
        Account account0 = dfsk0.c();
        if(account0 == null) {
            return gmbu.i(new ArrayList());
        }
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 14;
        dcpu0.b = 1;
        dcpv dcpv0 = new dcpv(dcpu0);
        dgbf dgbf0 = this.a;
        if(!dgbf0.j(account0)) {
            return glzd.f(glzd.f(dgbf0.d(account0), new dftn(this, account0, dcpv0), executor0), (dbxx dbxx0) -> {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: dbxx0.c) {
                    arrayList0.add(dftp.b(((dbxv)object0)));
                }
                Boolean boolean0 = contactFilter0 == null ? Boolean.valueOf(false) : contactFilter0.c;
                if(contactFilter0 != null && boolean0 != null && boolean0.booleanValue() && ((long)arrayList0.size()) < hvqs.a.aT().bh()) {
                    return new ArrayList();
                }
                List list0 = dizu.a(arrayList0, contactFilter0);
                Collections.sort(list0);
                if(v >= list0.size()) {
                    dcvz.a.b().h("Offset %d >= valid contact list size. Return empty list", Integer.valueOf(v));
                    return new ArrayList();
                }
                if(v1 <= 0) {
                    v1 = list0.size();
                }
                try {
                    return list0.subList(v, Math.min(v1 + v, list0.size()));
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    return new ArrayList();
                }
            }, gmap.a);
        }
        dbxx dbxx0 = dgbf0.b(account0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbxx0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dbxx0));
        if(dfsk0.W(account0)) {
            boolean z = this.b.e(account0, ((dbxw)hftp0), dcpv0);
            dcvz.a.b().h("Updates contacts reachability return %s", Boolean.valueOf(z));
        }
        return glzd.f(gmbu.i(((dbxx)((ProtoLiteBuilder)(((dbxw)hftp0))).N_build())), (dbxx dbxx0) -> {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: dbxx0.c) {
                arrayList0.add(dftp.b(((dbxv)object0)));
            }
            Boolean boolean0 = contactFilter0 == null ? Boolean.valueOf(false) : contactFilter0.c;
            if(contactFilter0 != null && boolean0 != null && boolean0.booleanValue() && ((long)arrayList0.size()) < hvqs.a.aT().bh()) {
                return new ArrayList();
            }
            List list0 = dizu.a(arrayList0, contactFilter0);
            Collections.sort(list0);
            if(v >= list0.size()) {
                dcvz.a.b().h("Offset %d >= valid contact list size. Return empty list", Integer.valueOf(v));
                return new ArrayList();
            }
            if(v1 <= 0) {
                v1 = list0.size();
            }
            try {
                return list0.subList(v, Math.min(v1 + v, list0.size()));
            }
            catch(IndexOutOfBoundsException unused_ex) {
                return new ArrayList();
            }
        }, gmap.a);
    }

    public final void d() {
        dftr dftr0 = new dftr(this.b);
        this.b.d(dftr0);
    }

    public final void e() {
        dftt dftt0 = new dftt(this.b);
        this.b.d(dftt0);
        this.b.f.shutdown();
        dcvz.a.b().p("ContactBookUpdater has been shutdown.", new Object[0]);
    }

    public static dftp f(Context context0, dfsk dfsk0, dgah dgah0, dgaf dgaf0, dhtl dhtl0, dcpn dcpn0) {
        dgbf dgbf0 = new dgbf(context0, new dgbg(context0));
        return new dftp(dgbf0, new dfud(context0, dfsk0, dgbf0, dgah0, dgaf0, dhtl0, cuui.b(), dcpn0), dfsk0);
    }

    public final void g(dcpv dcpv0) {
        dftu dftu0 = new dftu(this.b, dcpv0);
        this.b.d(dftu0);
    }

    // Detected as a lambda impl.
    public static final List h(dbxx dbxx0, int v, int v1, ContactFilter contactFilter0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: dbxx0.c) {
            arrayList0.add(dftp.b(((dbxv)object0)));
        }
        Boolean boolean0 = contactFilter0 == null ? Boolean.valueOf(false) : contactFilter0.c;
        if(contactFilter0 != null && boolean0 != null && boolean0.booleanValue() && ((long)arrayList0.size()) < hvqs.a.aT().bh()) {
            return new ArrayList();
        }
        List list0 = dizu.a(arrayList0, contactFilter0);
        Collections.sort(list0);
        if(v >= list0.size()) {
            dcvz.a.b().h("Offset %d >= valid contact list size. Return empty list", Integer.valueOf(v));
            return new ArrayList();
        }
        if(v1 <= 0) {
            v1 = list0.size();
        }
        try {
            return list0.subList(v, Math.min(v1 + v, list0.size()));
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return new ArrayList();
        }
    }

    public final void i(dcpv dcpv0) {
        this.b.h(dcpv0);
    }
}

