package Task2;

public class TextDocument implements IDocument {
    public String data;

    public TextDocument()
    {
        this.data = "";
    }

    public TextDocument(String data) {
        this.data = data;
    }
}
