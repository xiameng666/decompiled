import android.view.View.OnClickListener;
import android.view.View;

public final class dvuk implements View.OnClickListener {
    public final dvuz a;
    public final String b;
    public final guvt c;

    public dvuk(dvuz dvuz0, String s, guvt guvt0) {
        this.a = dvuz0;
        this.b = s;
        this.c = guvt0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        guvs guvs0 = guvs.b(this.c.c) == null ? guvs.c : guvs.b(this.c.c);
        gmcd gmcd0 = this.a.h.a.b().b(new dybc(this.b, guvs0), new bblp(1, 10));
        this.a.T.add(gmcd0);
        this.a.d.setVisibility(8);
    }
}

