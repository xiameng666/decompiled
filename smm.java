import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.setupwizardlib.TemplateLayout;
import com.android.setupwizardlib.view.HeaderRecyclerView;

@Deprecated
public final class smm implements smk {
    public final TemplateLayout a;
    public final RecyclerView b;
    public View c;
    public Drawable d;
    private final slp e;
    private Drawable f;
    private int g;
    private int h;

    public smm(TemplateLayout templateLayout0, RecyclerView recyclerView0) {
        this.a = templateLayout0;
        slp slp0 = new slp(templateLayout0.getContext());
        this.e = slp0;
        this.b = recyclerView0;
        templateLayout0.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        if((recyclerView0 instanceof HeaderRecyclerView)) {
            this.c = ((HeaderRecyclerView)recyclerView0).ac;
        }
        recyclerView0.A(slp0);
    }

    public final void a(tk tk0) {
        this.b.an(tk0);
    }

    public final void b(int v, int v1) {
        this.g = v;
        this.h = v1;
        this.c();
    }

    public final void c() {
        TemplateLayout templateLayout0 = this.a;
        if(templateLayout0.isLayoutDirectionResolved()) {
            if(this.f == null) {
                this.f = this.e.a;
            }
            Drawable drawable0 = this.f;
            int v = this.g;
            int v1 = this.h;
            InsetDrawable insetDrawable0 = templateLayout0.getLayoutDirection() == 1 ? new InsetDrawable(drawable0, v1, 0, v, 0) : new InsetDrawable(drawable0, v, 0, v1, 0);
            this.d = insetDrawable0;
            this.e.c(insetDrawable0);
        }
    }
}

