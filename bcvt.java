import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

public final class bcvt extends bark {
    public static xqu a;
    public final Looper b;
    public final ContextManagerClientInfo c;
    public yfn d;
    private yfn e;

    static {
        bcvt.a = xqu.a;
    }

    public bcvt(Context context0, Looper looper0, baqv baqv0, aqcr aqcr0, aztu aztu0, aztv aztv0) {
        super(context0, looper0, 0x2F, baqv0, aztu0, aztv0);
        this.b = looper0;
        this.c = ContextManagerClientInfo.b(context0, (baqv0.a == null ? "@@ContextManagerNullAccount@@" : baqv0.a.name), aqcr0);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 12451000;
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("com.google.android.contextmanager.service.args", bauc.n(this.c));
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerService");
        return (iInterface0 instanceof bcwg) ? ((bcwg)iInterface0) : new bcwe(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.contextmanager.internal.IContextManagerService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.contextmanager.service.ContextManagerService.START";
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp
    public final boolean hg() {
        return false;
    }

    public static Handler r(Looper looper0) {
        xqu xqu0 = bcvt.a;
        return xqu0 == null ? new clht(looper0) : xqu0.a(looper0);
    }

    public final yfn s() {
        if(this.e == null) {
            this.e = new yfn(this.b, bcvk.a);
        }
        return this.e;
    }

    public final void t(azvd azvd0, bcsw bcsw0, PendingIntent pendingIntent0) {
        bcvk bcvk0;
        batl.l(((boolean)((pendingIntent0 == null ? 1 : 0) ^ (bcsw0 == null ? 1 : 0))));
        this.N();
        if(bcsw0 == null) {
            bcvk0 = null;
        }
        else {
            bcvk0 = (bcvk)(((IInterface)this.s().a.remove(bcsw0)));
            if(bcvk0 == null) {
                azvd0.b(new Status(0));
                return;
            }
        }
        bcvs bcvs0 = new bcvs(this, bcvk0);
        bcwg bcwg0 = (bcwg)this.H();
        bcwc bcwc0 = new bcwc(azvd0, null, null, null, bcvs0);
        ApiMetadata apiMetadata0 = cclr.a(this.r);
        bcwg0.c(bcwc0, this.c.b, this.c.a, this.c.d, bcvk0, pendingIntent0, apiMetadata0);
    }
}

