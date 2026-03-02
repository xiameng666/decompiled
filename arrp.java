import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.GlifLayout;

public final class arrp extends arrx {
    private GlifLayout b;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.b = (GlifLayout)layoutInflater0.inflate(0x7F0E09FD, null);  // layout:source_connected_fragment
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
        this.C(this.b, this.getString(0x7F152F18, new Object[]{this.a}));  // string:source_connected_title "Connected to your %1$s"
    }
}

