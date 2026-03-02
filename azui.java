import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall.Response;
import com.google.android.gms.search.administration.GetStorageStatsCall.PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall.Response;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class azui {
    public azuj a;

    public azui() {
    }

    public azui(azuj azuj0) {
        this.a = azuj0;
    }

    public final bcsm d() {
        return ((bctd)this.a).b();
    }

    public final List e() {
        return ((AliasedPlacesResult)this.a).b;
    }

    public final String f() {
        AttestationData attestationData0 = ((ekpf)this.a).a;
        return attestationData0 == null ? null : attestationData0.a;
    }

    public final List g() {
        HarmfulAppsInfo harmfulAppsInfo0 = ((ekpm)this.a).a;
        return harmfulAppsInfo0 == null ? Collections.EMPTY_LIST : Arrays.asList(harmfulAppsInfo0.b);
    }

    public final boolean h() {
        ekpn ekpn0 = (ekpn)this.a;
        return ekpn0.a == null || !ekpn0.a.e() ? false : ekpn0.b;
    }

    public final long i() {
        return ((GetAppIndexingPackageDetailsCall.Response)this.a).c;
    }

    public final CorpusConfigParcelable[] j() {
        return ((GetAppIndexingPackageDetailsCall.Response)this.a).b;
    }

    public final long k() {
        return ((GetStorageStatsCall.Response)this.a).e;
    }

    public final long l() {
        return ((GetStorageStatsCall.Response)this.a).d;
    }

    public final GetStorageStatsCall.PackageStats[] m() {
        return ((GetStorageStatsCall.Response)this.a).b;
    }

    public final int n() {
        return ((faiv)this.a).b();
    }

    public final boolean o() {
        return ((faiv)this.a).c();
    }

    public final int p() {
        UsageReportingOptInOptions usageReportingOptInOptions0 = ((fajf)this.a).a;
        batl.s(usageReportingOptInOptions0);
        return usageReportingOptInOptions0.a;
    }

    public final boolean q() {
        UsageReportingOptInOptions usageReportingOptInOptions0 = ((fajf)this.a).a;
        batl.s(usageReportingOptInOptions0);
        return usageReportingOptInOptions0.a == 1;
    }

    public final int r() {
        return ((fajg)this.a).b();
    }

    public final boolean s() {
        return ((fajg)this.a).d();
    }
}

