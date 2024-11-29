package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Blockquote extends ElementoHTML {
    
    private String cite;
    
    public Blockquote(String content, String cite) {
        super("blockquote", content);
        this.cite = cite;
    }
    
    @Override
    public String toString() {
        return "<blockquote cite=\"" + cite + "\">" + content + "</blockquote>";
    }
    //http://www.worldwildlife.org/who/index.html
}
