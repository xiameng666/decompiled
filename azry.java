import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class azry implements lqj {
    public final SimpleDialogAccountPickerChimeraActivity a;

    public azry(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0) {
        this.a = simpleDialogAccountPickerChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Button button0;
        boolean z;
        List list0 = (List)object0;
        if(list0 != null) {
            SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0 = this.a;
            simpleDialogAccountPickerChimeraActivity0.getApplicationContext();
            if(bbmn.l(simpleDialogAccountPickerChimeraActivity0)) {
                ArrayList arrayList0 = new ArrayList(list0);
                arrayList0.add(new bxiy(null, null, 2, null));
                list0 = arrayList0;
            }
            Account account0 = simpleDialogAccountPickerChimeraActivity0.m.e;
            if(simpleDialogAccountPickerChimeraActivity0.p == -1 && account0 != null) {
                simpleDialogAccountPickerChimeraActivity0.p = gggq.a(list0, new azrr(account0));
            }
            String s = TextUtils.isEmpty(simpleDialogAccountPickerChimeraActivity0.m.g) ? simpleDialogAccountPickerChimeraActivity0.getString(0x7F1507C5, new Object[]{simpleDialogAccountPickerChimeraActivity0.k}) : simpleDialogAccountPickerChimeraActivity0.m.g;  // string:common_account_choose_account_for_app_label "Choose account for %1$s"
            iv iv0 = new iv(simpleDialogAccountPickerChimeraActivity0);
            iv0.setTitle(s);
            iv0.setPositiveButton(0x104000A, new azrs(simpleDialogAccountPickerChimeraActivity0, list0));
            iv0.setNegativeButton(0x1040000, new azrt(simpleDialogAccountPickerChimeraActivity0));
            String[] arr_s = new String[list0.size()];
            for(int v = 0; v < list0.size(); ++v) {
                bxiy bxiy0 = (bxiy)list0.get(v);
                int v1 = bxiy0.a;
                if(v1 == 0) {
                    gftb.check(bxiy0.c);
                    arr_s[v] = bxiy0.c;
                }
                else if(v1 == 2) {
                    arr_s[v] = "Add account";
                }
            }
            iv0.s(arr_s, simpleDialogAccountPickerChimeraActivity0.p, new azru());
            iw iw0 = iv0.create();
            try {
                Method method0 = iw0.getClass().getDeclaredMethod("onCreate", Bundle.class);
                z = true;
                method0.setAccessible(true);
                method0.invoke(iw0, 0);
                button0 = iw0.b(-1);
            }
            catch(Exception exception0) {
                SimpleDialogAccountPickerChimeraActivity.j.g("Cannot call onCreate on Dialog", exception0, new Object[0]);
                simpleDialogAccountPickerChimeraActivity0.setResult(0);
                simpleDialogAccountPickerChimeraActivity0.finish();
                return;
            }
            if(simpleDialogAccountPickerChimeraActivity0.p < 0) {
                z = false;
            }
            button0.setEnabled(z);
            simpleDialogAccountPickerChimeraActivity0.o = iw0.c();
            simpleDialogAccountPickerChimeraActivity0.o.setOnItemClickListener(new azrv(simpleDialogAccountPickerChimeraActivity0, iw0));
            Window window0 = iw0.getWindow();
            if(window0 != null) {
                ViewGroup viewGroup0 = (ViewGroup)window0.getDecorView();
                ViewGroup viewGroup1 = (ViewGroup)simpleDialogAccountPickerChimeraActivity0.getWindow().getDecorView();
                viewGroup1.setElevation(viewGroup0.getElevation());
                viewGroup0.setElevation(0.0f);
                viewGroup1.setBackground(viewGroup0.getBackground());
                viewGroup0.setBackground(null);
                View view0 = viewGroup0.getChildAt(0);
                viewGroup0.removeViewAt(0);
                simpleDialogAccountPickerChimeraActivity0.setContentView(view0);
            }
        }
    }
}

