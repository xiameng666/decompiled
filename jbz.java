import android.os.Build.VERSION;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;

public final class jbz {
    public final CharSequence a;
    public final TextPaint b;
    public float c;
    private final int d;
    private float e;
    private BoringLayout.Metrics f;
    private boolean g;
    private CharSequence h;

    public jbz(CharSequence charSequence0, TextPaint textPaint0, int v) {
        this.a = charSequence0;
        this.b = textPaint0;
        this.d = v;
        this.e = NaNf;
        this.c = NaNf;
    }

    public final float a(int v, int v1) {
        return Layout.getDesiredWidth(this.d(), v, v1, this.b);
    }

    public final float b() {
        if(!Float.isNaN(this.e)) {
            return this.e;
        }
        BoringLayout.Metrics boringLayout$Metrics0 = this.c();
        int v = boringLayout$Metrics0 == null ? -1 : boringLayout$Metrics0.width;
        float f = ((float)v) < 0.0f ? ((float)Math.ceil(this.a(0, this.d().length()))) : ((float)v);
        CharSequence charSequence0 = this.a;
        TextPaint textPaint0 = this.b;
        if(f == 0.0f) {
        }
        else if((charSequence0 instanceof Spanned) && (jcb.a(((Spanned)charSequence0), jcv.class) || jcb.a(((Spanned)charSequence0), jcu.class)) || textPaint0.getLetterSpacing() != 0.0f) {
            f += 0.5f;
        }
        this.e = f;
        return f;
    }

    public final BoringLayout.Metrics c() {
        if(!this.g) {
            CharSequence charSequence0 = this.a;
            TextPaint textPaint0 = this.b;
            TextDirectionHeuristic textDirectionHeuristic0 = jch.b(this.d);
            BoringLayout.Metrics boringLayout$Metrics0 = null;
            if(Build.VERSION.SDK_INT >= 33) {
                boringLayout$Metrics0 = BoringLayout.isBoring(charSequence0, textPaint0, textDirectionHeuristic0, true, null);
            }
            else if(!textDirectionHeuristic0.isRtl(charSequence0, 0, charSequence0.length())) {
                boringLayout$Metrics0 = BoringLayout.isBoring(charSequence0, textPaint0, null);
            }
            this.f = boringLayout$Metrics0;
            this.g = true;
        }
        return this.f;
    }

    private final CharSequence d() {
        CharSequence charSequence0 = this.h;
        if(charSequence0 == null) {
            charSequence0 = this.a;
            if((charSequence0 instanceof Spanned) && jcb.a(((Spanned)charSequence0), CharacterStyle.class)) {
                CharacterStyle[] arr_characterStyle = (CharacterStyle[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), CharacterStyle.class);
                if(arr_characterStyle != null && arr_characterStyle.length != 0) {
                    CharSequence charSequence1 = null;
                    Iterator iterator0 = ibug.a(arr_characterStyle);
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        CharacterStyle characterStyle0 = (CharacterStyle)object0;
                        if(!(characterStyle0 instanceof MetricAffectingSpan)) {
                            if(charSequence1 == null) {
                                charSequence1 = new SpannableString(charSequence0);
                            }
                            ((SpannableString)charSequence1).removeSpan(characterStyle0);
                        }
                    }
                    if(charSequence1 != null) {
                        charSequence0 = charSequence1;
                    }
                }
            }
            this.h = charSequence0;
        }
        return charSequence0;
    }
}

