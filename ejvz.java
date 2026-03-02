import android.content.Context;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

public final class ejvz extends ejvt {
    private final TaskEntity h;

    public ejvz(ejtq ejtq0, String s, String s1, TaskEntity taskEntity0, azug azug0) {
        super(ejtq0, s, s1, "CreateRecurrence", azug0);
        this.h = taskEntity0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6004;
    }

    @Override  // ejvt
    public final void f(Context context0) {
        if(this.n(context0, false)) {
            String s = ejvh.a(this.h.q.e());
            ejtq ejtq0 = this.g;
            ejvq.a().c(s, ejtq0);
            ejws.f(this.d);
        }
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geeb.a).v_newBuilder();
        gefy gefy0 = ejxi.g(this.h);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gefy0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gefy0));
        gedk gedk0 = ((gefy)hftp1.b_message).t;
        if(gedk0 == null) {
            gedk0 = gedk.a;
        }
        if((gedk0.b & 1) != 0) {
            gedk gedk1 = ((gefy)hftp1.b_message).t;
            if(gedk1 == null) {
                gedk1 = gedk.a;
            }
            gedi gedi0 = gedk1.c == null ? gedi.a : gedk1.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geeb geeb0 = (geeb)hftp0.b_message;
            gedi0.getClass();
            geeb0.g = gedi0;
            geeb0.b |= 16;
        }
        gedk gedk2 = ((gefy)hftp1.b_message).t;
        if(((gedk2 == null ? gedk.a : gedk2).b & 2) != 0) {
            if(gedk2 == null) {
                gedk2 = gedk.a;
            }
            gedj gedj0 = gedk2.d == null ? gedj.a : gedk2.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geeb geeb1 = (geeb)hftp0.b_message;
            gedj0.getClass();
            geeb1.e = gedj0;
            geeb1.b |= 4;
        }
        gefy gefy1 = (gefy)hftp1.b_message;
        if((gefy1.b & 4) != 0) {
            gegc gegc0 = gefy1.e == null ? gegc.a : gefy1.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geeb geeb2 = (geeb)hftp0.b_message;
            gegc0.getClass();
            geeb2.d = gegc0;
            geeb2.b |= 2;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geeb geeb3 = (geeb)hftp0.b_message;
        gefz0.getClass();
        geeb3.c = gefz0;
        geeb3.b |= 1;
        ejvz.w(hftp1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geeb geeb4 = (geeb)hftp0.b_message;
        gefy gefy2 = (gefy)hftp1.N_build();
        gefy2.getClass();
        geeb4.f = gefy2;
        geeb4.b |= 8;
        arrayList0.add(this.c(2, ((MessageLite)(((geeb)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        this.h(arrayList0, this.h);
    }
}

