import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.SearchResults;
import j..util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class abwu {
    public final int a;
    public final SearchResults b;
    private final abwv c;

    public abwu(SearchResults searchResults0, int v, abwv abwv0) {
        Objects.requireNonNull(searchResults0);
        this.b = searchResults0;
        super();
        this.c = abwv0;
        this.a = v;
    }

    public final hlne a() {
        ByteBuffer byteBuffer0;
        abwt abwt0 = this.e("thing_proto");
        if(abwt0 == null) {
            byteBuffer0 = null;
        }
        else {
            abwt0.b(this.a);
            byteBuffer0 = ByteBuffer.wrap(abwt0.d, abwt0.b, abwt0.c[abwt0.a]).asReadOnlyBuffer();
        }
        if(byteBuffer0 != null && byteBuffer0.hasRemaining()) {
            try {
                hfsl hfsl0 = hfsl.O(byteBuffer0);
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hlne.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur1) {
                    if(hfur1.b) {
                        hfur1 = new hfur(hfur1);
                    }
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(hfwr hfwr0) {
                    hfur hfur2 = hfwr0.a();
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur3 = new hfur(iOException0);
                    hfur3.a = hftv0;
                    throw hfur3;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return (hlne)hftv0;
            }
            catch(hfur hfur0) {
                if(goqs.a(6)) {
                    Log.e("FirebaseAppIndex", "Invalid thing_proto section", hfur0);
                }
            }
        }
        return null;
    }

    public final String b() {
        SearchResults searchResults0 = this.b;
        int[] arr_v = searchResults0.h;
        if(arr_v != null) {
            return searchResults0.i == null ? null : searchResults0.i[arr_v[this.a]];
        }
        return null;
    }

    public final String c(String s) {
        abwt abwt0 = this.e(s);
        return abwt0 == null ? null : abwt0.a(this.a);
    }

    public final String d() {
        abwv abwv0 = this.c;
        if(abwv0.b == null) {
            SearchResults searchResults0 = this.b;
            int[] arr_v = searchResults0.b;
            if(arr_v != null) {
                byte[] arr_b = searchResults0.c;
                if(arr_b != null) {
                    abwv0.b = new abwt(arr_v, arr_b);
                    return abwv0.b.a(this.a);
                }
            }
            return null;
        }
        return abwv0.b.a(this.a);
    }

    private final abwt e(String s) {
        abwt abwt0;
        Map map0;
        SearchResults searchResults0 = this.b;
        int[] arr_v = searchResults0.h;
        if(arr_v == null) {
            return null;
        }
        Map[] arr_map = this.c.c;
        if(arr_map == null) {
            map0 = null;
            abwt0 = null;
        }
        else {
            map0 = arr_map[arr_v[this.a]];
            if(map0 == null) {
                map0 = new HashMap();
            }
            abwt0 = (abwt)map0.get(s);
        }
        if(abwt0 == null) {
            Bundle[] arr_bundle = searchResults0.e;
            if(arr_bundle != null) {
                Bundle[] arr_bundle1 = searchResults0.f;
                if(arr_bundle1 != null) {
                    int[] arr_v1 = arr_bundle[arr_v[this.a]].getIntArray(s);
                    byte[] arr_b = arr_bundle1[arr_v[this.a]].getByteArray(s);
                    if(arr_v1 != null && arr_b != null) {
                        abwt abwt1 = new abwt(arr_v1, arr_b);
                        if(map0 == null) {
                            return abwt1;
                        }
                        map0.put(s, abwt1);
                        return abwt1;
                    }
                    return null;
                }
            }
        }
        return abwt0;
    }
}

