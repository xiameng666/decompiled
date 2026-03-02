import android.graphics.BitmapFactory;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;
import java.util.concurrent.Callable;

public final class flej implements Callable {
    public final flen a;
    public final AccountContext b;
    public final fmeo c;
    public final gmcd d;

    public flej(flen flen0, AccountContext accountContext0, fmeo fmeo0, gmcd gmcd0) {
        this.a = flen0;
        this.b = accountContext0;
        this.c = fmeo0;
        this.d = gmcd0;
    }

    @Override
    public final Object call() {
        long v = iaea.c();
        int v1 = (int)iaea.d();
        flbj.a("LitContactCtrlr", "maybeApplyUpdateAndSaveSyncedContact called");
        flkj flkj0 = (flkj)gmbu.r(this.d);
        flba.a();
        flen flen0 = this.a;
        long v2 = System.currentTimeMillis() + ((long)flen0.e.nextInt(v1)) + v;
        int v3 = flkj0.b - 1;
        if(flkj0.b == 0) {
            throw null;
        }
        Object object0 = this.c;
        if(v3 != 1) {
            flbj.e("LitContactCtrlr", "contact profile is not supported.");
            fmen fmen0 = new fmen(((fmeo)object0));
            fmen0.d(v2);
            return fmen0.a();
        }
        flbj.a("LitContactCtrlr", "Got contact profile");
        gfsx gfsx0 = flkj0.a;
        if(!gfsx0.i()) {
            flbj.c("LitContactCtrlr", "Got empty contact profile.");
            return object0;
        }
        fmen fmen1 = fmeo.a();
        fmen1.c(object0.a);
        fmen1.j(((fltq)gfsx0.d()).a);
        fmen1.d(v2);
        fmen1.i(((fltq)gfsx0.d()).g);
        fmen1.l(((fltq)gfsx0.d()).h);
        if(((fltq)gfsx0.d()).b.i()) {
            fmen1.b(((String)((fltq)gfsx0.d()).b.d()));
        }
        if(((fltq)gfsx0.d()).i.i()) {
            fmen1.h(((fmfl)((fltq)gfsx0.d()).i.d()));
        }
        if(((fltq)gfsx0.d()).c.i()) {
            fmen1.f(((String)((fltq)gfsx0.d()).c.d()));
            Objects.requireNonNull(fmen1);
            flef flef0 = new flef(fmen1);
            flbl.b(object0.e, flef0);
            gfsx gfsx1 = ((fltq)gfsx0.d()).c;
            if(!object0.d.equals(gfsx1)) {
                fmen1.g(true);
            }
        }
        else if(((fltq)gfsx0.d()).d.i()) {
            byte[] arr_b = (byte[])((fltq)gfsx0.d()).d.d();
            if(arr_b.length > 0) {
                fmen1.e(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
            }
        }
        gfsx gfsx2 = ((fltq)gfsx0.d()).j;
        if(gfsx2.i()) {
            fmen1.m(((fmhn)gfsx2.d()));
        }
        Object object1 = fmen1.a();
        flen0.a(this.b).ak(((fmeo)object1));
        return object1;
    }
}

