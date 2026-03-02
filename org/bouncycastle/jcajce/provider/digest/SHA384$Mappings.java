package org.bouncycastle.jcajce.provider.digest;

import idur;
import idvi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public class SHA384.Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX;

    static {
        SHA384.Mappings.PREFIX = SHA384.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("MessageDigest.SHA-384", SHA384.Mappings.PREFIX + "$Digest");
        configurableProvider0.addAlgorithm("Alg.Alias.MessageDigest.SHA384", "SHA-384");
        configurableProvider0.addAlgorithm("Alg.Alias.MessageDigest." + idur.d, "SHA-384");
        configurableProvider0.addAlgorithm("Mac.OLDHMACSHA384", SHA384.Mappings.PREFIX + "$OldSHA384");
        configurableProvider0.addAlgorithm("Mac.PBEWITHHMACSHA384", SHA384.Mappings.PREFIX + "$HashMac");
        this.addHMACAlgorithm(configurableProvider0, "SHA384", SHA384.Mappings.PREFIX + "$HashMac", SHA384.Mappings.PREFIX + "$KeyGenerator");
        this.addHMACAlias(configurableProvider0, "SHA384", idvi.P);
        configurableProvider0.addAlgorithm("SecretKeyFactory.HMACSHA384", SHA384.Mappings.PREFIX + "$KeyFactory");
        configurableProvider0.addAlgorithm("Alg.Alias.SecretKeyFactory." + idvi.P, "HMACSHA384");
    }
}

