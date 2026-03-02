import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class dcqq {
    private final ScheduledExecutorService a;
    private sod b;
    private final Context c;
    private cumn d;

    public dcqq(Context context0) {
        this.a = cuui.f();
        this.c = context0;
    }

    @Deprecated
    public final Pair a(List list0) {
        Byte byte0 = (byte)0;
        Integer integer0 = (int)0;
        if(!this.f()) {
            return new Pair(integer0, byte0);
        }
        Pair pair0 = (Pair)cuuc.f("evaluateAppFiles", jqy.a(new dcqi(this, list0)));
        this.e();
        return pair0 == null ? new Pair(integer0, byte0) : pair0;
    }

    public final sod b() {
        if(this.b == null) {
            this.b = new sod(this.c);
        }
        return this.b;
    }

    @Deprecated
    public final void c(List list0, dcqp dcqp0) {
        if(!this.f()) {
            dcqp0.a(dbvj.a(1));
            return;
        }
        if(list0 != null && !list0.isEmpty()) {
            dcqj dcqj0 = new dcqj(this, list0, dcqp0);
            cuui.d().execute(dcqj0);
            return;
        }
        dcvz.a.e().p("Phonesky P2P install paths is null or empty", new Object[0]);
        dcqp0.a(dbvj.a(1));
    }

    public final boolean d() {
        if(this.b().e()) {
            return true;
        }
        dcvz.a.b().p("Phonesky P2P Service is not ready.", new Object[0]);
        return false;
    }

    private final void e() {
        cumn cumn0 = this.d;
        if(cumn0 != null) {
            cumn0.b();
            this.d = null;
        }
        dcqk dcqk0 = new dcqk(this);
        long v = hvqs.a.aT().Y();
        this.d = cumn.d(dcvz.a, dcqk0, v, this.a);
    }

    private final boolean f() {
        if(hvqz.s()) {
            return false;
        }
        if(this.d()) {
            this.e();
            return true;
        }
        Boolean boolean0 = (Boolean)cuuc.f("connectService", jqy.a(new dcql(this)));
        this.e();
        return boolean0 != null && boolean0.booleanValue();
    }
}

