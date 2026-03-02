import android.content.Context;
import com.google.android.gms.update.SystemUpdateStatus;

public final class ezyd {
    public static final baun a;
    public static final fage b;
    public final Context c;
    public final ezxl d;
    public final ezxs e;

    static {
        ezyd.a = fabk.d("ReminderDialogControl");
        ezyd.b = new ezyc();
    }

    public ezyd(Context context0) {
        this.c = context0;
        this.d = (ezxl)ezxl.h.b();
        this.e = (ezxs)ezxs.l.b();
    }

    public final void a(SystemUpdateStatus systemUpdateStatus0, Long long0) {
        if(ezyd.d(systemUpdateStatus0, gfsx.m(long0))) {
            this.d.r();
        }
    }

    public final void b(SystemUpdateStatus systemUpdateStatus0) {
        if(ezyd.d(systemUpdateStatus0, gfqx.a)) {
            this.d.r();
        }
    }

    public static boolean c() {
        if(!((Boolean)ezwo.a(hvxj.f, Boolean.class)).booleanValue()) {
            return ((Boolean)ezwo.a(hvxj.g, Boolean.class)).booleanValue() ? false : false;
        }
        return true;
    }

    public static final boolean d(SystemUpdateStatus systemUpdateStatus0, gfsx gfsx0) {
        if(ezyd.c()) {
            long v = System.currentTimeMillis() - systemUpdateStatus0.n;
            String s = ezwg.b();
            long v1 = -1L;
            if(!gfta.c(s)) {
                long v2 = 0L;
                for(Object object0: gfud.e(',').l(s)) {
                    String s1 = (String)object0;
                    try {
                        v2 += Long.parseLong(s1.trim());
                        if(v < v2) {
                            v1 = v2 - v;
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        ezwx.a.d("Malformed elapsed time string: %s.", new Object[]{s1});
                    }
                    break;
                }
            }
            int v3 = ezwx.b(v);
            boolean z = ezwx.d(systemUpdateStatus0);
            ezyd.a.h("Dialog phase: %d, User actionable: %s, Millis until next phase: %d, millisUntilNextExecution: %s", new Object[]{v3, Boolean.valueOf(z), v1, gfsx0});
            if(z && v3 == 0 && v1 >= 0L) {
                return gfsx0.i() ? v1 < ((long)(((Long)gfsx0.d()))) : true;
            }
        }
        return false;
    }
}

