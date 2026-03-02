import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.enrolleddevice.EnrolledDeviceListFragment;

public final class eypr implements View.OnClickListener {
    public final eysy a;
    public final EnrolledDeviceListFragment b;

    public eypr(eysy eysy0, EnrolledDeviceListFragment enrolledDeviceListFragment0) {
        this.a = eysy0;
        this.b = enrolledDeviceListFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eysy eysy0 = this.a;
        Intent intent0 = eysy0.b;
        if(intent0 == null) {
            ibth ibth0 = eysy0.c;
            if(ibth0 != null) {
                ibth0.a();
            }
            return;
        }
        this.b.ag.b(intent0);
    }
}

