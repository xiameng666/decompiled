package com.google.android.gms.ads.cache.policy;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import com.google.android.gms.ads.cache.m;
import com.google.android.gms.ads.cache.o;
import com.google.android.gms.ads.cache.p;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.cache.r;
import com.google.android.gms.ads.cache.s;
import com.google.android.gms.ads.internal.js.function.e;
import java.util.Iterator;
import org.json.JSONObject;

final class g implements e {
    private final String a;

    public g(String s) {
        this.a = s;
    }

    @Override  // com.google.android.gms.ads.internal.js.function.c
    public final Object a(JSONObject jSONObject0) {
        return this.c(jSONObject0);
    }

    @Override  // com.google.android.gms.ads.internal.js.function.d
    public final JSONObject b(Object object0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("filename", ((s)object0).g);
        JSONObject jSONObject1 = new JSONObject();
        m m0 = ((s)object0).d;
        if(m0 == null) {
            m0 = m.a;
        }
        jSONObject1.put("namespace", m0.c);
        m m1 = ((s)object0).d;
        if(m1 == null) {
            m1 = m.a;
        }
        jSONObject1.put("id", m1.d);
        m m2 = ((s)object0).d;
        if(m2 == null) {
            m2 = m.a;
        }
        jSONObject1.put("itag", m2.e);
        jSONObject0.put("key", jSONObject1);
        JSONObject jSONObject2 = new JSONObject();
        r r0 = ((s)object0).e;
        if(r0 == null) {
            r0 = r.a;
        }
        jSONObject2.put("url", r0.c);
        r r1 = ((s)object0).e;
        if(r1 == null) {
            r1 = r.a;
        }
        jSONObject2.put("expiration_time", r1.d);
        jSONObject0.put("source", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        q q0 = ((s)object0).f;
        if(q0 == null) {
            q0 = q.a;
        }
        jSONObject3.put("last_access_time", q0.d);
        q q1 = ((s)object0).f;
        if(q1 == null) {
            q1 = q.a;
        }
        jSONObject3.put("creation_time", q1.e);
        q q2 = ((s)object0).f;
        if(q2 == null) {
            q2 = q.a;
        }
        jSONObject3.put("bytes_on_disk", q2.f);
        q q3 = ((s)object0).f;
        if(q3 == null) {
            q3 = q.a;
        }
        jSONObject3.put("download_attempts", q3.h);
        q q4 = ((s)object0).f;
        if(q4 == null) {
            q4 = q.a;
        }
        jSONObject3.put("download_complete", q4.g);
        q q5 = ((s)object0).f;
        if(q5 == null) {
            q5 = q.a;
        }
        jSONObject3.put("additional_video_csi_feature_status", (o.a(q5.j) == 0 ? 1 : o.a(q5.j)) - 1);
        q q6 = ((s)object0).f;
        if(q6 == null) {
            q6 = q.a;
        }
        jSONObject3.put("content_length", q6.i);
        JSONObject jSONObject4 = new JSONObject();
        q q7 = ((s)object0).f;
        if(q7 == null) {
            q7 = q.a;
        }
        for(Object object1: q7.c) {
            jSONObject4.put(((p)object1).c, ((p)object1).d);
        }
        jSONObject3.put("tags", jSONObject4);
        jSONObject0.put("meta_data", jSONObject3);
        return jSONObject0;
    }

    public final s c(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.getJSONObject("key");
        JSONObject jSONObject2 = jSONObject0.getJSONObject("meta_data");
        JSONObject jSONObject3 = jSONObject0.getJSONObject("source");
        JSONObject jSONObject4 = jSONObject2.optJSONObject("tags");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)q.a).v_newBuilder();
        long v = jSONObject2.optLong("last_access_time", 0L);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q0 = (q)hftp0.b_message;
        q0.b |= 1;
        q0.d = v;
        long v1 = jSONObject2.optLong("creation_time", 0L);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q1 = (q)hftp0.b_message;
        q1.b |= 2;
        q1.e = v1;
        long v2 = jSONObject2.optLong("bytes_on_disk", 0L);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q2 = (q)hftp0.b_message;
        q2.b |= 4;
        q2.f = v2;
        int v3 = jSONObject2.optInt("download_attempts", 0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q3 = (q)hftp0.b_message;
        q3.b |= 16;
        q3.h = v3;
        boolean z = jSONObject2.optBoolean("download_complete", false);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q4 = (q)hftp0.b_message;
        q4.b |= 8;
        q4.g = z;
        int v4 = o.a(jSONObject2.optInt("additional_video_csi_feature_status", 0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q5 = (q)hftp0.b_message;
        if(v4 == 0) {
            throw null;
        }
        q5.j = v4 - 1;
        q5.b |= 0x40;
        long v5 = jSONObject2.optLong("content_length", -1L);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        q q6 = (q)hftp0.b_message;
        q6.b |= 0x20;
        q6.i = v5;
        if(jSONObject4 != null) {
            Iterator iterator0 = jSONObject4.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                String s1 = jSONObject4.optString(s, null);
                if(s1 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)p.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    s.getClass();
                    ((p)hftv0).b |= 1;
                    ((p)hftv0).c = s;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    p p0 = (p)hftp1.b_message;
                    p0.b |= 2;
                    p0.d = s1;
                    hftp0.bE(hftp1);
                }
            }
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)s.a).v_newBuilder();
        String s2 = this.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        s s3 = (s)hftp2.b_message;
        s2.getClass();
        s3.b |= 1;
        s3.c = s2;
        String s4 = jSONObject0.getString("filename");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        s s5 = (s)hftp2.b_message;
        s4.getClass();
        s5.b |= 16;
        s5.g = s4;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)m.a).v_newBuilder();
        String s6 = jSONObject1.getString("id");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        m m0 = (m)hftp3.b_message;
        s6.getClass();
        m0.b |= 2;
        m0.d = s6;
        String s7 = jSONObject1.getString("namespace");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        m m1 = (m)hftp3.b_message;
        s7.getClass();
        m1.b |= 1;
        m1.c = s7;
        String s8 = jSONObject1.getString("itag");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        m m2 = (m)hftp3.b_message;
        s8.getClass();
        m2.b |= 4;
        m2.e = s8;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        s s9 = (s)hftp2.b_message;
        m m3 = (m)hftp3.N_build();
        m3.getClass();
        s9.d = m3;
        s9.b |= 2;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)r.a).v_newBuilder();
        String s10 = jSONObject3.optString("url");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        r r0 = (r)hftp4.b_message;
        s10.getClass();
        r0.b |= 1;
        r0.c = s10;
        long v6 = jSONObject3.optLong("expiration_time", 0L);
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        r r1 = (r)hftp4.b_message;
        r1.b |= 2;
        r1.d = v6;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        s s11 = (s)hftp2.b_message;
        r r2 = (r)hftp4.N_build();
        r2.getClass();
        s11.e = r2;
        s11.b |= 4;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        s s12 = (s)hftp2.b_message;
        q q7 = (q)hftp0.N_build();
        q7.getClass();
        s12.f = q7;
        s12.b |= 8;
        return (s)hftp2.N_build();
    }
}

