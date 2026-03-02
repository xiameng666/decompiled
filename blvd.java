import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;

public final class blvd extends du {
    public static final int a;
    private static final bboh b;
    private bluy c;

    static {
        blvd.b = bnaa.e("ScreenLockChallenge");
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        Intent intent0 = ((KeyguardManager)this.getContext().getSystemService("keyguard")).createConfirmDeviceCredentialIntent(this.getArguments().getString("title"), this.getArguments().getString("description"));
        if(intent0 != null && this.isAdded()) {
            this.startActivityForResult(intent0, 10);
        }
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 10) {
            switch(v1) {
                case -1: {
                    ((ggtj)blvd.b.h()).x("Screen lock challenge resolved! continue key signing.");
                    this.c.c.ii(new blux(3, null));
                    return;
                }
                case 0: {
                    ((ggtj)blvd.b.h()).x("User cancelled the screen lock challenge.");
                    this.c.c.ii(new blux(16));
                    return;
                }
                default: {
                    ((ggtj)blvd.b.i()).x("Unknown error occurred for screen lock challenge.");
                    this.c.c.ii(new blux(8));
                }
            }
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
        this.c = (bluy)new lso(((xnz)this.requireContext())).a(bluy.class);
    }
}

