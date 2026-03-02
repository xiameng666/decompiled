import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import j..util.DesugarCollections;
import java.util.List;

public final class fxui {
    private static fxui a;
    private final fxtu b;
    private final List c;

    public fxui(List list0, fxtu fxtu0) {
        this.b = fxtu0;
        this.c = DesugarCollections.unmodifiableList(list0);
    }

    public final int a(Context context0, String s, UlrPrivateModeRequest ulrPrivateModeRequest0) {
        synchronized(this) {
            if(!hzew.c()) {
                fxqw.f("Ulr private Mode feature is not enabled");
                return 0xDBB;
            }
            List list0 = this.c;
            if(!list0.contains(s)) {
                fxqw.f(a.I(list0, s, " is not in:"));
                return 3500;
            }
            if(hyac.R()) {
                elwg elwg0 = new elwg();
                elwg0.c("ulr_incognito");
                emhd emhd0 = new emhd(context0, elwg0.a());
                azzc azzc0 = new azzc();
                azzc0.a = new emgy(emhd0, ulrPrivateModeRequest0.b);
                azzc0.c = new Feature[]{elvi.a};
                azzc0.d = 31105;
                emhd0.jn(azzc0.a());
            }
            boolean z = ulrPrivateModeRequest0.b;
            fxtu fxtu0 = this.b;
            boolean z1 = fxtu0.k();
            if(z1 != z) {
                if(z1) {
                    fxqw.c("GCoreUlr", "Exit Private mode!");
                }
                else {
                    fxqw.c("GCoreUlr", "Enter Private mode!");
                }
                SharedPreferences.Editor sharedPreferences$Editor0 = fxtu0.a.edit();
                sharedPreferences$Editor0.putBoolean("privateModeKey", z);
                sharedPreferences$Editor0.apply();
                fxtk.e(context0, "PrivateUpdate");
            }
        }
        return 0;
    }

    public static fxui b(Context context0) {
        fxui fxui1;
        synchronized(fxui.class) {
            fxui fxui0 = fxui.a;
            if(fxui0 != null) {
                return fxui0;
            }
            fxva.g(context0);
            List list0 = fxva.d(hzew.a.b().a());
            azql.c(context0);
            fxui1 = new fxui(list0, fxtu.a(context0));
            fxui.a = fxui1;
        }
        return fxui1;
    }
}

