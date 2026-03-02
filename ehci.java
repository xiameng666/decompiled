import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.provider.ContactsContract.Contacts;

public final class ehci {
    public static ehci a = null;
    public static boolean b = false;
    public final cchj c;
    public final ehcb d;
    public final egyd e;
    private final ContentResolver f;
    private final ContentObserver g;

    static {
    }

    public ehci(ContentResolver contentResolver0, cchj cchj0, ehcb ehcb0, egyd egyd0) {
        this.g = new ehce(this);
        this.f = contentResolver0;
        this.c = cchj0;
        this.d = ehcb0;
        this.e = egyd0;
    }

    public static ehci a(Context context0) {
        synchronized(ehci.class) {
            if(ehci.a == null) {
                ehci.a = new ehci(context0.getContentResolver(), cchj.b(context0), ehcb.b(context0), egyd.a);
            }
        }
        return ehci.a;
    }

    public final void b(egyc egyc0) {
        synchronized(this) {
            gmbu.t(egyc0.c(), new ehcg(this, egyc0), gmap.a);
        }
    }

    public final void c(egyc egyc0) {
        synchronized(this) {
            gmbu.t(egyc0.e(), new ehch(this), gmap.a);
        }
    }

    public final void d(Account account0) {
        this.h(egyc.a(account0), System.currentTimeMillis());
    }

    public final void e() {
        synchronized(this) {
            this.j();
        }
    }

    public final void f() {
        synchronized(this) {
            if(ehci.b) {
                return;
            }
            this.f.registerContentObserver(ContactsContract.Contacts.CONTENT_URI, false, this.g);
            ehci.b = true;
        }
    }

    public final void g() {
        synchronized(this) {
            if(ehci.b) {
                this.f.unregisterContentObserver(this.g);
                ehci.b = false;
            }
        }
    }

    private final void h(egyc egyc0, long v) {
        synchronized(this) {
            gmcd[] arr_gmcd = new gmcd[2];
            arr_gmcd[0] = egyc0.g(true);
            egxo egxo0 = new egxo(v);
            arr_gmcd[1] = egyc0.a.b(egxo0, gmap.a);
            gmbu.d(arr_gmcd).a(new ehcd(), gmap.a);
        }
    }

    private final void i(egyc egyc0) {
        synchronized(this) {
            gmbu.t(egyc0.b(), new ehcf(this, egyc0), gmap.a);
        }
    }

    private final void j() {
        synchronized(this) {
            if(!ehci.b) {
                Account[] arr_account = this.c.p("com.google");
                for(int v1 = 0; v1 < arr_account.length; ++v1) {
                    Account account0 = arr_account[v1];
                    if(ehci.b) {
                        break;
                    }
                    if(ContentResolver.getIsSyncable(account0, "com.android.contacts") <= 0) {
                        this.i(egyc.a(account0));
                    }
                }
            }
        }
    }
}

