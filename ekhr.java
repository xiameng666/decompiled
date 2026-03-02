import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class ekhr extends tk {
    public final ekia a;
    public List e;
    private static final kaj f;
    private final ejyv g;
    private final Context h;

    static {
        ekhr.f = kaj.a();
    }

    public ekhr(ekia ekia0, Context context0) {
        this.a = ekia0;
        this.g = ejyv.d(context0);
        this.h = context0;
        this.e = new ArrayList();
    }

    @Override  // tk
    public final int b() {
        return this.e.size() + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        return v == 0 ? 0 : 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        return v == 0 ? new ekhq(layoutInflater0.inflate(0x7F0E08C4, viewGroup0, false)) : new ekhp(layoutInflater0.inflate(0x7F0E08BE, viewGroup0, false));  // layout:romanesco_contacts_restore_contacts_summary
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        if(v < this.b()) {
            if(v == 0) {
                int v1 = this.g.b();
                if(v1 != 0) {
                    Resources resources0 = this.h.getResources();
                    ((ekhq)uq0).t.setText(new SpannableString(Html.fromHtml(resources0.getQuantityString(0x7F13006D, v1, new Object[]{v1})).toString()).toString());  // plurals:romanesco_restore_backup_contacts_count
                }
            }
            else if(v > 0) {
                Drawable drawable0 = ((ejyw)this.e.get(v - 1)).b;
                ((ekhp)uq0).t.setImageDrawable(drawable0);
                String s = ((ejyw)this.e.get(v - 1)).a;
                String s1 = ekhr.f.c(s);
                ((ekhp)uq0).u.setText(s1);
            }
        }
    }
}

