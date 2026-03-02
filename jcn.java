import java.text.BreakIterator;
import java.util.Locale;

public final class jcn {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final BreakIterator d;

    public jcn(CharSequence charSequence0, int v, Locale locale0) {
        this.a = charSequence0;
        if(charSequence0.length() < 0) {
            jie.a("input start index is outside the CharSequence");
        }
        if(v < 0 || v > charSequence0.length()) {
            jie.a("input end index is outside the CharSequence");
        }
        BreakIterator breakIterator0 = BreakIterator.getWordInstance(locale0);
        this.d = breakIterator0;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence0.length(), v + 50);
        breakIterator0.setText(new jbs(charSequence0, v));
    }

    public final int a(int v) {
        this.c(v);
        int v1 = this.d.following(v);
        return !this.g(v1 - 1) || !this.g(v1) || this.i(v1) ? v1 : this.a(v1);
    }

    public final int b(int v) {
        this.c(v);
        int v1 = this.d.preceding(v);
        return !this.g(v1) || !this.d(v1) || this.i(v1) ? v1 : this.b(v1);
    }

    public final void c(int v) {
        int v1 = this.c;
        if(v <= v1 && this.b <= v) {
            return;
        }
        jie.a(("Invalid offset: " + v + ". Valid range is [" + this.b + " , " + v1 + ']'));
    }

    public final boolean d(int v) {
        if(v <= this.c && this.b + 1 <= v) {
            return Character.isLetterOrDigit(Character.codePointBefore(this.a, v)) ? true : Character.isSurrogate(this.a.charAt(v - 1));
        }
        return false;
    }

    public final boolean e(int v) {
        return v > this.c || this.b + 1 > v ? false : jcm.a(Character.codePointBefore(this.a, v));
    }

    public final boolean f(int v) {
        this.c(v);
        if(this.d.isBoundary(v)) {
            if(this.g(v) && this.g(v - 1) && this.g(v + 1)) {
                return false;
            }
            if(v > 0 && v < this.a.length() - 1) {
                return this.i(v) ? false : !this.i(v + 1);
            }
            return true;
        }
        return false;
    }

    public final boolean g(int v) {
        if(v < this.c && this.b <= v) {
            return Character.isLetterOrDigit(Character.codePointAt(this.a, v)) ? true : Character.isSurrogate(this.a.charAt(v));
        }
        return false;
    }

    public final boolean h(int v) {
        return v >= this.c || this.b > v ? false : jcm.a(Character.codePointAt(this.a, v));
    }

    private final boolean i(int v) {
        return !ibuq.m(Character.UnicodeBlock.of(this.a.charAt(v - 1)), Character.UnicodeBlock.HIRAGANA) || !ibuq.m(Character.UnicodeBlock.of(this.a.charAt(v)), Character.UnicodeBlock.KATAKANA) ? ibuq.m(Character.UnicodeBlock.of(this.a.charAt(v)), Character.UnicodeBlock.HIRAGANA) && ibuq.m(Character.UnicodeBlock.of(this.a.charAt(v - 1)), Character.UnicodeBlock.KATAKANA) : true;
    }
}

