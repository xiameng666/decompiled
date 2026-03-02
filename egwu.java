import android.accounts.Account;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.icu.text.NumberFormat;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;

public final class egwu extends tk {
    public final SparseIntArray a;
    public final egvc e;
    public egvx f;
    public egxb g;
    public List h;
    public Account i;
    public egwe j;
    public static final int k;
    private static final bboh l;
    private final Resources m;
    private List n;
    private final SparseArray o;

    static {
        egwu.l = bboh.b("SyncCoreCardAdapter", bbcu.f);
    }

    public egwu(Resources resources0, SparseIntArray sparseIntArray0) {
        this.e = new egvc();
        this.m = resources0;
        this.o = new SparseArray(10);
        this.a = sparseIntArray0;
    }

    public final void G(List list0) {
        if(this.H(list0)) {
            this.a.put(4, 0x7F0E01C8);  // layout:card_layout_3_gm3
            this.n = list0;
            if(hwyp.l()) {
                Account account0 = this.i;
                if(account0 != null) {
                    egvc egvc0 = this.e;
                    String s = account0.name;
                    int v = list0.size();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((giqu)hftv0).c = 20;
                    ((giqu)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    int v1 = 2;
                    ((giqu)hftv1).e = 2;
                    ((giqu)hftv1).b |= 4;
                    if(v != 1) {
                        v1 = 3;
                    }
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giqu)hftp0.b_message).i = v1 - 1;
                    ((giqu)hftp0.b_message).b |= 0x40;
                    giqu giqu0 = (giqu)hftp0.N_build();
                    egvc0.a.j(giqu0, s);
                }
            }
        }
    }

    public final boolean H(List list0) {
        if(list0 != null) {
            return !hwyp.g() || list0.size() != 1 ? hwyp.f() && list0.size() > 1 : true;
        }
        return false;
    }

    private final void I(egws egws0, int v, int v1) {
        Resources.Theme resources$Theme0 = egws0.a.getContext().getTheme();
        pcb pcb0 = pcb.b(this.m, v, resources$Theme0);
        egws0.x.setVisibility(0);
        pcb0.mutate();
        pcb0.setTint(v1);
        egws0.x.setImageDrawable(pcb0);
    }

    private static final void J(egws egws0) {
        View view0 = egws0.a;
        ConstraintLayout constraintLayout0 = (ConstraintLayout)view0.findViewById(0x7F0B0FAF);  // id:constraint_layout
        bb bb0 = new bb();
        bb0.c(constraintLayout0);
        bb0.e(egws0.B.getId(), 3, egws0.w.getId(), 4, view0.getResources().getDimensionPixelSize(0x7F070E7A));  // dimen:people_sync_card_button_top_margin
        bb0.d(egws0.B.getId(), 4, 0, 4);
        bb0.a(constraintLayout0);
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return this.a.valueAt(v);
    }

    @Override  // tk
    public final long dy(int v) {
        return (long)this.a.keyAt(v);
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        if(v == 0x7F0E0246) {  // layout:contacts_sync_core_header
            return new egwr(viewGroup0);
        }
        if(hwyp.q()) {
            switch(v) {
                case 0x7F0E0243: {  // layout:contacts_not_synced_on_device_header
                    return new uq(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0243, viewGroup0, false));  // layout:contacts_not_synced_on_device_header
                }
                case 0x7F0E0247: {  // layout:contacts_sync_core_list_single_line
                    return new egwt(viewGroup0);
                }
                default: {
                    return new egws(viewGroup0);
                }
            }
        }
        return new egws(viewGroup0);
    }

    final View.OnClickListener f(int v) {
        return (View.OnClickListener)this.o.get(v);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        CharSequence charSequence4;
        Integer integer0 = (int)0;
        if(this.dx(v) == 0x7F0E01C8) {  // layout:card_layout_3_gm3
            ((egws)uq0).z.setVisibility(0);
        }
        int v1 = this.a.keyAt(v);
        switch(v1) {
            case 1: {
                egwq egwq0 = new egwq(this);
                ((egwr)uq0).t.setMovementMethod(egwq0);
                return;
            }
            case 2: {
                egxb egxb0 = this.g;
                if(hwyp.n()) {
                    pcb pcb0 = pcb.b(this.m, 0x7F0806EF, null);  // drawable:ic_contacts_sync_96
                    ((egws)uq0).t.setImageDrawable(pcb0);
                    ((egws)uq0).t.setVisibility(0);
                }
                else {
                    ((egws)uq0).t.setVisibility(8);
                }
                if(egxb0 == null) {
                    ((egws)uq0).C.setVisibility(4);
                }
                else {
                    TextView textView0 = ((egws)uq0).v;
                    textView0.setVisibility(4);
                    ProgressBar progressBar0 = ((egws)uq0).A;
                    progressBar0.setVisibility(4);
                    ImageView imageView0 = ((egws)uq0).x;
                    int v2 = egsy.e(imageView0.getContext());
                    progressBar0.setIndeterminateTintList(ColorStateList.valueOf(v2));
                    switch(egxb0.f - 1) {
                        case 0: {
                            this.I(((egws)uq0), 0x7F080B68, egsy.b(imageView0.getContext()));  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                            ((egws)uq0).w.setText("Trouble syncing");
                            textView0.setVisibility(0);
                            textView0.setText("Try again later");
                            break;
                        }
                        case 1: {
                            if(hwyp.i() && !egxj.l(this.i)) {
                                this.I(((egws)uq0), 0x7F080B51, egsy.c(imageView0.getContext()));  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                                ((egws)uq0).w.setText("Auto-sync is off");
                            }
                            else {
                                this.I(((egws)uq0), 0x7F080B19, egsy.d(imageView0.getContext()));  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                                Resources resources0 = this.m;
                                ((egws)uq0).w.setText(resources0.getQuantityString(0x7F130042, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_successful
                                long v4 = egxb0.e;
                                if(v4 >= 0L) {
                                    CharSequence charSequence0 = egxj.f(resources0, v4);
                                    if(charSequence0 != null) {
                                        textView0.setVisibility(0);
                                        textView0.setText(charSequence0);
                                    }
                                }
                            }
                            break;
                        }
                        case 2: {
                            this.I(((egws)uq0), 0x7F080B29, v2);  // drawable:quantum_gm_ic_cloud_download_vd_theme_24
                            ((egws)uq0).w.setText("Sync in progress");
                            break;
                        }
                        case 3: {
                            this.I(((egws)uq0), 0x7F080B51, egsy.c(imageView0.getContext()));  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                            if(hwyp.i()) {
                                ((egws)uq0).w.setText("Sync is off");
                            }
                            else {
                                ((egws)uq0).w.setText("Auto-sync is off");
                            }
                            break;
                        }
                        case 4: {
                            this.I(((egws)uq0), 0x7F080B68, egsy.b(imageView0.getContext()));  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                            ((egws)uq0).w.setText("Permission needed");
                            break;
                        }
                        case 5: {
                            this.I(((egws)uq0), 0x7F080B51, egsy.c(imageView0.getContext()));  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                            ((egws)uq0).w.setText("Waiting to sync");
                            break;
                        }
                        case 6: {
                            this.I(((egws)uq0), 0x7F080B2C, v2);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                            Resources resources1 = this.m;
                            ((egws)uq0).w.setText("Starting sync");
                            long v5 = egxb0.e;
                            if(v5 >= 0L) {
                                CharSequence charSequence1 = egxj.f(resources1, v5);
                                if(charSequence1 != null) {
                                    textView0.setVisibility(0);
                                    textView0.setText(charSequence1);
                                }
                            }
                            progressBar0.setVisibility(0);
                            break;
                        }
                        case 7: {
                            this.I(((egws)uq0), 0x7F080B2C, v2);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                            ((egws)uq0).w.setText("Starting sync");
                            textView0.setVisibility(0);
                            textView0.setText("Trouble syncing, waiting to try again");
                            progressBar0.setVisibility(0);
                            break;
                        }
                        case 8: {
                            this.I(((egws)uq0), 0x7F080B2C, v2);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                            ((egws)uq0).w.setText("Starting sync");
                            progressBar0.setVisibility(0);
                            break;
                        }
                        case 9: {
                            this.I(((egws)uq0), 0x7F080B2B, v2);  // drawable:quantum_gm_ic_cloud_upload_vd_theme_24
                            if(hwyw.c()) {
                                int v6 = egxb0.c;
                                if(v6 == 1) {
                                    Object[] arr_object1 = {egxb0.b.f(integer0), this.m.getQuantityString(0x7F130053, egxb0.a, new Object[]{((int)egxb0.a)})};  // plurals:people_fsa_progress_notification_format_for_contacts_sync
                                    String s1 = this.m.getString(0x7F152525, arr_object1);  // string:people_contacts_sync_core_stv2_contacts_sync_up_progress_text "Backing up 
                                                                                            // %1$d of %2$s"
                                    ((egws)uq0).w.setText(s1);
                                }
                                else if(v6 == 3) {
                                    ((egws)uq0).w.setText("Backing up contact photos");
                                }
                                else {
                                    ((egws)uq0).w.setText(this.m.getQuantityString(0x7F130044, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_up
                                }
                            }
                            else {
                                ((egws)uq0).w.setText(this.m.getQuantityString(0x7F130044, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_up
                            }
                            progressBar0.setVisibility(0);
                            break;
                        }
                        default: {
                            this.I(((egws)uq0), 0x7F080B29, v2);  // drawable:quantum_gm_ic_cloud_download_vd_theme_24
                            if(hwyw.c()) {
                                int v3 = egxb0.c;
                                if(v3 == 1) {
                                    Object[] arr_object = {egxb0.b.f(integer0), this.m.getQuantityString(0x7F130053, egxb0.a, new Object[]{((int)egxb0.a)})};  // plurals:people_fsa_progress_notification_format_for_contacts_sync
                                    String s = this.m.getString(0x7F152524, arr_object);  // string:people_contacts_sync_core_stv2_contacts_sync_down_progress_text "Getting 
                                                                                          // %1$d of %2$s"
                                    ((egws)uq0).w.setText(s);
                                }
                                else if(v3 == 3) {
                                    ((egws)uq0).w.setText("Getting contact photos");
                                }
                                else {
                                    ((egws)uq0).w.setText(this.m.getQuantityString(0x7F130043, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_down
                                }
                            }
                            else {
                                ((egws)uq0).w.setText(this.m.getQuantityString(0x7F130043, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_down
                            }
                            progressBar0.setVisibility(0);
                        }
                    }
                    if(progressBar0.getVisibility() != 0) {
                        progressBar0.setVisibility(8);
                    }
                    if(textView0.getVisibility() != 0) {
                        textView0.setVisibility(8);
                    }
                    ((egws)uq0).w.setVisibility(0);
                    ((egws)uq0).C.setVisibility(0);
                }
                TextView textView1 = ((egws)uq0).u;
                textView1.setText(0x7F152528);  // string:people_contacts_sync_core_sync_card_title "Sync status"
                if(jyw.a(this.m.getConfiguration()).g(0).getISO3Language().equals("eng")) {
                    textView1.setText("Status");
                }
                ((egws)uq0).z.setVisibility(0);
                ((egws)uq0).y.setVisibility(8);
                ((egws)uq0).B.setVisibility(8);
                ((egws)uq0).a.setOnClickListener(((View.OnClickListener)this.o.get(2)));
                return;
            }
            case 3: {
                egvx egvx0 = this.f;
                if(hwyp.n()) {
                    pcb pcb1 = pcb.b(this.m, 0x7F0806EE, null);  // drawable:ic_contacts_backup_sync_96
                    ((egws)uq0).t.setImageDrawable(pcb1);
                    ((egws)uq0).t.setVisibility(0);
                }
                else {
                    ((egws)uq0).t.setVisibility(8);
                }
                if(egvx0 == null) {
                    ((egws)uq0).x.setVisibility(8);
                    ((egws)uq0).w.setVisibility(8);
                    ((egws)uq0).v.setVisibility(8);
                }
                else {
                    ImageView imageView1 = ((egws)uq0).x;
                    imageView1.setVisibility(0);
                    TextView textView2 = ((egws)uq0).w;
                    textView2.setVisibility(0);
                    int v7 = egvx0.d - 1;
                    if(v7 != 0) {
                        switch(v7) {
                            case 1: {
                                int v8 = egsy.d(imageView1.getContext());
                                if(hwzg.g() && hwzg.f()) {
                                    this.I(((egws)uq0), 0x7F080B68, egsy.c(imageView1.getContext()));  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                                    textView2.setText("On for device only");
                                }
                                else {
                                    this.I(((egws)uq0), 0x7F080B19, v8);  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                                    textView2.setText("On");
                                }
                                TextView textView3 = ((egws)uq0).v;
                                textView3.setVisibility(0);
                                Resources resources2 = this.m;
                                String s3 = resources2.getString(0x7F15251E, new Object[]{egvx0.a});  // string:people_contacts_sync_core_backup_sync_status_in_other_account "Syncing to 
                                                                                                      // a different account: %1$s"
                                if(hwzg.g() && hwzg.f()) {
                                    s3 = a.r((egvx0.c <= 0 ? "SIM contacts aren\'t syncing yet." : resources2.getQuantityString(0x7F13008E, egvx0.c, new Object[]{((int)egvx0.c)})), s3, "\n");  // plurals:sheepdog_v1_sim_contacts_not_syncing_with_contact_count
                                }
                                textView3.setText(s3);
                                break;
                            }
                            case 2: {
                                this.I(((egws)uq0), 0x7F080B19, egsy.d(imageView1.getContext()));  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                                textView2.setText("On");
                                ((egws)uq0).v.setVisibility(8);
                                break;
                            }
                            case 3: {
                                this.I(((egws)uq0), 0x7F080B51, egsy.c(imageView1.getContext()));  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                                textView2.setText("Off");
                                ((egws)uq0).v.setVisibility(8);
                                break;
                            }
                            case 4: {
                                this.I(((egws)uq0), 0x7F080BA2, egsy.c(imageView1.getContext()));  // drawable:quantum_gm_ic_info_vd_theme_24
                                textView2.setText(this.m.getText(0x7F15251F));  // string:people_contacts_sync_core_backup_sync_status_paused "Paused"
                                ((egws)uq0).v.setVisibility(8);
                                break;
                            }
                            case 5: {
                                this.I(((egws)uq0), 0x7F080B51, egsy.c(imageView1.getContext()));  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                                Resources resources3 = this.m;
                                textView2.setText(resources3.getText(0x7F1508A6));  // string:common_off "Off"
                                TextView textView4 = ((egws)uq0).v;
                                textView4.setVisibility(0);
                                if(hwzg.f()) {
                                    textView4.setText(resources3.getQuantityString(0x7F13003F, egvx0.c, new Object[]{((int)egvx0.c)}));  // plurals:people_backup_sync_v2_contacts_not_synced
                                }
                                else {
                                    textView4.setText(resources3.getQuantityString(0x7F13003C, egvx0.b, new Object[]{((int)egvx0.b)}));  // plurals:people_backup_sync_device_contacts_not_synced
                                }
                                break;
                            }
                            default: {
                                if(v7 == 7) {
                                    this.I(((egws)uq0), 0x7F080B19, egsy.d(imageView1.getContext()));  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                                    textView2.setText("On");
                                    ((egws)uq0).v.setVisibility(0);
                                    String s2 = this.m.getString(0x7F15251E, new Object[]{egvx0.a});  // string:people_contacts_sync_core_backup_sync_status_in_other_account "Syncing to 
                                                                                                      // a different account: %1$s"
                                    ((egws)uq0).v.setText(s2);
                                }
                            }
                        }
                    }
                    else if(hwzg.g() && hwzg.f()) {
                        this.I(((egws)uq0), 0x7F080B68, egsy.c(imageView1.getContext()));  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                        textView2.setText(0x7F152DD0);  // string:sheepdog_v1_on_only "On for device only"
                        int v9 = egvx0.c;
                        if(v9 > 0) {
                            ((egws)uq0).v.setText(this.m.getQuantityString(0x7F13008E, v9, new Object[]{v9}));  // plurals:sheepdog_v1_sim_contacts_not_syncing_with_contact_count
                        }
                        else {
                            ((egws)uq0).v.setText(0x7F152DD1);  // string:sheepdog_v1_sim_contacts_not_syncing "SIM contacts aren\'t syncing yet."
                        }
                        ((egws)uq0).v.setVisibility(0);
                    }
                    else {
                        this.I(((egws)uq0), 0x7F080B19, egsy.d(imageView1.getContext()));  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                        textView2.setText("On");
                        ((egws)uq0).v.setVisibility(8);
                    }
                }
                if(hwzg.f() && (hwzg.g() && (egvx0.d == 1 || egvx0.d == 2) || (egvx0.d == 3 || egvx0.d == 4 || (egvx0.d == 6 || egvx0.d == 8)))) {
                    ((egws)uq0).u.setText(0x7F152520);  // string:people_contacts_sync_core_backup_sync_v2_card_title "Also sync device and 
                                                        // SIM contacts"
                }
                else {
                    ((egws)uq0).u.setText(0x7F15251D);  // string:people_contacts_sync_core_backup_sync_card_title "Also sync device contacts"
                }
                ((egws)uq0).z.setVisibility(0);
                ((egws)uq0).B.setVisibility(8);
                ((egws)uq0).y.setVisibility(8);
                ((egws)uq0).a.setOnClickListener(((View.OnClickListener)this.o.get(3)));
                return;
            }
            case 4: {
                List list0 = this.n;
                if(list0 != null && !list0.isEmpty()) {
                    TextView textView5 = ((egws)uq0).w;
                    this.I(((egws)uq0), 0x7F080B5A, egsy.c(textView5.getContext()));  // drawable:quantum_gm_ic_download_for_offline_vd_theme_24
                    if(list0.size() == 1) {
                        egux egux0 = (egux)list0.get(0);
                        ((egws)uq0).u.setText("Restore contacts from other phones");
                        textView5.setText(this.m.getQuantityString(0x7F130045, egux0.b, new Object[]{((int)egux0.b), egux0.a}));  // plurals:people_contacts_sync_device_backup_card_body
                    }
                    else {
                        int v10 = 0;
                        for(Object object0: list0) {
                            v10 += ((egux)object0).b;
                        }
                        ((egws)uq0).u.setText("Restore contacts from other phones");
                        textView5.setText(this.m.getQuantityString(0x7F130048, v10, new Object[]{v10, list0.size()}));  // plurals:people_contacts_sync_multi_device_backup_card_body
                    }
                    textView5.setVisibility(0);
                    ((egws)uq0).B.setText(0x7F152534);  // string:people_contacts_sync_device_backup_card_button "Review & restore"
                    ((egws)uq0).B.setVisibility(0);
                    ((egws)uq0).y.setVisibility(8);
                    View.OnClickListener view$OnClickListener0 = (View.OnClickListener)this.o.get(4);
                    ((egws)uq0).B.setOnClickListener(view$OnClickListener0);
                    egwu.J(((egws)uq0));
                    ((egws)uq0).a.setOnClickListener(((View.OnClickListener)this.o.get(4)));
                    ((egws)uq0).z.setVisibility(8);
                    return;
                }
                break;
            }
            case 5: {
                List list1 = this.h;
                if(list1 != null && !list1.isEmpty()) {
                    this.I(((egws)uq0), 0x7F080B5A, egsy.c(((egws)uq0).w.getContext()));  // drawable:quantum_gm_ic_download_for_offline_vd_theme_24
                    Resources resources4 = this.m;
                    ((egws)uq0).u.setText("Restore contacts from other phones");
                    if(list1.size() == 1) {
                        String s4 = resources4.getString(0x7F152537, new Object[]{((egux)list1.get(0)).a});  // string:people_contacts_sync_encrypted_device_backup_card_body "From your %1$s"
                        ((egws)uq0).v.setText(s4);
                    }
                    else {
                        ((egws)uq0).v.setText(resources4.getQuantityString(0x7F130049, list1.size(), new Object[]{list1.size()}));  // plurals:people_contacts_sync_multi_encrypted_device_backup_card_body
                    }
                    ((egws)uq0).a.setOnClickListener(((View.OnClickListener)this.o.get(5)));
                    ((egws)uq0).B.setText(0x7F152534);  // string:people_contacts_sync_device_backup_card_button "Review & restore"
                    ((egws)uq0).y.setVisibility(8);
                    ((egws)uq0).B.setVisibility(0);
                    View.OnClickListener view$OnClickListener1 = (View.OnClickListener)this.o.get(5);
                    ((egws)uq0).B.setOnClickListener(view$OnClickListener1);
                    egwu.J(((egws)uq0));
                    ((egws)uq0).z.setVisibility(8);
                    return;
                }
                break;
            }
            case 6: {
                if(this.j == null) {
                    ((ggtj)egwu.l.i()).x("bindSimImportCard called but SimImportUiModel is null");
                    return;
                }
                Button button0 = ((egws)uq0).B;
                button0.setText(0x7F15250B);  // string:people_backup_sync_import_sim_button_gm3 "Review & import"
                ((egws)uq0).y.setVisibility(8);
                button0.setVisibility(0);
                ((egws)uq0).z.setVisibility(8);
                TextView textView6 = ((egws)uq0).w;
                egwe egwe0 = this.j;
                Resources resources5 = this.m;
                if(egwe0.b == 1) {
                    CharSequence charSequence2 = egwe0.d.e(egwe0.a);
                    if(charSequence2 == null) {
                        charSequence4 = resources5.getQuantityString(0x7F13004A, egwe0.c, new Object[]{((int)egwe0.c)});  // plurals:people_contacts_sync_multi_sim_import_card_body
                    }
                    else {
                        int v11 = egwe0.c;
                        CharSequence charSequence3 = resources5.getQuantityText(0x7F13004F, v11);  // plurals:people_contacts_sync_single_sim_import_card_body
                        CharSequence[] arr_charSequence = new CharSequence[2];
                        Locale locale0 = egxj.h(resources5);
                        if(egwe0.e == null) {
                            egwe0.e = NumberFormat.getInstance(locale0);
                        }
                        arr_charSequence[0] = egwe0.e.format(((long)v11));
                        arr_charSequence[1] = charSequence2;
                        charSequence4 = TextUtils.expandTemplate(charSequence3, arr_charSequence);
                    }
                }
                else {
                    charSequence4 = resources5.getQuantityString(0x7F13004A, egwe0.c, new Object[]{((int)egwe0.c)});  // plurals:people_contacts_sync_multi_sim_import_card_body
                }
                textView6.setText(charSequence4);
                textView6.setVisibility(0);
                button0.setOnClickListener(this.f(6));
                egwu.J(((egws)uq0));
                this.I(((egws)uq0), 0x7F080C2B, egsy.c(((egws)uq0).x.getContext()));  // drawable:quantum_gm_ic_sim_card_vd_theme_24
                ((egws)uq0).u.setText("Import SIM contacts");
                ((egws)uq0).a.setOnClickListener(this.f(6));
                return;
            }
            case 8: {
                if(hwyp.q()) {
                    ((egws)uq0).u.setText(0x7F152514);  // string:people_contacts_in_trash_card_title "Contacts in Trash"
                    ((egws)uq0).w.setText(0x7F152516);  // string:people_contacts_not_synced_on_device_activity_header_gm3 "Also stored with 
                                                        // Google Contacts, but not syncing to this device"
                    ((egws)uq0).w.setVisibility(0);
                    ((egws)uq0).B.setVisibility(8);
                    int v12 = egsy.c(((egws)uq0).z.getContext());
                    this.I(((egws)uq0), 0x7F080B42, v12);  // drawable:quantum_gm_ic_delete_vd_theme_24
                    ((egws)uq0).x.setVisibility(0);
                    View view0 = ((egws)uq0).a;
                    Resources.Theme resources$Theme0 = view0.getContext().getTheme();
                    pcb pcb2 = pcb.b(this.m, 0x7F080BAF, resources$Theme0);  // drawable:quantum_gm_ic_launch_vd_theme_24
                    ((egws)uq0).z.setVisibility(0);
                    pcb2.mutate();
                    pcb2.setTint(v12);
                    ((egws)uq0).z.setImageDrawable(pcb2);
                    ((egws)uq0).z.setVisibility(0);
                    view0.setOnClickListener(this.f(8));
                    return;
                }
                break;
            }
            default: {
                ((ggtj)egwu.l.j()).z("Unrecognized itemId %d", v1);
            }
        }
    }

    final void n(int v, View.OnClickListener view$OnClickListener0) {
        this.o.put(v, view$OnClickListener0);
    }
}

