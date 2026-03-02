import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;

public final class dngt implements View.OnClickListener {
    public final String a;
    public final String b;
    public final String c;
    public final dnhi d;

    public dngt(String s, String s1, String s2, dnhi dnhi0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = dnhi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = frxe.a(AppContextProvider.a(), this.a, this.b, null, this.c);
        this.d.a.startActivity(intent0);
    }
}

