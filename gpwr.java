import android.os.SystemClock;
import j..time.Instant;
import j..util.OptionalLong;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class gpwr {
    public final String a;
    public static final int b;
    private static final cnlk c;
    private final long d;
    private OptionalLong e;
    private final gfsi f;
    private final gfsi g;
    private final Deque h;
    private Long i;

    static {
        gpwr.c = new cnlk(new gpwq());
    }

    public gpwr(String s, long v, gfsi gfsi0, gfsi gfsi1) {
        this.e = OptionalLong.empty();
        this.h = new ArrayDeque();
        this.i = null;
        this.a = s;
        this.d = v;
        this.f = gfsi0;
        this.g = gfsi1;
    }

    protected final int a() {
        synchronized(this) {
        }
        return this.h.size();
    }

    protected final String b() {
        String s;
        synchronized(this) {
            if(this.a() == 0) {
                return "";
            }
            if(this.e.isEmpty()) {
                this.e = OptionalLong.of(Instant.now().minusMillis(SystemClock.elapsedRealtime()).toEpochMilli());
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cnrc.a).v_newBuilder();
            long v1 = this.e.getAsLong();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cnrc cnrc0 = (cnrc)hftp0.b_message;
            cnrc0.b |= 1;
            cnrc0.c = v1;
            Long long0 = this.i;
            gftb.check(long0);
            long v2 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cnrc cnrc1 = (cnrc)hftp0.b_message;
            cnrc1.b |= 2;
            cnrc1.d = v2;
            this.h();
            for(Object object0: this.h) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cnrc cnrc2 = (cnrc)hftp0.b_message;
                ((cnrj)object0).getClass();
                hfuo hfuo0 = cnrc2.e;
                if(!hfuo0.c()) {
                    cnrc2.e = ProtoLiteMessage.E(hfuo0);
                }
                cnrc2.e.add(((cnrj)object0));
            }
            byte[] arr_b = ((cnrc)hftp0.N_build()).toBytesArray();
            s = gpwr.c.a(arr_b);
        }
        return s;
    }

    public void c(long v, MessageLite hfvm0) {
        synchronized(this) {
            this.g(v, hfvm0, this.f);
        }
    }

    public final void d(long v, MessageLite hfvm0) {
        synchronized(this) {
            this.g(v, hfvm0, this.g);
        }
    }

    public void e() {
        synchronized(this) {
            this.h.clear();
            this.i = null;
        }
    }

    public void f(PrintWriter printWriter0) {
        throw null;
    }

    private final void g(long v, MessageLite hfvm0, gfsi gfsi0) {
        synchronized(this) {
            if(this.i == null) {
                this.i = fgvx.a();
            }
            try {
                Deque deque0 = this.h;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)gfsi0.apply(hfvm0);
                Long long0 = this.i;
                gftb.check(long0);
                long v2 = v - ((long)long0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cnrj cnrj0 = (cnrj)hftp0.b_message;
                cnrj0.b |= 1;
                cnrj0.c = v2;
                long v3 = fgvx.a();
                Long long1 = this.i;
                gftb.check(long1);
                long v4 = v3 - ((long)long1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                cnrj cnrj1 = (cnrj)hftp0.b_message;
                cnrj1.b |= 2;
                cnrj1.d = v4;
                deque0.add(((cnrj)hftp0.N_build()));
            }
            catch(IllegalArgumentException unused_ex) {
                hfvm0.getClass();
            }
        }
    }

    private final void h() {
        synchronized(this) {
            long v1 = fgvx.a();
            while(true) {
                Deque deque0 = this.h;
                if(deque0.isEmpty()) {
                    break;
                }
                cnrj cnrj0 = (cnrj)deque0.peekFirst();
                gftb.check(cnrj0);
                long v2 = cnrj0.d;
                Long long0 = this.i;
                gftb.check(long0);
                if(v1 - (v2 + ((long)long0)) < this.d) {
                    break;
                }
                deque0.removeFirst();
            }
        }
    }
}

