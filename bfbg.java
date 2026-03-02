import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import java.util.Locale;

public final class bfbg {
    private final FadeInImageView a;
    private final TextView b;

    public bfbg(View view0) {
        ibuq.f(view0, "itemView");
        super();
        View view1 = view0.findViewById(0x7F0B181F);  // id:list_item_icon
        ibuq.e(view1, "findViewById(...)");
        this.a = (FadeInImageView)view1;
        View view2 = view0.findViewById(0x7F0B1824);  // id:list_item_text
        ibuq.e(view2, "findViewById(...)");
        this.b = (TextView)view2;
    }

    public final void a(gqlt gqlt0) {
        ibuq.f(gqlt0, "affiliatedGroup");
        hhyo hhyo0 = gqlt0.b;
        String s = hhyo0.e;
        ibuq.e(s, "getIconUrl(...)");
        FadeInImageView fadeInImageView0 = this.a;
        if(s != null && s.length() != 0) {
            fadeInImageView0.getContext();
            fadeInImageView0.a(s);
        }
        else {
            String s1 = ((bedg)((gqmd)gqlt0.c.get(0)).c().get(0)).c.toLowerCase(Locale.ROOT);
            ibuq.e(s1, "toLowerCase(...)");
            if(ibzk.W(s1, "android://")) {
                fadeInImageView0.setImageResource(0x1080093);
            }
            else {
                fadeInImageView0.setImageResource(0x7F080CD1);  // drawable:quantum_ic_chrome_product_vd_theme_24
            }
        }
        fadeInImageView0.setImportantForAccessibility(2);
        this.b.setText(hhyo0.c);
        this.b.setEllipsize(((hhyc.b(hhyo0.d) == null ? hhyc.a : hhyc.b(hhyo0.d)) == hhyc.b ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END));
    }
}

