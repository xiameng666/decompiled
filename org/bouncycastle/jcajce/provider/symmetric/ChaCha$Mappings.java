package org.bouncycastle.jcajce.provider.symmetric;

import idvi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public class ChaCha.Mappings extends AlgorithmProvider {
    private static final String PREFIX;

    static {
        ChaCha.Mappings.PREFIX = ChaCha.class.getName();
    }

    @Override  // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
    public void configure(ConfigurableProvider configurableProvider0) {
        configurableProvider0.addAlgorithm("Cipher.CHACHA", ChaCha.Mappings.PREFIX + "$Base");
        configurableProvider0.addAlgorithm("KeyGenerator.CHACHA", ChaCha.Mappings.PREFIX + "$KeyGen");
        configurableProvider0.addAlgorithm("Cipher.CHACHA7539", ChaCha.Mappings.PREFIX + "$Base7539");
        configurableProvider0.addAlgorithm("KeyGenerator.CHACHA7539", ChaCha.Mappings.PREFIX + "$KeyGen7539");
        configurableProvider0.addAlgorithm("AlgorithmParameters.CHACHA7539", ChaCha.Mappings.PREFIX + "$AlgParams");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
        configurableProvider0.addAlgorithm("Alg.Alias.KeyGenerator." + idvi.an, "CHACHA7539");
        configurableProvider0.addAlgorithm("Cipher.CHACHA20-POLY1305", ChaCha.Mappings.PREFIX + "$BaseCC20P1305");
        configurableProvider0.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", ChaCha.Mappings.PREFIX + "$AlgParamsCC1305");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher." + idvi.an, "CHACHA20-POLY1305");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters." + idvi.an, "CHACHA20-POLY1305");
        configurableProvider0.addAlgorithm("Alg.Alias.Cipher.OID." + idvi.an, "CHACHA20-POLY1305");
        configurableProvider0.addAlgorithm("Alg.Alias.AlgorithmParameters.OID." + idvi.an, "CHACHA20-POLY1305");
    }
}

