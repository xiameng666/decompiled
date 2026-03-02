import java.io.IOException;
import java.io.InputStream;

public final class fmje implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        String s;
        if(((hjjw)object0).b()) {
            hjjv hjjv0 = ((hjjw)object0).a;
            throw hjjv0.a == hjju.b ? fmjf.a("Unknown", "Media upload canceled (hasTransferException)", iapk.c) : fmjf.b("Unknown", "Media upload failed (hasTransferException)", (hjjv0.a() ? iapk.q : iapk.d), hjjv0);
        }
        if(((hjjw)object0).a()) {
            hjjd hjjd0 = ((hjjw)object0).b;
            int v = hjjd0.a;
            hjjc hjjc0 = hjjd0.b;
            if(hjjc0 != null && hjjc0.f("x-guploader-uploadid")) {
                s = hjjc0.a("x-guploader-uploadid");
                flbj.a("ScottyStub", "Media Upload requestId=" + s);
            }
            else {
                s = "Unknown";
            }
            switch(v) {
                case 200: {
                    if(hjjc0 == null) {
                        throw fmjf.a(s, "Media upload failed: responseBodyHeaders null", iapk.q);
                    }
                    InputStream inputStream0 = hjjd0.c;
                    if(inputStream0 == null) {
                        throw fmjf.a(s, "Media upload failed: responseBodyStream null", iapk.q);
                    }
                    String s1 = hjjc0.a("X-Goog-Upload-Status");
                    if(s1.hashCode() != 97436022 || !s1.equals("final")) {
                        throw fmjf.a(s, "Media upload failed: scottyStatus=" + s1, iapk.q);
                    }
                    try {
                        byte[] arr_b = ghjj.g(inputStream0);
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hnxz.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        object1 = (hnxz)hftv0;
                    }
                    catch(IOException iOException0) {
                        throw fmjf.b(s, "Error parsing response body", iapk.q, iOException0);
                    }
                    if(object1 != null && (object1.b & 2) != 0 && !(object1.c == null ? hnxf.a : object1.c).c.isEmpty()) {
                        return object1;
                    }
                    throw fmjf.a("Unknown", "Media upload failed: mediaId not found in response", iapk.q);
                }
                case 401: {
                    throw fmjf.a(s, "Media upload unauthenticated (Response Code 401)", iapk.j);
                }
                case 413: {
                    throw fmjf.a(s, "Media upload rejected by server because it was too large! (Response Code 413)", iapk.e);
                }
                default: {
                    throw fmjf.a(s, "Media upload failed: responseCode=" + v, iapk.q);
                }
            }
        }
        throw fmjf.a("Unknown", "Media upload failed: no response", iapk.q);
    }
}

