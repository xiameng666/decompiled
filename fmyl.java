import android.view.View.OnClickListener;
import android.view.View;

public final class fmyl implements View.OnClickListener {
    public final fmyo a;
    public final fmga b;

    public fmyl(fmyo fmyo0, fmga fmga0) {
        this.a = fmyo0;
        this.b = fmga0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fmfw fmfw0 = this.b.k.b();
        this.a.b(fmfw0);
        flhi flhi0 = new flhi(this.a.f, this.a.b, this.b.c, new String[]{this.b.a});
        this.a.f.b.execute(flhi0);
        this.a.a();
    }
}

