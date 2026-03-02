import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class aslc extends asla {
    public static final grje ag;
    public aqmq ah;

    static {
        grjg grjg0 = grjf.a(((ProtoLiteMessage)grje.a).v_newBuilder());
        grka grka0 = grjz.a(((grjx)((ProtoLiteMessage)grjy.a).v_newBuilder()));
        grka0.c();
        grka0.b(0x7F1504C6);  // string:backup_settings_common_turn_off_dialog_title "Delete and turn off backup?"
        grjg0.d(grka0.a());
        grka grka1 = grjz.a(((grjx)((ProtoLiteMessage)grjy.a).v_newBuilder()));
        grka1.c();
        grka1.b(0x7F1504D2);  // string:backup_settings_devicedata_turn_off_dialog_message "This will delete device 
                              // data from your Google Account, including:\n\n%1$s\n\nYou will also stop backing 
                              // up device data from this device."
        grka1.c();
        grka1.b(0x7F150ED4);  // string:ebnr_save_data_contacts_call_history "Contacts & call history"
        grka1.c();
        grka1.b(0x7F150ED7);  // string:ebnr_save_data_device_settings "Device settings"
        grka1.c();
        grka1.b(0x7F150ED3);  // string:ebnr_save_data_apps "Apps & app data"
        grka1.c();
        grka1.b(0x7F150ED9);  // string:ebnr_save_data_sms_mms "SMS & MMS messages"
        grka1.c();
        grka1.b(0x7F1504CF);  // string:backup_settings_devicedata_data_type_sims "SIMs"
        grjg0.b(grka1.a());
        grka grka2 = grjz.a(((grjx)((ProtoLiteMessage)grjy.a).v_newBuilder()));
        grka2.c();
        grka2.b(0x7F1504C5);  // string:backup_settings_common_turn_off_dialog_button_confirm "Delete & turn off"
        grjg0.c(grka2.a());
        grka grka3 = grjz.a(((grjx)((ProtoLiteMessage)grjy.a).v_newBuilder()));
        grka3.c();
        grka3.b(0x7F1507F2);  // string:common_cancel "Cancel"
        grjy grjy0 = grka3.a();
        ibuq.f(grjy0, "value");
        ProtoLiteBuilder hftp0 = grjg0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje0 = (grje)hftp0.b_message;
        grjy0.getClass();
        grje0.g = grjy0;
        grje0.b |= 16;
        aslc.ag = grjg0.a();
    }

    public final aqmq A() {
        aqmq aqmq0 = this.ah;
        if(aqmq0 != null) {
            return aqmq0;
        }
        ibuq.j("backupAlertDialogs");
        return null;
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        ibuq.f(dialogInterface0, "dialog");
        llh.a(this.A().a, "backup_dialog_cancelled", jyu.a(new ibns[]{new ibns("backup_dialog_tag", "turn_off_backup_dialog")}));
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        aqmq aqmq0 = this.A();
        String s = this.getString(0x7F1504C6);  // string:backup_settings_common_turn_off_dialog_title "Delete and turn off backup?"
        ibuq.e(s, "getString(...)");
        aslb aslb0 = new aslb(this);
        String s1 = this.getString(0x7F1504D2, new Object[]{ibpo.aK(ibpo.g(new Integer[]{((int)0x7F150ED4), ((int)0x7F150ED7), ((int)0x7F150ED3), ((int)0x7F150ED9), ((int)0x7F1504CF)}), "\n", null, null, aslb0, 30)});  // string:backup_settings_devicedata_turn_off_dialog_message "This will delete device 
                                                                                                                                                                                                                           // data from your Google Account, including:\n\n%1$s\n\nYou will also stop backing 
                                                                                                                                                                                                                           // up device data from this device."
        ibuq.e(s1, "getString(...)");
        String s2 = this.getString(0x7F1504C5);  // string:backup_settings_common_turn_off_dialog_button_confirm "Delete & turn off"
        ibuq.e(s2, "getString(...)");
        return aqmq.a(aqmq0, "turn_off_backup_dialog", s, s1, s2, this.getString(0x7F1507F2), false, 0x20);  // string:common_cancel "Cancel"
    }
}

