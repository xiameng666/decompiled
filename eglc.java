import android.accounts.Account;
import android.content.ContentValues;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class eglc implements Callable {
    public final PeopleGalChimeraProvider a;
    public final int b;
    public final String[] c;
    public final Account d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final ProtoLiteBuilder k;

    public eglc(PeopleGalChimeraProvider peopleGalChimeraProvider0, int v, String[] arr_s, Account account0, String s, String s1, long v1, boolean z, boolean z1, ProtoLiteBuilder hftp0, String s2) {
        this.a = peopleGalChimeraProvider0;
        this.b = v;
        this.c = arr_s;
        this.d = account0;
        this.e = s;
        this.f = s1;
        this.g = v1;
        this.h = z;
        this.i = z1;
        this.k = hftp0;
        this.j = s2;
    }

    @Override
    public final Object call() {
        String s8;
        Iterator iterator2;
        int v52;
        ProtoLiteBuilder hftp6;
        int v51;
        int v50;
        boolean z2;
        int v49;
        int v48;
        int v47;
        int v46;
        int v45;
        int v43;
        int v42;
        String s7;
        int v41;
        int v40;
        int v39;
        int v38;
        int v37;
        int v36;
        int v35;
        int v34;
        int v33;
        int v32;
        ProtoLiteBuilder hftp4;
        int v31;
        String[] arr_s1;
        TreeMap treeMap1;
        int v30;
        int v27;
        int v26;
        int v25;
        int v24;
        ProtoLiteBuilder hftp3;
        String[] arr_s;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        String s2;
        gsth gsth0;
        eglc eglc0 = this;
        Account account0 = eglc0.d;
        ProtoLiteBuilder hftp0 = eglc0.k;
        String s = eglc0.e;
        if(s != null && s.length() >= 2) {
            long v = eglc0.g;
            int v1 = eglc0.b;
            int v2 = v1 == 5 ? 1 : 0;
            long v3 = v2 == 0 ? v : hxdy.a.f().i() * v;
            PeopleGalChimeraProvider peopleGalChimeraProvider0 = eglc0.a;
            long v4 = Math.min(v3, hxdy.a.f().g());
            baqr baqr0 = peopleGalChimeraProvider0.b(account0);
            gstg gstg0 = gstg.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gstg0).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gstg)hftp1.b_message).e = 0x93;
            String s1 = Uri.decode(s);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s1.getClass();
            ((gstg)hftv0).c = s1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gstg)hftp1.b_message).d = (int)v4;
            ProtoLiteBuilder hftp2 = egkx.a(eglc0.j);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gstg gstg1 = (gstg)hftp1.b_message;
            gsru gsru0 = (gsru)hftp2.N_build();
            gsru0.getClass();
            gstg1.f = gsru0;
            gstg1.b |= 2;
            gstg gstg2 = (gstg)hftp1.N_build();
            try {
                egkc egkc0 = new egkc(peopleGalChimeraProvider0.a.c, cmlp.a, ckst.b);
                long v5 = TimeUnit.SECONDS.toMillis(hxdy.c());
                if(egkc.a == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gstg0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gsth.a));
                    egkc.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalAutocompleteService/ListAutocompletions", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gsth0 = (gsth)egkc0.b.callUnaryWithAuth(egkc.a, baqr0, gstg2, v5, TimeUnit.MILLISECONDS, egkc0.c);
                s2 = account0.name;
                v6 = -1;
                v7 = -1;
                v8 = 0;
                v9 = -1;
                v10 = -1;
                v11 = -1;
                v12 = -1;
                v13 = -1;
                v14 = -1;
                v15 = -1;
                v16 = -1;
                v17 = -1;
                v18 = -1;
                v19 = -1;
                v20 = -1;
                v21 = -1;
                v22 = -1;
            }
            catch(acse | iapl exception0) {
                try {
                    egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                    throw exception0;
                }
                catch(acse acse0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gipi)hftp0.b_message).d = 3;
                    ((gipi)hftp0.b_message).b |= 2;
                    PeopleGalChimeraProvider.f(hftp0, acse0);
                    egig.b("PeopleGalProvider", "Error listAutocompletions grpc response: " + acse0.toString());
                    return null;
                }
                catch(iapl iapl0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gipi)hftp0.b_message).d = 14;
                    ((gipi)hftp0.b_message).b |= 2;
                    int v23 = iapl0.a.t.r;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gipi gipi0 = (gipi)hftp0.b_message;
                    gipi0.b |= 16;
                    gipi0.f = v23;
                    PeopleGalChimeraProvider.f(hftp0, iapl0);
                    egig.b("PeopleGalProvider", "Error listAutocompletions grpc response: " + iapl0.toString());
                    return null;
                }
            }
            while(true) {
                arr_s = eglc0.c;
                hftp3 = hftp0;
                v24 = v1;
                v25 = v6;
                v26 = v9;
                if(v8 >= arr_s.length) {
                    break;
                }
                String s3 = arr_s[v8];
                if("display_name".equals(s3)) {
                    v10 = v8;
                }
                else if("display_name_alt".equals(s3)) {
                    v12 = v8;
                }
                else if("display_name_source".equals(s3)) {
                    v11 = v8;
                }
                else if("has_phone_number".equals(s3)) {
                    v13 = v8;
                }
                else if("photo_uri".equals(s3)) {
                    v7 = v8;
                }
                else if("photo_thumb_uri".equals(s3)) {
                    v9 = v8;
                    v6 = v25;
                    goto label_144;
                }
                else if("_id".equals(s3)) {
                    v15 = v8;
                }
                else if("contact_id".equals(s3)) {
                    v6 = v8;
                    goto label_143;
                }
                else if("lookup".equals(s3)) {
                    v14 = v8;
                }
                else if(v2 == 0) {
                    if("data1".equals(s3)) {
                        v16 = v8;
                    }
                    else if("data2".equals(s3)) {
                        v17 = v8;
                    }
                    else if("data3".equals(s3)) {
                        v18 = v8;
                    }
                }
                else if("data1".equals(s3)) {
                    v19 = v8;
                }
                else if("data2".equals(s3)) {
                    v21 = v8;
                }
                else if("data3".equals(s3)) {
                    v22 = v8;
                }
                else if("data4".equals(s3)) {
                    v20 = v8;
                }
                v6 = v25;
            label_143:
                v9 = v26;
            label_144:
                ++v8;
                v2 = v2;
                hftp0 = hftp3;
                v1 = v24;
            }
            String s4 = eglc0.f;
            if("sort_key".equals(s4)) {
                v27 = 1;
            }
            else if("sort_key_alt".equals(s4)) {
                v27 = 2;
            }
            else {
                egig.k("PeopleGalProvider", "Ignoring unsupported sort order: " + s4);
                v27 = 3;
            }
            TreeMap treeMap0 = new TreeMap(new egks());
            int v28 = 0;
            int v29 = 1;
            while(true) {
                if(v28 >= gsth0.b.size()) {
                    arr_s1 = arr_s;
                    treeMap1 = treeMap0;
                    hftp4 = hftp3;
                    break;
                }
                gsrl gsrl0 = (gsrl)gsth0.b.get(v28);
                gdmq gdmq0 = gsrl0.b == 4 ? ((gdmq)gsrl0.c) : gdmq.a;
                Pair pair0 = egkw.a(gdmq0);
                if(pair0 == null) {
                    v30 = v7;
                    treeMap1 = treeMap0;
                    arr_s1 = arr_s;
                    v31 = v27;
                    v38 = v13;
                    hftp4 = hftp3;
                    v32 = v15;
                    v33 = v16;
                    v34 = v18;
                    v41 = v20;
                    v35 = v10;
                    v36 = v11;
                    v37 = v12;
                    v39 = v14;
                    v40 = v19;
                label_438:
                    v49 = v21;
                    v48 = v22;
                    v46 = v25;
                    v45 = v24;
                    s8 = s2;
                    v47 = v17;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ((gipi)hftp4.b_message).e = 1;
                    ((gipi)hftp4.b_message).b |= 4;
                    egig.b("AutocompleteCursorUtil", "Can\'t find appropriate name for the contact.");
                }
                else {
                    if(pair0.first == null) {
                        v30 = v7;
                        treeMap1 = treeMap0;
                        arr_s1 = arr_s;
                        v31 = v27;
                        hftp4 = hftp3;
                        v32 = v15;
                        v33 = v16;
                        v34 = v18;
                        v35 = v10;
                        v36 = v11;
                        v37 = v12;
                        v38 = v13;
                        v39 = v14;
                        v40 = v19;
                        v41 = v20;
                        goto label_438;
                    }
                    String s5 = egkw.b(gdmq0, ((String)pair0.first));
                    String s6 = (String)pair0.first;
                    if(v27 == 1) {
                        s7 = s6;
                    }
                    else if(v27 == 2) {
                        v31 = 2;
                        s7 = s5;
                        goto label_194;
                    }
                    else {
                        s7 = "";
                    }
                    v31 = v27;
                label_194:
                    Object[] arr_object = new Object[arr_s.length];
                    arr_s1 = arr_s;
                    if(v10 != -1) {
                        arr_object[v10] = pair0.first;
                    }
                    if(v11 != -1) {
                        arr_object[v11] = pair0.second;
                    }
                    if(v12 != -1) {
                        arr_object[v12] = s5;
                    }
                    if(v13 != -1) {
                        arr_object[v13] = Boolean.valueOf(((boolean)(gdmq0.i.isEmpty() ^ 1)));
                    }
                    boolean z = eglc0.i;
                    if(v7 != -1 && PeopleGalChimeraProvider.c(gdmq0)) {
                        v30 = v7;
                        arr_object[v30] = PeopleGalChimeraProvider.a(s2, false, gdmq0.c, z);
                    }
                    else {
                        v30 = v7;
                    }
                    v42 = v26;
                    if(v42 != -1 && PeopleGalChimeraProvider.c(gdmq0)) {
                        v26 = v42;
                        arr_object[v26] = PeopleGalChimeraProvider.a(s2, true, gdmq0.c, z);
                    }
                    else {
                        v26 = v42;
                    }
                    v43 = v25;
                    if(v43 != -1) {
                        arr_object[v43] = v29;
                    }
                    int v44 = v14;
                    if(v44 != -1) {
                        arr_object[v44] = gdmq0.c;
                    }
                    boolean z1 = eglc0.h;
                    s8 = s2;
                    if(v24 == 4) {
                        HashSet hashSet0 = new HashSet();
                        v45 = 4;
                        if(gdmq0.h.isEmpty()) {
                        label_304:
                            v46 = v43;
                            v51 = v15;
                            v33 = v16;
                            v47 = v17;
                            treeMap1 = treeMap0;
                            v39 = v44;
                            v34 = v18;
                            v35 = v10;
                            hftp6 = hftp3;
                            v36 = v11;
                            v37 = v12;
                            goto label_382;
                        }
                        else {
                            List list0 = efui.l(gdmq0.h, gdmq0.c);
                            if(list0 == null) {
                                hftp4 = hftp3;
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ((gipi)hftp4.b_message).e = 3;
                                ((gipi)hftp4.b_message).b |= 4;
                                egig.b("AutocompleteCursorUtil", "Error converting emails.");
                                v46 = v43;
                                v35 = v10;
                                v32 = v15;
                                v33 = v16;
                                v47 = v17;
                                treeMap1 = treeMap0;
                                v39 = v44;
                                v36 = v11;
                                v38 = v13;
                                v34 = v18;
                                v41 = v20;
                                v48 = v22;
                                v37 = v12;
                                v40 = v19;
                                v49 = v21;
                                goto label_449;
                            }
                            else {
                                ProtoLiteBuilder hftp5 = hftp3;
                                z2 = false;
                                Iterator iterator0 = list0.iterator();
                                while(iterator0.hasNext()) {
                                    Object object0 = iterator0.next();
                                    ContentValues contentValues0 = (ContentValues)object0;
                                    if(z1) {
                                        v50 = v43;
                                        if(!hashSet0.add(gfqz.c(contentValues0.getAsString("data1")))) {
                                            goto label_284;
                                        }
                                    }
                                    else {
                                        v50 = v43;
                                    }
                                    if(v16 != -1) {
                                        arr_object[v16] = contentValues0.get("data1");
                                    }
                                    if(v17 != -1) {
                                        arr_object[v17] = contentValues0.get("data2");
                                    }
                                    if(v18 != -1) {
                                        arr_object[v18] = contentValues0.get("data3");
                                    }
                                    if(v15 != -1) {
                                        arr_object[v15] = (int)(treeMap0.size() + 1);
                                    }
                                    Object[] arr_object1 = (Object[])arr_object.clone();
                                    treeMap0.put(new Pair(s7, v29), arr_object1);
                                    v18 = v18;
                                    hftp5 = hftp5;
                                    v44 = v44;
                                    z1 = z1;
                                    z2 = true;
                                    v15 = v15;
                                    v17 = v17;
                                    v16 = v16;
                                    hashSet0 = hashSet0;
                                label_284:
                                    iterator0 = iterator0;
                                    v43 = v50;
                                }
                                v46 = v43;
                                v51 = v15;
                                v33 = v16;
                                v47 = v17;
                                treeMap1 = treeMap0;
                                v39 = v44;
                                v34 = v18;
                                v35 = v10;
                                v36 = v11;
                                v37 = v12;
                                v38 = v13;
                                v41 = v20;
                                v48 = v22;
                                hftp6 = hftp5;
                                v52 = v19;
                                v49 = v21;
                                goto label_388;
                            }
                            goto label_304;
                        }
                        goto label_316;
                    }
                    else {
                    label_316:
                        v35 = v10;
                        hftp6 = hftp3;
                        v45 = v24;
                        v46 = v43;
                        v51 = v15;
                        v33 = v16;
                        v47 = v17;
                        v39 = v44;
                        v34 = v18;
                        treeMap1 = treeMap0;
                        if(v2 == 0) {
                            goto label_393;
                        }
                        else {
                            v36 = v11;
                            HashSet hashSet1 = new HashSet();
                            v37 = v12;
                            if(!gdmq0.i.isEmpty()) {
                                v38 = v13;
                                List list1 = efui.a.k(gdmq0.i, gdmq0.c);
                                if(list1 == null) {
                                    if(!hftp6.b_message.isImmutable()) {
                                        hftp6.ensureMutable();
                                    }
                                    ((gipi)hftp6.b_message).e = 2;
                                    ((gipi)hftp6.b_message).b |= 4;
                                    egig.b("AutocompleteCursorUtil", "Error converting phone numbers");
                                    v32 = v51;
                                    hftp4 = hftp6;
                                    v40 = v19;
                                    v41 = v20;
                                    v49 = v21;
                                    v48 = v22;
                                    goto label_449;
                                }
                                else {
                                    z2 = false;
                                    for(Iterator iterator1 = list1.iterator(); iterator1.hasNext(); iterator1 = iterator2) {
                                        Object object1 = iterator1.next();
                                        ContentValues contentValues1 = (ContentValues)object1;
                                        String s9 = contentValues1.getAsString("data4");
                                        if(z1) {
                                            iterator2 = iterator1;
                                            if(!hashSet1.add(gqiu.a((s9 == null ? contentValues1.getAsString("data1") : s9)))) {
                                                continue;
                                            }
                                        }
                                        else {
                                            iterator2 = iterator1;
                                        }
                                        if(v19 != -1) {
                                            arr_object[v19] = contentValues1.get("data1");
                                        }
                                        if(v20 != -1) {
                                            arr_object[v20] = s9;
                                        }
                                        if(v21 != -1) {
                                            arr_object[v21] = contentValues1.get("data2");
                                        }
                                        if(v22 != -1) {
                                            arr_object[v22] = contentValues1.get("data3");
                                        }
                                        if(v51 != -1) {
                                            arr_object[v51] = (int)(treeMap1.size() + 1);
                                        }
                                        Object[] arr_object2 = (Object[])arr_object.clone();
                                        treeMap1.put(new Pair(s7, v29), arr_object2);
                                        v22 = v22;
                                        v20 = v20;
                                        hashSet1 = hashSet1;
                                        v21 = v21;
                                        z2 = true;
                                        v19 = v19;
                                    }
                                    v52 = v19;
                                    v41 = v20;
                                    v49 = v21;
                                    v48 = v22;
                                    goto label_388;
                                }
                            }
                        }
                    }
                label_382:
                    v38 = v13;
                    v52 = v19;
                    v41 = v20;
                    v49 = v21;
                    v48 = v22;
                    z2 = false;
                label_388:
                    v32 = v51;
                    v40 = v52;
                    if(!z2) {
                        hftp4 = hftp6;
                        goto label_449;
                    label_393:
                        v36 = v11;
                        v37 = v12;
                        v38 = v13;
                        v40 = v19;
                        v41 = v20;
                        v49 = v21;
                        v48 = v22;
                        if(v51 != -1) {
                            arr_object[v51] = v29;
                        }
                        if(gdmq0.h.isEmpty()) {
                            v32 = v51;
                        }
                        else {
                            List list2 = efui.l(gdmq0.h, gdmq0.c);
                            if(list2 != null && !list2.isEmpty()) {
                                ContentValues contentValues2 = (ContentValues)list2.get(0);
                                v32 = v51;
                                if(v33 != -1) {
                                    arr_object[v33] = contentValues2.get("data1");
                                }
                                if(v47 != -1) {
                                    arr_object[v47] = contentValues2.get("data2");
                                }
                                if(v34 != -1) {
                                    arr_object[v34] = contentValues2.get("data3");
                                }
                            }
                            else {
                                v32 = v51;
                                hftp4 = hftp6;
                                goto label_449;
                            }
                        }
                        treeMap1.put(new Pair(s7, v29), arr_object);
                    }
                    hftp4 = hftp6;
                    if(((long)(v29 + 1)) > v) {
                        break;
                    }
                    ++v29;
                }
            label_449:
                ++v28;
                eglc0 = this;
                v17 = v47;
                treeMap0 = treeMap1;
                v22 = v48;
                v10 = v35;
                s2 = s8;
                v24 = v45;
                v20 = v41;
                v25 = v46;
                v11 = v36;
                v14 = v39;
                v21 = v49;
                v7 = v30;
                v27 = v31;
                v16 = v33;
                hftp3 = hftp4;
                v19 = v40;
                v15 = v32;
                v12 = v37;
                v13 = v38;
                arr_s = arr_s1;
                v18 = v34;
                gsth0 = gsth0;
            }
            Object object2 = new MatrixCursor(arr_s1, treeMap1.size());
            for(Object object3: treeMap1.values()) {
                ((MatrixCursor)object2).addRow(((Object[])object3));
            }
            int v53 = ((MatrixCursor)object2).getCount();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            gipi gipi1 = (gipi)hftp4.b_message;
            gipi1.b |= 0x20;
            gipi1.g = v53;
            return object2;
        }
        egig.b("PeopleGalProvider", "Not enough query characters.");
        return null;
    }
}

