import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model..AutoValue_AccountContext;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.AccountUsers;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import j..time.Instant;
import java.security.KeyPair;
import java.util.HashSet;
import java.util.Set;
import jeb.synthetic.TWR;

public final class flna {
    public final flnc a;
    private final Context b;

    public flna(Context context0, flnc flnc0) {
        this.b = context0;
        this.a = flnc0;
    }

    public final Cursor a() {
        Uri uri0 = this.d("registration");
        return this.a.h(uri0, new String[]{"registration_id"}, null, null, null, null);
    }

    public final Cursor b(AccountUsers accountUsers0) {
        Cursor cursor0 = this.c(accountUsers0.f());
        gged_interceptors gged0 = accountUsers0.g();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ContactId contactId0 = (ContactId)gged0.get(v1);
            if(cursor0.moveToFirst()) {
                break;
            }
            cursor0.close();
            cursor0 = this.c(contactId0);
        }
        return cursor0;
    }

    public final Cursor c(ContactId contactId0) {
        String[] arr_s = {(contactId0.b() == ContactId.ContactType.c ? flbd.a(contactId0.d()) : contactId0.d()), String.valueOf(contactId0.b().f), contactId0.e()};
        return this.l(flnh.i("registration", flqu.a), "reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?", arr_s);
    }

    public final Uri d(String s) {
        return flnh.a("com.google.android.gms.lighter.data", "REGISTRATION", s, new String[0]);
    }

    public final gfsx e(ContactId contactId0) {
        gfsx gfsx0;
        if(iadc.d()) {
            flmv flmv0 = new flmv(this, contactId0);
            return (gfsx)flng.a(this.a, flmv0);
        }
        try {
            this.a.d();
            gfsx0 = gfqx.a;
            Cursor cursor0 = this.c(contactId0);
            try {
                if(cursor0.moveToFirst()) {
                    gfsx0 = this.f(((long)cursor0.getInt(0)));
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
            this.a.f();
        }
        catch(Exception exception0) {
            throw new SQLException("Error when executing transaction!!", exception0);
        }
        finally {
            this.a.e();
        }
        return gfsx0;
    }

    public final gfsx f(long v) {
        gftb.q(this.a.g());
        try(Cursor cursor0 = this.l(flnh.h(new String[][]{flnh.i("registration", flqu.a), flnh.i("reachability", flqs.a)}), "registration.registration_id =? ", new String[]{Long.toString(v)})) {
            if(cursor0.moveToFirst()) {
                String s = cursor0.getString(cursor0.getColumnIndex("tachyon_app_name"));
                long v1 = cursor0.getLong(cursor0.getColumnIndex("registration_id"));
                byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndex("server_registration_id"));
                int v2 = cursor0.getInt(cursor0.getColumnIndex("server_registration_status"));
                fmay fmay0 = new fmay(null);
                fmay0.e(s);
                HashSet hashSet0 = new HashSet();
                do {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("reachability_id"));
                    switch(ContactId.ContactType.a(cursor0.getInt(cursor0.getColumnIndex("reachability_type"))).ordinal()) {
                        case 1: {
                            hashSet0.add(s1);
                            break;
                        }
                        case 2: {
                            fmay0.c(s1);
                            break;
                        }
                        case 4: {
                            fmay0.b(s1);
                            break;
                        }
                    }
                }
                while(cursor0.moveToNext());
                fmay0.d(hashSet0);
                fmat fmat0 = AccountContext.e();
                fmat0.b(v1);
                fmat0.c(ByteString.copyFrom(arr_b));
                fmat0.e(fmay0);
                fmat0.d(fmav.a(v2));
                return gfsx.m(fmat0.a());
            }
        }
        return gfqx.a;
    }

    public final gfsx g(AccountContext accountContext0) {
        try(Cursor cursor0 = this.b(accountContext0.c())) {
            if(cursor0.moveToFirst()) {
                fmbj fmbj0 = fmbl.a();
                fmbj0.b(glxs.b(cursor0.getLong(3)));
                fmbj0.c(Instant.ofEpochMilli(cursor0.getLong(9)));
                fmbj0.d(flbn.a(cursor0.getBlob(2)));
                gfsx gfsx0 = flos.b(cursor0.getBlob(5), cursor0.getBlob(6));
                if(gfsx0.i()) {
                    fmbj0.e(((KeyPair)gfsx0.d()));
                }
                return gfsx.m(fmbj0.a());
            }
        }
        return gfqx.a;
    }

    public final gged_interceptors h() {
        flnc flnc0;
        if(iadc.d()) {
            flmx flmx0 = new flmx(this);
            return (gged_interceptors)flng.a(this.a, flmx0);
        }
        ggdy ggdy0 = new ggdy();
        try {
            try {
                flnc0 = this.a;
                flnc0.d();
                Cursor cursor0 = this.a();
                while(cursor0 != null) {
                    try {
                        if(cursor0.moveToNext()) {
                            gfsx gfsx0 = this.f(cursor0.getLong(0));
                            if(!gfsx0.i()) {
                                continue;
                            }
                            ggdy0.i(gfsx0.d());
                            continue;
                        }
                        break;
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(cursor0, throwable1);
                        throw throwable1;
                    }
                }
                if(cursor0 != null) {
                    cursor0.close();
                }
                flnc0.f();
            }
            catch(Exception exception0) {
                throw new SQLException("Error when executing transaction!!", exception0);
            }
        }
        catch(Throwable throwable0) {
            this.a.e();
            throw throwable0;
        }
        flnc0.e();
        return ggdy0.h();
    }

    public final void i(long v, AccountUsers accountUsers0) {
        gfsx gfsx0 = this.f(v);
        HashSet hashSet0 = ggog.g(accountUsers0.g());
        if(gfsx0.i()) {
            HashSet hashSet1 = ggog.g(((.AutoValue_AccountContext)gfsx0.d()).b.g());
            hashSet1.removeAll(hashSet0);
            this.m(v, hashSet1);
        }
        for(Object object0: hashSet0) {
            ContactId contactId0 = (ContactId)object0;
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("reachability_id", contactId0.d());
            contentValues0.put("reachability_normalized_id", (contactId0.b() == ContactId.ContactType.c ? flbd.a(contactId0.d()) : contactId0.d()));
            contentValues0.put("reachability_type", Integer.valueOf(contactId0.b().f));
            contentValues0.put("registration_id", Long.valueOf(v));
            Uri uri0 = this.d("reachability");
            this.a.c(uri0, contentValues0, 5);
        }
    }

    public final boolean j(AccountContext accountContext0) {
        ContactId contactId0 = accountContext0.c().f();
        try {
            Uri uri0 = this.d("registration");
            String s = ((.AutoValue_ContactId)contactId0).c == ContactId.ContactType.c ? flbd.a(((.AutoValue_ContactId)contactId0).a) : ((.AutoValue_ContactId)contactId0).a;
            this.a.a(uri0, "registration.registration_id IN (SELECT registration.registration_id FROM reachability INNER JOIN registration ON " + flnh.b("reachability", "registration_id") + " = " + flnh.b("registration", "registration_id") + " WHERE reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?)", new String[]{s, String.valueOf(((.AutoValue_ContactId)contactId0).c.f), ((.AutoValue_ContactId)contactId0).b});
            return true;
        }
        catch(SQLException sQLException0) {
            flbj.d("SQLiteRegStore", "Failed to delete Registration.", sQLException0);
            return false;
        }
    }

    public final boolean k(ContactId contactId0, ContentValues contentValues0) {
        flmw flmw0 = new flmw(this, contactId0, contentValues0);
        return ((Boolean)flng.a(this.a, flmw0)).booleanValue();
    }

    private final Cursor l(String[] arr_s, String s, String[] arr_s1) {
        return this.a.h(this.d("reachability INNER JOIN registration ON " + flnh.b("reachability", "registration_id") + " = " + flnh.b("registration", "registration_id")), arr_s, s, arr_s1, null, null);
    }

    private final void m(long v, Set set0) {
        for(Object object0: set0) {
            ContactId contactId0 = (ContactId)object0;
            try {
                Uri uri0 = this.d("reachability");
                String s = contactId0.b() == ContactId.ContactType.c ? flbd.a(contactId0.d()) : contactId0.d();
                this.a.a(uri0, "registration_id =? AND reachability_normalized_id =? ", new String[]{Long.toString(v), s});
            }
            catch(SQLException sQLException0) {
                flbj.d("SQLiteRegStore", "Failed to delete Registration.", sQLException0);
            }
        }
    }
}

