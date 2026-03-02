package org.bouncycastle.jcajce.provider.digest;

import idqg;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    protected void addHMACAlgorithm(ConfigurableProvider configurableProvider0, String s, String s1, String s2) {
        String s3 = "HMAC" + s;
        configurableProvider0.addAlgorithm("Mac." + s3, s1);
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.HMAC-" + s, s3);
        configurableProvider0.addAlgorithm("Alg.Alias.Mac.HMAC/" + s, s3);
        configurableProvider0.addAlgorithm("KeyGenerator." + s3, s2);
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + s, s3);
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + s, s3);
    }

    protected void addHMACAlias(ConfigurableProvider configurableProvider0, String s, idqg idqg0) {
        String s1 = "HMAC" + s;
        configurableProvider0.addAlgorithm("Alg.Alias.Mac." + idqg0, s1);
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator." + idqg0, s1);
    }

    protected void addKMACAlgorithm(ConfigurableProvider configurableProvider0, String s, String s1, String s2) {
        String s3 = "KMAC" + s;
        configurableProvider0.addAlgorithm("Mac." + s3, s1);
        configurableProvider0.addAlgorithm("KeyGenerator." + s3, s2);
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + s, s3);
    }
}

