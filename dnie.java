import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnie implements View.OnClickListener {
    public final dnjs a;
    public final Uri b;

    public dnie(dnjs dnjs0, Uri uri0) {
        this.a = dnjs0;
        this.b = uri0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dnjs dnjs0 = this.a;
        dnjs0.i.d(hami.E);
        Uri uri0 = this.b;
        String s = uri0.toString();
        ibuq.e(s, "toString(...)");
        if(s.length() == 0) {
            ((ggtj)dnjs.a.j()).x("Empty privacy policy URL, doing nothing.");
            return;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(uri0);
        dnjs0.e.startActivity(intent0);
    }
}

