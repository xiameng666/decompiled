import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class gbeb {
    public static void a(gbet gbet0, LinearLayout linearLayout0, hckq hckq0) {
        gbdp gbdp0 = gbet0.c;
        gbfj.d(gbet0, linearLayout0);
        TextView textView0 = (TextView)linearLayout0.findViewById(0x7F0B11BA);  // id:dropdown_selector_option_text
        gbfe.i(gbet0, gbdp0.d(), textView0);
        gbfe.j(textView0, hckq0);
        gbel.a(gbet0, gbdp0.d(), ((ImageView)linearLayout0.findViewById(0x7F0B11B9)));  // id:dropdown_selector_option_start_icon
        gbel.a(gbet0, gbdp0.d(), ((ImageView)linearLayout0.findViewById(0x7F0B11B8)));  // id:dropdown_selector_option_end_icon
    }
}

