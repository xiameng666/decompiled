import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.setupdesign.GlifLayout;

public final class arsa extends arrx {
    private GlifLayout b;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        arry arry0 = new arry(this);
        GlifLayout glifLayout0 = (GlifLayout)layoutInflater0.inflate(0x7F0E0A01, null);  // layout:source_success_fragment_v2
        this.b = glifLayout0;
        gaff gaff0 = (gaff)glifLayout0.t(gaff.class);
        gafg gafg0 = new gafg(this.getContext());
        gafg0.c = 4;
        gafg0.d = 0x7F1608FE;  // style:SudGlifButton.Primary
        gafg0.b(0x7F150783);  // string:close_button_label "Close"
        gafg0.b = arry0;
        gaff0.c(gafg0.a());
        this.A(this.getArguments().getString("target_device_model"));
        return this.b;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override  // arrx
    protected final void y() {
        TextView textView0 = this.b.C();
        if(!this.getArguments().getBoolean("isWifiD2d", true)) {
            textView0.setText(this.getString(0x7F152F1F, new Object[]{this.a}));  // string:source_success_description_usb "Disconnect the cable and continue setting 
                                                                                  // up your %1$s"
            return;
        }
        textView0.setText(this.getString(0x7F15099C, new Object[]{this.a}));  // string:continue_on_other_device "Continue setup on your %1$s"
    }
}

