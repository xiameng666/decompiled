import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.trustagent.activeunlock.primary.ui.enrolleddevice.EnrolledDeviceListFragment;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.util.Set;

public final class eypq implements ibts {
    public final eypw a;
    public final EnrolledDeviceListFragment b;
    public final View c;

    public eypq(eypw eypw0, EnrolledDeviceListFragment enrolledDeviceListFragment0, View view0) {
        this.a = eypw0;
        this.b = enrolledDeviceListFragment0;
        this.c = view0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((eyqq)object0));
        ibuq.f(((eyqq)object0), "<set-?>");
        this.a.f.c(eypw.a[0], ((eyqq)object0));
        eysx eysx0 = ((eyqq)object0).b;
        EnrolledDeviceListFragment enrolledDeviceListFragment0 = this.b;
        if(eysx0 != null) {
            Set set0 = enrolledDeviceListFragment0.ak;
            eysw eysw0 = eysx0.a;
            if(!set0.contains(eysw0)) {
                set0.add(eysw0);
                eysq.a(enrolledDeviceListFragment0.getParentFragmentManager(), enrolledDeviceListFragment0.al);
            }
        }
        View view0 = this.c;
        eypl eypl0 = ((eyqq)object0).d;
        View view1 = view0.requireViewById(0x7F0B2493);  // id:watch_unlock_settings_container
        ibuq.e(view1, "requireViewById(...)");
        if(eypl0.a) {
            ((LinearLayout)view1).setVisibility(0);
            MaterialSwitch materialSwitch0 = (MaterialSwitch)view0.requireViewById(0x7F0B1182);  // id:distance_based_relock_setting_switch
            materialSwitch0.setEnabled(eypl0.b);
            materialSwitch0.setChecked(enrolledDeviceListFragment0.y().y());
            materialSwitch0.setContentDescription((materialSwitch0.isChecked() ? enrolledDeviceListFragment0.getString(0x7F150DEF) : enrolledDeviceListFragment0.getString(0x7F150DEE)));  // string:distance_based_relock_toggle_on_content_description "Get fewer notifications, 
                                                                                                                                                                                           // On, Switch, double tap to activate"
            materialSwitch0.setOnCheckedChangeListener(new eypm(enrolledDeviceListFragment0));
            float f = eypl0.b ? 1.0f : 0.38f;
            ((TextView)view0.requireViewById(0x7F0B1183)).setAlpha(f);  // id:distance_based_relock_setting_title
            View view2 = view0.requireViewById(0x7F0B1181);  // id:distance_based_relock_setting_description
            ((TextView)view2).setText(enrolledDeviceListFragment0.getString((eypl0.b ? 0x7F150DEB : 0x7F15310F)));  // string:distance_based_relock_setting_description "Only get notified when your phone 
                                                                                                                    // and watch are far apart, instead of every time your watch unlocks your phone"
            ((TextView)view2).setAlpha(f);
            ibuq.c(view2);
        }
        else {
            ((LinearLayout)view1).setVisibility(8);
        }
        eysz eysz0 = ((eyqq)object0).c;
        View view3 = null;
        if(eysz0 == null) {
            View view4 = enrolledDeviceListFragment0.ah;
            if(view4 == null) {
                ibuq.j("warningMessageContainer");
            }
            else {
                view3 = view4;
            }
            view3.setVisibility(8);
            return ibom.a;
        }
        View view5 = enrolledDeviceListFragment0.ah;
        if(view5 == null) {
            ibuq.j("warningMessageContainer");
            view5 = null;
        }
        view5.setVisibility(0);
        TextView textView0 = enrolledDeviceListFragment0.ai;
        if(textView0 == null) {
            ibuq.j("warningMessageText");
            textView0 = null;
        }
        textView0.setText(eysz0.a);
        Button button0 = enrolledDeviceListFragment0.aj;
        if(button0 == null) {
            ibuq.j("warningMessageButton");
        }
        else {
            view3 = button0;
        }
        eysy eysy0 = eysz0.b;
        if(eysy0 == null) {
            ((Button)view3).setVisibility(8);
            return ibom.a;
        }
        ((Button)view3).setVisibility(0);
        ((Button)view3).setText(eysy0.a);
        ((Button)view3).setOnClickListener(new eypr(eysy0, enrolledDeviceListFragment0));
        return ibom.a;
    }
}

