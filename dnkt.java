import android.content.Context;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.button.MaterialButtonToggleGroup;

public final class dnkt extends LinearLayout {
    public final MaterialButtonToggleGroup a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final gra e;
    private final gra f;
    private final ComposeView g;

    public dnkt(Context context0) {
        ibuq.f(context0, "context");
        super(context0, null);
        this.f = new ParcelableSnapshotMutableState(new fuat(new fryu(""), null, null, null, 0, null, null, null, null, false, false, false, null, false, 0x3FFE), gul.a);
        this.e = new ParcelableSnapshotMutableState(null, gul.a);
        this.setOrientation(1);
        LinearLayout.inflate(context0, 0x7F0E0918, this);  // layout:segmented_toggle_container
        View view0 = this.findViewById(0x7F0B073F);  // id:RowSecondaryContainer
        ibuq.e(view0, "findViewById(...)");
        ComposeView composeView0 = (ComposeView)view0;
        this.g = composeView0;
        View view1 = LayoutInflater.from(context0).inflate(0x7F0E06D7, this, false);  // layout:pay_fop_detail_segmented_toggle
        ibuq.d(view1, "null cannot be cast to non-null type com.google.android.material.button.MaterialButtonToggleGroup");
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)view1;
        this.a = materialButtonToggleGroup0;
        View view2 = materialButtonToggleGroup0.findViewById(0x7F0B0C15);  // id:auto
        ibuq.e(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = materialButtonToggleGroup0.findViewById(0x7F0B1D06);  // id:primary
        ibuq.e(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = materialButtonToggleGroup0.findViewById(0x7F0B0C2F);  // id:auxiliary
        ibuq.e(view4, "findViewById(...)");
        this.d = (TextView)view4;
        this.a().l = false;
        composeView0.a(new gze(-1095625050, true, new dnks(this)));
    }

    public final fuat a() {
        return (fuat)this.f.a();
    }

    public final void b(fuat fuat0) {
        this.f.b(fuat0);
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        if(view$OnClickListener0 == null) {
            this.b(fuat.d(this.a(), null, null, null, null, false, false, null, 0x3FBF));
            return;
        }
        this.b(fuat.d(this.a(), null, null, null, new dnko(view$OnClickListener0, this), false, false, null, 0x3FBF));
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        this.g.setVisibility(v);
        this.a.setVisibility(v);
    }
}

