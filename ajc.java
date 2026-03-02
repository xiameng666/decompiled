import com.google.android.gms.appsearch.AppSearchSchema;
import com.google.android.gms.appsearch.GetByDocumentIdRequest;
import com.google.android.gms.appsearch.RemoveByDocumentIdRequest;
import com.google.android.gms.appsearch.SchemaVisibilityConfig;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.safeparcel.PropertyConfigParcel.DocumentIndexingConfigParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyConfigParcel.JoinableConfigParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyConfigParcel.StringIndexingConfigParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyConfigParcel;
import j..util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

final class ajc implements aet, Closeable {
    private final acfm a;
    private final aey b;
    private final String c;
    private final Executor d;

    public ajc(acfm acfm0, aey aey0, String s, Executor executor0) {
        kay.i(acfm0);
        this.a = acfm0;
        this.b = aey0;
        this.c = s;
        this.d = executor0;
    }

    @Override  // aet
    public final aey a() {
        return this.b;
    }

    @Override  // aet
    public final afy b(String s, aga aga0) {
        SearchSpec searchSpec0 = ajg.a(aga0);
        return new air(this.a.b(s, searchSpec0, this.c), this.d);
    }

    @Override  // aet
    public final gmcd c(afc afc0) {
        achi achi0 = new achi(afc0.a);
        Set set0 = afc0.b();
        Objects.requireNonNull(set0);
        achi0.a();
        achi0.b.addAll(set0);
        for(Object object0: afc0.a().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Collection collection0 = (Collection)((Map.Entry)object0).getValue();
            Objects.requireNonNull(s);
            Objects.requireNonNull(collection0);
            achi0.a();
            ArrayList arrayList0 = new ArrayList(collection0.size());
            for(Object object1: collection0) {
                Objects.requireNonNull(((String)object1));
                arrayList0.add(((String)object1));
            }
            achi0.c.putStringArrayList(s, arrayList0);
        }
        achi0.d = true;
        GetByDocumentIdRequest getByDocumentIdRequest0 = new GetByDocumentIdRequest(achi0.a, achi0.b, achi0.c);
        return ajj.a(this.a.c(getByDocumentIdRequest0, this.c), new aiy(), this.d);
    }

    @Override  // aet
    public final void close() {
        this.a.i();
    }

    @Override  // aet
    public final gmcd d() {
        return ajj.a(this.a.e(this.c), new ajb(), this.d);
    }

    @Override  // aet
    public final gmcd e(afn afn0) {
        int v;
        kay.i(afn0);
        kay.i(afn0);
        acia acia0 = new acia();
        Iterator iterator0 = afn0.a().iterator();
        while(true) {
            v = 0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            achh[] arr_achh = {aje.b(((afa)object0))};
            Objects.requireNonNull(arr_achh);
            acia0.a();
            List list0 = Arrays.asList(arr_achh);
            Objects.requireNonNull(list0);
            acia0.a();
            acia0.a.addAll(list0);
        }
        for(Object object1: afn0.b()) {
            achh[] arr_achh1 = {aje.b(((afa)object1))};
            Objects.requireNonNull(arr_achh1);
            acia0.a();
            List list1 = Arrays.asList(arr_achh1);
            Objects.requireNonNull(list1);
            acia0.a();
            acia0.b.addAll(list1);
        }
        acia0.c = true;
        bxf bxf0 = new bxf();
        for(int v1 = 0; v1 < acia0.a.size(); ++v1) {
            bxf0.add(((achh)acia0.a.get(v1)).e());
        }
        while(v < acia0.b.size()) {
            achh achh0 = (achh)acia0.b.get(v);
            if(bxf0.contains(achh0.e())) {
                throw new IllegalArgumentException("Document id " + achh0.e() + " cannot exist in both taken action and normal document");
            }
            ++v;
            continue;
        }
        acib acib0 = new acib(acia0.a, acia0.b);
        return ajj.a(this.a.f(acib0, this.c), new aiw(), this.d);
    }

    @Override  // aet
    public final gmcd f(afp afp0) {
        bxf bxf0 = new bxf();
        String s = (String)Objects.requireNonNull(afp0.a);
        Set set0 = afp0.a();
        Objects.requireNonNull(set0);
        bxf0.addAll(set0);
        RemoveByDocumentIdRequest removeByDocumentIdRequest0 = new RemoveByDocumentIdRequest(s, new ArrayList(bxf0));
        return ajj.a(this.a.g(removeByDocumentIdRequest0, this.c), new aiu(), this.d);
    }

    @Override  // aet
    public final gmcd g() {
        return ajj.a(evrg.d(null), new aix(), this.d);
    }

    @Override  // aet
    public final gmcd h(agc agc0) {
        acgy acgy0;
        acha acha0;
        int v5;
        List list2;
        Iterator iterator1;
        acio acio0 = new acio();
        Iterator iterator0 = agc0.g().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            aes aes0 = (aes)object0;
            AppSearchSchema[] arr_appSearchSchema = new AppSearchSchema[1];
            kay.i(aes0);
            acgv acgv0 = new acgv(aes0.a);
            if(!aes0.c.isEmpty()) {
                throw new UnsupportedOperationException("SCHEMA_SET_DESCRIPTION is not available on this AppSearch implementation.");
            }
            if(!aes0.a().isEmpty()) {
                List list0 = aes0.a();
                for(int v = 0; v < list0.size(); ++v) {
                    String s = (String)list0.get(v);
                    Objects.requireNonNull(s);
                    acgv0.b();
                    acgv0.a.add(s);
                }
            }
            List list1 = aes0.b();
            int v1 = 0;
            while(v1 < list1.size()) {
                aep aep0 = (aep)list1.get(v1);
                kay.i(aep0);
                if(!aep0.f().isEmpty()) {
                    throw new UnsupportedOperationException("SCHEMA_SET_DESCRIPTION is not available on this AppSearch implementation.");
                }
                if((aep0 instanceof aer)) {
                    String s1 = (String)Objects.requireNonNull(((aer)aep0).g());
                    iterator1 = iterator0;
                    int v2 = ((aer)aep0).d();
                    batl.o(v2, 1, 3, "cardinality");
                    int v3 = ((aer)aep0).a();
                    batl.o(v3, 0, 2, "indexingType");
                    int v4 = ((aer)aep0).c();
                    list2 = list1;
                    batl.o(v4, 0, 3, "tokenizerType");
                    if(((aer)aep0).b() == 1) {
                        v5 = ((aer)aep0).b();
                        batl.o(v5, 0, 1, "joinableValueType");
                    }
                    else {
                        v5 = 0;
                    }
                    if(v4 == 0) {
                        batl.m(v3 == 0, "Cannot set TOKENIZER_TYPE_NONE with an indexing type other than INDEXING_TYPE_NONE.");
                    }
                    else {
                        batl.m(v3 != 0, "Cannot set TOKENIZER_TYPE_PLAIN with INDEXING_TYPE_NONE.");
                    }
                    if(v5 == 1) {
                        batl.m(v2 != 1, "Cannot set JOINABLE_VALUE_TYPE_QUALIFIED_ID with CARDINALITY_REPEATED.");
                    }
                    else {
                        batl.m(true, "Cannot set deletion propagation without setting a joinable value type");
                    }
                    PropertyConfigParcel.StringIndexingConfigParcel propertyConfigParcel$StringIndexingConfigParcel0 = new PropertyConfigParcel.StringIndexingConfigParcel(v3, v4);
                    PropertyConfigParcel.JoinableConfigParcel propertyConfigParcel$JoinableConfigParcel0 = new PropertyConfigParcel.JoinableConfigParcel(v5, false);
                    acha0 = new achc(new PropertyConfigParcel(((String)Objects.requireNonNull(s1)), 1, v2, null, ((PropertyConfigParcel.StringIndexingConfigParcel)Objects.requireNonNull(propertyConfigParcel$StringIndexingConfigParcel0)), null, null, ((PropertyConfigParcel.JoinableConfigParcel)Objects.requireNonNull(propertyConfigParcel$JoinableConfigParcel0)), ((String)Objects.requireNonNull("")), null));
                    goto label_99;
                }
                iterator1 = iterator0;
                list2 = list1;
                if((aep0 instanceof aeo)) {
                    acgz acgz0 = new acgz(aep0.g());
                    acgz0.b(aep0.d());
                    if(((aeo)aep0).a() == 1) {
                        int v6 = ((aeo)aep0).a();
                        batl.o(v6, 0, 1, "indexingType");
                        acgz0.a = v6;
                    }
                    acha0 = acgz0.a();
                    goto label_99;
                }
                if((aep0 instanceof ael)) {
                    ael ael0 = (ael)aep0;
                    int v7 = aep0.d();
                    batl.o(v7, 1, 3, "cardinality");
                    String s2 = (String)Objects.requireNonNull("");
                    acgy0 = new acgy(new PropertyConfigParcel(((String)Objects.requireNonNull(((String)Objects.requireNonNull(aep0.g())))), 3, v7, null, null, null, null, null, s2, null));
                    acha0 = acgy0;
                    goto label_99;
                }
                if((aep0 instanceof aee)) {
                    aee aee0 = (aee)aep0;
                    int v8 = aep0.d();
                    batl.o(v8, 1, 3, "cardinality");
                    String s3 = (String)Objects.requireNonNull("");
                    acgy0 = new acgu(new PropertyConfigParcel(((String)Objects.requireNonNull(((String)Objects.requireNonNull(aep0.g())))), 4, v8, null, null, null, null, null, s3, null));
                    acha0 = acgy0;
                    goto label_99;
                }
                if((aep0 instanceof aeh)) {
                    int v9 = aep0.d();
                    batl.o(v9, 1, 3, "cardinality");
                    String s4 = (String)Objects.requireNonNull("");
                    acgy0 = new acgw(new PropertyConfigParcel(((String)Objects.requireNonNull(((String)Objects.requireNonNull(aep0.g())))), 5, v9, null, null, null, null, null, s4, null));
                    acha0 = acgy0;
                    goto label_99;
                }
                if((aep0 instanceof aej)) {
                    String s5 = ((aej)aep0).a();
                    bxf bxf0 = new bxf();
                    String s6 = (String)Objects.requireNonNull(((aej)aep0).g());
                    String s7 = (String)Objects.requireNonNull(s5);
                    int v10 = ((aej)aep0).d();
                    batl.o(v10, 1, 3, "cardinality");
                    boolean z = ((aej)aep0).c();
                    List list3 = ((aej)aep0).b();
                    Objects.requireNonNull(list3);
                    bxf0.addAll(list3);
                    if(z && !bxf0.isEmpty()) {
                        throw new IllegalArgumentException("DocumentIndexingConfig#shouldIndexNestedProperties is required to be false when one or more indexableNestedProperties are provided.");
                    }
                    PropertyConfigParcel.DocumentIndexingConfigParcel propertyConfigParcel$DocumentIndexingConfigParcel0 = new PropertyConfigParcel.DocumentIndexingConfigParcel(z, new ArrayList(bxf0));
                    acha0 = new acgx(new PropertyConfigParcel(((String)Objects.requireNonNull(s6)), 6, v10, ((String)Objects.requireNonNull(s7)), null, ((PropertyConfigParcel.DocumentIndexingConfigParcel)Objects.requireNonNull(propertyConfigParcel$DocumentIndexingConfigParcel0)), null, null, ((String)Objects.requireNonNull("")), null));
                label_99:
                    acgv0.c(acha0);
                    ++v1;
                    iterator0 = iterator1;
                    list1 = list2;
                    continue;
                }
                if((aep0 instanceof aem)) {
                    throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
                }
                if((aep0 instanceof aec)) {
                    throw new UnsupportedOperationException("BLOB_STORAGE is not available on this AppSearch implementation.");
                }
                throw new IllegalArgumentException("Invalid dataType: " + aep0.e());
            }
            arr_appSearchSchema[0] = acgv0.a();
            Objects.requireNonNull(arr_appSearchSchema);
            acio0.a();
            List list4 = Arrays.asList(arr_appSearchSchema);
            Objects.requireNonNull(list4);
            acio0.a();
            acio0.a.addAll(list4);
            iterator0 = iterator0;
            continue;
        }
        for(Object object1: agc0.h()) {
            Objects.requireNonNull(((String)object1));
            acio0.a();
            acio0.b.add(((String)object1));
        }
        for(Object object2: agc0.c.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            for(Object object3: ((Set)map$Entry0.getValue())) {
                String s8 = (String)map$Entry0.getKey();
                achw achw0 = new achw(((afj)object3).a(), ((afj)object3).b());
                Objects.requireNonNull(s8);
                Objects.requireNonNull(achw0);
                acio0.a();
                Set set0 = (Set)acio0.c.get(s8);
                if(set0 == null) {
                    set0 = new bxf();
                }
                set0.add(achw0);
                acio0.c.put(s8, set0);
            }
        }
        if(!agc0.d().isEmpty()) {
            for(Object object4: agc0.d().entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object4;
                for(Object object5: ((Set)map$Entry1.getValue())) {
                    String s9 = (String)map$Entry1.getKey();
                    Objects.requireNonNull(s9);
                    Objects.requireNonNull(((Set)object5));
                    for(Object object6: ((Set)object5)) {
                        batl.o(((Integer)object6).intValue(), 1, 12, "permission");
                    }
                    acio0.a();
                    Set set1 = (Set)acio0.d.get(s9);
                    if(set1 == null) {
                        set1 = new bxf();
                        acio0.d.put(s9, set1);
                    }
                    set1.add(((Set)object5));
                }
            }
        }
        if(!agc0.c().isEmpty()) {
            for(Object object7: agc0.c().entrySet()) {
                afj afj0 = (afj)((Map.Entry)object7).getValue();
                String s10 = (String)((Map.Entry)object7).getKey();
                achw achw1 = new achw(afj0.a(), afj0.b());
                Objects.requireNonNull(s10);
                acio0.a();
                if(achw1.a().isEmpty()) {
                    acio0.e.remove(s10);
                }
                else {
                    acio0.e.put(s10, achw1);
                }
            }
        }
        if(!agc0.e().isEmpty()) {
            for(Object object8: agc0.e().entrySet()) {
                Map.Entry map$Entry2 = (Map.Entry)object8;
                for(Object object9: ((Set)map$Entry2.getValue())) {
                    kay.i(((afr)object9));
                    acid acid0 = new acid();
                    List list5 = ((afr)object9).b();
                    for(int v11 = 0; v11 < list5.size(); ++v11) {
                        acid0.b(new achw(((afj)list5.get(v11)).a(), ((afj)list5.get(v11)).b()));
                    }
                    for(Object object10: ((afr)object9).c()) {
                        acid0.c(((Set)object10));
                    }
                    afj afj1 = ((afr)object9).a();
                    if(afj1 != null) {
                        acid0.d(new achw(afj1.a(), afj1.b()));
                    }
                    SchemaVisibilityConfig schemaVisibilityConfig0 = acid0.a();
                    String s11 = (String)map$Entry2.getKey();
                    Objects.requireNonNull(s11);
                    Objects.requireNonNull(schemaVisibilityConfig0);
                    acio0.a();
                    Set set2 = (Set)acio0.f.get(s11);
                    if(set2 == null) {
                        set2 = new bxf();
                        acio0.f.put(s11, set2);
                    }
                    set2.add(schemaVisibilityConfig0);
                }
            }
        }
        for(Object object11: agc0.b().entrySet()) {
            achs achs0 = new achs(((afi)((Map.Entry)object11).getValue()));
            String s12 = (String)((Map.Entry)object11).getKey();
            Objects.requireNonNull(s12);
            Objects.requireNonNull(achs0);
            acio0.a();
            acio0.g.put(s12, achs0);
        }
        acio0.a();
        acio0.h = agc0.h;
        batl.c(1 == agc0.i, "Version must be a positive number.");
        acio0.a();
        acio0.i = agc0.i;
        bxf bxf1 = new bxf(acio0.b);
        bxf1.addAll(acio0.c.keySet());
        bxf1.addAll(acio0.d.keySet());
        bxf1.addAll(acio0.e.keySet());
        bxf1.addAll(acio0.f.keySet());
        bxe bxe0 = new bxe(acio0.a);
        while(bxe0.hasNext()) {
            Object object12 = bxe0.next();
            bxf1.remove(((AppSearchSchema)object12).a);
        }
        if(!bxf1.isEmpty()) {
            throw new IllegalArgumentException(a.b(bxf1, "Schema types ", " referenced, but were not added."));
        }
        if(acio0.a.isEmpty() && acio0.i != 1) {
            throw new IllegalArgumentException("Cannot set version to the request if schema is empty.");
        }
        acio0.j = true;
        acip acip0 = new acip(acio0.a, acio0.b, acio0.c, acio0.d, acio0.e, acio0.f, acio0.g, acio0.h, acio0.i);
        return ajj.a(this.a.h(acip0, this.c), new ait(), this.d);
    }

    @Override  // aet
    public final gmcd i(aga aga0) {
        SearchSpec searchSpec0 = ajg.a(aga0);
        return ajj.a(this.a.j(searchSpec0, this.c), new aiv(), this.d);
    }
}

