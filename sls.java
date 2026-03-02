import android.view.ViewTreeObserver.OnPreDrawListener;
import com.android.setupwizardlib.TemplateLayout;
import j..util.Objects;

public final class sls implements ViewTreeObserver.OnPreDrawListener {
    final TemplateLayout a;

    public sls(TemplateLayout templateLayout0) {
        Objects.requireNonNull(templateLayout0);
        this.a = templateLayout0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.a.c);
        this.a.setXFraction(this.a.b);
        return true;
    }
}

