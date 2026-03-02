import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flgg implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final fmeo c;
    public final fltq d;

    public flgg(flit flit0, AccountContext accountContext0, fmeo fmeo0, fltq fltq0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmeo0;
        this.d = fltq0;
    }

    @Override
    public final void run() {
        int v = (int)iaea.d();
        flit flit0 = this.a;
        long v1 = ((long)flit0.i.nextInt(v)) + iaea.c();
        fmeo fmeo0 = this.c;
        fmen fmen0 = new fmen(fmeo0);
        flba.a();
        fmen0.d(System.currentTimeMillis() + v1);
        fltq fltq0 = this.d;
        String s = fltq0.a;
        if(!TextUtils.isEmpty(s)) {
            fmen0.j(s);
        }
        gfsx gfsx0 = fltq0.b;
        if(gfsx0.i() && !TextUtils.isEmpty(((CharSequence)gfsx0.d()))) {
            fmen0.b(((String)gfsx0.d()));
        }
        gfsx gfsx1 = fmeo0.d;
        if(flit.I(gfsx1, fltq0)) {
            fmen0.f(((String)fltq0.c.d()));
            fmen0.g(true);
        }
        else {
            gfsx gfsx2 = fltq0.d;
            if(gfsx2.i()) {
                byte[] arr_b = (byte[])gfsx2.d();
                if(arr_b.length > 0) {
                    fmen0.e(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
                }
            }
        }
        gfsx gfsx3 = fltq0.i;
        if(gfsx3.i()) {
            fmen0.h(((fmfl)gfsx3.d()));
        }
        gfsx gfsx4 = fltq0.j;
        if(gfsx4.i()) {
            fmen0.m(((fmhn)gfsx4.d()));
        }
        gfsx gfsx5 = fltq0.k;
        if(gfsx5.i()) {
            fmen0.k(((Long)gfsx5.d()).longValue());
        }
        AccountContext accountContext0 = this.b;
        fmen0.i(fltq0.g);
        fmen0.l(fltq0.h);
        fmeo fmeo1 = fmen0.a();
        flit0.d(accountContext0).ak(fmeo1);
        if(gfsx1.equals(fmeo1.d) && fmeo1.e.i()) {
            return;
        }
        flit0.u.e(accountContext0, fmeo1);
    }
}

