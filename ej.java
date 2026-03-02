import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

final class ej implements LayoutInflater.Factory2 {
    final fm a;

    public ej(fm fm0) {
        this.a = fm0;
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        fv fv0;
        du du0 = null;
        if(FragmentContainerView.class.getName().equals(s)) {
            return new FragmentContainerView(context0, attributeSet0, this.a);
        }
        if("fragment".equals(s)) {
            String s1 = attributeSet0.getAttributeValue(null, "class");
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, bu.a);
            int v = 0;
            if(s1 == null) {
                s1 = typedArray0.getString(0);
            }
            int v1 = typedArray0.getResourceId(1, -1);
            String s2 = typedArray0.getString(2);
            typedArray0.recycle();
            if(s1 != null) {
                ClassLoader classLoader0 = context0.getClassLoader();
                try {
                    Class class0 = eg.a(classLoader0, s1);
                    if(du.class.isAssignableFrom(class0)) {
                        goto label_16;
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                }
                return null;
            label_16:
                if(view0 != null) {
                    v = view0.getId();
                }
                if(v == -1) {
                    if(v1 == -1) {
                        if(s2 == null) {
                            throw new IllegalArgumentException(a.k(s1, attributeSet0, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                        }
                        v = -1;
                        v1 = -1;
                    }
                    else {
                        v = -1;
                    }
                }
                if(v1 != -1) {
                    du0 = this.a.g(v1);
                }
                if(du0 == null && s2 != null) {
                    du0 = this.a.h(s2);
                }
                if(du0 == null && v != -1) {
                    du0 = this.a.g(v);
                }
                if(du0 == null) {
                    context0.getClassLoader();
                    du du1 = this.a.l().b(s1);
                    du1.u = true;
                    du1.E = v1 == 0 ? v : v1;
                    du1.F = v;
                    du1.G = s2;
                    du1.v = true;
                    du1.A = this.a;
                    du1.B = this.a.q;
                    du1.onInflate(this.a.q.c, attributeSet0, du1.g);
                    fv0 = this.a.m(du1);
                    if(fm.ar(2)) {
                        Objects.toString(du1);
                    }
                    du0 = du1;
                }
                else {
                    if(du0.v) {
                        throw new IllegalArgumentException(attributeSet0.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(v1) + ", tag " + s2 + ", or parent id 0x" + Integer.toHexString(v) + " with another fragment for " + s1);
                    }
                    du0.v = true;
                    du0.A = this.a;
                    du0.B = this.a.q;
                    du0.onInflate(this.a.q.c, attributeSet0, du0.g);
                    fv0 = this.a.n(du0);
                    if(fm.ar(2)) {
                        Objects.toString(du0);
                    }
                }
                ibuq.f(du0, "fragment");
                llo llo0 = new llo(du0, ((ViewGroup)view0));
                lln.d(llo0);
                llm llm0 = lln.b(du0);
                if(llm0.b.contains(lll.d) && lln.e(llm0, du0.getClass(), llo0.getClass())) {
                    lln.c(llm0, llo0);
                }
                du0.O = (ViewGroup)view0;
                fv0.e();
                fv0.d();
                View view1 = du0.P;
                if(view1 == null) {
                    throw new IllegalStateException(a.a(s1, "Fragment ", " did not create a view."));
                }
                if(v1 != 0) {
                    view1.setId(v1);
                }
                if(du0.P.getTag() == null) {
                    du0.P.setTag(s2);
                }
                du0.P.addOnAttachStateChangeListener(new ei(this, fv0));
                return du0.P;
            }
        }
        return null;
    }

    @Override  // android.view.LayoutInflater$Factory
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.onCreateView(null, s, context0, attributeSet0);
    }
}

