import android.os.Bundle;

public abstract class ezcd extends ezbz {
    @Override  // ezbz
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getOnBackPressedDispatcher().c(this, new ezcc(this));
    }
}

