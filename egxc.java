import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import jeb.synthetic.TWR;

public final class egxc extends lqd {
    public final efyu a;
    public final Account h;
    public final Context i;
    public final gmcg j;
    public final egvc k;
    private final azts l;

    public egxc(egrz egrz0, gmcg gmcg0, Account account0) {
        this.h = account0;
        this.i = egrz0.a;
        this.j = gmcg0;
        efol efol0 = new efol();
        efol0.a = 560;
        efom efom0 = efol0.a();
        this.l = new azts(egrz0.a, efom0, null);
        this.a = new egbh(egrz0.a, efom0);
        this.k = new egvc();
    }

    public final int b() {
        int v;
        Cursor cursor0 = this.i.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "account_name = ? AND account_type = ?", new String[]{this.h.name, "com.google"}, null);
        if(cursor0 == null) {
            return 0;
        }
        try {
            v = cursor0.getCount();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    @Override  // lqd
    protected final void c() {
        if(this.a != null) {
            this.p();
            return;
        }
        azzc azzc0 = new azzc();
        azzc0.d = 2706;
        azzc0.a = new efoq(this.l, this.h);
        azzd azzd0 = azzc0.a();
        this.l.iG(azzd0).b(new egwx(this));
    }

    public final egxb o(ExtendedSyncStatus extendedSyncStatus0) {
        if(!ContentResolver.getSyncAutomatically(this.h, "com.android.contacts") && egxc.r(this.h)) {
            return hwyp.i() ? new egxb(4, this.q(), gfqx.a, 0, gfqx.a, -1L) : new egxb(4, 0, gfqx.a, 0, gfqx.a, -1L);
        }
        int v = extendedSyncStatus0.g;
        long v1 = -1L;
        if(v == 1) {
            if(hwyp.i()) {
                int v2 = egxc.s(extendedSyncStatus0.a);
                int v3 = this.q();
                gfsx gfsx0 = gfsx.m(Integer.valueOf(this.u()));
                if(extendedSyncStatus0.a == 1) {
                    v1 = extendedSyncStatus0.c;
                }
                return new egxb(v2, v3, gfqx.a, 0, gfsx0, v1);
            }
            int v4 = egxc.s(extendedSyncStatus0.a);
            int v5 = this.b();
            if(extendedSyncStatus0.a == 1) {
                v1 = extendedSyncStatus0.c;
            }
            return new egxb(v4, v5, gfqx.a, 0, gfqx.a, v1);
        }
        if(v == 3) {
            return extendedSyncStatus0.a == 1 ? new egxb(7, 0, gfqx.a, 0, gfqx.a, extendedSyncStatus0.c) : new egxb(8, 0, gfqx.a, 0, gfqx.a, -1L);
        }
        if(egxc.t(extendedSyncStatus0) && extendedSyncStatus0.e == 0) {
            return new egxb(9, 0, gfqx.a, 0, gfqx.a, -1L);
        }
        if(egxc.t(extendedSyncStatus0)) {
            int v6 = extendedSyncStatus0.i;
            if(v6 > 0) {
                int v7 = extendedSyncStatus0.e;
                if(v7 == 1) {
                    if(hwyw.c()) {
                        return egxb.a(10, v6, extendedSyncStatus0.h, extendedSyncStatus0.f);
                    }
                    if(extendedSyncStatus0.f == 1) {
                        return new egxb(10, v6, gfqx.a, 0, gfqx.a, -1L);
                    }
                }
                else if(v7 == 2) {
                    if(hwyw.c()) {
                        return egxb.a(11, v6, extendedSyncStatus0.h, extendedSyncStatus0.f);
                    }
                    if(extendedSyncStatus0.f == 1) {
                        return new egxb(10, v6, gfqx.a, 0, gfqx.a, -1L);
                    }
                }
            }
        }
        int v8 = extendedSyncStatus0.a;
        if(v8 == 2) {
            return extendedSyncStatus0.e == 0 ? new egxb(1, 0, gfqx.a, 0, gfqx.a, -1L) : null;
        }
        if(v8 == 1 && extendedSyncStatus0.e == 0) {
            if(hwyp.i()) {
                int v9 = this.q();
                gfsx gfsx1 = gfsx.m(Integer.valueOf(this.u()));
                return new egxb(2, v9, gfqx.a, 0, gfsx1, 0L);
            }
            return new egxb(2, this.b(), gfqx.a, 0, gfqx.a, 0L);
        }
        return null;
    }

    public final void p() {
        efyu efyu0 = this.a;
        if(efyu0 == null) {
            return;
        }
        Account account0 = this.h;
        if(egxc.r(account0)) {
            if(hwyp.i()) {
                this.l(new egxb(4, this.q(), gfqx.a, 0, gfqx.a, -1L));
                return;
            }
            this.l(new egxb(4, 0, gfqx.a, 0, gfqx.a, -1L));
            return;
        }
        if(!egyf.b(this.i)) {
            this.l(new egxb(5, 0, gfqx.a, 0, gfqx.a, -1L));
            return;
        }
        efyu0.c(new egwz(this), false, account0);
    }

    public final int q() {
        try {
            return this.b();
        }
        catch(SecurityException securityException0) {
            Log.e("SyncLiveData", securityException0.getClass().getName(), securityException0);
            return 0;
        }
    }

    static final boolean r(Account account0) {
        return hwyp.i() ? !egxj.q(account0) : !egxj.l(account0);
    }

    // String Decryptor: 2 succeeded, 0 failed
    private static final int s(int v) {
        switch(v) {
            case 0: {
                return 6;
            }
            case 1: {
                return 2;
            }
            default: {
                return v == 3 || v == 6 || (v == 7 || v == 8) ? 3 : 1;
            }
        }
    }

    private static final boolean t(ExtendedSyncStatus extendedSyncStatus0) {
        return extendedSyncStatus0.a == 3 || extendedSyncStatus0.a == 6 || extendedSyncStatus0.a == 7 || extendedSyncStatus0.a == 8;
    }

    private final int u() {
        try(Cursor cursor0 = this.i.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "account_name = ? AND account_type = ? AND dirty = 0 ", new String[]{this.h.name, "com.google"}, null)) {
            if(cursor0 != null) {
                return cursor0.getCount();
            }
        }
        catch(SecurityException securityException0) {
            Log.e("SyncLiveData", securityException0.getClass().getName(), securityException0);
        }
        return 0;
    }
}

