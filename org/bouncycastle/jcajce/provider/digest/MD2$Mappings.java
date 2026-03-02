package org.bouncycastle.jcajce.provider.digest;

import idvi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public class MD2.Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX;

    static {
        MD2.Mappings.PREFIX = MD2.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("MessageDigest.MD2", MD2.Mappings.PREFIX + "$Digest");
        configurableProvider0.addAlgorithm("Alg.Alias.MessageDigest." + idvi.J, "MD2");
        this.addHMACAlgorithm(configurableProvider0, "MD2", MD2.Mappings.PREFIX + "$HashMac", MD2.Mappings.PREFIX + "$KeyGenerator");
    }
}

