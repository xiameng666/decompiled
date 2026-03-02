import android.widget.Button;

public final class bvxc implements Runnable {
    public final bvxe a;
    public final hgmi b;
    public final Button c;

    public bvxc(bvxe bvxe0, hgmi hgmi0, Button button0) {
        this.a = bvxe0;
        this.b = hgmi0;
        this.c = button0;
    }

    @Override
    public final void run() {
        hgmi hgmi0 = this.b;
        boolean z = true;
        bvxe bvxe0 = this.a;
        Button button0 = this.c;
        if((hgmi0.b & 1) == 0) {
            z = false;
        }
        else if(!bvxe0.a.b((hgmi0.d == null ? hgme.a : hgmi0.d), button0)) {
            button0.setVisibility(8);
            z = false;
        }
        bwbx.b(button0, new bvxd(bvxe0, hgmi0, z, button0));
    }
}

