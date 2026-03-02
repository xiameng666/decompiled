import android.os.Bundle;
import android.os.Parcel;
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
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class abxk extends wby implements abxl {
    public abxk() {
        super("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String[] arr_s = parcel0.createStringArray();
                int v1 = parcel0.readInt();
                int v2 = parcel0.readInt();
                QuerySpecification querySpecification0 = (QuerySpecification)wbz.a(parcel0, QuerySpecification.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                SearchResults searchResults0 = this.r(s, s1, arr_s, v1, v2, querySpecification0);
                parcel1.writeNoException();
                wbz.g(parcel1, searchResults0);
                return true;
            }
            case 2: {
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                String[] arr_s1 = parcel0.createStringArray();
                int v3 = parcel0.readInt();
                SuggestSpecification suggestSpecification0 = (SuggestSpecification)wbz.a(parcel0, SuggestSpecification.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                SuggestionResults suggestionResults0 = this.A(s2, s3, arr_s1, v3, suggestSpecification0);
                parcel1.writeNoException();
                wbz.g(parcel1, suggestionResults0);
                return true;
            }
            case 3: {
                String[] arr_s2 = parcel0.createStringArray();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                QuerySpecification querySpecification1 = (QuerySpecification)wbz.a(parcel0, QuerySpecification.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                DocumentResults documentResults0 = this.k(arr_s2, s4, s5, querySpecification1);
                parcel1.writeNoException();
                wbz.g(parcel1, documentResults0);
                return true;
            }
            case 4: {
                String s6 = parcel0.readString();
                String s7 = parcel0.readString();
                long v4 = parcel0.readLong();
                RequestIndexingSpecification requestIndexingSpecification0 = (RequestIndexingSpecification)wbz.a(parcel0, RequestIndexingSpecification.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                boolean z = this.x(s6, s7, v4);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 5: {
                String s8 = parcel0.readString();
                String s9 = parcel0.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                CorpusStatus corpusStatus0 = this.i(s8, s9);
                parcel1.writeNoException();
                wbz.g(parcel1, corpusStatus0);
                return true;
            }
            case 6: {
                String s10 = parcel0.readString();
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                String[] arr_s3 = this.h(s10);
                parcel1.writeNoException();
                parcel1.writeStringArray(arr_s3);
                return true;
            }
            case 7: {
                String s11 = parcel0.readString();
                RegisterCorpusInfo registerCorpusInfo0 = (RegisterCorpusInfo)wbz.a(parcel0, RegisterCorpusInfo.CREATOR);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.J(s11, registerCorpusInfo0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                Bundle bundle0 = this.D(s12, s13);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 9: {
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                Bundle bundle2 = this.d(bundle1);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle2);
                return true;
            }
            case 10: {
                String s14 = parcel0.readString();
                int v5 = parcel0.readInt();
                int v6 = parcel0.readInt();
                GlobalSearchQuerySpecification globalSearchQuerySpecification0 = (GlobalSearchQuerySpecification)wbz.a(parcel0, GlobalSearchQuerySpecification.CREATOR);
                ApiMetadata apiMetadata9 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                SearchResults searchResults1 = this.s(s14, v5, v6, globalSearchQuerySpecification0);
                parcel1.writeNoException();
                wbz.g(parcel1, searchResults1);
                return true;
            }
            case 11: {
                GlobalSearchApplicationInfo globalSearchApplicationInfo0 = (GlobalSearchApplicationInfo)wbz.a(parcel0, GlobalSearchApplicationInfo.CREATOR);
                ApiMetadata apiMetadata10 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.v(globalSearchApplicationInfo0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                String s15 = parcel0.readString();
                ApiMetadata apiMetadata11 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.H(s15);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                ApiMetadata apiMetadata12 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                GlobalSearchApplicationInfo[] arr_globalSearchApplicationInfo = this.I();
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_globalSearchApplicationInfo, 1);
                return true;
            }
            case 14: {
                String s16 = parcel0.readString();
                RegisterCorpusInfo registerCorpusInfo1 = (RegisterCorpusInfo)wbz.a(parcel0, RegisterCorpusInfo.CREATOR);
                ApiMetadata apiMetadata13 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                boolean z1 = this.t(s16, registerCorpusInfo1);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 16: {
                String[] arr_s4 = parcel0.createStringArray();
                ApiMetadata apiMetadata14 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.a(arr_s4);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                String[] arr_s5 = parcel0.createStringArray();
                ApiMetadata apiMetadata15 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.C(arr_s5);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                ApiMetadata apiMetadata16 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.B();
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                ResultClickInfo resultClickInfo0 = (ResultClickInfo)wbz.a(parcel0, ResultClickInfo.CREATOR);
                ApiMetadata apiMetadata17 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.w();
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 20: {
                parcel0.readString();
                ApiMetadata apiMetadata18 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.u();
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 21: {
                parcel0.readString();
                ApiMetadata apiMetadata19 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.E();
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel0.readString();
                ApiMetadata apiMetadata20 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                String[] arr_s6 = this.f();
                parcel1.writeNoException();
                parcel1.writeStringArray(arr_s6);
                return true;
            }
            case 23: {
                parcel0.readString();
                parcel0.readInt();
                parcel0.createByteArray();
                ApiMetadata apiMetadata21 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                PIMEUpdateResponse pIMEUpdateResponse0 = this.m();
                parcel1.writeNoException();
                wbz.g(parcel1, pIMEUpdateResponse0);
                return true;
            }
            case 24: {
                String[] arr_s7 = parcel0.createStringArray();
                PhraseAffinitySpecification phraseAffinitySpecification0 = (PhraseAffinitySpecification)wbz.a(parcel0, PhraseAffinitySpecification.CREATOR);
                ApiMetadata apiMetadata22 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                PhraseAffinityResponse phraseAffinityResponse0 = this.p(arr_s7, phraseAffinitySpecification0);
                parcel1.writeNoException();
                wbz.g(parcel1, phraseAffinityResponse0);
                return true;
            }
            case 25: {
                String s17 = parcel0.readString();
                String s18 = parcel0.readString();
                ApiMetadata apiMetadata23 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                RegisterCorpusInfo registerCorpusInfo2 = this.g(s17, s18);
                parcel1.writeNoException();
                wbz.g(parcel1, registerCorpusInfo2);
                return true;
            }
            case 27: {
                String s19 = parcel0.readString();
                ApiMetadata apiMetadata24 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                String[] arr_s8 = this.e(s19);
                parcel1.writeNoException();
                parcel1.writeStringArray(arr_s8);
                return true;
            }
            case 28: {
                ApiMetadata apiMetadata25 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                StorageStats storageStats0 = this.q();
                parcel1.writeNoException();
                wbz.g(parcel1, storageStats0);
                return true;
            }
            case 29: {
                ApiMetadata apiMetadata26 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                GlobalSearchApplication[] arr_globalSearchApplication = this.l();
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_globalSearchApplication, 1);
                return true;
            }
            case 30: {
                parcel0.createByteArray();
                wbz.i(parcel0);
                ApiMetadata apiMetadata27 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.y();
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 0x1F: {
                ApiMetadata apiMetadata28 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                int[] arr_v = this.j();
                parcel1.writeNoException();
                parcel1.writeIntArray(arr_v);
                return true;
            }
            case 0x20: {
                ApiMetadata apiMetadata29 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                int[] arr_v1 = this.o();
                parcel1.writeNoException();
                parcel1.writeIntArray(arr_v1);
                return true;
            }
            case 33: {
                ApiMetadata apiMetadata30 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                boolean z2 = this.c();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 34: {
                ApiMetadata apiMetadata31 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                NativeApiInfo nativeApiInfo0 = this.n();
                parcel1.writeNoException();
                wbz.g(parcel1, nativeApiInfo0);
                return true;
            }
            case 36: {
                String s20 = parcel0.readString();
                boolean z3 = wbz.i(parcel0);
                ApiMetadata apiMetadata32 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxk.gr(parcel0);
                this.z(s20, z3);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

