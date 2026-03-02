import android.content.res.Resources.NotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import j..util.Objects;
import java.lang.ref.WeakReference;

public final class aavp {
    public WeakReference a;
    public WeakReference b;
    public long c;
    public final bbng d;
    private final Handler e;

    public aavp(bbng bbng0) {
        this.a = new WeakReference(null);
        this.b = new WeakReference(null);
        this.c = 0L;
        this.d = bbng0;
        this.e = new clht(Looper.getMainLooper());
    }

    public final fyxp a() {
        return (fyxp)this.a.get();
    }

    // Detected as a lambda impl.
    public final void b() {
        this.d();
        fyxp fyxp0 = this.a();
        if(fyxp0 != null && fyxp0.m()) {
            fyxp0.e();
        }
    }

    public final void c(View view0, int v, int v1, View.OnClickListener view$OnClickListener0) {
        int v2 = 0;
        int v3 = v1 == 0 ? 1 : 0;
        if(1 != v3) {
            v2 = -2;
        }
        fyxp fyxp0 = fyxp.s(view0, v, v2);
        TextView textView0 = (TextView)fyxp0.j.findViewById(0x7F0B2078);  // id:snackbar_text
        if(textView0 != null) {
            fyxp0.x(cchs.a(view0.getContext(), 0x7F0402C9, 0x7F0607A8));  // attr:colorOnBackground
            textView0.setTextColor(cchs.a(view0.getContext(), 0x1010031, 0x7F060814));  // color:google_white
        }
        if(v1 != 0) {
            fyxp0.A(v1, view$OnClickListener0);
            try {
                fyxp0.w(cchs.a(view0.getContext(), 0x7F04012E, 0x7F0606C2));  // attr:asLegacyHighlight300
            }
            catch(Resources.NotFoundException unused_ex) {
            }
        }
        if(v3 == 0 && (textView0 != null && (textView0.getParent() instanceof ViewGroup))) {
            LayoutInflater.from(view0.getContext()).inflate(0x7F0E00E6, ((ViewGroup)textView0.getParent()), true);  // layout:as_snackbar_close_button
            ((ImageButton)fyxp0.j.findViewById(0x7F0B2076)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                this.d();
                fyxp fyxp0 = this.a();
                if(fyxp0 != null && fyxp0.m()) {
                    fyxp0.e();
                }
            });
        }
        fyxp0.y(new aavo(this));
        this.a = new WeakReference(fyxp0);
        fyxp0.j.setImportantForAccessibility(1);
        fyxp0.j.setAccessibilityLiveRegion(1);
        this.d();
        Objects.requireNonNull(fyxp0);
        aavn aavn0 = new aavn(fyxp0);
        this.b = new WeakReference(aavn0);
        this.e.postDelayed(aavn0, 500L);
    }

    private final void d() {
        Runnable runnable0 = (Runnable)this.b.get();
        if(runnable0 != null) {
            this.e.removeCallbacks(runnable0);
        }
    }
}

