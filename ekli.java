import android.accounts.Account;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class ekli implements View.OnClickListener {
    public final ekln a;

    public ekli(ekln ekln0) {
        this.a = ekln0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Account account0 = this.a.a;
        azor azor0 = new azor();
        azor0.a = account0;
        azor0.b(null);
        azor0.e();
        azor0.c(ggia.d(new String[]{"com.google"}));
        azor0.d();
        azor0.f = 1001;
        azor0.c = "Choose an account";
        Intent intent0 = azou.a(azor0.a());
        this.a.startActivityForResult(intent0, 1);
    }
}

