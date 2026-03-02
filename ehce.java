import android.accounts.Account;
import android.content.ContentResolver;
import android.net.Uri;
import j..util.Objects;
import java.util.ArrayList;

final class ehce extends clid {
    final ehci a;

    public ehce(ehci ehci0) {
        Objects.requireNonNull(ehci0);
        this.a = ehci0;
        super("people", "Cp2Observer", null);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        ehci ehci0 = this.a;
        cchj cchj0 = ehci0.c;
        if(cchj0 != null) {
            Account[] arr_account = cchj0.p("com.google");
            for(int v1 = 0; v1 < arr_account.length; ++v1) {
                Account account0 = arr_account[v1];
                ehcb ehcb0 = ehci0.d;
                if(ehcb0 != null && ehci0.e != null) {
                    if(!hxdo.a.b().k()) {
                        if(ContentResolver.getIsSyncable(account0, "com.android.contacts") <= 0) {
                            ehcb0.f(account0, egyc.a(account0), ehci.a);
                        }
                    }
                    else if(ContentResolver.getIsSyncable(account0, "com.android.contacts") == 0) {
                        ehcb0.f(account0, egyc.a(account0), ehci.a);
                    }
                    ehcb0.c(account0, egyc.a(account0));
                }
            }
        }
        Account[] arr_account1 = cchj0.p("com.google");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_account1.length; ++v) {
            Account account1 = arr_account1[v];
            if(ContentResolver.getIsSyncable(account1, "com.android.contacts") <= 0) {
                arrayList0.add(egyc.a(account1).e());
            }
        }
        if(arrayList0.isEmpty()) {
            ehci0.g();
            return;
        }
        gmbu.c(arrayList0).a(new ehcc(ehci0, arrayList0), gmap.a);
    }
}

