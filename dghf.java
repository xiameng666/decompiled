import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class dghf {
    public final icam a;
    public ibth b;
    public ibth c;
    public final icnl d;
    private final icnl e;
    private final icnl f;
    private final icnl g;
    private final icnl h;

    public dghf() {
        this.e = icnm.a(null);
        this.d = icnm.a(null);
        this.f = icnm.a(null);
        this.g = icnm.a(null);
        this.h = icnm.a(Float.valueOf(0.0f));
        this.a = new icam(false, icaq.a);
        this.b = new dgha();
        this.c = new dghb();
    }

    public final Object a(ibrl ibrl0) {
        long v = hvqs.al();
        return this.e(this.f, v, ibrl0);
    }

    public final Object b(ibrl ibrl0) {
        long v = hvqs.al();
        return this.e(this.g, v, ibrl0);
    }

    public final Object c(ibrl ibrl0) {
        long v = hvqs.am();
        return this.e(this.e, v, ibrl0);
    }

    public final void d(byte[] arr_b) {
        dgfo dgfo0;
        List list4;
        List list2;
        dcjy dcjy4;
        ibps ibps0;
        Object object10;
        int v14;
        String s5;
        long v13;
        long v12;
        int v9;
        int v4;
        dcjy dcjy3;
        dcje dcje0;
        Iterator iterator1;
        ArrayList arrayList1;
        int v1;
        dgeq dgeq0;
        dcjy dcjy1;
        try {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dcjh.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((dcjh)hftv0), "parseFrom(...)");
            if((((dcjh)hftv0).b & 2) == 0) {
                goto label_34;
            }
            else {
                dcjy dcjy0 = ((dcjh)hftv0).d;
                if(dcjy0 == null) {
                    dcjy0 = dcjy.a;
                }
                ibuq.e(dcjy0, "getV1(...)");
                ibuq.f(dcjy0, "<this>");
                switch((dcjx.b(dcjy0.c) == null ? dcjx.a : dcjx.b(dcjy0.c)).ordinal()) {
                    case 1: {
                        if((dcjy0.b & 2) == 0) {
                            dcjy1 = null;
                        }
                        else {
                            goto label_23;
                        }
                        break;
                    }
                    case 2: {
                        if((dcjy0.b & 4) == 0 || ((dcjy0.e == null ? dciz.a : dcjy0.e).b & 1) == 0) {
                            dcjy1 = null;
                        }
                        else {
                            goto label_23;
                        }
                        break;
                    }
                    case 3: {
                        if((dcjy0.b & 8) == 0 || ((dcjy0.f == null ? dcjl.a : dcjy0.f).b & 2) == 0 || ((dcjy0.f == null ? dcjl.a : dcjy0.f).b & 1) == 0) {
                            dcjy1 = null;
                        }
                        else {
                            goto label_23;
                        }
                        break;
                    }
                    case 4: {
                        if((dcjy0.b & 16) == 0 || ((dcjy0.g == null ? dcjo.a : dcjy0.g).b & 1) == 0) {
                            dcjy1 = null;
                        }
                        else {
                            goto label_23;
                        }
                        break;
                    }
                    case 5: {
                        if((dcjy0.b & 0x20) == 0) {
                            dcjy1 = null;
                        }
                        else {
                            goto label_23;
                        }
                        break;
                    }
                    case 6: {
                    label_23:
                        dcjy dcjy2 = ((dcjh)hftv0).d;
                        if(dcjy2 == null) {
                            dcjy2 = dcjy.a;
                        }
                        dcjy1 = dcjy2;
                        break;
                    }
                    case 7: {
                        if((dcjy0.b & 0x40) == 0) {
                            dcjy1 = null;
                        }
                        else {
                            goto label_23;
                        }
                        break;
                    }
                    default: {
                        dcjy1 = null;
                    }
                }
            }
            goto label_35;
        }
        catch(hfur hfur0) {
            dcvz.a.e().f(hfur0).p("[NS_ERROR] Failed to parse incoming bytes as a V1Frame.", new Object[0]);
        }
        dcjy1 = null;
        goto label_35;
    label_34:
        dcjy1 = null;
    label_35:
        if(dcjy1 == null) {
            dcvz.a.e().h("[NS_ERROR] Failed to parse incoming bytes as a control frame %s.", arr_b);
            return;
        }
        int v = (dcjx.b(dcjy1.c) == null ? dcjx.a : dcjx.b(dcjy1.c)).ordinal();
    alab1:
        switch(v) {
            case 2: {
                dciz dciz0 = dcjy1.e == null ? dciz.a : dcjy1.e;
                ibuq.e(dciz0, "getConnectionResponse(...)");
                switch((dciy.b(dciz0.c) == null ? dciy.a : dciy.b(dciz0.c)).ordinal()) {
                    case 1: {
                        Map map0 = DesugarCollections.unmodifiableMap(dciz0.d);
                        ibuq.e(map0, "getAttachmentDetailsMap(...)");
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: map0.entrySet()) {
                            Long long0 = (Long)((Map.Entry)object0).getKey();
                            dciu dciu0 = (dciu)((Map.Entry)object0).getValue();
                            ibns ibns0 = (dciu0.b & 2) == 0 ? null : new ibns(long0, ((long)(dciu0.d == null ? dcjb.a : dciu0.d).c));
                            if(ibns0 != null) {
                                arrayList0.add(ibns0);
                            }
                        }
                        dgeq0 = new dgeh(ibpz.p(arrayList0));
                        break alab1;
                    }
                    case 2: {
                        dgeq0 = dgfz.a;
                        break alab1;
                    }
                    case 3: {
                        dgeq0 = dgfm.a;
                        break alab1;
                    }
                    case 4: {
                        dgeq0 = dggm.a;
                        break alab1;
                    }
                    case 5: {
                        dgeq0 = dggk.a;
                        break alab1;
                    }
                    default: {
                        dgeq0 = null;
                        break alab1;
                    }
                }
            }
            case 6: {
                dgeq0 = dgeq.a;
                break;
            }
            default: {
                if(v != 7) {
                    dgeq0 = null;
                }
                else if((dcjy1.h == null ? dcjr.a : dcjy1.h).d) {
                    dgeq0 = dggh.a;
                }
                else {
                    dgeq0 = new dgfw((dcjy1.h == null ? dcjr.a : dcjy1.h).c);
                }
            }
        }
        if(dgeq0 != null) {
            dcvz.a.b().h("[NS_DEBUG] control command %s received", dgeq0);
            if(ibuq.m(dgeq0, dgeq.a)) {
                this.b.a();
                return;
            }
            if((dgeq0 instanceof dgfw)) {
                icnl icnl0 = this.h;
                do {
                    Object object1 = icnl0.b();
                    ((Number)object1).floatValue();
                }
                while(!icnl0.h(object1, Float.valueOf(((dgfw)dgeq0).a)));
                return;
            }
            if(ibuq.m(dgeq0, dggh.a)) {
                this.c.a();
                return;
            }
            if(!(dgeq0 instanceof dgff)) {
                throw new ibnq();
            }
            icnl icnl1 = this.e;
            do {
                Object object2 = icnl1.b();
                dgff dgff0 = (dgff)object2;
            }
            while(!icnl1.h(object2, ((dgff)dgeq0)));
            return;
        }
        if((dcjx.b(dcjy1.c) == null ? dcjx.a : dcjx.b(dcjy1.c)) == dcjx.b) {
            dcjk dcjk0 = dcjy1.d == null ? dcjk.a : dcjy1.d;
            ibuq.e(dcjk0, "getIntroduction(...)");
            boolean z = this.a.b();
            ibuq.f(dcjk0, "frame");
            try {
                v1 = dgex.a[(dcjj.b(dcjk0.j) == null ? dcjj.a : dcjj.b(dcjk0.j)).ordinal()] == 1 ? 1 : 0;
                hfuo hfuo0 = dcjk0.c;
                ibuq.e(hfuo0, "getFileMetadataList(...)");
                arrayList1 = new ArrayList(ibpo.q(hfuo0, 10));
                iterator1 = hfuo0.iterator();
                while(true) {
                label_107:
                    if(!iterator1.hasNext()) {
                        goto label_149;
                    }
                    Object object3 = iterator1.next();
                    dcje0 = (dcje)object3;
                    dcjy3 = dcjy1;
                    break;
                }
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                dcjy3 = dcjy1;
                goto label_258;
            }
            try {
                long v2 = dcje0.h;
                long v3 = dcje0.e;
                dcjd dcjd0 = dcjd.b(dcje0.d) == null ? dcjd.a : dcjd.b(dcje0.d);
                ibuq.e(dcjd0, "getType(...)");
                ibuq.f(dcjd0, "<this>");
                switch(dcjd0.ordinal()) {
                    case 0: {
                        v4 = 0;
                        break;
                    }
                    case 1: {
                        v4 = 1;
                        break;
                    }
                    case 2: {
                        v4 = 2;
                        break;
                    }
                    case 3: {
                        v4 = 3;
                        break;
                    }
                    case 4: {
                        v4 = 4;
                        break;
                    }
                    case 5: {
                        v4 = 5;
                        break;
                    }
                    case 6: {
                        v4 = 6;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                String s = cuua.d(dcje0.c);
                ibuq.e(s, "buildValidFileName(...)");
                String s1 = dcje0.g;
                ibuq.e(s1, "getMimeType(...)");
                long v5 = dcje0.f;
                boolean z1 = dcje0.k;
                String s2 = dcje0.i;
                long v6 = dcje0.j;
                ibuq.e(s2, "getParentFolder(...)");
                arrayList1.add(new dgfl(v2, v3, v4, s, s1, v5, v6, z1, (ibzk.D(s2) ? null : cuua.e(dcje0.i))));
                iterator1 = iterator1;
                dcjy1 = dcjy3;
                z = z;
                goto label_107;
            label_149:
                dcjy3 = dcjy1;
                hfuo hfuo1 = dcjk0.d;
                ibuq.e(hfuo1, "getTextMetadataList(...)");
                ArrayList arrayList2 = new ArrayList(ibpo.q(hfuo1, 10));
                for(Object object4: hfuo1) {
                    long v7 = ((dcjv)object4).g;
                    long v8 = ((dcjv)object4).e;
                    dcju dcju0 = dcju.b(((dcjv)object4).d);
                    if(dcju0 == null) {
                        dcju0 = dcju.a;
                    }
                    ibuq.e(dcju0, "getType(...)");
                    ibuq.f(dcju0, "<this>");
                    switch(dcju0.ordinal()) {
                        case 0: 
                        case 1: {
                            v9 = 0;
                            break;
                        }
                        case 2: {
                            v9 = 1;
                            break;
                        }
                        case 3: {
                            v9 = 2;
                            break;
                        }
                        case 4: {
                            v9 = 3;
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                    String s3 = ((dcjv)object4).c;
                    ibuq.e(s3, "getTextTitle(...)");
                    arrayList2.add(new dggj(v7, v8, v9, s3, ((dcjv)object4).f, ((dcjv)object4).h));
                }
                hfuo hfuo2 = dcjk0.f;
                ibuq.e(hfuo2, "getWifiCredentialsMetadataList(...)");
                ArrayList arrayList3 = new ArrayList(ibpo.q(hfuo2, 10));
                for(Object object5: hfuo2) {
                    long v10 = ((dckc)object5).f;
                    long v11 = ((dckc)object5).e;
                    String s4 = ((dckc)object5).c;
                    ibuq.e(s4, "getSsid(...)");
                    dckb dckb0 = dckb.b(((dckc)object5).d);
                    if(dckb0 == null) {
                        dckb0 = dckb.a;
                    }
                    ibuq.e(dckb0, "getSecurityType(...)");
                    ibuq.f(dckb0, "<this>");
                    switch(dckb0.ordinal()) {
                        case 0: {
                            v12 = v10;
                            v13 = v11;
                            s5 = s4;
                            v14 = 0;
                            break;
                        }
                        case 1: {
                            v12 = v10;
                            v13 = v11;
                            s5 = s4;
                            v14 = 1;
                            break;
                        }
                        case 2: {
                            v12 = v10;
                            v13 = v11;
                            s5 = s4;
                            v14 = 2;
                            break;
                        }
                        case 3: {
                            v12 = v10;
                            v13 = v11;
                            s5 = s4;
                            v14 = 3;
                            break;
                        }
                        case 4: {
                            v12 = v10;
                            v13 = v11;
                            s5 = s4;
                            v14 = 4;
                            break;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                    arrayList3.add(new dggo(v12, v13, s5, v14));
                }
                hfuo hfuo3 = dcjk0.g;
                ibuq.e(hfuo3, "getAppMetadataList(...)");
                ArrayList arrayList4 = new ArrayList(ibpo.q(hfuo3, 10));
                for(Object object6: hfuo3) {
                    dcis dcis0 = (dcis)object6;
                    ibqm ibqm0 = new ibqm(null);
                    int v15 = 0;
                    for(Object object7: dcis0.g) {
                        ibuq.c(((String)object7));
                        Object object8 = dcis0.e.get(v15);
                        ibuq.e(object8, "get(...)");
                        long v16 = ((Number)object8).longValue();
                        Object object9 = dcis0.h.get(v15);
                        ibuq.e(object9, "get(...)");
                        ibqm0.add(new dgem(((String)object7), v16, ((Number)object9).longValue()));
                        ++v15;
                    }
                    List list0 = ibpo.a(ibqm0);
                    long v17 = dcis0.f;
                    String s6 = dcis0.c;
                    ibuq.e(s6, "getAppName(...)");
                    long v18 = dcis0.d;
                    String s7 = dcis0.i;
                    ibuq.e(s7, "getPackageName(...)");
                    arrayList4.add(new dgen(v17, s6, v18, s7, list0));
                }
                object10 = new dgfc(v1, ((dcjk0.b & 1) == 0 ? null : dcjk0.e), arrayList1, arrayList2, arrayList3, arrayList4);
                if(hvqz.o() && z) {
                    ibps0 = dcjk0.k;
                    ibuq.c(ibps0);
                }
                else {
                    ibps0 = ibps.a;
                }
                object10.h = ibps0;
                goto label_260;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
            }
        label_258:
            dcvz.a.e().f(illegalArgumentException0).h("Received invalid introduction frame: %s", dcjk0);
            object10 = null;
        label_260:
            if(object10 == null) {
                return;
            }
            icnl icnl2 = this.d;
            do {
                Object object11 = icnl2.b();
                dgfc dgfc0 = (dgfc)object11;
            }
            while(!icnl2.h(object11, object10));
            dcjy4 = dcjy3;
            if((dcjy4.d == null ? dcjk.a : dcjy4.d).h) {
                this.c.a();
            }
        }
        else {
            dcjy4 = dcjy1;
        }
        if((dcjx.b(dcjy4.c) == null ? dcjx.a : dcjx.b(dcjy4.c)) == dcjx.d) {
            icnl icnl3 = this.f;
            while(true) {
                Object object12 = icnl3.b();
                dgfn dgfn0 = (dgfn)object12;
                dcjl dcjl0 = dcjy4.f == null ? dcjl.a : dcjy4.f;
                ibuq.e(dcjl0, "getPairedKeyEncryption(...)");
                ibuq.f(dcjl0, "frame");
                byte[] arr_b1 = dcjl0.c.toByteArray();
                ibuq.e(arr_b1, "toByteArray(...)");
                List list1 = ibpg.J(arr_b1);
                if((dcjl0.b & 4) != 0) {
                    byte[] arr_b2 = dcjl0.e.toByteArray();
                    if(arr_b2 != null) {
                        list2 = ibpg.J(arr_b2);
                        goto label_286;
                    }
                }
                list2 = null;
            label_286:
                byte[] arr_b3 = dcjl0.d.toByteArray();
                ibuq.e(arr_b3, "toByteArray(...)");
                List list3 = ibpg.J(arr_b3);
                if((dcjl0.b & 8) != 0) {
                    byte[] arr_b4 = dcjl0.f.toByteArray();
                    if(arr_b4 != null) {
                        list4 = ibpg.J(arr_b4);
                        goto label_295;
                    }
                }
                list4 = null;
            label_295:
                if(!icnl3.h(object12, new dgfn(list1, list2, list3, list4))) {
                    continue;
                }
                goto label_296;
            }
        }
        else {
        label_296:
            if((dcjx.b(dcjy4.c) == null ? dcjx.a : dcjx.b(dcjy4.c)) == dcjx.e) {
                goto label_297;
            }
            return;
        }
    label_297:
        icnl icnl4 = this.g;
        do {
            Object object13 = icnl4.b();
            dgfr dgfr0 = (dgfr)object13;
            dcjo dcjo0 = dcjy4.g == null ? dcjo.a : dcjy4.g;
            ibuq.e(dcjo0, "getPairedKeyResult(...)");
            ibuq.f(dcjo0, "frame");
            switch((dcjn.b(dcjo0.c) == null ? dcjn.a : dcjn.b(dcjo0.c)).ordinal()) {
                case 1: {
                    gzad gzad0 = gzad.b(dcjo0.d) == null ? gzad.a : gzad.b(dcjo0.d);
                    ibuq.e(gzad0, "getOsType(...)");
                    dgfo0 = new dgfp(gzad0);
                    break;
                }
                case 3: {
                    dgfo0 = dgfq.a;
                    break;
                }
                default: {
                    dgfo0 = dgfo.a;
                }
            }
        }
        while(!icnl4.h(object13, dgfo0));
    }

    public final Object e(icnl icnl0, long v, ibrl ibrl0) {
        dghc dghc0;
        if((ibrl0 instanceof dghc)) {
            dghc0 = (dghc)ibrl0;
            int v1 = dghc0.c;
            if((v1 & 0x80000000) == 0) {
                dghc0 = new dghc(this, ibrl0);
            }
            else {
                dghc0.c = v1 - 0x80000000;
            }
        }
        else {
            dghc0 = new dghc(this, ibrl0);
        }
        Object object0 = dghc0.a;
        Object object1 = ibrx.a;
        switch(dghc0.c) {
            case 0: {
                ibnx.b(object0);
                dghe dghe0 = new dghe(icnl0, null);
                dghc0.d = icnl0;
                dghc0.c = 1;
                object0 = icfo.c(v, dghe0, dghc0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                icnl0 = dghc0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!icnl0.h(icnl0.b(), null)) {
        }
        return object0;
    }
}

