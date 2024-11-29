package unidad04.htmlElements;

/**
 *
 * @author Miguel Angel Arenas
 */
public abstract class ElementoHTML {
    protected String tag;
    protected String content;
    
    public ElementoHTML(String tag,
            String content) {
        this.tag = tag;
        this.content = content;
    }
    
    public ElementoHTML(String tag) {
        this(tag, null);
    }
    
//    @Override
//    public String toString() {
//        return (content != null)
//                ? "<" + tag + ">"
//                + content
//                + "</" + tag + ">";
//    }
}
