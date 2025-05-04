import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class CoFRead extends FilterReader {
    public CoFRead(Reader in){
        super(in);
    }

    public int read()throws IOException {
        int x = super.read();
        return x;
    }
}
