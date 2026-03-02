package org.bouncycastle.jcajce.provider.asymmetric.util;

import iewl;
import iewn;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;

public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
    private final iewl helper;

    public BaseAlgorithmParameterGeneratorSpi() {
        this.helper = new iewn();
    }

    protected final AlgorithmParameters createParametersInstance(String s) {
        return this.helper.a(s);
    }
}

