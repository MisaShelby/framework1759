package etu1759.framework;
public class ModelView {
    String Url;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public ModelView(String url){
        setUrl(url);
    }
}
