import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.Telephony.Mms;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import jeb.synthetic.TWR;

public final class arqy extends arqo {
    static final String[] a;
    private static final aqql b;
    private final ContentResolver c;

    static {
        arqy.b = new aqql(new String[]{"MmsAttachmentsHandler"});
        arqy.a = new String[]{"_id", "ct", "cl", "name"};
    }

    public arqy(ContentResolver contentResolver0) {
        batl.s(contentResolver0);
        this.c = contentResolver0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        throw new IOException("Mms attachments flavor should not use file payload");
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        try {
            Uri uri0 = arqy.f(Integer.parseInt(asby0.e));
            return this.c.openInputStream(uri0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            arqy.b.j("Unable to open stream for item %s", new Object[]{asby0.e});
            throw new arra("Unable to find stream for mms partId=" + asby0.e, fileNotFoundException0);
        }
    }

    @Override  // arqo
    public final List c() {
        long v3;
        long v2;
        aqql aqql0 = arqy.b;
        aqql0.j("Indexing MMS attachments", new Object[0]);
        ggdy ggdy0 = new ggdy();
        Uri uri0 = Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build();
        ContentResolver contentResolver0 = this.c;
        Cursor cursor0 = contentResolver0.query(uri0, arqy.a, null, null, "_id ASC");
        try {
            if(cursor0 == null) {
                aqql0.m("Content provider returned null cursor.", new Object[0]);
                return ggna.a;
            }
            while(cursor0.moveToNext()) {
                int v = cursor0.getInt(cursor0.getColumnIndex("_id"));
                String s = cursor0.getString(cursor0.getColumnIndex("ct"));
                String s1 = cursor0.getString(cursor0.getColumnIndex("cl"));
                String s2 = cursor0.getString(cursor0.getColumnIndex("name"));
                if(aqwp.f(s)) {
                    String s3 = aqwo.b(s1, s2, v);
                    int v1 = cursor0.getCount();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asby.a).v_newBuilder();
                    String s4 = Integer.toString(v);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    asby asby0 = (asby)hftp0.b_message;
                    s4.getClass();
                    asby0.b |= 1;
                    asby0.e = s4;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbs.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    asbs asbs0 = (asbs)hftp1.b_message;
                    s3.getClass();
                    asbs0.b |= 1;
                    asbs0.c = s3;
                    asbs asbs1 = (asbs)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    asby asby1 = (asby)hftp0.b_message;
                    asbs1.getClass();
                    asby1.d = asbs1;
                    asby1.c = 100;
                    if(((long)v1) > hqhr.a.b().a()) {
                        v2 = hqhr.a.b().b();
                    }
                    else {
                        try {
                            ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(arqy.f(v), "r");
                            try {
                                v3 = parcelFileDescriptor0.getStatSize();
                            }
                            catch(Throwable throwable1) {
                                Throwable throwable2 = throwable1;
                                if(parcelFileDescriptor0 != null) {
                                    try {
                                        parcelFileDescriptor0.close();
                                    }
                                    catch(Throwable throwable3) {
                                        throwable2.addSuppressed(throwable3);
                                    }
                                }
                                throw throwable2;
                            }
                            parcelFileDescriptor0.close();
                            v2 = v3;
                            goto label_61;
                        }
                        catch(FileNotFoundException unused_ex) {
                            arqy.b.j("Unable to open file descriptor for item %d", new Object[]{v});
                        }
                        catch(IOException iOException0) {
                            arqy.b.k("Error while getting size of partId=%d", iOException0, new Object[]{v});
                        }
                        v2 = 0L;
                    }
                label_61:
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    asby asby2 = (asby)hftp0.b_message;
                    asby2.b |= 2;
                    asby2.f = v2;
                    ggdy0.i(((asby)hftp0.N_build()));
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return ggdy0.h();
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        bbpb.b(inputStream0);
    }

    @Override  // arqo
    public final long e(asby asby0) {
        return ghgc.a.d("mms_attachments_" + asby0.e).c();
    }

    static Uri f(int v) {
        return Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").appendPath(Integer.toString(v)).build();
    }
}

