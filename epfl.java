import android.content.Context;
import android.os.SystemClock;

public final class epfl {
    public static final baun a;
    public final epfi b;
    public final bbng c;
    public final epfm d;
    public final ProtoLiteBuilder e;
    public final ProtoLiteBuilder f;
    private final Context g;
    private final epfk h;
    private boolean i;

    static {
        epfl.a = new baun("SetupServices", new String[]{"MetricsHelper"});
    }

    public epfl(Context context0, epfi epfi0, epfk epfk0, bbng bbng0, epfm epfm0) {
        this.i = false;
        this.f = ((ProtoLiteMessage)ghoa.a).v_newBuilder();
        this.g = context0;
        this.b = epfi0;
        this.h = epfk0;
        this.c = bbng0;
        this.d = epfm0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        this.e = hftp0;
        if(epfi0.k().containsKey("MetricsHelper.event")) {
            byte[] arr_b = epfi0.k().getByteArray("MetricsHelper.event");
            if(arr_b != null && arr_b.length > 0) {
                try {
                    hftp0.A(arr_b, hftc.a());
                }
                catch(hfur hfur0) {
                    epfl.a.l(hfur0);
                }
            }
        }
        ProtoLiteBuilder hftp1 = this.f;
        ghoa ghoa0 = ((ghon)this.e.b_message).o;
        if(ghoa0 == null) {
            ghoa0 = ghoa.a;
        }
        hftp1.X(((ProtoLiteMessage)ghoa0));
    }

    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghoa ghoa0 = (ghoa)hftp0.b_message;
        ghoa0.b |= 2;
        ghoa0.d = v;
    }

    public final void b() {
        epfi epfi0 = this.b;
        long v = epfi0.k().getLong("MetricsHelper.last_resume_time", -1L);
        if(v != -1L) {
            long v1 = SystemClock.elapsedRealtime();
            long v2 = epfi0.k().getLong("MetricsHelper.foreground_duration", 0L) + (v1 - v);
            epfi0.k().putLong("MetricsHelper.foreground_duration", v2);
            epfi0.k().remove("MetricsHelper.last_resume_time");
            ProtoLiteBuilder hftp0 = this.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghoa ghoa0 = (ghoa)hftp0.b_message;
            ghoa0.b |= 4;
            ghoa0.e = v2;
        }
        ProtoLiteBuilder hftp1 = this.e;
        ghoa ghoa1 = (ghoa)this.f.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghoa1.getClass();
        ghon0.o = ghoa1;
        ghon0.b |= 0x1000;
        epfi0.k().putByteArray("MetricsHelper.event", ((ghon)hftp1.N_build()).toBytesArray());
    }

    public final void c() {
        if(this.i) {
            evrg.d(null);
            return;
        }
        this.i = true;
        ProtoLiteBuilder hftp0 = this.e;
        ProtoLiteBuilder hftp1 = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp0.b_message;
        ghoa ghoa0 = (ghoa)hftp1.N_build();
        ghoa0.getClass();
        ghon0.o = ghoa0;
        ghon0.b |= 0x1000;
        this.h.n();
        faih.a(this.g).cp().c(new epfj(this));
    }
}

