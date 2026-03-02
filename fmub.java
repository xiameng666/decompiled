import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public final class fmub implements gfsi {
    public final fmuj a;

    public fmub(fmuj fmuj0) {
        this.a = fmuj0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            flbj.a("ConvPresenter", "Adding info icon and tooltip to avatar status bar.");
            fmus fmus0 = this.a.a;
            fmyu fmyu0 = fmus0.K;
            Drawable drawable0 = kv.a(fmyu0.getContext(), 0x7F08059F);  // drawable:gs_info_vd_theme_24
            fmyu0.d.setImageDrawable(drawable0);
            fmyu0.c.setVisibility(8);
            fmyu0.d.setVisibility(0);
            fmyu0.d.setContentDescription("More info");
            ImageButton imageButton0 = fmus0.K.d;
            imageButton0.setOnClickListener(new fmua(this.a));
            flbj.a("ConvPresenter", "Creating infoIconTooltip.");
            LinearLayout linearLayout0 = (LinearLayout)LayoutInflater.from(fmus0.a.getContext()).inflate(0x7F0E0547, null);  // layout:lt_tooltip_layout
            TextView textView0 = (TextView)linearLayout0.findViewById(0x7F0B1878);  // id:lt_tooltip_content_body
            if(iaea.a.g().y()) {
                textView0.setText(0x7F1515C7);  // string:info_icon_tooltip_body_text_profile_image_shared "Only your first and last 
                                                // name, and profile image are shared with the business."
            }
            else {
                textView0.setText(0x7F1515C6);  // string:info_icon_tooltip_body_text "Only your first and last name are shared with 
                                                // the business."
            }
            textView0.setVisibility(0);
            MaterialButton materialButton0 = (MaterialButton)linearLayout0.findViewById(0x7F0B1879);  // id:lt_tooltip_content_footer
            materialButton0.setText(0x7F1515C8);  // string:info_icon_tooltip_footer_text "Learn more"
            materialButton0.setVisibility(0);
            materialButton0.setOnClickListener(new fmtg(fmus0));
            fmus0.T = new fmzg(linearLayout0, imageButton0);
        }
        return null;
    }
}

