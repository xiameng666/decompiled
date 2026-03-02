import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.wallet.ui.common.ImageWithCaptionView;

public final class fcbn extends gcya {
    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        View view0 = ((Activity)this.getContext()).getLayoutInflater().inflate(0x7F0E0E1F, null, false);  // layout:wallet_view_cvc_info_dialog
        ((TextView)view0.findViewById(0x7F0B108A)).setText(this.getArguments().getString("hintTitle"));  // id:cvc_title
        ((TextView)view0.findViewById(0x7F0B1087)).setText(this.getArguments().getString("hintText"));  // id:cvc_hint_body
        ((ImageWithCaptionView)view0.findViewById(0x7F0B1088)).o(((gfgo)gciq.a(this.getArguments(), "hintImage", ((Parser)((ProtoLiteMessage)gfgo.a).jf(7, null)))), fbgn.o(this.getContext()));  // id:cvc_hint_image
        return new AlertDialog.Builder(this.getContext()).setView(view0).setPositiveButton(0x7F150783, null).create();  // string:close_button_label "Close"
    }
}

