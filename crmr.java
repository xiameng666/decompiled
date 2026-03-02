import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import j..util.Objects;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class crmr implements gmbg {
    final TriggerUriParcel a;
    final crni b;

    public crmr(crni crni0, TriggerUriParcel triggerUriParcel0) {
        this.a = triggerUriParcel0;
        Objects.requireNonNull(crni0);
        this.b = crni0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        crni crni0 = this.b;
        crni0.n();
        crni.G(crni0);
        int v = 2;
        if(crni0.am().t(crif.aG)) {
            String s = throwable0.getMessage();
            crni0.f = false;
            if(s != null) {
                if((throwable0 instanceof IllegalStateException) || s.contains("garbage collected") || throwable0.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if(s.contains("Background")) {
                        crni0.f = true;
                    }
                    v = 1;
                }
                else if((throwable0 instanceof SecurityException) && !s.endsWith("READ_DEVICE_CONFIG")) {
                    v = 3;
                }
            }
        }
        switch(v - 1) {
            case 0: {
                crni0.aJ().f.c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", crji.a(crni0.f().u()), crji.a(throwable0.toString()));
                crni0.c = 1;
                crni0.q().add(this.a);
                return;
            }
            case 1: {
                crni0.q().add(this.a);
                if(crni0.c > ((int)(((Integer)crif.ap.a())))) {
                    crni0.c = 1;
                    crni0.aJ().f.c("registerTriggerAsync failed. May try later. App ID, throwable", crji.a(crni0.f().u()), crji.a(throwable0.toString()));
                    return;
                }
                crni0.aJ().f.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", crji.a(crni0.f().u()), crji.a(String.valueOf(crni0.c)), crji.a(throwable0.toString()));
                int v1 = crni0.c;
                if(crni0.d == null) {
                    crni0.d = new crms(crni0, crni0.y);
                }
                crni0.d.c(((long)v1) * 1000L);
                crni0.c += crni0.c;
                return;
            }
            default: {
                crni0.aJ().c.c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", crji.a(crni0.f().u()), throwable0);
                this.c();
                crni0.c = 1;
                crni0.y();
            }
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.b.n();
        this.c();
        crni.G(this.b);
        this.b.c = 1;
        this.b.aJ().j.b("Successfully registered trigger URI", this.a.a);
        this.b.y();
    }

    private final void c() {
        SparseArray sparseArray0 = this.b.ap().c();
        sparseArray0.put(this.a.c, Long.valueOf(this.a.b));
        crjx crjx0 = this.b.ap();
        int[] arr_v = new int[sparseArray0.size()];
        long[] arr_v1 = new long[sparseArray0.size()];
        for(int v = 0; v < sparseArray0.size(); ++v) {
            arr_v[v] = sparseArray0.keyAt(v);
            arr_v1[v] = (long)(((Long)sparseArray0.valueAt(v)));
        }
        Bundle bundle0 = new Bundle();
        bundle0.putIntArray("uriSources", arr_v);
        bundle0.putLongArray("uriTimestamps", arr_v1);
        crjt crjt0 = crjx0.m;
        Bundle bundle1 = new Bundle(bundle0);
        crjx crjx1 = crjt0.c;
        SharedPreferences.Editor sharedPreferences$Editor0 = crjx1.b().edit();
        if(bundle1.size() == 0) {
            sharedPreferences$Editor0.remove(crjt0.a);
        }
        else {
            String s = crjt0.a;
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: bundle1.keySet()) {
                String s1 = (String)object0;
                Object object1 = bundle1.get(s1);
                if(object1 == null) {
                    continue;
                    try {
                    label_29:
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("n", s1);
                        hvhs.c();
                        if(crjx1.am().t(crif.aD)) {
                            if(!(object1 instanceof String)) {
                                if(!(object1 instanceof Long)) {
                                    if(!(object1 instanceof int[])) {
                                        if((object1 instanceof long[])) {
                                            jSONObject0.put("v", Arrays.toString(((long[])object1)));
                                            jSONObject0.put("t", "la");
                                            jSONArray0.put(jSONObject0);
                                        }
                                        else if((object1 instanceof Double)) {
                                            jSONObject0.put("v", object1.toString());
                                            jSONObject0.put("t", "d");
                                            jSONArray0.put(jSONObject0);
                                        }
                                        else {
                                            crjx1.aJ().c.b("Cannot serialize bundle value to SharedPreferences. Type", object1.getClass());
                                        }
                                        continue;
                                    }
                                    jSONObject0.put("v", Arrays.toString(((int[])object1)));
                                    jSONObject0.put("t", "ia");
                                    jSONArray0.put(jSONObject0);
                                    continue;
                                }
                                jSONObject0.put("v", object1.toString());
                                jSONObject0.put("t", "l");
                                jSONArray0.put(jSONObject0);
                                continue;
                            }
                            jSONObject0.put("v", object1.toString());
                            jSONObject0.put("t", "s");
                            jSONArray0.put(jSONObject0);
                            continue;
                        }
                        else {
                            jSONObject0.put("v", object1.toString());
                            if((object1 instanceof String)) {
                                jSONObject0.put("t", "s");
                            }
                            else {
                                if((object1 instanceof Long)) {
                                    jSONObject0.put("t", "l");
                                    jSONArray0.put(jSONObject0);
                                }
                                else if((object1 instanceof Double)) {
                                    jSONObject0.put("t", "d");
                                    jSONArray0.put(jSONObject0);
                                }
                                else {
                                    crjx1.aJ().c.b("Cannot serialize bundle value to SharedPreferences. Type", object1.getClass());
                                }
                                continue;
                            }
                        }
                        jSONArray0.put(jSONObject0);
                    }
                    catch(JSONException jSONException0) {
                        crjt0.c.aJ().c.b("Cannot serialize bundle value to SharedPreferences", jSONException0);
                    }
                    continue;
                }
                else {
                    goto label_29;
                }
                break;
            }
            sharedPreferences$Editor0.putString(s, jSONArray0.toString());
        }
        sharedPreferences$Editor0.apply();
        crjt0.b = bundle1;
    }
}

