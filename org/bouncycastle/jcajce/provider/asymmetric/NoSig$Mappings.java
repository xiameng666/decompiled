package org.bouncycastle.jcajce.provider.asymmetric;

import idzs;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class NoSig.Mappings extends AsymmetricAlgorithmProvider {
    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("Signature." + idzs.aak, "org.bouncycastle.jcajce.provider.asymmetric.NoSig$SigSpi");
    }
}

