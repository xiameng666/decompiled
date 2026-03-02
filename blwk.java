import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class blwk extends du {
    public blwe a;

    static {
        bnaa.f("AuthenticatorTurnOnBluetoothScanningFragment");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.a = (blwe)new lso(((xnz)this.requireContext())).a(blwe.class);
        View view0 = layoutInflater0.inflate(0x7F0E0395, viewGroup0, false);  // layout:fido_paask_turn_on_bluetooth_scanning
        view0.findViewById(0x7F0B13A9).setOnClickListener(new blwi(this));  // id:fido_paask_allow_button
        view0.findViewById(0x7F0B13B5).setOnClickListener(new blwj(this));  // id:fido_paask_no_button
        return view0;
    }
}

