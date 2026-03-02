import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;

public final class dnig implements View.OnClickListener {
    public final String a;
    public final String b;
    public final String c;
    public final dnjs d;

    public dnig(String s, String s1, String s2, dnjs dnjs0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = dnjs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = frxe.a(AppContextProvider.a(), this.a, this.b, null, this.c);
        ibuq.e(intent0, "getAppIntent(...)");
        this.d.e.startActivity(intent0);
    }
}

