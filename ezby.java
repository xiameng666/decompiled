import android.os.Bundle;
import android.view.MenuItem;

public abstract class ezby extends ezbx {
    private skp k;

    protected abstract skp a();

    protected abstract String i();

    @Override  // ezbx
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getActionBar().setDisplayHomeAsUpEnabled(true);
        skp skp0 = (skp)this.getSupportFragmentManager().h(this.i());
        this.k = skp0;
        if(skp0 == null) {
            this.k = this.a();
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.z(0x7F0B0FE4, this.k, this.i());  // id:content_frame
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

