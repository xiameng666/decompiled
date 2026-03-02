import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import jeb.synthetic.FIN;

final class iaxm implements Runnable {
    public final iaoq a;
    final iaxp b;

    public iaxm(iaxp iaxp0, iaoq iaoq0) {
        Objects.requireNonNull(iaxp0);
        this.b = iaxp0;
        super();
        gftb.z(iaoq0, "savedListener");
        this.a = iaoq0;
    }

    @Override
    public final void run() {
        iaxl iaxl0;
        iaps iaps0;
        iaoo iaoo1;
        Object object2;
        int v3;
        gqff gqff0;
        ArrayList arrayList1;
        iaxn iaxn0;
        List list1;
        Exception exception1;
        List list0;
        iaxh iaxh1;
        iaor iaor0;
        String s;
        iaxp iaxp0;
        iaxh iaxh0;
        Logger logger0 = iaxp.a;
        if(logger0.isLoggable(Level.FINER)) {
            logger0.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of " + this.b.i);
        }
        try {
            iaxh0 = null;
            iaxp0 = this.b;
            s = iaxp0.i;
            InetSocketAddress inetSocketAddress0 = InetSocketAddress.createUnresolved(s, iaxp0.j);
            iapb iapb0 = (inetSocketAddress0 instanceof InetSocketAddress) ? ibdb.a(inetSocketAddress0) : null;
            ialw ialw0 = iapb0 == null ? null : new ialw(iapb0);
            iaor0 = new iaor();
            if(ialw0 == null) {
                iaxh1 = new iaxh();
                goto label_16;
            }
            else {
                if(logger0.isLoggable(Level.FINER)) {
                    logger0.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", a.ab(ialw0, "Using proxy address "));
                }
                iaor0.a = new iapm(null, Collections.singletonList(ialw0));
                goto label_161;
            }
            goto label_187;
        }
        catch(IOException iOException0) {
            goto label_165;
        }
        catch(Throwable throwable0) {
            goto label_177;
        }
        try {
        label_16:
            list0 = DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(s)));
            goto label_29;
        }
        catch(Exception exception0) {
            try {
                gfut.e(exception0);
                throw new RuntimeException(exception0);
            }
            catch(Throwable throwable1) {
                exception1 = exception0;
            }
        }
        catch(Throwable throwable1) {
            exception1 = null;
        }
        try {
            try {
                if(exception1 != null) {
                    iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAddresses", "Address resolution failure", exception1);
                }
                throw throwable1;
            label_29:
                ArrayList arrayList0 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    arrayList0.add(new ialw(new InetSocketAddress(((InetAddress)object0), iaxp0.j)));
                }
                iaxh1.b = DesugarCollections.unmodifiableList(arrayList0);
                goto label_40;
            }
            catch(Exception exception2) {
                try {
                    iaxh1.a = iapk.q.f("Unable to resolve host " + iaxp0.i).e(exception2);
                    goto label_153;
                label_40:
                    if(iaxp.e) {
                        list1 = Collections.EMPTY_LIST;
                        boolean z = iaxp.d;
                        String s1 = iaxp0.i;
                        if(!iaxp.c) {
                            iaxn0 = null;
                        }
                        else if(!"localhost".equalsIgnoreCase(s1)) {
                            if(s1.contains(":")) {
                                iaxn0 = null;
                            }
                            else {
                                int v1 = 1;
                                for(int v = 0; v < s1.length(); ++v) {
                                    int v2 = s1.charAt(v);
                                    if(v2 != 46) {
                                        v1 &= (v2 < 0x30 || v2 > 57 ? 0 : 1);
                                    }
                                }
                                if(v1 == 0) {
                                label_59:
                                    iaxn0 = (iaxn)iaxp0.h.get();
                                    if(iaxn0 == null) {
                                        iaxo iaxo0 = iaxp.f;
                                        if(iaxo0 != null) {
                                            iaxn0 = iaxo0.a();
                                        }
                                    }
                                }
                                else {
                                    iaxn0 = null;
                                }
                            }
                        }
                        else if(!z) {
                            iaxn0 = null;
                        }
                        else {
                            goto label_59;
                        }
                        if(iaxn0 != null) {
                            goto label_71;
                        }
                        goto label_75;
                    }
                    goto label_153;
                }
                catch(IOException iOException0) {
                    goto label_165;
                }
            }
            try {
            label_71:
                list1 = iaxn0.a();
                goto label_75;
            }
            catch(Exception exception3) {
                try {
                    iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", exception3);
                label_75:
                    if(list1.isEmpty()) {
                        iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{iaxp0.i});
                        goto label_151;
                    }
                    else {
                        Random random0 = iaxp0.g;
                        String s2 = iaxp.e();
                        goto label_80;
                    }
                    goto label_152;
                }
                catch(IOException iOException0) {
                    goto label_165;
                }
            }
            try {
                try {
                label_80:
                    arrayList1 = new ArrayList();
                    Iterator iterator1 = list1.iterator();
                    while(true) {
                    label_82:
                        if(!iterator1.hasNext()) {
                            goto label_105;
                        }
                        Object object1 = iterator1.next();
                        String s3 = (String)object1;
                        if(s3.startsWith("grpc_config=")) {
                            gqff0 = new gqff(new StringReader(s3.substring(12)));
                            v3 = FIN.finallyOpen$NT();
                            object2 = iazl.a(gqff0);
                            break;
                        }
                        iaxp.a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{s3});
                    }
                }
                catch(IOException exception4) {
                    goto label_103;
                }
                try {
                    FIN.finallyCodeBegin$NT(v3);
                    gqff0.close();
                    goto label_96;
                }
                catch(IOException iOException1) {
                    try {
                        iazl.a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", iOException1);
                    label_96:
                        FIN.finallyCodeEnd$NT(v3);
                        if(!(object2 instanceof List)) {
                            throw new ClassCastException("wrong type " + object2);
                        }
                        iazm.j(((List)object2));
                        arrayList1.addAll(((List)object2));
                        goto label_82;
                    }
                    catch(IOException exception4) {
                    }
                    goto label_103;
                }
            }
            catch(RuntimeException exception4) {
                try {
                label_103:
                    iaoo iaoo0 = new iaoo(iapk.d.f("failed to parse TXT records").e(exception4));
                    goto label_144;
                label_105:
                    Object object3 = null;
                    for(Object object4: arrayList1) {
                        Map map0 = (Map)object4;
                        try {
                            for(Object object5: map0.entrySet()) {
                                Object object6 = ((Map.Entry)object5).getKey();
                                gfuy.b(iaxp.b.contains(object6), "Bad key: %s", ((Map.Entry)object5));
                            }
                            object3 = null;
                            List list2 = iazm.h(map0, "clientLanguage");
                            if(list2 != null && !list2.isEmpty()) {
                                Iterator iterator4 = list2.iterator();
                                while(true) {
                                    if(!iterator4.hasNext()) {
                                        goto label_138;
                                    }
                                    Object object7 = iterator4.next();
                                    if("java".equalsIgnoreCase(((String)object7))) {
                                        break;
                                    }
                                }
                            }
                            Double double0 = iazm.b(map0, "percentage");
                            if(double0 == null) {
                            label_128:
                                List list3 = iazm.h(map0, "clientHostname");
                                if(list3 != null && !list3.isEmpty()) {
                                    Iterator iterator5 = list3.iterator();
                                    while(true) {
                                        if(!iterator5.hasNext()) {
                                            goto label_138;
                                        }
                                        Object object8 = iterator5.next();
                                        if(((String)object8).equals(s2)) {
                                            break;
                                        }
                                    }
                                }
                                Map map1 = iazm.i(map0, "serviceConfig");
                                if(map1 == null) {
                                    throw new gfuz(String.format("key \'%s\' missing in \'%s\'", map0, "serviceConfig"));
                                }
                                object3 = map1;
                            }
                            else {
                                int v4 = double0.intValue();
                                gfuy.b(v4 >= 0 && v4 <= 100, "Bad percentage: %s", double0);
                                if(random0.nextInt(100) < v4) {
                                    goto label_128;
                                }
                            }
                        label_138:
                            if(object3 == null) {
                                continue;
                            }
                        }
                        catch(RuntimeException runtimeException0) {
                            iaoo0 = new iaoo(iapk.d.f("failed to pick service config choice").e(runtimeException0));
                            goto label_144;
                        }
                        break;
                    }
                    iaoo0 = object3 == null ? null : new iaoo(object3);
                label_144:
                    if(iaoo0 == null) {
                    label_151:
                        iaoo1 = null;
                    }
                    else {
                        iapk iapk0 = iaoo0.a;
                        iaoo1 = iapk0 == null ? iaxp0.m.a(((Map)iaoo0.b)) : new iaoo(iapk0);
                    }
                label_152:
                    iaxh1.c = iaoo1;
                }
                catch(IOException iOException0) {
                    goto label_165;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_177;
        }
        try {
        label_153:
            if(iaxh1.a == null) {
                List list4 = iaxh1.b;
                if(list4 != null) {
                    iaor0.a = new iapm(null, list4);
                }
                iaoo iaoo2 = iaxh1.c;
                if(iaoo2 != null) {
                    iaor0.c = iaoo2;
                }
                iaxh0 = iaxh1;
                goto label_161;
            }
            else {
                goto label_168;
            }
            goto label_187;
        }
        catch(IOException iOException0) {
            goto label_172;
        }
        catch(Throwable throwable0) {
            goto label_182;
        }
        try {
        label_161:
            iaps0 = this.b.l;
            iaps0.execute(new iaxj(this, iaor0));
            goto label_166;
        }
        catch(IOException iOException0) {
        label_165:
            goto label_173;
        label_166:
            iaxl0 = new iaxl(this, iaxh0 != null && iaxh0.a == null);
            goto label_187;
            try {
            label_168:
                iaps0 = this.b.l;
                iaps0.execute(new iaxi(this, iaxh1));
                goto label_186;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                goto label_182;
            }
        label_172:
            iaxh0 = iaxh1;
            try {
            label_173:
                iaxk iaxk0 = new iaxk(this, iOException0);
                this.b.l.execute(iaxk0);
                goto label_178;
            }
            catch(Throwable throwable0) {
            }
            goto label_177;
        }
        catch(Throwable throwable0) {
        label_177:
            goto label_183;
        }
    label_178:
        iaxl0 = new iaxl(this, iaxh0 != null && iaxh0.a == null);
        iaps0 = this.b.l;
        goto label_187;
    label_182:
        iaxh0 = iaxh1;
    label_183:
        iaxl iaxl1 = new iaxl(this, iaxh0 != null && iaxh0.a == null);
        this.b.l.execute(iaxl1);
        throw throwable0;
    label_186:
        iaxl0 = new iaxl(this, iaxh1.a == null);
    label_187:
        iaps0.execute(iaxl0);
    }
}

