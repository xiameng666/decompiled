import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.RawContacts;
import android.provider.ContactsContract.Settings;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class ehcb {
    public final ehca a;
    private static ehcb b;
    private final egyq c;
    private final ehck d;

    public ehcb(ehca ehca0, egyq egyq0, ehck ehck0) {
        this.a = ehca0;
        this.c = egyq0;
        this.d = ehck0;
    }

    public final int a(Account account0) {
        try {
            return this.c.d(account0.name);
        }
        catch(cjuh cjuh0) {
            Log.w("ContactsChangedNotifier", "getGoogleContactCount failed", cjuh0);
            return -1;
        }
    }

    public static ehcb b(Context context0) {
        synchronized(ehcb.class) {
            if(ehcb.b == null) {
                ehcb.b = new ehcb(new ehca(context0), new egyq(context0), new ehck(context0));
            }
        }
        return ehcb.b;
    }

    public final void c(Account account0, egyc egyc0) {
        synchronized(this) {
            gmbu.t(egyc0.c(), new ehbz(this, account0), gmap.a);
        }
    }

    public final boolean d(Account account0, boolean z, boolean z1, long v) {
        synchronized(this) {
            if(ehcb.i(account0)) {
                return false;
            }
            if(!z) {
                return false;
            }
            if(!z1) {
                hwyp hwyp0 = hwyp.a;
                if(System.currentTimeMillis() - v < TimeUnit.DAYS.toMillis(hwyp0.c().d())) {
                    return false;
                }
                int v2 = this.a(account0);
                if(hwyp0.c().o()) {
                    if(((long)v2) < hwyp0.c().a()) {
                        String s = account0.name;
                        efpr efpr0 = efpr.a();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisq.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gisq)hftv0).c = 3;
                        ((gisq)hftv0).b |= 1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gisq)hftv1).b |= 4;
                        ((gisq)hftv1).e = true;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp0.b_message;
                        ((gisq)hftv2).b |= 8;
                        ((gisq)hftv2).f = false;
                        if(!hftv2.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp0.b_message;
                        ((gisq)hftv3).b |= 16;
                        ((gisq)hftv3).g = v;
                        if(!hftv3.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gisq gisq0 = (gisq)hftp0.b_message;
                        gisq0.b |= 0x20;
                        gisq0.h = v2;
                        efpr0.m(s, ((gisq)hftp0.N_build()));
                        return false;
                    }
                }
                else if(v2 <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void e(egyc egyc0, Account account0, ehci ehci0, boolean z, boolean z1, long v, int v1) {
        synchronized(this) {
            gmbu.t(egyc0.e(), new ehby(this, account0, ehci0, z, z1, v, v1, egyc0), gmap.a);
        }
    }

    public final void f(Account account0, egyc egyc0, ehci ehci0) {
        synchronized(this) {
            if(hwyp.j()) {
                gmbu.t(glzd.f(egyc0.a.a(), new egxu(), gmap.a), new ehbx(this, account0, egyc0, ehci0), gmap.a);
                return;
            }
            this.h(account0, egyc0, ehci0);
        }
    }

    public final void g(Account account0, int v, ehci ehci0, boolean z, boolean z1, long v1, int v2) {
        String s2;
        int v5;
        String s;
        int v4;
        synchronized(this) {
            if(hxdo.d()) {
                hxdo hxdo0 = hxdo.a;
                if(hxdo0.b().s()) {
                    if(hxdo0.b().r() && Build.VERSION.SDK_INT >= 33) {
                        Account account1 = ContactsContract.Settings.getDefaultAccount(this.d.a.getContentResolver());
                        v4 = 3;
                        if(account1 != null && account1.name != null && account1.type != null && account1.name.equals(account0.name) && account1.type.equals(account0.type)) {
                            v4 = 2;
                        }
                    }
                    else {
                        v4 = 1;
                    }
                    try {
                        s = account0.name;
                        String s1 = account0.name;
                        Uri uri0 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", s1).appendQueryParameter("account_type", "com.google").build();
                        v5 = this.c.a(uri0, "dirty = 0 AND sourceid IS NULL");
                    }
                    catch(cjuh cjuh0) {
                        Log.w("ContactsChangedNotifier", "getTrashedGoogleContactCount failed", cjuh0);
                        v5 = -1;
                    }
                    efpr efpr0 = efpr.a();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisq.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gisq)hftv0).c = 1;
                    ((gisq)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((gisq)hftv1).b |= 2;
                    ((gisq)hftv1).d = v;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    ((gisq)hftv2).b |= 4;
                    ((gisq)hftv2).e = z;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((gisq)hftv3).b |= 8;
                    ((gisq)hftv3).f = z1;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp0.b_message;
                    ((gisq)hftv4).b |= 16;
                    ((gisq)hftv4).g = v1;
                    if(!hftv4.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp0.b_message;
                    ((gisq)hftv5).b |= 0x20;
                    ((gisq)hftv5).h = v2;
                    if(!hftv5.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp0.b_message;
                    ((gisq)hftv6).b |= 0x40;
                    ((gisq)hftv6).i = v5;
                    if(!hftv6.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gisq)hftp0.b_message).j = v4 - 1;
                    ((gisq)hftp0.b_message).b |= 0x80;
                    efpr0.m(s, ((gisq)hftp0.N_build()));
                    switch(v4) {
                        case 1: {
                            s2 = "UNKNOWN_DEFAULT_ACCOUNT_STATE";
                            break;
                        }
                        case 2: {
                            s2 = "IS_DEFAULT_ACCOUNT";
                            break;
                        }
                        default: {
                            s2 = "IS_NOT_DEFAULT_ACCOUNT";
                        }
                    }
                    egig.g("ContactsChangedNotifier", "Notification account\'s default account state: %s", s2);
                }
                else {
                    ehcj.a(account0.name, v, 2);
                }
            }
            if(hxdo.a.b().p()) {
                if(!ehcb.i(account0) && this.a(account0) > 0) {
                    ehci0.d(account0);
                    this.a.b(account0, v);
                    return;
                }
                return;
            }
            ehci0.d(account0);
            this.a.b(account0, v);
        }
    }

    public final void h(Account account0, egyc egyc0, ehci ehci0) {
        synchronized(this) {
            if(hxdo.a.b().o() && !ehcb.i(account0)) {
                gmcd gmcd0 = egyc0.b();
                gmcd gmcd1 = egyc0.c();
                gmcd gmcd2 = egyc0.e();
                gmcd gmcd3 = egyc0.d();
                if(hwyp.j()) {
                    egyc0.h(System.currentTimeMillis());
                }
                gmbu.d(new gmcd[]{gmcd0, gmcd1, gmcd2, gmcd3}).a(new ehbv(this, account0, gmcd0, gmcd1, gmcd3, egyc0, ehci0), gmap.a);
                return;
            }
            gmcd gmcd4 = egyc0.b();
            gmcd gmcd5 = egyc0.c();
            gmcd gmcd6 = egyc0.e();
            gmcd gmcd7 = egyc0.d();
            if(hwyp.j()) {
                egyc0.h(System.currentTimeMillis());
            }
            gmbu.d(new gmcd[]{gmcd4, gmcd5, gmcd6, gmcd7}).a(new ehbw(this, account0, gmcd4, gmcd5, gmcd7, egyc0, ehci0), gmap.a);
        }
    }

    public static final boolean i(Account account0) {
        return ContentResolver.getIsSyncable(account0, "com.android.contacts") > 0;
    }
}

