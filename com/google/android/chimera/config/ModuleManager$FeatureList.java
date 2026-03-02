package com.google.android.chimera.config;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;
import xdc;
import xdd;
import xdf;

@ChimeraApiVersion(added = 0L)
public class ModuleManager.FeatureList {
    private final byte[] a;

    private ModuleManager.FeatureList(byte[] arr_b) {
        this.a = arr_b;
    }

    public static ModuleManager.FeatureList fromDescriptors(List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)xdf.a).v_newBuilder();
        for(Object object0: list0) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)xdc.a).v_newBuilder();
            String s = ((xdd)object0).c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s.getClass();
            ((xdc)hftv0).b |= 1;
            ((xdc)hftv0).c = s;
            long v = ((xdd)object0).d;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            xdc xdc0 = (xdc)hftp1.b_message;
            xdc0.b |= 2;
            xdc0.d = v;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            xdf xdf0 = (xdf)hftp0.b_message;
            xdc xdc1 = (xdc)hftp1.N_build();
            xdc1.getClass();
            xdf0.b();
            xdf0.b.add(xdc1);
        }
        return new ModuleManager.FeatureList(((xdf)hftp0.N_build()).toBytesArray());
    }

    public static ModuleManager.FeatureList fromFeatures(List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)xdf.a).v_newBuilder();
        hftp0.ah(list0);
        return new ModuleManager.FeatureList(((xdf)hftp0.N_build()).toBytesArray());
    }

    public static ModuleManager.FeatureList fromProto(byte[] arr_b) {
        return new ModuleManager.FeatureList(arr_b);
    }

    public byte[] getProtoBytes() {
        return this.a;
    }
}

