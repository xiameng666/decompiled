import java.io.OutputStream;

public interface MessageLite extends MessageLiteOrBuilder {
    Builder toBuilder();

    Builder newBuilderForType();

    Parser getParserForType();

    void writeTo(CodedOutputStream arg1);

    ByteString getDefaultInstanceForType();

    void writeDelimitedTo(OutputStream arg1);

    void writeToStream(OutputStream arg1);

    byte[] toBytesArray();

    int getSerializedSize();
}

