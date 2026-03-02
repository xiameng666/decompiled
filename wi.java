import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

public final class wi {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private wi(Context context0, TypedArray typedArray0) {
        this.a = context0;
        this.b = typedArray0;
    }

    public final int a(int v, int v1) {
        return this.b.getDimensionPixelOffset(v, v1);
    }

    public final int b(int v, int v1) {
        return this.b.getDimensionPixelSize(v, v1);
    }

    public final int c(int v, int v1) {
        return this.b.getInt(v, v1);
    }

    public final int d(int v, int v1) {
        return this.b.getInteger(v, v1);
    }

    public final int e(int v, int v1) {
        return this.b.getLayoutDimension(v, v1);
    }

    public final int f(int v, int v1) {
        return this.b.getResourceId(v, v1);
    }

    public final ColorStateList g(int v) {
        TypedArray typedArray0 = this.b;
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = jwe.d(this.a, v1);
                return colorStateList0 == null ? typedArray0.getColorStateList(v) : colorStateList0;
            }
        }
        return typedArray0.getColorStateList(v);
    }

    public final Drawable h(int v) {
        TypedArray typedArray0 = this.b;
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? typedArray0.getDrawable(v) : kv.a(this.a, v1);
        }
        return typedArray0.getDrawable(v);
    }

    public final Drawable i(int v) {
        TypedArray typedArray0 = this.b;
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : pc.d().g(this.a, v1);
        }
        return null;
    }

    public static wi j(Context context0, int v, int[] arr_v) {
        return new wi(context0, context0.obtainStyledAttributes(v, arr_v));
    }

    public static wi k(Context context0, AttributeSet attributeSet0, int[] arr_v) {
        return new wi(context0, context0.obtainStyledAttributes(attributeSet0, arr_v));
    }

    public static wi l(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1) {
        return new wi(context0, context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1));
    }

    public final CharSequence m(int v) {
        return this.b.getText(v);
    }

    public final String n(int v) {
        return this.b.getString(v);
    }

    public final void o() {
        this.b.recycle();
    }

    public final boolean p(int v, boolean z) {
        return this.b.getBoolean(v, z);
    }

    public final boolean q(int v) {
        return this.b.hasValue(v);
    }

    public final int r(int v) {
        return this.b.getColor(v, 0);
    }

    public final float s(int v) {
        return this.b.getDimension(v, -1.0f);
    }
}

