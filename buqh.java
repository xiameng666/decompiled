import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.googleone.smui.landing.StorageBarView;

public final class buqh extends buqc {
    public static final bboh a;
    public TextView ag;
    public ConstraintLayout ah;
    public TextView ai;
    public LinearLayout aj;
    public LinearLayout ak;
    public StorageBarView al;
    public String am;
    public String an;
    public cmec ao;
    public boolean ap;
    private bupw aq;
    private View ar;
    private ImageView as;
    private AnimatorSet at;
    public ProgressBar b;
    public TextView c;
    public TextView d;

    static {
        buqh.a = bboh.b("StorageMeterFragment", bbcu.hd);
    }

    public buqh() {
        this.ap = false;
    }

    public final void A() {
        if(this.ap) {
            this.ak.setVisibility(0);
            if(!gfta.c(this.am)) {
                this.ai.setText(this.am);
            }
        }
        else {
            this.ak.setVisibility(8);
            if(!gfta.c(this.an)) {
                this.ai.setText(this.an);
            }
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.as, "rotation", new float[]{(this.ap ? 0.0f : -180.0f), (this.ap ? -180.0f : 0.0f)});
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.at = animatorSet0;
        animatorSet0.setDuration(((long)this.ak.getResources().getInteger(0x10E0000)));
        this.at.setInterpolator(fipq.a);
        this.at.play(objectAnimator0);
        this.at.start();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.cloneInContext(fyhn.a(new ContextThemeWrapper(this.requireContext(), 0x7F160C70))).inflate(0x7F0E0A12, viewGroup0, false);  // style:Theme.GoogleMaterial3.DayNight.NoActionBar
        this.ar = view0;
        this.b = (ProgressBar)kfb.b(view0, 0x7F0B183C);  // id:loading_circle
        this.c = (TextView)kfb.b(this.ar, 0x7F0B1093);  // id:data_error
        this.ah = (ConstraintLayout)kfb.b(this.ar, 0x7F0B20F3);  // id:storage_meter_data_container
        this.d = (TextView)kfb.b(this.ar, 0x7F0B22B8);  // id:title
        this.ag = (TextView)kfb.b(this.ar, 0x7F0B10E6);  // id:description
        this.ai = (TextView)kfb.b(this.ar, 0x7F0B20EC);  // id:storage_details_button
        this.as = (ImageView)kfb.b(this.ar, 0x7F0B133D);  // id:expand_collapse_image
        this.aj = (LinearLayout)kfb.b(this.ar, 0x7F0B20ED);  // id:storage_details_button_container
        this.ak = (LinearLayout)kfb.b(this.ar, 0x7F0B20EE);  // id:storage_details_rows_container
        this.al = (StorageBarView)kfb.b(this.ar, 0x7F0B240C);  // id:usage_progress_bar
        bupw bupw0 = (bupw)new lso(this.requireParentFragment()).a(bupw.class);
        this.aq = bupw0;
        buqf buqf0 = new buqf(this);
        bupw0.e.g(this, buqf0);
        return this.ar;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        lup.a(this).e(1);
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putBoolean("isStorageDetailsExpanded", this.ap);
        bundle0.putString("hideStorageDetailsText", this.am);
        bundle0.putString("showStorageDetailsText", this.an);
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        if(bundle0 != null) {
            this.ap = bundle0.getBoolean("isStorageDetailsExpanded");
            if(!gfta.c(bundle0.getString("hideStorageDetailsText"))) {
                this.am = bundle0.getString("hideStorageDetailsText");
            }
            if(!gfta.c(bundle0.getString("showStorageDetailsText"))) {
                this.an = bundle0.getString("showStorageDetailsText");
            }
        }
        this.A();
    }
}

