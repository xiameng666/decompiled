import android.os.Environment;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

public final class cthi extends ctyp {
    public static final bboh a;
    private final cthk b;

    static {
        cthi.a = ctnb.a("QuickAccess", new ibuk(cthi.class));
    }

    public cthi(cthk cthk0) {
        this.b = cthk0;
    }

    @Override  // cubh
    public final Object c(ctyv ctyv0, ibrl ibrl0) {
        cthg cthg0;
        if((ibrl0 instanceof cthg)) {
            cthg0 = (cthg)ibrl0;
            int v = cthg0.c;
            if((v & 0x80000000) == 0) {
                cthg0 = new cthg(this, ibrl0);
            }
            else {
                cthg0.c = v - 0x80000000;
            }
        }
        else {
            cthg0 = new cthg(this, ibrl0);
        }
        Object object0 = cthg0.a;
        Object object1 = ibrx.a;
        switch(cthg0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    ((ggtj)cthi.a.h()).X("Getting thumbnail: %s @ %sx%s", ctyv0.c, new Integer(ctyv0.d), new Integer(ctyv0.e));
                    String s = ctyv0.c;
                    ibuq.e(s, "getDocumentId(...)");
                    File file0 = cthi.g(s);
                    if(!file0.exists() || file0.isDirectory()) {
                        return cuab.a(((ProtoLiteMessage)ctyw.a).v_newBuilder()).a();
                    }
                    int v1 = ibwt.j(ctyv0.d, 0x20, 0x200);
                    int v2 = ibwt.j(ctyv0.e, 0x20, 0x200);
                    cthg0.d = ctyv0;
                    cthg0.c = 1;
                    if(ibzk.W(cthi.i(file0), "image")) {
                        icdy icdy0 = new icdy(new cthj(file0, v1, v2), null);
                        Object object2 = icbd.a(this.b.a, icdy0, cthg0);
                        if(object2 != object1) {
                            object2 = (byte[])object2;
                        }
                        object0 = object2;
                    }
                    else {
                        object0 = null;
                    }
                    if(object0 == object1) {
                        return object1;
                    label_34:
                        ctyv0 = cthg0.d;
                        ibnx.b(object0);
                    }
                    if(((byte[])object0) == null) {
                        ((ggtj)cthi.a.h()).B("No thumbnail available: %s", ctyv0.c);
                        return cuab.a(((ProtoLiteMessage)ctyw.a).v_newBuilder()).a();
                    }
                    ((ggtj)cthi.a.h()).P("Got thumbnail: %s = %s", ctyv0.c, ((byte[])object0).length);
                    cuac cuac0 = cuab.a(((ProtoLiteMessage)ctyw.a).v_newBuilder());
                    ByteString hfsf0 = hfxt.a(((byte[])object0));
                    ProtoLiteBuilder hftp0 = cuac0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ctyw ctyw0 = (ctyw)hftp0.b_message;
                    ctyw0.b |= 1;
                    ctyw0.c = hfsf0;
                    return cuac0.a();
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
            }
            case 1: {
                goto label_34;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((ggtj)cthi.a.h()).B("Cancelled getting thumbnail: %s", ctyv0.c);
        throw cancellationException0;
    }

    @Override  // cubh
    public final icig d(ctys ctys0) {
        ibuq.f(ctys0, "request");
        try {
            bboh bboh0 = cthi.a;
            ((ggtj)bboh0.h()).B("Getting child documents: %s", ctys0.c);
            String s = ctys0.c;
            ibuq.e(s, "getDocumentId(...)");
            File file0 = cthi.g(s);
            if(file0.exists() && file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file == null) {
                    arr_file = new File[0];
                }
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    if(!file1.isHidden()) {
                        arrayList0.add(file1);
                    }
                }
                icig icig0 = new cthe(new icik(ibpo.ao(arrayList0, new cthf())), this);
                ((ggtj)bboh0.h()).B("Got child documents: %s", ctys0.c);
                return icig0;
            }
            return icif.a;
        }
        catch(CancellationException cancellationException0) {
            ((ggtj)cthi.a.h()).B("Cancelled get child documents: %s", ctys0.c);
            throw cancellationException0;
        }
    }

    @Override  // cubh
    public final icig e(ctyy ctyy0) {
        ibuq.f(ctyy0, "request");
        return new icht(new cthh(ctyy0, this, null));
    }

    @Override  // cubh
    public final Object f(ctyt ctyt0) {
        try {
            bboh bboh0 = cthi.a;
            ((ggtj)bboh0.h()).B("Getting document: %s", ctyt0.c);
            String s = ctyt0.c;
            ibuq.e(s, "getDocumentId(...)");
            File file0 = cthi.g(s);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyu.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            if(file0.exists() && !file0.isHidden()) {
                ctyq ctyq0 = cthi.h(file0);
                ibuq.f(ctyq0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ctyu ctyu0 = (ctyu)hftp0.b_message;
                ctyq0.getClass();
                ctyu0.c = ctyq0;
                ctyu0.b = 2;
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ctyx.a).v_newBuilder();
                ibuq.f(hftp1, "builder");
                ProtoLiteMessage hftv0 = hftp1.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((ctyx)hftv0), "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ctyu ctyu1 = (ctyu)hftp0.b_message;
                ((ctyx)hftv0).getClass();
                ctyu1.c = (ctyx)hftv0;
                ctyu1.b = 1;
            }
            ProtoLiteMessage hftv1 = hftp0.N_build();
            ibuq.e(hftv1, "build(...)");
            ((ggtj)bboh0.h()).B("Got document: %s", ctyt0.c);
            return (ctyu)hftv1;
        }
        catch(CancellationException cancellationException0) {
            ((ggtj)cthi.a.h()).B("Cancelled get document: %s", ctyt0.c);
            throw cancellationException0;
        }
    }

    public static final File g(String s) {
        return new File(ccsb.a.b(Environment.getExternalStorageDirectory(), s));
    }

    public static final ctyq h(File file0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyq.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        File file1 = Environment.getExternalStorageDirectory();
        ibuq.e(file1, "<get-rootFile>(...)");
        ibuq.f(file0, "<this>");
        ibuq.f(file1, "base");
        ibsy ibsy0 = ibsz.b(ibsz.a(file0));
        ibsy ibsy1 = ibsz.b(ibsz.a(file1));
        String s = null;
        if(ibuq.m(ibsy0.a, ibsy1.a)) {
            int v = ibsy1.a();
            int v1 = ibsy0.a();
            int v2 = Math.min(v1, v);
            int v3;
            for(v3 = 0; v3 < v2 && ibuq.m(ibsy0.b.get(v3), ibsy1.b.get(v3)); ++v3) {
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            int v4 = v - 1;
            if(v3 <= v4) {
                while(!ibuq.m(((File)ibsy1.b.get(v4)).getName(), "..")) {
                    stringBuilder0.append("..");
                    if(v4 != v3) {
                        stringBuilder0.append(File.separatorChar);
                    }
                    if(v4 == v3) {
                        goto label_28;
                    }
                    --v4;
                }
                goto label_36;
            }
        label_28:
            if(v3 < v1) {
                if(v3 < v) {
                    stringBuilder0.append(File.separatorChar);
                }
                List list0 = ibpo.af(ibsy0.b, v3);
                String s1 = File.separator;
                ibuq.e(s1, "separator");
                ibpo.aM(list0, stringBuilder0, s1, null, 0x7C);
            }
            s = stringBuilder0.toString();
        }
    label_36:
        if(s == null) {
            throw new IllegalArgumentException(a.j(file1, file0, "this and base files have different roots: ", " and ", "."));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctyq ctyq0 = (ctyq)hftp0.b_message;
        ctyq0.b |= 1;
        ctyq0.c = "/" + s;
        String s2 = file0.getName();
        ibuq.e(s2, "getName(...)");
        ibuq.f(s2, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctyq ctyq1 = (ctyq)hftp0.b_message;
        s2.getClass();
        ctyq1.b |= 2;
        ctyq1.d = s2;
        long v5 = file0.lastModified();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctyq ctyq2 = (ctyq)hftp0.b_message;
        ctyq2.b |= 0x40;
        ctyq2.i = v5;
        if(file0.isDirectory()) {
            ctzy.b("vnd.android.document/directory", hftp0);
        }
        else {
            ctzy.b(cthi.i(file0), hftp0);
            long v6 = file0.length();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ctyq ctyq3 = (ctyq)hftp0.b_message;
            ctyq3.b |= 8;
            ctyq3.f = v6;
            if(ibzk.W(ctzy.a(hftp0), "image") || ibzk.W(ctzy.a(hftp0), "video")) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ctyq ctyq4 = (ctyq)hftp0.b_message;
                ctyq4.b |= 16;
                ctyq4.g = 1;
            }
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ctyq)hftv0;
    }

    private static final String i(File file0) {
        String s = MimeTypeMap.getFileExtensionFromUrl(file0.toString());
        if(s != null) {
            MimeTypeMap mimeTypeMap0 = MimeTypeMap.getSingleton();
            String s1 = s.toLowerCase(Locale.ROOT);
            ibuq.e(s1, "toLowerCase(...)");
            String s2 = mimeTypeMap0.getMimeTypeFromExtension(s1);
            return s2 == null ? "" : s2;
        }
        return "";
    }
}

