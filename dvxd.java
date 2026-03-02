import android.view.View;
import android.widget.ImageView;

public final class dvxd implements Runnable {
    public final dvxe a;

    public dvxd(dvxe dvxe0) {
        this.a = dvxe0;
    }

    @Override
    public final void run() {
        ((ggtj)dvxj.a.h()).x("User authentication completed successfully.");
        dvxj dvxj0 = this.a.a;
        dvxj0.aH = true;
        dvxj.W(dvxj0);
        ImageView imageView0 = dvxj0.aC;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
        View view0 = dvxj0.aD;
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }
}

