import android.accounts.Account;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import j..time.Instant;
import j..time.LocalDate;
import j..time.format.DateTimeFormatter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cacp implements cacc {
    public static final bboh a;
    public final cchj b;
    public final String c;
    public final caje d;
    private final clbs e;
    private final String f;

    static {
        cacp.a = cajd.a("cacp");
    }

    public cacp(clbs clbs0, cchj cchj0, caje caje0) {
        this.e = clbs0;
        this.b = cchj0;
        this.d = caje0;
        this.c = "oauth2:https://www.googleapis.com/auth/userinfo.email";
        this.f = "https://autopush-intrusionlogging.pa.googleapis.com";
    }

    @Override  // cacc
    public final Object a(Account account0, ibrl ibrl0) {
        Object object3;
        cach cach0;
        if((ibrl0 instanceof cach)) {
            cach0 = (cach)ibrl0;
            int v = cach0.d;
            if((v & 0x80000000) == 0) {
                cach0 = new cach(this, ibrl0);
            }
            else {
                cach0.d = v - 0x80000000;
            }
        }
        else {
            cach0 = new cach(this, ibrl0);
        }
        Object object0 = cach0.b;
        Object object1 = ibrx.a;
        switch(cach0.d) {
            case 0: {
                ibnx.b(object0);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                cach0.a = byteArrayOutputStream0;
                cach0.d = 1;
                Object object2 = this.e(account0, byteArrayOutputStream0, cach0);
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                object3 = byteArrayOutputStream0;
                goto label_24;
            }
            case 1: {
                object3 = cach0.a;
                ibnx.b(object0);
            label_24:
                cach0.a = null;
                cach0.d = 2;
                object0 = this.h(((clcn)object0), ((ByteArrayOutputStream)object3), cach0);
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
        ibuq.f(((String)object0), "jsonString");
        JSONObject jSONObject0 = new JSONObject(((String)object0));
        ArrayList arrayList0 = new ArrayList();
        if(jSONObject0.has("devices") && !jSONObject0.isNull("devices")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("devices");
            ibuq.e(jSONArray0, "getJSONArray(...)");
            int v1 = jSONArray0.length();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(!jSONArray0.isNull(v2)) {
                    JSONObject jSONObject1 = jSONArray0.getJSONObject(v2);
                    ibuq.e(jSONObject1, "getJSONObject(...)");
                    arrayList0.add(cacs.a(jSONObject1));
                }
            }
        }
        Object object4 = new cacu(arrayList0).a;
        ((List)object4).size();
        return object4;
    }

    @Override  // cacc
    public final Object b(Account account0, String s, byte[] arr_b, int v, String s1, String s2, ibrl ibrl0) {
        caco caco0;
        if((ibrl0 instanceof caco)) {
            caco0 = (caco)ibrl0;
            int v1 = caco0.c;
            if((v1 & 0x80000000) == 0) {
                caco0 = new caco(this, ibrl0);
            }
            else {
                caco0.c = v1 - 0x80000000;
            }
        }
        else {
            caco0 = new caco(this, ibrl0);
        }
        Object object0 = caco0.a;
        Object object1 = ibrx.a;
        switch(caco0.c) {
            case 0: {
                ibnx.b(object0);
                new ByteArrayOutputStream();
                hjiz hjiz0 = new hjiz(new File(ccsb.a.a(s1)));
                caco0.c = 1;
                object0 = this.j(account0, s, arr_b, v, hjiz0, s2, caco0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                ibnx.b(object0);
            label_21:
                hjjt hjjt0 = (hjjt)object0;
                try {
                    gmcd gmcd0 = hjjt0.b();
                    ibuq.e(gmcd0, "send(...)");
                    caco0.c = 2;
                    object0 = icpu.c(gmcd0, caco0);
                    if(object0 == object1) {
                        return object1;
                    label_28:
                        ibnx.b(object0);
                    }
                    hjjv hjjv0 = null;
                    if((((hjjw)object0) == null ? null : ((hjjw)object0).b) == null) {
                        if(((hjjw)object0) != null) {
                            hjjv0 = ((hjjw)object0).a;
                        }
                        if(hjjv0 == null) {
                            ((ggtj)cacp.a.j()).x("No response returned from upload and no exception found.");
                            throw new IOException("No response returned from upload.");
                        }
                        ((ggtj)((ggtj)cacp.a.j()).s(((hjjw)object0).a)).x("Transfer Exception.");
                        throw new IOException("Transfer Exception when uploading log file.", ((hjjw)object0).a);
                    }
                    hjjd hjjd0 = ((hjjw)object0).b;
                    int v2 = hjjd0.a;
                    if(v2 == 200) {
                        ibuq.e(hjjd0.c, "getResponseBody(...)");
                        JSONObject jSONObject0 = new JSONObject(new String(ibsw.a(hjjd0.c), ibyo.a));
                        long v3 = 0L;
                        if(jSONObject0.has("logFileId") && !jSONObject0.isNull("logFileId")) {
                            String s3 = jSONObject0.getString("logFileId");
                            ibuq.e(s3, "getString(...)");
                            v3 = Long.parseLong(s3);
                        }
                        cadd cadd0 = new cadd(v3);
                        ((ggtj)cacp.a.h()).B("Upload Log File response: %s", cadd0);
                        return new Long(cadd0.a);
                    }
                    ((ggtj)cacp.a.j()).z("Intrusion Logging upload response code: %d", v2);
                    ggtj ggtj0 = (ggtj)cacp.a.j();
                    ibuq.e(hjjd0.c, "getResponseBody(...)");
                    byte[] arr_b1 = ibsw.a(hjjd0.c);
                    Charset charset0 = StandardCharsets.UTF_8;
                    ibuq.e(charset0, "UTF_8");
                    ggtj0.H("Upload Log File request failed. Status Code [%d]. Message [%s]", v2, new String(arr_b1, charset0));
                    throw new IOException("Upload Log File request failed.");
                }
                catch(Exception exception0) {
                    break;
                }
            }
            case 2: {
                goto label_28;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(cacp.a.j(), "Upload Log File request failed.", exception0);
        throw new IOException("Upload Log File request failed.", exception0);
    }

    public final Object c(Account account0, long v, LocalDate localDate0, ibrl ibrl0) {
        cadc cadc1;
        cacd cacd0;
        if((ibrl0 instanceof cacd)) {
            cacd0 = (cacd)ibrl0;
            int v1 = cacd0.c;
            if((v1 & 0x80000000) == 0) {
                cacd0 = new cacd(this, ibrl0);
            }
            else {
                cacd0.c = v1 - 0x80000000;
            }
        }
        else {
            cacd0 = new cacd(this, ibrl0);
        }
        Object object0 = cacd0.a;
        Object object1 = ibrx.a;
        switch(cacd0.c) {
            case 0: {
                ibnx.b(object0);
                cadc cadc0 = new cadc(cacp.i("encrypted", localDate0, "enc"));
                ((ggtj)cacp.a.h()).A("###### logFileId: %d", v);
                cacd0.d = cadc0;
                cacd0.c = 1;
                object0 = this.f(account0, v, cadc0, cacd0);
                if(object0 == object1) {
                    return object1;
                }
                cadc1 = cadc0;
                goto label_24;
            }
            case 1: {
                cadc1 = cacd0.d;
                ibnx.b(object0);
            label_24:
                gmcd gmcd0 = ((clcn)object0).a();
                cacd0.d = cadc1;
                cacd0.c = 2;
                object0 = icpu.c(gmcd0, cacd0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                cadc1 = cacd0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        clcq clcq0 = ((clcp)object0).a;
        if(clcq0.a() == 200) {
            ((ggtj)cacp.a.h()).B("Downloaded file path: %s", cadc1.a.getPath());
            Object object2 = cadc1.a.getPath();
            ibuq.e(object2, "getPath(...)");
            return object2;
        }
        ((ggtj)cacp.a.h()).B("response: %s", ((clcp)object0));
        ((ggtj)cacp.a.j()).H("Download Log File request failed. Status Code [%d]. Message [%s]", clcq0.a(), clcq0.e());
        throw new IOException("Download Log File request failed.");
    }

    public final Object d(Account account0, ibrl ibrl0) {
        cacf cacf0;
        if((ibrl0 instanceof cacf)) {
            cacf0 = (cacf)ibrl0;
            int v = cacf0.d;
            if((v & 0x80000000) == 0) {
                cacf0 = new cacf(this, ibrl0);
            }
            else {
                cacf0.d = v - 0x80000000;
            }
        }
        else {
            cacf0 = new cacf(this, ibrl0);
        }
        Object object0 = cacf0.b;
        Object object1 = ibrx.a;
        switch(cacf0.d) {
            case 0: {
                ibnx.b(object0);
                cacg cacg0 = new cacg(this, account0, null);
                cacf0.a = account0;
                cacf0.d = 1;
                object0 = icbd.a(cclw.d, cacg0, cacf0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                account0 = cacf0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Bundle)object0) != null) {
            Object object2 = ((Bundle)object0).getString("authtoken");
            if(object2 == null) {
                if(((Bundle)object0).containsKey("errorCode")) {
                    ((ggtj)cacp.a.i()).B("Try to get auth token resulted in error [%s]", ((Bundle)object0).getString("errorCode"));
                }
                ((ggtj)cacp.a.i()).B("Auth failure, authToken is null for %s", account0.name);
                throw new IOException("Failed to get auth token.");
            }
            return object2;
        }
        ((ggtj)cacp.a.i()).B("Auth failure, bundle is null for %s", account0.name);
        throw new IOException("Failed to get auth token.");
    }

    public final Object e(Account account0, ByteArrayOutputStream byteArrayOutputStream0, ibrl ibrl0) {
        caci caci0;
        if((ibrl0 instanceof caci)) {
            caci0 = (caci)ibrl0;
            int v = caci0.d;
            if((v & 0x80000000) == 0) {
                caci0 = new caci(this, ibrl0);
            }
            else {
                caci0.d = v - 0x80000000;
            }
        }
        else {
            caci0 = new caci(this, ibrl0);
        }
        Object object0 = caci0.b;
        Object object1 = ibrx.a;
        switch(caci0.d) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)cacp.a.h()).x("Getting device network request for account");
                caci0.a = byteArrayOutputStream0;
                caci0.d = 1;
                object0 = this.d(account0, caci0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                byteArrayOutputStream0 = caci0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        cacv cacv0 = new cacv(byteArrayOutputStream0);
        ExecutorService executorService0 = Executors.newCachedThreadPool();
        clcj clcj0 = this.e.e(clcg.c((this.f + "/v1/getdevicesforuser"), cjxl.b), cacv0, executorService0, -1, 70400);
        clcj0.n("GET");
        clcj0.h(((String)object0));
        return clcj0.e();
    }

    public final Object f(Account account0, long v, cadc cadc0, ibrl ibrl0) {
        cacj cacj0;
        if((ibrl0 instanceof cacj)) {
            cacj0 = (cacj)ibrl0;
            int v1 = cacj0.d;
            if((v1 & 0x80000000) == 0) {
                cacj0 = new cacj(this, ibrl0);
            }
            else {
                cacj0.d = v1 - 0x80000000;
            }
        }
        else {
            cacj0 = new cacj(this, ibrl0);
        }
        Object object0 = cacj0.b;
        Object object1 = ibrx.a;
        switch(cacj0.d) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)cacp.a.h()).A("Getting download log network request for log file %d", v);
                cacj0.e = cadc0;
                cacj0.a = v;
                cacj0.d = 1;
                object0 = this.d(account0, cacj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v = cacj0.a;
                cadc0 = cacj0.e;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cado.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cado cado0 = (cado)hftp0.b_message;
        cado0.b |= 1;
        cado0.c = v;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        clbc clbc0 = new clbc(null);
        clbc0.c(huht.b());
        clbc0.d(((MessageLite)(((cado)hftv0))), cjxk.c, cadp.a);
        clcf clcf0 = clcg.a(new clbd(clbc0), cjxk.b);
        ((ggtj)cacp.a.h()).B("###### gmsNetworkUrl: %s", clcf0.c());
        ExecutorService executorService0 = Executors.newCachedThreadPool();
        clcj clcj0 = this.e.e(clcf0, cadc0, executorService0, -1, 70400);
        clcj0.n("GET");
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/octet-stream");
        clcj0.m(new clax(claw0));
        clcj0.h(((String)object0));
        return clcj0.e();
    }

    public final Object g(Account account0, long v, ByteArrayOutputStream byteArrayOutputStream0, ibrl ibrl0) {
        cacl cacl0;
        if((ibrl0 instanceof cacl)) {
            cacl0 = (cacl)ibrl0;
            int v1 = cacl0.e;
            if((v1 & 0x80000000) == 0) {
                cacl0 = new cacl(this, ibrl0);
            }
            else {
                cacl0.e = v1 - 0x80000000;
            }
        }
        else {
            cacl0 = new cacl(this, ibrl0);
        }
        Object object0 = cacl0.c;
        Object object1 = ibrx.a;
        switch(cacl0.e) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)cacp.a.h()).A("Getting intrusion logs metadata network request for device %d", v);
                cacl0.b = byteArrayOutputStream0;
                cacl0.a = v;
                cacl0.e = 1;
                object0 = this.d(account0, cacl0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v = cacl0.a;
                byteArrayOutputStream0 = cacl0.b;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cadq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cadq cadq0 = (cadq)hftp0.b_message;
        cadq0.b |= 1;
        cadq0.c = v;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        clbc clbc0 = new clbc(null);
        clbc0.c(huht.b());
        clbc0.d(((MessageLite)(((cadq)hftv0))), cjxn.c, cadr.a);
        clcf clcf0 = clcg.a(new clbd(clbc0), cjxn.b);
        cacv cacv0 = new cacv(byteArrayOutputStream0);
        ExecutorService executorService0 = Executors.newCachedThreadPool();
        clcj clcj0 = this.e.e(clcf0, cacv0, executorService0, -1, 70400);
        clcj0.n("GET");
        clcj0.h(((String)object0));
        return clcj0.e();
    }

    public final Object h(clcn clcn0, ByteArrayOutputStream byteArrayOutputStream0, ibrl ibrl0) {
        cacn cacn0;
        if((ibrl0 instanceof cacn)) {
            cacn0 = (cacn)ibrl0;
            int v = cacn0.d;
            if((v & 0x80000000) == 0) {
                cacn0 = new cacn(this, ibrl0);
            }
            else {
                cacn0.d = v - 0x80000000;
            }
        }
        else {
            cacn0 = new cacn(this, ibrl0);
        }
        Object object0 = cacn0.b;
        Object object1 = ibrx.a;
        switch(cacn0.d) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)cacp.a.h()).x("Sending request to intrusion logging server.");
                gmcd gmcd0 = clcn0.a();
                cacn0.a = byteArrayOutputStream0;
                cacn0.d = 1;
                object0 = icpu.c(gmcd0, cacn0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                byteArrayOutputStream0 = cacn0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        clcq clcq0 = ((clcp)object0).a;
        if(clcq0.a() == 200) {
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            ibuq.e(arr_b, "toByteArray(...)");
            Object object2 = new String(arr_b, ibyo.a);
            ((ggtj)cacp.a.h()).B("Response String: %s", object2);
            return object2;
        }
        ((ggtj)cacp.a.j()).H("Get Devices for User request failed. Status Code [%d]. Message [%s]", clcq0.a(), clcq0.e());
        throw new IOException("Get Devices for User request failed.");
    }

    public static final File i(String s, LocalDate localDate0, String s1) {
        File file1;
        String s2 = localDate0.format(DateTimeFormatter.ofPattern("yyyyMMdd", Locale.US));
        ibuq.e(s2, "format(...)");
        File file0 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String s3 = a.r(s2, s, "/");
        for(int v = 0; true; ++v) {
            file1 = new File(ccsb.a.b(file0, s3 + (v == 0 ? "" : a.f(v, "(", ")")) + "." + s1));
            if(!file1.exists()) {
                break;
            }
        }
        try {
            File file2 = file1.getParentFile();
            if(file2 != null) {
                file2.mkdirs();
            }
            if(file1.createNewFile()) {
                return file1;
            }
            throw new IllegalStateException("Failed to create file despite finding a unique name.");
        }
        catch(IOException iOException0) {
            a.e(cacp.a.i(), "Failed to create temp file: %s", iOException0.getMessage(), iOException0);
            throw iOException0;
        }
        catch(IllegalStateException illegalStateException0) {
            a.e(cacp.a.i(), "Failed to create temp file: %s", illegalStateException0.getMessage(), illegalStateException0);
            throw illegalStateException0;
        }
    }

    public final Object j(Account account0, String s, byte[] arr_b, int v, hjiy hjiy0, String s1, ibrl ibrl0) {
        int v2;
        hjiy hjiy1;
        Object object2;
        String s3;
        byte[] arr_b1;
        String s2;
        cacm cacm0;
        if((ibrl0 instanceof cacm)) {
            cacm0 = (cacm)ibrl0;
            int v1 = cacm0.d;
            if((v1 & 0x80000000) == 0) {
                cacm0 = new cacm(this, ibrl0);
            }
            else {
                cacm0.d = v1 - 0x80000000;
            }
        }
        else {
            cacm0 = new cacm(this, ibrl0);
        }
        Object object0 = cacm0.b;
        Object object1 = ibrx.a;
        switch(cacm0.d) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)cacp.a.h()).x("Getting upload log transfer request");
                s2 = s;
                cacm0.e = s2;
                arr_b1 = arr_b;
                cacm0.f = arr_b1;
                cacm0.h = (hjiz)hjiy0;
                s3 = s1;
                cacm0.g = s3;
                cacm0.a = v;
                cacm0.d = 1;
                object2 = this.d(account0, cacm0);
                if(object2 != object1) {
                    hjiy1 = hjiy0;
                    v2 = v;
                    break;
                }
                return object1;
            }
            case 1: {
                v2 = cacm0.a;
                String s4 = cacm0.g;
                hjiz hjiz0 = cacm0.h;
                byte[] arr_b2 = cacm0.f;
                String s5 = cacm0.e;
                ibnx.b(object0);
                object2 = object0;
                s2 = s5;
                hjiy1 = hjiz0;
                s3 = s4;
                arr_b1 = arr_b2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ckcq ckcq0 = cjxm.b;
        clcf clcf0 = clcg.c((this.f + "/upload/v1/uploadlog"), ckcq0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cads.a).v_newBuilder();
        String s6 = String.valueOf(((String)object2));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cads cads0 = (cads)hftp0.b_message;
        hfuo hfuo0 = cads0.b;
        if(!hfuo0.c()) {
            cads0.b = ProtoLiteMessage.E(hfuo0);
        }
        cads0.b.add("Bearer " + s6);
        String s7 = String.valueOf(hjiy1.e());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cads cads1 = (cads)hftp0.b_message;
        s7.getClass();
        hfuo hfuo1 = cads1.c;
        if(!hfuo1.c()) {
            cads1.c = ProtoLiteMessage.E(hfuo1);
        }
        cads1.c.add(s7);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        claw claw0 = new claw(null);
        claw0.b(((MessageLite)(((cads)hftv0))), cjxm.c, cadt.a);
        clax clax0 = new clax(claw0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fful.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        ffuj ffuj0 = ffuj.a;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ffuj0).v_newBuilder();
        ibuq.f(hftp2, "builder");
        ibuq.f(s2, "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ffuj ffuj1 = (ffuj)hftp2.b_message;
        s2.getClass();
        ffuj1.d = s2;
        ibuq.f(s3, "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ffuj ffuj2 = (ffuj)hftp2.b_message;
        s3.getClass();
        ffuj2.c = s3;
        ProtoLiteMessage hftv1 = hftp2.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((ffuj)hftv1), "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fful fful0 = (fful)hftp1.b_message;
        ((ffuj)hftv1).getClass();
        fful0.c = (ffuj)hftv1;
        fful0.b |= 1;
        ffuk ffuk0 = ffuk.a;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ffuk0).v_newBuilder();
        ibuq.f(hftp3, "builder");
        ByteString hfsf0 = ByteString.copyFrom(arr_b1);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((ffuk)hftv2).d = hfsf0;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((ffuk)hftp3.b_message).e = (long)v2;
        ProtoLiteMessage hftv3 = hftp3.N_build();
        ibuq.e(hftv3, "build(...)");
        ibuq.f(((ffuk)hftv3), "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fful fful1 = (fful)hftp1.b_message;
        ((ffuk)hftv3).getClass();
        fful1.d = (ffuk)hftv3;
        fful1.b |= 2;
        ProtoLiteMessage hftv4 = hftp1.N_build();
        ibuq.e(hftv4, "build(...)");
        ibuq.f(((fful)hftv4), "input");
        JSONObject jSONObject0 = new JSONObject();
        ffuj ffuj3 = ((fful)hftv4).c;
        if(ffuj3 != null) {
            ffuj0 = ffuj3;
        }
        ibuq.e(ffuj0, "getDevice(...)");
        ibuq.f(ffuj0, "input");
        ibuq.e(Instant.ofEpochSecond((ffuj0.e == null ? hfwn.a : ffuj0.e).b, (ffuj0.e == null ? hfwn.a : ffuj0.e).c), "ofEpochSecond(...)");
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.put("device_id", ffuj0.b);
        jSONObject1.put("device_description", ffuj0.c);
        jSONObject1.put("android_id", ffuj0.d);
        jSONObject0.put("device", jSONObject1);
        ffuk ffuk1 = ((fful)hftv4).d;
        if(ffuk1 != null) {
            ffuk0 = ffuk1;
        }
        ibuq.e(ffuk0, "getLogFileKey(...)");
        ibuq.f(ffuk0, "input");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("log_file_key_id", ffuk0.b);
        jSONObject2.put("log_file_id", ffuk0.c);
        jSONObject2.put("encrypted_log_file_encryption_key", Base64.encodeToString(ffuk0.d.toByteArray(), 2));
        jSONObject2.put("version_number", ffuk0.e);
        jSONObject0.put("log_file_key", jSONObject2);
        String s8 = jSONObject0.toString();
        ibuq.e(s8, "toString(...)");
        hjjz hjjz0 = new hjjz();
        hjjz0.a();
        hjka hjka0 = new hjka(hjjz0);
        Object object3 = clgt.b(-1, 70400).a(clcf0, "POST", clax0, hjiy1, s8, hjka0, -1, 70400, ckcq0);
        ((ggtj)cacp.a.h()).x("Transfer created for log");
        return object3;
    }
}

