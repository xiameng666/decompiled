import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;

abstract class ezyy extends ezyn {
    public static final fagu g;
    public static final fagk h;
    protected static final fago i;
    public static final fagf j;
    private static final baun k;
    private static final fagp l;
    private static final fagp m;
    private final Context n;
    private final bbib o;

    static {
        ezyy.k = fabk.e("DelayExecutionAction");
        ezyy.g = new fagu("next_action_name", "");
        ezyy.h = new fagk("next_action_params");
        ezyy.i = new fago("constraints", ((MessageLite)fafq.a));
        ezyy.j = new fagf("enforce_delay", Boolean.valueOf(false));
        ezyy.l = new fagp("earliest_execution_time", ((long)0L));
        ezyy.m = new fagp("boot_token", ((long)-1L));
    }

    protected ezyy(String s, Context context0, fagj fagj0) {
        super(s, fagj0);
        this.n = context0;
        this.o = new bbib(context0);
    }

    @Override  // ezyj
    public ezyi a() {
        fagp fagp0 = ezyy.l;
        long v = ((long)(((Long)this.c(fagp0)))) == 0L ? this.f() : ((long)(((Long)this.c(fagp0))));
        long v1 = ((ezxl)ezxl.h.b()).b();
        fagp fagp1 = ezyy.m;
        long v2 = ((long)(((Long)this.c(fagp1)))) == -1L ? v1 : ((long)(((Long)this.c(fagp1))));
        if(!this.f && (v2 != v1 || v <= SystemClock.elapsedRealtime())) {
            return new ezyi(((String)this.c(ezyy.g)), ((fagj)this.c(ezyy.h)));
        }
        Long long0 = v;
        Object[] arr_object = {long0, ((double)(((double)(v - SystemClock.elapsedRealtime())) / 1000.0))};
        ezyy.k.j("Earliest execution time: %d (Delaying for %.3f seconds).", arr_object);
        this.h();
        PendingIntent pendingIntent0 = ezye.a(this.n, 0);
        this.o.j("DelayExecutionAction-Alarm", 3, v, pendingIntent0);
        if(((Boolean)this.c(ezyy.j)).booleanValue()) {
            fagi fagi0 = this.b().a();
            fagi0.e(fagp0, long0);
            fagi0.e(fagp1, Long.valueOf(v2));
            fagj fagj0 = fagi0.a();
            return new ezyi(this.a, fagj0, null);
        }
        return new ezyi(((String)this.c(ezyy.g)), ((fagj)this.c(ezyy.h)), null);
    }

    protected abstract long f();

    public static fafq g() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fafq.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fafp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fafp fafp0 = (fafp)hftp1.b_message;
        hfuf hfuf0 = fafp0.b;
        if(!hfuf0.c()) {
            fafp0.b = ProtoLiteMessage.C(hfuf0);
        }
        fafp0.b.i(12);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fafq fafq0 = (fafq)hftp0.b_message;
        fafp fafp1 = (fafp)hftp1.N_build();
        fafp1.getClass();
        fafq0.c = fafp1;
        fafq0.b |= 2;
        return (fafq)hftp0.N_build();
    }

    protected void h() {
    }
}

