import android.util.SparseArray;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.SectionPayload;

public final class abwq {
    public static byte[] a(bwpj bwpj0) {
        SparseArray sparseArray0;
        if(bwpj0 != null) {
            hfuf hfuf0 = bwpj0.d;
            ByteString hfsf0 = bwpj0.e;
            if(hfuf0 == null) {
                sparseArray0 = null;
            }
            else {
                sparseArray0 = new SparseArray();
                int v1 = 0;
                for(int v = 0; v < hfuf0.size(); ++v) {
                    int v2 = (int)(((Integer)hfuf0.get(v)));
                    if(v2 > 0) {
                        int v3 = v2 + v1;
                        sparseArray0.append(v, hfsf0.j(v1, v3).toByteArray());
                        v1 = v3;
                    }
                }
                if(sparseArray0.size() <= 0) {
                    sparseArray0 = null;
                }
            }
            SectionPayload sectionPayload0 = new SectionPayload(sparseArray0);
            return sectionPayload0.a == null || sectionPayload0.a.size() == 0 ? null : bauc.n(sectionPayload0);
        }
        return null;
    }

    public static SearchResults b(int v) {
        return new SearchResults(abwq.c(v));
    }

    public static String c(int v) {
        if(v - 2 != 25) {
            switch(v - 2) {
                case 2: {
                    return "PARSE_ERROR";
                }
                case 3: {
                    return "TOO_LONG";
                }
                case 4: {
                    return "PARENS_NESTED_TOO_DEEP";
                }
                case 5: {
                    return "DATE_PARSE_ERROR";
                }
                case 6: {
                    return "DATE_RANGE_TOO_LARGE";
                }
                case 7: {
                    return "OVERLAP_L_PARSE_ERROR";
                }
                case 8: {
                    return "Q_PARSE_ERROR";
                }
                case 9: {
                    return "BINARY_LOGIC_PARSE_ERROR";
                }
                case 10: {
                    return "TAG_PARSE_ERROR";
                }
                case 11: {
                    return "IN_L_PARSE_ERROR";
                }
                case 12: {
                    return "ST_SORT_PARSE_ERROR";
                }
                case 13: {
                    return "INIT_FAILED_ERROR";
                }
                case 14: {
                    return "UNIMPLEMENTED_ERROR";
                }
                case 15: {
                    return "AUTHORIZATION_ERROR";
                }
                case 16: {
                    return "NO_MATCHING_CORPORA_ERROR";
                }
                case 17: {
                    return "IS_PARSE_SECTION_RESTRICT_WITHOUT_STRING";
                }
                case 18: {
                    return "IS_PARSE_SECTION_RESTRICT_NEGATION_NOT_SUPPORTED";
                }
                default: {
                    return "UNDEFINED";
                }
            }
        }
        return "CACHING_DISABLED_ERROR";
    }
}

