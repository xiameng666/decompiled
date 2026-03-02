import j..io.FileRetargetClass;
import j..nio.file.CopyOption;
import j..nio.file.Files;
import j..nio.file.StandardCopyOption;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class lco implements lae {
    public final lct a;
    public final ibth b;
    public final AtomicBoolean c;
    private final File d;
    private final ldr e;
    private final icta f;

    public lco(File file0, ldr ldr0, lct lct0, ibth ibth0) {
        ibuq.f(file0, "file");
        ibuq.f(lct0, "coordinator");
        super();
        this.d = file0;
        this.e = ldr0;
        this.a = lct0;
        this.b = ibth0;
        this.c = new AtomicBoolean(false);
        this.f = new icta();
    }

    @Override  // lae
    public final void a() {
        throw null;
    }

    public final Object b(ibtx ibtx0, ibrl ibrl0) {
        lci lci1;
        boolean z1;
        Throwable throwable2;
        Object object2;
        lci lci0;
        boolean z;
        lcm lcm0;
        if((ibrl0 instanceof lcm)) {
            lcm0 = (lcm)ibrl0;
            int v = lcm0.d;
            if((v & 0x80000000) == 0) {
                lcm0 = new lcm(this, ibrl0);
            }
            else {
                lcm0.d = v - 0x80000000;
            }
        }
        else {
            lcm0 = new lcm(this, ibrl0);
        }
        Object object0 = lcm0.b;
        Object object1 = ibrx.a;
        switch(lcm0.d) {
            case 0: {
                ibnx.b(object0);
                this.d();
                z = this.f.c();
                try {
                    lci0 = new lci(this.d, this.e);
                }
                catch(Throwable throwable0) {
                    goto label_58;
                }
                try {
                    lcm0.e = lci0;
                    lcm0.a = z;
                    lcm0.d = 1;
                    object2 = ibtx0.a(lci0, Boolean.valueOf(z), lcm0);
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    z1 = z;
                    lci1 = lci0;
                    goto label_41;
                }
                if(object2 != object1) {
                    object0 = object2;
                    z1 = z;
                    lci1 = lci0;
                    break;
                }
                return object1;
            }
            case 1: {
                try {
                    z1 = lcm0.a;
                    lci1 = lcm0.e;
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_41:
                    lci1.a();
                    throw throwable2;
                }
                catch(Throwable throwable3) {
                    try {
                        ibnj.b(throwable2, throwable3);
                        throw throwable2;
                    }
                    catch(Throwable throwable4) {
                        goto label_56;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            lci1.a();
            throwable5 = null;
        }
        catch(Throwable throwable5) {
        }
        if(throwable5 == null) {
            if(z1) {
                this.f.d();
            }
            return object0;
        }
        try {
            throw throwable5;
        }
        catch(Throwable throwable4) {
        label_56:
            z = z1;
            throwable0 = throwable4;
        }
    label_58:
        if(z) {
            this.f.d();
        }
        throw throwable0;
    }

    public final Object c(ibtw ibtw0, ibrl ibrl0) {
        lci lci1;
        File file3;
        icta icta2;
        lci lci0;
        File file2;
        icta icta0;
        lcn lcn0;
        if((ibrl0 instanceof lcn)) {
            lcn0 = (lcn)ibrl0;
            int v = lcn0.e;
            if((v & 0x80000000) == 0) {
                lcn0 = new lcn(this, ibrl0);
            }
            else {
                lcn0.e = v - 0x80000000;
            }
        }
        else {
            lcn0 = new lcn(this, ibrl0);
        }
        Object object0 = lcn0.c;
        Object object1 = ibrx.a;
        switch(lcn0.e) {
            case 0: {
                ibnx.b(object0);
                this.d();
                File file0 = this.d;
                File file1 = file0.getCanonicalFile().getParentFile();
                if(file1 != null) {
                    file1.mkdirs();
                    if(!file1.isDirectory()) {
                        Objects.toString(file0);
                        throw new IOException("Unable to create parent directories of " + file0);
                    }
                }
                icta0 = this.f;
                lcn0.a = ibtw0;
                lcn0.b = icta0;
                lcn0.e = 1;
                if(icta0.b(lcn0) != object1) {
                    goto label_33;
                }
                return object1;
            }
            case 1: {
                icta icta1 = (icta)lcn0.b;
                ibtw ibtw1 = (ibtw)lcn0.a;
                ibnx.b(object0);
                icta0 = icta1;
                ibtw0 = ibtw1;
                try {
                label_33:
                    file2 = new File(this.d.getAbsolutePath() + ".tmp");
                    try {
                        lci0 = new lci(file2, this.e);
                        goto label_38;
                    }
                    catch(IOException iOException0) {
                    }
                }
                catch(Throwable throwable0) {
                    icta0.d();
                    throw throwable0;
                }
                goto label_82;
                try {
                label_38:
                    lcn0.a = icta0;
                    lcn0.b = file2;
                    lcn0.f = lci0;
                    lcn0.e = 2;
                    if(ibtw0.a(lci0, lcn0) != object1) {
                        icta2 = icta0;
                        file3 = file2;
                        lci1 = lci0;
                        break;
                    }
                    return object1;
                }
                catch(Throwable throwable1) {
                    icta2 = icta0;
                    file3 = file2;
                    lci1 = lci0;
                    goto label_60;
                }
                icta2 = icta0;
                file3 = file2;
                lci1 = lci0;
                break;
            }
            case 2: {
                lci1 = lcn0.f;
                file3 = (File)lcn0.b;
                icta2 = (icta)lcn0.a;
                try {
                    ibnx.b(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_60:
                    lci1.a();
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    try {
                        ibnj.b(throwable1, throwable2);
                        throw throwable1;
                    }
                    catch(IOException iOException0) {
                        goto label_80;
                    }
                    catch(Throwable throwable0) {
                        icta0 = icta2;
                        icta0.d();
                        throw throwable0;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            lci1.a();
            throwable3 = null;
        }
        catch(Throwable throwable3) {
        }
        try {
            try {
                if(throwable3 != null) {
                    throw throwable3;
                }
                if(file3.exists()) {
                    ibuq.f(file3, "<this>");
                    ibuq.f(this.d, "toFile");
                    ibuq.f(file3, "srcFile");
                    ibuq.f(this.d, "dstFile");
                    goto label_76;
                }
                goto label_91;
            }
            catch(IOException iOException0) {
                goto label_80;
            }
            try {
            label_76:
                Files.move(FileRetargetClass.toPath(file3), FileRetargetClass.toPath(this.d), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                goto label_91;
            }
            catch(IOException unused_ex) {
                try {
                    throw new IOException("Unable to rename " + file3 + " to " + this.d + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
                catch(IOException iOException0) {
                }
            }
        }
        catch(Throwable throwable0) {
            icta0 = icta2;
            icta0.d();
            throw throwable0;
        }
    label_80:
        icta0 = icta2;
        file2 = file3;
        try {
        label_82:
            if(file2.exists()) {
                file2.delete();
            }
            throw iOException0;
        }
        catch(Throwable throwable0) {
            icta0.d();
            throw throwable0;
        }
        icta0 = icta2;
        icta0.d();
        throw throwable0;
    label_91:
        icta2.d();
        return ibom.a;
    }

    private final void d() {
        if(!this.c.get()) {
            return;
        }
        throw new IllegalStateException("StorageConnection has already been disposed.");
    }
}

