import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.romanesco.model.RestoreResultEntity;

public final class ekho extends du {
    private ejyv a;
    private ekjq b;
    private bxox c;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E08C2, viewGroup0, false);  // layout:romanesco_contacts_restore_complete_fragment
        ((Button)view0.findViewById(0x7F0B1194)).setOnClickListener(new ekhn(this));  // id:done_button
        ekjq ekjq0 = (ekjq)new lso(((xob)this.requireContext()), ekjr.d(this.requireContext())).a(ekjq.class);
        this.b = ekjq0;
        this.requireContext();
        bxox bxox0 = ekjq0.k(this.b.j());
        this.c = bxox0;
        RestoreResultEntity restoreResultEntity0 = (RestoreResultEntity)bxox0.ij();
        AppCompatTextView appCompatTextView0 = (AppCompatTextView)view0.findViewById(0x7F0B210E);  // id:sub_title
        AppCompatTextView appCompatTextView1 = (AppCompatTextView)view0.findViewById(0x7F0B22B8);  // id:title
        Context context0 = this.requireContext().getApplicationContext();
        if(this.a == null) {
            this.a = ejyv.d(context0);
        }
        if(restoreResultEntity0.a == 0) {
            appCompatTextView1.setText(0x7F152898);  // string:romanesco_contacts_restore_settings_empty_contacts "Nothing to restore"
            appCompatTextView0.setText(0x7F1528C3);  // string:romanesco_restore_no_contact_in_backup_summary "This backup contains no contacts"
            return view0;
        }
        int v = restoreResultEntity0.b;
        if(v == 0) {
            appCompatTextView1.setText(0x7F152898);  // string:romanesco_contacts_restore_settings_empty_contacts "Nothing to restore"
            appCompatTextView0.setText(0x7F1528B6);  // string:romanesco_restore_all_contacts_deduped_summary "All contacts in this backup 
                                                     // are already on this device"
            return view0;
        }
        appCompatTextView1.setText(0x7F15289C);  // string:romanesco_contacts_restore_success "Contacts restored"
        String s = this.a.B() ? "this device" : this.a.i();
        appCompatTextView0.setText(context0.getResources().getQuantityString(0x7F130071, v, new Object[]{v, s}));  // plurals:romanesco_restored_contacts_count_summary
        return view0;
    }
}

