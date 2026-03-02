import android.os.Bundle;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisteredPackageInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.GetStorageStatsCall.PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall.Request;
import com.google.android.gms.search.administration.GetStorageStatsCall.Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall.Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall.Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall.Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall.Response;
import com.google.android.gms.search.corpora.RequestIndexingCall.Request;
import com.google.android.gms.search.corpora.RequestIndexingCall.Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.GlobalSearchSource;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall.Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall.Request;
import com.google.android.gms.search.queries.GetDocumentsCall.Request;
import com.google.android.gms.search.queries.GetDocumentsCall.Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall.Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall.Response;
import com.google.android.gms.search.queries.GlobalQueryCall.Request;
import com.google.android.gms.search.queries.GlobalQueryCall.Response;
import com.google.android.gms.search.queries.QueryCall.Request;
import com.google.android.gms.search.queries.QueryCall.Response;
import com.google.android.gms.search.queries.QuerySuggestCall.Request;
import com.google.android.gms.search.queries.QuerySuggestCall.Response;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public final class abve extends abxk implements cjug {
    final bwmx a;
    private final bwud b;

    public abve(bwmx bwmx0, bwud bwud0) {
        this.a = bwmx0;
        this.b = bwud0;
    }

    @Override  // abxl
    public final SuggestionResults A(String s, String s1, String[] arr_s, int v, SuggestSpecification suggestSpecification0) {
        ccmq.a().a(bbdg.ny);
        QuerySuggestCall.Request querySuggestCall$Request0 = new QuerySuggestCall.Request();
        querySuggestCall$Request0.a = s;
        querySuggestCall$Request0.b = s1;
        querySuggestCall$Request0.c = arr_s;
        querySuggestCall$Request0.d = v;
        querySuggestCall$Request0.e = suggestSpecification0;
        elfc elfc0 = new elfc(this.a, querySuggestCall$Request0, this.b);
        this.a.c.h(elfc0);
        return ((QuerySuggestCall.Response)elfc0.v()).b;
    }

    @Override  // abxl
    public final void B() {
        ccmq.a().a(bbdg.ny);
        if(!this.b.b) {
            throw new SecurityException("Access denied");
        }
        this.a.g();
    }

    @Override  // abxl
    public final void C(String[] arr_s) {
        ccmq.a().a(bbdg.ny);
        bwud bwud0 = this.b;
        if(!bwud0.b) {
            throw new SecurityException("Access denied");
        }
        abvd abvd0 = new abvd(this, gltq.r, bwud0.e, arr_s);
        this.a.c.h(abvd0);
    }

    @Override  // abxl
    public final Bundle D(String s, String s1) {
        ccmq.a().a(bbdg.ny);
        String s2 = null;
        if(s1 != null) {
            try {
                bwnb.i(s1);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                s2 = illegalArgumentException0.getMessage();
            }
        }
        if(s2 != null) {
            throw new IllegalArgumentException(s2);
        }
        bwuc bwuc0 = this.a.l;
        batl.s(bwuc0);
        bwua bwua0 = bwuc0.d(bwuc0.h(s));
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        abva abva0 = new abva(this, gltq.o, this.b.e, s1, bwua0, arrayList1, arrayList0);
        this.a.c.h(abva0);
        abva0.v();
        Bundle bundle0 = new Bundle();
        bundle0.putStringArray("content_provider_uris", ((String[])arrayList0.toArray(new String[arrayList0.size()])));
        boolean[] arr_z = new boolean[arrayList1.size()];
        for(int v = 0; v < arrayList1.size(); ++v) {
            arr_z[v] = ((Boolean)arrayList1.get(v)).booleanValue();
        }
        bundle0.putBooleanArray("success", arr_z);
        return bundle0;
    }

    @Override  // abxl
    public final void E() {
        ccmq.a().a(bbdg.ny);
    }

    @Override  // abxl
    public final void H(String s) {
        ccmq.a().a(bbdg.ny);
        batl.s(s);
        this.K(s, null);
    }

    @Override  // abxl
    public final GlobalSearchApplicationInfo[] I() {
        ccmq.a().a(bbdg.ny);
        GlobalSearchApplication[] arr_globalSearchApplication = this.l();
        GlobalSearchApplicationInfo[] arr_globalSearchApplicationInfo = new GlobalSearchApplicationInfo[arr_globalSearchApplication.length];
        for(int v = 0; v < arr_globalSearchApplication.length; ++v) {
            arr_globalSearchApplicationInfo[v] = arr_globalSearchApplication[v].a;
        }
        return arr_globalSearchApplicationInfo;
    }

    @Override  // abxl
    @Deprecated
    public final void J(String s, RegisterCorpusInfo registerCorpusInfo0) {
        ccmq.a().a(bbdg.ny);
        this.t(s, registerCorpusInfo0);
    }

    private final void K(String s, GlobalSearchApplicationInfo globalSearchApplicationInfo0) {
        bwmx bwmx0 = this.a;
        bwuc bwuc0 = bwmx0.l;
        if(bwuc0 == null) {
            return;
        }
        bwud bwud0 = bwuc0.h(s);
        abvb abvb0 = new abvb(this, gltq.p, this.b.e, bwuc0, bwud0, globalSearchApplicationInfo0);
        bwmx0.c.h(abvb0);
        Exception exception0 = (Exception)abvb0.v();
        if((exception0 instanceof bwvo)) {
            throw new IllegalArgumentException(exception0.getMessage(), exception0);
        }
        if((exception0 instanceof SecurityException)) {
            throw (SecurityException)exception0;
        }
        batl.l(exception0 == null);
    }

    @Override  // abxl
    public final void a(String[] arr_s) {
        ccmq.a().a(bbdg.ny);
        bwud bwud0 = this.b;
        if(!bwud0.b) {
            throw new SecurityException("Access denied");
        }
        abvc abvc0 = new abvc(this, gltq.q, bwud0.e, arr_s);
        this.a.c.h(abvc0);
    }

    @Override  // abxl
    public final boolean c() {
        ccmq.a().a(bbdg.ny);
        ekzi ekzi0 = new ekzi(this.a, this.b);
        this.a.c.h(ekzi0);
        return ((Status)ekzi0.v()).e();
    }

    @Override  // abxl
    public final Bundle d(Bundle bundle0) {
        ccmq.a().a(bbdg.ny);
        ekzp ekzp0 = new ekzp(this.a, bundle0, this.b);
        this.a.c.h(ekzp0);
        return ((BundleResponse)ekzp0.v()).b;
    }

    @Override  // abxl
    public final String[] e(String s) {
        ccmq.a().a(bbdg.ny);
        bwmx bwmx0 = this.a;
        bwuc bwuc0 = bwmx0.l;
        if(bwuc0 == null) {
            bwne.f("Unable to get client registry");
            return null;
        }
        return bwmx0.f().H(bwuc0.h(s), -1);
    }

    @Override  // abxl
    public final String[] f() {
        ccmq.a().a(bbdg.ny);
        return new String[0];
    }

    @Override  // abxl
    public final RegisterCorpusInfo g(String s, String s1) {
        ccmq.a().a(bbdg.ny);
        GetCorpusInfoCall.Request getCorpusInfoCall$Request0 = new GetCorpusInfoCall.Request();
        getCorpusInfoCall$Request0.a = s;
        getCorpusInfoCall$Request0.b = s1;
        elbj elbj0 = new elbj(this.a, getCorpusInfoCall$Request0, this.b);
        this.a.c.h(elbj0);
        return ((GetCorpusInfoCall.Response)elbj0.v()).b;
    }

    @Override  // abxl
    public final String[] h(String s) {
        ccmq.a().a(bbdg.ny);
        bwmx bwmx0 = this.a;
        bwuc bwuc0 = bwmx0.l;
        if(bwuc0 == null) {
            bwne.f("Unable to get client registry");
            return null;
        }
        return bwmx0.f().H(bwuc0.h(s), 1);
    }

    @Override  // abxl
    public final CorpusStatus i(String s, String s1) {
        ccmq.a().a(bbdg.ny);
        GetCorpusStatusCall.Request getCorpusStatusCall$Request0 = new GetCorpusStatusCall.Request();
        getCorpusStatusCall$Request0.a = s;
        getCorpusStatusCall$Request0.b = s1;
        elbm elbm0 = new elbm(this.a, getCorpusStatusCall$Request0, this.b);
        this.a.c.h(elbm0);
        return ((GetCorpusStatusCall.Response)elbm0.v()).b;
    }

    @Override  // abxl
    public final int[] j() {
        ccmq.a().a(bbdg.ny);
        return new int[0];
    }

    @Override  // abxl
    public final DocumentResults k(String[] arr_s, String s, String s1, QuerySpecification querySpecification0) {
        ccmq.a().a(bbdg.ny);
        GetDocumentsCall.Request getDocumentsCall$Request0 = new GetDocumentsCall.Request();
        getDocumentsCall$Request0.c = arr_s;
        getDocumentsCall$Request0.a = s;
        getDocumentsCall$Request0.b = s1;
        getDocumentsCall$Request0.d = querySpecification0;
        eleo eleo0 = new eleo(this.a, getDocumentsCall$Request0, this.b, false);
        this.a.c.h(eleo0);
        return ((GetDocumentsCall.Response)eleo0.v()).b;
    }

    @Override  // abxl
    public final GlobalSearchApplication[] l() {
        ccmq.a().a(bbdg.ny);
        GetGlobalSearchSourcesCall.Request getGlobalSearchSourcesCall$Request0 = new GetGlobalSearchSourcesCall.Request();
        elct elct0 = new elct(this.a, getGlobalSearchSourcesCall$Request0, this.b);
        this.a.c.h(elct0);
        GetGlobalSearchSourcesCall.Response getGlobalSearchSourcesCall$Response0 = (GetGlobalSearchSourcesCall.Response)elct0.v();
        int v = getGlobalSearchSourcesCall$Response0.b.length;
        GlobalSearchApplication[] arr_globalSearchApplication = new GlobalSearchApplication[v];
        for(int v1 = 0; v1 < v; ++v1) {
            GetGlobalSearchSourcesCall.GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource0 = getGlobalSearchSourcesCall$Response0.b[v1];
            GlobalSearchApplicationInfo globalSearchApplicationInfo0 = new GlobalSearchApplicationInfo(getGlobalSearchSourcesCall$GlobalSearchSource0.a, getGlobalSearchSourcesCall$GlobalSearchSource0.b, getGlobalSearchSourcesCall$GlobalSearchSource0.c, getGlobalSearchSourcesCall$GlobalSearchSource0.d, getGlobalSearchSourcesCall$GlobalSearchSource0.e, getGlobalSearchSourcesCall$GlobalSearchSource0.f, getGlobalSearchSourcesCall$GlobalSearchSource0.g, getGlobalSearchSourcesCall$GlobalSearchSource0.h);
            HashMap hashMap0 = new HashMap();
            GetGlobalSearchSourcesCall.CorpusInfo[] arr_getGlobalSearchSourcesCall$CorpusInfo = getGlobalSearchSourcesCall$GlobalSearchSource0.i;
            for(int v2 = 0; v2 < arr_getGlobalSearchSourcesCall$CorpusInfo.length; ++v2) {
                GetGlobalSearchSourcesCall.CorpusInfo getGlobalSearchSourcesCall$CorpusInfo0 = arr_getGlobalSearchSourcesCall$CorpusInfo[v2];
                String s = getGlobalSearchSourcesCall$CorpusInfo0.a;
                Feature[] arr_feature = getGlobalSearchSourcesCall$CorpusInfo0.b;
                batl.s(s);
                batl.s(arr_feature);
                hashMap0.put(s, arr_feature);
            }
            arr_globalSearchApplication[v1] = new GlobalSearchApplication(globalSearchApplicationInfo0, getGlobalSearchSourcesCall$GlobalSearchSource0.j, hashMap0);
        }
        return arr_globalSearchApplication;
    }

    @Override  // abxl
    public final PIMEUpdateResponse m() {
        ccmq.a().a(bbdg.ny);
        return new PIMEUpdateResponse("API disabled", null, null);
    }

    @Override  // abxl
    public final NativeApiInfo n() {
        ccmq.a().a(bbdg.ny);
        return new NativeApiInfo(null, null, null);
    }

    @Override  // abxl
    public final int[] o() {
        ccmq.a().a(bbdg.ny);
        return new int[0];
    }

    @Override  // abxl
    public final PhraseAffinityResponse p(String[] arr_s, PhraseAffinitySpecification phraseAffinitySpecification0) {
        ccmq.a().a(bbdg.ny);
        GetPhraseAffinityCall.Request getPhraseAffinityCall$Request0 = new GetPhraseAffinityCall.Request();
        getPhraseAffinityCall$Request0.a = arr_s;
        getPhraseAffinityCall$Request0.b = phraseAffinitySpecification0.a == null ? null : ((PhraseAffinityCorpusSpec[])phraseAffinitySpecification0.a.clone());
        eler eler0 = new eler(this.a, getPhraseAffinityCall$Request0, this.b);
        this.a.c.h(eler0);
        return ((GetPhraseAffinityCall.Response)eler0.v()).b;
    }

    @Override  // abxl
    public final StorageStats q() {
        ccmq.a().a(bbdg.ny);
        GetStorageStatsCall.Request getStorageStatsCall$Request0 = new GetStorageStatsCall.Request();
        ekzz ekzz0 = new ekzz(this.a, getStorageStatsCall$Request0, this.b);
        this.a.c.h(ekzz0);
        GetStorageStatsCall.Response getStorageStatsCall$Response0 = (GetStorageStatsCall.Response)ekzz0.v();
        RegisteredPackageInfo[] arr_registeredPackageInfo = new RegisteredPackageInfo[getStorageStatsCall$Response0.b.length];
        for(int v = 0; true; ++v) {
            GetStorageStatsCall.PackageStats[] arr_getStorageStatsCall$PackageStats = getStorageStatsCall$Response0.b;
            if(v >= arr_getStorageStatsCall$PackageStats.length) {
                break;
            }
            GetStorageStatsCall.PackageStats getStorageStatsCall$PackageStats0 = arr_getStorageStatsCall$PackageStats[v];
            arr_registeredPackageInfo[v] = new RegisteredPackageInfo(getStorageStatsCall$PackageStats0.a, getStorageStatsCall$PackageStats0.b, getStorageStatsCall$PackageStats0.c, getStorageStatsCall$PackageStats0.d);
        }
        return new StorageStats(arr_registeredPackageInfo, getStorageStatsCall$Response0.c, getStorageStatsCall$Response0.d, getStorageStatsCall$Response0.e);
    }

    @Override  // abxl
    public final SearchResults r(String s, String s1, String[] arr_s, int v, int v1, QuerySpecification querySpecification0) {
        ccmq.a().a(bbdg.ny);
        QueryCall.Request queryCall$Request0 = new QueryCall.Request();
        queryCall$Request0.a = s;
        queryCall$Request0.b = s1;
        queryCall$Request0.c = arr_s;
        queryCall$Request0.d = v;
        queryCall$Request0.e = v1;
        queryCall$Request0.f = querySpecification0;
        elfe elfe0 = new elfe(this.a, queryCall$Request0, this.b);
        this.a.c.h(elfe0);
        return ((QueryCall.Response)elfe0.v()).b;
    }

    @Override  // abxl
    public final SearchResults s(String s, int v, int v1, GlobalSearchQuerySpecification globalSearchQuerySpecification0) {
        ccmq.a().a(bbdg.ny);
        GlobalQueryCall.Request globalQueryCall$Request0 = new GlobalQueryCall.Request();
        globalQueryCall$Request0.a = s;
        globalQueryCall$Request0.b = v;
        globalQueryCall$Request0.c = v1;
        globalQueryCall$Request0.d = globalSearchQuerySpecification0;
        elev elev0 = new elev(this.a, globalQueryCall$Request0, this.b);
        this.a.c.h(elev0);
        return ((GlobalQueryCall.Response)elev0.v()).b;
    }

    @Override  // abxl
    public final boolean t(String s, RegisterCorpusInfo registerCorpusInfo0) {
        ccmq.a().a(bbdg.ny);
        String s1 = bwnb.m(registerCorpusInfo0);
        if(s1 != null) {
            throw new IllegalArgumentException(s1);
        }
        bwuc bwuc0 = this.a.l;
        batl.s(bwuc0);
        bwud bwud0 = bwuc0.h(s);
        abuz abuz0 = new abuz(this, gltq.n, this.b.e, bwud0, new bwuw(registerCorpusInfo0, 1, System.currentTimeMillis()));
        this.a.c.h(abuz0);
        Exception exception0 = (Exception)abuz0.v();
        boolean z = false;
        if(exception0 != null) {
            bwne.j(exception0, "Client exception", new Object[0]);
            if((exception0 instanceof bwvo)) {
                throw new IllegalArgumentException(exception0.getMessage(), exception0);
            }
            if((exception0 instanceof SecurityException)) {
                throw (SecurityException)exception0;
            }
            if((exception0 instanceof bwvr)) {
                bwne.j(exception0, "Internal error", new Object[0]);
                return false;
            }
        }
        if(exception0 == null) {
            z = true;
        }
        batl.l(z);
        return true;
    }

    @Override  // abxl
    public final void u() {
        ccmq.a().a(bbdg.ny);
    }

    @Override  // abxl
    public final void v(GlobalSearchApplicationInfo globalSearchApplicationInfo0) {
        ccmq.a().a(bbdg.ny);
        batl.s(globalSearchApplicationInfo0);
        String s = globalSearchApplicationInfo0.a;
        if(s == null) {
            bwne.s("Cannot register app with null package for universal search!");
            return;
        }
        this.K(s, globalSearchApplicationInfo0);
    }

    @Override  // abxl
    public final void w() {
        ccmq.a().a(bbdg.ny);
    }

    @Override  // abxl
    public final boolean x(String s, String s1, long v) {
        ccmq.a().a(bbdg.ny);
        RequestIndexingCall.Request requestIndexingCall$Request0 = new RequestIndexingCall.Request();
        requestIndexingCall$Request0.a = s;
        requestIndexingCall$Request0.b = s1;
        requestIndexingCall$Request0.c = v;
        bwmx bwmx0 = this.a;
        bwvg bwvg0 = bwmx0.n;
        if(bwvg0 == null) {
            return false;
        }
        bwut bwut0 = bwmx0.f();
        elbt elbt0 = new elbt(bwmx0.b, bwmx0.c, bwut0, bwvg0, bwmx0.p, requestIndexingCall$Request0, this.b);
        bwmx0.c.h(elbt0);
        return ((RequestIndexingCall.Response)elbt0.v()).a.e();
    }

    @Override  // abxl
    public final void y() {
        ccmq.a().a(bbdg.ny);
    }

    @Override  // abxl
    public final void z(String s, boolean z) {
        ccmq.a().a(bbdg.ny);
        SetIncludeInGlobalSearchCall.Request setIncludeInGlobalSearchCall$Request0 = new SetIncludeInGlobalSearchCall.Request(s, null, z);
        eldd eldd0 = new eldd(this.a, setIncludeInGlobalSearchCall$Request0, this.b);
        this.a.c.h(eldd0);
        eldd0.v();
    }
}

