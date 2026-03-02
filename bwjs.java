import android.content.Context;
import android.content.pm.ApplicationInfo;
import j..nio.channels.DesugarChannels;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class bwjs {
    private static final bboh a;
    private static final bwjr b;

    static {
        bwjs.a = bboh.b("HttpflagsFlagsFile", bbcu.fL);
        bwjs.b = new bwjr();
    }

    public static final void a(Context context0) {
        hgtb hgtb2;
        int v3;
        ProtoLiteMessage hftv0;
        synchronized(bwjs.b) {
            try {
                int v = 2;
                int v1 = glwy.a(htyo.a.b().a());
                if(v1 == 0) {
                    v = 1;
                }
                else {
                    switch(v1) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            v = 3;
                            break;
                        }
                        default: {
                            v = 0;
                        }
                    }
                }
                if(v == 0) {
                    throw new IllegalStateException("Required value was null.");
                }
                switch(v - 1) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        ApplicationInfo applicationInfo1 = context0.getApplicationInfo();
                        ibuq.e(applicationInfo1, "getApplicationInfo(...)");
                        File file1 = bwju.a(applicationInfo1);
                        File file2 = bwju.b(file1);
                        hgtb hgtb0 = bwjs.b();
                        if(file2.exists()) {
                            try {
                                FileInputStream fileInputStream0 = new FileInputStream(file2);
                                try {
                                    hgtb hgtb1 = hgtb.a;
                                    hftc hftc0 = hftc.a;
                                    try {
                                        int v2 = fileInputStream0.read();
                                        if(v2 == -1) {
                                            hftv0 = null;
                                        }
                                        else {
                                            v3 = hfsl.L(v2, fileInputStream0);
                                            goto label_41;
                                        }
                                        goto label_71;
                                    }
                                    catch(hfur hfur0) {
                                        throw hfur0.b ? new hfur(hfur0) : hfur0;
                                    }
                                    catch(IOException iOException1) {
                                        throw new hfur(iOException1);
                                    }
                                label_41:
                                    hfsl hfsl0 = hfsl.N(new hfri(fileInputStream0, v3));
                                    hftv0 = ((ProtoLiteMessage)hgtb1).x_newMutableInstance();
                                    try {
                                        hfwc hfwc0 = hfvu.a.c(hftv0);
                                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                                        hfwc0.g(hftv0);
                                    }
                                    catch(hfur hfur1) {
                                        if(hfur1.b) {
                                            hfur1 = new hfur(hfur1);
                                        }
                                        hfur1.a = hftv0;
                                        throw hfur1;
                                    }
                                    catch(hfwr hfwr0) {
                                        hfur hfur2 = hfwr0.a();
                                        hfur2.a = hftv0;
                                        throw hfur2;
                                    }
                                    catch(IOException iOException2) {
                                        if((iOException2.getCause() instanceof hfur)) {
                                            throw (hfur)iOException2.getCause();
                                        }
                                        hfur hfur3 = new hfur(iOException2);
                                        hfur3.a = hftv0;
                                        throw hfur3;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        if((runtimeException0.getCause() instanceof hfur)) {
                                            throw (hfur)runtimeException0.getCause();
                                        }
                                        throw runtimeException0;
                                    }
                                    try {
                                        hfsl0.z(0);
                                    }
                                    catch(hfur hfur4) {
                                        hfur4.a = hftv0;
                                        throw hfur4;
                                    }
                                label_71:
                                    ProtoLiteMessage.P_makeImmutable(hftv0);
                                    hgtb2 = (hgtb)hftv0;
                                }
                                catch(Throwable throwable1) {
                                    ibsx.a(fileInputStream0, throwable1);
                                    throw throwable1;
                                }
                                ibsx.a(fileInputStream0, null);
                                ibuq.c(hgtb2);
                                boolean z = ((ProtoLiteMessage)hgtb2).equals(hgtb0);
                            }
                            catch(Exception exception0) {
                                a.ae(bwjs.a.j(), "Couldn\'t read existing HTTP flags file, writing a new one", exception0);
                                goto label_86;
                            }
                            if(!z) {
                                ((ggtj)bwjs.a.h()).x("HTTP flags have changed, updating the HTTP flags file");
                            label_86:
                                File file3 = bwju.b(file1);
                                File file4 = hrnt.i() ? new File(ccsb.a.b(file3.getParentFile(), file3.getName() + ".new")) : new File(file3.getParentFile(), file3.getName() + ".new");
                                if(!file1.exists() && !file1.mkdir()) {
                                    throw new IOException("Unable to create flags directory");
                                }
                                boolean z1 = file4.createNewFile();
                                FileOutputStream fileOutputStream0 = new FileOutputStream(file4);
                                try {
                                    if(!z1) {
                                        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream0.getChannel()).truncate(0L);
                                    }
                                    bwjs.b().writeDelimitedTo(fileOutputStream0);
                                }
                                catch(Throwable throwable2) {
                                    ibsx.a(fileOutputStream0, throwable2);
                                    throw throwable2;
                                }
                                ibsx.a(fileOutputStream0, null);
                                if(!file4.setReadable(true, false)) {
                                    throw new IOException("Unable to make the flags file world-readable");
                                }
                                if(!file1.setExecutable(true, false)) {
                                    throw new IOException("Unable to make the flags directory world-executable");
                                }
                                if(!file4.renameTo(file2)) {
                                    throw new IOException("Unable to rename flags file");
                                }
                            }
                        }
                        else {
                            ((ggtj)bwjs.a.h()).x("No HTTP flags file found, writing a new one");
                            goto label_86;
                        }
                        break;
                    }
                    default: {
                        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
                        ibuq.e(applicationInfo0, "getApplicationInfo(...)");
                        File file0 = bwju.a(applicationInfo0);
                        if(file0.exists()) {
                            bwjs.c(file0);
                        }
                    }
                }
            }
            catch(IOException iOException0) {
                ((ggtj)((ggtj)bwjs.a.i()).s(iOException0)).x("Unable to update HTTP flags file");
            }
        }
    }

    private static final hgtb b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgtb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        for(Object object0: htyr.a.b().a()) {
            Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((hgtb)hftp0.b_message).b));
            ibuq.e(map0, "getFlagsMap(...)");
            new hfxv(map0);
            ibuq.e(((gfsz)object0).a, "first");
            String s = (String)ibpo.W(ibzk.T(((CharSequence)((gfsz)object0).a), new String[]{"__"}, 2, 2));
            ibuq.e(((gfsz)object0).b, "second");
            hglo hglo0 = (hglo)((gfsz)object0).b;
            ibuq.f(s, "key");
            ibuq.f(hglo0, "value");
            s.getClass();
            hglo0.getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgtb hgtb0 = (hgtb)hftp0.b_message;
            hfvh hfvh0 = hgtb0.b;
            if(!hfvh0.b) {
                hgtb0.b = hfvh0.a();
            }
            hgtb0.b.put(s, hglo0);
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hgtb)hftv0;
    }

    private static final void c(File file0) {
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            Iterator iterator0 = ibug.a(arr_file);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ibuq.e(object0, "next(...)");
                File file1 = (File)object0;
                try {
                    bwjs.c(file1);
                }
                catch(IOException iOException0) {
                    a.e(bwjs.a.i(), "Unable to delete %s", file1, iOException0);
                }
            }
        }
        if(file0.delete()) {
            return;
        }
        Objects.toString(file0);
        throw new IOException("Unable to delete " + file0);
    }
}

