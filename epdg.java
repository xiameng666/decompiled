import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public final class epdg extends de {
    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        Bundle bundle1 = this.requireArguments();
        if(gaec.t(this.requireContext())) {
            fyju fyju0 = new fyju(this.requireContext());
            fyju0.D(bundle1.getCharSequence("message"));
            fyju0.F(0x7F150783, new epde());  // string:close_button_label "Close"
            return fyju0.create();
        }
        return new AlertDialog.Builder(this.requireContext()).setMessage(bundle1.getCharSequence("message")).setNegativeButton(0x7F150783, new epdf()).create();  // string:close_button_label "Close"
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        if(this.getDialog() != null) {
            TextView textView0 = (TextView)this.requireDialog().findViewById(0x102000B);
            if(textView0 != null) {
                textView0.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    @Override  // de
    public final void show(fm fm0, String s) {
        if(fm0.h(s) == null) {
            super.show(fm0, s);
        }
    }
}

