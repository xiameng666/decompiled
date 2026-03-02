import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

public final class epzz extends azts {
    public final eqjb a;

    public epzz(Context context0) {
        super(context0, epvk.b, azsx.s, aztr_settings.a);
        this.a = eqjb.b();
    }

    public final eqih e(epzo epzo0) {
        return new eqig(new eqkn(this, epzo0));
    }

    public final evql f(ConnectionRequest connectionRequest0, epzo epzo0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{epvj.d};
        azzc0.a = new eqjs(this, connectionRequest0, epzo0);
        azzc0.d = 0x50E8;
        evql evql0 = this.jn(azzc0.a());
        evql0.b(new eqjz(this));
        return evql0;
    }

    public final evql g() {
        this.j("source-bootstrap-api");
        azzc azzc0 = new azzc();
        azzc0.a = new eqka();
        azzc0.d = 0x50EC;
        return this.jn(azzc0.a());
    }

    public final evql h(BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyk epyk0) {
        azzc azzc0 = new azzc();
        azzc0.a = new eqjt(this, bootstrapConfigurations0, arr_parcelFileDescriptor, epyk0);
        azzc0.d = 0x50EE;
        evql evql0 = this.jn(azzc0.a());
        evql0.b(new eqju(this));
        evql0.A(new eqki(this));
        return evql0;
    }

    public final void i(String s) {
        (this.a.d(s) ? this.a.c(this, s) : evrg.d(null)).z(new eqkb(this, s));
    }

    public final void j(String s) {
        this.a.c(this, s);
    }

    public final void k(eqcr eqcr0) {
        azzc azzc0 = new azzc();
        azzc0.a = new eqkf(eqcr0);
        azzc0.d = 20710;
        this.jn(azzc0.a()).b(new eqkg(this));
    }

    public final void l() {
        this.j("source-bootstrap-scan");
        azzc azzc0 = new azzc();
        azzc0.a = new eqjw();
        azzc0.d = 0x50E7;
        this.jn(azzc0.a());
    }
}

