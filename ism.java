import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

public final class ism {
    public static final hpw a(int v, goz goz0, int v1) {
        int v3;
        TypedValue typedValue0;
        Context context0 = (Context)goz0.h(AndroidCompositionLocals_androidKt.b);
        Resources resources0 = (Resources)goz0.h(AndroidCompositionLocals_androidKt.c);
        iso iso0 = (iso)goz0.h(AndroidCompositionLocals_androidKt.e);
        synchronized(iso0) {
            bxv bxv0 = iso0.a;
            typedValue0 = (TypedValue)bxv0.a(v);
            v3 = 1;
            if(typedValue0 == null) {
                typedValue0 = new TypedValue();
                resources0.getValue(v, typedValue0, true);
                int v4 = bxv0.c(v);
                Object[] arr_object = bxv0.c;
                Object object0 = arr_object[v4];
                bxv0.b[v4] = v;
                arr_object[v4] = typedValue0;
            }
        }
        CharSequence charSequence0 = typedValue0.string;
        isj isj0 = null;
        if(charSequence0 != null && ibzk.I(charSequence0, ".xml")) {
            goz0.M(-1771786530);
            Resources.Theme resources$Theme0 = context0.getTheme();
            int v5 = typedValue0.changingConfigurations;
            isl isl0 = (isl)goz0.h(AndroidCompositionLocals_androidKt.d);
            isk isk0 = new isk(resources$Theme0, v);
            HashMap hashMap0 = isl0.a;
            WeakReference weakReference0 = (WeakReference)hashMap0.get(isk0);
            if(weakReference0 != null) {
                isj0 = (isj)weakReference0.get();
            }
            if(isj0 == null) {
                XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                hty.b(xmlResourceParser0);
                if(!ibuq.m(xmlResourceParser0.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                }
                isj0 = isr.a(resources$Theme0, resources0, xmlResourceParser0, v5);
                hashMap0.put(isk0, new WeakReference(isj0));
            }
            hpw hpw0 = htd.g(isj0.a, goz0);
            goz0.A();
            return hpw0;
        }
        goz0.M(0x96670E08);
        Resources.Theme resources$Theme1 = context0.getTheme();
        int v6 = goz0.X(charSequence0);
        if(((v1 & 14 ^ 6) <= 4 || !goz0.V(v)) && (v1 & 6) != 4) {
            v3 = 0;
        }
        int v7 = v6 | v3 | goz0.X(resources$Theme1);
        Object object1 = goz0.k();
        if(v7 != 0 || object1 == gop.a) {
            try {
                Drawable drawable0 = resources0.getDrawable(v, null);
                ibuq.d(drawable0, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                object1 = new hkn(((BitmapDrawable)drawable0).getBitmap());
            }
            catch(Exception exception0) {
                Objects.toString(charSequence0);
                throw new isp("Error attempting to load resource: " + charSequence0, exception0);
            }
            goz0.R(object1);
        }
        hpw hpw1 = new hpu(((hkn)object1));
        goz0.A();
        return hpw1;
    }
}

