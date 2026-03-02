import android.view.View.OnLayoutChangeListener;
import android.view.View;
import com.google.android.gms.credential.manager.checkup.CheckupSublistExpandableListView;

public final class bdff implements View.OnLayoutChangeListener {
    public final bdfg a;
    public final CheckupSublistExpandableListView b;

    public bdff(bdfg bdfg0, CheckupSublistExpandableListView checkupSublistExpandableListView0) {
        this.a = bdfg0;
        this.b = checkupSublistExpandableListView0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        int v8 = this.b.getWidth();
        int v9 = v8 - this.a.a.getResources().getDimensionPixelSize(0x7F070EFD);  // dimen:pwm_generic_padding_xlarge
        int v10 = v8 - this.a.a.getResources().getDimensionPixelSize(0x7F070EFE);  // dimen:pwm_generic_padding_xsmall
        this.b.setIndicatorBoundsRelative(v9, v10);
    }
}

