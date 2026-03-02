package com.google.autofill.detection.ml;

import ando;
import gdxo;
import gdxp;
import gdxq;
import gftb;
import ggdn;
import ggdp;
import gged_interceptors;
import ggfp;
import j..util.Comparator.-CC;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ModelConfig.FieldConfig implements gdxq {
    private static final int CURRENT_VERSION_CODE = 1;
    public static final gdxp READER;
    final ggdp fieldIndexBiMap;

    static {
        ModelConfig.FieldConfig.READER = new ModelConfig.FieldConfig.1();
    }

    public ModelConfig.FieldConfig(List list0) {
        if(list0.isEmpty()) {
            throw new IllegalStateException("Field config cannot be empty.");
        }
        ggdn ggdn0 = new ggdn();
        for(int v = 0; v < list0.size(); ++v) {
            ggdn0.d(((ando)list0.get(v)), Integer.valueOf(v));
        }
        this.fieldIndexBiMap = ggdn0.a();
    }

    public ModelConfig.FieldConfig(ando[] arr_ando) {
        this(gged_interceptors.k(arr_ando));
    }

    public ggfp getAllSupportedFieldTypes() {
        return this.fieldIndexBiMap.w();
    }

    public int getIndexForType(ando ando0) {
        Integer integer0 = (Integer)this.fieldIndexBiMap.get(ando0);
        if(integer0 != null) {
            return (int)integer0;
        }
        throw new IllegalArgumentException(ando0.name() + " is not a supported field type.");
    }

    public ando getTypeAtIndex(int v) {
        gftb.x(v, this.numberOfSupportedTypes());
        return (ando)this.fieldIndexBiMap.e().get(Integer.valueOf(v));
    }

    public boolean isSupportedType(ando ando0) {
        return this.fieldIndexBiMap.containsKey(ando0);
    }

    public int numberOfSupportedTypes() {
        return this.fieldIndexBiMap.size();
    }

    @Override  // gdxq
    public void writeToBundle(gdxo gdxo0) {
        gdxo0.l(1);
        ArrayList arrayList0 = new ArrayList(this.fieldIndexBiMap.w());
        Objects.requireNonNull(this.fieldIndexBiMap);
        Collections.sort(arrayList0, Comparator.-CC.comparingInt(new ModelConfig.FieldConfig..ExternalSyntheticLambda0(this.fieldIndexBiMap)));
        gdxo0.l(arrayList0.size());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gdxo0.l(((ando)arrayList0.get(v1)).a());
        }
    }
}

