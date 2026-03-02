import android.content.Context;
import android.util.EventLog;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class ezxu {
    public static final fage a;
    public final fabj b;
    private static final baun c;
    private static final fagl d;
    private static final fagp e;
    private static final fagp f;
    private static final fagp g;
    private static final fagf h;
    private final Context i;
    private final fagt j;
    private final int k;

    static {
        ezxu.c = fabk.d("LogControl");
        Integer integer0 = (int)0;
        ezxu.d = new fagl("control.log.last_event_log_hash_code", integer0);
        ezxu.e = new fagp("control.log.last_event_log_timestamp", ((long)0L));
        new fagl("control.log.zero_rated_apn_status", integer0);
        Long long0 = (long)-1L;
        ezxu.f = new fagp("control.log.current_heart_beat_min_delay", long0);
        ezxu.g = new fagp("control.log.current_heart_beat_max_delay", long0);
        ezxu.h = new fagf("control.log.heart_beat_task_scheduled", Boolean.valueOf(false));
        ezxu.a = new ezxt();
    }

    public ezxu(Context context0) {
        this.i = context0;
        this.j = (fagt)fagt.a.b();
        this.b = new fabj(context0);
        this.k = ezwu.a(context0);
    }

    public final void a() {
        fage fage0 = ezxs.l;
        SystemUpdateStatus systemUpdateStatus0 = ((ezxs)fage0.b()).b();
        int v = systemUpdateStatus0.c;
        String s = systemUpdateStatus0.a;
        int v1 = Arrays.hashCode(new Object[]{v, s});
        long v2 = System.currentTimeMillis();
        long v3 = TimeUnit.SECONDS.toMillis(ezwj.i().longValue());
        fagt fagt0 = this.j;
        fagl fagl0 = ezxu.d;
        int v4 = (int)(((Integer)fagt0.b(fagl0)));
        fagp fagp0 = ezxu.e;
        long v5 = v2 - ((long)(((Long)fagt0.b(fagp0))));
        if(v4 == v1 && (!ezxu.g(systemUpdateStatus0) || v5 < v3)) {
            return;
        }
        fagt0.e(new fagh[]{new fagh(fagl0, v1), new fagh(fagp0, v2)});
        ezxl ezxl0 = (ezxl)ezxl.h.b();
        SystemUpdateStatus systemUpdateStatus1 = ((ezxs)fage0.b()).b();
        int v6 = systemUpdateStatus1.c;
        int v7 = systemUpdateStatus1.i ? v6 & 0x1F | 0x20 : v6 & 0x1F;
        if(systemUpdateStatus1.j) {
            v7 |= 0x40;
        }
        if(ezxl0.a() > 0L) {
            v7 |= 0x200;
        }
        String s1 = ((ezxs)fage0.b()).b().a;
        Integer integer0 = (int)0;
        EventLog.writeEvent(201001, new Object[]{((long)((v6 >> 8 & 15) << 19 | (0x40000 | v7) | ((char)this.k) << 23)), integer0, integer0, s1});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gihh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gihh)hftv0).b |= 1;
        ((gihh)hftv0).c = v;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gihh gihh0 = (gihh)hftp0.b_message;
            gihh0.b |= 2;
            gihh0.d = s;
        }
        fabj fabj0 = this.b;
        gihh gihh1 = (gihh)hftp0.N_build();
        ProtoLiteBuilder hftp1 = fabj0.g(2);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gigw gigw0 = (gigw)hftp1.b_message;
        gihh1.getClass();
        gigw0.g = gihh1;
        gigw0.b |= 16;
        fabj0.f(((gigw)hftp1.N_build()));
    }

    public final void b() {
        if((!((Boolean)this.j.b(ezxu.h)).booleanValue() || !ezwm.b().equals(this.j.b(ezxu.f)) || !ezwm.a().equals(this.j.b(ezxu.g))) && ezxu.f()) {
            this.c();
            this.e(true);
            return;
        }
        this.e(false);
    }

    public final void c() {
        ChimeraGcmTaskService.a.h("Scheduling task: LogHeartBeat.", new Object[0]);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        clkn0.t("LogHeartBeat");
        clkn0.e(ezwm.b().longValue(), ezwm.a().longValue());
        clkn0.p = true;
        clkn0.y(2, 2);
        clkn0.x(0, 1);
        clkn0.v(1);
        cljp.a(this.i).f(clkn0.a());
    }

    public final void d() {
        if(ezxu.g(((ezxs)ezxs.l.b()).b())) {
            ChimeraGcmTaskService.a.h("Scheduling task: LogStatus.", new Object[0]);
            clkn clkn0 = new clkn();
            clkn0.j = "com.google.android.gms.update.SystemUpdateGcmTaskService";
            clkn0.t("LogStatus");
            clkn0.e(ezwj.i().longValue(), ((Long)ezwo.d(hvzy.N, Long.class)).longValue());
            clkn0.p = true;
            clkn0.y(2, 2);
            clkn0.x(0, 1);
            clkn0.v(1);
            cljp.a(this.i).f(clkn0.a());
        }
    }

    public final void e(boolean z) {
        if(z) {
            fagh[] arr_fagh = new fagh[1];
            Long long0 = ezwm.a();
            arr_fagh[0] = new fagh(ezxu.g, long0);
            this.j.e(arr_fagh);
            fagh[] arr_fagh1 = new fagh[1];
            Long long1 = ezwm.b();
            arr_fagh1[0] = new fagh(ezxu.f, long1);
            this.j.e(arr_fagh1);
        }
        this.j.e(new fagh[]{new fagh(ezxu.h, Boolean.valueOf(z))});
    }

    public static boolean f() {
        if(((Boolean)ezwo.a(hwcy.b, Boolean.class)).booleanValue() && ((ezxs)ezxs.l.b()).b().a.isEmpty()) {
            if(((long)ezwm.b()) > 0L && ((long)ezwm.a()) > 0L && ((long)ezwm.b()) < ((long)ezwm.a())) {
                return true;
            }
            Object[] arr_object = {ezwm.b(), ezwm.a()};
            ezxu.c.f("Tasks parameter min_delay: %d, max_delay: %d incorrect.", arr_object);
        }
        return false;
    }

    private static boolean g(SystemUpdateStatus systemUpdateStatus0) {
        return !systemUpdateStatus0.a.isEmpty() || ((Boolean)ezwo.a(hwcy.c, Boolean.class)).booleanValue();
    }
}

