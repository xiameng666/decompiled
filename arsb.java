import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.GlifLayout;

public final class arsb extends arrx {
    private GlifLayout b;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.b = (GlifLayout)layoutInflater0.inflate(0x7F0E0A02, null);  // layout:source_waiting_fragment
        this.A(this.getArguments().getString("target_device_model"));
        if(this.getArguments().getBoolean("isWifiD2d", false)) {
            this.b.J(0x7F152F24);  // string:source_waiting_description_wifi "If your device loses Wi-Fi connection, it 
                                   // will reconnect automatically after your data is copied"
        }
        return this.b;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override  // arrx
    protected final void y() {
        this.C(this.b, this.getString(0x7F15099C, new Object[]{this.a}));  // string:continue_on_other_device "Continue setup on your %1$s"
    }
}

