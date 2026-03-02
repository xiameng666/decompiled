import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class isr {
    public static final isj a(Resources.Theme resources$Theme0, Resources resources0, XmlResourceParser xmlResourceParser0, int v) {
        int v6;
        int v5;
        int v3;
        long v1;
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        htw htw0 = new htw(xmlResourceParser0);
        TypedArray typedArray0 = htw0.c(resources0, resources$Theme0, attributeSet0, htx.a);
        XmlPullParser xmlPullParser0 = htw0.a;
        boolean z = jxk.l(typedArray0, xmlPullParser0, false);
        htw0.e(typedArray0.getChangingConfigurations());
        float f = htw0.a(typedArray0, "viewportWidth", 7, 0.0f);
        float f1 = htw0.a(typedArray0, "viewportHeight", 8, 0.0f);
        if(f <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float f2 = htw0.f(typedArray0, 3);
        float f3 = htw0.f(typedArray0, 2);
        if(typedArray0.hasValue(1)) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(1, typedValue0);
            if(typedValue0.type == 2) {
                v1 = hll.i;
            }
            else {
                ColorStateList colorStateList0 = jxk.n(typedArray0, xmlPullParser0, resources$Theme0);
                htw0.e(typedArray0.getChangingConfigurations());
                v1 = colorStateList0 == null ? hll.i : hln.c(colorStateList0.getDefaultColor());
            }
        }
        else {
            v1 = hll.i;
        }
        int v2 = typedArray0.getInt(6, -1);
        htw0.e(typedArray0.getChangingConfigurations());
        switch(v2) {
            case 3: {
                v3 = 3;
                break;
            }
            case -1: 
            case 5: {
                v3 = 5;
                break;
            }
            default: {
                if(v2 == 9) {
                    v3 = 9;
                }
                else {
                    switch(v2) {
                        case 14: {
                            v3 = 13;
                            break;
                        }
                        case 15: {
                            v3 = 14;
                            break;
                        }
                        case 16: {
                            v3 = 12;
                            break;
                        }
                        default: {
                            v3 = 5;
                        }
                    }
                }
            }
        }
        float f4 = f2 / resources0.getDisplayMetrics().density;
        float f5 = f3 / resources0.getDisplayMetrics().density;
        typedArray0.recycle();
        hqd hqd0 = new hqd(null, f4, f5, f, f1, v1, v3, z, 1);
        int v4 = 0;
        while(xmlResourceParser0.getEventType() != 1 && (xmlResourceParser0.getDepth() > 0 || xmlResourceParser0.getEventType() != 3)) {
            switch(xmlPullParser0.getEventType()) {
                case 2: {
                    String s = xmlPullParser0.getName();
                    if(s != null) {
                        switch(s) {
                            case "clip-path": {
                                ++v4;
                                TypedArray typedArray1 = htw0.c(resources0, resources$Theme0, attributeSet0, htx.d);
                                String s1 = htw0.d(typedArray1, 0);
                                String s2 = htw0.d(typedArray1, 1);
                                List list0 = s2 == null ? hss.a : hrf.c(htw0.c, s2);
                                typedArray1.recycle();
                                hqd0.b((s1 == null ? "" : s1), 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list0);
                                break;
                            }
                            case "group": {
                                TypedArray typedArray3 = htw0.c(resources0, resources$Theme0, attributeSet0, htx.b);
                                float f13 = htw0.a(typedArray3, "rotation", 5, 0.0f);
                                float f14 = htw0.g(typedArray3, 1);
                                float f15 = htw0.g(typedArray3, 2);
                                float f16 = htw0.a(typedArray3, "scaleX", 3, 1.0f);
                                float f17 = htw0.a(typedArray3, "scaleY", 4, 1.0f);
                                float f18 = htw0.a(typedArray3, "translateX", 6, 0.0f);
                                float f19 = htw0.a(typedArray3, "translateY", 7, 0.0f);
                                String s5 = htw0.d(typedArray3, 0);
                                typedArray3.recycle();
                                hqd0.b((s5 == null ? "" : s5), f13, f14, f15, f16, f17, f18, f19, hss.a);
                                break;
                            }
                            case "path": {
                                TypedArray typedArray2 = htw0.c(resources0, resources$Theme0, attributeSet0, htx.c);
                                if(!jxk.i(xmlPullParser0, "pathData")) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String s3 = htw0.d(typedArray2, 0);
                                String s4 = htw0.d(typedArray2, 2);
                                List list1 = s4 == null ? hss.a : hrf.c(htw0.c, s4);
                                jwu jwu0 = htw0.h(typedArray2, resources$Theme0, "fillColor", 1);
                                float f6 = htw0.a(typedArray2, "fillAlpha", 12, 1.0f);
                                switch(htw0.b(typedArray2, "strokeLineCap", 8, -1)) {
                                    case 1: {
                                        v5 = 1;
                                        break;
                                    }
                                    case 2: {
                                        v5 = 2;
                                        break;
                                    }
                                    default: {
                                        v5 = 0;
                                    }
                                }
                                switch(htw0.b(typedArray2, "strokeLineJoin", 9, -1)) {
                                    case 0: {
                                        v6 = 0;
                                        break;
                                    }
                                    case 1: {
                                        v6 = 1;
                                        break;
                                    }
                                    default: {
                                        v6 = 2;
                                    }
                                }
                                float f7 = htw0.a(typedArray2, "strokeMiterLimit", 10, 1.0f);
                                jwu jwu1 = htw0.h(typedArray2, resources$Theme0, "strokeColor", 3);
                                float f8 = htw0.a(typedArray2, "strokeAlpha", 11, 1.0f);
                                float f9 = htw0.a(typedArray2, "strokeWidth", 4, 1.0f);
                                float f10 = htw0.a(typedArray2, "trimPathEnd", 6, 1.0f);
                                float f11 = htw0.a(typedArray2, "trimPathOffset", 7, 0.0f);
                                float f12 = htw0.a(typedArray2, "trimPathStart", 5, 0.0f);
                                int v7 = htw0.b(typedArray2, "fillType", 13, 0);
                                typedArray2.recycle();
                                hqd0.c(list1, (v7 == 0 ? 0 : 1), (s3 == null ? "" : s3), hty.a(jwu0), f6, hty.a(jwu1), f8, f9, v5, v6, f7, f12, f10, f11);
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    if(ibuq.m("group", xmlPullParser0.getName())) {
                        for(int v8 = 0; v8 < v4 + 1; ++v8) {
                            hqd0.d();
                        }
                        v4 = 0;
                    }
                }
            }
            xmlResourceParser0.next();
        }
        int v9 = v | htw0.b;
        return new isj(hqd0.a(), v9);
    }

    public static final hqf b(Resources.Theme resources$Theme0, Resources resources0, int v) {
        TypedValue typedValue0 = new TypedValue();
        resources0.getValue(v, typedValue0, true);
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        hty.b(xmlResourceParser0);
        return isr.a(resources$Theme0, resources0, xmlResourceParser0, typedValue0.changingConfigurations).a;
    }

    public static final hqf c(int v, goz goz0) {
        Context context0 = (Context)goz0.h(AndroidCompositionLocals_androidKt.b);
        Resources resources0 = (Resources)goz0.h(AndroidCompositionLocals_androidKt.c);
        Resources.Theme resources$Theme0 = context0.getTheme();
        Configuration configuration0 = resources0.getConfiguration();
        int v1 = goz0.V(v) | goz0.X(resources0) | goz0.X(resources$Theme0);
        int v2 = goz0.X(configuration0) | v1;
        Object object0 = goz0.k();
        if(v2 != 0 || object0 == gop.a) {
            object0 = isr.b(resources$Theme0, resources0, v);
            goz0.R(object0);
        }
        return (hqf)object0;
    }
}

