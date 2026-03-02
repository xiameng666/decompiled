import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.setupdesign.items.NonActionableItem;
import java.util.Arrays;

final class cbsc extends NonActionableItem {
    private final String a;
    private final String b;
    private final String c;

    public cbsc(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final void a(View view0) {
        ibuq.f(view0, "view");
        super.a(view0);
        ((TextView)view0.findViewById(0x7F0B2162)).setText(this.b);  // id:sud_items_title
        TextView textView0 = (TextView)view0.findViewById(0x7F0B215E);  // id:sud_items_summary
        textView0.setText(this.a);
        textView0.setVisibility(0);
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B2156);  // id:sud_items_icon
        imageView0.getLayoutParams().height = view0.getContext().getResources().getDimensionPixelSize(0x7F070078);  // dimen:account_avatar_expressive_size
        cbaw.a(imageView0, (TextUtils.isEmpty(this.c) ? this.c : bapl.a(TextUtils.join("-", Arrays.asList(new String[]{"cc", "mo", "rp"})), this.c).toString()));
        ((FrameLayout)view0.findViewById(0x7F0B2157)).setVisibility(0);  // id:sud_items_icon_container
    }
}

