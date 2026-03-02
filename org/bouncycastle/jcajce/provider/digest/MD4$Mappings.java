package org.bouncycastle.jcajce.provider.digest;

import idvi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public class MD4.Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX;

    static {
        MD4.Mappings.PREFIX = MD4.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("MessageDigest.MD4", MD4.Mappings.PREFIX + "$Digest");
        configurableProvider0.addAlgorithm("Alg.Alias.MessageDigest." + idvi.K, "MD4");
        this.addHMACAlgorithm(configurableProvider0, "MD4", MD4.Mappings.PREFIX + "$HashMac", MD4.Mappings.PREFIX + "$KeyGenerator");
    }
}

