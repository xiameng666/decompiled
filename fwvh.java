import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fwvh implements gxbl, gxcz {
    gxdb a;
    public boolean b;
    private final gxcy c;
    private final bblg d;
    private final bblf e;
    private final List f;
    private final fwzp g;
    private final Context h;
    private int i;
    private fuuy j;

    public fwvh(Context context0, gxcy gxcy0, fwzp fwzp0) {
        this.f = new ArrayList();
        this.a = null;
        this.j = null;
        this.b = false;
        this.h = context0;
        this.c = gxcy0;
        this.g = fwzp0;
        bblg bblg0 = new bblg("Chre_Sleep_Handler", 10);
        this.d = bblg0;
        bblg0.start();
        this.e = new bblf(bblg0);
        this.i = 3;
    }

    @Override  // gxcz
    public final void a(gxcy gxcy0, gxdb gxdb0, gxdm gxdm0) {
        synchronized(this) {
            if(gxdb0 != null) {
                int v1 = 1;
                switch(gxdm0.a) {
                    case 1: {
                        v1 = 2;
                        break;
                    }
                    case 0: 
                    case 2: {
                        break;
                    }
                    case 3: {
                        v1 = 4;
                        break;
                    }
                    case 4: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                if(v1 == 0) {
                    throw null;
                }
                if(v1 - 1 == 2) {
                    this.b();
                    gxag gxag0 = (gxag)gxdm0.a(((Parser)((ProtoLiteMessage)gxag.a).jf(7, null)));
                    if(!huwz.k() && (gxag0.b & 0x40) != 0) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxan.a).v_newBuilder();
                        gxai gxai0 = gxai.a;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gxan gxan0 = (gxan)hftp0.b_message;
                        gxai0.getClass();
                        gxan0.c = gxai0;
                        gxan0.b = 4;
                        this.d(((gxan)hftp0.N_build()));
                    }
                    gxdb0.c();
                    fwya fwya0 = new fwya(gxag0.c, gxag0.d, gxag0.k, gxag0.h, ((gxag0.b & 0x40) == 0 ? -1.0f : gxag0.i), gxag0.j, gxag0.l);
                    for(Object object0: this.f) {
                        fwvg fwvg0 = new fwvg(this, ((fuuy)object0), fwya0);
                        this.g.m(fwvg0);
                    }
                }
            }
        }
    }

    public final void b() {
        boolean z = huwz.o();
        boolean z1 = huwz.l();
        int v = this.i;
        if(v != 1 && this.b && z && z1) {
            this.i();
            return;
        }
        if(v == 1 && (!this.b || !z || !z1)) {
            this.g();
        }
    }

    public final boolean c() {
        synchronized(this) {
        }
        return this.i == 1;
    }

    final boolean d(gxan gxan0) {
        gxdb gxdb0 = this.a;
        if(gxdb0 != null) {
            gxdd gxdd0 = gxdb0.e(1, 1, ((MessageLite)gxan0), gxcx.b);
            return gxdd0 == null ? false : fwvh.l(gxdd0);
        }
        return false;
    }

    public final void e(fuuy fuuy0) {
        synchronized(this) {
            this.j = fuuy0;
        }
    }

    public static fwvh f(Context context0, fwzp fwzp0) {
        fwvh fwvh0;
        synchronized(fwvh.class) {
            gxcy gxcy0 = fwpq.a(context0);
            if(gxcy0 == null) {
                return null;
            }
            fwvh0 = new fwvh(context0, gxcy0, fwzp0);
            fwvh0.c.f(0x476F6F676C00100FL, fwvh0, fwvh0.e);
        }
        return fwvh0;
    }

    private final void g() {
        synchronized(this) {
            gxdb gxdb0 = this.c.b(0x476F6F676C00100FL);
            this.a = gxdb0;
            if(gxdb0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxan.a).v_newBuilder();
                gxaj gxaj0 = gxaj.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gxan gxan0 = (gxan)hftp0.b_message;
                gxaj0.getClass();
                gxan0.c = gxaj0;
                gxan0.b = 2;
                this.d(((gxan)hftp0.N_build()));
                gftb.check(this.a);
                this.a.i(this);
            }
            fuuy fuuy0 = this.j;
            if(fuuy0 != null) {
                this.f.remove(fuuy0);
            }
            this.a = null;
            this.i = 2;
        }
    }

    private final void h() {
        gxdb gxdb0 = this.a;
        if(gxdb0 != null) {
            gxdb0.i(this);
            this.a = null;
            fuuy fuuy0 = this.j;
            if(fuuy0 != null) {
                this.f.remove(fuuy0);
            }
        }
        this.i = 2;
    }

    private final void i() {
        synchronized(this) {
            gxdb gxdb0 = this.c.b(0x476F6F676C00100FL);
            this.a = gxdb0;
            if(gxdb0 != null) {
                gxdb0.h(this, this.e);
                fuyt fuyt0 = fuyt.a(this.h);
                gxan gxan0 = gxan.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxan0).v_newBuilder();
                gxam gxam0 = gxam.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gxan gxan1 = (gxan)hftp0.b_message;
                gxam0.getClass();
                gxan1.c = gxam0;
                gxan1.b = 1;
                if(!this.d(((gxan)hftp0.N_build()))) {
                    goto label_50;
                }
                gwov gwov0 = gwov.a;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwov0).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gwov)hftp1.b_message).c = 3;
                ((gwov)hftp1.b_message).b |= 1;
                fuyt0.h(((gwov)hftp1.N_build()));
                fuuy fuuy0 = this.j;
                if(fuuy0 != null) {
                    List list0 = this.f;
                    if(!list0.contains(fuuy0)) {
                        list0.add(this.j);
                    }
                }
                this.i = 1;
                if(huwz.k()) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxan0).v_newBuilder();
                    gxal gxal0 = gxal.a;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gxan gxan2 = (gxan)hftp2.b_message;
                    gxal0.getClass();
                    gxan2.c = gxal0;
                    gxan2.b = 3;
                    if(this.d(((gxan)hftp2.N_build()))) {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwov0).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((gwov)hftp3.b_message).c = 4;
                        ((gwov)hftp3.b_message).b |= 1;
                        fuyt0.h(((gwov)hftp3.N_build()));
                        return;
                    label_50:
                        this.a = null;
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gwov.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ((gwov)hftp4.b_message).c = 5;
                        ((gwov)hftp4.b_message).b |= 1;
                        fuyt0.h(((gwov)hftp4.N_build()));
                    }
                }
            }
        }
    }

    @Override  // gxbl
    public final void j() {
        synchronized(this) {
            this.b();
        }
    }

    @Override  // gxbl
    public final void k(int v) {
        synchronized(this) {
            this.h();
        }
    }

    private static final boolean l(gxdd gxdd0) {
        try {
            if(((int)(((Integer)gxdd0.get(1L, TimeUnit.SECONDS)))) == 0) {
                return true;
            }
        }
        catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
        }
        return false;
    }

    @Override  // gxbl
    public final void r() {
        synchronized(this) {
            this.h();
        }
    }
}

