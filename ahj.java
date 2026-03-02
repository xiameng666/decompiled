import android.app.appsearch.AppSearchSchema.BooleanPropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema.Builder;
import android.app.appsearch.AppSearchSchema.BytesPropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema.DocumentPropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema.DoublePropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema.LongPropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema.PropertyConfig;
import android.app.appsearch.AppSearchSchema.StringPropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema;
import android.app.appsearch.AppSearchSession;
import android.app.appsearch.GenericDocument;
import android.app.appsearch.GetByDocumentIdRequest.Builder;
import android.app.appsearch.GetByDocumentIdRequest;
import android.app.appsearch.PackageIdentifier;
import android.app.appsearch.PutDocumentsRequest.Builder;
import android.app.appsearch.PutDocumentsRequest;
import android.app.appsearch.RemoveByDocumentIdRequest.Builder;
import android.app.appsearch.RemoveByDocumentIdRequest;
import android.app.appsearch.SearchSpec;
import android.app.appsearch.SetSchemaRequest.Builder;
import android.app.appsearch.SetSchemaRequest;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

final class ahj implements aet {
    public final AppSearchSession a;
    public final Executor b;
    public final Context c;
    private final aey d;

    public ahj(AppSearchSession appSearchSession0, Executor executor0, Context context0) {
        kay.i(appSearchSession0);
        this.a = appSearchSession0;
        this.b = executor0;
        this.c = context0;
        this.d = new agu(context0);
    }

    @Override  // aet
    public final aey a() {
        return this.d;
    }

    @Override  // aet
    public final afy b(String s, aga aga0) {
        SearchSpec searchSpec0 = aid.a(this.c, aga0);
        return new aha(this.a.search(s, searchSpec0), aga0, this.b, this.c);
    }

    @Override  // aet
    public final gmcd c(afc afc0) {
        gmcd gmcd0 = new jqz();
        GetByDocumentIdRequest.Builder getByDocumentIdRequest$Builder0 = new GetByDocumentIdRequest.Builder(afc0.a).addIds(afc0.b());
        for(Object object0: afc0.a().entrySet()) {
            getByDocumentIdRequest$Builder0.addProjection(((String)((Map.Entry)object0).getKey()), ((Collection)((Map.Entry)object0).getValue()));
        }
        GetByDocumentIdRequest getByDocumentIdRequest0 = getByDocumentIdRequest$Builder0.build();
        aij aij0 = new aij(((jqz)gmcd0), new ahh());
        this.a.getByDocumentId(getByDocumentIdRequest0, this.b, aij0);
        return gmcd0;
    }

    @Override  // aet
    public final void close() {
        this.a.close();
    }

    @Override  // aet
    public final gmcd d() {
        gmcd gmcd0 = new jqz();
        ahd ahd0 = new ahd(((jqz)gmcd0));
        this.a.getSchema(this.b, ahd0);
        return gmcd0;
    }

    @Override  // aet
    public final gmcd e(afn afn0) {
        kay.i(afn0);
        gmcd gmcd0 = new jqz();
        kay.i(afn0);
        PutDocumentsRequest.Builder putDocumentsRequest$Builder0 = new PutDocumentsRequest.Builder();
        for(Object object0: afn0.a()) {
            putDocumentsRequest$Builder0.addGenericDocuments(new GenericDocument[]{ahm.a(((afa)object0))});
        }
        for(Object object1: afn0.b()) {
            afa afa0 = (afa)object1;
            if(Build.VERSION.SDK_INT >= 35) {
                ahp.a(putDocumentsRequest$Builder0, ahm.a(afa0));
            }
            else {
                putDocumentsRequest$Builder0.addGenericDocuments(new GenericDocument[]{ahm.a(afa0)});
            }
        }
        PutDocumentsRequest putDocumentsRequest0 = putDocumentsRequest$Builder0.build();
        aij aij0 = aij.a(((jqz)gmcd0));
        this.a.put(putDocumentsRequest0, this.b, aij0);
        return gmcd0;
    }

    @Override  // aet
    public final gmcd f(afp afp0) {
        gmcd gmcd0 = new jqz();
        RemoveByDocumentIdRequest removeByDocumentIdRequest0 = new RemoveByDocumentIdRequest.Builder(afp0.a).addIds(afp0.a()).build();
        aij aij0 = aij.a(((jqz)gmcd0));
        this.a.remove(removeByDocumentIdRequest0, this.b, aij0);
        return gmcd0;
    }

    @Override  // aet
    public final gmcd g() {
        gmcd gmcd0 = new jqz();
        ((jqs)gmcd0).g(null);
        return gmcd0;
    }

    @Override  // aet
    public final gmcd h(agc agc0) {
        AppSearchSchema.PropertyConfig appSearchSchema$PropertyConfig0;
        Iterator iterator2;
        SetSchemaRequest.Builder setSchemaRequest$Builder0;
        AppSearchSession appSearchSession0;
        gmcd gmcd0 = new jqz();
        long v = aii.a(this.c);
        if(Long.compare(v, 340800000L) >= 0 && v < 341113000L) {
            try {
                Set set0 = agc0.g();
                int v1 = Build.VERSION.SDK_INT >= 34 || Build.VERSION.SDK_INT == 33 && aii.a(((agu)this.d).a) >= 340800000L ? 0x40 : 16;
                bxd bxd0 = new bxd();
                for(Object object0: set0) {
                    bxd0.put(((aes)object0).a, ((aes)object0));
                }
                bxd bxd1 = new bxd();
                Iterator iterator1 = set0.iterator();
                while(true) {
                label_13:
                    if(!iterator1.hasNext()) {
                        goto label_21;
                    }
                    Object object1 = iterator1.next();
                    if(aik.a(((aes)object1), bxd0, bxd1, new bxf()) > v1) {
                        throw new agt("Too many properties to be indexed, max number of properties allowed: " + v1);
                    }
                }
            }
            catch(agt agt0) {
                ((jqs)gmcd0).h(new ags(3, agt0.getMessage()));
                return gmcd0;
            }
            goto label_13;
        }
        else {
        label_21:
            appSearchSession0 = this.a;
            setSchemaRequest$Builder0 = new SetSchemaRequest.Builder();
            iterator2 = agc0.g().iterator();
        }
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            aes aes0 = (aes)object2;
            kay.i(aes0);
            AppSearchSchema.Builder appSearchSchema$Builder0 = new AppSearchSchema.Builder(aes0.a);
            if(!aes0.c.isEmpty()) {
                throw new UnsupportedOperationException("SCHEMA_SET_DESCRIPTION is not available on this AppSearch implementation.");
            }
            if(!aes0.a().isEmpty()) {
                if(Build.VERSION.SDK_INT < 35) {
                    throw new UnsupportedOperationException("SCHEMA_ADD_PARENT_TYPE is not available on this AppSearch implementation.");
                }
                List list0 = aes0.a();
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ahv.b(appSearchSchema$Builder0, ((String)list0.get(v2)));
                }
            }
            List list1 = aes0.b();
            int v3 = 0;
            while(v3 < list1.size()) {
                aep aep0 = (aep)list1.get(v3);
                kay.i(aep0);
                if(!aep0.f().isEmpty()) {
                    throw new UnsupportedOperationException("SCHEMA_SET_DESCRIPTION is not available on this AppSearch implementation.");
                }
                if((aep0 instanceof aer)) {
                    int v4 = ((aer)aep0).a();
                    int v5 = ((aer)aep0).c();
                    AppSearchSchema.StringPropertyConfig.Builder appSearchSchema$StringPropertyConfig$Builder0 = new AppSearchSchema.StringPropertyConfig.Builder(((aer)aep0).g()).setCardinality(((aer)aep0).d()).setIndexingType(v4).setTokenizerType(v5);
                    if(Build.VERSION.SDK_INT == 33) {
                        kay.f(((aer)aep0).c(), 0, 1, "tokenizerType");
                    }
                    if(((aer)aep0).b() == 1) {
                        if(jys.a < 7) {
                            throw new UnsupportedOperationException("StringPropertyConfig.JOINABLE_VALUE_TYPE_QUALIFIED_ID is not supported on this AppSearch implementation.");
                        }
                        ahs.b(appSearchSchema$StringPropertyConfig$Builder0, ((aer)aep0).b());
                        appSearchSchema$PropertyConfig0 = appSearchSchema$StringPropertyConfig$Builder0.build();
                        appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                        ++v3;
                        continue;
                    }
                    appSearchSchema$PropertyConfig0 = appSearchSchema$StringPropertyConfig$Builder0.build();
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof aeo)) {
                    AppSearchSchema.LongPropertyConfig.Builder appSearchSchema$LongPropertyConfig$Builder0 = new AppSearchSchema.LongPropertyConfig.Builder(aep0.g()).setCardinality(aep0.d());
                    if(((aeo)aep0).a() == 1) {
                        if(Build.VERSION.SDK_INT < 34) {
                            throw new UnsupportedOperationException("LongProperty.INDEXING_TYPE_RANGE is not supported on this AppSearch implementation.");
                        }
                        ahu.b(appSearchSchema$LongPropertyConfig$Builder0, ((aeo)aep0).a());
                        appSearchSchema$PropertyConfig0 = appSearchSchema$LongPropertyConfig$Builder0.build();
                        appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                        ++v3;
                        continue;
                    }
                    appSearchSchema$PropertyConfig0 = appSearchSchema$LongPropertyConfig$Builder0.build();
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof ael)) {
                    ael ael0 = (ael)aep0;
                    appSearchSchema$PropertyConfig0 = new AppSearchSchema.DoublePropertyConfig.Builder(aep0.g()).setCardinality(aep0.d()).build();
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof aee)) {
                    aee aee0 = (aee)aep0;
                    appSearchSchema$PropertyConfig0 = new AppSearchSchema.BooleanPropertyConfig.Builder(aep0.g()).setCardinality(aep0.d()).build();
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof aeh)) {
                    appSearchSchema$PropertyConfig0 = new AppSearchSchema.BytesPropertyConfig.Builder(aep0.g()).setCardinality(aep0.d()).build();
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof aej)) {
                    boolean z = ((aej)aep0).c();
                    AppSearchSchema.DocumentPropertyConfig.Builder appSearchSchema$DocumentPropertyConfig$Builder0 = new AppSearchSchema.DocumentPropertyConfig.Builder(((aej)aep0).g(), ((aej)aep0).a()).setCardinality(((aej)aep0).d()).setShouldIndexNestedProperties(z);
                    if(!((aej)aep0).b().isEmpty()) {
                        if(jys.a < 10) {
                            throw new UnsupportedOperationException("DocumentPropertyConfig.addIndexableNestedProperties is not supported on this AppSearch implementation.");
                        }
                        ahr.a(appSearchSchema$DocumentPropertyConfig$Builder0, ((aej)aep0).b());
                        appSearchSchema$PropertyConfig0 = appSearchSchema$DocumentPropertyConfig$Builder0.build();
                        appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                        ++v3;
                        continue;
                    }
                    appSearchSchema$PropertyConfig0 = appSearchSchema$DocumentPropertyConfig$Builder0.build();
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof aem)) {
                    if(!aii.b()) {
                        throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
                    }
                    appSearchSchema$PropertyConfig0 = ahq.a(((aem)aep0));
                    appSearchSchema$Builder0.addProperty(appSearchSchema$PropertyConfig0);
                    ++v3;
                    continue;
                }
                if((aep0 instanceof aec)) {
                    throw new UnsupportedOperationException("BLOB_STORAGE is not available on this AppSearch implementation.");
                }
                throw new IllegalArgumentException("Invalid dataType: " + aep0.e());
            }
            setSchemaRequest$Builder0.addSchemas(new AppSearchSchema[]{appSearchSchema$Builder0.build()});
            continue;
        }
        for(Object object3: agc0.h()) {
            setSchemaRequest$Builder0.setSchemaTypeDisplayedBySystem(((String)object3), false);
        }
        for(Object object4: agc0.c.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object4;
            for(Object object5: ((Set)map$Entry0.getValue())) {
                setSchemaRequest$Builder0.setSchemaTypeVisibilityForPackage(((String)map$Entry0.getKey()), true, new PackageIdentifier(((afj)object5).a(), ((afj)object5).b()));
            }
        }
        if(!agc0.d().isEmpty()) {
            if(Build.VERSION.SDK_INT < 33) {
                throw new UnsupportedOperationException("Set required permissions for schema type visibility are not supported with this backend/Android API level combination.");
            }
            for(Object object6: agc0.d().entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object6;
                for(Object object7: ((Set)map$Entry1.getValue())) {
                    aif.a(setSchemaRequest$Builder0, ((String)map$Entry1.getKey()), ((Set)object7));
                }
            }
        }
        if(!agc0.c().isEmpty()) {
            if(Build.VERSION.SDK_INT < 35) {
                throw new UnsupportedOperationException("Publicly visible schema are not supported on this AppSearch implementation.");
            }
            for(Object object8: agc0.c().entrySet()) {
                afj afj0 = (afj)((Map.Entry)object8).getValue();
                aig.b(setSchemaRequest$Builder0, ((String)((Map.Entry)object8).getKey()), new PackageIdentifier(afj0.a(), afj0.b()));
            }
        }
        if(!agc0.e().isEmpty()) {
            if(Build.VERSION.SDK_INT < 35) {
                throw new UnsupportedOperationException("Schema visible to config are not supported on this AppSearch implementation.");
            }
            for(Object object9: agc0.e().entrySet()) {
                aig.a(setSchemaRequest$Builder0, ((String)((Map.Entry)object9).getKey()), ((Set)((Map.Entry)object9).getValue()));
            }
        }
        for(Object object10: agc0.b().entrySet()) {
            aie aie0 = new aie(((afi)((Map.Entry)object10).getValue()));
            setSchemaRequest$Builder0.setMigrator(((String)((Map.Entry)object10).getKey()), aie0);
        }
        SetSchemaRequest setSchemaRequest0 = setSchemaRequest$Builder0.setForceOverride(agc0.h).setVersion(agc0.i).build();
        ahi ahi0 = new ahi(((jqz)gmcd0));
        appSearchSession0.setSchema(setSchemaRequest0, this.b, this.b, ahi0);
        return gmcd0;
    }

    @Override  // aet
    public final gmcd i(aga aga0) {
        gmcd gmcd0 = new jqz();
        if(Build.VERSION.SDK_INT < 33 && !aga0.a().isEmpty()) {
            ahf ahf0 = new ahf(this, ((jqz)gmcd0), aga0);
            this.a.getNamespaces(this.b, ahf0);
            return gmcd0;
        }
        SearchSpec searchSpec0 = aid.a(this.c, aga0);
        ahg ahg0 = new ahg(((jqz)gmcd0));
        this.a.remove("", searchSpec0, this.b, ahg0);
        return gmcd0;
    }
}

