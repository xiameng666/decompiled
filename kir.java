import android.graphics.drawable.Icon;

public final class kir {
    public final CharSequence a;
    public final CharSequence b;
    public final Icon c;
    public final String d;

    public kir(CharSequence charSequence0, CharSequence charSequence1) {
        ibuq.f(charSequence0, "userId");
        this(charSequence0, charSequence1, null, null);
    }

    public kir(CharSequence charSequence0, CharSequence charSequence1, Icon icon0, String s) {
        ibuq.f(charSequence0, "userId");
        super();
        this.a = charSequence0;
        this.b = charSequence1;
        this.c = icon0;
        this.d = s;
        if(charSequence0.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("userId should not be empty");
    }
}

