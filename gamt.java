import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TtsSpan.DigitsBuilder;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class gamt extends fzam {
    public String a;
    private final TextInputLayout b;
    private final boolean c;
    private final boolean d;
    private EditText e;
    private CharSequence f;
    private CharSequence g;
    private CharSequence h;
    private String i;
    private boolean j;
    private boolean k;

    public gamt(TextInputLayout textInputLayout0, boolean z, boolean z1) {
        super(textInputLayout0);
        this.a = "";
        this.b = textInputLayout0;
        this.c = z;
        this.d = z1;
    }

    @Override  // fzam
    public final void c(View view0, khb khb0) {
        super.c(view0, khb0);
        this.e = this.b.f;
        Editable editable0 = this.b.f == null ? null : this.b.f.getText();
        this.f = editable0;
        this.i = editable0 == null ? "" : editable0.toString();
        this.g = this.b.o();
        this.h = this.b.p();
        this.j = TextUtils.isEmpty(this.f) ^ 1;
        this.k = TextUtils.isEmpty(this.g) ^ 1;
        gaxl.a();
        if(!TextUtils.isEmpty(this.a) && (!this.k || this.g != null && !this.g.toString().equals(this.a))) {
            if(!this.j) {
                if(this.h != null && this.k && khb0.j().toString().equals(this.g + ", " + this.h)) {
                    khb0.ab(this.a + ", " + this.h);
                }
                else {
                    khb0.ab(this.a);
                }
            }
            khb0.J(this.a);
        }
        if(this.c && this.j && (this.f != null && TextUtils.isDigitsOnly(this.f))) {
            String s = khb0.j().toString();
            String s1 = this.i;
            ibuq.f(s, "string");
            ibuq.f(s1, "numericSubstring");
            int v = gams.a.d(s);
            if(v >= 0 && gams.a.h(s1) && ibzk.G(s, s1)) {
                SpannableString spannableString0 = new SpannableString(s);
                spannableString0.setSpan(new TtsSpan.DigitsBuilder().setDigits(s1).build(), v, s1.length() + v, 0);
                s = spannableString0;
            }
            khb0.ab(s);
        }
        if(this.d) {
            gaxl.a();
            if(hzih.a.b().c() && this.j && this.f != null) {
                String s2 = khb0.j().toString();
                ibuq.f(s2, "string");
                SpannableString spannableString1 = new SpannableString(s2);
                for(int v1 = 0; v1 < s2.length(); v1 = v2) {
                    int v2 = v1 + 1;
                    if(Character.isDigit(s2.charAt(v1))) {
                        while(v2 < s2.length() && Character.isDigit(s2.charAt(v2))) {
                            ++v2;
                        }
                        TtsSpan.DigitsBuilder ttsSpan$DigitsBuilder0 = new TtsSpan.DigitsBuilder();
                        String s3 = s2.substring(v1, v2);
                        ibuq.e(s3, "substring(...)");
                        spannableString1.setSpan(ttsSpan$DigitsBuilder0.setDigits(s3).build(), v1, v2, 0);
                    }
                }
                khb0.ab(spannableString1);
            }
        }
    }
}

