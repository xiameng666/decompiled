import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;

public final class fcte implements View.OnClickListener {
    public final WearBackupOptInChimeraActivity a;
    public final String b;

    public fcte(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0, String s) {
        this.a = wearBackupOptInChimeraActivity0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        view0.setClickable(false);
        WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0 = this.a;
        fcml fcml0 = wearBackupOptInChimeraActivity0.l;
        gqtz gqtz0 = gqtz.WF;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnv.a).v_newBuilder();
        grjy grjy0 = grjy.a;
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx0.k(0x7F1504A8);  // string:backup_opt_in_title "Back up your watch with Google One"
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnv grnv0 = (grnv)hftp0.b_message;
        grjy grjy1 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy1.getClass();
        grnv0.c = grjy1;
        grnv0.b |= 1;
        grjx grjx1 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx1.k(0x7F1535EC);  // string:wear_backup_opt_in_summary "Use your %1$s of Google Account storage to automatically 
                              // back up your watch faces, tiles, app data, and device settings."
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnv grnv1 = (grnv)hftp0.b_message;
        grjy grjy2 = (grjy)((ProtoLiteBuilder)grjx1).N_build();
        grjy2.getClass();
        grnv1.d = grjy2;
        grnv1.b |= 2;
        grjx grjx2 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx2.k(0x7F1508F4);  // string:common_turn_on "Turn on"
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnv grnv2 = (grnv)hftp0.b_message;
        grjy grjy3 = (grjy)((ProtoLiteBuilder)grjx2).N_build();
        grjy3.getClass();
        grnv2.e = grjy3;
        grnv2.b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnv grnv3 = (grnv)hftp0.b_message;
        grjy0.getClass();
        grnv3.f = grjy0;
        grnv3.b |= 8;
        grjx grjx3 = (grjx)((ProtoLiteMessage)grjy0).v_newBuilder();
        grjx3.a(gged_interceptors.s(Integer.valueOf(0x7F1504A7), Integer.valueOf(0x7F1504A6), Integer.valueOf(0x7F1504A2), Integer.valueOf(0x7F1504A1), Integer.valueOf(0x7F1504A0), Integer.valueOf(0x7F15049F), Integer.valueOf(0x7F1504A5), Integer.valueOf(0x7F1504A3)));  // string:backup_opt_in_storage_header "Use your %1$s of Google Account storage to 
                                                                                                                                                                                                                                                                               // back up:"
        grjy grjy4 = (grjy)((ProtoLiteBuilder)grjx3).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grnv grnv4 = (grnv)hftp0.b_message;
        grjy4.getClass();
        grnv4.g = grjy4;
        grnv4.b |= 16;
        grnv grnv5 = (grnv)hftp0.N_build();
        gmbu.t(fcml0.b(this.b, false, gqtz0, grnv5, null), new fctp(wearBackupOptInChimeraActivity0, this.b, view0), new fctg(wearBackupOptInChimeraActivity0));
    }
}

