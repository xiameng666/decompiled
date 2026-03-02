import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.function.Function;

public final class arlm implements arlk {
    public static final baun a;
    public final arlj b;
    public final arlj c;
    public final Context d;
    public final hkyj e;
    public arpn f;
    public armp g;
    public Long h;
    public boolean i;
    private boolean j;

    static {
        arlm.a = aqql.a("MultiTransport");
    }

    public arlm(arlj arlj0, arlh arlh0, Context context0) {
        this.f = null;
        this.g = null;
        this.j = false;
        this.h = null;
        this.i = false;
        this.c = arlj0;
        this.d = context0;
        this.e = hkyj.b;
        arll arll0 = new arll(this);
        this.b = arll0;
        this.g = (armp)arlh0.a(arll0);
    }

    public arlm(arlj arlj0, Function function0, Context context0, boolean z) {
        this.f = null;
        this.g = null;
        this.j = false;
        this.h = null;
        this.i = false;
        this.c = arlj0;
        this.d = context0;
        this.e = hkyj.c;
        arll arll0 = new arll(this);
        this.b = arll0;
        this.f = (arpn)((arlh)function0.apply(Boolean.valueOf(z))).a(arll0);
    }

    static void a(arlm arlm0) {
        arlm0.g = null;
    }

    static void b(arlm arlm0) {
        arlm0.f = null;
    }

    private final arlk c() {
        hkyj hkyj0 = this.e;
        switch(hkyj0.ordinal()) {
            case 1: {
                return this.g;
            }
            case 2: {
                return this.f;
            }
            default: {
                throw new AssertionError("originConnectionType equals %s while getting transport." + hkyj0.name());
            }
        }
    }

    @Override  // arlk
    public final void f() {
        if(this.j) {
            arlm.a.h("MultiTransport.shutdown() has already been called. Ignoring.", new Object[0]);
            return;
        }
        this.j = true;
        arpn arpn0 = this.f;
        if(arpn0 != null) {
            arpn0.f();
        }
        armp armp0 = this.g;
        if(armp0 != null) {
            armp0.f();
        }
    }

    @Override  // arlk
    public final void g(hkyj hkyj0) {
        switch(hkyj0.ordinal()) {
            case 0: {
                arlm.a.f("Unsupported connectionType = %s", new Object[]{hkyj0.name()});
                return;
            }
            case 1: {
                armp armp0 = this.g;
                if(armp0 != null) {
                    armp0.f();
                    this.i = false;
                    this.g = null;
                    return;
                }
                break;
            }
            case 2: {
                arpn arpn0 = this.f;
                if(arpn0 != null) {
                    arpn0.f();
                    this.f = null;
                    return;
                }
                break;
            }
        }
    }

    @Override  // arlk
    public final void h(byte[] arr_b) {
        if(this.j) {
            arlm.a.h("MultiTransport.shutdownWithLastPacket() has already been called. Ignoring.", new Object[0]);
            return;
        }
        this.j = true;
        arpn arpn0 = this.f;
        if(arpn0 == null) {
            armp armp1 = this.g;
            if(armp1 != null) {
                armp1.h(arr_b);
            }
        }
        else {
            arpn0.h(arr_b);
            armp armp0 = this.g;
            if(armp0 != null) {
                armp0.f();
            }
        }
    }

    @Override  // arlk
    public final boolean i() {
        if(this.j) {
            return false;
        }
        return this.f == null || !this.f.i() ? this.g != null && this.g.i() : true;
    }

    @Override  // arlk
    public final void j() {
        arlk arlk0 = this.c();
        gftb.B(arlk0, "Transport is null while calling connect for originConnection = %s", this.e.name());
        arlk0.j();
    }

    @Override  // arlk
    public final void k(InputStream inputStream0, long v, arli arli0, hkyj hkyj0) {
        if(!hkyj0.equals(hkyj.c)) {
            throw new IllegalArgumentException(String.format("Connection type %s is not supported for sendBatchPayloadStream.", hkyj0.name()));
        }
        if(this.f == null) {
            arlm.a.f("WifiTransport is null while calling sendBatchPayloadStream()", new Object[0]);
            return;
        }
        arlm.a.j("sendBatchPayloadStream using WifiTransport.", new Object[0]);
        this.f.k(inputStream0, v, arli0, hkyj0);
    }

    @Override  // arlk
    public final void l(File file0, arli arli0) {
        arpn arpn0 = this.f;
        if(arpn0 == null) {
            arlm.a.f("WifiTransport is null while calling sendPacket() with timeout", new Object[0]);
            return;
        }
        arpn0.l(file0, arli0);
    }

    @Override  // arlk
    public final void m(File file0, long v, arli arli0) {
        arpn arpn0 = this.f;
        if(arpn0 == null) {
            arlm.a.f("Transport is null while calling sendFileWithPayloadId for originConnection = %s", new Object[]{this.e.name()});
            return;
        }
        arpn0.m(file0, v, arli0);
    }

    @Override  // arlk
    public final void n(byte[] arr_b) {
        if(this.c() == null) {
            arlm.a.f("Transport is null while calling sendPacket for originConnection = %s", new Object[]{this.e.name()});
            return;
        }
        arlk arlk0 = this.c();
        gftb.check(arlk0);
        arlk0.n(arr_b);
    }

    @Override  // arlk
    public final void o(byte[] arr_b, long v) {
        if(this.c() == null) {
            arlm.a.f("Transport is null while calling sendPacket with timeout for originConnection = %s", new Object[]{this.e.name()});
            return;
        }
        arlk arlk0 = this.c();
        gftb.check(arlk0);
        arlk0.o(arr_b, v);
    }

    @Override  // arlk
    public final void p(InputStream inputStream0, arli arli0) {
        if(this.c() == null) {
            arlm.a.f("Transport is null while calling sendPacket for originConnection = %s", new Object[]{this.e.name()});
            return;
        }
        arlk arlk0 = this.c();
        gftb.check(arlk0);
        arlk0.p(inputStream0, arli0);
    }

    @Override  // arlk
    public final void q(InputStream inputStream0, arli arli0, hkyj hkyj0) {
        switch(hkyj0.ordinal()) {
            case 0: {
                throw new IllegalArgumentException("Connection type is unspecified for sendStream.");
            }
            case 1: {
                arlm.a.j("sendStream using UsbTransport.", new Object[0]);
                armp armp0 = this.g;
                gftb.z(armp0, "UsbTransport is null while calling sendStream()");
                armp0.p(inputStream0, arli0);
                return;
            }
            case 2: {
                arlm.a.j("sendStream using WifiTransport.", new Object[0]);
                arpn arpn0 = this.f;
                gftb.z(arpn0, "WifiTransport is null while calling sendStream()");
                arpn0.p(inputStream0, arli0);
            }
        }
    }

    @Override  // arlk
    public final void r(long v, arli arli0, hkyj hkyj0) {
        if(!hkyj0.equals(hkyj.c)) {
            throw new IllegalArgumentException(String.format("Connection type is %s unspecified for sendStreamErrorPacket.", hkyj0.name()));
        }
        if(this.f == null) {
            arlm.a.f("WifiTransport is null while calling sendStreamErrorPacket()", new Object[0]);
            return;
        }
        arlm.a.j("sendStreamErrorPacket using WifiTransport.", new Object[0]);
        this.f.r(v, arli0, hkyj0);
    }

    @Override  // arlk
    public final void s(InputStream inputStream0, long v, arli arli0, hkyj hkyj0) {
        switch(hkyj0.ordinal()) {
            case 0: {
                throw new IllegalArgumentException("Connection type is unspecified for sendStreamWithPayloadId.");
            }
            case 1: {
                if(this.g == null) {
                    arlm.a.f("UsbTransport is null while calling sendStreamWithPayloadId()", new Object[0]);
                    return;
                }
                arlm.a.j("sendStreamWithPayloadId using UsbTransport.", new Object[0]);
                this.g.s(inputStream0, v, arli0, hkyj0);
                return;
            }
            case 2: {
                if(this.f == null) {
                    arlm.a.f("WifiTransport is null while calling sendStreamWithPayloadId()", new Object[0]);
                    return;
                }
                arlm.a.j("sendStreamWithPayloadId using WifiTransport.", new Object[0]);
                this.f.s(inputStream0, v, arli0, hkyj0);
            }
        }
    }

    @Override  // arlk
    public final boolean t(hkyj hkyj0) {
        switch(hkyj0.ordinal()) {
            case 1: {
                return this.g == null || !this.g.i() ? false : this.e.equals(hkyj.b) || this.i;
            }
            case 2: {
                return this.f != null && this.f.i();
            }
            default: {
                throw new IllegalStateException("ConnectionType = %s not supported" + hkyj0.name());
            }
        }
    }
}

