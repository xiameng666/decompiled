import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ut {
    private static final PorterDuff.Mode a;
    private static ut b;
    private WeakHashMap c;
    private final WeakHashMap d;
    private TypedValue e;
    private boolean f;
    private pb g;
    private static final byk h;

    static {
        ut.a = PorterDuff.Mode.SRC_IN;
        ut.h = new byk(6);
    }

    public ut() {
        this.d = new WeakHashMap(0);
    }

    final ColorStateList a(Context context0, int v) {
        ColorStateList colorStateList1;
        synchronized(this) {
            WeakHashMap weakHashMap0 = this.c;
            ColorStateList colorStateList0 = null;
            if(weakHashMap0 == null) {
                colorStateList1 = null;
            }
            else {
                bzt bzt0 = (bzt)weakHashMap0.get(context0);
                colorStateList1 = bzt0 == null ? null : ((ColorStateList)bzu.a(bzt0, v));
            }
            if(colorStateList1 == null) {
                pb pb0 = this.g;
                if(pb0 != null) {
                    switch(v) {
                        case 0x7F080173: {  // drawable:abc_btn_borderless_material
                            colorStateList0 = pb.b(context0, 0);
                            break;
                        }
                        case 0x7F080178: {  // drawable:abc_btn_colored_material
                            colorStateList0 = pb.b(context0, wd.b(context0, 0x7F040296));  // attr:colorAccent
                            break;
                        }
                        case 0x7F080179: {  // drawable:abc_btn_default_mtrl_shape
                            colorStateList0 = pb.b(context0, wd.b(context0, 0x7F0402A0));  // attr:colorButtonNormal
                            break;
                        }
                        case 0x7F080185: {  // drawable:abc_edit_text_material
                            colorStateList0 = jwe.d(context0, 0x7F060017);  // color:abc_tint_edittext
                            break;
                        }
                        case 0x7F0801B5: 
                        case 0x7F0801B6: {  // drawable:abc_spinner_textfield_background_material
                            colorStateList0 = jwe.d(context0, 0x7F060019);  // color:abc_tint_spinner
                            break;
                        }
                        case 0x7F0801B9: {  // drawable:abc_switch_thumb_material
                            int[][] arr2_v = new int[3][];
                            int[] arr_v = new int[3];
                            ColorStateList colorStateList2 = wd.c(context0, 0x7F040347);  // attr:colorSwitchThumbNormal
                            if(colorStateList2 != null && colorStateList2.isStateful()) {
                                arr2_v[0] = wd.a;
                                arr_v[0] = colorStateList2.getColorForState(wd.a, 0);
                                arr2_v[1] = wd.d;
                                arr_v[1] = wd.b(context0, 0x7F0402BD);  // attr:colorControlActivated
                                arr2_v[2] = wd.e;
                                arr_v[2] = colorStateList2.getDefaultColor();
                            }
                            else {
                                arr2_v[0] = wd.a;
                                arr_v[0] = wd.a(context0, 0x7F040347);  // attr:colorSwitchThumbNormal
                                arr2_v[1] = wd.d;
                                arr_v[1] = wd.b(context0, 0x7F0402BD);  // attr:colorControlActivated
                                arr2_v[2] = wd.e;
                                arr_v[2] = wd.b(context0, 0x7F040347);  // attr:colorSwitchThumbNormal
                            }
                            colorStateList0 = new ColorStateList(arr2_v, arr_v);
                            break;
                        }
                        case 0x7F0801BA: {
                            colorStateList0 = jwe.d(context0, 0x7F06001A);  // color:abc_tint_switch_track
                            break;
                        }
                        default: {
                            if(pb.a(pb0.b, v)) {
                                colorStateList0 = wd.c(context0, 0x7F0402BF);  // attr:colorControlNormal
                            }
                            else if(pb.a(pb0.e, v)) {
                                colorStateList0 = jwe.d(context0, 0x7F060016);  // color:abc_tint_default
                            }
                            else if(pb.a(pb0.f, v)) {
                                colorStateList0 = jwe.d(context0, 0x7F060015);  // color:abc_tint_btn_checkable
                            }
                            else if(v == 0x7F0801AE) {  // drawable:abc_seekbar_thumb_material
                                colorStateList0 = jwe.d(context0, 0x7F060018);  // color:abc_tint_seek_thumb
                                v = 0x7F0801AE;  // drawable:abc_seekbar_thumb_material
                            }
                        }
                    }
                }
                if(colorStateList0 != null) {
                    if(this.c == null) {
                        this.c = new WeakHashMap();
                    }
                    bzt bzt1 = (bzt)this.c.get(context0);
                    if(bzt1 == null) {
                        bzt1 = new bzt();
                        this.c.put(context0, bzt1);
                    }
                    bzt1.f(v, colorStateList0);
                    return colorStateList0;
                }
                colorStateList1 = null;
            }
        }
        return colorStateList1;
    }

    public static PorterDuffColorFilter b(int v, PorterDuff.Mode porterDuff$Mode0) {
        PorterDuffColorFilter porterDuffColorFilter0;
        synchronized(ut.class) {
            byk byk0 = ut.h;
            porterDuffColorFilter0 = (PorterDuffColorFilter)byk0.d(Integer.valueOf(byk.j(v, porterDuff$Mode0)));
            if(porterDuffColorFilter0 == null) {
                PorterDuffColorFilter porterDuffColorFilter1 = new PorterDuffColorFilter(v, porterDuff$Mode0);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter)byk0.e(Integer.valueOf(byk.j(v, porterDuff$Mode0)), porterDuffColorFilter1);
                return porterDuffColorFilter1;
            }
        }
        return porterDuffColorFilter0;
    }

    public final Drawable c(Context context0, int v) {
        Drawable drawable0;
        synchronized(this) {
            drawable0 = this.d(context0, v, false);
        }
        return drawable0;
    }

    final Drawable d(Context context0, int v, boolean z) {
        Drawable drawable2;
        int v5;
        boolean z1 = false;
        int v1 = v;
        synchronized(this) {
            if(!this.f) {
                this.f = true;
                Drawable drawable0 = this.c(context0, 0x7F0801C6);  // drawable:abc_vector_test
                if(drawable0 == null || !(drawable0 instanceof pcb) && !"android.graphics.drawable.VectorDrawable".equals(drawable0.getClass().getName())) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if(this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue0 = this.e;
            context0.getResources().getValue(v1, typedValue0, true);
            long v3 = ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
            Drawable drawable1 = this.i(context0, v3);
            drawable2 = null;
            if(drawable1 == null) {
                if(this.g == null) {
                    drawable1 = null;
                }
                else {
                    switch(v1) {
                        case 0x7F080181: {  // drawable:abc_cab_background_top_material
                            drawable1 = new LayerDrawable(new Drawable[]{this.c(context0, 0x7F080180), this.c(context0, 0x7F080182)});  // drawable:abc_cab_background_internal_bg
                            break;
                        }
                        case 0x7F0801A6: {  // drawable:abc_ratingbar_indicator_material
                            drawable1 = pb.c(this, context0, 0x7F07005D);  // dimen:abc_star_medium
                            break;
                        }
                        case 0x7F0801A7: {  // drawable:abc_ratingbar_material
                            drawable1 = pb.c(this, context0, 0x7F07005C);  // dimen:abc_star_big
                            break;
                        }
                        case 0x7F0801A8: {  // drawable:abc_ratingbar_small_material
                            drawable1 = pb.c(this, context0, 0x7F07005E);  // dimen:abc_star_small
                            v1 = 0x7F0801A8;  // drawable:abc_ratingbar_small_material
                            break;
                        }
                        default: {
                            drawable1 = null;
                        }
                    }
                }
                if(drawable1 != null) {
                    drawable1.setChangingConfigurations(typedValue0.changingConfigurations);
                    this.j(context0, v3, drawable1);
                }
            }
            if(drawable1 == null) {
                drawable1 = context0.getDrawable(v1);
            }
            if(drawable1 != null) {
                ColorStateList colorStateList0 = this.a(context0, v1);
                if(colorStateList0 == null) {
                    pb pb0 = this.g;
                    if(pb0 == null) {
                    label_62:
                        if(pb0 == null) {
                        label_99:
                            if(!z) {
                                drawable2 = drawable1;
                            }
                        }
                        else {
                            int v4 = 0x1010031;
                            PorterDuff.Mode porterDuff$Mode0 = pc.a;
                            if(pb.a(pb0.a, v1)) {
                                v4 = 0x7F0402BF;  // attr:colorControlNormal
                                v5 = -1;
                                z1 = true;
                            }
                            else if(pb.a(pb0.c, v1)) {
                                v4 = 0x7F0402BD;  // attr:colorControlActivated
                                v5 = -1;
                                z1 = true;
                            }
                            else if(pb.a(pb0.d, v1)) {
                                porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
                                v5 = -1;
                                z1 = true;
                            }
                            else {
                                switch(v1) {
                                    case 0x7F080184: {  // drawable:abc_dialog_material_background
                                        v5 = -1;
                                        z1 = true;
                                        break;
                                    }
                                    case 0x7F080199: {
                                        v5 = Math.round(40.799999f);
                                        v4 = 0x1010030;
                                        z1 = true;
                                        break;
                                    }
                                    default: {
                                        v4 = 0;
                                        v5 = -1;
                                    }
                                }
                            }
                            if(z1) {
                                Drawable drawable4 = drawable1.mutate();
                                drawable4.setColorFilter(pc.b(wd.b(context0, v4), porterDuff$Mode0));
                                if(v5 != -1) {
                                    drawable4.setAlpha(v5);
                                }
                                drawable2 = drawable1;
                            }
                            else {
                                goto label_99;
                            }
                        }
                    }
                    else if(v1 == 0x7F0801B0) {  // drawable:abc_seekbar_track_material
                        pb.d(((LayerDrawable)drawable1).findDrawableByLayerId(0x1020000), wd.b(context0, 0x7F0402BF), pc.a);  // attr:colorControlNormal
                        pb.d(((LayerDrawable)drawable1).findDrawableByLayerId(0x102000F), wd.b(context0, 0x7F0402BF), pc.a);  // attr:colorControlNormal
                        pb.d(((LayerDrawable)drawable1).findDrawableByLayerId(0x102000D), wd.b(context0, 0x7F0402BD), pc.a);  // attr:colorControlActivated
                        drawable2 = drawable1;
                    }
                    else {
                        if(v1 == 0x7F0801A6 || v1 == 0x7F0801A7 || v1 == 0x7F0801A8) {  // drawable:abc_ratingbar_indicator_material
                            pb.d(((LayerDrawable)drawable1).findDrawableByLayerId(0x1020000), wd.a(context0, 0x7F0402BF), pc.a);  // attr:colorControlNormal
                            pb.d(((LayerDrawable)drawable1).findDrawableByLayerId(0x102000F), wd.b(context0, 0x7F0402BD), pc.a);  // attr:colorControlActivated
                            pb.d(((LayerDrawable)drawable1).findDrawableByLayerId(0x102000D), wd.b(context0, 0x7F0402BD), pc.a);  // attr:colorControlActivated
                            drawable2 = drawable1;
                            goto label_101;
                        }
                        goto label_62;
                    }
                }
                else {
                    Drawable drawable3 = drawable1.mutate();
                    drawable3.setTintList(colorStateList0);
                    if(this.g != null && v1 == 0x7F0801B9) {  // drawable:abc_switch_thumb_material
                        drawable2 = PorterDuff.Mode.MULTIPLY;
                    }
                    if(drawable2 != null) {
                        drawable3.setTintMode(((PorterDuff.Mode)drawable2));
                    }
                    drawable2 = drawable3;
                }
            }
        label_101:
            if(drawable2 != null) {
                rg.c(drawable2);
            }
        }
        return drawable2;
    }

    public static ut e() {
        synchronized(ut.class) {
            if(ut.b == null) {
                ut.b = new ut();
            }
        }
        return ut.b;
    }

    public final void f(Context context0) {
        synchronized(this) {
            byi byi0 = (byi)this.d.get(context0);
            if(byi0 != null) {
                byi0.g();
            }
        }
    }

    static void g(Drawable drawable0, wg wg0, int[] arr_v) {
        ColorStateList colorStateList0;
        int[] arr_v1 = drawable0.getState();
        if(drawable0.mutate() == drawable0) {
            if((drawable0 instanceof LayerDrawable) && drawable0.isStateful()) {
                drawable0.setState(new int[0]);
                drawable0.setState(arr_v1);
            }
            ColorFilter colorFilter0 = null;
            if(wg0.d) {
                colorStateList0 = wg0.a;
            }
            else {
                if(wg0.c) {
                    colorStateList0 = null;
                    goto label_13;
                }
                drawable0.clearColorFilter();
                return;
            }
        label_13:
            PorterDuff.Mode porterDuff$Mode0 = wg0.c ? wg0.b : ut.a;
            if(colorStateList0 != null && porterDuff$Mode0 != null) {
                colorFilter0 = ut.b(colorStateList0.getColorForState(arr_v, 0), porterDuff$Mode0);
            }
            drawable0.setColorFilter(colorFilter0);
        }
    }

    public final void h(pb pb0) {
        synchronized(this) {
            this.g = pb0;
        }
    }

    private final Drawable i(Context context0, long v) {
        synchronized(this) {
            byi byi0 = (byi)this.d.get(context0);
            if(byi0 != null) {
                WeakReference weakReference0 = (WeakReference)byi0.d(v);
                if(weakReference0 != null) {
                    Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakReference0.get();
                    if(drawable$ConstantState0 != null) {
                        return drawable$ConstantState0.newDrawable(context0.getResources());
                    }
                    byi0.i(v);
                }
            }
        }
        return null;
    }

    private final void j(Context context0, long v, Drawable drawable0) {
        synchronized(this) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                WeakHashMap weakHashMap0 = this.d;
                byi byi0 = (byi)weakHashMap0.get(context0);
                if(byi0 == null) {
                    byi0 = new byi();
                    weakHashMap0.put(context0, byi0);
                }
                byi0.h(v, new WeakReference(drawable$ConstantState0));
            }
        }
    }
}

