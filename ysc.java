import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.google.android.material.textview.MaterialTextView;

public final class ysc extends RelativeLayout {
    public ysc(Context context0) {
        super(context0);
        this.setClickable(true);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setBackgroundColor(0xFF000000);
        int v = this.getResources().getDimensionPixelOffset(0x7F070BA0);  // dimen:margin_small
        int v1 = this.getResources().getDimensionPixelOffset(0x7F070B9D);  // dimen:margin_large
        this.setPadding(v, v, v, this.getResources().getDimensionPixelOffset(0x7F070BA2));  // dimen:margin_x_large
        AppCompatImageView appCompatImageView0 = new AppCompatImageView(this.getContext());
        appCompatImageView0.setId(0x7F0B0C42);  // id:back_icon
        appCompatImageView0.setPadding(v, v, v, v);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(this.getResources().getDimensionPixelOffset(0x7F0708AC), this.getResources().getDimensionPixelOffset(0x7F0708A7));  // dimen:icon_width
        relativeLayout$LayoutParams0.addRule(21);
        appCompatImageView0.setLayoutParams(relativeLayout$LayoutParams0);
        this.addView(appCompatImageView0);
        yrq yrq0 = new yrq(this.getContext());
        yrq0.setId(0x7F0B1902);  // id:mic_icon
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(14);
        relativeLayout$LayoutParams1.addRule(12);
        yrq0.setLayoutParams(relativeLayout$LayoutParams1);
        yrq0.setKeepScreenOn(true);
        this.addView(yrq0);
        MaterialTextView materialTextView0 = new MaterialTextView(this.getContext());
        materialTextView0.setId(0x7F0B1901);  // id:mic_helper_text
        materialTextView0.setGravity(17);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams2.setMargins(v1, v1, v1, 0);
        relativeLayout$LayoutParams2.addRule(2, 0x7F0B1902);  // id:mic_icon
        materialTextView0.setLayoutParams(relativeLayout$LayoutParams2);
        this.addView(materialTextView0);
        ScrollView scrollView0 = new ScrollView(context0);
        scrollView0.setId(0x7F0B1F47);  // id:scrollview
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(2, 0x7F0B1901);  // id:mic_helper_text
        relativeLayout$LayoutParams3.addRule(3, 0x7F0B0C42);  // id:back_icon
        scrollView0.setLayoutParams(relativeLayout$LayoutParams3);
        this.addView(scrollView0);
        RelativeLayout relativeLayout0 = new RelativeLayout(context0);
        relativeLayout0.setPadding(v1, v, v1, 0);
        scrollView0.addView(relativeLayout0, new FrameLayout.LayoutParams(-1, -1));
        MaterialTextView materialTextView1 = new MaterialTextView(this.getContext());
        materialTextView1.setId(0x7F0B1302);  // id:existing_description_label
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams4.addRule(10);
        materialTextView1.setLayoutParams(relativeLayout$LayoutParams4);
        relativeLayout0.addView(materialTextView1);
        MaterialTextView materialTextView2 = new MaterialTextView(this.getContext());
        materialTextView2.setId(0x7F0B1301);  // id:existing_description
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams5.setMargins(0, v, 0, 0);
        relativeLayout$LayoutParams5.addRule(3, 0x7F0B1302);  // id:existing_description_label
        materialTextView2.setLayoutParams(relativeLayout$LayoutParams5);
        relativeLayout0.addView(materialTextView2);
        MaterialTextView materialTextView3 = new MaterialTextView(this.getContext());
        materialTextView3.setId(0x7F0B1681);  // id:hint_label
        RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams6.addRule(10);
        materialTextView3.setLayoutParams(relativeLayout$LayoutParams6);
        relativeLayout0.addView(materialTextView3);
        MaterialTextView materialTextView4 = new MaterialTextView(this.getContext());
        materialTextView4.setId(0x7F0B1905);  // id:mic_state
        RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams7.setMargins(0, v, 0, 0);
        relativeLayout$LayoutParams7.addRule(3, 0x7F0B1681);  // id:hint_label
        materialTextView4.setLayoutParams(relativeLayout$LayoutParams7);
        relativeLayout0.addView(materialTextView4);
        MaterialTextView materialTextView5 = new MaterialTextView(this.getContext());
        materialTextView5.setId(0x7F0B241F);  // id:user_input_text
        RelativeLayout.LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams8.setMargins(0, v, 0, 0);
        materialTextView5.setLayoutParams(relativeLayout$LayoutParams8);
        relativeLayout0.addView(materialTextView5);
    }
}

