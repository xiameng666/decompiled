import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.material.button.MaterialButton;

public final class aahh implements lqj {
    public final aahl a;

    public aahh(aahl aahl0) {
        this.a = aahl0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aahl aahl0 = this.a;
        batl.s(aahl0.b);
        if(!((gfsx)object0).i()) {
            aahl0.ah.setVisibility(4);
            return;
        }
        aaby aaby0 = (aaby)((gfsx)object0).d();
        aahl0.ah.setVisibility(0);
        ViewGroup viewGroup0 = aahl0.ah;
        boolean z = aaby0.b();
        grwe grwe0 = aaby0.d;
        String s = aaby0.c;
        aahf aahf0 = new aahf(aahl0, aaby0, aaby0.f);
        TextView textView0 = (TextView)viewGroup0.findViewById(0x7F0B12A4);  // id:error_title
        TextView textView1 = (TextView)viewGroup0.findViewById(0x7F0B12A1);  // id:error_summary
        FadeInImageView fadeInImageView0 = (FadeInImageView)viewGroup0.findViewById(0x7F0B128C);  // id:error_image
        MaterialButton materialButton0 = (MaterialButton)viewGroup0.findViewById(0x7F0B127A);  // id:error_button
        aabu.k(textView0, aaby0.a);
        aabu.k(textView1, aaby0.b);
        if(s == null) {
            materialButton0.setVisibility(8);
        }
        else {
            materialButton0.setVisibility(0);
            materialButton0.setText(s);
            materialButton0.setOnClickListener(aahf0);
        }
        aabu.g(aahl0.b, fadeInImageView0, z, grwe0);
        fadeInImageView0.setImageTintList(ColorStateList.valueOf(cchs.a(aahl0.requireContext(), 0x7F0402FC, 0x7F0607A3)));  // attr:colorOnSurfaceVariant
    }
}

