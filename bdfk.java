import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import java.util.Locale;

public final class bdfk {
    public final Context a;
    public final betj b;
    public final bdfj c;
    private static final bboh d;
    private final beqo e;

    static {
        bdfk.d = bboh.b("CheckupResultPasswordIssueViewCreator", bbcu.cX);
    }

    public bdfk(Context context0, beqo beqo0, betj betj0, bdfj bdfj0) {
        this.a = context0;
        this.e = beqo0;
        this.b = betj0;
        this.c = bdfj0;
    }

    public final View a(View view0, ViewGroup viewGroup0, bede bede0, gfsx gfsx0, graz graz0) {
        boolean z = graz0 == graz.b && (bede0.e.i() && !((gged_interceptors)bede0.e.d()).isEmpty());
        if(view0 == null || view0.getTag() != bedd.a) {
            Context context0 = this.a;
            View view1 = LayoutInflater.from(context0).inflate(0x7F0E084D, viewGroup0, false);  // layout:pwm_checkup_result_password_issue
            if(hsam.f()) {
                view1.setBackgroundResource(0x7F080AB5);  // drawable:pwm_checkup_result_item_border_left_right
                view1.findViewById(0x7F0B0ED1).setBackground(new ColorDrawable(bgnh.a(context0, 0x7F040338)));  // id:checkup_password_issue_border
            }
            else {
                view1.setBackgroundResource(0x7F080AB6);  // drawable:pwm_checkup_result_item_border_left_right_old
                view1.findViewById(0x7F0B0ED1).setBackground(new ColorDrawable(bgnh.a(context0, 0x7F0402F9)));  // id:checkup_password_issue_border
            }
            view1.setTag(bedd.a);
            view0 = view1;
        }
        if(z) {
            view0.findViewById(0x7F0B229F).setVisibility(0);  // id:three_line_info_card_third_line_content
        }
        else {
            view0.findViewById(0x7F0B229F).setVisibility(8);  // id:three_line_info_card_third_line_content
        }
        gfsx gfsx1 = bede0.c;
        if(!gfsx1.i()) {
            ((ggtj)bdfk.d.j()).x("Failed to get PasswordIssues detail");
            return view0;
        }
        gqmd gqmd0 = ((bedh)gfsx1.d()).a;
        hhyo hhyo0 = ((bedh)gfsx1.d()).b;
        String s = hhyo0.c.isEmpty() ? ((bedg)gqmd0.j()).c : hhyo0.c;
        View view2 = view0.findViewById(0x7F0B0EDC);  // id:checkup_result_item_three_dot
        Context context1 = this.a;
        view2.setContentDescription(TextUtils.expandTemplate(context1.getResources().getText(0x7F150763), new CharSequence[]{s}));  // string:checkup_result_item_three_dot_menu_description "More options for ^1."
        gfsx gfsx2 = bede0.e;
        ((TextView)view0.findViewById(0x7F0B229B)).setText(s);  // id:three_line_info_card_first_line_content
        ((TextView)view0.findViewById(0x7F0B229D)).setText(((bedg)gqmd0.j()).a);  // id:three_line_info_card_second_line_content
        if(gfsx2.i()) {
            TextView textView0 = (TextView)view0.findViewById(0x7F0B229F);  // id:three_line_info_card_third_line_content
            Object object0 = gfsx2.d();
            context1.getResources();
            boolean z1 = ((gged_interceptors)object0).contains(grbd.b);
            textView0.setText((!((gged_interceptors)object0).contains(grbd.c) || z1 ? "Found in data breach" : "Entered on deceptive site"));
        }
        String s1 = (hhyo0.b & 4) == 0 || hhyo0.e.isEmpty() ? ((bedg)gqmd0.j()).c : hhyo0.e;
        FadeInImageView fadeInImageView0 = (FadeInImageView)view0.findViewById(0x7F0B0EDB);  // id:checkup_result_item_icon
        if(gfta.c(s1)) {
            fadeInImageView0.setImageResource(0x7F080CD1);  // drawable:quantum_ic_chrome_product_vd_theme_24
        }
        else if(s1.toLowerCase(Locale.US).startsWith("android://")) {
            fadeInImageView0.setImageResource(0x1080093);
        }
        else {
            fadeInImageView0.a(s1);
        }
        fadeInImageView0.setImportantForAccessibility(2);
        TextView textView1 = (TextView)view0.findViewById(0x7F0B0ED0);  // id:checkup_password_change_button
        Uri uri0 = Uri.parse(((bedg)gqmd0.j()).c);
        if((uri0.getScheme() == null || uri0.getAuthority() == null ? null : new Uri.Builder().scheme(uri0.getScheme()).authority(uri0.getAuthority()).build().toString()) != null) {
            textView1.setContentDescription(TextUtils.expandTemplate(context1.getResources().getText(0x7F152673), new CharSequence[]{s}));  // string:pwm_checkup_action_change_description "Change password for ^1."
            textView1.setOnClickListener(new bdfh(this, graz0, gqmd0, this.e.o.a()));
        }
        view0.findViewById(0x7F0B0EDA).setOnClickListener(new bdfi(this, gfsx1, gfsx0, graz0));  // id:checkup_result_item
        return view0;
    }
}

