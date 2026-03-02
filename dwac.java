import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.Comparator.-EL;
import j..util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class dwac {
    public static final bboh a;
    private final Context b;
    private final dprs c;
    private final frbx d;

    static {
        dwac.a = bboh.b("AadhaarCardDetector", bbcu.cZ);
    }

    public dwac(Context context0, dprs dprs0, frbx frbx0) {
        this.b = context0;
        this.c = dprs0;
        this.d = frbx0;
    }

    static Object a(dwac dwac0, Bitmap bitmap0, ibrl ibrl0) {
        Object object2;
        Bitmap bitmap1;
        dvzz dvzz0;
        dwac dwac1 = dwac0;
        if((ibrl0 instanceof dvzz)) {
            dvzz0 = (dvzz)ibrl0;
            int v = dvzz0.c;
            if((v & 0x80000000) == 0) {
                dvzz0 = new dvzz(dwac1, ibrl0);
            }
            else {
                dvzz0.c = v - 0x80000000;
            }
        }
        else {
            dvzz0 = new dvzz(dwac1, ibrl0);
        }
        Object object0 = dvzz0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(dvzz0.c) {
            case 0: {
                ibnx.b(object0);
                dvzz0.d = dwac1;
                bitmap1 = bitmap0;
                dvzz0.e = bitmap1;
                dvzz0.c = 1;
                object2 = dwac1.b(dvzz0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_29;
            }
            case 1: {
                Bitmap bitmap2 = dvzz0.e;
                dwac dwac2 = dvzz0.d;
                ibnx.b(object0);
                bitmap1 = bitmap2;
                dwac1 = dwac2;
                object2 = object0;
            label_29:
                hawd.g(dwac1.b);
                hbtp hbtp0 = hbtp.d(bitmap1);
                dvzz0.d = null;
                dvzz0.e = null;
                dvzz0.c = 2;
                object0 = dwac1.c(hbtp0, ((String)object2), dvzz0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((hbwk)object0) == null) {
            z = false;
        }
        else {
            gged_interceptors gged0 = ggna.a;
            ggdy ggdy0 = new ggdy();
            for(Object object3: ((hbwk)object0).a()) {
                ggdy0.k(((hbwj)object3).b());
            }
            gged_interceptors gged1 = ggdy0.h();
            gged_interceptors gged2 = (gged_interceptors)Collection.-EL.stream(((gged_interceptors)Collection.-EL.stream(gged_interceptors.D(Comparator.-CC.comparing(new hkps(), Comparator.-EL.thenComparingInt(Comparator.-CC.comparingInt(new hkpt()), new hkpu())), gged1)).map(new hkpr()).collect(ggaf.a))).flatMap(new hkqa()).collect(ggaf.a);
            int v1 = 0;
            for(Object object4: gged2) {
                v1 += ((String)object4).split(" ").length;
            }
            boolean z1 = hkqb.b(gged2, hkpz.g, 7);
            Pattern pattern0 = hkpz.a;
            gged_interceptors gged3 = hkqb.a(gged2, pattern0);
            ArrayList arrayList0 = new ArrayList();
            int v2 = ((ggna)gged3).c;
            for(int v3 = 0; v3 < v2; ++v3) {
                String s = (String)gged3.get(v3);
                if(s.replace(" ", "").length() == 12) {
                    arrayList0.add(s);
                }
            }
            if(!((Optional)Collection.-EL.stream(arrayList0).filter(new hkpv()).findFirst().map(new hkpw()).orElse(Optional.empty())).isPresent() && !Collection.-EL.stream(hkpz.a(hkpz.a(gged0, hkpz.c), hkpz.d)).filter(new hkpv()).findFirst().flatMap(new hkpw()).isPresent()) {
                if(!z1) {
                    return hkpz.c(gged2) && hkpz.d(gged2, pattern0).or(new hkpx(gged2)).isPresent() && v1 < 80 ? Boolean.valueOf(true) : Boolean.valueOf(false);
                }
                int v4 = hkqb.b(gged2, hkpz.h, 7);
                if(hkqb.b(gged2, hkpz.k, 7)) {
                    ++v4;
                }
                if(hkqb.b(gged2, hkpz.i, 7)) {
                    ++v4;
                }
                if(hkqb.b(gged2, hkpz.j, 5)) {
                    ++v4;
                }
                if(hkqb.c(gged2, hkpz.e)) {
                    ++v4;
                }
                if(hkqb.c(gged2, hkpz.f)) {
                    ++v4;
                }
                return v4 < 2 && (!hkqb.b(gged2, hkpz.l, 3) || !hkpz.b(gged2) || !hkqb.b(gged2, hkpz.m, 2)) && (!hkpz.c(gged2) || v1 >= 80) ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            if(!z1 && !hkpz.b(gged2)) {
                return hkpz.c(gged2) && hkpz.d(gged2, pattern0).or(new hkpx(gged2)).isPresent() && v1 < 80 ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object b(ibrl ibrl0) {
        String s3;
        fiyh fiyh0;
        dwaa dwaa0;
        if((ibrl0 instanceof dwaa)) {
            dwaa0 = (dwaa)ibrl0;
            int v = dwaa0.c;
            if((v & 0x80000000) == 0) {
                dwaa0 = new dwaa(this, ibrl0);
            }
            else {
                dwaa0.c = v - 0x80000000;
            }
        }
        else {
            dwaa0 = new dwaa(this, ibrl0);
        }
        Object object0 = dwaa0.a;
        Object object1 = ibrx.a;
        switch(dwaa0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    String s = hwkt.a.g().p();
                    dwaa0.c = 1;
                    object0 = this.c.a(s, dwaa0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    fiyh0 = (fiyh)object0;
                    goto label_26;
                }
                catch(IllegalStateException illegalStateException0) {
                }
                goto label_23;
            }
            case 1: {
                goto label_19;
            label_23:
                a.ae(dwac.a.j(), "Failed to download OCR models", illegalStateException0);
                fiyh0 = fiyh.a;
                ibuq.c(fiyh0);
            label_26:
                if(fiyg.a(fiyh0.g) == 2) {
                    hfuo hfuo0 = fiyh0.h;
                    ibuq.e(hfuo0, "getFileList(...)");
                    if(!hfuo0.isEmpty()) {
                        hfuo hfuo1 = fiyh0.h;
                        ibuq.e(hfuo1, "getFileList(...)");
                        Object object2 = ibpo.R(hfuo1);
                        ibuq.e(object2, "first(...)");
                        fiyd fiyd0 = (fiyd)object2;
                        dwaa0.c = 2;
                        try {
                            String s1 = fiyd0.d;
                            ibuq.e(s1, "getFileUri(...)");
                            Uri uri0 = Uri.parse(s1);
                            frfp frfp0 = new frfp();
                            frfp0.c();
                            String s2 = ((File)this.d.d(uri0, frfp0)).getAbsolutePath();
                            ibuq.e(s2, "getAbsolutePath(...)");
                            ibuq.f(s2, "filePath");
                            int v1 = ibzk.N(s2, "mlkit-google-ocr-models", 0, false, 6);
                            if(v1 == -1) {
                                ((ggtj)dwac.a.i()).B("Returned model path from MDD is not contained within the parent directory = %s", "mlkit-google-ocr-models");
                                s3 = null;
                            }
                            else {
                                s3 = s2.substring(0, v1 + 23);
                                ibuq.e(s3, "substring(...)");
                            }
                            if(s3 == null) {
                                ((ggtj)dwac.a.j()).B("Failed to fetch absolute path for model: %s", fiyd0.d);
                            }
                            return s3 == object1 ? object1 : s3;
                        }
                        catch(IOException iOException0) {
                            ((ggtj)((ggtj)dwac.a.i()).s(iOException0)).B("Error opening the provided file= %s", fiyd0.d);
                            return null == object1 ? object1 : null;
                        }
                    }
                }
                return null;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(hbtp hbtp0, String s, ibrl ibrl0) {
        Object object2;
        dwab dwab0;
        if((ibrl0 instanceof dwab)) {
            dwab0 = (dwab)ibrl0;
            int v = dwab0.c;
            if((v & 0x80000000) == 0) {
                dwab0 = new dwab(this, ibrl0);
            }
            else {
                dwab0.c = v - 0x80000000;
            }
        }
        else {
            dwab0 = new dwab(this, ibrl0);
        }
        Object object0 = dwab0.a;
        Object object1 = ibrx.a;
        switch(dwab0.c) {
            case 0: {
                ibnx.b(object0);
                if(s == null) {
                    ibuq.f(hbtp0, "inputImage");
                    evql evql1 = hbwl.a(hbxv.a).a(hbtp0);
                    dwab0.c = 2;
                    object2 = fsdk.a(evql1, dwab0);
                    if(object2 == object1) {
                        return object1;
                    }
                }
                else {
                    ibuq.f(hbtp0, "inputImage");
                    evql evql0 = hbwl.a(new hbxw(s, hwkt.a.g().o())).a(hbtp0);
                    dwab0.c = 1;
                    object2 = fsdk.a(evql0, dwab0);
                    if(object2 == object1) {
                        return object1;
                    }
                }
                return (object2 instanceof ibnv) ? null : object2;
            }
            case 1: 
            case 2: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                return (object2 instanceof ibnv) ? null : object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

