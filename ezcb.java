import android.os.Bundle;

public abstract class ezcb extends ezby {
    @Override  // ezby
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getOnBackPressedDispatcher().c(this, new ezca(this));
    }
}

