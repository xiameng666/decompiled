import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class qg {
    public int a;
    public Typeface b;
    public boolean c;
    private final TextView d;
    private wg e;
    private wg f;
    private wg g;
    private wg h;
    private wg i;
    private wg j;
    private final ql k;
    private int l;
    private String m;

    public qg(TextView textView0) {
        this.a = 0;
        this.l = -1;
        this.m = null;
        this.d = textView0;
        this.k = new ql(textView0);
    }

    public final void a() {
        if(this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] arr_drawable = this.d.getCompoundDrawables();
            this.g(arr_drawable[0], this.e);
            this.g(arr_drawable[1], this.f);
            this.g(arr_drawable[2], this.g);
            this.g(arr_drawable[3], this.h);
        }
        if(this.i == null && this.j == null) {
            return;
        }
        Drawable[] arr_drawable1 = this.d.getCompoundDrawablesRelative();
        this.g(arr_drawable1[0], this.i);
        this.g(arr_drawable1[2], this.j);
    }

    public static void b(TextView textView0, Typeface typeface0, int v) {
        String s = textView0.getFontVariationSettings();
        if(!TextUtils.isEmpty(s)) {
            qe.b(textView0, null);
        }
        textView0.setTypeface(typeface0, v);
        if(!TextUtils.isEmpty(s)) {
            qe.b(textView0, s);
        }
    }

    public final void c(AttributeSet attributeSet0, int v) {
        float f3;
        int v16;
        int v13;
        String s;
        boolean z2;
        boolean z1;
        Context context0 = this.d.getContext();
        pc pc0 = pc.d();
        wi wi0 = wi.l(context0, attributeSet0, ku.h, v, 0);
        Context context1 = this.d.getContext();
        kfc.b(this.d, context1, ku.h, attributeSet0, wi0.b, v, 0);
        TextView textView0 = this.d;
        int v1 = wi0.f(0, -1);
        if(wi0.q(3)) {
            this.e = qg.f(context0, pc0, wi0.f(3, 0));
        }
        if(wi0.q(1)) {
            this.f = qg.f(context0, pc0, wi0.f(1, 0));
        }
        if(wi0.q(4)) {
            this.g = qg.f(context0, pc0, wi0.f(4, 0));
        }
        if(wi0.q(2)) {
            this.h = qg.f(context0, pc0, wi0.f(2, 0));
        }
        if(wi0.q(5)) {
            this.i = qg.f(context0, pc0, wi0.f(5, 0));
        }
        if(wi0.q(6)) {
            this.j = qg.f(context0, pc0, wi0.f(6, 0));
        }
        wi0.o();
        boolean z = textView0.getTransformationMethod() instanceof PasswordTransformationMethod;
        if(v1 == -1) {
            z1 = false;
            z2 = false;
            s = null;
        }
        else {
            wi wi1 = wi.j(context0, v1, ku.y);
            if(!z && wi1.q(17)) {
                z1 = wi1.p(17, false);
                z2 = true;
            }
            else {
                z1 = false;
                z2 = false;
            }
            this.i(context0, wi1);
            s = wi1.q(18) ? wi1.n(18) : null;
            wi1.o();
        }
        wi wi2 = wi.l(context0, attributeSet0, ku.y, v, 0);
        if(!z && wi2.q(17)) {
            z1 = wi2.p(17, false);
            z2 = true;
        }
        if(wi2.q(18)) {
            s = wi2.n(18);
        }
        if(wi2.q(0) && wi2.b(0, -1) == 0) {
            textView0.setTextSize(0, 0.0f);
        }
        this.i(context0, wi2);
        wi2.o();
        if(!z && z2) {
            this.e(z1);
        }
        this.h(false);
        if(s != null) {
            textView0.setTextLocales(LocaleList.forLanguageTags(s));
        }
        ql ql0 = this.k;
        int[] arr_v = ku.i;
        TypedArray typedArray0 = ql0.h.obtainStyledAttributes(attributeSet0, arr_v, v, 0);
        Context context2 = ql0.h;
        Context context3 = ql0.g.getContext();
        kfc.b(ql0.g, context3, arr_v, attributeSet0, typedArray0, v, 0);
        if(typedArray0.hasValue(5)) {
            ql0.a = typedArray0.getInt(5, 0);
        }
        float f = typedArray0.hasValue(4) ? typedArray0.getDimension(4, -1.0f) : -1.0f;
        float f1 = typedArray0.hasValue(2) ? typedArray0.getDimension(2, -1.0f) : -1.0f;
        float f2 = typedArray0.hasValue(1) ? typedArray0.getDimension(1, -1.0f) : -1.0f;
        if(typedArray0.hasValue(3)) {
            int v2 = typedArray0.getResourceId(3, 0);
            if(v2 > 0) {
                TypedArray typedArray1 = typedArray0.getResources().obtainTypedArray(v2);
                int v3 = typedArray1.length();
                int[] arr_v1 = new int[v3];
                if(v3 > 0) {
                    for(int v4 = 0; v4 < v3; ++v4) {
                        arr_v1[v4] = typedArray1.getDimensionPixelSize(v4, -1);
                    }
                    ql0.e = ql.b(arr_v1);
                    int[] arr_v2 = ql0.e;
                    ql0.f = arr_v2.length > 0;
                    if(arr_v2.length > 0) {
                        ql0.a = 1;
                        ql0.c = (float)arr_v2[0];
                        ql0.d = (float)arr_v2[arr_v2.length - 1];
                        ql0.b = -1.0f;
                    }
                }
                typedArray1.recycle();
            }
        }
        typedArray0.recycle();
        if(!ql0.a()) {
            ql0.a = 0;
        }
        else if(ql0.a == 1) {
            boolean z3 = ql0.f;
            if(!z3) {
                DisplayMetrics displayMetrics0 = context2.getResources().getDisplayMetrics();
                if(f1 == -1.0f) {
                    f1 = TypedValue.applyDimension(2, 12.0f, displayMetrics0);
                }
                if(f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 112.0f, displayMetrics0);
                }
                if(f == -1.0f) {
                    f = 1.0f;
                }
                if(Float.compare(f1, 0.0f) <= 0) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + f1 + "px) is less or equal to (0px)");
                }
                if(f2 <= f1) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f1 + "px)");
                }
                if(f <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + f + "px) is less or equal to (0px)");
                }
                ql0.a = 1;
                ql0.c = f1;
                ql0.d = f2;
                ql0.b = f;
                ql0.f = false;
                z3 = false;
            }
            if(ql0.a() && (!z3 || ql0.e.length == 0)) {
                int v5 = ((int)Math.floor((ql0.d - ql0.c) / ql0.b)) + 1;
                int[] arr_v3 = new int[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_v3[v6] = Math.round(ql0.c + ((float)v6) * ql0.b);
                }
                ql0.e = ql.b(arr_v3);
            }
        }
        if(ql0.a != 0) {
            int[] arr_v4 = ql0.e;
            if(arr_v4.length > 0) {
                if(((float)textView0.getAutoSizeStepGranularity()) == -1.0f) {
                    textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v4, 0);
                }
                else {
                    textView0.setAutoSizeTextTypeUniformWithConfiguration(Math.round(ql0.c), Math.round(ql0.d), Math.round(ql0.b), 0);
                }
            }
        }
        wi wi3 = wi.k(context0, attributeSet0, arr_v);
        int v7 = wi3.f(8, -1);
        Drawable drawable0 = v7 == -1 ? null : pc0.c(context0, v7);
        int v8 = wi3.f(13, -1);
        Drawable drawable1 = v8 == -1 ? null : pc0.c(context0, v8);
        int v9 = wi3.f(9, -1);
        Drawable drawable2 = v9 == -1 ? null : pc0.c(context0, v9);
        int v10 = wi3.f(6, -1);
        Drawable drawable3 = v10 == -1 ? null : pc0.c(context0, v10);
        int v11 = wi3.f(10, -1);
        Drawable drawable4 = v11 == -1 ? null : pc0.c(context0, v11);
        int v12 = wi3.f(7, -1);
        Drawable drawable5 = v12 == -1 ? null : pc0.c(context0, v12);
        if(drawable4 != null) {
            v13 = drawable3 == null ? 1 : 0;
        label_168:
            Drawable[] arr_drawable2 = textView0.getCompoundDrawablesRelative();
            if(drawable4 == null) {
                drawable4 = arr_drawable2[0];
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable2[1];
            }
            if(drawable5 == null) {
                drawable5 = arr_drawable2[2];
            }
            if(1 == v13) {
                drawable3 = arr_drawable2[3];
            }
            textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable4, drawable1, drawable5, drawable3);
        }
        else if(drawable5 == null) {
            if(drawable0 != null || drawable1 != null || drawable2 != null || drawable3 != null) {
                Drawable[] arr_drawable = textView0.getCompoundDrawablesRelative();
                Drawable drawable6 = arr_drawable[0];
                if(drawable6 == null && arr_drawable[2] == null) {
                    Drawable[] arr_drawable1 = textView0.getCompoundDrawables();
                    if(drawable0 == null) {
                        drawable0 = arr_drawable1[0];
                    }
                    if(drawable1 == null) {
                        drawable1 = arr_drawable1[1];
                    }
                    if(drawable2 == null) {
                        drawable2 = arr_drawable1[2];
                    }
                    if(drawable3 == null) {
                        drawable3 = arr_drawable1[3];
                    }
                    textView0.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
                }
                else {
                    if(drawable1 == null) {
                        drawable1 = arr_drawable[1];
                    }
                    if(drawable3 == null) {
                        drawable3 = arr_drawable[3];
                    }
                    textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable6, drawable1, arr_drawable[2], drawable3);
                }
            }
        }
        else if(drawable3 != null) {
            v13 = 0;
            goto label_168;
        }
        else {
            v13 = 1;
            goto label_168;
        }
        if(wi3.q(11)) {
            kim.a(textView0, wi3.g(11));
        }
        if(wi3.q(12)) {
            kim.b(textView0, rg.a(wi3.c(12, -1), null));
        }
        int v14 = wi3.b(15, -1);
        int v15 = wi3.b(18, -1);
        if(wi3.q(19)) {
            TypedValue typedValue0 = wi3.b.peekValue(19);
            if(typedValue0 != null && typedValue0.type == 5) {
                v16 = 15 & typedValue0.data;
                f3 = TypedValue.complexToFloat(typedValue0.data);
            }
            else {
                f3 = (float)wi3.b(19, -1);
                v16 = -1;
            }
        }
        else {
            f3 = -1.0f;
            v16 = -1;
        }
        wi3.o();
        if(v14 != -1) {
            kay.h(v14);
            textView0.setFirstBaselineToTopHeight(v14);
        }
        if(v15 != -1) {
            kay.h(v15);
            Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
            int v17 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.bottom : paint$FontMetricsInt0.descent;
            if(v15 > Math.abs(v17)) {
                textView0.setPadding(textView0.getPaddingLeft(), textView0.getPaddingTop(), textView0.getPaddingRight(), v15 - v17);
            }
        }
        if(f3 != -1.0f) {
            if(v16 == -1) {
                kim.c(textView0, ((int)f3));
                return;
            }
            kim.d(textView0, v16, f3);
        }
    }

    public final void d(Context context0, int v) {
        wi wi0 = wi.j(context0, v, ku.y);
        if(wi0.q(17)) {
            this.e(wi0.p(17, false));
        }
        if(wi0.q(0) && wi0.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean z = this.i(context0, wi0);
        wi0.o();
        this.h(z);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }

    private static wg f(Context context0, pc pc0, int v) {
        ColorStateList colorStateList0 = pc0.a(context0, v);
        if(colorStateList0 != null) {
            wg wg0 = new wg();
            wg0.d = true;
            wg0.a = colorStateList0;
            return wg0;
        }
        return null;
    }

    private final void g(Drawable drawable0, wg wg0) {
        if(drawable0 != null && wg0 != null) {
            ut.g(drawable0, wg0, this.d.getDrawableState());
        }
    }

    private final void h(boolean z) {
        Typeface typeface0 = this.b;
        if(typeface0 == null) {
            if(z) {
                this.d.setTypeface(null);
            }
        }
        else if(this.l == -1) {
            this.d.setTypeface(typeface0, this.a);
        }
        else {
            this.d.setTypeface(typeface0);
        }
        String s = this.m;
        if(s != null) {
            qe.b(this.d, s);
        }
    }

    private final boolean i(Context context0, wi wi0) {
        this.a = wi0.c(2, this.a);
        int v = wi0.c(14, -1);
        this.l = v;
        if(v != -1) {
            this.a &= 2;
        }
        if(wi0.q(16)) {
            this.m = wi0.n(16);
        }
        int v1 = 10;
        boolean z = false;
        if(!wi0.q(10) && !wi0.q(15)) {
            if(wi0.q(1)) {
                this.c = false;
                int v2 = wi0.c(1, 1);
                switch(v2) {
                    case 1: {
                        this.b = Typeface.SANS_SERIF;
                        return true;
                    }
                    case 2: {
                        this.b = Typeface.SERIF;
                        break;
                    }
                    default: {
                        if(v2 == 3) {
                            this.b = Typeface.MONOSPACE;
                            return true;
                        }
                    }
                }
                return true;
            }
            int v3 = this.l;
            if(v3 != -1) {
                Typeface typeface0 = this.b;
                if(typeface0 != null) {
                    if((2 & this.a) != 0) {
                        z = true;
                    }
                    this.b = Typeface.create(typeface0, v3, z);
                    return true;
                }
            }
            return false;
        }
        Typeface typeface1 = null;
        this.b = null;
        if(wi0.q(15)) {
            v1 = 15;
        }
        int v4 = this.l;
        int v5 = this.a;
        if(!context0.isRestricted()) {
            qb qb0 = new qb(this, v4, v5, new WeakReference(this.d));
            try {
                int v6 = this.a;
                int v7 = wi0.b.getResourceId(v1, 0);
                if(v7 != 0) {
                    if(wi0.c == null) {
                        wi0.c = new TypedValue();
                    }
                    Context context1 = wi0.a;
                    TypedValue typedValue0 = wi0.c;
                    if(!context1.isRestricted()) {
                        typeface1 = jxi.d(context1, v7, typedValue0, v6, qb0, true, false);
                    }
                }
                if(typeface1 != null) {
                    this.b = this.l == -1 ? typeface1 : Typeface.create(Typeface.create(typeface1, 0), this.l, (this.a & 2) != 0);
                }
                this.c = this.b == null;
            }
            catch(UnsupportedOperationException | Resources.NotFoundException unused_ex) {
            }
        }
        if(this.b == null) {
            String s = wi0.n(v1);
            if(s != null) {
                if(this.l != -1) {
                    Typeface typeface2 = Typeface.create(s, 0);
                    int v8 = this.l;
                    if((2 & this.a) != 0) {
                        z = true;
                    }
                    this.b = Typeface.create(typeface2, v8, z);
                    return true;
                }
                this.b = Typeface.create(s, this.a);
            }
        }
        return true;
    }
}

