import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;

public final class bvxe extends bvxo {
    public final bwbl a;
    public final fhvw b;

    public bvxe(hgmq hgmq0, bvwy bvwy0, bwbl bwbl0, fhwo fhwo0, fhvw fhvw0, bvwa bvwa0, bvxp bvxp0, du du0, bwdm bwdm0) {
        super(hgmq0, bvwy0, fhwo0, bvwa0, bvxp0, du0, bwdm0);
        this.a = bwbl0;
        this.b = fhvw0;
    }

    @Override  // bvxo
    public final void a(View view0, LayoutInflater layoutInflater0) {
        ibuq.f(layoutInflater0, "inflater");
        hgmq hgmq0 = this.d;
        hgmi hgmi0 = hgmq0.e == 14 ? ((hgmi)hgmq0.f) : hgmi.a;
        ibuq.e(hgmi0, "getButton(...)");
        Button button0 = (view0 instanceof Button) ? ((Button)view0) : null;
        if(button0 == null) {
            return;
        }
        String s = hgmq0.h;
        ibuq.e(s, "getContentDescription(...)");
        if(s.length() > 0) {
            button0.setContentDescription(hgmq0.h);
        }
        String s1 = hgmi0.c;
        ibuq.e(s1, "getText(...)");
        if(s1.length() > 0) {
            button0.setText(hgmi0.c);
        }
        String s2 = hgmi0.h;
        ibuq.e(s2, "getIconOverrideDrawable(...)");
        if(s2.length() > 0 && (button0 instanceof MaterialButton)) {
            String s3 = hgmi0.h;
            ibuq.e(s3, "getIconOverrideDrawable(...)");
            Drawable drawable0 = this.e.a(s3);
            if(drawable0 != null) {
                ((MaterialButton)button0).u(drawable0);
            }
        }
        this.d(button0);
        String s4 = hgmi0.e;
        ibuq.e(s4, "getForegroundColor(...)");
        if(s4.length() != 0 && (!this.i.h() || !ibuq.m(hgmq0.g, "id/uiflow_summary_card_cta"))) {
            try {
                int v = Color.parseColor(s4);
                button0.setTextColor(v);
                if((button0 instanceof MaterialButton)) {
                    ((MaterialButton)button0).w(ColorStateList.valueOf(v));
                }
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        bwbh.a(button0);
        if(hgmi0.i) {
            button0.setMinimumHeight(button0.getResources().getDimensionPixelSize(0x7F0708BF));  // dimen:intro_button_padded_height
        }
        button0.post(new bvxc(this, hgmi0, button0));
    }
}

