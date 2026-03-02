import android.content.Context;

public class atnu {
    public int a;
    private final aqqk b;

    public atnu(Context context0) {
        this.b = new aqqk(context0);
    }

    public atnu(Context context0, int v) {
        this.b = new aqqk(context0);
        this.a = v;
    }

    public final void a(ProtoLiteBuilder hftp0, ghyr ghyr0) {
        if(!hqlt.a.o().at()) {
            return;
        }
        if(atnz.b) {
            ghys ghys0 = (ghys)hftp0.N_build();
            if(ghys0 == null || (ghys0.b & 16) == 0 && (ghys0.b & 0x20) == 0 && (ghys0.b & 0x40) == 0 && (ghys0.b & 0x100) == 0) {
                ((ggtj)atnz.a.i()).x("Trying to log invalid backup event.");
                return;
            }
        }
        int v = (int)hqlt.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys1 = (ghys)hftp0.b_message;
        ghys1.b |= 0x200000;
        ghys1.w = v;
        ghys ghys2 = (ghys)hftp0.N_build();
        this.b.b(ghys2, ghyr0, Long.valueOf(this.a));
    }
}

