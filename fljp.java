import android.database.Cursor;
import android.database.SQLException;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import jeb.synthetic.TWR;

public final class fljp implements glzm {
    public final fljw a;
    public final ContactId b;

    public fljp(fljw fljw0, ContactId contactId0) {
        this.a = fljw0;
        this.b = contactId0;
    }

    @Override  // glzm
    public final gmcd a() {
        flji flji0;
        gfsx gfsx3;
        gfqx gfqx0;
        byte[] arr_b;
        Cursor cursor1;
        Cursor cursor0;
        flnc flnc0;
        gfsx gfsx2;
        fljw fljw0 = this.a;
        flna flna0 = fljw0.k;
        gfsx gfsx0 = flna0.e(this.b);
        if(!gfsx0.i()) {
            return gmbu.i(gfqx.a);
        }
        AccountContext accountContext0 = (AccountContext)gfsx0.d();
        if(accountContext0.b() == fmav.b) {
            fljw0.f(((AccountContext)gfsx0.d()).c().f());
            return gmbu.i(gfsx0);
        }
        gfsx gfsx1 = flna0.g(((AccountContext)gfsx0.d()));
        if(!gfsx1.i()) {
            flbj.c("TyRegController", "AuthToken not present for a valid account context");
            return gmbu.i(gfsx0);
        }
        fljw0.o.j(accountContext0);
        if(fljw.h(((fmbl)gfsx1.d()))) {
            flju flju0 = new flju(fljw0, accountContext0);
            fljw0.i.e(flju0);
        }
        if(!iacw.a.c().d()) {
            return gmbu.i(gfsx0);
        }
        ContactId contactId0 = accountContext0.c().f();
        if(iadc.d()) {
            flmy flmy0 = new flmy(flna0, contactId0);
            gfsx2 = (gfsx)flng.a(flna0.a, flmy0);
        }
        else {
            try {
                flnc0 = flna0.a;
                flnc0.d();
                try(cursor0 = flna0.c(contactId0)) {
                    if(cursor0.moveToFirst()) {
                        cursor1 = flnc0.h(flna0.d("registration"), new String[]{"registration_properties"}, "registration_id=?", new String[]{Long.toString(cursor0.getInt(0))}, null, null);
                        TWR.declareResource(cursor1);
                        TWR.useResource$NT(cursor1);
                        if(cursor1.moveToFirst()) {
                            TWR.useResource$NT(cursor1);
                            arr_b = cursor1.getBlob(0);
                            if(arr_b == null) {
                                TWR.useResource$NT(cursor1);
                                gfqx0 = gfqx.a;
                            label_47:
                                goto label_48;
                            }
                            else {
                                goto label_52;
                            }
                        }
                        else {
                            TWR.useResource$NT(cursor1);
                            gfqx0 = gfqx.a;
                            goto label_47;
                        }
                    }
                    else {
                        goto label_67;
                    }
                }
                goto label_70;
            }
            catch(Exception exception0) {
                throw new SQLException("Error when executing transaction!!", exception0);
            }
            catch(Throwable throwable0) {
                goto label_60;
            }
        label_48:
            flnc0.f();
            flnc0.e();
            gfsx2 = gfqx0;
            goto label_70;
            try {
                try {
                label_52:
                    TWR.useResource$NT(cursor0);
                    TWR.useResource$NT(cursor1);
                    gfsx3 = flos.c(arr_b);
                    TWR.useResource$NT(cursor0);
                }
                catch(Exception exception0) {
                    throw new SQLException("Error when executing transaction!!", exception0);
                }
            }
            catch(Throwable throwable0) {
            label_60:
                flna0.a.f();
                flna0.a.e();
                throw throwable0;
            }
            flna0.a.f();
            flna0.a.e();
            gfsx2 = gfsx3;
            goto label_70;
        label_67:
            flna0.a.f();
            flna0.a.e();
            gfsx2 = gfqx.a;
        }
    label_70:
        if(gfsx2.i()) {
            fmgp fmgp0 = (fmgp)gfsx2.d();
            long v = iacw.a.c().c();
            int v1 = (int)iacw.b();
            long v2 = v + ((long)fljw0.c.nextInt(v1));
            long v3 = iacw.a.c().a();
            int v4 = (int)iacw.b();
            long v5 = v3 + ((long)fljw0.c.nextInt(v4));
            flba.a();
            long v6 = fmgp0.a;
            long v7 = System.currentTimeMillis();
            if(v7 > v2 + v6) {
                goto label_87;
            }
            gged_interceptors gged0 = gged_interceptors.i(flce.c().a());
            if((!gged0.containsAll(fmgp0.b) || !fmgp0.b.containsAll(gged0)) && v7 > v6 + v5) {
                flji0 = new flji(fljw0, accountContext0);
                gmbu.d(new gmcd[]{fljw0.i.e(flji0)}).a(new fljj(fljw0, accountContext0), gmap.a);
                return gmbu.i(gfsx0);
            label_87:
                flji0 = new flji(fljw0, accountContext0);
                gmbu.d(new gmcd[]{fljw0.i.e(flji0)}).a(new fljj(fljw0, accountContext0), gmap.a);
                return gmbu.i(gfsx0);
            }
        }
        else {
            flji0 = new flji(fljw0, accountContext0);
            gmbu.d(new gmcd[]{fljw0.i.e(flji0)}).a(new fljj(fljw0, accountContext0), gmap.a);
        }
        return gmbu.i(gfsx0);
    }
}

