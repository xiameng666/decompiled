import com.google.android.gms.common.widget.phone.SwitchBar;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fcuc implements acn {
    public final WearBackupSettingsChimeraActivity a;

    public fcuc(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        this.a = wearBackupSettingsChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0 = this.a;
            WearBackupSettingsChimeraActivity.j.j("User confirmed disabling backup", new Object[0]);
            SwitchBar switchBar0 = (SwitchBar)wearBackupSettingsChimeraActivity0.findViewById(0x7F0B0C83);  // id:backup_toggle
            switchBar0.setChecked(false);
            switchBar0.setClickable(false);
            fcml fcml0 = wearBackupSettingsChimeraActivity0.q;
            gqtz gqtz0 = gqtz.WH;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnw.a).v_newBuilder();
            grjy grjy0 = grjy.a;
            grjx grjx0 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
            grjx0.k(0x7F1504FD);  // string:backup_toggle_label "Backup by Google One"
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grnw grnw0 = (grnw)hftp0.b_message;
            grjy grjy1 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
            grjy1.getClass();
            grnw0.c = grjy1;
            grnw0.b |= 1;
            grjx grjx1 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
            grjx1.k(0x7F1504AA);  // string:backup_opt_out_dialog_title "Turn off and delete backup?"
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grnw grnw1 = (grnw)hftp0.b_message;
            grjy grjy2 = (grjy)((ProtoLiteBuilder)grjx1).N_build();
            grjy2.getClass();
            grnw1.d = grjy2;
            grnw1.b |= 2;
            grjx grjx2 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
            grjx2.k(0x7F1504A9);  // string:backup_opt_out_dialog_body "Your watch backup will be permanently deleted 
                                  // from your cloud storage."
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grnw grnw2 = (grnw)hftp0.b_message;
            grjy grjy3 = (grjy)((ProtoLiteBuilder)grjx2).N_build();
            grjy3.getClass();
            grnw2.e = grjy3;
            grnw2.b |= 4;
            grjx grjx3 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
            grjx3.k(0x7F15080A);  // string:common_confirm "Confirm"
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grnw grnw3 = (grnw)hftp0.b_message;
            grjy grjy4 = (grjy)((ProtoLiteBuilder)grjx3).N_build();
            grjy4.getClass();
            grnw3.f = grjy4;
            grnw3.b |= 8;
            grjx grjx4 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
            grjx4.k(0x7F1507F2);  // string:common_cancel "Cancel"
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grnw grnw4 = (grnw)hftp0.b_message;
            grjy grjy5 = (grjy)((ProtoLiteBuilder)grjx4).N_build();
            grjy5.getClass();
            grnw4.g = grjy5;
            grnw4.b |= 16;
            gmbu.t(fcml0.a(gqtz0, ((grnw)hftp0.N_build()), null), new fcuy(wearBackupSettingsChimeraActivity0, switchBar0), new fcua(wearBackupSettingsChimeraActivity0));
            return;
        }
        WearBackupSettingsChimeraActivity.j.j("User cancelled disabling backup", new Object[0]);
    }
}

