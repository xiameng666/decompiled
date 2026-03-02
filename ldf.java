import j..nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Objects;

public final class ldf implements lct {
    public static final lda a;
    public final String b;
    public final String c;
    private final ibrt d;
    private final File e;
    private final icig f;
    private final String g;
    private final ibnn h;
    private final ibnn i;
    private final icta j;

    static {
        ldf.a = new lda();
    }

    public ldf(ibrt ibrt0, File file0) {
        ibuq.f(ibrt0, "context");
        ibuq.f(file0, "file");
        super();
        this.d = ibrt0;
        this.e = file0;
        ibuq.f(file0, "file");
        this.f = new icib(new ldl(file0, null));
        this.b = ".lock";
        this.c = ".version";
        this.g = "fcntl failed: EAGAIN";
        this.j = new icta();
        this.h = new ibnz(new lcv(this));
        this.i = new ibnz(new lcw(this));
    }

    @Override  // lct
    public final Object a(ibrl ibrl0) {
        if(this.i.b()) {
            return new Integer(this.f().a());
        }
        ldb ldb0 = new ldb(this, null);
        return icbd.a(this.d, ldb0, ibrl0);
    }

    @Override  // lct
    public final Object b(ibrl ibrl0) {
        if(this.i.b()) {
            return new Integer(this.f().b());
        }
        ldc ldc0 = new ldc(this, null);
        return icbd.a(this.d, ldc0, ibrl0);
    }

    @Override  // lct
    public final Object c(ibts ibts0, ibrl ibrl0) {
        FileLock fileLock2;
        Object object3;
        FileLock fileLock1;
        ibts ibts2;
        icta icta3;
        Throwable throwable2;
        Closeable closeable0;
        icta icta2;
        Object object2;
        FileOutputStream fileOutputStream0;
        icta icta0;
        ldd ldd0;
        if((ibrl0 instanceof ldd)) {
            ldd0 = (ldd)ibrl0;
            int v = ldd0.f;
            if((v & 0x80000000) == 0) {
                ldd0 = new ldd(this, ibrl0);
            }
            else {
                ldd0.f = v - 0x80000000;
            }
        }
        else {
            ldd0 = new ldd(this, ibrl0);
        }
        Object object0 = ldd0.d;
        Object object1 = ibrx.a;
        FileLock fileLock0 = null;
        switch(ldd0.f) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.j;
                ldd0.a = ibts0;
                ldd0.b = icta0;
                ldd0.f = 1;
                if(icta0.b(ldd0) != object1) {
                    goto label_26;
                }
                return object1;
            }
            case 1: {
                icta icta1 = (icta)ldd0.b;
                ibts ibts1 = (ibts)ldd0.a;
                ibnx.b(object0);
                icta0 = icta1;
                ibts0 = ibts1;
                try {
                label_26:
                    fileOutputStream0 = new FileOutputStream(this.i());
                }
                catch(Throwable throwable0) {
                    icta0.d();
                    throw throwable0;
                }
                try {
                    ldd0.a = ibts0;
                    ldd0.b = icta0;
                    ldd0.c = fileOutputStream0;
                    ldd0.f = 2;
                    object2 = ldf.a.a(fileOutputStream0, ldd0);
                }
                catch(Throwable throwable1) {
                    icta2 = icta0;
                    closeable0 = fileOutputStream0;
                    throwable2 = throwable1;
                    goto label_76;
                }
                if(object2 != object1) {
                    try {
                        icta3 = icta0;
                        ibts2 = ibts0;
                        closeable0 = fileOutputStream0;
                        fileLock1 = (FileLock)object2;
                        goto label_52;
                    }
                    catch(Throwable throwable2) {
                        icta2 = icta3;
                        goto label_76;
                    }
                }
                return object1;
            }
            case 2: {
                closeable0 = (Closeable)ldd0.c;
                icta3 = (icta)ldd0.b;
                ibts2 = (ibts)ldd0.a;
                try {
                    ibnx.b(object0);
                    fileLock1 = (FileLock)object0;
                }
                catch(Throwable throwable2) {
                    icta2 = icta3;
                    goto label_76;
                }
                try {
                label_52:
                    ldd0.a = icta3;
                    ldd0.b = closeable0;
                    ldd0.c = fileLock1;
                    ldd0.f = 3;
                    object3 = ibts2.a(ldd0);
                }
                catch(Throwable throwable3) {
                    fileLock0 = fileLock1;
                    throwable2 = throwable3;
                    icta2 = icta3;
                    goto label_76;
                }
                if(object3 != object1) {
                    icta2 = icta3;
                    fileLock2 = fileLock1;
                    object0 = object3;
                    goto label_79;
                }
                return object1;
            }
            case 3: {
                fileLock2 = (FileLock)ldd0.c;
                closeable0 = (Closeable)ldd0.b;
                icta2 = (icta)ldd0.a;
                try {
                    ibnx.b(object0);
                    goto label_79;
                }
                catch(Throwable throwable2) {
                    fileLock0 = fileLock2;
                }
                try {
                label_76:
                    if(fileLock0 != null) {
                        fileLock0.release();
                    }
                    throw throwable2;
                label_79:
                    if(fileLock2 != null) {
                        fileLock2.release();
                    }
                    goto label_90;
                }
                catch(Throwable throwable4) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            icta0 = icta2;
            throw throwable4;
        }
        catch(Throwable throwable5) {
            try {
                ibsx.a(closeable0, throwable4);
                throw throwable5;
            }
            catch(Throwable throwable0) {
            }
        }
        icta0.d();
        throw throwable0;
        try {
        label_90:
            ibsx.a(closeable0, null);
        }
        catch(Throwable throwable0) {
            icta0 = icta2;
            icta0.d();
            throw throwable0;
        }
        icta2.d();
        return object0;
    }

    @Override  // lct
    public final Object d(ibtw ibtw0, ibrl ibrl0) {
        icta icta2;
        Object object4;
        Object object3;
        boolean z2;
        icta icta1;
        FileLock fileLock0;
        FileInputStream fileInputStream0;
        lde lde0;
        if((ibrl0 instanceof lde)) {
            lde0 = (lde)ibrl0;
            int v = lde0.f;
            if((v & 0x80000000) == 0) {
                lde0 = new lde(this, ibrl0);
            }
            else {
                lde0.f = v - 0x80000000;
            }
        }
        else {
            lde0 = new lde(this, ibrl0);
        }
        Object object0 = lde0.d;
        Object object1 = ibrx.a;
        Object object2 = null;
        switch(lde0.f) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.j;
                boolean z = icta0.c();
                boolean z1 = false;
                try {
                    if(z) {
                        fileInputStream0 = new FileInputStream(this.i());
                        goto label_20;
                    }
                    else {
                        goto label_54;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    icta2 = icta0;
                    z2 = z;
                    goto label_99;
                }
                try {
                    try {
                    label_20:
                        fileLock0 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream0.getChannel()).tryLock(0L, 0x7FFFFFFFFFFFFFFFL, true);
                    }
                    catch(IOException iOException0) {
                        String s = iOException0.getMessage();
                        if(s == null || !ibzk.W(s, this.g)) {
                            String s1 = iOException0.getMessage();
                            if(s1 == null || !ibzk.W(s1, "Resource deadlock would occur")) {
                                throw iOException0;
                            }
                        }
                        fileLock0 = null;
                    }
                }
                catch(Throwable throwable1) {
                    icta1 = icta0;
                    z2 = z;
                    object3 = fileInputStream0;
                    goto label_82;
                }
                if(fileLock0 != null) {
                    z1 = true;
                }
                try {
                    lde0.g = icta0;
                    lde0.a = fileInputStream0;
                    lde0.b = fileLock0;
                    lde0.c = true;
                    lde0.f = 2;
                    object0 = ibtw0.a(Boolean.valueOf(z1), lde0);
                }
                catch(Throwable throwable1) {
                    object2 = fileLock0;
                    icta1 = icta0;
                    z2 = z;
                    object3 = fileInputStream0;
                    goto label_82;
                }
                if(object0 != object1) {
                    object4 = fileLock0;
                    icta1 = icta0;
                    z2 = z;
                    object3 = fileInputStream0;
                    goto label_85;
                    try {
                    label_54:
                        lde0.g = icta0;
                        lde0.c = false;
                        lde0.f = 1;
                        object0 = ibtw0.a(Boolean.valueOf(false), lde0);
                    }
                    catch(Throwable throwable0) {
                        icta2 = icta0;
                        z2 = z;
                        goto label_99;
                    }
                    if(object0 != object1) {
                        icta2 = icta0;
                        z2 = z;
                        goto label_102;
                    }
                }
                return object1;
            }
            case 1: {
                try {
                    z2 = lde0.c;
                    icta2 = lde0.g;
                    ibnx.b(object0);
                    goto label_102;
                }
                catch(Throwable throwable0) {
                    goto label_99;
                }
            }
            case 2: {
                try {
                    z2 = lde0.c;
                    object4 = lde0.b;
                    object3 = lde0.a;
                    icta1 = lde0.g;
                    ibnx.b(object0);
                    goto label_85;
                }
                catch(Throwable throwable1) {
                    object2 = object4;
                }
                try {
                label_82:
                    if(object2 != null) {
                        ((FileLock)object2).release();
                    }
                    throw throwable1;
                label_85:
                    if(object4 != null) {
                        ((FileLock)object4).release();
                    }
                    goto label_94;
                }
                catch(Throwable throwable2) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            ibsx.a(((Closeable)object3), throwable2);
            throw throwable2;
        }
        catch(Throwable throwable0) {
            z2 = z2;
            goto label_98;
        }
        try {
        label_94:
            ibsx.a(((Closeable)object3), null);
            icta2 = icta1;
            goto label_102;
        }
        catch(Throwable throwable0) {
        }
    label_98:
        icta2 = icta1;
    label_99:
        if(z2) {
            icta2.d();
        }
        throw throwable0;
    label_102:
        if(z2) {
            icta2.d();
        }
        return object0;
    }

    @Override  // lct
    public final icig e() {
        return this.f;
    }

    public final ldu f() {
        return (ldu)this.i.a();
    }

    public final File g(String s) {
        return new File(this.e.getAbsolutePath() + s);
    }

    public static final void h(File file0) {
        File file1 = file0.getCanonicalFile().getParentFile();
        if(file1 != null) {
            file1.mkdirs();
            if(!file1.isDirectory()) {
                Objects.toString(file0);
                throw new IOException("Unable to create parent directories of " + file0.toString());
            }
        }
        if(!file0.exists()) {
            file0.createNewFile();
        }
    }

    private final File i() {
        return (File)this.h.a();
    }
}

