import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.accountsettings.mg.ui.main.debug.DebugMenuView;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class aasr implements fyqb {
    public final DebugMenuView a;

    public aasr(DebugMenuView debugMenuView0) {
        this.a = debugMenuView0;
    }

    @Override  // fyqb
    public final void a(MenuItem menuItem0) {
        DebugMenuView debugMenuView0 = this.a;
        switch(((nd)menuItem0).a) {
            case 1: {
                debugMenuView0.e();
                break;
            }
            case 2: {
                debugMenuView0.b().a();
                debugMenuView0.d().e();
                debugMenuView0.a().finish();
                break;
            }
            case 3: {
                zlg zlg0 = debugMenuView0.d().k;
                zlg0.a.b = ggnj.a;
                Objects.requireNonNull(zlg0.c);
                zlg0.a(new zlc(zlg0.c));
                break;
            }
            case 4: {
                EditText editText0 = new EditText(debugMenuView0.getContext());
                editText0.setHint("Advice Resource Key Id");
                editText0.setInputType(18);
                editText0.setTransformationMethod(null);
                FrameLayout frameLayout0 = new FrameLayout(debugMenuView0.getContext());
                int v = frameLayout0.getContext().getResources().getDimensionPixelSize(0x7F070169);  // dimen:as_alert_dialog_edit_text_margins
                frameLayout0.setPadding(v, v, v, v);
                frameLayout0.addView(editText0);
                fyju fyju0 = new fyju(debugMenuView0.a());
                fyju0.O("Advice Resource Key Id");
                fyju0.Q(frameLayout0);
                fyju0.u(debugMenuView0.getContext().getResources().getDimensionPixelSize(0x7F070C0F));  // dimen:mtrl_alert_dialog_background_inset_start
                fyju0.t(debugMenuView0.getContext().getResources().getDimensionPixelSize(0x7F070C0E));  // dimen:mtrl_alert_dialog_background_inset_end
                fyju0.G("Cancel", new aass());
                fyju0.M("OK", new aast(debugMenuView0, editText0));
                fyju0.create().show();
                break;
            }
            case 5: {
                xob xob0 = debugMenuView0.a();
                cchl.b = Boolean.valueOf(((boolean)(cchl.d() ^ 1)));
                xob0.recreate();
                break;
            }
            case 6: {
                xob xob1 = debugMenuView0.a();
                Boolean boolean0 = cchl.b;
                if(boolean0 != null) {
                    cchl.b = null;
                    if(boolean0.booleanValue() != cchl.d()) {
                        xob1.recreate();
                    }
                }
                break;
            }
            case 7: {
                hfuo hfuo0 = hojn.h().b;
                ibuq.e(hfuo0, "getEnvironmentsList(...)");
                ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
                for(Object object0: hfuo0) {
                    arrayList0.add(((hoka)object0).b);
                }
                List list0 = ibpo.ak(ibpo.b(DebugMenuView.a), arrayList0);
                fyju fyju1 = new fyju(debugMenuView0.a());
                fyju1.O("Select the environment:");
                fyju1.B(((CharSequence[])list0.toArray(new String[0])), new aasu(debugMenuView0, hfuo0));
                fyju1.create().show();
                break;
            }
            case 8: {
                Intent intent0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent0.setData(Uri.parse("package:com.google.android.gms"));
                intent0.addFlags(0x10008000);
                debugMenuView0.a().startActivity(intent0);
            }
        }
        ((DrawerLayout)debugMenuView0.e.a()).i();
    }
}

