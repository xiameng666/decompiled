import android.accounts.Account;
import android.content.ContentResolver;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class egvu implements DialogInterface.OnClickListener {
    public final egrw a;

    public egvu(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        egrw egrw0 = this.a;
        if(egrw0 != null) {
            egrw0.E(36);
            ContentResolver.cancelSync(egrw0.a, "com.android.contacts");
            if(!hxdo.f()) {
                if(egrw0.aj && egrw0.ak && egxj.q(egrw0.a)) {
                    ContentResolver.setIsSyncable(egrw0.a, "com.android.contacts", 0);
                }
                egrw0.B(false);
            }
            if(egrw0.al != null) {
                egrw0.E(34);
                if(hxdo.c()) {
                    egrw0.b.o(egrw0.al, egrw0.a);
                }
                else {
                    eguv eguv0 = egrw0.b;
                    efyq efyq0 = egrw0.al;
                    Account account0 = egrw0.a;
                    if(eguv0.u != null && efyq0 != null) {
                        gmbu.t(eguv0.e(true), new egur(eguv0, efyq0, account0), gmap.a);
                    }
                }
            }
            egrw0.b.k();
        }
    }
}

