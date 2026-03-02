import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class cbrl extends lh {
    public final ibts e;

    public cbrl(ibts ibts0) {
        super(cbri.a);
        this.e = ibts0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E091C, viewGroup0, false);  // layout:select_member_item
        ibuq.e(view0, "inflate(...)");
        return new cbrk(this, view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        String s;
        ibuq.f(((cbrk)uq0), "holder");
        cbqc cbqc0 = (cbqc)this.c(v);
        ibuq.c(cbqc0);
        ibuq.f(cbqc0, "member");
        int v1 = cbqc0.b;
        TextView textView0 = ((cbrk)uq0).t;
        gvmq gvmq0 = cbqc0.a;
        textView0.setText((gvmq0.c == null ? gvmr.a : gvmq0.c).b);
        TextView textView1 = ((cbrk)uq0).u;
        if(v1) {
            s = ((cbrk)uq0).x;
        }
        else {
            s = (gvmq0.c == null ? gvmr.a : gvmq0.c).e;
            ibuq.c(s);
        }
        textView1.setText(s);
        int v2 = 0;
        textView1.setVisibility((TextUtils.isEmpty(textView1.getText()) ? 8 : 0));
        clgr clgr0 = clgp.b(((cbrk)uq0).w);
        String s1 = bapl.a("mo-cc-rp", (gvmq0.c == null ? gvmr.a : gvmq0.c).d).toString();
        ibuq.e(s1, "toString(...)");
        clgr0.c(clcg.f(s1, ckid.b, clbk.a, clbj.a)).c(0x7F080761).e(((cbrk)uq0).w);  // drawable:ic_logo_avatar_circle
        View view0 = ((cbrk)uq0).a;
        view0.setOnClickListener(new cbrj(((cbrk)uq0).B, cbqc0));
        view0.setClickable(((boolean)(v1 ^ 1)));
        view0.setEnabled(((boolean)(v1 ^ 1)));
        textView0.setTextColor((v1 == 0 ? ((cbrk)uq0).y : ((cbrk)uq0).A));
        textView1.setTextColor((v1 == 0 ? ((cbrk)uq0).z : ((cbrk)uq0).A));
        ImageView imageView0 = ((cbrk)uq0).v;
        if(1 != v1) {
            v2 = 8;
        }
        imageView0.setVisibility(v2);
    }
}

