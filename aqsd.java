import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import jeb.synthetic.TWR;

final class aqsd implements Callable {
    final aqsf a;
    private final aqse b;
    private grot c;

    public aqsd(aqsf aqsf0, grot grot0, aqse aqse0) {
        Objects.requireNonNull(aqsf0);
        this.a = aqsf0;
        super();
        this.c = grot0;
        this.b = aqse0;
    }

    @Override
    public final Object call() {
        grot grot1;
        byte[] arr_b2;
        byte[] arr_b;
        AssetFileDescriptor assetFileDescriptor0;
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        aqsf aqsf0 = this.a;
        synchronized(aqsf0) {
            long v = aqsf0.o;
            long v1 = hqhq.d();
        }
        if(v > v1) {
            aqsf.a.m("Dropping contact thumbnail due to size for contact %d", new Object[]{((long)this.b.b)});
            return this.c;
        }
        aqse aqse0 = this.b;
        if(aqse0.a() && this.a.m.contains(aqse0.d)) {
            return this.c;
        }
        grot grot0 = this.c;
        Cursor cursor0 = null;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grot0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)grot0));
        aqsf aqsf1 = this.a;
        long v2 = aqse0.b;
        ContentResolver contentResolver0 = aqsf1.n.getContentResolver();
        Uri uri0 = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, v2), "display_photo");
        try {
            assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
        }
        catch(IOException unused_ex) {
            goto label_41;
        }
        try {
            if(assetFileDescriptor0 == null) {
                goto label_36;
            }
            else {
                if(aqsf1.j(assetFileDescriptor0.getLength())) {
                    FileInputStream fileInputStream0 = assetFileDescriptor0.createInputStream();
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    ghjj.b(fileInputStream0, byteArrayOutputStream0);
                    arr_b = byteArrayOutputStream0.toByteArray();
                }
                else {
                    aqsf.a.m("Dropping high res contact photo due to size for contact %d", new Object[]{v2});
                    arr_b = aqsf.c;
                }
                goto label_34;
            }
            goto label_42;
        }
        catch(Throwable throwable1) {
            goto label_39;
        }
        try {
        label_34:
            assetFileDescriptor0.close();
            goto label_42;
        }
        catch(IOException unused_ex) {
            goto label_41;
        }
        try {
        label_36:
            arr_b = aqsf.c;
            goto label_42;
        }
        catch(Throwable throwable1) {
            try {
            label_39:
                TWR.safeClose$NT(assetFileDescriptor0, throwable1);
                throw throwable1;
            }
            catch(IOException unused_ex) {
            }
        }
    label_41:
        arr_b = aqsf.c;
    label_42:
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grot)hftp0.b_message).o = hfsf0;
        if(hqhq.a.j().aC() && ((grot)hftp0.b_message).o.size() == 0) {
            ContentResolver contentResolver1 = this.a.n.getContentResolver();
            Uri uri1 = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.b.b), "photo");
            byte[] arr_b1 = aqsf.c;
            try {
                try {
                    cursor0 = contentResolver1.query(uri1, new String[]{"data15"}, null, null, null);
                    if(cursor0 != null && cursor0.moveToFirst()) {
                        arr_b2 = cursor0.getBlob(0);
                        goto label_62;
                    }
                    else {
                        goto label_63;
                    }
                    goto label_65;
                }
                catch(SQLiteException sQLiteException0) {
                }
                aqsf.a.g("ContentResolver.query threw an exception while fetching photo info.", sQLiteException0, new Object[0]);
                if(cursor0 != null) {
                    goto label_57;
                }
                goto label_65;
            }
            catch(Throwable throwable2) {
                goto label_60;
            }
        label_57:
            cursor0.close();
            goto label_65;
        label_60:
            TWR.safeClose$NT(cursor0, throwable2);
            throw throwable2;
        label_62:
            arr_b1 = arr_b2;
        label_63:
            if(cursor0 != null) {
                cursor0.close();
            }
        label_65:
            if(!this.a.j(((long)arr_b1.length))) {
                aqsf.a.m("Dropping contact thumbnail due to size for contact %d", new Object[]{((long)this.b.b)});
                grot1 = (grot)hftp0.N_build();
                this.c = grot1;
                return grot1;
            }
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((grot)hftp0.b_message).n = hfsf1;
        }
        grot1 = (grot)hftp0.N_build();
        this.c = grot1;
        return grot1;
    }
}

