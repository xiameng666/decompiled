import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class ekkz extends tk {
    public List a;
    private static final kaj e;

    static {
        ekkz.e = kaj.a();
    }

    public ekkz() {
        this.a = new ArrayList();
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new ekky(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E08BE, viewGroup0, false));  // layout:romanesco_contact_item
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        if(v >= this.b()) {
            return;
        }
        Drawable drawable0 = ((ejyw)this.a.get(v)).b;
        ((ekky)uq0).t.setImageDrawable(drawable0);
        String s = ((ejyw)this.a.get(v)).a;
        String s1 = ekkz.e.c(s);
        ((ekky)uq0).u.setText(s1);
    }
}

