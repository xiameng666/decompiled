import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;

public final class dnfs implements View.OnClickListener {
    public final dngl a;
    public final String b;
    public final String c;
    public final String d;

    public dnfs(dngl dngl0, String s, String s1, String s2) {
        this.a = dngl0;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = frxe.a(AppContextProvider.a(), this.b, this.c, null, this.d);
        this.a.a.startActivity(intent0);
    }
}

