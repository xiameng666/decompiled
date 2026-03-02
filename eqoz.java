import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.smartdevice.d2d.ui.DeviceListItemView;
import com.google.android.setupdesign.GlifLayout;

public final class eqoz extends du {
    public String a;
    public DeviceListItemView b;

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            this.a = bundle1.getString("deviceName");
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E09F2, viewGroup0, false);  // layout:smartdevice_target_device_name_fragment
        DeviceListItemView deviceListItemView0 = (DeviceListItemView)view0.findViewById(0x7F0B111B);  // id:device_item
        this.b = deviceListItemView0;
        deviceListItemView0.h(this.a);
        DeviceListItemView deviceListItemView1 = this.b;
        deviceListItemView1.f(0.0f);
        deviceListItemView1.setBackgroundResource(0x7F080F21);  // drawable:smartdevice_rounded_background
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        GlifLayout glifLayout0 = (GlifLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        if(hoxb.d()) {
            glifLayout0.J(0x7F152E8D);  // string:smartdevice_look_for_other_device "Find this name on your other device"
            glifLayout0.findViewById(0x7F0B10E6).setVisibility(8);  // id:description
        }
        xnz xnz0 = (xnz)this.getContext();
        if(glifLayout0 != null && xnz0 != null) {
            erpa.a(xnz0.getContainerActivity(), glifLayout0.E());
        }
    }

    public static eqoz y(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("deviceName", s);
        eqoz eqoz0 = new eqoz();
        eqoz0.setArguments(bundle0);
        return eqoz0;
    }
}

