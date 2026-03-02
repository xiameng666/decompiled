import android.accounts.Account;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class cack extends ibsl implements ibtw {
    Object a;
    int b;
    final long c;
    final cacp d;
    final Account e;

    public cack(long v, cacp cacp0, Account account0, ibrl ibrl0) {
        this.c = v;
        this.d = cacp0;
        this.e = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cack)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cack(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        cack cack0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)cacp.a.h()).A("Getting intrusion logs metadata for device %d", this.c);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                this.a = byteArrayOutputStream0;
                this.b = 1;
                cack0 = this;
                object0 = this.d.g(this.e, this.c, byteArrayOutputStream0, cack0);
                if(object0 != object1) {
                    object2 = byteArrayOutputStream0;
                    goto label_17;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
                cack0 = this;
            label_17:
                cack0.a = null;
                cack0.b = 2;
                object0 = cack0.d.h(((clcn)object0), ((ByteArrayOutputStream)object2), cack0);
                if(object0 != object1) {
                label_21:
                    ibuq.f(((String)object0), "jsonString");
                    JSONObject jSONObject0 = new JSONObject(((String)object0));
                    ArrayList arrayList0 = new ArrayList();
                    if(jSONObject0.has("logFileMetadata") && !jSONObject0.isNull("logFileMetadata")) {
                        JSONArray jSONArray0 = jSONObject0.getJSONArray("logFileMetadata");
                        ibuq.e(jSONArray0, "getJSONArray(...)");
                        int v = jSONArray0.length();
                        for(int v1 = 0; v1 < v; ++v1) {
                            if(!jSONArray0.isNull(v1)) {
                                JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                                ibuq.e(jSONObject1, "getJSONObject(...)");
                                arrayList0.add(cacz.a(jSONObject1));
                            }
                        }
                    }
                    cadb cadb0 = new cadb(arrayList0);
                    ((ggtj)cacp.a.h()).z("Got %d log files.", cadb0.a.size());
                    return cadb0.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                goto label_21;
            }
        }
        return object1;
    }
}

