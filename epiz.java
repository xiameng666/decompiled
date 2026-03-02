import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class epiz implements View.OnClickListener {
    public final epja a;

    public epiz(epja epja0) {
        this.a = epja0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ((ggtj)epit.a.h()).x("Clicked button to set screen lock");
        this.a.requireContext().startActivity(new Intent("android.settings.BIOMETRIC_ENROLL").putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", 0x800F));
    }
}

