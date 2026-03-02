import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dmuq implements View.OnClickListener {
    public final dmuy a;
    public final Uri b;

    public dmuq(dmuy dmuy0, Uri uri0) {
        this.a = dmuy0;
        this.b = uri0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvv fhvv0 = fhvv.d();
        this.a.h.a(fhvv0, view0);
        this.a.e.d(hami.D);
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(this.b);
        this.a.a.startActivity(intent0);
    }
}

