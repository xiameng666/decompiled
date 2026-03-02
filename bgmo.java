import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.common.ui.URLSpanNoUnderline;

public final class bgmo {
    public final bgmi a;

    public bgmo(bgmi bgmi0) {
        ibuq.f(bgmi0, "googleHelpLauncher");
        super();
        this.a = bgmi0;
    }

    public final void a(TextView textView0, int v, Uri uri0) {
        ibuq.f(textView0, "view");
        ibuq.f(uri0, "helpCenterUrl");
        String s = textView0.getContext().getString(v);
        CharSequence[] arr_charSequence = new CharSequence[1];
        String s1 = uri0.toString();
        ibuq.e(s1, "toString(...)");
        ibuq.e("Learn more", "getString(...)");
        arr_charSequence[0] = "<a href=\"" + s1 + "\">" + "Learn more" + "</a>";
        textView0.setText(URLSpanNoUnderline.a(Html.fromHtml(TextUtils.expandTemplate(s, arr_charSequence).toString(), 0x3F)));
        textView0.setOnClickListener(new bgmn(this, uri0));
    }
}

