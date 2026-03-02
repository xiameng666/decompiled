import android.view.View;
import android.widget.ImageView;

public final class dvsf implements Runnable {
    public final dvsg a;

    public dvsf(dvsg dvsg0) {
        this.a = dvsg0;
    }

    @Override
    public final void run() {
        ((ggtj)dvsn.a.h()).x("User authentication completed successfully.");
        dvsn dvsn0 = this.a.a;
        dvsn0.aQ = true;
        dvsn.T(dvsn0);
        ImageView imageView0 = dvsn0.aJ;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
        View view0 = dvsn0.aK;
        if(view0 != null) {
            view0.setVisibility(8);
        }
    }
}

