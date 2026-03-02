import android.content.res.Resources.NotFoundException;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class dlai {
    public static final Object a;
    public WeakReference b;
    private final dkzw c;
    private final WeakReference d;

    static {
        dlai.a = new Object();
    }

    public dlai(lps lps0, View view0, dkzw dkzw0) {
        this.b = null;
        this.d = new WeakReference(view0);
        this.c = dkzw0;
        cchv.a(lps0.getLifecycle(), () -> synchronized(dlai.a) {
            WeakReference weakReference0 = this.b;
            if(weakReference0 != null) {
                fyxp fyxp0 = (fyxp)weakReference0.get();
                if(fyxp0 != null && fyxp0.m()) {
                    fyxp0.e();
                }
            }
        });
    }

    // Detected as a lambda impl.
    public final void a() {
        synchronized(dlai.a) {
            WeakReference weakReference0 = this.b;
            if(weakReference0 != null) {
                fyxp fyxp0 = (fyxp)weakReference0.get();
                if(fyxp0 != null && fyxp0.m()) {
                    fyxp0.e();
                }
            }
        }
    }

    public final void b(int v, int v1, View.OnClickListener view$OnClickListener0) {
        View view0 = (View)this.d.get();
        if(view0 != null) {
            fyxp fyxp0 = fyxp.s(view0, v, -2);
            fyxp0.p(0x7F0B2075);  // id:snackbar_anchor
            TextView textView0 = (TextView)fyxp0.j.findViewById(0x7F0B2078);  // id:snackbar_text
            if(textView0 != null && !this.c.a()) {
                fyxp0.x(cchs.a(view0.getContext(), 0x7F040072, 0x7F0607A8));  // attr:actionBarOnBackground
                textView0.setTextColor(cchs.a(view0.getContext(), 0x7F04006A, 0x7F060814));  // attr:actionBarBackground
            }
            fyxp0.A(v1, view$OnClickListener0);
            try {
                if(!this.c.a()) {
                    fyxp0.w(cchs.a(view0.getContext(), 0x7F040071, 0x7F0606C2));  // attr:actionBarLegacyHighlight300
                }
            }
            catch(Resources.NotFoundException unused_ex) {
            }
            fyxp0.y(new dlah(this));
            synchronized(dlai.a) {
                this.b = new WeakReference(fyxp0);
                fyxp0.j.setImportantForAccessibility(1);
                kfe.m(fyxp0.j);
                fyxp0.i();
            }
        }
    }
}

