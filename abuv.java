import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import java.util.ArrayList;
import java.util.Collections;

public final class abuv extends de implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener {
    @Override  // de, android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        Activity activity0 = (Activity)this.requireContext();
        activity0.setResult(0);
        activity0.finish();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Activity activity0 = (Activity)this.requireContext();
        if(v == -1) {
            Intent intent0 = bars.h();
            if(intent0.resolveActivity(activity0.getPackageManager()) != null) {
                activity0.startActivityForResult(intent0, 0);
                return;
            }
        }
        activity0.setResult(0);
        activity0.finish();
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        Bundle bundle1 = this.getArguments();
        gfuy.e(bundle1);
        ArrayList arrayList0 = bundle1.getStringArrayList("missingGroups");
        gfuy.e(arrayList0);
        Collections.sort(arrayList0);
        Activity activity0 = (Activity)this.requireContext();
        LayoutInflater layoutInflater0 = activity0.getLayoutInflater();
        View view0 = layoutInflater0.inflate(0x7F0E0211, null);  // layout:common_permissions_dialog_contents
        LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B1C59);  // id:permissions_list
        Resources resources0 = this.getResources();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)arrayList0.get(v1);
            View view1 = layoutInflater0.inflate(0x7F0E0212, null);  // layout:common_permissions_list
            ((TextView)view1.findViewById(0x7F0B1C58)).setText(resources0.getString(bazo.b(s)));  // id:permission_name
            int v2 = activity0.getIntent().getIntExtra(s, 0);
            if(v2 != 0) {
                TextView textView0 = (TextView)view1.findViewById(0x7F0B1C57);  // id:permission_explanation
                textView0.setText(resources0.getString(v2));
                textView0.setVisibility(0);
            }
            linearLayout0.addView(view1);
        }
        return new AlertDialog.Builder(activity0).setView(view0).setPositiveButton(0x7F1508BA, this).setNegativeButton(0x1040000, this).setInverseBackgroundForced(true).create();  // string:common_permissions_open_settings "Open Settings"
    }
}

