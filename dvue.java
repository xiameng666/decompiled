import android.view.View.OnClickListener;
import android.view.View;

public final class dvue implements View.OnClickListener {
    public final dvuz a;
    public final String b;

    public dvue(dvuz dvuz0, String s) {
        this.a = dvuz0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gmcd gmcd0 = this.a.h.a.b().b(new dybj(this.b), new bblp(1, 10));
        this.a.T.add(gmcd0);
        this.a.d.setVisibility(8);
    }
}

