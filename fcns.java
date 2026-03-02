import android.content.Context;
import com.google.android.gms.wearable.backup.wear.BackupRollbackPhenotypeUpdateHandler.BackupRollbackReceiver;
import java.util.concurrent.Executor;

public final class fcns {
    public static final baun a;
    public static final String b;
    public final Context c;
    public final fcsf d;
    public final Executor e;
    public BackupRollbackPhenotypeUpdateHandler.BackupRollbackReceiver f;
    final frli g;

    static {
        fcns.a = new fcgf(new String[]{"RollbackPhenotypeHandler"});
        fcns.b = bbpz.f("com.google.android.gms.backup");
    }

    public fcns(Context context0, fcsf fcsf0, Executor executor0) {
        this.f = null;
        this.c = context0;
        this.d = fcsf0;
        this.e = executor0;
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("wearable");
        frce0.e("wear_backup_rollback.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)hfrr.a));
        frif frif0 = frie0.a();
        this.g = cjtb.a.a(frif0);
    }

    public final void a() {
        if(!hqna.d()) {
            return;
        }
        glzd.g(this.g.a(), new fcnp(this), this.e);
    }
}

