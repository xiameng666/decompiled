import android.content.Context;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.util.ArrayList;

public final class dvuw implements View.OnClickListener {
    public final dvuz a;
    public final xob b;
    public final Context c;
    public final Valuable d;
    public final gged_interceptors e;

    public dvuw(dvuz dvuz0, xob xob0, Context context0, Valuable valuable0, gged_interceptors gged0) {
        this.a = dvuz0;
        this.b = xob0;
        this.c = context0;
        this.d = valuable0;
        this.e = gged0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = this.e;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(ftqe.a(((MessageLite)(((gtyt)gged0.get(v1))))));
        }
        Intent intent0 = new Intent("com.google.android.gms.pay.pass.valuable.view.detail.VIEW_VALUABLE_FIELD_UPDATES").setClassName(this.c, "com.google.android.gms.pay.main.PayActivity").putExtra("VALUABLE", this.d).putParcelableArrayListExtra("FIELD_UPDATE_INFOS", arrayList0);
        this.b.startActivity(intent0);
        this.a.i.b().b(new dxzd(this.d.b), gmap.a);
        this.a.d.setVisibility(8);
        this.a.B.l(((Valuable)this.a.r.d()), 9, 4);
    }
}

