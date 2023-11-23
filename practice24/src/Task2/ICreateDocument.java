package Task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ICreateDocument {
    public IDocument CreateNew();
    public IDocument CreateOpen(String path) throws IOException;
}
