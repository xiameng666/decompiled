import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public final class bdee extends tk {
    public List a;
    public final bdef e;

    public bdee(bdef bdef0) {
        this.a = new ArrayList();
        this.e = bdef0;
    }

    @Override  // tk
    public final int b() {
        return this.a == null ? 0 : this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new bded(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0844, viewGroup0, false));  // layout:pwm_blocklist_item
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        bedc bedc0 = (bedc)this.a.get(v);
        gfsx gfsx0 = bedc0.c;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            ((bded)uq0).t.getContext();
            ((bded)uq0).t.a(((String)object0));
        }
        else if(bedc0.b().i()) {
            ((bded)uq0).t.setImageResource(0x1080093);
        }
        else {
            ((bded)uq0).t.setImageResource(0x7F080CD1);  // drawable:quantum_ic_chrome_product_vd_theme_24
        }
        ((bded)uq0).t.setImportantForAccessibility(2);
        gfsx gfsx1 = bedc0.b;
        if(gfsx1.i()) {
            Object object1 = gfsx1.d();
            ((bded)uq0).v.setText(((CharSequence)object1));
        }
        else {
            String s = bedc0.c();
            ((bded)uq0).v.setText(s);
        }
        gfsx gfsx2 = bedc0.d;
        if(gfsx2.i()) {
            TextUtils.TruncateAt textUtils$TruncateAt0 = (TextUtils.TruncateAt)gfsx2.d();
            ((bded)uq0).v.setEllipsize(textUtils$TruncateAt0);
        }
        else {
            TextUtils.TruncateAt textUtils$TruncateAt1 = bedc0.b().i() ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.START;
            ((bded)uq0).v.setEllipsize(textUtils$TruncateAt1);
        }
        bdec bdec0 = new bdec(this, bedc0);
        ((bded)uq0).u.setOnClickListener(bdec0);
    }
}

