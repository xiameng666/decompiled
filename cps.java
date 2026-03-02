import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class cps implements ibtw {
    public final XmlPullParser a;
    public final Resources b;
    public final Resources.Theme c;
    public final AttributeSet d;
    public final cie e;

    public cps(XmlPullParser xmlPullParser0, Resources resources0, Resources.Theme resources$Theme0, AttributeSet attributeSet0, cie cie0) {
        this.a = xmlPullParser0;
        this.b = resources0;
        this.c = resources$Theme0;
        this.d = attributeSet0;
        this.e = cie0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibns ibns0;
        Object object4;
        TypedArray typedArray1;
        XmlPullParser xmlPullParser0 = this.a;
        xmlPullParser0.next();
        cie cie0 = this.e;
        Object object2 = null;
        while(!cpw.a(xmlPullParser0) && (xmlPullParser0.getEventType() != 3 || !ibuq.m(xmlPullParser0.getName(), "propertyValuesHolder"))) {
            if(xmlPullParser0.getEventType() == 2 && ibuq.m(xmlPullParser0.getName(), "keyframe")) {
                AttributeSet attributeSet0 = this.d;
                Resources.Theme resources$Theme0 = this.c;
                Resources resources0 = this.b;
                int[] arr_v = cpq.f;
                if(resources$Theme0 != null) {
                    TypedArray typedArray0 = resources$Theme0.obtainStyledAttributes(attributeSet0, arr_v, 0, 0);
                    if(typedArray0 != null) {
                        typedArray1 = typedArray0;
                        goto label_16;
                    }
                }
                typedArray1 = resources0.obtainAttributes(attributeSet0, arr_v);
            label_16:
                try {
                    if(((cpr)object0) == null) {
                        Object object3 = cpv.e(typedArray1.getInt(2, 4), new int[]{typedArray1.peekValue(0).type});
                        object4 = object3 == null ? cpv.a : object3;
                    }
                    else {
                        object4 = (cpr)object0;
                    }
                    ibns0 = new ibns(cpv.c(typedArray1, typedArray1.getFloat(3, 0.0f), cpv.a(typedArray1, resources0, resources$Theme0, 1, cie0), ((cpr)object4), 0), object4);
                }
                finally {
                    typedArray1.recycle();
                }
                cot cot0 = (cot)ibns0.a;
                cpr cpr0 = (cpr)ibns0.b;
                if(object2 == null) {
                    object2 = cpr0;
                }
                ((List)object1).add(cot0);
            }
            xmlPullParser0.next();
        }
        if(object2 == null) {
            return ((cpr)object0) == null ? cpv.a : ((cpr)object0);
        }
        return object2;
    }
}

