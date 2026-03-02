package org.bouncycastle.jcajce.provider.digest;

import idur;
import idvi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public class SHA256.Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX;

    static {
        SHA256.Mappings.PREFIX = SHA256.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("MessageDigest.SHA-256", SHA256.Mappings.PREFIX + "$Digest");
        configurableProvider0.addAlgorithm("Alg.Alias.MessageDigest.SHA256", "SHA-256");
        configurableProvider0.addAlgorithm("Alg.Alias.MessageDigest." + idur.c, "SHA-256");
        configurableProvider0.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA256", SHA256.Mappings.PREFIX + "$PBEWithMacKeyFactory");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory." + idur.c, "PBEWITHHMACSHA256");
        configurableProvider0.addAlgorithm("Mac.PBEWITHHMACSHA256", SHA256.Mappings.PREFIX + "$HashMac");
        this.addHMACAlgorithm(configurableProvider0, "SHA256", SHA256.Mappings.PREFIX + "$HashMac", SHA256.Mappings.PREFIX + "$KeyGenerator");
        this.addHMACAlias(configurableProvider0, "SHA256", idvi.O);
        this.addHMACAlias(configurableProvider0, "SHA256", idur.c);
        configurableProvider0.addAlgorithm("SecretKeyFactory.HMACSHA256", SHA256.Mappings.PREFIX + "$KeyFactory");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory." + idvi.O, "HMACSHA256");
    }
}

