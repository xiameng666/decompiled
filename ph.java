import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public final class ph {
    public final lky a;
    private final TextView b;

    public ph(TextView textView0) {
        this.b = textView0;
        this.a = new lky(textView0);
    }

    public final void a(AttributeSet attributeSet0, int v) {
        boolean z = true;
        TypedArray typedArray0 = this.b.getContext().obtainStyledAttributes(attributeSet0, ku.i, v, 0);
        try {
            if(typedArray0.hasValue(14)) {
                z = typedArray0.getBoolean(14, true);
            }
        }
        finally {
            typedArray0.recycle();
        }
        ((lkx)this.a.a).a.a = z;
    }

    public final boolean b() {
        return this.a.a();
    }
}

