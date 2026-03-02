import android.view.View.OnClickListener;
import android.view.View;

public final class bdfi implements View.OnClickListener {
    public final bdfk a;
    public final gfsx b;
    public final gfsx c;
    public final graz d;

    public bdfi(bdfk bdfk0, gfsx gfsx0, gfsx gfsx1, graz graz0) {
        this.a = bdfk0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = graz0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.b.d();
        ibuq.f(this.d, "checkupIssueType");
        ibuq.f(this.d, "checkupIssueType");
        beqo beqo0 = ((bfrg)this.a.c).a.y();
        beqo0.k = gfsx.m(object0);
        beqo beqo1 = ((bfrg)this.a.c).a.y();
        beqo1.m = this.c;
        beqo beqo2 = ((bfrg)this.a.c).a.y();
        beqo2.l = gfsx.m(this.d);
        new bdfd().show(((bfrg)this.a.c).a.getChildFragmentManager(), "PWMCheckupResultActionsFragment");
    }
}

