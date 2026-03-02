import android.os.Bundle;
import android.view.MenuItem;

public abstract class ezbz extends ezbw {
    private skp j;

    protected abstract skp a();

    protected abstract String g();

    @Override  // ezbw
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.hL().o(true);
        skp skp0 = (skp)this.getSupportFragmentManager().h(this.g());
        this.j = skp0;
        if(skp0 == null) {
            this.j = this.a();
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.z(0x1020002, this.j, this.g());
            ca0.a();
        }
    }

    @Override  // com.google.android.chimera.android.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() != 0x102002C) {
            return false;
        }
        this.getOnBackPressedDispatcher().d();
        return true;
    }
}

