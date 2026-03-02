import android.content.Context;
import android.content.IntentFilter;
import java.io.Closeable;

public final class dcor implements Closeable {
    public final icnj a;
    public final icgv b;
    public final ichq c;
    public final icnl d;
    public final Context e;
    public final icig f;
    private final iced g;

    public dcor(Context context0, ibrt ibrt0, lpg lpg0) {
        ibuq.f(ibrt0, "actorContext");
        ibuq.f(lpg0, "lifecycle");
        icck icck0 = iccl.d(lpq.a(lpg0), ibrt0);
        super();
        icnl icnl0 = icnm.a(dika.a);
        this.d = icnl0;
        this.a = new icmp(icnl0);
        icgv icgv0 = icgx.a(0x7FFFFFFF, 0, null, 6);
        this.b = icgv0;
        this.c = icgv0;
        iced iced0 = icbb.b(icck0, new iccj("actor-command-loop"), null, new dcoe(this, null), 2);
        this.g = iced0;
        iced0.t(new dcod(this));
        this.e = context0;
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter0.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter0.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter0.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter0.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter0.addDataScheme("package");
        this.f = iclp.a(new icls(new dijc(dcvk.a(context0, "nearby", intentFilter0))), icck0, icmy.a(0L, 3), 1);
    }

    @Override
    public final void close() {
        iceb.a(this.g);
    }
}

