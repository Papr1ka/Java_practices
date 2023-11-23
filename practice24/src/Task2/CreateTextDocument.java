package Task2;

import java.io.*;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen(String path) throws IOException {
        File file = new File(path);
        if (file.isFile() && file.canRead())
        {
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (true)
            {
                String data = reader.readLine();
                if (data == null)
                {
                    break;
                }
                builder.append(data);
                builder.append("\n");
            }
            reader.close();
            return new TextDocument(builder.toString());
        }
        else
        {
            throw new IllegalArgumentException("Некорректное имя файла");
        }
    }
}
