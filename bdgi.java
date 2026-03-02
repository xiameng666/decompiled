import android.support.v7.widget.SwitchCompat;
import android.view.View;

public final class bdgi implements ibts {
    public final bdho a;

    public bdgi(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((bedv)object0).a == bedu.a) {
            gged_interceptors gged0 = (gged_interceptors)((bedv)object0).b;
            if(gged0 != null) {
                bdho bdho0 = this.a;
                View view0 = bdho0.getView();
                SwitchCompat switchCompat0 = view0 == null ? null : ((SwitchCompat)view0.findViewById(0x7F0B1D6F));  // id:pwm_chromesync_password_save_offer_switch
                View view1 = bdho0.getView();
                SwitchCompat switchCompat1 = view1 == null ? null : ((SwitchCompat)view1.findViewById(0x7F0B1D72));  // id:pwm_chromesync_settings_auto_signin_switch
                if(switchCompat0 != null && switchCompat1 != null) {
                    switchCompat0.setOnCheckedChangeListener(null);
                    switchCompat1.setOnCheckedChangeListener(null);
                    boolean z = bedt.e(gged0);
                    boolean z1 = bedt.d(gged0);
                    switchCompat0.setChecked(z);
                    switchCompat1.setChecked(z1);
                    switchCompat0.setOnCheckedChangeListener(new bdgb(bdho0));
                    switchCompat1.setOnCheckedChangeListener(new bdgc(bdho0));
                }
            }
        }
        return ibom.a;
    }
}

