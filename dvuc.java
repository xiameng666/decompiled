import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvuc implements Runnable {
    public final dvuz a;
    public final Valuable b;

    public dvuc(dvuz dvuz0, Valuable valuable0) {
        this.a = dvuz0;
        this.b = valuable0;
    }

    @Override
    public final void run() {
        dvuz dvuz0 = this.a;
        xob xob0 = (xob)dvuz0.A.getContext();
        if(xob0 == null) {
            ((ggtj)dvuz.a.j()).x("Not fetching images in background when provided activity is null");
            return;
        }
        int v = glwy.a(hwkt.f());
        evql evql0 = dvuz0.h(this.b, v);
        evql0.x(xob0, new dvuy(dvuz0, this.b, xob0));
        evql0.u(xob0, new dvud(dvuz0, this.b, xob0));
    }
}

