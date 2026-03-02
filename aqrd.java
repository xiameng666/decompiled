import android.content.Context;
import java.util.concurrent.Executor;

public final class aqrd {
    public static final baun a;
    public static final grns b;
    public static final grku c;
    public final Executor d;
    public final Context e;
    public final acqj f;

    static {
        aqrd.a = aqql.a("BackupAuditRecordLogger");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = gqtz.L;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grns grns0 = (grns)hftp0.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        aqrd.b = (grns)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.t;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grku)hftp1.b_message).c = gqub0.mk;
        ((grku)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grjl.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        grjl grjl0 = (grjl)hftp3.b_message;
        grjl0.b |= 0x400;
        grjl0.k = true;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp2.b_message;
        grjl grjl1 = (grjl)hftp3.N_build();
        grjl1.getClass();
        grkv0.h = grjl1;
        grkv0.b |= 8;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grku grku0 = (grku)hftp1.b_message;
        grkv grkv1 = (grkv)hftp2.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        aqrd.c = (grku)hftp1.N_build();
    }

    public aqrd(Context context0, Executor executor0) {
        this(context0, executor0, new acqn(context0));
    }

    public aqrd(Context context0, Executor executor0, acqj acqj0) {
        this.d = executor0;
        this.e = context0;
        this.f = acqj0;
    }

    public final evql a(String s, grku grku0, grns grns0, grkh grkh0) {
        baun baun0 = aqrd.a;
        baun0.j("record consent", new Object[0]);
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grku0.getClass();
        grkg0.f = grku0;
        grkg0.b |= 4;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grns0.getClass();
        grkg1.g = grns0;
        grkg1.b |= 8;
        baun0.j(((ProtoLiteMessage)(((grkg)((ProtoLiteBuilder)grkf0).N_build()))).toString(), new Object[0]);
        evql evql0 = aqrn.b(this.e, this.d, s);
        aqrj aqrj0 = new aqrj(this.f, grkf0, s, grkh0);
        evql evql1 = evql0.f(this.d, aqrj0);
        evql1.A(new aqrb());
        return evql1;
    }
}

