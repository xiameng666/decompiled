import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.google.android.gms.wearable.AppTheme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class fcgp {
    public static final baun a;

    static {
        fcgp.a = new fcgf(new String[]{"BackupAccountPicker"});
    }

    static void a(Context context0, List list0, fcfy fcfy0, evqf evqf0, AppTheme appTheme0) {
        gftb.b(((boolean)(list0.isEmpty() ^ 1)), "backupAccounts must not be empty");
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E021B, null);  // layout:companion_backup_account_picker_dialog
        fyju fyju0 = new fyju(fczo.b(context0, appTheme0));
        fyju0.N(0x7F15046D);  // string:backup_account_picker_title "Choose backup account"
        fyju0.Q(view0);
        iw iw0 = fyju0.create();
        iw0.show();
        ListView listView0 = (ListView)iw0.findViewById(0x7F0B0A89);  // id:account_picker_list
        gftb.check(listView0);
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            if(((fexs)list0.get(v)).c.length() > ((fexs)list0.get(v1)).c.length()) {
                v1 = v;
            }
        }
        ArrayList arrayList0 = new ArrayList(list0);
        Collections.swap(arrayList0, 0, v1);
        listView0.setAdapter(new fcgn(context0, arrayList0, fcfy0, appTheme0));
        listView0.setOnItemClickListener(new fcgm(iw0, arrayList0, evqf0));
    }
}

