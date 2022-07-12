
package model;

/**
 *
 * @author iam30
 */
public class Category {
    private int cid;
    private String type;

    public Category() {
    }

    public Category(int cid, String type) {
        this.cid = cid;
        this.type = type;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" + "cid=" + cid + ", type=" + type + '}';
    }
    
}
