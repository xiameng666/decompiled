public interface iebn {
    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean arg1, iebu arg2);

    byte[] processBlock(byte[] arg1, int arg2, int arg3);
}

