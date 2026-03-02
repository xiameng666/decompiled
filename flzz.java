import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.List;

public final class flzz {
    public final gmcg a;
    public final flky b;
    public final fmac c;

    public flzz(flky flky0, fmac fmac0) {
        this.b = flky0;
        this.c = fmac0;
        this.a = flbs.b().a;
    }

    public static List a(CharSequence charSequence0) {
        List list0 = new ArrayList();
        if(!TextUtils.isEmpty(charSequence0)) {
            SpannableStringBuilder spannableStringBuilder0 = SpannableStringBuilder.valueOf(charSequence0);
            Linkify.addLinks(spannableStringBuilder0, 1);
            ClickableSpan[] arr_clickableSpan = (ClickableSpan[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), ClickableSpan.class);
            for(int v = 0; v < arr_clickableSpan.length; ++v) {
                ClickableSpan clickableSpan0 = arr_clickableSpan[v];
                try {
                    list0.add(spannableStringBuilder0.subSequence(spannableStringBuilder0.getSpanStart(clickableSpan0), spannableStringBuilder0.getSpanEnd(clickableSpan0)).toString());
                }
                catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                    flbj.c("LighterLinkPreviewController", "TextUtil: Failed to extract url: " + indexOutOfBoundsException0.toString());
                }
            }
        }
        return list0;
    }
}

