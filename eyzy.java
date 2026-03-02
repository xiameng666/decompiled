import android.text.Annotation;
import android.text.SpannableString;
import android.widget.TextView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

public final class eyzy {
    private final bthl a;

    public eyzy(bthl bthl0) {
        this.a = bthl0;
    }

    public final void a(String s) {
        ibuq.f(s, "pLink");
        InProductHelp inProductHelp0 = new InProductHelp(new GoogleHelp(s), null, null, 0, null, 0, null);
        inProductHelp0.c = "https://support.google.com/googlepixelwatch/?p=" + s;
        this.a.b(inProductHelp0);
    }

    public final void b(TextView textView0, String s) {
        Object object0;
        ibuq.f(textView0, "textView");
        SpannableString spannableString0 = new SpannableString(textView0.getText());
        Object[] arr_object = spannableString0.getSpans(0, spannableString0.length(), Annotation.class);
        for(int v = 0; true; ++v) {
            object0 = null;
            if(v >= arr_object.length) {
                break;
            }
            Object object1 = arr_object[v];
            if(ibuq.m(((Annotation)object1).getValue(), "learn_more")) {
                object0 = object1;
                break;
            }
        }
        if(((Annotation)object0) == null) {
            return;
        }
        spannableString0.setSpan(new eyzx(this, s), spannableString0.getSpanStart(((Annotation)object0)), spannableString0.getSpanEnd(((Annotation)object0)), 33);
        textView0.setText(spannableString0);
        textView0.setMovementMethod(kap.a());
    }
}

