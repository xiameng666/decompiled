import android.accounts.Account;
import android.content.Context;
import j..util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dmlf {
    public final dmll a;
    private static final bboh b;
    private final dmlo c;
    private final dmlq d;
    private final ibrt e;
    private final Context f;

    static {
        dmlf.b = bboh.b("Pay", bbcu.cZ);
    }

    public dmlf(dmll dmll0, dmlo dmlo0, dmlq dmlq0, ibrt ibrt0, Context context0) {
        this.a = dmll0;
        this.c = dmlo0;
        this.d = dmlq0;
        this.e = ibrt0;
        this.f = context0;
    }

    public static Object a(dmlf dmlf0, List list0, ibrl ibrl0) {
        Object object14;
        Object object13;
        Object object12;
        Object object11;
        Object object10;
        dmlb dmlb1;
        dmlf dmlf1;
        Object object8;
        Object object7;
        Object object5;
        dylc dylc0;
        Object object4;
        Object object3;
        Object object2;
        dmlb dmlb0;
        if((ibrl0 instanceof dmlb)) {
            dmlb0 = (dmlb)ibrl0;
            int v = dmlb0.h;
            if((v & 0x80000000) == 0) {
                dmlb0 = new dmlb(dmlf0, ibrl0);
            }
            else {
                dmlb0.h = v - 0x80000000;
            }
        }
        else {
            dmlb0 = new dmlb(dmlf0, ibrl0);
        }
        Object object0 = dmlb0.f;
        Object object1 = ibrx.a;
        switch(dmlb0.h) {
            case 0: {
                ibnx.b(object0);
                object2 = new LinkedHashSet();
                object3 = new LinkedHashSet();
                object4 = list0.iterator();
                goto label_61;
            }
            case 1: {
                dylc0 = dmlb0.j;
                object5 = dmlb0.e;
                Object object6 = dmlb0.d;
                object7 = dmlb0.c;
                object8 = dmlb0.b;
                Object object9 = dmlb0.a;
                dmlf1 = dmlb0.i;
                ibnx.b(object0);
                dmlb1 = dmlb0;
                object10 = object9;
                object11 = object6;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((Boolean)object0).booleanValue()) {
                ((Set)object10).add(dylc0);
            }
            else {
                ((Set)object8).add(dylc0);
            }
            object12 = object7;
            object13 = object8;
            object14 = object11;
            dmlf0 = dmlf1;
        label_37:
            if(!((Iterator)object5).hasNext()) {
                break;
            }
            Object object15 = ((Iterator)object5).next();
            dmlb1.i = dmlf0;
            dmlb1.a = object10;
            dmlb1.b = object13;
            dmlb1.c = object12;
            dmlb1.d = object14;
            dmlb1.e = object5;
            dmlb1.j = (dylc)object15;
            dmlb1.h = 1;
            Object object16 = dmlf0.b(((dylc)object15), ((Account)object14), dmlf0.f, dmlb1);
            if(object16 == object1) {
                return object1;
            }
            dmlf1 = dmlf0;
            dylc0 = (dylc)object15;
            object11 = object14;
            object8 = object13;
            object7 = object12;
            object0 = object16;
        }
        object4 = object12;
        object2 = object10;
        dmlb0 = dmlb1;
        object3 = object13;
    label_61:
        if(((Iterator)object4).hasNext()) {
            Object object17 = ((Iterator)object4).next();
            object14 = ((dmkx)object17).a;
            object12 = object4;
            object5 = ((dmkx)object17).b.iterator();
            object13 = object3;
            dmlb1 = dmlb0;
            object10 = object2;
            goto label_37;
        }
        return new dmla(((Set)object2), ((Set)object3));
    }

    public final Object b(dylc dylc0, Account account0, Context context0, ibrl ibrl0) {
        dylc dylc3;
        dylc dylc2;
        Object object3;
        String s9;
        String s8;
        long v3;
        long v2;
        dylc dylc1;
        Context context1;
        String s3;
        Object object2;
        String s2;
        dmlc dmlc0;
        if((ibrl0 instanceof dmlc)) {
            dmlc0 = (dmlc)ibrl0;
            int v = dmlc0.f;
            if((v & 0x80000000) == 0) {
                dmlc0 = new dmlc(this, ibrl0);
            }
            else {
                dmlc0.f = v - 0x80000000;
            }
        }
        else {
            dmlc0 = new dmlc(this, ibrl0);
        }
        Object object0 = dmlc0.d;
        Object object1 = ibrx.a;
        switch(dmlc0.f) {
            case 0: {
                ibnx.b(object0);
                long v1 = bbmq.f(context0);
                dyng dyng0 = dylc0.h == null ? dyng.a : dylc0.h;
                String s = (dyng0.b == 9 ? ((dyhl)dyng0.c) : dyhl.a).c;
                ibuq.e(s, "getCardTypeId(...)");
                String s1 = dylc0.d;
                ibuq.e(s1, "getServiceProviderCardId(...)");
                dmle dmle0 = new dmle(this, v1, s, s1, account0, null);
                dmlc0.g = dylc0;
                dmlc0.a = account0;
                dmlc0.b = context0;
                dmlc0.h = s;
                dmlc0.i = s1;
                dmlc0.c = v1;
                dmlc0.f = 1;
                object0 = icbd.a(this.e, dmle0, dmlc0);
                if(object0 != object1) {
                    s2 = s;
                    object2 = account0;
                    s3 = s1;
                    context1 = context0;
                    dylc1 = dylc0;
                    v2 = v1;
                    goto label_44;
                }
                return object1;
            }
            case 1: {
                v2 = dmlc0.c;
                s3 = dmlc0.i;
                s2 = dmlc0.h;
                context1 = (Context)dmlc0.b;
                object2 = dmlc0.a;
                dylc1 = dmlc0.g;
                ibnx.b(object0);
            label_44:
                hkkj hkkj0 = (hkkj)object0;
                if(hwkz.a.b().d()) {
                    return Boolean.valueOf(true);
                }
                try {
                    dmlo dmlo0 = this.c;
                    String s4 = hkkj0.b;
                    ibuq.e(s4, "getApduScriptUrl(...)");
                    if(s4.length() == 0) {
                        throw new IllegalStateException("Empty url from delete card response");
                    }
                    Pattern pattern0 = Pattern.compile(".*/([^/]+)/?$");
                    ibuq.e(pattern0, "compile(...)");
                    Matcher matcher0 = pattern0.matcher(s4);
                    ibuq.e(matcher0, "matcher(...)");
                    if(!matcher0.find()) {
                        throw new IllegalStateException("Failed to extract token from delete script url: " + s4);
                    }
                    String s5 = matcher0.group(1);
                    if(s5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    dmlc0.g = dylc1;
                    dmlc0.a = object2;
                    dmlc0.b = s2;
                    dmlc0.h = s3;
                    dmlc0.i = null;
                    dmlc0.c = v2;
                    dmlc0.f = 2;
                    icbk icbk0 = new icbk(ibsc.c(dmlc0), 1);
                    icbk0.z();
                    clbs clbs0 = clbv.a(context1);
                    String s6 = dmlo0.a;
                    dymd dymd0 = dmgv.e(s6) ? dymd.c : dymd.b;
                    clbc clbc0 = new clbc(null);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyme.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dyme dyme0 = (dyme)hftp0.b_message;
                    dyme0.b |= 1;
                    dyme0.c = s5;
                    ibuq.f(dymd0, "<this>");
                    String s7 = dymd0.ordinal() == 1 ? "sb." : "";
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dyme dyme1 = (dyme)hftp0.b_message;
                    dyme1.b |= 2;
                    dyme1.d = s7;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    clbc0.d(((MessageLite)(((dyme)hftv0))), ckmn.d, dymf.a);
                    clcj clcj0 = clbs0.e(clcg.a(new clbd(clbc0), ckmn.b), new dmln(icbk0), clhl.b.b(clhr.a), -1, 0x5200);
                    claw claw0 = new claw(null);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dymb.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    List list0 = DesugarCollections.unmodifiableList(((dymb)hftp1.b_message).b);
                    ibuq.e(list0, "getBasicAuthList(...)");
                    new hfxu(list0);
                    List list1 = ibpo.b((dmgv.e(s6) ? "Basic RklUQklUX0lQQVNTOjkwNjgxNzkyNjU2NzgxOTIzMTQzNTAwNzc1NTg5MjQzODk4MA==" : "Basic TlhQX0lQQVNTOjkxMDIxZTZkLWMyMjdtb25vLTRlMWQtYjdmZS1yMTlhMjdqdQ=="));
                    ibuq.f(list1, "values");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    dymb dymb0 = (dymb)hftp1.b_message;
                    hfuo hfuo0 = dymb0.b;
                    if(!hfuo0.c()) {
                        dymb0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(list1, dymb0.b);
                    ProtoLiteMessage hftv1 = hftp1.N_build();
                    ibuq.e(hftv1, "build(...)");
                    claw0.b(((MessageLite)(((dymb)hftv1))), ckmn.c, dymc.a);
                    clcj0.m(new clax(claw0));
                    clcj0.e().a();
                    object0 = icbk0.k();
                    if(object0 == object1) {
                        ibsi.b(dmlc0);
                    }
                    if(object0 != object1) {
                        v3 = v2;
                        s8 = s2;
                        s9 = s3;
                        object3 = object2;
                        goto label_128;
                    }
                    return object1;
                }
                catch(IllegalStateException illegalStateException0) {
                    dylc3 = dylc1;
                    break;
                }
                catch(eaqo eaqo0) {
                    dylc3 = dylc1;
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
            }
            case 2: {
                v3 = dmlc0.c;
                s9 = dmlc0.h;
                s8 = (String)dmlc0.b;
                object3 = dmlc0.a;
                dylc2 = dmlc0.g;
                try {
                    ibnx.b(object0);
                    dylc1 = dylc2;
                }
                catch(IllegalStateException illegalStateException0) {
                    dylc3 = dylc2;
                    break;
                }
                catch(eaqo eaqo0) {
                    dylc3 = dylc2;
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
                try {
                label_128:
                    dmlc0.g = dylc1;
                    dmlc0.a = object3;
                    dmlc0.b = s8;
                    dmlc0.h = s9;
                    dmlc0.c = v3;
                    dmlc0.f = 3;
                    dmlp dmlp0 = new dmlp(((fsww)object0), null);
                    object0 = icbd.a(this.d.a, dmlp0, dmlc0);
                    if(object0 != object1) {
                        dylc2 = dylc1;
                        goto label_152;
                    }
                    return object1;
                }
                catch(IllegalStateException illegalStateException0) {
                    dylc3 = dylc1;
                    break;
                }
                catch(eaqo eaqo0) {
                    dylc3 = dylc1;
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
                dylc2 = dylc1;
                goto label_152;
            }
            case 3: {
                v3 = dmlc0.c;
                s9 = dmlc0.h;
                s8 = (String)dmlc0.b;
                object3 = dmlc0.a;
                dylc2 = dmlc0.g;
                try {
                    ibnx.b(object0);
                }
                catch(IllegalStateException illegalStateException0) {
                    dylc3 = dylc2;
                    break;
                }
                catch(eaqo eaqo0) {
                    dylc3 = dylc2;
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
                try {
                label_152:
                    dmld dmld0 = new dmld(this, v3, s8, s9, ((fsww)object0), ((Account)object3), null);
                    dmlc0.g = dylc2;
                    dmlc0.a = null;
                    dmlc0.b = null;
                    dmlc0.h = null;
                    dmlc0.f = 4;
                    object0 = icbd.a(this.e, dmld0, dmlc0);
                }
                catch(IllegalStateException illegalStateException0) {
                    dylc3 = dylc2;
                    break;
                }
                catch(eaqo eaqo0) {
                    dylc3 = dylc2;
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
                if(object0 != object1) {
                    dylc3 = dylc2;
                    goto label_178;
                }
                try {
                    return object1;
                }
                catch(IllegalStateException illegalStateException0) {
                    dylc3 = dylc1;
                    break;
                }
                catch(eaqo eaqo0) {
                    dylc3 = dylc1;
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
            }
            case 4: {
                try {
                    dylc3 = dmlc0.g;
                    ibnx.b(object0);
                label_178:
                    hkkg hkkg0 = (hkkg)object0;
                    return Boolean.valueOf(true);
                }
                catch(IllegalStateException illegalStateException0) {
                    break;
                }
                catch(eaqo eaqo0) {
                    a.e(dmlf.b.i(), "Failed to perform secure element operation: %s", dylc3, eaqo0);
                    return Boolean.valueOf(false);
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.e(dmlf.b.i(), "Failed to remove iPASS card: %s", dylc3, illegalStateException0);
        return Boolean.valueOf(false);
    }
}

