import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.CancellationException;

final class cthh extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    int f;
    final ctyy g;
    final cthi h;
    private Object i;

    public cthh(ctyy ctyy0, cthi cthi0, ibrl ibrl0) {
        this.g = ctyy0;
        this.h = cthi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cthh)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cthh(this.g, this.h, ibrl0);
        ibrl1.i = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        int v;
        ctyy ctyy0;
        Object object1 = ibrx.a;
        if(this.f == 0) {
            ibnx.b(object0);
            icih icih1 = (icih)this.i;
            try {
                ggtj ggtj0 = (ggtj)cthi.a.h();
                ctyy0 = this.g;
                ggtj0.B("Opening document: %s", ctyy0.c);
                String s = ctyy0.c;
                ibuq.e(s, "getDocumentId(...)");
                File file0 = cthi.g(s);
                if(!file0.exists() || file0.isDirectory()) {
                    return ibom.a;
                }
                object5 = new FileInputStream(file0);
            }
            catch(CancellationException cancellationException0) {
                ((ggtj)cthi.a.h()).B("Cancelled open document: %s", this.g.c);
                throw cancellationException0;
            }
            try {
                icih0 = icih1;
                object2 = new byte[0x80000];
                object4 = ctyy0;
                object3 = object5;
                do {
                label_25:
                    v = ((FileInputStream)object3).read(((byte[])object2));
                    if(v > 0) {
                        byte[] arr_b = v < 0x80000 ? ibpg.W(((byte[])object2), ibwt.q(0, v)) : object2;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyr.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        ByteString hfsf0 = hfxt.a(arr_b);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ctyr ctyr0 = (ctyr)hftp0.b_message;
                        ctyr0.b |= 1;
                        ctyr0.c = hfsf0;
                        ProtoLiteMessage hftv0 = hftp0.N_build();
                        ibuq.e(hftv0, "build(...)");
                        this.i = icih0;
                        this.a = object5;
                        this.b = object4;
                        this.c = object3;
                        this.d = object2;
                        this.e = v;
                        this.f = 1;
                        if(icih0.a(((ctyr)hftv0), this) == object1) {
                            return object1;
                        }
                    }
                label_50:
                }
                while(v > 0);
                ((ggtj)cthi.a.h()).B("Opened document: %s", ((ctyy)object4).c);
                goto label_56;
            }
            catch(Throwable throwable0) {
            }
            goto label_54;
        }
        else {
            v = this.e;
            object2 = this.d;
            object3 = this.c;
            object4 = this.b;
            object5 = this.a;
            icih0 = (icih)this.i;
            try {
                ibnx.b(object0);
                goto label_50;
            }
            catch(Throwable throwable0) {
                goto label_54;
            }
        }
        goto label_25;
        try {
        label_54:
            ibsx.a(((Closeable)object5), throwable0);
            throw throwable0;
        label_56:
            ibsx.a(((Closeable)object5), null);
            return ibom.a;
        }
        catch(CancellationException cancellationException0) {
            ((ggtj)cthi.a.h()).B("Cancelled open document: %s", this.g.c);
            throw cancellationException0;
        }
    }
}

