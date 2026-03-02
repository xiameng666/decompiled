import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class mg extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] arr_class = {Context.class};
        mg.a = arr_class;
        mg.b = arr_class;
    }

    public mg(Context context0) {
        super(context0);
        this.e = context0;
        Object[] arr_object = {context0};
        this.c = arr_object;
        this.d = arr_object;
    }

    public final Object a(Object object0) {
        return (object0 instanceof Activity) || !(object0 instanceof ContextWrapper) ? object0 : this.a(((ContextWrapper)object0).getBaseContext());
    }

    private final void b(XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Menu menu0) {
        XmlPullParser xmlPullParser1;
        mf mf0 = new mf(this, menu0);
        int v = xmlPullParser0.getEventType();
        do {
            if(v == 2) {
                String s = xmlPullParser0.getName();
                if(!s.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + s);
                }
                v = xmlPullParser0.next();
                break;
            }
            v = xmlPullParser0.next();
        }
        while(v != 1);
        Object object0 = null;
        boolean z = false;
        boolean z1 = false;
        while(!z1) {
            if(v == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            switch(v) {
                case 2: {
                    if(z) {
                        xmlPullParser1 = xmlPullParser0;
                    }
                    else {
                        String s1 = xmlPullParser0.getName();
                        if(s1.equals("group")) {
                            TypedArray typedArray0 = mf0.F.e.obtainStyledAttributes(attributeSet0, ku.q);
                            mf0.b = typedArray0.getResourceId(1, 0);
                            mf0.c = typedArray0.getInt(3, 0);
                            mf0.d = typedArray0.getInt(4, 0);
                            mf0.e = typedArray0.getInt(5, 0);
                            mf0.f = typedArray0.getBoolean(2, true);
                            mf0.g = typedArray0.getBoolean(0, true);
                            typedArray0.recycle();
                            xmlPullParser1 = xmlPullParser0;
                            z = false;
                            break;
                        }
                        else if(s1.equals("item")) {
                            mg mg0 = mf0.F;
                            wi wi0 = wi.k(mg0.e, attributeSet0, ku.r);
                            mf0.i = wi0.f(2, 0);
                            int v1 = wi0.c(5, mf0.c);
                            mf0.j = ((char)wi0.c(6, mf0.d)) | v1 & 0xFFFF0000;
                            mf0.k = wi0.m(7);
                            mf0.l = wi0.m(8);
                            mf0.m = wi0.f(0, 0);
                            mf0.n = mf.e(wi0.n(9));
                            mf0.o = wi0.c(16, 0x1000);
                            mf0.p = mf.e(wi0.n(10));
                            mf0.q = wi0.c(20, 0x1000);
                            mf0.r = wi0.q(11) ? wi0.p(11, false) : mf0.e;
                            mf0.s = wi0.p(3, false);
                            mf0.t = wi0.p(4, mf0.f);
                            mf0.u = wi0.p(1, mf0.g);
                            mf0.v = wi0.c(21, -1);
                            mf0.z = wi0.n(12);
                            mf0.w = wi0.f(13, 0);
                            mf0.x = wi0.n(15);
                            mf0.y = wi0.n(14);
                            String s2 = mf0.y;
                            if(s2 != null) {
                                if(mf0.w == 0 && mf0.x == null) {
                                    mf0.A = (kdm)mf0.b(s2, mg.b, mg0.d);
                                    goto label_66;
                                }
                                else {
                                    Log.w("SupportMenuInflater", "Ignoring attribute \'actionProviderClass\'. Action view already specified.");
                                }
                            }
                            mf0.A = null;
                        label_66:
                            mf0.B = wi0.m(17);
                            mf0.C = wi0.m(22);
                            mf0.E = wi0.q(19) ? rg.a(wi0.c(19, -1), mf0.E) : null;
                            mf0.D = wi0.q(18) ? wi0.g(18) : null;
                            wi0.o();
                            mf0.h = false;
                            xmlPullParser1 = xmlPullParser0;
                            z = false;
                            break;
                        }
                        else if(s1.equals("menu")) {
                            xmlPullParser1 = xmlPullParser0;
                            this.b(xmlPullParser1, attributeSet0, mf0.a());
                            z = false;
                            break;
                        }
                        else {
                            xmlPullParser1 = xmlPullParser0;
                            object0 = s1;
                        }
                    }
                    z = true;
                    break;
                }
                case 3: {
                    String s3 = xmlPullParser0.getName();
                    if(z) {
                        if(s3.equals(object0)) {
                            xmlPullParser1 = xmlPullParser0;
                            object0 = null;
                            z = false;
                            break;
                        }
                        else {
                            z = true;
                            goto label_100;
                        }
                        goto label_99;
                    }
                    else {
                    label_99:
                        z = false;
                    }
                label_100:
                    if(s3.equals("group")) {
                        mf0.c();
                    }
                    else if(!s3.equals("item")) {
                        if(s3.equals("menu")) {
                            xmlPullParser1 = xmlPullParser0;
                            z1 = true;
                            break;
                        }
                    }
                    else if(!mf0.h) {
                        if(mf0.A != null && mf0.A.c()) {
                            mf0.a();
                        }
                        else {
                            mf0.h = true;
                            mf0.d(mf0.a.add(mf0.b, mf0.i, mf0.j, mf0.k));
                        }
                    }
                    xmlPullParser1 = xmlPullParser0;
                    break;
                }
                default: {
                    xmlPullParser1 = xmlPullParser0;
                }
            }
            v = xmlPullParser1.next();
            continue;
        }
    }

    @Override  // android.view.MenuInflater
    public final void inflate(int v, Menu menu0) {
        XmlResourceParser xmlResourceParser0;
        if((menu0 instanceof jyb)) {
            try {
                try {
                    xmlResourceParser0 = null;
                    boolean z = false;
                    xmlResourceParser0 = this.e.getResources().getLayout(v);
                    AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                    if((menu0 instanceof na) && !((na)menu0).h) {
                        ((na)menu0).u();
                        z = true;
                    }
                    this.b(xmlResourceParser0, attributeSet0, menu0);
                }
                catch(XmlPullParserException xmlPullParserException0) {
                    throw new InflateException("Error inflating menu XML", xmlPullParserException0);
                }
                catch(IOException iOException0) {
                    throw new InflateException("Error inflating menu XML", iOException0);
                }
            }
            catch(Throwable throwable0) {
                if(z) {
                    ((na)menu0).t();
                }
                if(xmlResourceParser0 != null) {
                    xmlResourceParser0.close();
                }
                throw throwable0;
            }
            if(z) {
                ((na)menu0).t();
            }
            if(xmlResourceParser0 != null) {
                xmlResourceParser0.close();
            }
            return;
        }
        super.inflate(v, menu0);
    }
}

