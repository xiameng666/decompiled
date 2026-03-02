import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import java.io.IOException;
import java.util.List;

public final class eqcp {
    public static final erqc a;
    public final eqcq b;
    private final bnbj c;
    private ParcelFileDescriptor[] d;
    private ParcelFileDescriptor[] e;
    private epyx f;

    static {
        eqcp.a = new erqc(new String[]{"D2D", "SourceFidoController"});
    }

    public eqcp(Context context0, eqcq eqcq0) {
        eqrg eqrg0 = hyhp.j() ? new eqrg() : new bnbs(context0);
        super();
        this.b = eqcq0;
        this.c = eqrg0;
    }

    public final void a() {
        epyx epyx0 = this.f;
        if(epyx0 != null) {
            epyx0.a();
        }
        epyx.b(this.d);
        epyx.b(this.e);
    }

    public final void b(SourceStartDirectTransferOptions sourceStartDirectTransferOptions0) {
        try {
            this.d = ParcelFileDescriptor.createPipe();
            this.e = ParcelFileDescriptor.createPipe();
            epyx epyx0 = new epyx(this.b, this.e[0], this.d[1]);
            this.f = epyx0;
            epyx0.c();
            this.c.b(sourceStartDirectTransferOptions0, this.d[0], this.e[1]).z(new eqcn(this));
        }
        catch(IOException iOException0) {
            eqcp.a.l(iOException0);
            this.b.a(10701, "Creating pipe failed", null);
        }
    }

    public final void c(List list0) {
        this.b(new SourceStartDirectTransferOptions(eqsh.j(list0)));
    }

    public final void d(List list0) {
        this.b(new SourceStartDirectTransferOptions(1, true, eqsh.j(list0), true, "Quick Start"));
    }

    public final void e(byte[] arr_b) {
        epyx epyx0 = this.f;
        if(epyx0 != null) {
            epyx0.d(arr_b);
        }
    }
}

