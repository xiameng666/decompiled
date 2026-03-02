import android.graphics.Typeface;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

public final class gbew extends gbfh {
    private final gbnr b;

    public gbew(gbnr gbnr0) {
        this.b = gbnr0;
    }

    @Override  // gbfh
    public final void f(Typeface typeface0) {
        gbnr gbnr0 = this.b;
        gbnr0.g = true;
        if(gbnr0.I == null || !gbnr0.I.equals(typeface0)) {
            gbnr0.I = typeface0;
            for(Object object0: gbnr0.W) {
                EditText editText0 = ((TextInputLayout)object0).f;
                gftb.check(editText0);
                editText0.setTypeface(typeface0);
            }
            for(Object object1: gbnr0.aa) {
                ((TextView)object1).setTypeface(typeface0);
            }
        }
    }

    @Override  // gbfh
    public final void g(int v, int v1, int v2) {
        try {
            String s = String.format(Locale.US, "\'wght\' %d, \'wdth\' %d, \'ROND\' %d", v, v1, v2);
            gbnr gbnr0 = this.b;
            for(Object object0: gbnr0.W) {
                EditText editText0 = ((TextInputLayout)object0).f;
                gftb.check(editText0);
                editText0.setFontVariationSettings(s);
            }
            for(Object object1: gbnr0.aa) {
                ((TextView)object1).setFontVariationSettings(s);
            }
        }
        catch(NumberFormatException unused_ex) {
        }
    }
}

