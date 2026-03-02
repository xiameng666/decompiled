import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;

public interface abxl extends IInterface {
    SuggestionResults A(String arg1, String arg2, String[] arg3, int arg4, SuggestSpecification arg5);

    void B();

    void C(String[] arg1);

    Bundle D(String arg1, String arg2);

    void E();

    void H(String arg1);

    GlobalSearchApplicationInfo[] I();

    void J(String arg1, RegisterCorpusInfo arg2);

    void a(String[] arg1);

    boolean c();

    Bundle d(Bundle arg1);

    String[] e(String arg1);

    String[] f();

    RegisterCorpusInfo g(String arg1, String arg2);

    String[] h(String arg1);

    CorpusStatus i(String arg1, String arg2);

    int[] j();

    DocumentResults k(String[] arg1, String arg2, String arg3, QuerySpecification arg4);

    GlobalSearchApplication[] l();

    PIMEUpdateResponse m();

    NativeApiInfo n();

    int[] o();

    PhraseAffinityResponse p(String[] arg1, PhraseAffinitySpecification arg2);

    StorageStats q();

    SearchResults r(String arg1, String arg2, String[] arg3, int arg4, int arg5, QuerySpecification arg6);

    SearchResults s(String arg1, int arg2, int arg3, GlobalSearchQuerySpecification arg4);

    boolean t(String arg1, RegisterCorpusInfo arg2);

    void u();

    void v(GlobalSearchApplicationInfo arg1);

    void w();

    boolean x(String arg1, String arg2, long arg3);

    void y();

    void z(String arg1, boolean arg2);
}

