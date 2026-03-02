import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.FIN;

public final class canh {
    private long a;
    private long b;
    private int c;
    private final List d;
    private cang e;
    private final int f;
    private int g;

    public canh(int v) {
        this.b = 0L;
        this.c = -1;
        this.g = 2;
        this.f = v;
        this.d = new ArrayList();
        this.e = new cang();
    }

    public final gitb a() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gitb)hftv0).c = this.f - 2;
        long v1 = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gitb)hftp0.b_message).g = v1;
        if(this.c >= 0) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gisz.a).v_newBuilder();
            int v2 = this.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gisz)hftp1.b_message).b = v2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gitb gitb0 = (gitb)hftp0.b_message;
            gisz gisz0 = (gisz)hftp1.N_build();
            gisz0.getClass();
            gitb0.e = gisz0;
            gitb0.b |= 1;
        }
        int v3 = this.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gitb gitb1 = (gitb)hftp0.b_message;
        if(v3 != 1) {
            gitb1.d = v3 - 2;
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.d) {
                arrayList0.add(((canm)object0).a());
            }
            cang cang0 = this.e;
            if(cang0 != null) {
                gita gita0 = cang0.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gitb gitb2 = (gitb)hftp0.b_message;
                gita0.getClass();
                gitb2.h = gita0;
                gitb2.b |= 2;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gitb gitb3 = (gitb)hftp0.b_message;
            hfuo hfuo0 = gitb3.f;
            if(!hfuo0.c()) {
                gitb3.f = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, gitb3.f);
            gitb gitb4 = (gitb)hftp0.N_build();
            FIN.finallyCodeBegin$NT(v);
            return gitb4;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public final void b(canm canm0) {
        synchronized(this) {
            this.d.add(canm0);
        }
    }

    public final void c() {
        synchronized(this) {
            if(this.a > 0L) {
                this.b = SystemClock.elapsedRealtime() - this.a;
            }
        }
    }

    public final void d(int v) {
        synchronized(this) {
            this.c = v;
        }
    }

    public final void e(cang cang0) {
        synchronized(this) {
            this.e = cang0;
        }
    }

    public final void f() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final void g(int v) {
        synchronized(this) {
            this.g = v;
        }
    }
}

