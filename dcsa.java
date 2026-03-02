import android.net.Uri;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

final class dcsa extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final dcsk d;
    final dcsh e;
    final dctq f;

    public dcsa(dcsk dcsk0, dcsh dcsh0, dctq dctq0, ibrl ibrl0) {
        this.d = dcsk0;
        this.e = dcsh0;
        this.f = dctq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcsa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcsa(this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        OutputStream outputStream0;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            try {
                object2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                goto label_52;
            }
            catch(Throwable throwable0) {
                ((File)object2).delete();
                throw throwable0;
            }
        }
        ibnx.b(object0);
        icai icai0 = this.d.a;
        String s = icai0.a();
        dcvz.a.b().h("File [%s] - Starting file upload", s);
        dcsh dcsh0 = this.e;
        ibuq.f(this.d, "attachment");
        Attachment attachment0 = this.d.b;
        if(!(attachment0 instanceof FileAttachment)) {
            throw new IllegalStateException("Cannot upload non-file attachments");
        }
        Uri uri0 = ((FileAttachment)attachment0).d;
        if(uri0 == null) {
            throw new IllegalStateException("Cannot upload file attachments without URI");
        }
        dcsr dcsr0 = dcsh0.b;
        String s1 = icai0.a();
        File file0 = dcsr0.c.b(((FileAttachment)attachment0).k);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        File file1 = new File(ccsb.a.b(file0, s1));
        fqbe fqbe0 = cuua.b();
        InputStream inputStream0 = fqbf.d(dcsr0.b, uri0, fqbe0);
        try {
            gmno gmno0 = (gmno)dcsr0.g.a();
            FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
            byte[] arr_b = s1.getBytes(ibyo.a);
            ibuq.e(arr_b, "getBytes(...)");
            outputStream0 = gmno0.b(fileOutputStream0, arr_b);
        }
        catch(Throwable throwable1) {
            ibsx.a(inputStream0, throwable1);
            throw throwable1;
        }
        try {
            ibuq.c(inputStream0);
            ibsw.b(inputStream0, outputStream0);
            goto label_35;
        }
        catch(Throwable throwable2) {
            try {
                ibsx.a(outputStream0, throwable2);
                throw throwable2;
            label_35:
                ibsx.a(outputStream0, null);
                goto label_40;
            }
            catch(Throwable throwable1) {
            }
        }
        ibsx.a(inputStream0, throwable1);
        throw throwable1;
    label_40:
        ibsx.a(inputStream0, null);
        dcvz.a.b().h("Successfully encrypted cloud attachment %s", s1);
        try {
            this.a = s;
            this.b = file1;
            this.c = 1;
            if(this.f.a(s, file1, this) != object1) {
                goto label_50;
            }
            return object1;
        }
        catch(Throwable throwable0) {
            object2 = file1;
            ((File)object2).delete();
            throw throwable0;
        }
    label_50:
        object3 = s;
        object2 = file1;
        try {
        label_52:
            dcvz.a.b().h("File [%s] - Upload completed", object3);
        }
        catch(Throwable throwable0) {
            ((File)object2).delete();
            throw throwable0;
        }
        ((File)object2).delete();
        return ibom.a;
    }
}

