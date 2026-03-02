import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;

public final class aqaq implements View.OnClickListener {
    public final Context a;
    public final String b;
    public final gfsx c;
    public final aoam d;
    public final ando e;
    public final amny f;

    public aqaq(Context context0, String s, gfsx gfsx0, aoam aoam0, ando ando0, amny amny0) {
        this.a = context0;
        this.b = s;
        this.c = gfsx0;
        this.d = aoam0;
        this.e = ando0;
        this.f = amny0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Context context0 = this.a;
        if(context0 != null) {
            ClipboardManager clipboardManager0 = (ClipboardManager)context0.getSystemService("clipboard");
            if(clipboardManager0 != null) {
                gfsx gfsx0 = this.c;
                clipboardManager0.setPrimaryClip(ClipData.newPlainText(this.b, this.b));
                if(gfsx0.i()) {
                    aqar aqar0 = new aqar(gfsx0, this.e, this.f);
                    this.d.Z(((gful_cronetEngineProvider)aqar0));
                }
            }
        }
    }
}

