public class Originator {

    private String article;

    public Originator() {}

    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticle() {
        return this.article;
    }

    public Memento save() {
        return new Memento(this.article);
    }

    public void restore(Memento m) {
        this.article = m.getState();
    }
}
