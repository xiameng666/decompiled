import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.gms.backup.settings.component.BackupOptInChimeraActivity;

public final class ashh extends de {
    public BackupOptInChimeraActivity ag;

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        AlertDialog.Builder alertDialog$Builder0 = aqxt.a(this.getContext());
        grje grje0 = ashh.y();
        int v = (grje0.e == null ? grjy.a : grje0.e).b.size() - 1;
        Spanned spanned0 = Html.fromHtml(String.format("<a href=\"https://www.google.com/policies/privacy/\">%s</a>", this.getResources().getString((grje0.e == null ? grjy.a : grje0.e).b.d(v))));
        int v1 = (grje0.e == null ? grjy.a : grje0.e).b.size() - 1;
        String[] arr_s = new String[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_s[v2] = this.getResources().getString((grje0.e == null ? grjy.a : grje0.e).b.d(v2 + 1));
        }
        AlertDialog.Builder alertDialog$Builder1 = alertDialog$Builder0.setMessage(TextUtils.expandTemplate(this.getResources().getString((grje0.e == null ? grjy.a : grje0.e).b.d(0), arr_s), new CharSequence[]{spanned0}));
        grjy grjy0 = ashh.y().g;
        if(grjy0 == null) {
            grjy0 = grjy.a;
        }
        return alertDialog$Builder1.setNegativeButton(grjy0.b.d(0), new ashg()).create();
    }

    @Override  // de
    public final void onStart() {
        super.onStart();
        ((TextView)this.getDialog().findViewById(0x102000B)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override  // de
    public final void show(fm fm0, String s) {
        if(fm0.h(s) == null) {
            this.ag.j = true;
            super.show(fm0, s);
        }
    }

    public static grje y() {
        gged_interceptors gged0 = gged_interceptors.p(Integer.valueOf(0x7F150494), Integer.valueOf(0x7F150499), Integer.valueOf(0x7F15049C), Integer.valueOf(0x7F15049B), Integer.valueOf(0x7F1508C3));  // string:backup_opt_in_backup_auth_setup_wizard_services_backup_dialog_text_pixel_v2_no_drive 
                                                                                                                                                                                                         // "%1$s\n\n%2$s \n\n%3$s\n\n^1"
        Integer integer0 = (int)0x7F150783;  // string:close_button_label "Close"
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grje.a).v_newBuilder();
        if(gged0 != null) {
            grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
            grjx0.a(gged0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grje grje0 = (grje)hftp0.b_message;
            grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
            grjy0.getClass();
            grje0.e = grjy0;
            grje0.b |= 4;
        }
        grjx grjx1 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
        integer0.getClass();
        grjx1.k(0x7F150783);  // string:close_button_label "Close"
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje1 = (grje)hftp0.b_message;
        grjy grjy1 = (grjy)((ProtoLiteBuilder)grjx1).N_build();
        grjy1.getClass();
        grje1.g = grjy1;
        grje1.b |= 16;
        return (grje)hftp0.N_build();
    }
}

