import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.accountsettings.mg.ui.main.debug.DebugMenuView;
import java.util.List;

public final class aasu implements DialogInterface.OnClickListener {
    public final DebugMenuView a;
    public final List b;

    public aasu(DebugMenuView debugMenuView0, List list0) {
        this.a = debugMenuView0;
        this.b = list0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        DebugMenuView debugMenuView0 = this.a;
        if(v == 0) {
            debugMenuView0.c().a = null;
            debugMenuView0.e();
            return;
        }
        Object object0 = this.b.get(v - 1);
        ibuq.e(object0, "get(...)");
        debugMenuView0.c().a = (hoka)object0;
        debugMenuView0.e();
    }
}

