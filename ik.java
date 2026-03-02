import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ik extends ViewGroup.MarginLayoutParams {
    public int a;

    public ik(int v, int v1) {
        super(v, v1);
        this.a = 0x800013;
    }

    public ik(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = 0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ku.b);
        this.a = typedArray0.getInt(0, 0);
        typedArray0.recycle();
    }

    public ik(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super(viewGroup$LayoutParams0);
        this.a = 0;
    }

    public ik(ik ik0) {
        super(ik0);
        this.a = 0;
        this.a = ik0.a;
    }
}

