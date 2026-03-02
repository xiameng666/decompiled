import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.widget.Toast;

public final class fbzw extends gcys {
    public final Context a;

    public fbzw(gevv gevv0, gdcl gdcl0) {
        super(gevv0, gdcl0.b);
        this.a = gdcl0.d;
    }

    @Override  // gcys
    protected final gcyu a() {
        return fbzy.B(this.b);
    }

    @Override  // gcys
    protected final void b() {
        Spanned spanned0 = Html.fromHtml(((gfgr)this.b.g.get(0)).f);
        Toast.makeText(this.a, spanned0, 1).show();
    }
}

